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
import io.kubernetes.client.models.V1alpha1WebhookClientConfig;
import io.kubernetes.client.models.V1alpha1WebhookThrottleConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Webhook holds the configuration of the webhook
 */
@ApiModel(description = "Webhook holds the configuration of the webhook")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-20T06:31:18.419Z[Etc/UTC]")
public class V1alpha1Webhook {
  public static final String SERIALIZED_NAME_CLIENT_CONFIG = "clientConfig";
  @SerializedName(SERIALIZED_NAME_CLIENT_CONFIG)
  private V1alpha1WebhookClientConfig clientConfig;

  public static final String SERIALIZED_NAME_THROTTLE = "throttle";
  @SerializedName(SERIALIZED_NAME_THROTTLE)
  private V1alpha1WebhookThrottleConfig throttle;


  public V1alpha1Webhook clientConfig(V1alpha1WebhookClientConfig clientConfig) {
    
    this.clientConfig = clientConfig;
    return this;
  }

   /**
   * Get clientConfig
   * @return clientConfig
  **/
  @ApiModelProperty(required = true, value = "")

  public V1alpha1WebhookClientConfig getClientConfig() {
    return clientConfig;
  }


  public void setClientConfig(V1alpha1WebhookClientConfig clientConfig) {
    this.clientConfig = clientConfig;
  }


  public V1alpha1Webhook throttle(V1alpha1WebhookThrottleConfig throttle) {
    
    this.throttle = throttle;
    return this;
  }

   /**
   * Get throttle
   * @return throttle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1WebhookThrottleConfig getThrottle() {
    return throttle;
  }


  public void setThrottle(V1alpha1WebhookThrottleConfig throttle) {
    this.throttle = throttle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1Webhook v1alpha1Webhook = (V1alpha1Webhook) o;
    return Objects.equals(this.clientConfig, v1alpha1Webhook.clientConfig) &&
        Objects.equals(this.throttle, v1alpha1Webhook.throttle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientConfig, throttle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1Webhook {\n");
    sb.append("    clientConfig: ").append(toIndentedString(clientConfig)).append("\n");
    sb.append("    throttle: ").append(toIndentedString(throttle)).append("\n");
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

