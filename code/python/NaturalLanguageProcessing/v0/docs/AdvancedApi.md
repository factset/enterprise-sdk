# fds.sdk.NaturalLanguageProcessing.AdvancedApi

All URIs are relative to *https://api.factset.com/aiml/ner/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**post_advanced_ner_extraction**](AdvancedApi.md#post_advanced_ner_extraction) | **POST** /advanced | Advanced Processing



# **post_advanced_ner_extraction**
> OutputRoot post_advanced_ner_extraction(advanced_request_root)

Advanced Processing

NER endpoint optimized for accuracy and entity coverage, supports single-input processing. Supports financial entity types such as cryptocurrency, index, rate, yield, commodity, currency, future, fund, asset, and debt instrument in addition to Express entity types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NaturalLanguageProcessing
from fds.sdk.NaturalLanguageProcessing.api import advanced_api
from fds.sdk.NaturalLanguageProcessing.models import *
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
configuration = fds.sdk.NaturalLanguageProcessing.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.NaturalLanguageProcessing.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.NaturalLanguageProcessing.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = advanced_api.AdvancedApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    advanced_request_root = AdvancedRequestRoot(
        data=AdvancedInput(
            input_data="input_data_example",
            required_entities=[
                AdvancedEntityType("person"),
            ],
            offset_required=True,
            lookup_required=True,
            model="meta.llama-4-scout-instruct",
        ),
    ) # AdvancedRequestRoot | 
    model = "meta.llama-4-scout-instruct" # str | Optional override for the Advanced model backend. (optional) if omitted the server will use the default value of "meta.llama-4-scout-instruct"

    try:
        # Advanced Processing
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_advanced_ner_extraction(advanced_request_root, model=model)

        pprint(api_response)

    except fds.sdk.NaturalLanguageProcessing.ApiException as e:
        print("Exception when calling AdvancedApi->post_advanced_ner_extraction: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advanced_request_root** | [**AdvancedRequestRoot**](AdvancedRequestRoot.md)|  |
 **model** | **str**| Optional override for the Advanced model backend. | [optional] if omitted the server will use the default value of "meta.llama-4-scout-instruct"

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
**403** | Forbidden |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

