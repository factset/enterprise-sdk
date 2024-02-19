# FilingsApiApi

All URIs are relative to *https://api.factset.com/global-filings/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCount**](FilingsApiApi.md#getCount) | **GET** /count | Returns the count of filings for specified source
[**getFilings**](FilingsApiApi.md#getFilings) | **GET** /search | Returns the filings documents and related metadata within FactSet coverage.
[**getHelper**](FilingsApiApi.md#getHelper) | **GET** /helper | Returns the static values for various parameters



## getCount

> ResponseCount getCount(report, sources, startDate, endDate, ids)

Returns the count of filings for specified source

Returns the count of filings documents along with other response fields.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.GlobalFilings.ApiClient;
import com.factset.sdk.GlobalFilings.ApiException;
import com.factset.sdk.GlobalFilings.Configuration;
import com.factset.sdk.GlobalFilings.auth.*;
import com.factset.sdk.GlobalFilings.models.*;
import com.factset.sdk.GlobalFilings.api.FilingsApiApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        FilingsApiApi apiInstance = new FilingsApiApi(defaultClient);
        String report = "count"; // String | retrives count of source.
        java.util.List<String> sources = Arrays.asList(); // java.util.List<String> | Code for document source to include.This is a comma-separated list. Use the ```/helper``` endpoint to get the list of available sources.  
        String startDate = "0"; // String | Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).
        String endDate = "0"; // String | End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL.
        try {
            ResponseCount result = apiInstance.getCount(report, sources, startDate, endDate, ids);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FilingsApiApi#getCount");
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
 **report** | **String**| retrives count of source. | [enum: count]
 **sources** | **List&lt;String&gt;**| Code for document source to include.This is a comma-separated list. Use the &#x60;&#x60;&#x60;/helper&#x60;&#x60;&#x60; endpoint to get the list of available sources.   |
 **startDate** | **String**| Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional] [default to 0]
 **endDate** | **String**| End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional] [default to 0]
 **ids** | **List&lt;String&gt;**| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. | [optional]

### Return type

[**ResponseCount**](ResponseCount.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getFilings

> InvestmentResearch getFilings(sources, ids, startDate, endDate, paginationLimit, paginationOffset, timezone, sort, categories, primaryId, searchText, formType, accession)

Returns the filings documents and related metadata within FactSet coverage.

Returns the filings documents within FactSet coverage along with other response fields

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.GlobalFilings.ApiClient;
import com.factset.sdk.GlobalFilings.ApiException;
import com.factset.sdk.GlobalFilings.Configuration;
import com.factset.sdk.GlobalFilings.auth.*;
import com.factset.sdk.GlobalFilings.models.*;
import com.factset.sdk.GlobalFilings.api.FilingsApiApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        FilingsApiApi apiInstance = new FilingsApiApi(defaultClient);
        java.util.List<String> sources = Arrays.asList(); // java.util.List<String> | Code for document source to include.  This is a comma-separated list. Use the ```/helper``` endpoint to get the list of available sources.
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL.
        String startDate = "0"; // String | Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).
        String endDate = "0"; // String | End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).
        Integer paginationLimit = 25; // Integer | Number of results to return per page.
        Integer paginationOffset = 56; // Integer | Page number of the results to return.
        String timezone = "America/New_York"; // String | Time zone to return story dates and times. Time zones are in POSIX format and automatically adjusted for daylight savings.
        String sort = "asc"; // String | Sorting the results in chronological (oldest to newest) or reverse chronological (newest to oldest) order.    *  desc - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn’t used in the query       *   asc - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation. 
        java.util.List<String> categories = Arrays.asList(); // java.util.List<String> | Code for categories to include.  This is a comma-separated list. Use the ```/helper``` endpoint to get the list of available categories.  Default = All categories.
        String primaryId = "Y"; // String | Type of identifier search * Y - Returns headlines of stories that have the search ID(s) as the Primary ID. * N - Returns headlines of stories that mention/refer to the ID(s).
        String searchText = "Updates"; // String | Restricts the search to include only document stories which include the text searched.
        String formType = "formType_example"; // String | Restricts the search to include any form types of EDGAR.
        String accession = "accession_example"; // String | A unique identifier given to each EDGAR filings document. e.g. accession=0001013237-21-000069&sources=EDG
        try {
            InvestmentResearch result = apiInstance.getFilings(sources, ids, startDate, endDate, paginationLimit, paginationOffset, timezone, sort, categories, primaryId, searchText, formType, accession);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FilingsApiApi#getFilings");
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
 **sources** | **List&lt;String&gt;**| Code for document source to include.  This is a comma-separated list. Use the &#x60;&#x60;&#x60;/helper&#x60;&#x60;&#x60; endpoint to get the list of available sources. |
 **ids** | **List&lt;String&gt;**| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. | [optional]
 **startDate** | **String**| Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional] [default to 0]
 **endDate** | **String**| End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional] [default to 0]
 **paginationLimit** | **Integer**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **Integer**| Page number of the results to return. | [optional]
 **timezone** | **String**| Time zone to return story dates and times. Time zones are in POSIX format and automatically adjusted for daylight savings. | [optional] [default to America/New_York]
 **sort** | **String**| Sorting the results in chronological (oldest to newest) or reverse chronological (newest to oldest) order.    *  desc - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn’t used in the query       *   asc - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.  | [optional] [default to desc] [enum: asc, desc]
 **categories** | **List&lt;String&gt;**| Code for categories to include.  This is a comma-separated list. Use the &#x60;&#x60;&#x60;/helper&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. | [optional]
 **primaryId** | **String**| Type of identifier search * Y - Returns headlines of stories that have the search ID(s) as the Primary ID. * N - Returns headlines of stories that mention/refer to the ID(s). | [optional] [default to N] [enum: Y, N]
 **searchText** | **String**| Restricts the search to include only document stories which include the text searched. | [optional]
 **formType** | **String**| Restricts the search to include any form types of EDGAR. | [optional]
 **accession** | **String**| A unique identifier given to each EDGAR filings document. e.g. accession&#x3D;0001013237-21-000069&amp;sources&#x3D;EDG | [optional]

### Return type

[**InvestmentResearch**](InvestmentResearch.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of downloadable URLs consisting of Filings documents with related metadata. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getHelper

> ResponseHelper getHelper(fields)

Returns the static values for various parameters

Returns the static values for sources,formTypes,timeZones,categories based on the specified parameter

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.GlobalFilings.ApiClient;
import com.factset.sdk.GlobalFilings.ApiException;
import com.factset.sdk.GlobalFilings.Configuration;
import com.factset.sdk.GlobalFilings.auth.*;
import com.factset.sdk.GlobalFilings.models.*;
import com.factset.sdk.GlobalFilings.api.FilingsApiApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        FilingsApiApi apiInstance = new FilingsApiApi(defaultClient);
        String fields = "sources"; // String | Request data for given field.
        try {
            ResponseHelper result = apiInstance.getHelper(fields);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FilingsApiApi#getHelper");
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
 **fields** | **String**| Request data for given field. | [optional] [enum: sources, formTypes, timeZones, categories]

### Return type

[**ResponseHelper**](ResponseHelper.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

