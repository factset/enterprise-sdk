# FactSet.SDK.FactSetMacroeconomics.Api.ReferenceDataApi

All URIs are relative to *https://api.factset.com/content/economics/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetEconomicEventReferenceData**](ReferenceDataApi.md#geteconomiceventreferencedata) | **GET** /meta/events | Retrieve reference data for events
[**GetFdsCodeMapping**](ReferenceDataApi.md#getfdscodemapping) | **GET** /meta/series | Retrieve reference data for series



<a name="geteconomiceventreferencedata"></a>
# **GetEconomicEventReferenceData**
> MetaEventsResponse GetEconomicEventReferenceData (string type)

Retrieve reference data for events

Returns reference values for filtering and discovery. Use this endpoint to discover available indicators, countries, and FDS codes.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetMacroeconomics.Api;
using FactSet.SDK.FactSetMacroeconomics.Client;
using FactSet.SDK.FactSetMacroeconomics.Model;

namespace Example
{
    public class GetEconomicEventReferenceDataExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetMacroeconomics.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new ReferenceDataApi(config);

            var type = "INDICATORS";  // string | Specifies the type of reference data to return. The supported values are:  - `INDICATORS`: Returns available economic indicator codes for use with the `indicator` filter. - `COUNTRIES`: Returns supported country codes for use with the `countryCode` filter. - `FDS_CODES`: Returns available FDS codes. - `TIMEZONES`: Returns supported timezone values for use with the `timeZone` filter. 

            try
            {
                // Retrieve reference data for events
                MetaEventsResponse result = apiInstance.GetEconomicEventReferenceData(type);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReferenceDataApi.GetEconomicEventReferenceData: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **string**| Specifies the type of reference data to return. The supported values are:  - &#x60;INDICATORS&#x60;: Returns available economic indicator codes for use with the &#x60;indicator&#x60; filter. - &#x60;COUNTRIES&#x60;: Returns supported country codes for use with the &#x60;countryCode&#x60; filter. - &#x60;FDS_CODES&#x60;: Returns available FDS codes. - &#x60;TIMEZONES&#x60;: Returns supported timezone values for use with the &#x60;timeZone&#x60; filter.  | 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getfdscodemapping"></a>
# **GetFdsCodeMapping**
> MetaSeriesResponse GetFdsCodeMapping (string searchText = null, List<string> category = null, string countryCode = null, int? paginationLimit = null, int? paginationOffset = null)

Retrieve reference data for series

Returns series metadata with FDS code mappings. Use this endpoint to discover available series, categories, and FDS code associations.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetMacroeconomics.Api;
using FactSet.SDK.FactSetMacroeconomics.Client;
using FactSet.SDK.FactSetMacroeconomics.Model;

namespace Example
{
    public class GetFdsCodeMappingExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetMacroeconomics.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new ReferenceDataApi(config);

            var searchText = "GDP";  // string | Text to search for within series names. Restricts results to only series that match the provided search text. (optional) 
            var category = new List<string>(); // List<string> | Filter series by major category. The supported categories are:  - `ECONOMICS`: Economic indicators and metrics. - `INTEREST_RATES`: Interest rate data and related metrics.  Multiple categories can be provided as comma-separated values.  (optional) 
            var countryCode = "US";  // string | ISO country code for filtering events by country. Use the `/meta/events?type=countries` endpoint to retrieve available country codes.  (optional) 
            var paginationLimit = 25;  // int? | Maximum number of results to return per page. If not specified, the default page size is applied.  (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Number of results to skip before returning the first result. Used for pagination in combination with `_paginationLimit`.  (optional)  (default to 0)

            try
            {
                // Retrieve reference data for series
                MetaSeriesResponse result = apiInstance.GetFdsCodeMapping(searchText, category, countryCode, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReferenceDataApi.GetFdsCodeMapping: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchText** | **string**| Text to search for within series names. Restricts results to only series that match the provided search text. | [optional] 
 **category** | [**List&lt;string&gt;**](string.md)| Filter series by major category. The supported categories are:  - &#x60;ECONOMICS&#x60;: Economic indicators and metrics. - &#x60;INTEREST_RATES&#x60;: Interest rate data and related metrics.  Multiple categories can be provided as comma-separated values.  | [optional] 
 **countryCode** | **string**| ISO country code for filtering events by country. Use the &#x60;/meta/events?type&#x3D;countries&#x60; endpoint to retrieve available country codes.  | [optional] 
 **paginationLimit** | **int?**| Maximum number of results to return per page. If not specified, the default page size is applied.  | [optional] [default to 25]
 **paginationOffset** | **int?**| Number of results to skip before returning the first result. Used for pagination in combination with &#x60;_paginationLimit&#x60;.  | [optional] [default to 0]

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


