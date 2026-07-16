# IndustryApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRbicsIndustryFocus**](IndustryApi.md#getRbicsIndustryFocus) | **GET** /factset-rbics/v1/industry/focus | Get the list of companies with a specific RBICS Focus classification.
[**getRbicsIndustryFocusForList**](IndustryApi.md#getRbicsIndustryFocusForList) | **POST** /factset-rbics/v1/industry/focus | Get the list of companies with a specific Industry Focus classification.
[**getRbicsIndustryRevenue**](IndustryApi.md#getRbicsIndustryRevenue) | **GET** /factset-rbics/v1/industry/revenue | Get companies and their revenue exposure to a specific RBICS L6 Sub-Industry.
[**getRbicsIndustryRevenueForList**](IndustryApi.md#getRbicsIndustryRevenueForList) | **POST** /factset-rbics/v1/industry/revenue | Get companies and their revenue exposure to a specific RBICS L6 Sub-Industry.



## getRbicsIndustryFocus

> IndustryFocusResponse getRbicsIndustryFocus(rbicsIds, startDate, endDate)

Get the list of companies with a specific RBICS Focus classification.

Identify all companies whose primary business falls within a specific RBICS industry. This endpoint screens your universe based on the RBICS Focus classification.

 A company's Focus is the lowest-level (Level 6) RBICS sub-industry from which it derives 50% or more of its annual revenue.

 Provide a list of one or more RBICS IDs (up to Level 6) to retrieve the list of companies whose primary business line falls within those sectors. A complete list of valid RBICS IDs can be retrieved using the `/structure` endpoints. Use the `startDate` and `endDate` parameters to screen for companies that held this classification during a specific historical period.


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
import com.factset.sdk.FactSetRBICS.api.IndustryApi;

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

        IndustryApi apiInstance = new IndustryApi(defaultClient);
        java.util.List<String> rbicsIds = Arrays.asList(); // java.util.List<String> | A list of RBICS industry classification identifiers. These are used to filter the results to specific industries. IDs can range from Level 1 (Economy) to Level 6 (Sub-Industry). A complete list of valid RBICS IDs can be retrieved using the `/structure` endpoints. 
        LocalDate startDate = LocalDate.parse("2021-08-27"); // LocalDate | Specifies the start date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and forward. The `startDate` must be equal to or before the `endDate`. Future dates (T+1) are not accepted in this endpoint.  Note:  - If omitted while `endDate` is specified: Data will be fetched from the earliest available record up to the specified end date. - If both `startDate` and `endDate` are omitted: The response will return the latest available data. 
        LocalDate endDate = LocalDate.parse("2022-08-27"); // LocalDate | Specifies the end date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and earlier. The `endDate` must be equal to or after the `startDate`. Future dates (T+1) are not accepted in this endpoint.  Note: - If omitted (with `startDate` specified): Data will be returned from the specified start date up to the most recent available date. - If both `startDate` and `endDate` are omitted: The response will return the latest available data. 
        try {
            IndustryFocusResponse result = apiInstance.getRbicsIndustryFocus(rbicsIds, startDate, endDate);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling IndustryApi#getRbicsIndustryFocus");
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
 **rbicsIds** | **List&lt;String&gt;**| A list of RBICS industry classification identifiers. These are used to filter the results to specific industries. IDs can range from Level 1 (Economy) to Level 6 (Sub-Industry). A complete list of valid RBICS IDs can be retrieved using the &#x60;/structure&#x60; endpoints.  |
 **startDate** | **LocalDate**| Specifies the start date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and forward. The &#x60;startDate&#x60; must be equal to or before the &#x60;endDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note:  - If omitted while &#x60;endDate&#x60; is specified: Data will be fetched from the earliest available record up to the specified end date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  | [optional]
 **endDate** | **LocalDate**| Specifies the end date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and earlier. The &#x60;endDate&#x60; must be equal to or after the &#x60;startDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note: - If omitted (with &#x60;startDate&#x60; specified): Data will be returned from the specified start date up to the most recent available date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  | [optional]

### Return type

[**IndustryFocusResponse**](IndustryFocusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response returning a list of companies with a specific RBICS Focus classification. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal Server Error |  -  |


## getRbicsIndustryFocusForList

> IndustryFocusResponse getRbicsIndustryFocusForList(industryRequest)

Get the list of companies with a specific Industry Focus classification.

Identify all companies whose primary business falls within a specific RBICS industry. This endpoint screens your universe based on the RBICS Focus classification.

A company's Focus is the lowest-level (Level 6) RBICS sub-industry from which it derives 50% or more of its annual revenue.

Provide a list of one or more RBICS IDs (up to Level 6) to retrieve the list of companies whose primary business line falls within those sectors. Use the `startDate` and `endDate` parameters to screen for companies that held this classification during a specific historical period.


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
import com.factset.sdk.FactSetRBICS.api.IndustryApi;

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

        IndustryApi apiInstance = new IndustryApi(defaultClient);
        IndustryRequest industryRequest = new IndustryRequest(); // IndustryRequest | Request Body to request a list of Industry Focus objects.
        try {
            IndustryFocusResponse result = apiInstance.getRbicsIndustryFocusForList(industryRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling IndustryApi#getRbicsIndustryFocusForList");
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
 **industryRequest** | [**IndustryRequest**](IndustryRequest.md)| Request Body to request a list of Industry Focus objects. |

### Return type

[**IndustryFocusResponse**](IndustryFocusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response returning a list of companies with a specific RBICS Focus classification. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal Server Error |  -  |


## getRbicsIndustryRevenue

> IndustryRevenueResponse getRbicsIndustryRevenue(rbicsIds, startDate, endDate)

Get companies and their revenue exposure to a specific RBICS L6 Sub-Industry.

Screen for companies with revenue exposure to a specific RBICS Level 6 Sub-Industry. This endpoint identifies all companies that derive revenue from a specified sub-industry and returns the percentage of their total revenue attributable to that industry.
This is a powerful tool for understanding the competitive landscape and supply chains at a granular level, beyond a company's primary classification.
**Note:** The `rbicsIds` parameter for this endpoint must be a valid Level 6 Sub-Industry ID. Use the `startDate` and `endDate` parameters to control the time period for the underlying revenue reports.


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
import com.factset.sdk.FactSetRBICS.api.IndustryApi;

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

        IndustryApi apiInstance = new IndustryApi(defaultClient);
        java.util.List<String> rbicsIds = Arrays.asList(); // java.util.List<String> | List of RBICS Level 6 Sub-Industry IDs to screen for companies by revenue exposure. **Note:** Only Level 6 IDs are supported for this endpoint. A complete list of valid Level 6 IDs can be retrieved using the `/structure` endpoints. 
        LocalDate startDate = LocalDate.parse("2021-08-27"); // LocalDate | Specifies the start date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and forward. The `startDate` must be equal to or before the `endDate`. Future dates (T+1) are not accepted in this endpoint.  Note:  - If omitted while `endDate` is specified: Data will be fetched from the earliest available record up to the specified end date. - If both `startDate` and `endDate` are omitted: The response will return the latest available data. 
        LocalDate endDate = LocalDate.parse("2022-08-27"); // LocalDate | Specifies the end date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and earlier. The `endDate` must be equal to or after the `startDate`. Future dates (T+1) are not accepted in this endpoint.  Note: - If omitted (with `startDate` specified): Data will be returned from the specified start date up to the most recent available date. - If both `startDate` and `endDate` are omitted: The response will return the latest available data. 
        try {
            IndustryRevenueResponse result = apiInstance.getRbicsIndustryRevenue(rbicsIds, startDate, endDate);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling IndustryApi#getRbicsIndustryRevenue");
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
 **rbicsIds** | **List&lt;String&gt;**| List of RBICS Level 6 Sub-Industry IDs to screen for companies by revenue exposure. **Note:** Only Level 6 IDs are supported for this endpoint. A complete list of valid Level 6 IDs can be retrieved using the &#x60;/structure&#x60; endpoints.  |
 **startDate** | **LocalDate**| Specifies the start date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and forward. The &#x60;startDate&#x60; must be equal to or before the &#x60;endDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note:  - If omitted while &#x60;endDate&#x60; is specified: Data will be fetched from the earliest available record up to the specified end date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  | [optional]
 **endDate** | **LocalDate**| Specifies the end date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and earlier. The &#x60;endDate&#x60; must be equal to or after the &#x60;startDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note: - If omitted (with &#x60;startDate&#x60; specified): Data will be returned from the specified start date up to the most recent available date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  | [optional]

### Return type

[**IndustryRevenueResponse**](IndustryRevenueResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response returning a list of companies and their revenue exposure to the requested RBICS Level 6 Sub-Industry. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal Server Error |  -  |


## getRbicsIndustryRevenueForList

> IndustryRevenueResponse getRbicsIndustryRevenueForList(industryRevenueRequest)

Get companies and their revenue exposure to a specific RBICS L6 Sub-Industry.

Screen for companies with revenue exposure to a specific RBICS Level 6 Sub-Industry. This endpoint identifies all companies that derive revenue from a specified sub-industry and returns the percentage of their total revenue attributable to that industry.
This is a powerful tool for understanding the competitive landscape and supply chains at a granular level, beyond a company's primary classification.
**Note:** The `rbicsIds` parameter for this endpoint must be a valid Level 6 Sub-Industry ID. Use the `startDate` and `endDate` parameters to control the time period for the underlying revenue reports. Use the POST method for large lists of `rbicsIds`.


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
import com.factset.sdk.FactSetRBICS.api.IndustryApi;

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

        IndustryApi apiInstance = new IndustryApi(defaultClient);
        IndustryRevenueRequest industryRevenueRequest = new IndustryRevenueRequest(); // IndustryRevenueRequest | Request Body to screen for companies with revenue exposure to a specific RBICS L6 Sub-Industry.
        try {
            IndustryRevenueResponse result = apiInstance.getRbicsIndustryRevenueForList(industryRevenueRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling IndustryApi#getRbicsIndustryRevenueForList");
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
 **industryRevenueRequest** | [**IndustryRevenueRequest**](IndustryRevenueRequest.md)| Request Body to screen for companies with revenue exposure to a specific RBICS L6 Sub-Industry. |

### Return type

[**IndustryRevenueResponse**](IndustryRevenueResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response returning a list of companies and their revenue exposure to the requested RBICS Level 6 Sub-Industry. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal Server Error |  -  |

