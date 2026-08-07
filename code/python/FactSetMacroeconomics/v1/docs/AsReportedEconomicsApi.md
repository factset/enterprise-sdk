# fds.sdk.FactSetMacroeconomics.AsReportedEconomicsApi

All URIs are relative to *https://api.factset.com/content/economics/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_as_reported_economics**](AsReportedEconomicsApi.md#get_as_reported_economics) | **GET** /as-reported-economics | Retrieve as-reported economic time series data



# **get_as_reported_economics**
> AsReportedEconomicsResponse get_as_reported_economics(series_id)

Retrieve as-reported economic time series data

Returns as-reported economic time series data for a given series ID, with optional frequency conversion and data transformation. Use `/meta/series` to discover available series IDs.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetMacroeconomics
from fds.sdk.FactSetMacroeconomics.api import as_reported_economics_api
from fds.sdk.FactSetMacroeconomics.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetMacroeconomics.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetMacroeconomics.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetMacroeconomics.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = as_reported_economics_api.AsReportedEconomicsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    series_id = "FRBRIFSPPCD90@US" # str | The Series ID identifying the economic series to retrieve. Use the `/meta/series` endpoint to get a list of available series IDs. 
    start_date = dateutil_parser('Thu Jan 01 00:00:00 UTC 2026').date() # date | Start date for the query range.  - **Default:** If both `startDate` and `endDate` are omitted, the API defaults to the most recent available calendar day  (optional)
    end_date = dateutil_parser('Wed Jul 01 00:00:00 UTC 2026').date() # date | End date for the query range.  - **Default:** If both `startDate` and `endDate` are omitted, the API defaults to the most recent available calendar day  (optional)
    country_code = "US" # str | ISO country code for filtering events by country. Use the `/meta/events?type=countries` endpoint to retrieve available country codes.  (optional)
    frequency = "D" # str | Controls the output frequency of the data returned. The supported frequencies are:  - **D**: Daily. - **W**: Weekly. - **M**: Monthly. - **Q**: Quarterly. - **Y**: Yearly.  When `frequency` is not specified: If multiple frequencies are available for the seriesId, data is returned at the highest frequency (e.g., monthly over quarterly). If only one frequency is available, data is returned at that frequency.  (optional)
    pagination_limit = 25 # int | Maximum number of results to return per page. If not specified, the default page size is applied.  (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Number of results to skip before returning the first result. Used for pagination in combination with `_paginationLimit`.  (optional) if omitted the server will use the default value of 0

    try:
        # Retrieve as-reported economic time series data
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_as_reported_economics(series_id, start_date=start_date, end_date=end_date, country_code=country_code, frequency=frequency, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetMacroeconomics.ApiException as e:
        print("Exception when calling AsReportedEconomicsApi->get_as_reported_economics: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **series_id** | **str**| The Series ID identifying the economic series to retrieve. Use the &#x60;/meta/series&#x60; endpoint to get a list of available series IDs.  |
 **start_date** | **date**| Start date for the query range.  - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day  | [optional]
 **end_date** | **date**| End date for the query range.  - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day  | [optional]
 **country_code** | **str**| ISO country code for filtering events by country. Use the &#x60;/meta/events?type&#x3D;countries&#x60; endpoint to retrieve available country codes.  | [optional]
 **frequency** | **str**| Controls the output frequency of the data returned. The supported frequencies are:  - **D**: Daily. - **W**: Weekly. - **M**: Monthly. - **Q**: Quarterly. - **Y**: Yearly.  When &#x60;frequency&#x60; is not specified: If multiple frequencies are available for the seriesId, data is returned at the highest frequency (e.g., monthly over quarterly). If only one frequency is available, data is returned at that frequency.  | [optional]
 **pagination_limit** | **int**| Maximum number of results to return per page. If not specified, the default page size is applied.  | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Number of results to skip before returning the first result. Used for pagination in combination with &#x60;_paginationLimit&#x60;.  | [optional] if omitted the server will use the default value of 0

### Return type

[**AsReportedEconomicsResponse**](AsReportedEconomicsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved as-reported economic data. |  -  |
**400** | Bad Request. The request contains syntax errors or is malformed (e.g., malformed JSON, invalid protocol formatting, illegal characters in query strings). The server cannot parse the request.  |  -  |
**401** | Unauthenticated - API authentication failed. Ensure you have successfully generated a valid API key, included the API key in your request via Basic Auth, and the API key is valid for your IP range. For help with connectivity issues, please contact FactSet support.  |  -  |
**403** | Forbidden - You do not have permission to access this endpoint or resource. Your API key or account may not have the required access level. Please reach out to your FactSet Account Team for assistance with authorization.  |  -  |
**404** | Not Found - The requested endpoint or resource does not exist. Please verify that the endpoint path is correct, all required path parameters are provided, and the resource identifier (if any) is valid.  |  -  |
**422** | Unprocessable Entity - Your request data was syntactically correct but semantically invalid. This can occur for validation errors such as invalid date format, invalid parameter values, missing required parameters, invalid enum values, or invalid date ranges. Check the required parameters and their value constraints.  |  -  |
**429** | Too Many Requests - You have exceeded the allowed request rate for this API. Please wait and retry your request after some time.  |  -  |
**500** | Internal Server Error - An unexpected error occurred on the server. Please try your request again. If the problem persists, contact FactSet support and provide the error ID from the response for investigation.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

