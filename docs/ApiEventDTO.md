# ApiEventDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** |  |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  [optional]
**assetId** | **String** |  |  [optional]
**productKey** | **String** |  |  [optional]
**application** | **String** |  |  [optional]
**method** | **String** |  |  [optional]
**currentMillis** | **Long** |  |  [optional]
**uri** | **String** |  |  [optional]
**elapsedTime** | **Long** |  |  [optional]
**metadata** | **String** |  |  [optional]
**responseCode** | **Integer** |  | 
**requestMessageSize** | **Long** |  |  [optional]
**responseMessageSize** | **Long** |  |  [optional]
**contentType** | **String** |  |  [optional]
**remoteHost** | **String** |  |  [optional]
**userAgent** | **String** |  |  [optional]
**correlationId** | **String** |  |  [optional]
**backendLatency** | **Double** |  |  [optional]
**clientId** | **String** |  |  [optional]
**source** | **String** |  |  [optional]

<a name="EventTypeEnum"></a>
## Enum: EventTypeEnum
Name | Value
---- | -----
REQUEST | &quot;REQUEST&quot;
RESPONSE | &quot;RESPONSE&quot;
