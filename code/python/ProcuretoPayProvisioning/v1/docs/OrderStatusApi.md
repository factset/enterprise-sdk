# fds.sdk.ProcuretoPayProvisioning.OrderStatusApi

All URIs are relative to *https://api.factset.com/procuretopay/provisioning*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transaction_status_get**](OrderStatusApi.md#transaction_status_get) | **GET** /transactionStatus | Check status of order by transactionCode


# **transaction_status_get**
> TransactionStatus transaction_status_get(transactioncode)

Check status of order by transactionCode

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayProvisioning
from fds.sdk.ProcuretoPayProvisioning.api import order_status_api
from fds.sdk.ProcuretoPayProvisioning.model.transaction_status import TransactionStatus
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ProcuretoPayProvisioning.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayProvisioning.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayProvisioning.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = order_status_api.OrderStatusApi(api_client)
    transactioncode = "7B27AA857B664F18AB4886A08A9A3D9C" # str | Transaction Code to query

    # example passing only required values which don't have defaults set
    try:
        # Check status of order by transactionCode
        api_response = api_instance.transaction_status_get(transactioncode)
        pprint(api_response)
    except fds.sdk.ProcuretoPayProvisioning.ApiException as e:
        print("Exception when calling OrderStatusApi->transaction_status_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactioncode** | **str**| Transaction Code to query |

### Return type

[**TransactionStatus**](TransactionStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**400** | Bad Request |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**404** | Requested Resource not found |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**429** | Rate limit reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

