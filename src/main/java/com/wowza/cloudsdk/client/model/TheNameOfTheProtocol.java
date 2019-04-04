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
 * 
 */
@ApiModel(description = "")
public class TheNameOfTheProtocol {
  @SerializedName("name")
  private String name = null;

  @SerializedName("percentage_viewers")
  private Integer percentageViewers = null;

  @SerializedName("percentage_viewing_time")
  private Integer percentageViewingTime = null;

  @SerializedName("seconds_avg_viewing_time")
  private Integer secondsAvgViewingTime = null;

  @SerializedName("seconds_total_viewing_time")
  private Integer secondsTotalViewingTime = null;

  @SerializedName("total_unique_viewers")
  private Integer totalUniqueViewers = null;

  public TheNameOfTheProtocol name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the protocol.
   * @return name
  **/
  @ApiModelProperty(example = "", value = "The name of the protocol.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TheNameOfTheProtocol percentageViewers(Integer percentageViewers) {
    this.percentageViewers = percentageViewers;
    return this;
  }

   /**
   * Total percentage of requests to play content (&lt;strong&gt;100&lt;/strong&gt;).
   * @return percentageViewers
  **/
  @ApiModelProperty(example = "", value = "Total percentage of requests to play content (<strong>100</strong>).")
  public Integer getPercentageViewers() {
    return percentageViewers;
  }

  public void setPercentageViewers(Integer percentageViewers) {
    this.percentageViewers = percentageViewers;
  }

  public TheNameOfTheProtocol percentageViewingTime(Integer percentageViewingTime) {
    this.percentageViewingTime = percentageViewingTime;
    return this;
  }

   /**
   * The percentage of total time that the protocol or rendition was played. Always &lt;strong&gt;100&lt;/strong&gt; for &lt;em&gt;stream_target&lt;/em&gt;.
   * @return percentageViewingTime
  **/
  @ApiModelProperty(example = "", value = "The percentage of total time that the protocol or rendition was played. Always <strong>100</strong> for <em>stream_target</em>.")
  public Integer getPercentageViewingTime() {
    return percentageViewingTime;
  }

  public void setPercentageViewingTime(Integer percentageViewingTime) {
    this.percentageViewingTime = percentageViewingTime;
  }

  public TheNameOfTheProtocol secondsAvgViewingTime(Integer secondsAvgViewingTime) {
    this.secondsAvgViewingTime = secondsAvgViewingTime;
    return this;
  }

   /**
   * The average length of time, in seconds, that the stream was played at the target.
   * @return secondsAvgViewingTime
  **/
  @ApiModelProperty(example = "", value = "The average length of time, in seconds, that the stream was played at the target.")
  public Integer getSecondsAvgViewingTime() {
    return secondsAvgViewingTime;
  }

  public void setSecondsAvgViewingTime(Integer secondsAvgViewingTime) {
    this.secondsAvgViewingTime = secondsAvgViewingTime;
  }

  public TheNameOfTheProtocol secondsTotalViewingTime(Integer secondsTotalViewingTime) {
    this.secondsTotalViewingTime = secondsTotalViewingTime;
    return this;
  }

   /**
   * The total length of time, in seconds, that the stream was played at the target. May be longer than the duration of the stream.
   * @return secondsTotalViewingTime
  **/
  @ApiModelProperty(example = "", value = "The total length of time, in seconds, that the stream was played at the target. May be longer than the duration of the stream.")
  public Integer getSecondsTotalViewingTime() {
    return secondsTotalViewingTime;
  }

  public void setSecondsTotalViewingTime(Integer secondsTotalViewingTime) {
    this.secondsTotalViewingTime = secondsTotalViewingTime;
  }

  public TheNameOfTheProtocol totalUniqueViewers(Integer totalUniqueViewers) {
    this.totalUniqueViewers = totalUniqueViewers;
    return this;
  }

   /**
   * The total number of requests to download at least one chunk of the stream at the target (for HTTP streams) or requests to connect to and play the stream (for ultra low latency streams). A unique viewer is a single IP address; multiple users that share the same IP address are counted once.
   * @return totalUniqueViewers
  **/
  @ApiModelProperty(example = "", value = "The total number of requests to download at least one chunk of the stream at the target (for HTTP streams) or requests to connect to and play the stream (for ultra low latency streams). A unique viewer is a single IP address; multiple users that share the same IP address are counted once.")
  public Integer getTotalUniqueViewers() {
    return totalUniqueViewers;
  }

  public void setTotalUniqueViewers(Integer totalUniqueViewers) {
    this.totalUniqueViewers = totalUniqueViewers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TheNameOfTheProtocol theNameOfTheProtocol = (TheNameOfTheProtocol) o;
    return Objects.equals(this.name, theNameOfTheProtocol.name) &&
        Objects.equals(this.percentageViewers, theNameOfTheProtocol.percentageViewers) &&
        Objects.equals(this.percentageViewingTime, theNameOfTheProtocol.percentageViewingTime) &&
        Objects.equals(this.secondsAvgViewingTime, theNameOfTheProtocol.secondsAvgViewingTime) &&
        Objects.equals(this.secondsTotalViewingTime, theNameOfTheProtocol.secondsTotalViewingTime) &&
        Objects.equals(this.totalUniqueViewers, theNameOfTheProtocol.totalUniqueViewers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, percentageViewers, percentageViewingTime, secondsAvgViewingTime, secondsTotalViewingTime, totalUniqueViewers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TheNameOfTheProtocol {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    percentageViewers: ").append(toIndentedString(percentageViewers)).append("\n");
    sb.append("    percentageViewingTime: ").append(toIndentedString(percentageViewingTime)).append("\n");
    sb.append("    secondsAvgViewingTime: ").append(toIndentedString(secondsAvgViewingTime)).append("\n");
    sb.append("    secondsTotalViewingTime: ").append(toIndentedString(secondsTotalViewingTime)).append("\n");
    sb.append("    totalUniqueViewers: ").append(toIndentedString(totalUniqueViewers)).append("\n");
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

