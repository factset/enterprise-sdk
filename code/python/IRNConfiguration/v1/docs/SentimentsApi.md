# fds.sdk.IRNConfiguration.SentimentsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1_sentiments_get**](SentimentsApi.md#v1_sentiments_get) | **GET** /v1/sentiments | Get all Sentiments


# **v1_sentiments_get**
> [SentimentConfigDto] v1_sentiments_get()

Get all Sentiments

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import sentiments_api
from fds.sdk.IRNConfiguration.model.sentiment_config_dto import SentimentConfigDto
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.IRNConfiguration.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNConfiguration.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNConfiguration.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = sentiments_api.SentimentsApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get all Sentiments
        api_response = api_instance.v1_sentiments_get()
        pprint(api_response)
    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling SentimentsApi->v1_sentiments_get: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**[SentimentConfigDto]**](SentimentConfigDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

