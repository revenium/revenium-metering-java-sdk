# MetringApi

All URIs are relative to *https://api.revenium.io/meter/v1/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**meter**](MetringApi.md#meter) | **POST** /meter | Insert API metering data
[**valid**](MetringApi.md#valid) | **GET** /meter/product-key | Determine if a ProductKey is valid or not

<a name="meter"></a>
# **meter**
> Unit meter(body)

Insert API metering data

Insert API metering data

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MetringApi;


MetringApi apiInstance = new MetringApi();
MeteringRequestDTO body = new MeteringRequestDTO(); // MeteringRequestDTO | 
try {
    Unit result = apiInstance.meter(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetringApi#meter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MeteringRequestDTO**](MeteringRequestDTO.md)|  |

### Return type

[**Unit**](Unit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="valid"></a>
# **valid**
> Object valid(productKey, application)

Determine if a ProductKey is valid or not

Determine if a ProductKey is valid or not

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MetringApi;


MetringApi apiInstance = new MetringApi();
String productKey = "productKey_example"; // String | The product key
String application = "application_example"; // String | The application ID
try {
    Object result = apiInstance.valid(productKey, application);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetringApi#valid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productKey** | **String**| The product key | [optional]
 **application** | **String**| The application ID | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

