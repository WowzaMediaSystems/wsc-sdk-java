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
import com.wowza.cloudsdk.client.model.IndexPlayer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
public class Players {
  @SerializedName("players")
  private List<IndexPlayer> players = new ArrayList<IndexPlayer>();

  public Players players(List<IndexPlayer> players) {
    this.players = players;
    return this;
  }

  public Players addPlayersItem(IndexPlayer playersItem) {
    this.players.add(playersItem);
    return this;
  }

   /**
   * 
   * @return players
  **/
  @ApiModelProperty(example = "\"\"", required = true, value = "")
  public List<IndexPlayer> getPlayers() {
    return players;
  }

  public void setPlayers(List<IndexPlayer> players) {
    this.players = players;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Players players = (Players) o;
    return Objects.equals(this.players, players.players);
  }

  @Override
  public int hashCode() {
    return Objects.hash(players);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Players {\n");
    
    sb.append("    players: ").append(toIndentedString(players)).append("\n");
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

