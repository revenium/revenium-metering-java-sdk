# EventsApi

All URIs are relative to *https://api.revenium.io/meter/v1/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**saveEvent**](EventsApi.md#saveEvent) | **POST** /event | Save an API event

<a name="saveEvent"></a>
# **saveEvent**
> saveEvent(body)

Save an API event

Save an API event

### Example
```java
// Import classes:
//import io.revenium.metering.invoker.ApiClient;
//import io.revenium.metering.invoker.ApiException;
//import io.revenium.metering.invoker.Configuration;
//import io.revenium.metering.invoker.auth.*;
//import io.revenium.metering.api.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x-api-key
ApiKeyAuth x-api-key = (ApiKeyAuth) defaultClient.getAuthentication("x-api-key");
x-api-key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x-api-key.setApiKeyPrefix("Token");

EventsApi apiInstance = new EventsApi();
ApiEventDTO body = new ApiEventDTO(); // ApiEventDTO | 
try {
    apiInstance.saveEvent(body);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#saveEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApiEventDTO**](ApiEventDTO.md)|  |

### Return type

null (empty response body)

### Authorization

[x-api-key](../README.md#x-api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

