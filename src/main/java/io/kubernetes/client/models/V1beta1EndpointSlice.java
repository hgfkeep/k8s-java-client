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
import io.kubernetes.client.models.V1ObjectMeta;
import io.kubernetes.client.models.V1beta1Endpoint;
import io.kubernetes.client.models.V1beta1EndpointPort;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EndpointSlice represents a subset of the endpoints that implement a service. For a given service there may be multiple EndpointSlice objects, selected by labels, which must be joined to produce the full set of endpoints.
 */
@ApiModel(description = "EndpointSlice represents a subset of the endpoints that implement a service. For a given service there may be multiple EndpointSlice objects, selected by labels, which must be joined to produce the full set of endpoints.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-20T06:31:18.419Z[Etc/UTC]")
public class V1beta1EndpointSlice {
  public static final String SERIALIZED_NAME_ADDRESS_TYPE = "addressType";
  @SerializedName(SERIALIZED_NAME_ADDRESS_TYPE)
  private String addressType;

  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_ENDPOINTS = "endpoints";
  @SerializedName(SERIALIZED_NAME_ENDPOINTS)
  private List<V1beta1Endpoint> endpoints = new ArrayList<V1beta1Endpoint>();

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<V1beta1EndpointPort> ports = null;


  public V1beta1EndpointSlice addressType(String addressType) {
    
    this.addressType = addressType;
    return this;
  }

   /**
   * addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
   * @return addressType
  **/
  @ApiModelProperty(required = true, value = "addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.")

  public String getAddressType() {
    return addressType;
  }


  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }


  public V1beta1EndpointSlice apiVersion(String apiVersion) {
    
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1beta1EndpointSlice endpoints(List<V1beta1Endpoint> endpoints) {
    
    this.endpoints = endpoints;
    return this;
  }

  public V1beta1EndpointSlice addEndpointsItem(V1beta1Endpoint endpointsItem) {
    this.endpoints.add(endpointsItem);
    return this;
  }

   /**
   * endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
   * @return endpoints
  **/
  @ApiModelProperty(required = true, value = "endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.")

  public List<V1beta1Endpoint> getEndpoints() {
    return endpoints;
  }


  public void setEndpoints(List<V1beta1Endpoint> endpoints) {
    this.endpoints = endpoints;
  }


  public V1beta1EndpointSlice kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")

  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1beta1EndpointSlice metadata(V1ObjectMeta metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ObjectMeta getMetadata() {
    return metadata;
  }


  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }


  public V1beta1EndpointSlice ports(List<V1beta1EndpointPort> ports) {
    
    this.ports = ports;
    return this;
  }

  public V1beta1EndpointSlice addPortsItem(V1beta1EndpointPort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<V1beta1EndpointPort>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates \&quot;all ports\&quot;. Each slice may include a maximum of 100 ports.
   * @return ports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates \"all ports\". Each slice may include a maximum of 100 ports.")

  public List<V1beta1EndpointPort> getPorts() {
    return ports;
  }


  public void setPorts(List<V1beta1EndpointPort> ports) {
    this.ports = ports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1EndpointSlice v1beta1EndpointSlice = (V1beta1EndpointSlice) o;
    return Objects.equals(this.addressType, v1beta1EndpointSlice.addressType) &&
        Objects.equals(this.apiVersion, v1beta1EndpointSlice.apiVersion) &&
        Objects.equals(this.endpoints, v1beta1EndpointSlice.endpoints) &&
        Objects.equals(this.kind, v1beta1EndpointSlice.kind) &&
        Objects.equals(this.metadata, v1beta1EndpointSlice.metadata) &&
        Objects.equals(this.ports, v1beta1EndpointSlice.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, apiVersion, endpoints, kind, metadata, ports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1EndpointSlice {\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
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

