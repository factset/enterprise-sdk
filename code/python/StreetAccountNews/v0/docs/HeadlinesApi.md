# fds.sdk.StreetAccountNews.HeadlinesApi

All URIs are relative to *https://api.factset.com/research/news/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_street_account_headlines**](HeadlinesApi.md#get_street_account_headlines) | **POST** /streetaccount/headlines | Retrieve StreetAccount headlines for given filters
[**get_street_account_headlines_by_view**](HeadlinesApi.md#get_street_account_headlines_by_view) | **POST** /streetaccount/views/{id}/headlines | Retrieve StreetAccount headlines for given view



# **get_street_account_headlines**
> SearchResponse get_street_account_headlines()

Retrieve StreetAccount headlines for given filters

This endpoint will pull all headlines produced by StreetAccount and the full story body will be returned by the data set. Filters can be specified via the endpoint below.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

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

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    sa_headlines_request = SaHeadlinesRequest(
        data=SaHeadlinesRequestData(
            tickers=[
                SaHeadlinesRequestTickersObject(
                    name="S&P 500",
                    value="SP50",
                    type="Index",
                ),
            ],
            categories=[
                "Earnings",
            ],
            regions=[
                "United States",
            ],
            topics=[
                "Market Summaries",
            ],
            sectors=[
                "Gold & Silver",
            ],
            is_primary=True,
            date_range="Today",
            search_date=SaHeadlinesRequestDataSearchDate(
                start="2022-08-21T12:35:45Z",
                end="2022-08-29T08:10:30Z",
            ),
        ),
        meta=SaHeadlinesRequestMeta(
            pagination=SaHeadlinesRequestMetaPagination(
                limit=50,
                offset=100,
            ),
        ),
    ) # SaHeadlinesRequest | Filter Body which needs to be sent with request (optional)

    try:
        # Retrieve StreetAccount headlines for given filters
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_street_account_headlines(sa_headlines_request=sa_headlines_request)

        pprint(api_response)

    except fds.sdk.StreetAccountNews.ApiException as e:
        print("Exception when calling HeadlinesApi->get_street_account_headlines: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sa_headlines_request** | [**SaHeadlinesRequest**](SaHeadlinesRequest.md)| Filter Body which needs to be sent with request | [optional]

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
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_street_account_headlines_by_view**
> SearchResponse get_street_account_headlines_by_view(id)

Retrieve StreetAccount headlines for given view

This endpoint allows you to pull all headlines produced by StreetAccount for a saved view. The full story body will be returned by the data set. Views can be created via the ‘Create Views’ endpoint.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

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

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "SA News View" # str | view id of the view to return headlines for
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    sa_headlines_request_by_view = SaHeadlinesRequestByView(
        data=SaHeadlinesRequestByViewData(
            date_range="Today",
            search_date=SaHeadlinesRequestDataSearchDate(
                start="2022-08-21T12:35:45Z",
                end="2022-08-29T08:10:30Z",
            ),
        ),
        meta=SaHeadlinesRequestMeta(
            pagination=SaHeadlinesRequestMetaPagination(
                limit=50,
                offset=100,
            ),
        ),
    ) # SaHeadlinesRequestByView | View body which needs to be sent with request (optional)

    try:
        # Retrieve StreetAccount headlines for given view
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_street_account_headlines_by_view(id, sa_headlines_request_by_view=sa_headlines_request_by_view)

        pprint(api_response)

    except fds.sdk.StreetAccountNews.ApiException as e:
        print("Exception when calling HeadlinesApi->get_street_account_headlines_by_view: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| view id of the view to return headlines for |
 **sa_headlines_request_by_view** | [**SaHeadlinesRequestByView**](SaHeadlinesRequestByView.md)| View body which needs to be sent with request | [optional]

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
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

