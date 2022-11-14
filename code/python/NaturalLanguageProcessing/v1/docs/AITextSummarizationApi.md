# fds.sdk.NaturalLanguageProcessing.AITextSummarizationApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cognitive_nlp_v1_summarization_headline_and_summary_post**](AITextSummarizationApi.md#cognitive_nlp_v1_summarization_headline_and_summary_post) | **POST** /cognitive/nlp/v1/summarization/headline-and-summary | Endpoint to summarize and generate a headline from text
[**cognitive_nlp_v1_summarization_headline_post**](AITextSummarizationApi.md#cognitive_nlp_v1_summarization_headline_post) | **POST** /cognitive/nlp/v1/summarization/headline | Endpoint to generate a headline from text
[**cognitive_nlp_v1_summarization_result_result_id_get**](AITextSummarizationApi.md#cognitive_nlp_v1_summarization_result_result_id_get) | **GET** /cognitive/nlp/v1/summarization/result/{result_id} | Endpoint to obtain result of a particular summarization job
[**cognitive_nlp_v1_summarization_summary_post**](AITextSummarizationApi.md#cognitive_nlp_v1_summarization_summary_post) | **POST** /cognitive/nlp/v1/summarization/summary | Endpoint to summarize text


# **cognitive_nlp_v1_summarization_headline_and_summary_post**
> SummarizationResultID cognitive_nlp_v1_summarization_headline_and_summary_post()

Endpoint to summarize and generate a headline from text

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NaturalLanguageProcessing
from fds.sdk.NaturalLanguageProcessing.api import ai_text_summarization_api
from fds.sdk.NaturalLanguageProcessing.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
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
    api_instance = ai_text_summarization_api.AITextSummarizationApi(api_client)

    summarization_request = SummarizationRequest(
        text="Advanced Energy Transforms Indoor Farming With Intelligent New Lighting Power and Control System Friday, December 11, 2020 01:00:00 PM (GMT)Innovative technology breaks down barriers to indoor, vertical and greenhouse farming by reducing power consumption, cutting costs and increasing crop yield Advanced Energy (Nasdaq: AEIS) – a global leader in highly engineered, precision power conversion, measurement, and control solutions – today unveiled its newest lighting and power control system for indoor, vertical and greenhouse farming. This press release features multimedia. Advanced Energy's new Artesyn iTS provides the industry's first solution for switching or sharing a single power source between two different rooms. This reduces installation costs by cutting the number of iHP power supplies needed in half and it substantially reduces ongoing utility costs. (Photo: Business Wire)AE's new lighting and power system transforms the use of LED technology in horticultural lighting systems, which plays a fundamental role in cutting-edge farming practices that can address production challenges in food, pharmaceutical ingredients, plants and flowers. Utilizing AE's system, customers reduce their power conversion costs by as much as 50 percent, significantly lower installation and operating costs, and increase the quality of crop yield. "Our groundbreaking lighting, power and control system delivers significant improvements over conventional lighting solutions and opens up new opportunities for the industry," said Joe Voyles, vice president, industrial marketing, at Advanced Energy. "We are transforming our customers' operations by both reducing the amount of needed equipment and improving the efficiency of the lighting systems, thereby reducing cost and energy spend. Not only do these innovative new products increase the efficiency and quality of fruit and vegetable production, but they also open the door to establishing indoor farming facilities in harsh environments anywhere in the world." The new system consists of the patented Artesyn iTS (intelligent Transfer Switch) and iHPS configurable power supply. Alongside Artesyn's compact new 12 kW 300 VDC module, AE delivers a cost-effective platform for the most advanced indoor farming applications. The system is estimated to produce a 38 percent savings to lighting power and control installation cost, while eliminating substantial amounts of wasted energy. The new iHPS is a "short" version of AE's market-leading iHP power supply. The shorter design allows for more space within the lighting and power cabinet for other crucial components, reduces the weight and cost, and increases the life of the system. The new iTS provides the industry's first solution for switching or sharing a single power source between two different rooms. This reduces installation costs by cutting the number of iHP power supplies needed in half and it substantially reduces ongoing utility costs.",
    ) # SummarizationRequest |  (optional)

    try:
        # Endpoint to summarize and generate a headline from text
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.cognitive_nlp_v1_summarization_headline_and_summary_post(summarization_request=summarization_request)
        pprint(api_response)

    except fds.sdk.NaturalLanguageProcessing.ApiException as e:
        print("Exception when calling AITextSummarizationApi->cognitive_nlp_v1_summarization_headline_and_summary_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **summarization_request** | [**SummarizationRequest**](SummarizationRequest.md)|  | [optional]

### Return type

[**SummarizationResultID**](SummarizationResultID.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Unique Result ID |  -  |
**400** | Bad Request |  -  |
**401** | Access Denied |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cognitive_nlp_v1_summarization_headline_post**
> SummarizationResultID cognitive_nlp_v1_summarization_headline_post()

Endpoint to generate a headline from text

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NaturalLanguageProcessing
from fds.sdk.NaturalLanguageProcessing.api import ai_text_summarization_api
from fds.sdk.NaturalLanguageProcessing.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
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
    api_instance = ai_text_summarization_api.AITextSummarizationApi(api_client)

    summarization_request = SummarizationRequest(
        text="Advanced Energy Transforms Indoor Farming With Intelligent New Lighting Power and Control System Friday, December 11, 2020 01:00:00 PM (GMT)Innovative technology breaks down barriers to indoor, vertical and greenhouse farming by reducing power consumption, cutting costs and increasing crop yield Advanced Energy (Nasdaq: AEIS) – a global leader in highly engineered, precision power conversion, measurement, and control solutions – today unveiled its newest lighting and power control system for indoor, vertical and greenhouse farming. This press release features multimedia. Advanced Energy's new Artesyn iTS provides the industry's first solution for switching or sharing a single power source between two different rooms. This reduces installation costs by cutting the number of iHP power supplies needed in half and it substantially reduces ongoing utility costs. (Photo: Business Wire)AE's new lighting and power system transforms the use of LED technology in horticultural lighting systems, which plays a fundamental role in cutting-edge farming practices that can address production challenges in food, pharmaceutical ingredients, plants and flowers. Utilizing AE's system, customers reduce their power conversion costs by as much as 50 percent, significantly lower installation and operating costs, and increase the quality of crop yield. "Our groundbreaking lighting, power and control system delivers significant improvements over conventional lighting solutions and opens up new opportunities for the industry," said Joe Voyles, vice president, industrial marketing, at Advanced Energy. "We are transforming our customers' operations by both reducing the amount of needed equipment and improving the efficiency of the lighting systems, thereby reducing cost and energy spend. Not only do these innovative new products increase the efficiency and quality of fruit and vegetable production, but they also open the door to establishing indoor farming facilities in harsh environments anywhere in the world." The new system consists of the patented Artesyn iTS (intelligent Transfer Switch) and iHPS configurable power supply. Alongside Artesyn's compact new 12 kW 300 VDC module, AE delivers a cost-effective platform for the most advanced indoor farming applications. The system is estimated to produce a 38 percent savings to lighting power and control installation cost, while eliminating substantial amounts of wasted energy. The new iHPS is a "short" version of AE's market-leading iHP power supply. The shorter design allows for more space within the lighting and power cabinet for other crucial components, reduces the weight and cost, and increases the life of the system. The new iTS provides the industry's first solution for switching or sharing a single power source between two different rooms. This reduces installation costs by cutting the number of iHP power supplies needed in half and it substantially reduces ongoing utility costs.",
    ) # SummarizationRequest |  (optional)

    try:
        # Endpoint to generate a headline from text
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.cognitive_nlp_v1_summarization_headline_post(summarization_request=summarization_request)
        pprint(api_response)

    except fds.sdk.NaturalLanguageProcessing.ApiException as e:
        print("Exception when calling AITextSummarizationApi->cognitive_nlp_v1_summarization_headline_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **summarization_request** | [**SummarizationRequest**](SummarizationRequest.md)|  | [optional]

### Return type

[**SummarizationResultID**](SummarizationResultID.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Unique Result ID |  -  |
**400** | Bad Request |  -  |
**401** | Access Denied |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cognitive_nlp_v1_summarization_result_result_id_get**
> SummarizationResult cognitive_nlp_v1_summarization_result_result_id_get(result_id)

Endpoint to obtain result of a particular summarization job

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NaturalLanguageProcessing
from fds.sdk.NaturalLanguageProcessing.api import ai_text_summarization_api
from fds.sdk.NaturalLanguageProcessing.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
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
    api_instance = ai_text_summarization_api.AITextSummarizationApi(api_client)

    result_id = "result_id_example" # str | 

    try:
        # Endpoint to obtain result of a particular summarization job
        # example passing only required values which don't have defaults set
        api_response = api_instance.cognitive_nlp_v1_summarization_result_result_id_get(result_id)
        pprint(api_response)

    except fds.sdk.NaturalLanguageProcessing.ApiException as e:
        print("Exception when calling AITextSummarizationApi->cognitive_nlp_v1_summarization_result_result_id_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **result_id** | **str**|  |

### Return type

[**SummarizationResult**](SummarizationResult.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**400** | Bad Request |  -  |
**401** | Access Denied |  -  |
**404** | Not found |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cognitive_nlp_v1_summarization_summary_post**
> SummarizationResultID cognitive_nlp_v1_summarization_summary_post()

Endpoint to summarize text

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NaturalLanguageProcessing
from fds.sdk.NaturalLanguageProcessing.api import ai_text_summarization_api
from fds.sdk.NaturalLanguageProcessing.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
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
    api_instance = ai_text_summarization_api.AITextSummarizationApi(api_client)

    summarization_request = SummarizationRequest(
        text="Advanced Energy Transforms Indoor Farming With Intelligent New Lighting Power and Control System Friday, December 11, 2020 01:00:00 PM (GMT)Innovative technology breaks down barriers to indoor, vertical and greenhouse farming by reducing power consumption, cutting costs and increasing crop yield Advanced Energy (Nasdaq: AEIS) – a global leader in highly engineered, precision power conversion, measurement, and control solutions – today unveiled its newest lighting and power control system for indoor, vertical and greenhouse farming. This press release features multimedia. Advanced Energy's new Artesyn iTS provides the industry's first solution for switching or sharing a single power source between two different rooms. This reduces installation costs by cutting the number of iHP power supplies needed in half and it substantially reduces ongoing utility costs. (Photo: Business Wire)AE's new lighting and power system transforms the use of LED technology in horticultural lighting systems, which plays a fundamental role in cutting-edge farming practices that can address production challenges in food, pharmaceutical ingredients, plants and flowers. Utilizing AE's system, customers reduce their power conversion costs by as much as 50 percent, significantly lower installation and operating costs, and increase the quality of crop yield. "Our groundbreaking lighting, power and control system delivers significant improvements over conventional lighting solutions and opens up new opportunities for the industry," said Joe Voyles, vice president, industrial marketing, at Advanced Energy. "We are transforming our customers' operations by both reducing the amount of needed equipment and improving the efficiency of the lighting systems, thereby reducing cost and energy spend. Not only do these innovative new products increase the efficiency and quality of fruit and vegetable production, but they also open the door to establishing indoor farming facilities in harsh environments anywhere in the world." The new system consists of the patented Artesyn iTS (intelligent Transfer Switch) and iHPS configurable power supply. Alongside Artesyn's compact new 12 kW 300 VDC module, AE delivers a cost-effective platform for the most advanced indoor farming applications. The system is estimated to produce a 38 percent savings to lighting power and control installation cost, while eliminating substantial amounts of wasted energy. The new iHPS is a "short" version of AE's market-leading iHP power supply. The shorter design allows for more space within the lighting and power cabinet for other crucial components, reduces the weight and cost, and increases the life of the system. The new iTS provides the industry's first solution for switching or sharing a single power source between two different rooms. This reduces installation costs by cutting the number of iHP power supplies needed in half and it substantially reduces ongoing utility costs.",
    ) # SummarizationRequest |  (optional)

    try:
        # Endpoint to summarize text
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.cognitive_nlp_v1_summarization_summary_post(summarization_request=summarization_request)
        pprint(api_response)

    except fds.sdk.NaturalLanguageProcessing.ApiException as e:
        print("Exception when calling AITextSummarizationApi->cognitive_nlp_v1_summarization_summary_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **summarization_request** | [**SummarizationRequest**](SummarizationRequest.md)|  | [optional]

### Return type

[**SummarizationResultID**](SummarizationResultID.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Unique Result ID |  -  |
**400** | Bad Request |  -  |
**401** | Access Denied |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

