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
import io.kubernetes.client.models.V1EndpointAddress;
import io.kubernetes.client.models.V1EndpointPort;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EndpointSubset is a group of addresses with a common set of ports. The expanded set of endpoints is the Cartesian product of Addresses x Ports. For example, given:   {     Addresses: [{\&quot;ip\&quot;: \&quot;10.10.1.1\&quot;}, {\&quot;ip\&quot;: \&quot;10.10.2.2\&quot;}],     Ports:     [{\&quot;name\&quot;: \&quot;a\&quot;, \&quot;port\&quot;: 8675}, {\&quot;name\&quot;: \&quot;b\&quot;, \&quot;port\&quot;: 309}]   } The resulting set of endpoints can be viewed as:     a: [ 10.10.1.1:8675, 10.10.2.2:8675 ],     b: [ 10.10.1.1:309, 10.10.2.2:309 ]
 */
@ApiModel(description = "EndpointSubset is a group of addresses with a common set of ports. The expanded set of endpoints is the Cartesian product of Addresses x Ports. For example, given:   {     Addresses: [{\"ip\": \"10.10.1.1\"}, {\"ip\": \"10.10.2.2\"}],     Ports:     [{\"name\": \"a\", \"port\": 8675}, {\"name\": \"b\", \"port\": 309}]   } The resulting set of endpoints can be viewed as:     a: [ 10.10.1.1:8675, 10.10.2.2:8675 ],     b: [ 10.10.1.1:309, 10.10.2.2:309 ]")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-20T06:31:18.419Z[Etc/UTC]")
public class V1EndpointSubset {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<V1EndpointAddress> addresses = null;

  public static final String SERIALIZED_NAME_NOT_READY_ADDRESSES = "notReadyAddresses";
  @SerializedName(SERIALIZED_NAME_NOT_READY_ADDRESSES)
  private List<V1EndpointAddress> notReadyAddresses = null;

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<V1EndpointPort> ports = null;


  public V1EndpointSubset addresses(List<V1EndpointAddress> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public V1EndpointSubset addAddressesItem(V1EndpointAddress addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<V1EndpointAddress>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.
   * @return addresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.")

  public List<V1EndpointAddress> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<V1EndpointAddress> addresses) {
    this.addresses = addresses;
  }


  public V1EndpointSubset notReadyAddresses(List<V1EndpointAddress> notReadyAddresses) {
    
    this.notReadyAddresses = notReadyAddresses;
    return this;
  }

  public V1EndpointSubset addNotReadyAddressesItem(V1EndpointAddress notReadyAddressesItem) {
    if (this.notReadyAddresses == null) {
      this.notReadyAddresses = new ArrayList<V1EndpointAddress>();
    }
    this.notReadyAddresses.add(notReadyAddressesItem);
    return this;
  }

   /**
   * IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
   * @return notReadyAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.")

  public List<V1EndpointAddress> getNotReadyAddresses() {
    return notReadyAddresses;
  }


  public void setNotReadyAddresses(List<V1EndpointAddress> notReadyAddresses) {
    this.notReadyAddresses = notReadyAddresses;
  }


  public V1EndpointSubset ports(List<V1EndpointPort> ports) {
    
    this.ports = ports;
    return this;
  }

  public V1EndpointSubset addPortsItem(V1EndpointPort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<V1EndpointPort>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * Port numbers available on the related IP addresses.
   * @return ports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Port numbers available on the related IP addresses.")

  public List<V1EndpointPort> getPorts() {
    return ports;
  }


  public void setPorts(List<V1EndpointPort> ports) {
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
    V1EndpointSubset v1EndpointSubset = (V1EndpointSubset) o;
    return Objects.equals(this.addresses, v1EndpointSubset.addresses) &&
        Objects.equals(this.notReadyAddresses, v1EndpointSubset.notReadyAddresses) &&
        Objects.equals(this.ports, v1EndpointSubset.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, notReadyAddresses, ports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EndpointSubset {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    notReadyAddresses: ").append(toIndentedString(notReadyAddresses)).append("\n");
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
