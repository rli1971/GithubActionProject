# DefaultApi

All URIs are relative to *https://placeholder.rogers.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transferdataKeyGet**](DefaultApi.md#transferdataKeyGet) | **GET** /transferdata/{key} | retrieve transfer data for a given id, and deletes the data from the server.
[**transferdataKeyPost**](DefaultApi.md#transferdataKeyPost) | **POST** /transferdata/{key} | posts transfer data for a given id. Data expires after five minutes, or after a &#x60;GET&#x60; retrieves the data, whichever comes first.

<a name="transferdataKeyGet"></a>
# **transferdataKeyGet**
> TransferData transferdataKeyGet(key, callingSystem)

retrieve transfer data for a given id, and deletes the data from the server.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String key = "key_example"; // String | 
String callingSystem = "callingSystem_example"; // String | set to `engage` when calling the `GET` or `POST` methods from _Pure Engage_/_Premise_, and `cloud` when calling from _Pure Cloud_.
try {
    TransferData result = apiInstance.transferdataKeyGet(key, callingSystem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#transferdataKeyGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**|  |
 **callingSystem** | **String**| set to &#x60;engage&#x60; when calling the &#x60;GET&#x60; or &#x60;POST&#x60; methods from _Pure Engage_/_Premise_, and &#x60;cloud&#x60; when calling from _Pure Cloud_. | [enum: engage, cloud]

### Return type

[**TransferData**](TransferData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="transferdataKeyPost"></a>
# **transferdataKeyPost**
> transferdataKeyPost(callingSystem, key, body)

posts transfer data for a given id. Data expires after five minutes, or after a &#x60;GET&#x60; retrieves the data, whichever comes first.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String callingSystem = "callingSystem_example"; // String | set to `engage` when calling the `GET` or `POST` methods from _Pure Engage_/_Premise_, and `cloud` when calling from _Pure Cloud_.
String key = "key_example"; // String | 
TransferData body = new TransferData(); // TransferData | Transfer data to be saved on server
try {
    apiInstance.transferdataKeyPost(callingSystem, key, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#transferdataKeyPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callingSystem** | **String**| set to &#x60;engage&#x60; when calling the &#x60;GET&#x60; or &#x60;POST&#x60; methods from _Pure Engage_/_Premise_, and &#x60;cloud&#x60; when calling from _Pure Cloud_. | [enum: engage, cloud]
 **key** | **String**|  |
 **body** | [**TransferData**](TransferData.md)| Transfer data to be saved on server | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

