# fds.sdk.FactSetRBICS.IndustryApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_rbics_industry_focus**](IndustryApi.md#get_rbics_industry_focus) | **GET** /factset-rbics/v1/industry/focus | Get the list of companies with a specific RBICS Focus classification.
[**get_rbics_industry_focus_for_list**](IndustryApi.md#get_rbics_industry_focus_for_list) | **POST** /factset-rbics/v1/industry/focus | Get the list of companies with a specific Industry Focus classification.
[**get_rbics_industry_revenue**](IndustryApi.md#get_rbics_industry_revenue) | **GET** /factset-rbics/v1/industry/revenue | Get companies and their revenue exposure to a specific RBICS L6 Sub-Industry.
[**get_rbics_industry_revenue_for_list**](IndustryApi.md#get_rbics_industry_revenue_for_list) | **POST** /factset-rbics/v1/industry/revenue | Get companies and their revenue exposure to a specific RBICS L6 Sub-Industry.



# **get_rbics_industry_focus**
> IndustryFocusResponse get_rbics_industry_focus(rbics_ids)

Get the list of companies with a specific RBICS Focus classification.

Identify all companies whose primary business falls within a specific RBICS industry. This endpoint screens your universe based on the RBICS Focus classification.   A company's Focus is the lowest-level (Level 6) RBICS sub-industry from which it derives 50% or more of its annual revenue.   Provide a list of one or more RBICS IDs (up to Level 6) to retrieve the list of companies whose primary business line falls within those sectors. A complete list of valid RBICS IDs can be retrieved using the `/structure` endpoints. Use the `startDate` and `endDate` parameters to screen for companies that held this classification during a specific historical period. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetRBICS
from fds.sdk.FactSetRBICS.api import industry_api
from fds.sdk.FactSetRBICS.models import *
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
configuration = fds.sdk.FactSetRBICS.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetRBICS.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetRBICS.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = industry_api.IndustryApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    rbics_ids = ["101010000000","55"] # [str] | A list of RBICS industry classification identifiers. These are used to filter the results to specific industries. IDs can range from Level 1 (Economy) to Level 6 (Sub-Industry). A complete list of valid RBICS IDs can be retrieved using the `/structure` endpoints. 
    start_date = dateutil_parser('2021-08-27').date() # date | Specifies the start date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and forward. The `startDate` must be equal to or before the `endDate`. Future dates (T+1) are not accepted in this endpoint.  Note:  - If omitted while `endDate` is specified: Data will be fetched from the earliest available record up to the specified end date. - If both `startDate` and `endDate` are omitted: The response will return the latest available data.  (optional)
    end_date = dateutil_parser('2022-08-27').date() # date | Specifies the end date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and earlier. The `endDate` must be equal to or after the `startDate`. Future dates (T+1) are not accepted in this endpoint.  Note: - If omitted (with `startDate` specified): Data will be returned from the specified start date up to the most recent available date. - If both `startDate` and `endDate` are omitted: The response will return the latest available data.  (optional)

    try:
        # Get the list of companies with a specific RBICS Focus classification.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_rbics_industry_focus(rbics_ids, start_date=start_date, end_date=end_date)

        pprint(api_response)

    except fds.sdk.FactSetRBICS.ApiException as e:
        print("Exception when calling IndustryApi->get_rbics_industry_focus: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rbics_ids** | **[str]**| A list of RBICS industry classification identifiers. These are used to filter the results to specific industries. IDs can range from Level 1 (Economy) to Level 6 (Sub-Industry). A complete list of valid RBICS IDs can be retrieved using the &#x60;/structure&#x60; endpoints.  |
 **start_date** | **date**| Specifies the start date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and forward. The &#x60;startDate&#x60; must be equal to or before the &#x60;endDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note:  - If omitted while &#x60;endDate&#x60; is specified: Data will be fetched from the earliest available record up to the specified end date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  | [optional]
 **end_date** | **date**| Specifies the end date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and earlier. The &#x60;endDate&#x60; must be equal to or after the &#x60;startDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note: - If omitted (with &#x60;startDate&#x60; specified): Data will be returned from the specified start date up to the most recent available date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  | [optional]

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
**200** | Successful response returning a list of companies with a specific RBICS Focus classification. |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_rbics_industry_focus_for_list**
> IndustryFocusResponse get_rbics_industry_focus_for_list(industry_request)

Get the list of companies with a specific Industry Focus classification.

Identify all companies whose primary business falls within a specific RBICS industry. This endpoint screens your universe based on the RBICS Focus classification.  A company's Focus is the lowest-level (Level 6) RBICS sub-industry from which it derives 50% or more of its annual revenue.  Provide a list of one or more RBICS IDs (up to Level 6) to retrieve the list of companies whose primary business line falls within those sectors. Use the `startDate` and `endDate` parameters to screen for companies that held this classification during a specific historical period. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetRBICS
from fds.sdk.FactSetRBICS.api import industry_api
from fds.sdk.FactSetRBICS.models import *
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
configuration = fds.sdk.FactSetRBICS.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetRBICS.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetRBICS.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = industry_api.IndustryApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    industry_request = IndustryRequest(
        rbics_ids=RbicsIndustryIds(["101010000000","55"]),
        start_date=dateutil_parser('Fri Aug 27 00:00:00 UTC 2021').date(),
        end_date=dateutil_parser('Fri Aug 27 00:00:00 UTC 2021').date(),
    ) # IndustryRequest | Request Body to request a list of Industry Focus objects.

    try:
        # Get the list of companies with a specific Industry Focus classification.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_rbics_industry_focus_for_list(industry_request)

        pprint(api_response)

    except fds.sdk.FactSetRBICS.ApiException as e:
        print("Exception when calling IndustryApi->get_rbics_industry_focus_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **industry_request** | [**IndustryRequest**](IndustryRequest.md)| Request Body to request a list of Industry Focus objects. |

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
**200** | Successful response returning a list of companies with a specific RBICS Focus classification. |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_rbics_industry_revenue**
> IndustryRevenueResponse get_rbics_industry_revenue(rbics_ids)

Get companies and their revenue exposure to a specific RBICS L6 Sub-Industry.

Screen for companies with revenue exposure to a specific RBICS Level 6 Sub-Industry. This endpoint identifies all companies that derive revenue from a specified sub-industry and returns the percentage of their total revenue attributable to that industry. This is a powerful tool for understanding the competitive landscape and supply chains at a granular level, beyond a company's primary classification. **Note:** The `rbicsIds` parameter for this endpoint must be a valid Level 6 Sub-Industry ID. Use the `startDate` and `endDate` parameters to control the time period for the underlying revenue reports. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetRBICS
from fds.sdk.FactSetRBICS.api import industry_api
from fds.sdk.FactSetRBICS.models import *
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
configuration = fds.sdk.FactSetRBICS.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetRBICS.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetRBICS.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = industry_api.IndustryApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    rbics_ids = ["551515453010"] # [str] | List of RBICS Level 6 Sub-Industry IDs to screen for companies by revenue exposure. **Note:** Only Level 6 IDs are supported for this endpoint. A complete list of valid Level 6 IDs can be retrieved using the `/structure` endpoints. 
    start_date = dateutil_parser('2021-08-27').date() # date | Specifies the start date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and forward. The `startDate` must be equal to or before the `endDate`. Future dates (T+1) are not accepted in this endpoint.  Note:  - If omitted while `endDate` is specified: Data will be fetched from the earliest available record up to the specified end date. - If both `startDate` and `endDate` are omitted: The response will return the latest available data.  (optional)
    end_date = dateutil_parser('2022-08-27').date() # date | Specifies the end date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and earlier. The `endDate` must be equal to or after the `startDate`. Future dates (T+1) are not accepted in this endpoint.  Note: - If omitted (with `startDate` specified): Data will be returned from the specified start date up to the most recent available date. - If both `startDate` and `endDate` are omitted: The response will return the latest available data.  (optional)

    try:
        # Get companies and their revenue exposure to a specific RBICS L6 Sub-Industry.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_rbics_industry_revenue(rbics_ids, start_date=start_date, end_date=end_date)

        pprint(api_response)

    except fds.sdk.FactSetRBICS.ApiException as e:
        print("Exception when calling IndustryApi->get_rbics_industry_revenue: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rbics_ids** | **[str]**| List of RBICS Level 6 Sub-Industry IDs to screen for companies by revenue exposure. **Note:** Only Level 6 IDs are supported for this endpoint. A complete list of valid Level 6 IDs can be retrieved using the &#x60;/structure&#x60; endpoints.  |
 **start_date** | **date**| Specifies the start date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and forward. The &#x60;startDate&#x60; must be equal to or before the &#x60;endDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note:  - If omitted while &#x60;endDate&#x60; is specified: Data will be fetched from the earliest available record up to the specified end date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  | [optional]
 **end_date** | **date**| Specifies the end date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and earlier. The &#x60;endDate&#x60; must be equal to or after the &#x60;startDate&#x60;. Future dates (T+1) are not accepted in this endpoint.  Note: - If omitted (with &#x60;startDate&#x60; specified): Data will be returned from the specified start date up to the most recent available date. - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data.  | [optional]

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
**200** | Successful response returning a list of companies and their revenue exposure to the requested RBICS Level 6 Sub-Industry. |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_rbics_industry_revenue_for_list**
> IndustryRevenueResponse get_rbics_industry_revenue_for_list(industry_revenue_request)

Get companies and their revenue exposure to a specific RBICS L6 Sub-Industry.

Screen for companies with revenue exposure to a specific RBICS Level 6 Sub-Industry. This endpoint identifies all companies that derive revenue from a specified sub-industry and returns the percentage of their total revenue attributable to that industry. This is a powerful tool for understanding the competitive landscape and supply chains at a granular level, beyond a company's primary classification. **Note:** The `rbicsIds` parameter for this endpoint must be a valid Level 6 Sub-Industry ID. Use the `startDate` and `endDate` parameters to control the time period for the underlying revenue reports. Use the POST method for large lists of `rbicsIds`. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetRBICS
from fds.sdk.FactSetRBICS.api import industry_api
from fds.sdk.FactSetRBICS.models import *
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
configuration = fds.sdk.FactSetRBICS.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetRBICS.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetRBICS.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = industry_api.IndustryApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    industry_revenue_request = IndustryRevenueRequest(
        rbics_ids=RbicsL6Ids(["551515453010"]),
        start_date=dateutil_parser('Fri Aug 27 00:00:00 UTC 2021').date(),
        end_date=dateutil_parser('Fri Aug 27 00:00:00 UTC 2021').date(),
    ) # IndustryRevenueRequest | Request Body to screen for companies with revenue exposure to a specific RBICS L6 Sub-Industry.

    try:
        # Get companies and their revenue exposure to a specific RBICS L6 Sub-Industry.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_rbics_industry_revenue_for_list(industry_revenue_request)

        pprint(api_response)

    except fds.sdk.FactSetRBICS.ApiException as e:
        print("Exception when calling IndustryApi->get_rbics_industry_revenue_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **industry_revenue_request** | [**IndustryRevenueRequest**](IndustryRevenueRequest.md)| Request Body to screen for companies with revenue exposure to a specific RBICS L6 Sub-Industry. |

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
**200** | Successful response returning a list of companies and their revenue exposure to the requested RBICS Level 6 Sub-Industry. |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

