# fds.sdk.StreetAccountNews.FiltersApi

All URIs are relative to *https://api.factset.com/research/news/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_street_account_filters**](FiltersApi.md#get_street_account_filters) | **GET** /streetaccount/filters | Retrieve all StreetAccount filters



# **get_street_account_filters**
> FilterResponse get_street_account_filters()

Retrieve all StreetAccount filters

Add StreetAccount filters (watchlists, company filters, market topics, regions and sectors) to filter down StreetAccount headlines by the relevant categories. Set the structured and/or flattened flag. If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StreetAccountNews
from fds.sdk.StreetAccountNews.api import filters_api
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
    api_instance = filters_api.FiltersApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    structured = True # bool | Pass structured to generate a structured view of the available filters. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    flattened = True # bool | Pass flattened to generate a structured view of the available filters. (optional)

    try:
        # Retrieve all StreetAccount filters
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_street_account_filters(structured=structured, flattened=flattened)

        pprint(api_response)

    except fds.sdk.StreetAccountNews.ApiException as e:
        print("Exception when calling FiltersApi->get_street_account_filters: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **structured** | **bool**| Pass structured to generate a structured view of the available filters. | [optional]
 **flattened** | **bool**| Pass flattened to generate a structured view of the available filters. | [optional]

### Return type

[**FilterResponse**](FilterResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

