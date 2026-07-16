# EntityApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRbicsEntityFocus**](EntityApi.md#getRbicsEntityFocus) | **GET** /factset-rbics/v1/entity-focus | Get RBICS classification for the Focus industry
[**getRbicsEntityFocusForList**](EntityApi.md#getRbicsEntityFocusForList) | **POST** /factset-rbics/v1/entity-focus | Get RBICS classification for the Focus industry
[**getRbicsEntityRevenue**](EntityApi.md#getRbicsEntityRevenue) | **GET** /factset-rbics/v1/entity/revenue | Get a company&#39;s revenue breakdown by RBICS classification.
[**getRbicsEntityRevenueForList**](EntityApi.md#getRbicsEntityRevenueForList) | **POST** /factset-rbics/v1/entity/revenue | Get a company&#39;s revenue breakdown by RBICS classification.



## getRbicsEntityFocus

> EntityFocusResponse getRbicsEntityFocus(ids, date, levels, includeNames)

Get RBICS classification for the Focus industry

Gets RBICS classifications for the Focus industry for a short list of companies. Full history is included if _date_ parameter is not specified.

  RBICS Focus offers a single-sector mapping of about 48,000 of the most liquid and publicly-traded companies based on their primary lines of business; it uses revenues as the key factor in determining a company’s primary line of business, by mapping a company to the lowest-level sector from which it derives 50% or more of its revenues.

  The RBICS Extended Universe – Industry Group is not currently supported through the RBICS API.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetRBICS.ApiClient;
import com.factset.sdk.FactSetRBICS.ApiException;
import com.factset.sdk.FactSetRBICS.Configuration;
import com.factset.sdk.FactSetRBICS.auth.*;
import com.factset.sdk.FactSetRBICS.models.*;
import com.factset.sdk.FactSetRBICS.api.EntityApi;

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

        EntityApi apiInstance = new EntityApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | List of Company identifiers. Accepted identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.<p>**ids limit = 2500 per request**</p>    Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p> 
        String date = "2017-07-24"; // String | Effective date for data expressed in YYYY-MM-DD format. If no date is requested, the default behavior is to return the full history for the requested entity.
        java.util.Set<Integer> levels = Arrays.asList(); // java.util.Set<Integer> | List of RBICS industry levels to include in the response. **By default if left blank, all levels are returned.**
        Boolean includeNames = true; // Boolean | Option to include or exclude industry Names and the L6 Description. true = Include Names; false = Exclude Names.
        try {
            EntityFocusResponse result = apiInstance.getRbicsEntityFocus(ids, date, levels, includeNames);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EntityApi#getRbicsEntityFocus");
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
 **ids** | **List&lt;String&gt;**| List of Company identifiers. Accepted identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**ids limit &#x3D; 2500 per request**&lt;/p&gt;    Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;  |
 **date** | **String**| Effective date for data expressed in YYYY-MM-DD format. If no date is requested, the default behavior is to return the full history for the requested entity. | [optional]
 **levels** | **List&lt;Integer&gt;**| List of RBICS industry levels to include in the response. **By default if left blank, all levels are returned.** | [optional]
 **includeNames** | **Boolean**| Option to include or exclude industry Names and the L6 Description. true &#x3D; Include Names; false &#x3D; Exclude Names. | [optional] [default to true]

### Return type

[**EntityFocusResponse**](EntityFocusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response producing an array of Entity Focus Objects |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getRbicsEntityFocusForList

> EntityFocusResponse getRbicsEntityFocusForList(entityFocusRequest)

Get RBICS classification for the Focus industry

Gets RBICS classifications for the Focus industry for a long list of companies. Full history is included if _date_ parameter is not specified.

  RBICS Focus offers a single-sector mapping of about 48,000 of the most liquid and publicly-traded companies based on their primary lines of business; it uses revenues as the key factor in determining a company’s primary line of business, by mapping a company to the lowest-level sector from which it derives 50% or more of its revenues.

  The RBICS Extended Universe – Industry Group is not currently supported through the RBICS API.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetRBICS.ApiClient;
import com.factset.sdk.FactSetRBICS.ApiException;
import com.factset.sdk.FactSetRBICS.Configuration;
import com.factset.sdk.FactSetRBICS.auth.*;
import com.factset.sdk.FactSetRBICS.models.*;
import com.factset.sdk.FactSetRBICS.api.EntityApi;

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

        EntityApi apiInstance = new EntityApi(defaultClient);
        EntityFocusRequest entityFocusRequest = new EntityFocusRequest(); // EntityFocusRequest | Request Body to request a list of RBICS Entity Focus objects.
        try {
            EntityFocusResponse result = apiInstance.getRbicsEntityFocusForList(entityFocusRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EntityApi#getRbicsEntityFocusForList");
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
 **entityFocusRequest** | [**EntityFocusRequest**](EntityFocusRequest.md)| Request Body to request a list of RBICS Entity Focus objects. |

### Return type

[**EntityFocusResponse**](EntityFocusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response producing an array of Entity Focus Objects |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getRbicsEntityRevenue

> EntityResponse getRbicsEntityRevenue(ids, startDate, endDate, level)

Get a company&#39;s revenue breakdown by RBICS classification.

Access a comprehensive, hierarchical breakdown of a company's revenue according to each RBICS industry classification. This endpoint aligns a company's reported business segment revenues with the complete, multi-level RBICS taxonomy, offering the percentage of total revenue attributed to each industry.

For Mutual Funds and ETFs we only have data from L1-L4 and requires additional access to get this data. Note that, the response time can exceed 20+ seconds when querying for more than one year of data.  As such we do not recommend requesting for more than 1 ID at a time for history.
 
Use the `level` parameter to control the depth of the returned taxonomy, from Economy (L1) down to Sub-Industry (L6).


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.FactSetRBICS.ApiClient;
import com.factset.sdk.FactSetRBICS.ApiException;
import com.factset.sdk.FactSetRBICS.Configuration;
import com.factset.sdk.FactSetRBICS.auth.*;
import com.factset.sdk.FactSetRBICS.models.*;
import com.factset.sdk.FactSetRBICS.api.EntityApi;

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

        EntityApi apiInstance = new EntityApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | List of Company identifiers. Accepted identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.<p>**ids limit = 2500 per request**</p>    Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p> 
        LocalDate startDate = LocalDate.parse("2021-08-27"); // LocalDate | Specifies the start date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and forward. The `startDate` must be equal to or before the `endDate`. Future dates (T+1) are not accepted in this endpoint.  Note:  - If omitted while `endDate` is specified: Data will be fetched from the earliest available record up to the specified end date. - If both `startDate` and `endDate` are omitted: The response will return the latest available data. 
        LocalDate endDate = LocalDate.parse("2022-08-27"); // LocalDate | Specifies the end date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and earlier. The `endDate` must be equal to or after the `startDate`. Future dates (T+1) are not accepted in this endpoint.  Note: - If omitted (with `startDate` specified): Data will be returned from the specified start date up to the most recent available date. - If both `startDate` and `endDate` are omitted: The response will return the latest available data. 
        Integer level = 6; // Integer | Specifies the deepest level of the RBICS taxonomy to be included in the revenue breakdown. The response will include all levels from 1 up to the specified level. For example, a value of '3' will return revenue percentages for Economy (L1), Sector (L2), and Sub-Sector (L3). The default behavior is to return all 6 levels.   |Level|Description|Number of Groups|   |---|---|---|   |1|Economy|14|   |2|Sector|37|   |3|Sub-Sector|109|   |4|Industry Group|366|   |5|Industry|901|   |6|Sub-Industry|1629| 
        try {
            EntityResponse result = apiInstance.getRbicsEntityRevenue(ids, startDate, endDate, level);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EntityApi#getRbicsEntityRevenue");
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
 **ids** | **List&lt;String&gt;**| List of Company identifiers. Accepted identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**ids limit &#x3D; 2500 per request**&lt;/p&gt;    Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;  |
 **startDate** | **LocalDate**| Specifies the start date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and forward. The &#x60;startDate&#x60; must be equal to or before the &#x60;endDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note:  - If omitted while &#x60;endDate&#x60; is specified: Data will be fetched from the earliest available record up to the specified end date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  | [optional]
 **endDate** | **LocalDate**| Specifies the end date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and earlier. The &#x60;endDate&#x60; must be equal to or after the &#x60;startDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note: - If omitted (with &#x60;startDate&#x60; specified): Data will be returned from the specified start date up to the most recent available date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  | [optional]
 **level** | **Integer**| Specifies the deepest level of the RBICS taxonomy to be included in the revenue breakdown. The response will include all levels from 1 up to the specified level. For example, a value of &#39;3&#39; will return revenue percentages for Economy (L1), Sector (L2), and Sub-Sector (L3). The default behavior is to return all 6 levels.   |Level|Description|Number of Groups|   |---|---|---|   |1|Economy|14|   |2|Sector|37|   |3|Sub-Sector|109|   |4|Industry Group|366|   |5|Industry|901|   |6|Sub-Industry|1629|  | [optional]

### Return type

[**EntityResponse**](EntityResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response returning a company&#39;s revenue breakdown by RBICS classification. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal Server Error |  -  |


## getRbicsEntityRevenueForList

> EntityResponse getRbicsEntityRevenueForList(entityRequest)

Get a company&#39;s revenue breakdown by RBICS classification.

Access a comprehensive, hierarchical breakdown of a company's revenue according to each RBICS industry classification. This endpoint aligns a company's reported business segment revenues with the complete, multi-level RBICS taxonomy, offering the percentage of total revenue attributed to each industry.

For Mutual Funds and ETFs we only have data from L1-L4 and requires additional access to get this data. Note that, the response time can exceed 20+ seconds when querying for more than one year of data.  As such we do not recommend requesting for more than 1 ID at a time for history.

Use the `level` parameter to control the depth of the returned taxonomy, from Economy (L1) down to Sub-Industry (L6). Use the POST method for large lists of identifiers.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetRBICS.ApiClient;
import com.factset.sdk.FactSetRBICS.ApiException;
import com.factset.sdk.FactSetRBICS.Configuration;
import com.factset.sdk.FactSetRBICS.auth.*;
import com.factset.sdk.FactSetRBICS.models.*;
import com.factset.sdk.FactSetRBICS.api.EntityApi;

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

        EntityApi apiInstance = new EntityApi(defaultClient);
        EntityRequest entityRequest = new EntityRequest(); // EntityRequest | Request Body to request a list of Entity Revenue objects.
        try {
            EntityResponse result = apiInstance.getRbicsEntityRevenueForList(entityRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EntityApi#getRbicsEntityRevenueForList");
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
 **entityRequest** | [**EntityRequest**](EntityRequest.md)| Request Body to request a list of Entity Revenue objects. |

### Return type

[**EntityResponse**](EntityResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response returning a company&#39;s revenue breakdown by RBICS classification. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal Server Error |  -  |

