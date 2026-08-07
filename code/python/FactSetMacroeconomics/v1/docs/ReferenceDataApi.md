# fds.sdk.FactSetMacroeconomics.ReferenceDataApi

All URIs are relative to *https://api.factset.com/content/economics/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_economic_event_reference_data**](ReferenceDataApi.md#get_economic_event_reference_data) | **GET** /meta/events | Retrieve reference data for events
[**get_fds_code_mapping**](ReferenceDataApi.md#get_fds_code_mapping) | **GET** /meta/series | Retrieve reference data for series



# **get_economic_event_reference_data**
> MetaEventsResponse get_economic_event_reference_data(type)

Retrieve reference data for events

Returns reference values for filtering and discovery. Use this endpoint to discover available indicators, countries, and FDS codes.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetMacroeconomics
from fds.sdk.FactSetMacroeconomics.api import reference_data_api
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
    api_instance = reference_data_api.ReferenceDataApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    type = "INDICATORS" # str | Specifies the type of reference data to return. The supported values are:  - `INDICATORS`: Returns available economic indicator codes for use with the `indicator` filter. - `COUNTRIES`: Returns supported country codes for use with the `countryCode` filter. - `FDS_CODES`: Returns available FDS codes. - `TIMEZONES`: Returns supported timezone values for use with the `timeZone` filter. 

    try:
        # Retrieve reference data for events
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_economic_event_reference_data(type)

        pprint(api_response)

    except fds.sdk.FactSetMacroeconomics.ApiException as e:
        print("Exception when calling ReferenceDataApi->get_economic_event_reference_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **str**| Specifies the type of reference data to return. The supported values are:  - &#x60;INDICATORS&#x60;: Returns available economic indicator codes for use with the &#x60;indicator&#x60; filter. - &#x60;COUNTRIES&#x60;: Returns supported country codes for use with the &#x60;countryCode&#x60; filter. - &#x60;FDS_CODES&#x60;: Returns available FDS codes. - &#x60;TIMEZONES&#x60;: Returns supported timezone values for use with the &#x60;timeZone&#x60; filter.  |

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
**200** | Successful response containing reference data. |  -  |
**400** | Bad Request. The request contains syntax errors or is malformed (e.g., malformed JSON, invalid protocol formatting, illegal characters in query strings). The server cannot parse the request.  |  -  |
**401** | Unauthenticated - API authentication failed. Ensure you have successfully generated a valid API key, included the API key in your request via Basic Auth, and the API key is valid for your IP range. For help with connectivity issues, please contact FactSet support.  |  -  |
**403** | Forbidden - You do not have permission to access this endpoint or resource. Your API key or account may not have the required access level. Please reach out to your FactSet Account Team for assistance with authorization.  |  -  |
**404** | Not Found - The requested endpoint or resource does not exist. Please verify that the endpoint path is correct, all required path parameters are provided, and the resource identifier (if any) is valid.  |  -  |
**422** | Unprocessable Entity - Your request data was syntactically correct but semantically invalid. This can occur for validation errors such as invalid date format, invalid parameter values, missing required parameters, invalid enum values, or invalid date ranges. Check the required parameters and their value constraints.  |  -  |
**429** | Too Many Requests - You have exceeded the allowed request rate for this API. Please wait and retry your request after some time.  |  -  |
**500** | Internal Server Error - An unexpected error occurred on the server. Please try your request again. If the problem persists, contact FactSet support and provide the error ID from the response for investigation.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fds_code_mapping**
> MetaSeriesResponse get_fds_code_mapping()

Retrieve reference data for series

Returns series metadata with FDS code mappings. Use this endpoint to discover available series, categories, and FDS code associations.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetMacroeconomics
from fds.sdk.FactSetMacroeconomics.api import reference_data_api
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
    api_instance = reference_data_api.ReferenceDataApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    search_text = "GDP" # str | Text to search for within series names. Restricts results to only series that match the provided search text. (optional)
    category = ["ECONOMICS"] # [str] | Filter series by major category. The supported categories are:  - `ECONOMICS`: Economic indicators and metrics. - `INTEREST_RATES`: Interest rate data and related metrics.  Multiple categories can be provided as comma-separated values.  (optional)
    country_code = "US" # str | ISO country code for filtering events by country. Use the `/meta/events?type=countries` endpoint to retrieve available country codes.  (optional)
    pagination_limit = 25 # int | Maximum number of results to return per page. If not specified, the default page size is applied.  (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Number of results to skip before returning the first result. Used for pagination in combination with `_paginationLimit`.  (optional) if omitted the server will use the default value of 0

    try:
        # Retrieve reference data for series
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_fds_code_mapping(search_text=search_text, category=category, country_code=country_code, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetMacroeconomics.ApiException as e:
        print("Exception when calling ReferenceDataApi->get_fds_code_mapping: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search_text** | **str**| Text to search for within series names. Restricts results to only series that match the provided search text. | [optional]
 **category** | **[str]**| Filter series by major category. The supported categories are:  - &#x60;ECONOMICS&#x60;: Economic indicators and metrics. - &#x60;INTEREST_RATES&#x60;: Interest rate data and related metrics.  Multiple categories can be provided as comma-separated values.  | [optional]
 **country_code** | **str**| ISO country code for filtering events by country. Use the &#x60;/meta/events?type&#x3D;countries&#x60; endpoint to retrieve available country codes.  | [optional]
 **pagination_limit** | **int**| Maximum number of results to return per page. If not specified, the default page size is applied.  | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Number of results to skip before returning the first result. Used for pagination in combination with &#x60;_paginationLimit&#x60;.  | [optional] if omitted the server will use the default value of 0

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
**200** | Successfully retrieved economic series metadata. |  -  |
**400** | Bad Request. The request contains syntax errors or is malformed (e.g., malformed JSON, invalid protocol formatting, illegal characters in query strings). The server cannot parse the request.  |  -  |
**401** | Unauthenticated - API authentication failed. Ensure you have successfully generated a valid API key, included the API key in your request via Basic Auth, and the API key is valid for your IP range. For help with connectivity issues, please contact FactSet support.  |  -  |
**403** | Forbidden - You do not have permission to access this endpoint or resource. Your API key or account may not have the required access level. Please reach out to your FactSet Account Team for assistance with authorization.  |  -  |
**404** | Not Found - The requested endpoint or resource does not exist. Please verify that the endpoint path is correct, all required path parameters are provided, and the resource identifier (if any) is valid.  |  -  |
**422** | Unprocessable Entity - Your request data was syntactically correct but semantically invalid. This can occur for validation errors such as invalid date format, invalid parameter values, missing required parameters, invalid enum values, or invalid date ranges. Check the required parameters and their value constraints.  |  -  |
**429** | Too Many Requests - You have exceeded the allowed request rate for this API. Please wait and retry your request after some time.  |  -  |
**500** | Internal Server Error - An unexpected error occurred on the server. Please try your request again. If the problem persists, contact FactSet support and provide the error ID from the response for investigation.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

