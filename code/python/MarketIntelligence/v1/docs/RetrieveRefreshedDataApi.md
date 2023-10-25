# fds.sdk.MarketIntelligence.RetrieveRefreshedDataApi

All URIs are relative to *https://api.factset.com/market-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_data_poll_id_result_get**](RetrieveRefreshedDataApi.md#get_data_poll_id_result_get) | **GET** /get-data/{poll_id}/result | Retrieve data for desired report.



# **get_data_poll_id_result_get**
> ReportDataHeader get_data_poll_id_result_get(poll_id)

Retrieve data for desired report.

Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.MarketIntelligence
from fds.sdk.MarketIntelligence.api import retrieve_refreshed_data_api
from fds.sdk.MarketIntelligence.models import *
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
configuration = fds.sdk.MarketIntelligence.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.MarketIntelligence.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.MarketIntelligence.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = retrieve_refreshed_data_api.RetrieveRefreshedDataApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    poll_id = "poll_id_example" # str | example: 65ba6dd63fb366464646426d0b

    try:
        # Retrieve data for desired report.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_data_poll_id_result_get(poll_id)

        pprint(api_response)

    except fds.sdk.MarketIntelligence.ApiException as e:
        print("Exception when calling RetrieveRefreshedDataApi->get_data_poll_id_result_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poll_id** | **str**| example: 65ba6dd63fb366464646426d0b |

### Return type

[**ReportDataHeader**](ReportDataHeader.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. Report data retrieved. |  -  |
**400** | Unknown Error. |  -  |
**401** | Missing/invalid Credentials or authentication failure |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

