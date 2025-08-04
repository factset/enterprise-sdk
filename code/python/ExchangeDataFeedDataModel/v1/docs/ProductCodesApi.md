# fds.sdk.ExchangeDataFeedDataModel.ProductCodesApi

All URIs are relative to *https://api.factset.com/rtdatamodel/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_products**](ProductCodesApi.md#get_products) | **GET** /products | Request the enumeration table for FactSet product codes.



# **get_products**
> ProductsResponse get_products()

Request the enumeration table for FactSet product codes.

Data can be returned in CSV, JSON or XML format, use the `format` parameter to change from the default JSON format. *You must be logged into the Developer Portal and obtain an **[API Key](https://developer.factset.com/factset/api-key-listing)** for ''Try it Out'' to receive a successful server response.  Select **Authorize** button or visit **[Authentication Support](https://developer.factset.com/authentication)** for more details.* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ExchangeDataFeedDataModel
from fds.sdk.ExchangeDataFeedDataModel.api import product_codes_api
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
    api_instance = product_codes_api.ProductCodesApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    product_code = [9001,10001,10010] # [int] | Allows filtering of specific product codes in the response. (optional)
    format = "json" # str | The format of the output file. (optional)

    try:
        # Request the enumeration table for FactSet product codes.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_products(product_code=product_code, format=format)

        pprint(api_response)

    except fds.sdk.ExchangeDataFeedDataModel.ApiException as e:
        print("Exception when calling ProductCodesApi->get_products: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_code** | **[int]**| Allows filtering of specific product codes in the response. | [optional]
 **format** | **str**| The format of the output file. | [optional]

### Return type

[**ProductsResponse**](ProductsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response for the FactSet product codes table |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**402** | Invalid HTTP method. Either the method is not GET or exceeds the maximum request length (currently set at 5000 bytes). The description field will indicate the exact reason. |  -  |
**404** | The provided endpoint is not valid. |  -  |
**500** | Internal Server Error. The server encountered an unexpected condition that prevented it from fulfilling the request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

