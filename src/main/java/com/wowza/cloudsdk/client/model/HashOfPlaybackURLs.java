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
 * A hash of **hls**, **wowz**, and **ws** URLs that can be used by the player.
 */
@ApiModel(description = "A hash of **hls**, **wowz**, and **ws** URLs that can be used by the player.")
public class HashOfPlaybackURLs {
  @SerializedName("hls")
  private String hls = null;

  @SerializedName("wowz")
  private String wowz = null;

  @SerializedName("ws")
  private String ws = null;

  public HashOfPlaybackURLs hls(String hls) {
    this.hls = hls;
    return this;
  }

   /**
   * The web address that the ultra low latency target can use to play the Apple HLS stream.
   * @return hls
  **/
  @ApiModelProperty(example = "https://wowzasubdomain-i.akamaihd.net/hls/live/268548/0P1q1S0lVTE5MQmZVRWM1UXB0Z3V5e3b/playlist.m3u8", value = "The web address that the ultra low latency target can use to play the Apple HLS stream.")
  public String getHls() {
    return hls;
  }

  public void setHls(String hls) {
    this.hls = hls;
  }

  public HashOfPlaybackURLs wowz(String wowz) {
    this.wowz = wowz;
    return this;
  }

   /**
   * The **wowz** and **wowzs** web addresses that the ultra low latency target can use to play WOWZ streams.
   * @return wowz
  **/
  @ApiModelProperty(example = "wowz://edge-subdomain.cdn.wowza.com/live/_definst_/0P1q1bGo4YmR1bGNKWW9nWVVodHJ6010", value = "The **wowz** and **wowzs** web addresses that the ultra low latency target can use to play WOWZ streams.")
  public String getWowz() {
    return wowz;
  }

  public void setWowz(String wowz) {
    this.wowz = wowz;
  }

  public HashOfPlaybackURLs ws(String ws) {
    this.ws = ws;
    return this;
  }

   /**
   * The **ws** and **wss** web addresses that the ultra low latency target can use to play the WebSocket stream.
   * @return ws
  **/
  @ApiModelProperty(example = "ws://edge-subdomain.cdn.wowza.com/live/_definst_/0P1q1bGo4YmR1bGNKWW9nWVVodHJ6010", value = "The **ws** and **wss** web addresses that the ultra low latency target can use to play the WebSocket stream.")
  public String getWs() {
    return ws;
  }

  public void setWs(String ws) {
    this.ws = ws;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HashOfPlaybackURLs hashOfPlaybackURLs = (HashOfPlaybackURLs) o;
    return Objects.equals(this.hls, hashOfPlaybackURLs.hls) &&
        Objects.equals(this.wowz, hashOfPlaybackURLs.wowz) &&
        Objects.equals(this.ws, hashOfPlaybackURLs.ws);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hls, wowz, ws);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HashOfPlaybackURLs {\n");
    
    sb.append("    hls: ").append(toIndentedString(hls)).append("\n");
    sb.append("    wowz: ").append(toIndentedString(wowz)).append("\n");
    sb.append("    ws: ").append(toIndentedString(ws)).append("\n");
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
