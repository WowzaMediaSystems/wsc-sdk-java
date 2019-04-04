/*
 * This code and all components © 2015 - 2019 Wowza Media Systems, LLC. All rights reserved.
 * This code is licensed pursuant to the BSD 3-Clause License.
 * 
 * Wowza Streaming Cloud REST API Reference Documentation
 *
 * OpenAPI spec version: v1.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.wowza.cloudsdk.client.model;

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
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
public class IndexLiveStream {
  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public IndexLiveStream createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time that the live stream was created.
   * @return createdAt
  **/
  @ApiModelProperty(example = "", value = "The date and time that the live stream was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public IndexLiveStream id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique alphanumeric string that identifies the live stream.
   * @return id
  **/
  @ApiModelProperty(example = "", value = "The unique alphanumeric string that identifies the live stream.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IndexLiveStream name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A descriptive name for the live stream. Maximum 200 characters.
   * @return name
  **/
  @ApiModelProperty(example = "", value = "A descriptive name for the live stream. Maximum 200 characters.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IndexLiveStream updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time that the live stream was updated.
   * @return updatedAt
  **/
  @ApiModelProperty(example = "", value = "The date and time that the live stream was updated.")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexLiveStream indexLiveStream = (IndexLiveStream) o;
    return Objects.equals(this.createdAt, indexLiveStream.createdAt) &&
        Objects.equals(this.id, indexLiveStream.id) &&
        Objects.equals(this.name, indexLiveStream.name) &&
        Objects.equals(this.updatedAt, indexLiveStream.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, name, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexLiveStream {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

