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
import io.kubernetes.client.models.V1alpha1QueuingConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LimitResponse defines how to handle requests that can not be executed right now.
 */
@ApiModel(description = "LimitResponse defines how to handle requests that can not be executed right now.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-20T06:31:18.419Z[Etc/UTC]")
public class V1alpha1LimitResponse {
  public static final String SERIALIZED_NAME_QUEUING = "queuing";
  @SerializedName(SERIALIZED_NAME_QUEUING)
  private V1alpha1QueuingConfiguration queuing;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public V1alpha1LimitResponse queuing(V1alpha1QueuingConfiguration queuing) {
    
    this.queuing = queuing;
    return this;
  }

   /**
   * Get queuing
   * @return queuing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1QueuingConfiguration getQueuing() {
    return queuing;
  }


  public void setQueuing(V1alpha1QueuingConfiguration queuing) {
    this.queuing = queuing;
  }


  public V1alpha1LimitResponse type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;type&#x60; is \&quot;Queue\&quot; or \&quot;Reject\&quot;. \&quot;Queue\&quot; means that requests that can not be executed upon arrival are held in a queue until they can be executed or a queuing limit is reached. \&quot;Reject\&quot; means that requests that can not be executed upon arrival are rejected. Required.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "`type` is \"Queue\" or \"Reject\". \"Queue\" means that requests that can not be executed upon arrival are held in a queue until they can be executed or a queuing limit is reached. \"Reject\" means that requests that can not be executed upon arrival are rejected. Required.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1LimitResponse v1alpha1LimitResponse = (V1alpha1LimitResponse) o;
    return Objects.equals(this.queuing, v1alpha1LimitResponse.queuing) &&
        Objects.equals(this.type, v1alpha1LimitResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queuing, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1LimitResponse {\n");
    sb.append("    queuing: ").append(toIndentedString(queuing)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

