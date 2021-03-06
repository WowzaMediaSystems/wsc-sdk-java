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
public class StreamTarget {
  @SerializedName("backup_url")
  private String backupUrl = null;

  @SerializedName("connection_code")
  private String connectionCode = null;

  @SerializedName("connection_code_expires_at")
  private OffsetDateTime connectionCodeExpiresAt = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("hds_playback_url")
  private String hdsPlaybackUrl = null;

  @SerializedName("hls_playback_url")
  private String hlsPlaybackUrl = null;

  @SerializedName("id")
  private String id = null;

  /**
   * Only for targets whose &lt;em&gt;type&lt;/em&gt; is &lt;strong&gt;WowzaStreamTarget&lt;/strong&gt; and &lt;em&gt;provider&lt;/em&gt; is &lt;em&gt;not&lt;/em&gt; &lt;strong&gt;akamai_cupertino&lt;/strong&gt;. Choose a location as close as possible to your video source.
   */
  @JsonAdapter(LocationEnum.Adapter.class)
  public enum LocationEnum {
    ASIA_PACIFIC_AUSTRALIA("asia_pacific_australia"),
    
    ASIA_PACIFIC_JAPAN("asia_pacific_japan"),
    
    ASIA_PACIFIC_SINGAPORE("asia_pacific_singapore"),
    
    ASIA_PACIFIC_TAIWAN("asia_pacific_taiwan"),
    
    EU_BELGIUM("eu_belgium"),
    
    EU_GERMANY("eu_germany"),
    
    EU_IRELAND("eu_ireland"),
    
    SOUTH_AMERICA_BRAZIL("south_america_brazil"),
    
    US_CENTRAL_IOWA("us_central_iowa"),
    
    US_EAST_VIRGINIA("us_east_virginia"),
    
    US_WEST_CALIFORNIA("us_west_california"),
    
    US_WEST_OREGON("us_west_oregon");

    private String value;

    LocationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LocationEnum fromValue(String text) {
      for (LocationEnum b : LocationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LocationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LocationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LocationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LocationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("location")
  private LocationEnum location = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("primary_url")
  private String primaryUrl = null;

  @SerializedName("provider")
  private String provider = null;

  @SerializedName("rtmp_playback_url")
  private String rtmpPlaybackUrl = null;

  @SerializedName("secure_ingest_query_param")
  private String secureIngestQueryParam = null;

  @SerializedName("stream_name")
  private String streamName = null;

  /**
   * &lt;strong&gt;WowzaStreamTarget&lt;/strong&gt; is a Wowza CDN target. &lt;strong&gt;CustomStreamTarget&lt;/strong&gt; (the default) is an external, third-party destination, and &lt;strong&gt;UltraLowLatencyStreamTarget&lt;/strong&gt; is an ultra low latency stream target. &lt;!--and &lt;strong&gt;FacebookStreamTarget&lt;/strong&gt; (a Facebook Live target).--&gt;
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    WOWZASTREAMTARGET("WowzaStreamTarget"),
    
    CUSTOMSTREAMTARGET("CustomStreamTarget");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("use_cors")
  private Boolean useCors = null;

  @SerializedName("use_secure_ingest")
  private Boolean useSecureIngest = null;

  @SerializedName("username")
  private String username = null;

  public StreamTarget backupUrl(String backupUrl) {
    this.backupUrl = backupUrl;
    return this;
  }

   /**
   * Only for targets whose whose &lt;em&gt;provider&lt;/em&gt; is &lt;em&gt;not&lt;/em&gt; &lt;strong&gt;akamai_cupertino&lt;/strong&gt;. The backup RTMP ingest URL of the stream target.
   * @return backupUrl
  **/
  @ApiModelProperty(example = "", value = "Only for targets whose whose <em>provider</em> is <em>not</em> <strong>akamai_cupertino</strong>. The backup RTMP ingest URL of the stream target.")
  public String getBackupUrl() {
    return backupUrl;
  }

  public void setBackupUrl(String backupUrl) {
    this.backupUrl = backupUrl;
  }

  public StreamTarget connectionCode(String connectionCode) {
    this.connectionCode = connectionCode;
    return this;
  }

   /**
   * A six-character, alphanumeric string that allows select encoders, such as Wowza Streaming Engine or the Wowza GoCoder app, to send an encoded stream to a stream target in Wowza Streaming Cloud. The code can be used once and expires 24 hours after it&#39;s created.
   * @return connectionCode
  **/
  @ApiModelProperty(example = "", value = "A six-character, alphanumeric string that allows select encoders, such as Wowza Streaming Engine or the Wowza GoCoder app, to send an encoded stream to a stream target in Wowza Streaming Cloud. The code can be used once and expires 24 hours after it's created.")
  public String getConnectionCode() {
    return connectionCode;
  }

  public void setConnectionCode(String connectionCode) {
    this.connectionCode = connectionCode;
  }

  public StreamTarget connectionCodeExpiresAt(OffsetDateTime connectionCodeExpiresAt) {
    this.connectionCodeExpiresAt = connectionCodeExpiresAt;
    return this;
  }

   /**
   * The date and time that the &lt;em&gt;connection_code&lt;/em&gt; expires.
   * @return connectionCodeExpiresAt
  **/
  @ApiModelProperty(example = "", value = "The date and time that the <em>connection_code</em> expires.")
  public OffsetDateTime getConnectionCodeExpiresAt() {
    return connectionCodeExpiresAt;
  }

  public void setConnectionCodeExpiresAt(OffsetDateTime connectionCodeExpiresAt) {
    this.connectionCodeExpiresAt = connectionCodeExpiresAt;
  }

  public StreamTarget createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time that the stream target was created.
   * @return createdAt
  **/
  @ApiModelProperty(example = "", value = "The date and time that the stream target was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public StreamTarget hdsPlaybackUrl(String hdsPlaybackUrl) {
    this.hdsPlaybackUrl = hdsPlaybackUrl;
    return this;
  }

   /**
   * The web address that the target uses to play Adobe HDS streams.
   * @return hdsPlaybackUrl
  **/
  @ApiModelProperty(example = "", value = "The web address that the target uses to play Adobe HDS streams.")
  public String getHdsPlaybackUrl() {
    return hdsPlaybackUrl;
  }

  public void setHdsPlaybackUrl(String hdsPlaybackUrl) {
    this.hdsPlaybackUrl = hdsPlaybackUrl;
  }

  public StreamTarget hlsPlaybackUrl(String hlsPlaybackUrl) {
    this.hlsPlaybackUrl = hlsPlaybackUrl;
    return this;
  }

   /**
   * Only for targets whose &lt;em&gt;provider&lt;/em&gt; is &lt;strong&gt;akamai_cupertino&lt;/strong&gt;. The web address that the target uses to play Apple HLS streams.
   * @return hlsPlaybackUrl
  **/
  @ApiModelProperty(example = "", value = "Only for targets whose <em>provider</em> is <strong>akamai_cupertino</strong>. The web address that the target uses to play Apple HLS streams.")
  public String getHlsPlaybackUrl() {
    return hlsPlaybackUrl;
  }

  public void setHlsPlaybackUrl(String hlsPlaybackUrl) {
    this.hlsPlaybackUrl = hlsPlaybackUrl;
  }

  public StreamTarget id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique alphanumeric string that identifies the stream target.
   * @return id
  **/
  @ApiModelProperty(example = "", value = "The unique alphanumeric string that identifies the stream target.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StreamTarget location(LocationEnum location) {
    this.location = location;
    return this;
  }

   /**
   * Only for targets whose &lt;em&gt;type&lt;/em&gt; is &lt;strong&gt;WowzaStreamTarget&lt;/strong&gt; and &lt;em&gt;provider&lt;/em&gt; is &lt;em&gt;not&lt;/em&gt; &lt;strong&gt;akamai_cupertino&lt;/strong&gt;. Choose a location as close as possible to your video source.
   * @return location
  **/
  @ApiModelProperty(example = "", value = "Only for targets whose <em>type</em> is <strong>WowzaStreamTarget</strong> and <em>provider</em> is <em>not</em> <strong>akamai_cupertino</strong>. Choose a location as close as possible to your video source.")
  public LocationEnum getLocation() {
    return location;
  }

  public void setLocation(LocationEnum location) {
    this.location = location;
  }

  public StreamTarget name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A descriptive name for the stream target. Maximum 255 characters.
   * @return name
  **/
  @ApiModelProperty(example = "", value = "A descriptive name for the stream target. Maximum 255 characters.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StreamTarget password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Only for targets whose &lt;em&gt;type&lt;/em&gt; is &lt;strong&gt;CustomStreamTarget&lt;/strong&gt; and &lt;em&gt;provider&lt;/em&gt; is &lt;em&gt;not&lt;/em&gt; **akamai_cupertino**. A &lt;em&gt;username&lt;/em&gt; must also be present. The password associated with the target username for RTMP authentication.
   * @return password
  **/
  @ApiModelProperty(example = "", value = "Only for targets whose <em>type</em> is <strong>CustomStreamTarget</strong> and <em>provider</em> is <em>not</em> **akamai_cupertino**. A <em>username</em> must also be present. The password associated with the target username for RTMP authentication.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public StreamTarget primaryUrl(String primaryUrl) {
    this.primaryUrl = primaryUrl;
    return this;
  }

   /**
   * The primary ingest URL of the target.
   * @return primaryUrl
  **/
  @ApiModelProperty(example = "", value = "The primary ingest URL of the target.")
  public String getPrimaryUrl() {
    return primaryUrl;
  }

  public void setPrimaryUrl(String primaryUrl) {
    this.primaryUrl = primaryUrl;
  }

  public StreamTarget provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * The CDN for the target. &lt;br /&gt;&lt;br /&gt;Required for targets whose &lt;em&gt;type&lt;/em&gt; is &lt;strong&gt;CustomStreamTarget&lt;/strong&gt;. Valid values for &lt;strong&gt;CustomStreamTarget&lt;/strong&gt; are &lt;strong&gt;akamai&lt;/strong&gt;, &lt;strong&gt;akamai_cupertino&lt;/strong&gt;, &lt;strong&gt;akamai_rtmp&lt;/strong&gt;, &lt;strong&gt;limelight&lt;/strong&gt;, &lt;strong&gt;rtmp&lt;/strong&gt;, and &lt;strong&gt;ustream&lt;/strong&gt;. Values can be appended with **_mock** to use in the sandbox environment. &lt;br /&gt;&lt;br /&gt;Valid values for &lt;strong&gt;WowzaStreamTarget&lt;/strong&gt; are &lt;strong&gt;akamai&lt;/strong&gt;, &lt;strong&gt;akamai_cupertino&lt;/strong&gt; (default), and &lt;strong&gt;akamai_legacy_rtmp&lt;/strong&gt;.
   * @return provider
  **/
  @ApiModelProperty(example = "", value = "The CDN for the target. <br /><br />Required for targets whose <em>type</em> is <strong>CustomStreamTarget</strong>. Valid values for <strong>CustomStreamTarget</strong> are <strong>akamai</strong>, <strong>akamai_cupertino</strong>, <strong>akamai_rtmp</strong>, <strong>limelight</strong>, <strong>rtmp</strong>, and <strong>ustream</strong>. Values can be appended with **_mock** to use in the sandbox environment. <br /><br />Valid values for <strong>WowzaStreamTarget</strong> are <strong>akamai</strong>, <strong>akamai_cupertino</strong> (default), and <strong>akamai_legacy_rtmp</strong>.")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public StreamTarget rtmpPlaybackUrl(String rtmpPlaybackUrl) {
    this.rtmpPlaybackUrl = rtmpPlaybackUrl;
    return this;
  }

   /**
   * Only for targets whose &lt;em&gt;type&lt;/em&gt; is &lt;strong&gt;CustomStreamTarget&lt;/strong&gt;. The web address that the target uses to play RTMP streams.
   * @return rtmpPlaybackUrl
  **/
  @ApiModelProperty(example = "", value = "Only for targets whose <em>type</em> is <strong>CustomStreamTarget</strong>. The web address that the target uses to play RTMP streams.")
  public String getRtmpPlaybackUrl() {
    return rtmpPlaybackUrl;
  }

  public void setRtmpPlaybackUrl(String rtmpPlaybackUrl) {
    this.rtmpPlaybackUrl = rtmpPlaybackUrl;
  }

  public StreamTarget secureIngestQueryParam(String secureIngestQueryParam) {
    this.secureIngestQueryParam = secureIngestQueryParam;
    return this;
  }

   /**
   * Only for targets whose &lt;em&gt;use_secure_ingest&lt;/em&gt; is &lt;strong&gt;true&lt;/strong&gt;. The query parameter needed for secure stream delivery between the transcoder and the target.
   * @return secureIngestQueryParam
  **/
  @ApiModelProperty(example = "", value = "Only for targets whose <em>use_secure_ingest</em> is <strong>true</strong>. The query parameter needed for secure stream delivery between the transcoder and the target.")
  public String getSecureIngestQueryParam() {
    return secureIngestQueryParam;
  }

  public void setSecureIngestQueryParam(String secureIngestQueryParam) {
    this.secureIngestQueryParam = secureIngestQueryParam;
  }

  public StreamTarget streamName(String streamName) {
    this.streamName = streamName;
    return this;
  }

   /**
   * The name of the stream being ingested into the target.
   * @return streamName
  **/
  @ApiModelProperty(example = "", value = "The name of the stream being ingested into the target.")
  public String getStreamName() {
    return streamName;
  }

  public void setStreamName(String streamName) {
    this.streamName = streamName;
  }

  public StreamTarget type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * &lt;strong&gt;WowzaStreamTarget&lt;/strong&gt; is a Wowza CDN target. &lt;strong&gt;CustomStreamTarget&lt;/strong&gt; (the default) is an external, third-party destination, and &lt;strong&gt;UltraLowLatencyStreamTarget&lt;/strong&gt; is an ultra low latency stream target. &lt;!--and &lt;strong&gt;FacebookStreamTarget&lt;/strong&gt; (a Facebook Live target).--&gt;
   * @return type
  **/
  @ApiModelProperty(example = "", value = "<strong>WowzaStreamTarget</strong> is a Wowza CDN target. <strong>CustomStreamTarget</strong> (the default) is an external, third-party destination, and <strong>UltraLowLatencyStreamTarget</strong> is an ultra low latency stream target. <!--and <strong>FacebookStreamTarget</strong> (a Facebook Live target).-->")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public StreamTarget updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time that the stream target was updated.
   * @return updatedAt
  **/
  @ApiModelProperty(example = "", value = "The date and time that the stream target was updated.")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public StreamTarget useCors(Boolean useCors) {
    this.useCors = useCors;
    return this;
  }

   /**
   * Only for targets whose &lt;em&gt;type&lt;/em&gt; is &lt;strong&gt;WowzaStreamTarget&lt;/strong&gt; and &lt;em&gt;provider&lt;/em&gt; is &lt;strong&gt;akamai_cupertino&lt;/strong&gt;. CORS, or cross-origin resource sharing, allows streams to be sent to providers such as Peer5, Viblast, and Streamroot, which implement a peer-to-peer grid delivery system.
   * @return useCors
  **/
  @ApiModelProperty(value = "Only for targets whose <em>type</em> is <strong>WowzaStreamTarget</strong> and <em>provider</em> is <strong>akamai_cupertino</strong>. CORS, or cross-origin resource sharing, allows streams to be sent to providers such as Peer5, Viblast, and Streamroot, which implement a peer-to-peer grid delivery system.")
  public Boolean isUseCors() {
    return useCors;
  }

  public void setUseCors(Boolean useCors) {
    this.useCors = useCors;
  }

  public StreamTarget useSecureIngest(Boolean useSecureIngest) {
    this.useSecureIngest = useSecureIngest;
    return this;
  }

   /**
   * Only for targets whose &lt;em&gt;type&lt;/em&gt; is &lt;strong&gt;WowzaStreamTarget&lt;/strong&gt; and &lt;em&gt;provider&lt;/em&gt; is &lt;strong&gt;akamai_cupertino&lt;/strong&gt;. If &lt;strong&gt;true&lt;/strong&gt;, generates a &lt;em&gt;secure_ingest_query_param&lt;/em&gt; to securely deliver the stream from the transcoder to the provider.
   * @return useSecureIngest
  **/
  @ApiModelProperty(value = "Only for targets whose <em>type</em> is <strong>WowzaStreamTarget</strong> and <em>provider</em> is <strong>akamai_cupertino</strong>. If <strong>true</strong>, generates a <em>secure_ingest_query_param</em> to securely deliver the stream from the transcoder to the provider.")
  public Boolean isUseSecureIngest() {
    return useSecureIngest;
  }

  public void setUseSecureIngest(Boolean useSecureIngest) {
    this.useSecureIngest = useSecureIngest;
  }

  public StreamTarget username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Only for targets whose &lt;em&gt;type&lt;/em&gt; is &lt;strong&gt;CustomStreamTarget&lt;/strong&gt; and &lt;em&gt;provider&lt;/em&gt; is &lt;em&gt;not&lt;/em&gt; **akamai_cupertino**. The username or ID that the target uses for RTMP authentication.
   * @return username
  **/
  @ApiModelProperty(example = "", value = "Only for targets whose <em>type</em> is <strong>CustomStreamTarget</strong> and <em>provider</em> is <em>not</em> **akamai_cupertino**. The username or ID that the target uses for RTMP authentication.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamTarget streamTarget = (StreamTarget) o;
    return Objects.equals(this.backupUrl, streamTarget.backupUrl) &&
        Objects.equals(this.connectionCode, streamTarget.connectionCode) &&
        Objects.equals(this.connectionCodeExpiresAt, streamTarget.connectionCodeExpiresAt) &&
        Objects.equals(this.createdAt, streamTarget.createdAt) &&
        Objects.equals(this.hdsPlaybackUrl, streamTarget.hdsPlaybackUrl) &&
        Objects.equals(this.hlsPlaybackUrl, streamTarget.hlsPlaybackUrl) &&
        Objects.equals(this.id, streamTarget.id) &&
        Objects.equals(this.location, streamTarget.location) &&
        Objects.equals(this.name, streamTarget.name) &&
        Objects.equals(this.password, streamTarget.password) &&
        Objects.equals(this.primaryUrl, streamTarget.primaryUrl) &&
        Objects.equals(this.provider, streamTarget.provider) &&
        Objects.equals(this.rtmpPlaybackUrl, streamTarget.rtmpPlaybackUrl) &&
        Objects.equals(this.secureIngestQueryParam, streamTarget.secureIngestQueryParam) &&
        Objects.equals(this.streamName, streamTarget.streamName) &&
        Objects.equals(this.type, streamTarget.type) &&
        Objects.equals(this.updatedAt, streamTarget.updatedAt) &&
        Objects.equals(this.useCors, streamTarget.useCors) &&
        Objects.equals(this.useSecureIngest, streamTarget.useSecureIngest) &&
        Objects.equals(this.username, streamTarget.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupUrl, connectionCode, connectionCodeExpiresAt, createdAt, hdsPlaybackUrl, hlsPlaybackUrl, id, location, name, password, primaryUrl, provider, rtmpPlaybackUrl, secureIngestQueryParam, streamName, type, updatedAt, useCors, useSecureIngest, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamTarget {\n");
    
    sb.append("    backupUrl: ").append(toIndentedString(backupUrl)).append("\n");
    sb.append("    connectionCode: ").append(toIndentedString(connectionCode)).append("\n");
    sb.append("    connectionCodeExpiresAt: ").append(toIndentedString(connectionCodeExpiresAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    hdsPlaybackUrl: ").append(toIndentedString(hdsPlaybackUrl)).append("\n");
    sb.append("    hlsPlaybackUrl: ").append(toIndentedString(hlsPlaybackUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    primaryUrl: ").append(toIndentedString(primaryUrl)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    rtmpPlaybackUrl: ").append(toIndentedString(rtmpPlaybackUrl)).append("\n");
    sb.append("    secureIngestQueryParam: ").append(toIndentedString(secureIngestQueryParam)).append("\n");
    sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    useCors: ").append(toIndentedString(useCors)).append("\n");
    sb.append("    useSecureIngest: ").append(toIndentedString(useSecureIngest)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

