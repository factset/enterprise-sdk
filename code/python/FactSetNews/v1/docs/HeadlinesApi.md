# fds.sdk.FactSetNews.HeadlinesApi

All URIs are relative to *https://api.factset.com/content/news/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_fact_set_news_headlines**](HeadlinesApi.md#get_fact_set_news_headlines) | **POST** /headlines | Retrieve FactSet News headlines for the given filters
[**get_fact_set_news_headlines_by_view**](HeadlinesApi.md#get_fact_set_news_headlines_by_view) | **POST** /headlines/view | Retrieve FactSet News headlines for given view



# **get_fact_set_news_headlines**
> SearchResponse get_fact_set_news_headlines()

Retrieve FactSet News headlines for the given filters

This endpoint will pull all FactSet News headlines. Filters can be specified via the endpoint below. Please refer to `/filters` endpoint to obtain the values.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetNews
from fds.sdk.FactSetNews.api import headlines_api
from fds.sdk.FactSetNews.models import *
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
configuration = fds.sdk.FactSetNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetNews.ApiClient(configuration) as api_client:
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
            countries=[
                "India",
            ],
            regions=[
                "North America",
            ],
            sources=[
                "Business Wire",
            ],
            topics=[
                "Market Summaries",
            ],
            predefined_range="today",
            search_time=HeadlinesRequestDataSearchTime(
                start=dateutil_parser('2022-08-21T12:35:45Z'),
                end="2022-08-29T08:10:30Z",
            ),
        ),
        meta=HeadlinesRequestMeta(
            pagination=HeadlinesRequestByViewMetaPagination(
                limit=50,
                offset=0,
            ),
            attributes=["headlines"],
        ),
    ) # HeadlinesRequest | Filter Body which needs to be sent with request. (optional)

    try:
        # Retrieve FactSet News headlines for the given filters
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_fact_set_news_headlines(headlines_request=headlines_request)

        pprint(api_response)

    except fds.sdk.FactSetNews.ApiException as e:
        print("Exception when calling HeadlinesApi->get_fact_set_news_headlines: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headlines_request** | [**HeadlinesRequest**](HeadlinesRequest.md)| Filter Body which needs to be sent with request. | [optional]

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated |  -  |
**404** | Not Found |  -  |
**429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fact_set_news_headlines_by_view**
> SearchResponse get_fact_set_news_headlines_by_view()

Retrieve FactSet News headlines for given view

This endpoint allows you to pull all FactSet News Headlines for a saved view. Views can be created via the 'Create Views' endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetNews
from fds.sdk.FactSetNews.api import headlines_api
from fds.sdk.FactSetNews.models import *
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
configuration = fds.sdk.FactSetNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = headlines_api.HeadlinesApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    headlines_request_by_view = HeadlinesRequestByView(
        data=HeadlinesRequestByViewData(
            name="FactSet News View",
            predefined_range="today",
            search_time=HeadlinesRequestByViewDataSearchTime(
                start=dateutil_parser('2022-08-21T12:35:45Z'),
                end=dateutil_parser('2022-08-29T08:10:30Z'),
            ),
        ),
        meta=HeadlinesRequestByViewMeta(
            pagination=HeadlinesRequestByViewMetaPagination(
                limit=50,
                offset=0,
            ),
        ),
    ) # HeadlinesRequestByView | View body which needs to be sent with request. (optional)

    try:
        # Retrieve FactSet News headlines for given view
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_fact_set_news_headlines_by_view(headlines_request_by_view=headlines_request_by_view)

        pprint(api_response)

    except fds.sdk.FactSetNews.ApiException as e:
        print("Exception when calling HeadlinesApi->get_fact_set_news_headlines_by_view: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headlines_request_by_view** | [**HeadlinesRequestByView**](HeadlinesRequestByView.md)| View body which needs to be sent with request. | [optional]

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated |  -  |
**404** | Not Found |  -  |
**429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

