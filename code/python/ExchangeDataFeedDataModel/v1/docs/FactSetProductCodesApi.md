# fds.sdk.ExchangeDataFeedDataModel.FactSetProductCodesApi

All URIs are relative to *https://api.factset.com/RTDataModel*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_products**](FactSetProductCodesApi.md#get_products) | **GET** /products | Request the enumeration table for FactSet product codes.



# **get_products**
> RTDataModelProducts get_products()

Request the enumeration table for FactSet product codes.

 Data can be returned in CSV, JSON or XML format, use the `format` parameter to chnage from the default JSON format.    '*You must be logged into the Developer Portal and obtain an **[API Key](https://developer.factset.com/factset/api-key-listing)** for ''Try it Out'' to receive a successful server response. Select **Authorize** button or visit **[Authentication Support](https://developer.factset.com/authentication)** for more details.*' 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ExchangeDataFeedDataModel
from fds.sdk.ExchangeDataFeedDataModel.api import fact_set_product_codes_api
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
    api_instance = fact_set_product_codes_api.FactSetProductCodesApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    format = "json" # str | The format of the output file.<p>**Try it Out** - All formats available</p> (optional) if omitted the server will use the default value of "json"

    try:
        # Request the enumeration table for FactSet product codes.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_products(format=format)

        pprint(api_response)

    except fds.sdk.ExchangeDataFeedDataModel.ApiException as e:
        print("Exception when calling FactSetProductCodesApi->get_products: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| The format of the output file.&lt;p&gt;**Try it Out** - All formats available&lt;/p&gt; | [optional] if omitted the server will use the default value of "json"

### Return type

[**RTDataModelProducts**](RTDataModelProducts.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response for the FactSet product codes table |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. |  -  |
**402** | Invalid method. |  -  |
**404** | The provided report name is not valid. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

