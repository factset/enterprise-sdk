# JobHistoryApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPeopleJobs**](JobHistoryApi.md#getPeopleJobs) | **GET** /factset-people/v1/jobs | Returns the Job history of the person.
[**getPeopleJobsForList**](JobHistoryApi.md#getPeopleJobsForList) | **POST** /factset-people/v1/jobs | Returns the Job history for the large list of people.



## getPeopleJobs

> PeopleJobsResponse getPeopleJobs(ids, status, level, type)

Returns the Job history of the person.

Returns the `Job` history of the person referenced by the entityId specified in the request.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetPeople.ApiClient;
import com.factset.sdk.FactSetPeople.ApiException;
import com.factset.sdk.FactSetPeople.Configuration;
import com.factset.sdk.FactSetPeople.auth.*;
import com.factset.sdk.FactSetPeople.model.*;
import com.factset.sdk.FactSetPeople.api.JobHistoryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.factset.com/content");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        JobHistoryApi apiInstance = new JobHistoryApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | List of FactSet Person Entity identifier.
        String status = "ALL"; // String | Select only Jobs with a certain status primary, active, or inactive.
        String level = "SUMMARY"; // String | Select the level of detail only main Jobs or include other Jobs at a company.
        String type = "ALL"; // String | Select only Jobs of a certain type board member or employee.
        try {
            PeopleJobsResponse result = apiInstance.getPeopleJobs(ids, status, level, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobHistoryApi#getPeopleJobs");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **List&lt;String&gt;**| List of FactSet Person Entity identifier. |
 **status** | **String**| Select only Jobs with a certain status primary, active, or inactive. | [optional] [default to ALL] [enum: ALL, PRIMARY, ACTIVE, INACTIVE]
 **level** | **String**| Select the level of detail only main Jobs or include other Jobs at a company. | [optional] [default to DETAIL] [enum: SUMMARY, DETAIL]
 **type** | **String**| Select only Jobs of a certain type board member or employee. | [optional] [default to ALL] [enum: ALL, BRD, EMP]

### Return type

[**PeopleJobsResponse**](PeopleJobsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Job objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getPeopleJobsForList

> PeopleJobsResponse getPeopleJobsForList(peopleJobsRequest)

Returns the Job history for the large list of people.

Returns the `Job` history of the person referenced by the entityId specified in the request.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetPeople.ApiClient;
import com.factset.sdk.FactSetPeople.ApiException;
import com.factset.sdk.FactSetPeople.Configuration;
import com.factset.sdk.FactSetPeople.auth.*;
import com.factset.sdk.FactSetPeople.model.*;
import com.factset.sdk.FactSetPeople.api.JobHistoryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.factset.com/content");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        JobHistoryApi apiInstance = new JobHistoryApi(defaultClient);
        PeopleJobsRequest peopleJobsRequest = new PeopleJobsRequest(); // PeopleJobsRequest | 
        try {
            PeopleJobsResponse result = apiInstance.getPeopleJobsForList(peopleJobsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobHistoryApi#getPeopleJobsForList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **peopleJobsRequest** | [**PeopleJobsRequest**](PeopleJobsRequest.md)|  |

### Return type

[**PeopleJobsResponse**](PeopleJobsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Job objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

