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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * ContainerStateRunning is a running state of a container.
 */
@ApiModel(description = "ContainerStateRunning is a running state of a container.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-20T06:31:18.419Z[Etc/UTC]")
public class V1ContainerStateRunning {
  public static final String SERIALIZED_NAME_STARTED_AT = "startedAt";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private DateTime startedAt;


  public V1ContainerStateRunning startedAt(DateTime startedAt) {
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Time at which the container was last (re-)started
   * @return startedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time at which the container was last (re-)started")

  public DateTime getStartedAt() {
    return startedAt;
  }


  public void setStartedAt(DateTime startedAt) {
    this.startedAt = startedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerStateRunning v1ContainerStateRunning = (V1ContainerStateRunning) o;
    return Objects.equals(this.startedAt, v1ContainerStateRunning.startedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerStateRunning {\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
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

