# EventsApi

All URIs are relative to *https://api.revenium.io/meter/v1/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**saveEvent**](EventsApi.md#saveEvent) | **POST** /event | Save can API event

<a name="saveEvent"></a>
# **saveEvent**
> saveEvent(body)

Save can API event

Save an API event

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EventsApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

