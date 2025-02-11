# fds.sdk.StreetAccountNews.HeadlinesApi

All URIs are relative to *https://api.factset.com/streetaccount/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_street_account_headlines**](HeadlinesApi.md#get_street_account_headlines) | **POST** /headlines | Retrieve StreetAccount headlines for given filters
[**get_street_account_headlines_by_view**](HeadlinesApi.md#get_street_account_headlines_by_view) | **POST** /headlines/view | Retrieve StreetAccount headlines for given view



# **get_street_account_headlines**
> HeadlinesResponse get_street_account_headlines()

Retrieve StreetAccount headlines for given filters

This endpoint will pull all headlines produced by StreetAccount and the full story body will be returned by the data set. Filters can be specified via the endpoint below. The attributes field in the request body can be used to specify which fields are returned in the response. If attributes are empty or not specified, the response does not omit attributes.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StreetAccountNews
from fds.sdk.StreetAccountNews.api import headlines_api
from fds.sdk.StreetAccountNews.models import *
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
configuration = fds.sdk.StreetAccountNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StreetAccountNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StreetAccountNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = headlines_api.HeadlinesApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    headlines_request = HeadlinesRequest(
        data=HeadlinesRequestData(
            tickers=[
                HeadlinesRequestTickersObject(
                    value="SP50",
                    type="Index",
                ),
            ],
            is_primary=True,
            categories=[
                "Earnings",
            ],
            topics=[
                "Market Summaries",
            ],
            regions=[
                "North America",
            ],
            sectors=[
                "Financial",
            ],
            predefined_range="today",
            search_time=HeadlinesRequestDataSearchTime(
                start=dateutil_parser('2022-08-21T12:35:45Z'),
                end=dateutil_parser('2022-08-29T08:10:30Z'),
            ),
        ),
        meta=HeadlinesRequestMeta(
            pagination=HeadlinesRequestMetaPagination(
                limit=50,
                offset=100,
            ),
            attributes=["headlines"],
        ),
    ) # HeadlinesRequest | /filters endpoint contains the filters associated with the optional parameters in the request body. (optional)

    try:
        # Retrieve StreetAccount headlines for given filters
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_street_account_headlines(headlines_request=headlines_request)

        pprint(api_response)

    except fds.sdk.StreetAccountNews.ApiException as e:
        print("Exception when calling HeadlinesApi->get_street_account_headlines: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headlines_request** | [**HeadlinesRequest**](HeadlinesRequest.md)| /filters endpoint contains the filters associated with the optional parameters in the request body. | [optional]

### Return type

[**HeadlinesResponse**](HeadlinesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns the headlines and associated story information for given filters. |  -  |
**400** | Bad Request. This can occur for invalid parameter. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
**404** | Not Found |  -  |
**429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_street_account_headlines_by_view**
> HeadlinesResponse get_street_account_headlines_by_view()

Retrieve StreetAccount headlines for given view

This endpoint allows you to pull all headlines produced by StreetAccount for a saved view. The full story body will be returned by the data set. Views can be created via the 'Create Views' endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StreetAccountNews
from fds.sdk.StreetAccountNews.api import headlines_api
from fds.sdk.StreetAccountNews.models import *
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
configuration = fds.sdk.StreetAccountNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StreetAccountNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StreetAccountNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = headlines_api.HeadlinesApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    headlines_request_by_view = HeadlinesRequestByView(
        data=HeadlinesRequestByViewData(
            name="SA News View",
            predefined_range="today",
            search_time=HeadlinesRequestByViewDataSearchTime(
                start=dateutil_parser('2022-08-21T12:35:45Z'),
                end=dateutil_parser('2022-08-29T08:10:30Z'),
            ),
        ),
        meta=HeadlinesRequestByViewMeta(
            pagination=HeadlinesRequestMetaPagination(
                limit=50,
                offset=100,
            ),
        ),
    ) # HeadlinesRequestByView | View body which needs to be sent with request (optional)

    try:
        # Retrieve StreetAccount headlines for given view
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_street_account_headlines_by_view(headlines_request_by_view=headlines_request_by_view)

        pprint(api_response)

    except fds.sdk.StreetAccountNews.ApiException as e:
        print("Exception when calling HeadlinesApi->get_street_account_headlines_by_view: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headlines_request_by_view** | [**HeadlinesRequestByView**](HeadlinesRequestByView.md)| View body which needs to be sent with request | [optional]

### Return type

[**HeadlinesResponse**](HeadlinesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns the headlines and associated story information for given view. |  -  |
**400** | Bad Request. This can occur for invalid parameter. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
**404** | Not Found |  -  |
**429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

