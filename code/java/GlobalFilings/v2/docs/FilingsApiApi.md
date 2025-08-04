# FilingsApiApi

All URIs are relative to *https://api.factset.com/content/global-filings/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCount**](FilingsApiApi.md#getCount) | **GET** /count | Returns the count of filings for specified source.
[**getFilings**](FilingsApiApi.md#getFilings) | **GET** /search | Returns the filings documents and related metadata within FactSet coverage.



## getCount

> CountResponse getCount(ids, sources, startDate, endDate, timeZone, categories, primaryId, searchText, formTypes)

Returns the count of filings for specified source.

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
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID
        java.util.List<String> sources = Arrays.asList(); // java.util.List<String> | Code for document source to include.This is a comma-separated list. Use the `/meta/sources` endpoint to get the list of available sources.  
        String startDate = "20240601"; // String | Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). 
        String endDate = "20241101"; // String | End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).
        String timeZone = "America/New_York"; // String | timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry.
        java.util.List<String> categories = Arrays.asList(); // java.util.List<String> | Code for categories to include.  This is a comma-separated list. Use the `/meta/categories` endpoint to get the list of available categories.  Default = All categories.
        Boolean primaryId = true; // Boolean | Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier.
        String searchText = "Officer"; // String | Restricts the search to include only document stories that include the searched text. This parameter supports boolean operators as well.
        java.util.List<String> formTypes = Arrays.asList(); // java.util.List<String> | The search to include any form types of given sources
        try {
            CountResponse result = apiInstance.getCount(ids, sources, startDate, endDate, timeZone, categories, primaryId, searchText, formTypes);
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
 **ids** | **List&lt;String&gt;**| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID |
 **sources** | **List&lt;String&gt;**| Code for document source to include.This is a comma-separated list. Use the &#x60;/meta/sources&#x60; endpoint to get the list of available sources.   |
 **startDate** | **String**| Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  | [optional]
 **endDate** | **String**| End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional]
 **timeZone** | **String**| timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. | [optional] [default to America/New_York]
 **categories** | **List&lt;String&gt;**| Code for categories to include.  This is a comma-separated list. Use the &#x60;/meta/categories&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. | [optional]
 **primaryId** | **Boolean**| Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. | [optional] [default to false] [enum: true, false]
 **searchText** | **String**| Restricts the search to include only document stories that include the searched text. This parameter supports boolean operators as well. | [optional]
 **formTypes** | **List&lt;String&gt;**| The search to include any form types of given sources | [optional]

### Return type

[**CountResponse**](CountResponse.md)

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

> SearchResponse getFilings(ids, sources, startDate, endDate, paginationLimit, paginationOffset, timeZone, sort, categories, primaryId, searchText, formTypes, edgarAccession)

Returns the filings documents and related metadata within FactSet coverage.

Returns the filings documents within FactSet coverage along with other response fields.

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
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID
        java.util.List<String> sources = Arrays.asList(); // java.util.List<String> | 
        String startDate = "20240601"; // String | Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). 
        String endDate = "20241101"; // String | End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).
        Integer paginationLimit = 25; // Integer | Number of results to return per page.
        Integer paginationOffset = 0; // Integer | Page number of the results to return. 
        String timeZone = "America/New_York"; // String | timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry.
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Enables sorting data in ascending or descending  order based on filingsDateTime.   * `filingsDateTime` - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.   *  `-filingsDateTime` - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn't used in the query.
        java.util.List<String> categories = Arrays.asList(); // java.util.List<String> | Code for categories to include.  This is a comma-separated list. Use the `/meta/categories` endpoint to get the list of available categories.  Default = All categories.
        Boolean primaryId = true; // Boolean | Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier.
        String searchText = "Officer"; // String | Restricts the search to include only document stories that include the searched text. This parameter supports boolean operators as well.
        java.util.List<String> formTypes = Arrays.asList(); // java.util.List<String> | The search to include any form types of given sources
        String edgarAccession = "edgarAccession_example"; // String | A unique identifier given to each EDGAR filings document. e.g. accession=0001013237-21-000069&sources=EDG.   > **Note:**  > When used in conjunction with the 'sources' parameter set to 'EDGAR, the API considers this accession for data retrieval.  > For non-EDGAR sources, this parameter is ignored.
        try {
            SearchResponse result = apiInstance.getFilings(ids, sources, startDate, endDate, paginationLimit, paginationOffset, timeZone, sort, categories, primaryId, searchText, formTypes, edgarAccession);
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
 **ids** | **List&lt;String&gt;**| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID |
 **sources** | **List&lt;String&gt;**|  |
 **startDate** | **String**| Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  | [optional]
 **endDate** | **String**| End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional]
 **paginationLimit** | **Integer**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **Integer**| Page number of the results to return.  | [optional] [default to 0]
 **timeZone** | **String**| timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. | [optional] [default to America/New_York]
 **sort** | **List&lt;String&gt;**| Enables sorting data in ascending or descending  order based on filingsDateTime.   * &#x60;filingsDateTime&#x60; - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.   *  &#x60;-filingsDateTime&#x60; - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn&#39;t used in the query. | [optional] [enum: filingsDateTime, -filingsDateTime]
 **categories** | **List&lt;String&gt;**| Code for categories to include.  This is a comma-separated list. Use the &#x60;/meta/categories&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. | [optional]
 **primaryId** | **Boolean**| Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. | [optional] [default to false] [enum: true, false]
 **searchText** | **String**| Restricts the search to include only document stories that include the searched text. This parameter supports boolean operators as well. | [optional]
 **formTypes** | **List&lt;String&gt;**| The search to include any form types of given sources | [optional]
 **edgarAccession** | **String**| A unique identifier given to each EDGAR filings document. e.g. accession&#x3D;0001013237-21-000069&amp;sources&#x3D;EDG.   &gt; **Note:**  &gt; When used in conjunction with the &#39;sources&#39; parameter set to &#39;EDGAR, the API considers this accession for data retrieval.  &gt; For non-EDGAR sources, this parameter is ignored. | [optional]

### Return type

[**SearchResponse**](SearchResponse.md)

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

