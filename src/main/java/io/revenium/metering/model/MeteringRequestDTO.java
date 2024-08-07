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

package io.revenium.metering.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.revenium.metering.model.ElementDTO;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.processing.Generated;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * MeteringRequestDTO
 */

@Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-05-04T15:08:15.360966-04:00[America/New_York]")

public class MeteringRequestDTO {
  @SerializedName("api")
  private String api = null;

  @SerializedName("productKey")
  private String subscription = null;

  @SerializedName("application")
  private String subscriberCredentials = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("metadata")
  private String metadata = null;

  @SerializedName("backendLatency")
  private Double backendLatency = null;

  @SerializedName("gatewayLatency")
  private Double gatewayLatency = null;

  @SerializedName("responseCode")
  private Integer responseCode = null;

  @SerializedName("timedOut")
  private Boolean timedOut = null;

  @SerializedName("requestMessageSize")
  private Long requestMessageSize = null;

  @SerializedName("responseMessageSize")
  private Long responseMessageSize = null;

  @SerializedName("requestHeaders")
  private List<String> requestHeaders = new ArrayList<String>();

  @SerializedName("responseHeaders")
  private List<String> responseHeaders = new ArrayList<String>();

  @SerializedName("userAgent")
  private String userAgent = null;

  @SerializedName("remoteUser")
  private String remoteUser = null;

  @SerializedName("remoteHost")
  private String remoteHost = null;

  @SerializedName("httpProtocol")
  private String httpProtocol = null;

  @SerializedName("contentType")
  private String contentType = null;

  @SerializedName("correlationId")
  private String correlationId = null;

  @SerializedName("platformAPIKey")
  private String platformAPIKey = null;

  @SerializedName("elements")
  private List<ElementDTO> elements = new ArrayList<ElementDTO>();

  @SerializedName("source")
  private String source = null;

  public MeteringRequestDTO api(String api) {
    this.api = api;
    return this;
  }

   /**
   * Get api
   * @return api
  **/
  @Schema(example = "3c2c3d64-2f59-4642-9406-17d7fb5e2d5c", description = "")
  public String getApi() {
    return api;
  }

  public void setApi(String api) {
    this.api = api;
  }

