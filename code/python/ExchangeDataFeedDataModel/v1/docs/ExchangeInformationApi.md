# fds.sdk.ExchangeDataFeedDataModel.ExchangeInformationApi

All URIs are relative to *https://api.factset.com/rtdatamodel/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_exchanges**](ExchangeInformationApi.md#get_exchanges) | **GET** /exchanges | Request metadata for covered Real-Time market data venues at FactSet.



# **get_exchanges**
> ExchangesResponse get_exchanges()

Request metadata for covered Real-Time market data venues at FactSet.

Returns a list of exchanges with details like exchange code, name, market open and close times, etc.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ExchangeDataFeedDataModel
from fds.sdk.ExchangeDataFeedDataModel.api import exchange_information_api
from fds.sdk.ExchangeDataFeedDataModel.models import *
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
configuration = fds.sdk.ExchangeDataFeedDataModel.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ExchangeDataFeedDataModel.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ExchangeDataFeedDataModel.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = exchange_information_api.ExchangeInformationApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    product_code = [9001,10001,10010] # [int] | Allows filtering of specific product codes in the response. (optional)
    exchange_code = [14034,36,25] # [int] | Allows filtering of specific exchange codes in the response. (optional)
    iso_code = ["USA","LON","PAR"] # [str] | Allows filtering on specific ISO code in the response. (optional)
    format = "json" # str | The format of the output file. (optional)

    try:
        # Request metadata for covered Real-Time market data venues at FactSet.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_exchanges(product_code=product_code, exchange_code=exchange_code, iso_code=iso_code, format=format)

        pprint(api_response)

    except fds.sdk.ExchangeDataFeedDataModel.ApiException as e:
        print("Exception when calling ExchangeInformationApi->get_exchanges: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_code** | **[int]**| Allows filtering of specific product codes in the response. | [optional]
 **exchange_code** | **[int]**| Allows filtering of specific exchange codes in the response. | [optional]
 **iso_code** | **[str]**| Allows filtering on specific ISO code in the response. | [optional]
 **format** | **str**| The format of the output file. | [optional]

### Return type

[**ExchangesResponse**](ExchangesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with a list of exchanges |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API key for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**402** | Invalid HTTP method. Either the method is not GET or exceeds the maximum request length (currently set at 5000 bytes). The description field will indicate the exact reason. |  -  |
**404** | The provided endpoint is not valid. |  -  |
**500** | Internal Server Error. The server encountered an unexpected condition that prevented it from fulfilling the request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

