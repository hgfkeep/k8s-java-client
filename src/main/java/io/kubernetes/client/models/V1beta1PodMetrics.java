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
import io.kubernetes.client.models.V1ObjectMetaV2;
import io.kubernetes.client.models.V1beta1ContainerMetrics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * PodMetrics sets resource usage metrics of a pod.
 */
@ApiModel(description = "PodMetrics sets resource usage metrics of a pod.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-20T06:31:18.419Z[Etc/UTC]")
public class V1beta1PodMetrics {
  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private DateTime timestamp;

  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_WINDOW = "window";
  @SerializedName(SERIALIZED_NAME_WINDOW)
  private String window;

  public static final String SERIALIZED_NAME_CONTAINERS = "containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private List<V1beta1ContainerMetrics> containers = new ArrayList<V1beta1ContainerMetrics>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMetaV2 metadata;


  public V1beta1PodMetrics kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")

  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1beta1PodMetrics timestamp(DateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The following fields define time interval from which metrics were collected from the interval [Timestamp-Window, Timestamp].
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "The following fields define time interval from which metrics were collected from the interval [Timestamp-Window, Timestamp].")

  public DateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(DateTime timestamp) {
    this.timestamp = timestamp;
  }


  public V1beta1PodMetrics apiVersion(String apiVersion) {
    
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1beta1PodMetrics window(String window) {
    
    this.window = window;
    return this;
  }

   /**
   * Duration is a wrapper around time.Duration which supports correct marshaling to YAML and JSON. In particular, it marshals into strings, which can be used as map keys in json.
   * @return window
  **/
  @ApiModelProperty(required = true, value = "Duration is a wrapper around time.Duration which supports correct marshaling to YAML and JSON. In particular, it marshals into strings, which can be used as map keys in json.")

  public String getWindow() {
    return window;
  }


  public void setWindow(String window) {
    this.window = window;
  }


  public V1beta1PodMetrics containers(List<V1beta1ContainerMetrics> containers) {
    
    this.containers = containers;
    return this;
  }

  public V1beta1PodMetrics addContainersItem(V1beta1ContainerMetrics containersItem) {
    this.containers.add(containersItem);
    return this;
  }

   /**
   * Metrics for all containers are collected within the same time window.
   * @return containers
  **/
  @ApiModelProperty(required = true, value = "Metrics for all containers are collected within the same time window.")

  public List<V1beta1ContainerMetrics> getContainers() {
    return containers;
  }


  public void setContainers(List<V1beta1ContainerMetrics> containers) {
    this.containers = containers;
  }


  public V1beta1PodMetrics metadata(V1ObjectMetaV2 metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ObjectMetaV2 getMetadata() {
    return metadata;
  }


  public void setMetadata(V1ObjectMetaV2 metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1PodMetrics v1beta1PodMetrics = (V1beta1PodMetrics) o;
    return Objects.equals(this.kind, v1beta1PodMetrics.kind) &&
        Objects.equals(this.timestamp, v1beta1PodMetrics.timestamp) &&
        Objects.equals(this.apiVersion, v1beta1PodMetrics.apiVersion) &&
        Objects.equals(this.window, v1beta1PodMetrics.window) &&
        Objects.equals(this.containers, v1beta1PodMetrics.containers) &&
        Objects.equals(this.metadata, v1beta1PodMetrics.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, timestamp, apiVersion, window, containers, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1PodMetrics {\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    window: ").append(toIndentedString(window)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

