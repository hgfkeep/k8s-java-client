/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: master
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.models.V1TypedLocalObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IngressBackend describes all endpoints for a given service and port.
 */
@ApiModel(description = "IngressBackend describes all endpoints for a given service and port.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-20T06:31:18.419Z[Etc/UTC]")
public class NetworkingV1beta1IngressBackend {
  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private V1TypedLocalObjectReference resource;

  public static final String SERIALIZED_NAME_SERVICE_NAME = "serviceName";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  private String serviceName;

  public static final String SERIALIZED_NAME_SERVICE_PORT = "servicePort";
  @SerializedName(SERIALIZED_NAME_SERVICE_PORT)
  private IntOrString servicePort;


  public NetworkingV1beta1IngressBackend resource(V1TypedLocalObjectReference resource) {
    
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1TypedLocalObjectReference getResource() {
    return resource;
  }


  public void setResource(V1TypedLocalObjectReference resource) {
    this.resource = resource;
  }


  public NetworkingV1beta1IngressBackend serviceName(String serviceName) {
    
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Specifies the name of the referenced service.
   * @return serviceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the name of the referenced service.")

  public String getServiceName() {
    return serviceName;
  }


  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  public NetworkingV1beta1IngressBackend servicePort(IntOrString servicePort) {
    
    this.servicePort = servicePort;
    return this;
  }

   /**
   * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
   * @return servicePort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.")

  public IntOrString getServicePort() {
    return servicePort;
  }


  public void setServicePort(IntOrString servicePort) {
    this.servicePort = servicePort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkingV1beta1IngressBackend networkingV1beta1IngressBackend = (NetworkingV1beta1IngressBackend) o;
    return Objects.equals(this.resource, networkingV1beta1IngressBackend.resource) &&
        Objects.equals(this.serviceName, networkingV1beta1IngressBackend.serviceName) &&
        Objects.equals(this.servicePort, networkingV1beta1IngressBackend.servicePort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, serviceName, servicePort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkingV1beta1IngressBackend {\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    servicePort: ").append(toIndentedString(servicePort)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

