# CountriesApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCountries**](CountriesApi.md#getCountries) | **GET** /factset-georev/v1/countries | Gets the revenue details for the requested Countries.
[**getCountriesForList**](CountriesApi.md#getCountriesForList) | **POST** /factset-georev/v1/countries | Gets the revenue details for the requested Countries. Use for large lists of ids.



## getCountries

> CountryResponse getCountries(ids, countryIds, startDate, endDate, frequency, currency)

Gets the revenue details for the requested Countries.

Gets the **Countries'** Geographic Revenue, Percents, Confidence, and Ranks for a requested list of ids and country ISO codes, for a given start-date and end-date. 300 countries are supported. Countries represent the fourth and bottom level of the GeoRev taxonomy. Visit [OA 8754](https://my.apps.factset.com/oa/pages/8754) for a list of ISO2 Country Codes. By default, the service will return all Countries for the requested security.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetGeoRev.ApiClient;
import com.factset.sdk.FactSetGeoRev.ApiException;
import com.factset.sdk.FactSetGeoRev.Configuration;
import com.factset.sdk.FactSetGeoRev.auth.*;
import com.factset.sdk.FactSetGeoRev.models.*;
import com.factset.sdk.FactSetGeoRev.api.CountriesApi;

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

        CountriesApi apiInstance = new CountriesApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Accepts various security or entity identifiers, including FactSet IDs, tickers, CUSIP, SEDOL, and Fund IDs. <p>***ids limit** =  300 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
        java.util.List<String> countryIds = Arrays.asList(); // java.util.List<String> | The Country ISO2 Codes representing the Country requested. By default, the service will request *ALL* Countries. To limit the Countries returned in the response, provide a comma-separated list of the ISO2 Country Codes. Visit [OA 8754](https://my.apps.factset.com/oa/pages/8754) for a full list of ISO2 codes. 
        String startDate = "2018-12-31"; // String | The start date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity and updated Daily. If left blank, the API will default to latest available fiscal period. Future dates (T+1) are not accepted in this endpoint. 
        String endDate = "2019-12-31"; // String | The end date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity and updated daily. If left blank, the API will default to latest available fiscal period. Future dates (T+1) are not accepted in this endpoint. 
        String frequency = "D"; // String | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year.    
        String currency = "USD"; // String | Currency code for adjusting the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
        try {
            CountryResponse result = apiInstance.getCountries(ids, countryIds, startDate, endDate, frequency, currency);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CountriesApi#getCountries");
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
 **ids** | **List&lt;String&gt;**| Accepts various security or entity identifiers, including FactSet IDs, tickers, CUSIP, SEDOL, and Fund IDs. &lt;p&gt;***ids limit** &#x3D;  300 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **countryIds** | **List&lt;String&gt;**| The Country ISO2 Codes representing the Country requested. By default, the service will request *ALL* Countries. To limit the Countries returned in the response, provide a comma-separated list of the ISO2 Country Codes. Visit [OA 8754](https://my.apps.factset.com/oa/pages/8754) for a full list of ISO2 codes.  | [optional]
 **startDate** | **String**| The start date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity and updated Daily. If left blank, the API will default to latest available fiscal period. Future dates (T+1) are not accepted in this endpoint.  | [optional]
 **endDate** | **String**| The end date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity and updated daily. If left blank, the API will default to latest available fiscal period. Future dates (T+1) are not accepted in this endpoint.  | [optional]
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.     | [optional] [default to FY] [enum: D, W, M, AM, CQ, FQ, AY, CY, FY, ]
 **currency** | **String**| Currency code for adjusting the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional]

### Return type

[**CountryResponse**](CountryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Country response object, including the Revenue, Percent, Certainty Ranks, Certainty Class, and other meta data. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getCountriesForList

> CountryResponse getCountriesForList(countryRequest)

Gets the revenue details for the requested Countries. Use for large lists of ids.

Gets the **Countries'** Geographic Revenue, Percents, Confidence, and Ranks for a requested list of ids and country ISO codes, for a given start-date and end-date. Nearly 300 countries are supported. Countries represent the fourth and bottom level of the GeoRev taxonomy. The full list of countries and their related regional mappings can be found by using the /country-mappings endpoint or visit [OA 8754](https://my.apps.factset.com/oa/pages/8754) for a list of ISO2 Country codes.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetGeoRev.ApiClient;
import com.factset.sdk.FactSetGeoRev.ApiException;
import com.factset.sdk.FactSetGeoRev.Configuration;
import com.factset.sdk.FactSetGeoRev.auth.*;
import com.factset.sdk.FactSetGeoRev.models.*;
import com.factset.sdk.FactSetGeoRev.api.CountriesApi;

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

        CountriesApi apiInstance = new CountriesApi(defaultClient);
        CountryRequest countryRequest = new CountryRequest(); // CountryRequest | The Country request body, allowing the user to specify a list of ids, time range, and regionIds.
        try {
            CountryResponse result = apiInstance.getCountriesForList(countryRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CountriesApi#getCountriesForList");
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
 **countryRequest** | [**CountryRequest**](CountryRequest.md)| The Country request body, allowing the user to specify a list of ids, time range, and regionIds. |

### Return type

[**CountryResponse**](CountryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Country response object, including the Revenue, Percent, Certainty Ranks, Certainty Class, and other meta data. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

