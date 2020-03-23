# kubernetes java client with metrics api

## Dependency

编译信息：

* tested kubernetes version: 
    * Server Version: v1.13.2
    * Client Version: "v1.15.5"

```xml
<dependency>
    <groupId>win.hgfdodo</groupId>
    <artifactId>k8sclient</artifactId>
    <version>0.1.0</version>
</dependency>
```

## How to use
```java
// 初始化时，根据配置的kube config 文件路径， 获取api client
public void init() {
    try (InputStreamReader in = new InputStreamReader(new FileInputStream("~/.kube/config")) {
        KubeConfig kubeconfig = KubeConfig.loadKubeConfig(in);
        this.apiClient = ClientBuilder.kubeconfig(kubeconfig).build();
    } catch (IOException e) {
        log.error("create kubernetes api client error! {}", e);
    }catch (FileNotFoundException e) {
        log.error("kube config file not found!:{}", e);
    } 
}

// 打印node metrics信息
public void printNodeMetrics() throws ApiException {
    checkApiClient();
    MetricsV1beta1Api metricsV1beta1Api = new MetricsV1beta1Api(this.apiClient);
    V1beta1NodeMetricsList nodeMetricsList = metricsV1beta1Api.listNodeMetrics(null, null, null, 100, null, null, 3000, false);
    if (nodeMetricsList != null) {
        for (V1beta1NodeMetrics nodeMetrics : nodeMetricsList.getItems()) {
            log.debug("node {}: {}", nodeMetrics.getMetadata().getName(), nodeMetrics.getUsage());
        }
    }
}


// 打印 namespce 中pod 里面的 每个 container metrics 信息
public void printNamespacePodMetrics(String namespace) throws ApiException {
    checkApiClient();
    MetricsV1beta1Api metricsV1beta1Api = new MetricsV1beta1Api(this.apiClient);
    V1beta1PodMetricsList nodeMetricsList = metricsV1beta1Api.listNamespacedPodMetrics(namespace, null, null, null, 100, null, null, 3000, false);
    if (nodeMetricsList != null) {
        for (V1beta1PodMetrics podMetrics : nodeMetricsList.getItems()) {
            for (V1beta1ContainerMetrics containerMetrics : podMetrics.getContainers()) {
                log.debug("container {}: {}", containerMetrics.getName(), containerMetrics.getUsage());
            }
        }
    }
}
```

**NodeMetrics** output example：

```log
16:35:44.911 [main] DEBUG cn.ac.ict.wde.service.KubernetesService - node ***15: {cpu=Quantity{number=0.828512394, format=DECIMAL_SI}, memory=Quantity{number=108825636864, format=BINARY_SI}}
16:35:44.915 [main] DEBUG cn.ac.ict.wde.service.KubernetesService - node ***17: {cpu=Quantity{number=0.328837919, format=DECIMAL_SI}, memory=Quantity{number=25566048256, format=BINARY_SI}}
```

**ContainerMetrics** output example：

```log
16:44:28.536 [main] DEBUG cn.ac.ict.wde.service.KubernetesService - container prometheus-demo-app: {cpu=Quantity{number=0.000912205, format=DECIMAL_SI}, memory=Quantity{number=42446848, format=BINARY_SI}}
16:44:28.543 [main] DEBUG cn.ac.ict.wde.service.KubernetesService - container hello: {cpu=Quantity{number=0.000107881, format=DECIMAL_SI}, memory=Quantity{number=21565440, format=BINARY_SI}}
```


## build yourself

### build this repository

use maven: `mvn clean compile package`


### build yourself java client

use [kubernetes-client/gen](https://github.com/kubernetes-client/gen) generate java client with your cluster openapi swagger.json .
for more help, please read []().
