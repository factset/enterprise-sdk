# fds.sdk.IRNNotes.IdentifiersApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_identifiers**](IdentifiersApi.md#get_identifiers) | **GET** /v1/identifiers | Get all the identifier details for given identifiers



# **get_identifiers**
> [dict] get_identifiers()

Get all the identifier details for given identifiers

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNNotes
from fds.sdk.IRNNotes.api import identifiers_api
from fds.sdk.IRNNotes.models import *
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
configuration = fds.sdk.IRNNotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNNotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNNotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = identifiers_api.IdentifiersApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifiers = "identifiers_example" # str | Identifiers (optional)

    try:
        # Get all the identifier details for given identifiers
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_identifiers(identifiers=identifiers)

        pprint(api_response)

    except fds.sdk.IRNNotes.ApiException as e:
        print("Exception when calling IdentifiersApi->get_identifiers: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifiers** | **str**| Identifiers | [optional]

### Return type

**[dict]**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

