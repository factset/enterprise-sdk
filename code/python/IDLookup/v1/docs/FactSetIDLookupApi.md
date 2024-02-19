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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IDLookup
from fds.sdk.IDLookup.api import fact_set_id_lookup_api
from fds.sdk.IDLookup.models import *
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
configuration = fds.sdk.IDLookup.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IDLookup.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IDLookup.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fact_set_id_lookup_api.FactSetIDLookupApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
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

    try:
        # Search funtionality to return tickers, company names and unique identifiers for FactSet data
        # example passing only required values which don't have defaults set
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

