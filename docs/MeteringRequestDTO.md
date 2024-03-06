# MeteringRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**api** | **String** | URL of API |  [optional]
**productKey** | **String** | The Product Key ID |  [optional]
**application** | **String** | The Application ID |  [optional]
**method** | **String** | The HTTP method being invoked | 
**url** | **String** | The HTTP URL being invoked |  [optional]
**metadata** | **String** | Additional billing metadata (supports numeric values and comma-seperated key-value pairs) |  [optional]
**backendLatency** | **Double** | Backend API response time |  [optional]
**gatewayLatency** | **Double** | Latency introduced by the API GW |  [optional]
**responseCode** | **Integer** | Backend HTTP response code | 
**timedOut** | **Boolean** | Whether or not the backend timed out |  [optional]
**requestMessageSize** | **Long** | The size of the API request in bytes |  [optional]
**responseMessageSize** | **Long** | The size of the API response in bytes |  [optional]
**requestHeaders** | **List&lt;String&gt;** | The comma seperated list of names of the headers in the request  | [can be an empty list]
**responseHeaders** | **List&lt;String&gt;** | The comma seperated list of names of the headers in the response | [can be an empty list]
**userAgent** | **String** | The HTTP User Agent |  [optional]
**remoteUser** | **String** | The Remote User |  [optional]
**remoteHost** | **String** | The Remote Host |  [optional]
**httpProtocol** | **String** | The HTTP Protocol |  [optional]
**contentType** | **String** | The Content Type |  [optional]
**correlationId** | **String** | The Correlation ID |  [optional]
**platformAPIKey** | **String** | platformAPIKey | 
**elements** | [**List&lt;ElementDTO&gt;**](ElementDTO.md) | Dynamic metering elements | 
**source** | **String** | the source of the event |  [optional]
