# fds.sdk.FactSetRBICS.TradeNamesApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_trade_names_for_list**](TradeNamesApi.md#get_trade_names_for_list) | **POST** /factset-rbics/v1/trade-names | Get a company&#39;s associated tradeNames and product lines.



# **get_trade_names_for_list**
> TradeNamesResponse get_trade_names_for_list(trade_names_request)

Get a company's associated tradeNames and product lines.

RBICS with TradeNames maps over 260,000 products, services and brands (a.k.a. TradeNames) to the granular sectors of the FactSet Revere Business Industry Classification System taxonomy, resulting in a multi-sector participation map for each company.   Whereas RBICS with Revenue offers quantified multi-sector exposure based on a company’s segment disclosures, RBICS with TradeNames provides a comprehensive view of sector participation at the product level. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetRBICS
from fds.sdk.FactSetRBICS.api import trade_names_api
from fds.sdk.FactSetRBICS.models import *
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
configuration = fds.sdk.FactSetRBICS.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetRBICS.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetRBICS.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = trade_names_api.TradeNamesApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    trade_names_request = TradeNamesRequest(
        data=TradeNamesRequestBody(
            ids=TradeNamesIds(["FDS-US","0FPWZZ-E","TSLA-US"]),
            as_of_date=dateutil_parser('Wed Sep 30 00:00:00 UTC 2020').date(),
        ),
    ) # TradeNamesRequest | Request Body to request a list of tradeName objects.

    try:
        # Get a company's associated tradeNames and product lines.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_trade_names_for_list(trade_names_request)

        pprint(api_response)

    except fds.sdk.FactSetRBICS.ApiException as e:
        print("Exception when calling TradeNamesApi->get_trade_names_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trade_names_request** | [**TradeNamesRequest**](TradeNamesRequest.md)| Request Body to request a list of tradeName objects. |

### Return type

[**TradeNamesResponse**](TradeNamesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response producing an array of RBICS Tradename Objects |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

