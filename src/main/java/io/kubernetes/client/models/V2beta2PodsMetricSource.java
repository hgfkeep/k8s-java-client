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
import io.kubernetes.client.models.V2beta2MetricIdentifier;
import io.kubernetes.client.models.V2beta2MetricTarget;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.
 */
@ApiModel(description = "PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-20T06:31:18.419Z[Etc/UTC]")
public class V2beta2PodsMetricSource {
  public static final String SERIALIZED_NAME_METRIC = "metric";
  @SerializedName(SERIALIZED_NAME_METRIC)
  private V2beta2MetricIdentifier metric;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private V2beta2MetricTarget target;


  public V2beta2PodsMetricSource metric(V2beta2MetricIdentifier metric) {
    
    this.metric = metric;
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @ApiModelProperty(required = true, value = "")

  public V2beta2MetricIdentifier getMetric() {
    return metric;
  }


  public void setMetric(V2beta2MetricIdentifier metric) {
    this.metric = metric;
  }


  public V2beta2PodsMetricSource target(V2beta2MetricTarget target) {
    
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(required = true, value = "")

  public V2beta2MetricTarget getTarget() {
    return target;
  }


  public void setTarget(V2beta2MetricTarget target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2beta2PodsMetricSource v2beta2PodsMetricSource = (V2beta2PodsMetricSource) o;
    return Objects.equals(this.metric, v2beta2PodsMetricSource.metric) &&
        Objects.equals(this.target, v2beta2PodsMetricSource.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta2PodsMetricSource {\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
