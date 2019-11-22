/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.15.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1ConfigMapEnvSource;
import io.kubernetes.client.openapi.models.V1SecretEnvSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EnvFromSource represents the source of a set of ConfigMaps
 */
@ApiModel(description = "EnvFromSource represents the source of a set of ConfigMaps")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-06T10:41:07.822Z[Etc/UTC]")
public class V1EnvFromSource {
  public static final String SERIALIZED_NAME_CONFIG_MAP_REF = "configMapRef";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP_REF)
  private V1ConfigMapEnvSource configMapRef;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1SecretEnvSource secretRef;


  public V1EnvFromSource configMapRef(V1ConfigMapEnvSource configMapRef) {
    
    this.configMapRef = configMapRef;
    return this;
  }

   /**
   * Get configMapRef
   * @return configMapRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ConfigMapEnvSource getConfigMapRef() {
    return configMapRef;
  }


  public void setConfigMapRef(V1ConfigMapEnvSource configMapRef) {
    this.configMapRef = configMapRef;
  }


  public V1EnvFromSource prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
   * @return prefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.")

  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public V1EnvFromSource secretRef(V1SecretEnvSource secretRef) {
    
    this.secretRef = secretRef;
    return this;
  }

   /**
   * Get secretRef
   * @return secretRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretEnvSource getSecretRef() {
    return secretRef;
  }


  public void setSecretRef(V1SecretEnvSource secretRef) {
    this.secretRef = secretRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EnvFromSource {\n");
    sb.append("    configMapRef: ").append(toIndentedString(configMapRef)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
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
