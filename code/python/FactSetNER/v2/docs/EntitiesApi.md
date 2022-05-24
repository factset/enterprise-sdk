# fds.sdk.FactSetNER.EntitiesApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**post_entities_entities**](EntitiesApi.md#post_entities_entities) | **POST** /cognitive/ner/v2/entities | 


# **post_entities_entities**
> Response post_entities_entities(payload)



Extract named entities from document text.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetNER
from fds.sdk.FactSetNER.api import entities_api
from fds.sdk.FactSetNER.model.response import Response
from fds.sdk.FactSetNER.model.input import Input
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetNER.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetNER.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetNER.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = entities_api.EntitiesApi(api_client)

    payload = Input(
        text="As demand for the coronavirus vaccine plateaus, Ohio Governor Mike DeWine is giving state residents a shot to win $1 million. Starting May 26, the state will award $1 million each week to an adult who has received at least the first dose of the COVID-19 vaccine, DeWine said. There will be five total drawings. This will give anyone who has not been vaccinated time to get the first dose of Pfizer or Moderna and be well on the way to full immunity, DeWine said Wednesday. West Virginia Governor Jim Justice wanted to give every vaccinated resident between the ages of 16 and 35 a $100 savings bond. States and localities have been given wide discretion by the Treasury Department in spending federal aid.",
        filter_entities=True,
        enable_id_lookup=True,
    ) # Input | 

    try:
        api_response = api_instance.post_entities_entities(payload)
        pprint(api_response)

    except fds.sdk.FactSetNER.ApiException as e:
        print("Exception when calling EntitiesApi->post_entities_entities: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**Input**](Input.md)|  |

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**401** | Error: Unauthorized |  -  |
**500** | Server-side Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

