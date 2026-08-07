# ReferenceDataApi

All URIs are relative to *https://api.factset.com/content/economics/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEconomicEventReferenceData**](ReferenceDataApi.md#getEconomicEventReferenceData) | **GET** /meta/events | Retrieve reference data for events
[**getFdsCodeMapping**](ReferenceDataApi.md#getFdsCodeMapping) | **GET** /meta/series | Retrieve reference data for series



## getEconomicEventReferenceData

> MetaEventsResponse getEconomicEventReferenceData(type)

Retrieve reference data for events

Returns reference values for filtering and discovery. Use this endpoint to discover available indicators, countries, and FDS codes.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetMacroeconomics.ApiClient;
import com.factset.sdk.FactSetMacroeconomics.ApiException;
import com.factset.sdk.FactSetMacroeconomics.Configuration;
import com.factset.sdk.FactSetMacroeconomics.auth.*;
import com.factset.sdk.FactSetMacroeconomics.models.*;
import com.factset.sdk.FactSetMacroeconomics.api.ReferenceDataApi;

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

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String type = "INDICATORS"; // String | Specifies the type of reference data to return. The supported values are:  - `INDICATORS`: Returns available economic indicator codes for use with the `indicator` filter. - `COUNTRIES`: Returns supported country codes for use with the `countryCode` filter. - `FDS_CODES`: Returns available FDS codes. - `TIMEZONES`: Returns supported timezone values for use with the `timeZone` filter. 
        try {
            MetaEventsResponse result = apiInstance.getEconomicEventReferenceData(type);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getEconomicEventReferenceData");
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
 **type** | **String**| Specifies the type of reference data to return. The supported values are:  - &#x60;INDICATORS&#x60;: Returns available economic indicator codes for use with the &#x60;indicator&#x60; filter. - &#x60;COUNTRIES&#x60;: Returns supported country codes for use with the &#x60;countryCode&#x60; filter. - &#x60;FDS_CODES&#x60;: Returns available FDS codes. - &#x60;TIMEZONES&#x60;: Returns supported timezone values for use with the &#x60;timeZone&#x60; filter.  | [enum: INDICATORS, COUNTRIES, FDS_CODES, TIMEZONES]

### Return type

[**MetaEventsResponse**](MetaEventsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response containing reference data. |  -  |
| **400** | Bad Request. The request contains syntax errors or is malformed (e.g., malformed JSON, invalid protocol formatting, illegal characters in query strings). The server cannot parse the request.  |  -  |
| **401** | Unauthenticated - API authentication failed. Ensure you have successfully generated a valid API key, included the API key in your request via Basic Auth, and the API key is valid for your IP range. For help with connectivity issues, please contact FactSet support.  |  -  |
| **403** | Forbidden - You do not have permission to access this endpoint or resource. Your API key or account may not have the required access level. Please reach out to your FactSet Account Team for assistance with authorization.  |  -  |
| **404** | Not Found - The requested endpoint or resource does not exist. Please verify that the endpoint path is correct, all required path parameters are provided, and the resource identifier (if any) is valid.  |  -  |
| **422** | Unprocessable Entity - Your request data was syntactically correct but semantically invalid. This can occur for validation errors such as invalid date format, invalid parameter values, missing required parameters, invalid enum values, or invalid date ranges. Check the required parameters and their value constraints.  |  -  |
| **429** | Too Many Requests - You have exceeded the allowed request rate for this API. Please wait and retry your request after some time.  |  -  |
| **500** | Internal Server Error - An unexpected error occurred on the server. Please try your request again. If the problem persists, contact FactSet support and provide the error ID from the response for investigation.  |  -  |


## getFdsCodeMapping

> MetaSeriesResponse getFdsCodeMapping(searchText, category, countryCode, paginationLimit, paginationOffset)

Retrieve reference data for series

Returns series metadata with FDS code mappings. Use this endpoint to discover available series, categories, and FDS code associations.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetMacroeconomics.ApiClient;
import com.factset.sdk.FactSetMacroeconomics.ApiException;
import com.factset.sdk.FactSetMacroeconomics.Configuration;
import com.factset.sdk.FactSetMacroeconomics.auth.*;
import com.factset.sdk.FactSetMacroeconomics.models.*;
import com.factset.sdk.FactSetMacroeconomics.api.ReferenceDataApi;

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

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String searchText = "GDP"; // String | Text to search for within series names. Restricts results to only series that match the provided search text.
        java.util.List<String> category = Arrays.asList(); // java.util.List<String> | Filter series by major category. The supported categories are:  - `ECONOMICS`: Economic indicators and metrics. - `INTEREST_RATES`: Interest rate data and related metrics.  Multiple categories can be provided as comma-separated values. 
        String countryCode = "US"; // String | ISO country code for filtering events by country. Use the `/meta/events?type=countries` endpoint to retrieve available country codes. 
        Integer paginationLimit = 25; // Integer | Maximum number of results to return per page. If not specified, the default page size is applied. 
        Integer paginationOffset = 0; // Integer | Number of results to skip before returning the first result. Used for pagination in combination with `_paginationLimit`. 
        try {
            MetaSeriesResponse result = apiInstance.getFdsCodeMapping(searchText, category, countryCode, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getFdsCodeMapping");
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
 **searchText** | **String**| Text to search for within series names. Restricts results to only series that match the provided search text. | [optional]
 **category** | **List&lt;String&gt;**| Filter series by major category. The supported categories are:  - &#x60;ECONOMICS&#x60;: Economic indicators and metrics. - &#x60;INTEREST_RATES&#x60;: Interest rate data and related metrics.  Multiple categories can be provided as comma-separated values.  | [optional] [enum: ECONOMICS, INTEREST_RATES]
 **countryCode** | **String**| ISO country code for filtering events by country. Use the &#x60;/meta/events?type&#x3D;countries&#x60; endpoint to retrieve available country codes.  | [optional]
 **paginationLimit** | **Integer**| Maximum number of results to return per page. If not specified, the default page size is applied.  | [optional] [default to 25]
 **paginationOffset** | **Integer**| Number of results to skip before returning the first result. Used for pagination in combination with &#x60;_paginationLimit&#x60;.  | [optional] [default to 0]

### Return type

[**MetaSeriesResponse**](MetaSeriesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved economic series metadata. |  -  |
| **400** | Bad Request. The request contains syntax errors or is malformed (e.g., malformed JSON, invalid protocol formatting, illegal characters in query strings). The server cannot parse the request.  |  -  |
| **401** | Unauthenticated - API authentication failed. Ensure you have successfully generated a valid API key, included the API key in your request via Basic Auth, and the API key is valid for your IP range. For help with connectivity issues, please contact FactSet support.  |  -  |
| **403** | Forbidden - You do not have permission to access this endpoint or resource. Your API key or account may not have the required access level. Please reach out to your FactSet Account Team for assistance with authorization.  |  -  |
| **404** | Not Found - The requested endpoint or resource does not exist. Please verify that the endpoint path is correct, all required path parameters are provided, and the resource identifier (if any) is valid.  |  -  |
| **422** | Unprocessable Entity - Your request data was syntactically correct but semantically invalid. This can occur for validation errors such as invalid date format, invalid parameter values, missing required parameters, invalid enum values, or invalid date ranges. Check the required parameters and their value constraints.  |  -  |
| **429** | Too Many Requests - You have exceeded the allowed request rate for this API. Please wait and retry your request after some time.  |  -  |
| **500** | Internal Server Error - An unexpected error occurred on the server. Please try your request again. If the problem persists, contact FactSet support and provide the error ID from the response for investigation.  |  -  |

