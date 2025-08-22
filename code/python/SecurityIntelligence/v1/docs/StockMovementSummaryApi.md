# fds.sdk.SecurityIntelligence.StockMovementSummaryApi

All URIs are relative to *https://api.factset.com/security-intelligence/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_stock_movement_summary**](StockMovementSummaryApi.md#get_stock_movement_summary) | **GET** /company/stock-movement-summary | Get Stock Movement Summary



# **get_stock_movement_summary**
> StockMovementResponse get_stock_movement_summary(identifier)

Get Stock Movement Summary

Returns the stock price movement over the last trading period or intraday, and aims to explain that movement using StreetAccount news over the last two trading days.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SecurityIntelligence
from fds.sdk.SecurityIntelligence.api import stock_movement_summary_api
from fds.sdk.SecurityIntelligence.models import *
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
configuration = fds.sdk.SecurityIntelligence.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SecurityIntelligence.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SecurityIntelligence.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = stock_movement_summary_api.StockMovementSummaryApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    identifier = "identifier_example" # str | Ticker or FactSet Entity ID of the company
    output_type = "default" # str | Type of output to return. default for full summary and oneline for one-line summary. (optional) if omitted the server will use the default value of "default"

    try:
        # Get Stock Movement Summary
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_stock_movement_summary(identifier, output_type=output_type)

        pprint(api_response)

    except fds.sdk.SecurityIntelligence.ApiException as e:
        print("Exception when calling StockMovementSummaryApi->get_stock_movement_summary: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**| Ticker or FactSet Entity ID of the company |
 **output_type** | **str**| Type of output to return. default for full summary and oneline for one-line summary. | [optional] if omitted the server will use the default value of "default"

### Return type

[**StockMovementResponse**](StockMovementResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with stock movement data |  -  |
**400** | Bad request |  -  |
**401** | Authentication Failed |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

