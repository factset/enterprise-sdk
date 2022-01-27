# fds.sdk.IDLookup.FactSetIDLookupApi

All URIs are relative to *https://api.factset.com/idsearch*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search_companyname**](FactSetIDLookupApi.md#search_companyname) | **POST** /v1/idsearch | Search funtionality to return tickers, company names and unique identifiers for FactSet data


# **search_companyname**
> LookupResponse search_companyname(lookup_request)

Search funtionality to return tickers, company names and unique identifiers for FactSet data

Service will accept request in JSON formatted request body. The request is sent by passing a query which is an array conitaining search query objects with parameters. The parameters contain search term and filters defined by the end user. This would display a specific set of identifiers based on the request. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IDLookup
from fds.sdk.IDLookup.api import fact_set_id_lookup_api
from fds.sdk.IDLookup.model.lookup_request import LookupRequest
from fds.sdk.IDLookup.model.lookup_response import LookupResponse
from fds.sdk.IDLookup.model.error_response import ErrorResponse
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/idsearch
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.IDLookup.Configuration(
    host = "https://api.factset.com/idsearch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.IDLookup.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.IDLookup.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IDLookup.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fact_set_id_lookup_api.FactSetIDLookupApi(api_client)
    lookup_request = LookupRequest(
        query=LookupObject(
            pattern="US",
            entities=["bonds"],
            filters=FilterParams(
                include=[
                    IncludeExcludeObject(
                        field="maturity_year",
                        entity="bonds",
                        values=[
                            {},
                        ],
                    ),
                ],
                exclude=[
                    IncludeExcludeObject(
                        field="maturity_year",
                        entity="bonds",
                        values=[
                            {},
                        ],
                    ),
                ],
            ),
        ),
        settings=LookupLimit(
            result_limit=25,
        ),
    ) # LookupRequest | Post body to lookup any FactSet identifiers

    # example passing only required values which don't have defaults set
    try:
        # Search funtionality to return tickers, company names and unique identifiers for FactSet data
        api_response = api_instance.search_companyname(lookup_request)
        pprint(api_response)
    except fds.sdk.IDLookup.ApiException as e:
        print("Exception when calling FactSetIDLookupApi->search_companyname: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookup_request** | [**LookupRequest**](LookupRequest.md)| Post body to lookup any FactSet identifiers |

### Return type

[**LookupResponse**](LookupResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of securities |  -  |
**400** | Bad Request |  -  |
**401** | Authentication issue |  -  |
**403** | Forbidden |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

