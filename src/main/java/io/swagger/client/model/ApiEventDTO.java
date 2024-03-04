/*
 * Revenium Metering API
 * Revenium Metering API
 *
 * OpenAPI spec version: 1.14.0-SNAPSHOT
 * Contact: info@revenium.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ApiEventDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-04T16:29:09.827692-05:00[America/New_York]")

public class ApiEventDTO {
  @SerializedName("requestId")
  private String requestId = null;

  /**
   * Gets or Sets eventType
   */
  @JsonAdapter(EventTypeEnum.Adapter.class)
  public enum EventTypeEnum {
    @SerializedName("REQUEST")
    REQUEST("REQUEST"),
    @SerializedName("RESPONSE")
    RESPONSE("RESPONSE");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EventTypeEnum fromValue(String input) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EventTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public EventTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return EventTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("eventType")
  private EventTypeEnum eventType = null;

  @SerializedName("assetId")
  private String assetId = null;

  @SerializedName("productKey")
  private String productKey = null;

  @SerializedName("application")
  private String application = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("currentMillis")
  private Long currentMillis = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("elapsedTime")
  private Long elapsedTime = null;

  @SerializedName("metadata")
  private String metadata = null;

  @SerializedName("responseCode")
  private Integer responseCode = null;

  @SerializedName("requestMessageSize")
  private Long requestMessageSize = null;

  @SerializedName("responseMessageSize")
  private Long responseMessageSize = null;

  @SerializedName("contentType")
  private String contentType = null;

  @SerializedName("remoteHost")
  private String remoteHost = null;

  @SerializedName("userAgent")
  private String userAgent = null;

  @SerializedName("correlationId")
  private String correlationId = null;

  @SerializedName("backendLatency")
  private Double backendLatency = null;

  @SerializedName("clientId")
  private String clientId = null;

  @SerializedName("source")
  private String source = null;

  public ApiEventDTO requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public ApiEventDTO eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @Schema(description = "")
  public EventTypeEnum getEventType() {
    return eventType;
  }

  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  public ApiEventDTO assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Get assetId
   * @return assetId
  **/
  @Schema(description = "")
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public ApiEventDTO productKey(String productKey) {
    this.productKey = productKey;
    return this;
  }

   /**
   * Get productKey
   * @return productKey
  **/
  @Schema(description = "")
  public String getProductKey() {
    return productKey;
  }

  public void setProductKey(String productKey) {
    this.productKey = productKey;
  }

  public ApiEventDTO application(String application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @Schema(description = "")
  public String getApplication() {
    return application;
  }

  public void setApplication(String application) {
    this.application = application;
  }

  public ApiEventDTO method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @Schema(description = "")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public ApiEventDTO currentMillis(Long currentMillis) {
    this.currentMillis = currentMillis;
    return this;
  }

   /**
   * Get currentMillis
   * @return currentMillis
  **/
  @Schema(description = "")
  public Long getCurrentMillis() {
    return currentMillis;
  }

  public void setCurrentMillis(Long currentMillis) {
    this.currentMillis = currentMillis;
  }

  public ApiEventDTO uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @Schema(description = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public ApiEventDTO elapsedTime(Long elapsedTime) {
    this.elapsedTime = elapsedTime;
    return this;
  }

   /**
   * Get elapsedTime
   * @return elapsedTime
  **/
  @Schema(description = "")
  public Long getElapsedTime() {
    return elapsedTime;
  }

  public void setElapsedTime(Long elapsedTime) {
    this.elapsedTime = elapsedTime;
  }

  public ApiEventDTO metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  public ApiEventDTO responseCode(Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Get responseCode
   * @return responseCode
  **/
  @Schema(required = true, description = "")
  public Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }

  public ApiEventDTO requestMessageSize(Long requestMessageSize) {
    this.requestMessageSize = requestMessageSize;
    return this;
  }

   /**
   * Get requestMessageSize
   * @return requestMessageSize
  **/
  @Schema(description = "")
  public Long getRequestMessageSize() {
    return requestMessageSize;
  }

  public void setRequestMessageSize(Long requestMessageSize) {
    this.requestMessageSize = requestMessageSize;
  }

  public ApiEventDTO responseMessageSize(Long responseMessageSize) {
    this.responseMessageSize = responseMessageSize;
    return this;
  }

   /**
   * Get responseMessageSize
   * @return responseMessageSize
  **/
  @Schema(description = "")
  public Long getResponseMessageSize() {
    return responseMessageSize;
  }

  public void setResponseMessageSize(Long responseMessageSize) {
    this.responseMessageSize = responseMessageSize;
  }

  public ApiEventDTO contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @Schema(description = "")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public ApiEventDTO remoteHost(String remoteHost) {
    this.remoteHost = remoteHost;
    return this;
  }

   /**
   * Get remoteHost
   * @return remoteHost
  **/
  @Schema(description = "")
  public String getRemoteHost() {
    return remoteHost;
  }

  public void setRemoteHost(String remoteHost) {
    this.remoteHost = remoteHost;
  }

  public ApiEventDTO userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Get userAgent
   * @return userAgent
  **/
  @Schema(description = "")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public ApiEventDTO correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

   /**
   * Get correlationId
   * @return correlationId
  **/
  @Schema(description = "")
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public ApiEventDTO backendLatency(Double backendLatency) {
    this.backendLatency = backendLatency;
    return this;
  }

   /**
   * Get backendLatency
   * @return backendLatency
  **/
  @Schema(description = "")
  public Double getBackendLatency() {
    return backendLatency;
  }

  public void setBackendLatency(Double backendLatency) {
    this.backendLatency = backendLatency;
  }

  public ApiEventDTO clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @Schema(description = "")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public ApiEventDTO source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiEventDTO apiEventDTO = (ApiEventDTO) o;
    return Objects.equals(this.requestId, apiEventDTO.requestId) &&
        Objects.equals(this.eventType, apiEventDTO.eventType) &&
        Objects.equals(this.assetId, apiEventDTO.assetId) &&
        Objects.equals(this.productKey, apiEventDTO.productKey) &&
        Objects.equals(this.application, apiEventDTO.application) &&
        Objects.equals(this.method, apiEventDTO.method) &&
        Objects.equals(this.currentMillis, apiEventDTO.currentMillis) &&
        Objects.equals(this.uri, apiEventDTO.uri) &&
        Objects.equals(this.elapsedTime, apiEventDTO.elapsedTime) &&
        Objects.equals(this.metadata, apiEventDTO.metadata) &&
        Objects.equals(this.responseCode, apiEventDTO.responseCode) &&
        Objects.equals(this.requestMessageSize, apiEventDTO.requestMessageSize) &&
        Objects.equals(this.responseMessageSize, apiEventDTO.responseMessageSize) &&
        Objects.equals(this.contentType, apiEventDTO.contentType) &&
        Objects.equals(this.remoteHost, apiEventDTO.remoteHost) &&
        Objects.equals(this.userAgent, apiEventDTO.userAgent) &&
        Objects.equals(this.correlationId, apiEventDTO.correlationId) &&
        Objects.equals(this.backendLatency, apiEventDTO.backendLatency) &&
        Objects.equals(this.clientId, apiEventDTO.clientId) &&
        Objects.equals(this.source, apiEventDTO.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, eventType, assetId, productKey, application, method, currentMillis, uri, elapsedTime, metadata, responseCode, requestMessageSize, responseMessageSize, contentType, remoteHost, userAgent, correlationId, backendLatency, clientId, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiEventDTO {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    productKey: ").append(toIndentedString(productKey)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    currentMillis: ").append(toIndentedString(currentMillis)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    requestMessageSize: ").append(toIndentedString(requestMessageSize)).append("\n");
    sb.append("    responseMessageSize: ").append(toIndentedString(responseMessageSize)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    remoteHost: ").append(toIndentedString(remoteHost)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    backendLatency: ").append(toIndentedString(backendLatency)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
