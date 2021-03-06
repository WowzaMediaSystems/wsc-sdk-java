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

/**
 * A hash of zones with network usage, keyed by the name of the billing zone where the usage was generated.
 */
@ApiModel(description = "A hash of zones with network usage, keyed by the name of the billing zone where the usage was generated.")
public class HashOfZones {
  @SerializedName("bytes_billed")
  private Integer bytesBilled = null;

  @SerializedName("bytes_used")
  private Integer bytesUsed = null;

  public HashOfZones bytesBilled(Integer bytesBilled) {
    this.bytesBilled = bytesBilled;
    return this;
  }

   /**
   * The amount of usage, in bytes, that was billed for the stream target during the selected time frame.
   * @return bytesBilled
  **/
  @ApiModelProperty(example = "", value = "The amount of usage, in bytes, that was billed for the stream target during the selected time frame.")
  public Integer getBytesBilled() {
    return bytesBilled;
  }

  public void setBytesBilled(Integer bytesBilled) {
    this.bytesBilled = bytesBilled;
  }

  public HashOfZones bytesUsed(Integer bytesUsed) {
    this.bytesUsed = bytesUsed;
    return this;
  }

   /**
   * The amount of content, in bytes, that went through the stream target during the selected time frame.
   * @return bytesUsed
  **/
  @ApiModelProperty(example = "", value = "The amount of content, in bytes, that went through the stream target during the selected time frame.")
  public Integer getBytesUsed() {
    return bytesUsed;
  }

  public void setBytesUsed(Integer bytesUsed) {
    this.bytesUsed = bytesUsed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HashOfZones hashOfZones = (HashOfZones) o;
    return Objects.equals(this.bytesBilled, hashOfZones.bytesBilled) &&
        Objects.equals(this.bytesUsed, hashOfZones.bytesUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytesBilled, bytesUsed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HashOfZones {\n");
    
    sb.append("    bytesBilled: ").append(toIndentedString(bytesBilled)).append("\n");
    sb.append("    bytesUsed: ").append(toIndentedString(bytesUsed)).append("\n");
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

