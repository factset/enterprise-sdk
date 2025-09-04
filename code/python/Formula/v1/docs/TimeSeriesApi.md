# fds.sdk.Formula.TimeSeriesApi

All URIs are relative to *https://api.factset.com/formula-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_time_series_data_for_list**](TimeSeriesApi.md#get_time_series_data_for_list) | **POST** /time-series | Retrieve data items (FQL formulas) for a list of identifiers or defined universe.



# **get_time_series_data_for_list**
> TimeSeriesResponse get_time_series_data_for_list(time_series_request)

Retrieve data items (FQL formulas) for a list of identifiers or defined universe.

The `/time-series` endpoint is closely aligned with FactSet's powerful data retrieval language **FactSet Query Language (FQL)** which is optimized for time-series analysis. FQL can also perform sophisticated statistical, mathematical, logical, and other complex operations on the data.    This endpoint has a unique **TIMESERIES** data object that pairs the requested data with FactSet provided dates. This helps reduce the need for additional data requests and reduces the work required by users.  The `/time-series` endpoint supports Long Running asynchronous requests up to **30 minutes** via the `batch` parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Formula
from fds.sdk.Formula.api import time_series_api
from fds.sdk.Formula.models import *
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
configuration = fds.sdk.Formula.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Formula.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Formula.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = time_series_api.TimeSeriesApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    time_series_request = TimeSeriesRequest(
        data=TimeSeriesRequestData(
            ids=["FDS-US","IBM-US","XOM-US"],
            symbol_type="symbol_type_example",
            universe="FG_CONSTITUENTS(SP50,0,CLOSE)",
            universe_type="DEBT",
            universe_exclusion=[
                "INACTIVE",
            ],
            formulas=["P_PRICE(0,-2,D)","FG_COMPANY_NAME"],
            calendar="SEVENDAY",
            fsym_id="Y",
            display_name=["PRICE","COMPANY_NAME"],
            flatten="Y",
            dates="N",
            batch="Y",
        ),
    ) # TimeSeriesRequest | 

    try:
        # Retrieve data items (FQL formulas) for a list of identifiers or defined universe.
        # example passing only required values which don't have defaults set
        api_response_wrapper = api_instance.get_time_series_data_for_list(time_series_request)

        # This endpoint returns a response wrapper that contains different types of responses depending on the query.
        # To access the correct response type, you need to perform one additional step, as shown below.
        if api_response_wrapper.get_status_code() == 200:
            api_response = api_response_wrapper.get_response_200()
        if api_response_wrapper.get_status_code() == 202:
            api_response = api_response_wrapper.get_response_202()

        pprint(api_response)

    except fds.sdk.Formula.ApiException as e:
        print("Exception when calling TimeSeriesApi->get_time_series_data_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **time_series_request** | [**TimeSeriesRequest**](TimeSeriesRequest.md)|  |

### Return type

The endpoint generates varying objects correlating with the successful status code, encapsulated within a response wrapper housing the appropriate object. The response wrapper includes the subsequent response types:
- **200**: [**TimeSeriesResponse**](TimeSeriesResponse.md)
- **202**: [**BatchStatusResponse**](BatchStatusResponse.md)


### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Gets an array of &#x60;Response Objects&#x60; for a list of IDs and FQL formulas. |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  |
**202** | Batch request has been accepted. |  * Location - URL to poll for status of batch request. <br>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  |
**400** | Bad Request |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**401** | Missing or invalid authentication. |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**403** | Not Authorized. This error will will occur if the user lacks the required permissions or if the API request is made from an IP address not specified in the API Key configuration. |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**404** | Endpoint Not Found |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**405** | Method Not Allowed |  -  |
**406** | Bad Accept Header |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**408** | Request Timeout. This error may be returned if it takes more than 29 seconds for the request to process or if a batch request takes more than 30 minutes to process. |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**413** | Content Too Large. This error may be returned if the request payload size is too large to be processed in the alloted amount of time. |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**415** | Bad Content-Type Header |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**429** | Rate Limits Exceeded |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  * Retry-After -  <br>  |
**500** | Generic Server Error |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**501** | Not Implemented |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**503** | Service Temporarily Unavailable |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