  public MeteringRequestDTO subscription(String subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * The Product Key ID
   * @return productKey
  **/
  @Schema(example = "53546bb0-9014-11eb-a8b3-0242ac130003", description = "The Product Key ID")
  public String getProductKey() {
    return subscription;
  }

  public void setProductKey(String productKey) {
    this.subscription = productKey;
  }

  public MeteringRequestDTO subscriberCredentials(String subscriberCredentials) {
    this.subscriberCredentials = subscriberCredentials;
    return this;
  }

   /**
   * The Application ID
   * @return application
  **/
  @Schema(example = "53546bb0-9014-11eb-a8b3-0242ac130003", description = "The Application ID")
  public String getApplication() {
    return subscriberCredentials;
  }

  public void setApplication(String application) {
    this.subscriberCredentials = application;
  }

  public MeteringRequestDTO method(String method) {
    this.method = method;
    return this;
  }

   /**
   * The HTTP method being invoked
   * @return method
  **/
  @Schema(example = "GET", required = true, description = "The HTTP method being invoked")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public MeteringRequestDTO url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The HTTP URL being invoked
   * @return url
  **/
  @Schema(example = "https://api.foo.com/v1/api", description = "The HTTP URL being invoked")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public MeteringRequestDTO metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Additional billing metadata (supports numeric values and comma-seperated key-value pairs)
   * @return metadata
  **/
  @Schema(example = "5.0", description = "Additional billing metadata (supports numeric values and comma-seperated key-value pairs)")
  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  public MeteringRequestDTO backendLatency(Double backendLatency) {
    this.backendLatency = backendLatency;
    return this;
  }

   /**
   * Backend API response time
   * @return backendLatency
  **/
  @Schema(example = "0.05", description = "Backend API response time")
  public Double getBackendLatency() {
    return backendLatency;
  }

  public void setBackendLatency(Double backendLatency) {
    this.backendLatency = backendLatency;
  }

  public MeteringRequestDTO gatewayLatency(Double gatewayLatency) {
    this.gatewayLatency = gatewayLatency;
    return this;
  }

   /**
   * Latency introduced by the API GW
   * @return gatewayLatency
  **/
  @Schema(example = "0.05", description = "Latency introduced by the API GW")
  public Double getGatewayLatency() {
    return gatewayLatency;
  }

  public void setGatewayLatency(Double gatewayLatency) {
    this.gatewayLatency = gatewayLatency;
  }

  public MeteringRequestDTO responseCode(Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Backend HTTP response code
   * @return responseCode
  **/
  @Schema(example = "200", required = true, description = "Backend HTTP response code")
  public Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }

  public MeteringRequestDTO timedOut(Boolean timedOut) {
    this.timedOut = timedOut;
    return this;
  }

   /**
   * Whether or not the backend timed out
   * @return timedOut
  **/
  @Schema(example = "false", description = "Whether or not the backend timed out")
  public Boolean isTimedOut() {
    return timedOut;
  }

  public void setTimedOut(Boolean timedOut) {
    this.timedOut = timedOut;
  }

  public MeteringRequestDTO requestMessageSize(Long requestMessageSize) {
    this.requestMessageSize = requestMessageSize;
    return this;
  }

   /**
   * The size of the API request in bytes
   * @return requestMessageSize
  **/
  @Schema(example = "10000", description = "The size of the API request in bytes")
  public Long getRequestMessageSize() {
    return requestMessageSize;
  }

  public void setRequestMessageSize(Long requestMessageSize) {
    this.requestMessageSize = requestMessageSize;
  }

  public MeteringRequestDTO responseMessageSize(Long responseMessageSize) {
    this.responseMessageSize = responseMessageSize;
    return this;
  }

   /**
   * The size of the API response in bytes
   * @return responseMessageSize
  **/
  @Schema(example = "10000", description = "The size of the API response in bytes")
  public Long getResponseMessageSize() {
    return responseMessageSize;
  }

  public void setResponseMessageSize(Long responseMessageSize) {
    this.responseMessageSize = responseMessageSize;
  }

  public MeteringRequestDTO requestHeaders(List<String> requestHeaders) {
    this.requestHeaders = requestHeaders;
    return this;
  }

  public MeteringRequestDTO addRequestHeadersItem(String requestHeadersItem) {
    this.requestHeaders.add(requestHeadersItem);
    return this;
  }

   /**
   * The comma seperated list of names of the headers in the request
   * @return requestHeaders
  **/
  @Schema(example = "10000", required = true, description = "The comma seperated list of names of the headers in the request")
  public List<String> getRequestHeaders() {
    return requestHeaders;
  }

  public void setRequestHeaders(List<String> requestHeaders) {
    this.requestHeaders = requestHeaders;
  }

  public MeteringRequestDTO responseHeaders(List<String> responseHeaders) {
    this.responseHeaders = responseHeaders;
    return this;
  }

  public MeteringRequestDTO addResponseHeadersItem(String responseHeadersItem) {
    this.responseHeaders.add(responseHeadersItem);
    return this;
  }

   /**
   * The comma seperated list of names of the headers in the response
   * @return responseHeaders
  **/
  @Schema(example = "10000", required = true, description = "The comma seperated list of names of the headers in the response")
  public List<String> getResponseHeaders() {
    return responseHeaders;
  }

  public void setResponseHeaders(List<String> responseHeaders) {
    this.responseHeaders = responseHeaders;
  }

  public MeteringRequestDTO userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * The HTTP User Agent
   * @return userAgent
  **/
  @Schema(example = "10000", description = "The HTTP User Agent")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public MeteringRequestDTO remoteUser(String remoteUser) {
    this.remoteUser = remoteUser;
    return this;
  }

   /**
   * The Remote User
   * @return remoteUser
  **/
  @Schema(example = "apiclient", description = "The Remote User")
  public String getRemoteUser() {
    return remoteUser;
  }

  public void setRemoteUser(String remoteUser) {
    this.remoteUser = remoteUser;
  }

  public MeteringRequestDTO remoteHost(String remoteHost) {
    this.remoteHost = remoteHost;
    return this;
  }

   /**
   * The Remote Host
   * @return remoteHost
  **/
  @Schema(example = "api.acmesoft.com", description = "The Remote Host")
  public String getRemoteHost() {
    return remoteHost;
  }

  public void setRemoteHost(String remoteHost) {
    this.remoteHost = remoteHost;
  }

  public MeteringRequestDTO httpProtocol(String httpProtocol) {
    this.httpProtocol = httpProtocol;
    return this;
  }

   /**
   * The HTTP Protocol
   * @return httpProtocol
  **/
  @Schema(example = "HTTP/1.0", description = "The HTTP Protocol")
  public String getHttpProtocol() {
    return httpProtocol;
  }

  public void setHttpProtocol(String httpProtocol) {
    this.httpProtocol = httpProtocol;
  }

  public MeteringRequestDTO contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * The Content Type
   * @return contentType
  **/
  @Schema(example = "application/json", description = "The Content Type")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public MeteringRequestDTO correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

   /**
   * The Correlation ID
   * @return correlationId
  **/
  @Schema(example = "e6e62ba0-94c1-466c-8921-52f9d6b84066", description = "The Correlation ID")
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public MeteringRequestDTO platformAPIKey(String platformAPIKey) {
    this.platformAPIKey = platformAPIKey;
    return this;
  }

   /**
   * platformAPIKey
   * @return platformAPIKey
  **/
  @Schema(example = "hak-1234-20a033c6fbcb453ba9c797971c237080", required = true, description = "platformAPIKey")
  public String getPlatformAPIKey() {
    return platformAPIKey;
  }

  public void setPlatformAPIKey(String platformAPIKey) {
    this.platformAPIKey = platformAPIKey;
  }

  public MeteringRequestDTO elements(List<ElementDTO> elements) {
    this.elements = elements;
    return this;
  }

  public MeteringRequestDTO addElementsItem(ElementDTO elementsItem) {
    this.elements.add(elementsItem);
    return this;
  }

   /**
   * Dynamic metering elements
   * @return elements
  **/
  @Schema(required = true, description = "Dynamic metering elements")
  public List<ElementDTO> getElements() {
    return elements;
  }

  public void setElements(List<ElementDTO> elements) {
    this.elements = elements;
  }

  public MeteringRequestDTO source(String source) {
    this.source = source;
    return this;
  }

   /**
   * the source of the event
   * @return source
  **/
  @Schema(example = "KONG", description = "the source of the event")
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
    MeteringRequestDTO meteringRequestDTO = (MeteringRequestDTO) o;
    return Objects.equals(this.api, meteringRequestDTO.api) &&
        Objects.equals(this.subscription, meteringRequestDTO.subscription) &&
        Objects.equals(this.subscriberCredentials, meteringRequestDTO.subscriberCredentials) &&
        Objects.equals(this.method, meteringRequestDTO.method) &&
        Objects.equals(this.url, meteringRequestDTO.url) &&
        Objects.equals(this.metadata, meteringRequestDTO.metadata) &&
        Objects.equals(this.backendLatency, meteringRequestDTO.backendLatency) &&
        Objects.equals(this.gatewayLatency, meteringRequestDTO.gatewayLatency) &&
        Objects.equals(this.responseCode, meteringRequestDTO.responseCode) &&
        Objects.equals(this.timedOut, meteringRequestDTO.timedOut) &&
        Objects.equals(this.requestMessageSize, meteringRequestDTO.requestMessageSize) &&
        Objects.equals(this.responseMessageSize, meteringRequestDTO.responseMessageSize) &&
        Objects.equals(this.requestHeaders, meteringRequestDTO.requestHeaders) &&
        Objects.equals(this.responseHeaders, meteringRequestDTO.responseHeaders) &&
        Objects.equals(this.userAgent, meteringRequestDTO.userAgent) &&
        Objects.equals(this.remoteUser, meteringRequestDTO.remoteUser) &&
        Objects.equals(this.remoteHost, meteringRequestDTO.remoteHost) &&
        Objects.equals(this.httpProtocol, meteringRequestDTO.httpProtocol) &&
        Objects.equals(this.contentType, meteringRequestDTO.contentType) &&
        Objects.equals(this.correlationId, meteringRequestDTO.correlationId) &&
        Objects.equals(this.platformAPIKey, meteringRequestDTO.platformAPIKey) &&
        Objects.equals(this.elements, meteringRequestDTO.elements) &&
        Objects.equals(this.source, meteringRequestDTO.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(api, subscription, subscriberCredentials, method, url, metadata, backendLatency, gatewayLatency, responseCode, timedOut, requestMessageSize, responseMessageSize, requestHeaders, responseHeaders, userAgent, remoteUser, remoteHost, httpProtocol, contentType, correlationId, platformAPIKey, elements, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeteringRequestDTO {\n");
    
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    subscriberCredentials: ").append(toIndentedString(subscriberCredentials)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    backendLatency: ").append(toIndentedString(backendLatency)).append("\n");
    sb.append("    gatewayLatency: ").append(toIndentedString(gatewayLatency)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    timedOut: ").append(toIndentedString(timedOut)).append("\n");
    sb.append("    requestMessageSize: ").append(toIndentedString(requestMessageSize)).append("\n");
    sb.append("    responseMessageSize: ").append(toIndentedString(responseMessageSize)).append("\n");
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
    sb.append("    responseHeaders: ").append(toIndentedString(responseHeaders)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    remoteUser: ").append(toIndentedString(remoteUser)).append("\n");
    sb.append("    remoteHost: ").append(toIndentedString(remoteHost)).append("\n");
    sb.append("    httpProtocol: ").append(toIndentedString(httpProtocol)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    platformAPIKey: ").append(toIndentedString(platformAPIKey)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
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
