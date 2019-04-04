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
import com.wowza.cloudsdk.client.model.StreamTarget;
import java.io.IOException;

/**
 * 
 */
@ApiModel(description = "")
public class StreamTargetInput {
  @SerializedName("stream_target")
  private StreamTarget streamTarget = null;

  public StreamTargetInput streamTarget(StreamTarget streamTarget) {
    this.streamTarget = streamTarget;
    return this;
  }

   /**
   * Get streamTarget
   * @return streamTarget
  **/
  @ApiModelProperty(required = true, value = "")
  public StreamTarget getStreamTarget() {
    return streamTarget;
  }

  public void setStreamTarget(StreamTarget streamTarget) {
    this.streamTarget = streamTarget;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamTargetInput streamTargetInput = (StreamTargetInput) o;
    return Objects.equals(this.streamTarget, streamTargetInput.streamTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamTarget);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamTargetInput {\n");
    
    sb.append("    streamTarget: ").append(toIndentedString(streamTarget)).append("\n");
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

