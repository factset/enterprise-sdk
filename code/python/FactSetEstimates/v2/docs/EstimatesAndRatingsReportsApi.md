# fds.sdk.FactSetEstimates.EstimatesAndRatingsReportsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_analyst_ratings**](EstimatesAndRatingsReportsApi.md#get_analyst_ratings) | **GET** /factset-estimates/v2/company-reports/analyst-ratings | Retrieves the historical monthly view of analyst ratings for a given identifier.
[**get_estimate_types**](EstimatesAndRatingsReportsApi.md#get_estimate_types) | **GET** /factset-estimates/v2/company-reports/estimate-types | Returns a list of valid estimate types.
[**get_estimates**](EstimatesAndRatingsReportsApi.md#get_estimates) | **GET** /factset-estimates/v2/company-reports/forecast | Returns forecasted estimates.
[**get_surprise_history**](EstimatesAndRatingsReportsApi.md#get_surprise_history) | **GET** /factset-estimates/v2/company-reports/surprise-history | Surprise History



# **get_analyst_ratings**
> AnalystRatingResponse get_analyst_ratings(id)

Retrieves the historical monthly view of analyst ratings for a given identifier.

Returns historical monthly view of analyst ratings for given identifier upto a period of 12 months. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEstimates
from fds.sdk.FactSetEstimates.api import estimates_and_ratings_reports_api
from fds.sdk.FactSetEstimates.models import *
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
configuration = fds.sdk.FactSetEstimates.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetEstimates.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEstimates.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = estimates_and_ratings_reports_api.EstimatesAndRatingsReportsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "AAPL-US" # str | The requested security identifier. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. 

    try:
        # Retrieves the historical monthly view of analyst ratings for a given identifier.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_analyst_ratings(id)

        pprint(api_response)

    except fds.sdk.FactSetEstimates.ApiException as e:
        print("Exception when calling EstimatesAndRatingsReportsApi->get_analyst_ratings: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The requested security identifier. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs.  |

### Return type

[**AnalystRatingResponse**](AnalystRatingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Analyst-ratings data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_estimate_types**
> EstimateTypesResponse get_estimate_types()

Returns a list of valid estimate types.

This endpoint retrieves a list of valid estimate types that can be used in the /company-reports/forecast and /company-reports/surprise-history end points. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEstimates
from fds.sdk.FactSetEstimates.api import estimates_and_ratings_reports_api
from fds.sdk.FactSetEstimates.models import *
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
configuration = fds.sdk.FactSetEstimates.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetEstimates.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEstimates.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = estimates_and_ratings_reports_api.EstimatesAndRatingsReportsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Returns a list of valid estimate types.
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_estimate_types()

        pprint(api_response)

    except fds.sdk.FactSetEstimates.ApiException as e:
        print("Exception when calling EstimatesAndRatingsReportsApi->get_estimate_types: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**EstimateTypesResponse**](EstimateTypesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Estimate type data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_estimates**
> EstimateResponse get_estimates(id, estimate_type)

Returns forecasted estimates.

This endpoint returns up to 4 years of forecasted consensus estimates made by analysts for various financial metrics such as EPS, Sales, and more.  **Note :**   Due to variations in methodology, with the workstation using intra-day prices and our API using the previous day's closing prices, there may be some minor differences in the values of FactSet Estimates Valuation Items. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEstimates
from fds.sdk.FactSetEstimates.api import estimates_and_ratings_reports_api
from fds.sdk.FactSetEstimates.models import *
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
configuration = fds.sdk.FactSetEstimates.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetEstimates.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEstimates.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = estimates_and_ratings_reports_api.EstimatesAndRatingsReportsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "IBM-US" # str | The requested security identifier. Accepted ID types include Market Ticker, SEDOL, ISIN, CUSIP, or FactSet Permanent Id.
    estimate_type = "EPS" # str | The requested estimate type. Please use /meta/estimate-types to find all allowed values for this parameter.
    periodicity = "ANN" # str | The periodicity for the estimates requested, allowing you to fetch Quarterly and Annual Estimates.   * **ANN** - Annual   * **QTR** - Quarterly  (optional) if omitted the server will use the default value of "ANN"

    try:
        # Returns forecasted estimates.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_estimates(id, estimate_type, periodicity=periodicity)

        pprint(api_response)

    except fds.sdk.FactSetEstimates.ApiException as e:
        print("Exception when calling EstimatesAndRatingsReportsApi->get_estimates: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The requested security identifier. Accepted ID types include Market Ticker, SEDOL, ISIN, CUSIP, or FactSet Permanent Id. |
 **estimate_type** | **str**| The requested estimate type. Please use /meta/estimate-types to find all allowed values for this parameter. |
 **periodicity** | **str**| The periodicity for the estimates requested, allowing you to fetch Quarterly and Annual Estimates.   * **ANN** - Annual   * **QTR** - Quarterly  | [optional] if omitted the server will use the default value of "ANN"

### Return type

[**EstimateResponse**](EstimateResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Estimate data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_surprise_history**
> SurpriseHistoryResponse get_surprise_history(id, estimate_type)

Surprise History

Returns surprise history for the given security

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEstimates
from fds.sdk.FactSetEstimates.api import estimates_and_ratings_reports_api
from fds.sdk.FactSetEstimates.models import *
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
configuration = fds.sdk.FactSetEstimates.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetEstimates.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEstimates.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = estimates_and_ratings_reports_api.EstimatesAndRatingsReportsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "IBM-US" # str | The requested security identifier. Accepted ID types include Market Ticker, SEDOL, ISIN, CUSIP, or FactSet Permanent Id.
    estimate_type = "EPS" # str | The requested estimate type. Please use /meta/estimate-types to find all allowed values for this parameter.
    periodicity = "ANN" # str | The periodicity for the estimates requested, allowing you to fetch Quarterly and Annual Estimates.   * **ANN** - Annual   * **QTR** - Quarterly  (optional) if omitted the server will use the default value of "ANN"
    pagination_limit = 50 # int | Specifies the number of results to return per page. (optional) if omitted the server will use the default value of 50
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional) if omitted the server will use the default value of 0

    try:
        # Surprise History
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_surprise_history(id, estimate_type, periodicity=periodicity, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetEstimates.ApiException as e:
        print("Exception when calling EstimatesAndRatingsReportsApi->get_surprise_history: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The requested security identifier. Accepted ID types include Market Ticker, SEDOL, ISIN, CUSIP, or FactSet Permanent Id. |
 **estimate_type** | **str**| The requested estimate type. Please use /meta/estimate-types to find all allowed values for this parameter. |
 **periodicity** | **str**| The periodicity for the estimates requested, allowing you to fetch Quarterly and Annual Estimates.   * **ANN** - Annual   * **QTR** - Quarterly  | [optional] if omitted the server will use the default value of "ANN"
 **pagination_limit** | **int**| Specifies the number of results to return per page. | [optional] if omitted the server will use the default value of 50
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] if omitted the server will use the default value of 0

### Return type

[**SurpriseHistoryResponse**](SurpriseHistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

