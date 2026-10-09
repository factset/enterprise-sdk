# fds.sdk.FactSetNER.AdvancedApi

All URIs are relative to *https://api.factset.com/aiml/ner/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**post_advanced_ner_extraction**](AdvancedApi.md#post_advanced_ner_extraction) | **POST** /advanced/extract | Advanced Processing



# **post_advanced_ner_extraction**
> OutputRoot post_advanced_ner_extraction(advanced_request_root)

Advanced Processing

NER endpoint optimized for accuracy and entity coverage, supports single-input processing. Supports financial entity types such as cryptocurrency, index, rate, yield, commodity, currency, future, fund, asset, and debt instrument in addition to Express entity types.  Optionally select a model via `data.model` in the request body. Supported models: - GPT 5.2 - Claude Sonnet 4.6 - Llama 4 Scout Instruct (the default)  Requests are limited to a 30-second timeout. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetNER
from fds.sdk.FactSetNER.api import advanced_api
from fds.sdk.FactSetNER.models import *
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
    api_instance = advanced_api.AdvancedApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    advanced_request_root = AdvancedRequestRoot(
        data=AdvancedInput(
            input="input_example",
            entities=[
                AdvancedEntityType("person"),
            ],
            include_offsets=False,
            perform_lookup=True,
            model="Llama 4 Scout Instruct",
        ),
    ) # AdvancedRequestRoot | 

    try:
        # Advanced Processing
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_advanced_ner_extraction(advanced_request_root)

        pprint(api_response)

    except fds.sdk.FactSetNER.ApiException as e:
        print("Exception when calling AdvancedApi->post_advanced_ner_extraction: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advanced_request_root** | [**AdvancedRequestRoot**](AdvancedRequestRoot.md)|  |

### Return type

[**OutputRoot**](OutputRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful entity extraction |  -  |
**400** | Invalid request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal server error |  -  |
**502** | Upstream model gateway error |  -  |
**504** | Request exceeded the 30-second processing timeout |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

