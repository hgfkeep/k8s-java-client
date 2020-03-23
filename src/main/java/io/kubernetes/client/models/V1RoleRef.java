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

/**
 * RoleRef contains information that points to the role being used
 */
@ApiModel(description = "RoleRef contains information that points to the role being used")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-20T06:31:18.419Z[Etc/UTC]")
public class V1RoleRef {
  public static final String SERIALIZED_NAME_API_GROUP = "apiGroup";
  @SerializedName(SERIALIZED_NAME_API_GROUP)
  private String apiGroup;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public V1RoleRef apiGroup(String apiGroup) {
    
    this.apiGroup = apiGroup;
    return this;
  }

   /**
   * APIGroup is the group for the resource being referenced
   * @return apiGroup
  **/
  @ApiModelProperty(required = true, value = "APIGroup is the group for the resource being referenced")

  public String getApiGroup() {
    return apiGroup;
  }


  public void setApiGroup(String apiGroup) {
    this.apiGroup = apiGroup;
  }


  public V1RoleRef kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Kind is the type of resource being referenced
   * @return kind
  **/
  @ApiModelProperty(required = true, value = "Kind is the type of resource being referenced")

  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1RoleRef name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name is the name of resource being referenced
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is the name of resource being referenced")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1RoleRef v1RoleRef = (V1RoleRef) o;
    return Objects.equals(this.apiGroup, v1RoleRef.apiGroup) &&
        Objects.equals(this.kind, v1RoleRef.kind) &&
        Objects.equals(this.name, v1RoleRef.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiGroup, kind, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1RoleRef {\n");
    sb.append("    apiGroup: ").append(toIndentedString(apiGroup)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

