# fds.sdk.AITextSummarization.DefaultApi

All URIs are relative to *http://ai-text-summarization-staging.factset.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_result_v1_result_result_id**](DefaultApi.md#get_result_v1_result_result_id) | **GET** /v1/result/{result_id} | GET request that returns the full headline and summary results from the initial POST requests
[**post_headline_and_summary_v1_headline_and_summary**](DefaultApi.md#post_headline_and_summary_v1_headline_and_summary) | **POST** /v1/headline-and-summary | POST request to create a 2-3 sentence summary from input text
[**post_headline_v1_headline**](DefaultApi.md#post_headline_v1_headline) | **POST** /v1/headline | POST request to create a headline from input text
[**post_summary_v1_summary**](DefaultApi.md#post_summary_v1_summary) | **POST** /v1/summary | POST request to create a headline and summary from input text


# **get_result_v1_result_result_id**
> SuccessResponse get_result_v1_result_result_id(result_id)

GET request that returns the full headline and summary results from the initial POST requests

Endpoint that returns the full headline and summary results from the initial POST requests.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.AITextSummarization
from fds.sdk.AITextSummarization.api import default_api
from fds.sdk.AITextSummarization.model.internal_server_error_response import InternalServerErrorResponse
from fds.sdk.AITextSummarization.model.bad_request_response import BadRequestResponse
from fds.sdk.AITextSummarization.model.success_response import SuccessResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.AITextSummarization.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.AITextSummarization.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.AITextSummarization.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = default_api.DefaultApi(api_client)

    result_id = "result_id_example" # str | 

    try:
        # GET request that returns the full headline and summary results from the initial POST requests
        api_response = api_instance.get_result_v1_result_result_id(result_id)
        pprint(api_response)

    except fds.sdk.AITextSummarization.ApiException as e:
        print("Exception when calling DefaultApi->get_result_v1_result_result_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **result_id** | **str**|  |

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**202** | Processing |  -  |
**400** | Bad Request |  -  |
**401** | Access Denied |  -  |
**404** | Invalid Result ID |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_headline_and_summary_v1_headline_and_summary**
> str post_headline_and_summary_v1_headline_and_summary(payload)

POST request to create a 2-3 sentence summary from input text

Endpoint for initiating a processing job to create a 2-3 sentence summary from input text.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.AITextSummarization
from fds.sdk.AITextSummarization.api import default_api
from fds.sdk.AITextSummarization.model.internal_server_error_response import InternalServerErrorResponse
from fds.sdk.AITextSummarization.model.request import Request
from fds.sdk.AITextSummarization.model.bad_request_response import BadRequestResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.AITextSummarization.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.AITextSummarization.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.AITextSummarization.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = default_api.DefaultApi(api_client)

    payload = Request(
        text="Advanced Energy Transforms Indoor Farming With Intelligent New Lighting Power and Control System Friday, December 11, 2020 01:00:00 PM (GMT)Innovative technology breaks down barriers to indoor, vertical and greenhouse farming by reducing power consumption, cutting costs and increasing crop yield Advanced Energy (Nasdaq: AEIS) – a global leader in highly engineered, precision power conversion, measurement, and control solutions – today unveiled its newest lighting and power control system for indoor, vertical and greenhouse farming. This press release features multimedia. Advanced Energy's new Artesyn iTS provides the industry's first solution for switching or sharing a single power source between two different rooms. This reduces installation costs by cutting the number of iHP power supplies needed in half and it substantially reduces ongoing utility costs. (Photo: Business Wire)AE's new lighting and power system transforms the use of LED technology in horticultural lighting systems, which plays a fundamental role in cutting-edge farming practices that can address production challenges in food, pharmaceutical ingredients, plants and flowers. Utilizing AE's system, customers reduce their power conversion costs by as much as 50 percent, significantly lower installation and operating costs, and increase the quality of crop yield. "Our groundbreaking lighting, power and control system delivers significant improvements over conventional lighting solutions and opens up new opportunities for the industry," said Joe Voyles, vice president, industrial marketing, at Advanced Energy. "We are transforming our customers' operations by both reducing the amount of needed equipment and improving the efficiency of the lighting systems, thereby reducing cost and energy spend. Not only do these innovative new products increase the efficiency and quality of fruit and vegetable production, but they also open the door to establishing indoor farming facilities in harsh environments anywhere in the world." The new system consists of the patented Artesyn iTS (intelligent Transfer Switch) and iHPS configurable power supply. Alongside Artesyn's compact new 12 kW 300 VDC module, AE delivers a cost-effective platform for the most advanced indoor farming applications. The system is estimated to produce a 38 percent savings to lighting power and control installation cost, while eliminating substantial amounts of wasted energy. The new iHPS is a "short" version of AE's market-leading iHP power supply. The shorter design allows for more space within the lighting and power cabinet for other crucial components, reduces the weight and cost, and increases the life of the system. The new iTS provides the industry's first solution for switching or sharing a single power source between two different rooms. This reduces installation costs by cutting the number of iHP power supplies needed in half and it substantially reduces ongoing utility costs.",
    ) # Request | 

    try:
        # POST request to create a 2-3 sentence summary from input text
        api_response = api_instance.post_headline_and_summary_v1_headline_and_summary(payload)
        pprint(api_response)

    except fds.sdk.AITextSummarization.ApiException as e:
        print("Exception when calling DefaultApi->post_headline_and_summary_v1_headline_and_summary: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**Request**](Request.md)|  |

### Return type

**str**

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

# **post_headline_v1_headline**
> str post_headline_v1_headline(payload)

POST request to create a headline from input text

Endpoint for initiating a processing job to create a headline from input text.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.AITextSummarization
from fds.sdk.AITextSummarization.api import default_api
from fds.sdk.AITextSummarization.model.internal_server_error_response import InternalServerErrorResponse
from fds.sdk.AITextSummarization.model.request import Request
from fds.sdk.AITextSummarization.model.bad_request_response import BadRequestResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.AITextSummarization.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.AITextSummarization.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.AITextSummarization.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = default_api.DefaultApi(api_client)

    payload = Request(
        text="Advanced Energy Transforms Indoor Farming With Intelligent New Lighting Power and Control System Friday, December 11, 2020 01:00:00 PM (GMT)Innovative technology breaks down barriers to indoor, vertical and greenhouse farming by reducing power consumption, cutting costs and increasing crop yield Advanced Energy (Nasdaq: AEIS) – a global leader in highly engineered, precision power conversion, measurement, and control solutions – today unveiled its newest lighting and power control system for indoor, vertical and greenhouse farming. This press release features multimedia. Advanced Energy's new Artesyn iTS provides the industry's first solution for switching or sharing a single power source between two different rooms. This reduces installation costs by cutting the number of iHP power supplies needed in half and it substantially reduces ongoing utility costs. (Photo: Business Wire)AE's new lighting and power system transforms the use of LED technology in horticultural lighting systems, which plays a fundamental role in cutting-edge farming practices that can address production challenges in food, pharmaceutical ingredients, plants and flowers. Utilizing AE's system, customers reduce their power conversion costs by as much as 50 percent, significantly lower installation and operating costs, and increase the quality of crop yield. "Our groundbreaking lighting, power and control system delivers significant improvements over conventional lighting solutions and opens up new opportunities for the industry," said Joe Voyles, vice president, industrial marketing, at Advanced Energy. "We are transforming our customers' operations by both reducing the amount of needed equipment and improving the efficiency of the lighting systems, thereby reducing cost and energy spend. Not only do these innovative new products increase the efficiency and quality of fruit and vegetable production, but they also open the door to establishing indoor farming facilities in harsh environments anywhere in the world." The new system consists of the patented Artesyn iTS (intelligent Transfer Switch) and iHPS configurable power supply. Alongside Artesyn's compact new 12 kW 300 VDC module, AE delivers a cost-effective platform for the most advanced indoor farming applications. The system is estimated to produce a 38 percent savings to lighting power and control installation cost, while eliminating substantial amounts of wasted energy. The new iHPS is a "short" version of AE's market-leading iHP power supply. The shorter design allows for more space within the lighting and power cabinet for other crucial components, reduces the weight and cost, and increases the life of the system. The new iTS provides the industry's first solution for switching or sharing a single power source between two different rooms. This reduces installation costs by cutting the number of iHP power supplies needed in half and it substantially reduces ongoing utility costs.",
    ) # Request | 

    try:
        # POST request to create a headline from input text
        api_response = api_instance.post_headline_v1_headline(payload)
        pprint(api_response)

    except fds.sdk.AITextSummarization.ApiException as e:
        print("Exception when calling DefaultApi->post_headline_v1_headline: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**Request**](Request.md)|  |

### Return type

**str**

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

# **post_summary_v1_summary**
> str post_summary_v1_summary(payload)

POST request to create a headline and summary from input text

Endpoint for initiating a processing job to create a headline and summary from input text.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.AITextSummarization
from fds.sdk.AITextSummarization.api import default_api
from fds.sdk.AITextSummarization.model.internal_server_error_response import InternalServerErrorResponse
from fds.sdk.AITextSummarization.model.request import Request
from fds.sdk.AITextSummarization.model.bad_request_response import BadRequestResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.AITextSummarization.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.AITextSummarization.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.AITextSummarization.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = default_api.DefaultApi(api_client)

    payload = Request(
        text="Advanced Energy Transforms Indoor Farming With Intelligent New Lighting Power and Control System Friday, December 11, 2020 01:00:00 PM (GMT)Innovative technology breaks down barriers to indoor, vertical and greenhouse farming by reducing power consumption, cutting costs and increasing crop yield Advanced Energy (Nasdaq: AEIS) – a global leader in highly engineered, precision power conversion, measurement, and control solutions – today unveiled its newest lighting and power control system for indoor, vertical and greenhouse farming. This press release features multimedia. Advanced Energy's new Artesyn iTS provides the industry's first solution for switching or sharing a single power source between two different rooms. This reduces installation costs by cutting the number of iHP power supplies needed in half and it substantially reduces ongoing utility costs. (Photo: Business Wire)AE's new lighting and power system transforms the use of LED technology in horticultural lighting systems, which plays a fundamental role in cutting-edge farming practices that can address production challenges in food, pharmaceutical ingredients, plants and flowers. Utilizing AE's system, customers reduce their power conversion costs by as much as 50 percent, significantly lower installation and operating costs, and increase the quality of crop yield. "Our groundbreaking lighting, power and control system delivers significant improvements over conventional lighting solutions and opens up new opportunities for the industry," said Joe Voyles, vice president, industrial marketing, at Advanced Energy. "We are transforming our customers' operations by both reducing the amount of needed equipment and improving the efficiency of the lighting systems, thereby reducing cost and energy spend. Not only do these innovative new products increase the efficiency and quality of fruit and vegetable production, but they also open the door to establishing indoor farming facilities in harsh environments anywhere in the world." The new system consists of the patented Artesyn iTS (intelligent Transfer Switch) and iHPS configurable power supply. Alongside Artesyn's compact new 12 kW 300 VDC module, AE delivers a cost-effective platform for the most advanced indoor farming applications. The system is estimated to produce a 38 percent savings to lighting power and control installation cost, while eliminating substantial amounts of wasted energy. The new iHPS is a "short" version of AE's market-leading iHP power supply. The shorter design allows for more space within the lighting and power cabinet for other crucial components, reduces the weight and cost, and increases the life of the system. The new iTS provides the industry's first solution for switching or sharing a single power source between two different rooms. This reduces installation costs by cutting the number of iHP power supplies needed in half and it substantially reduces ongoing utility costs.",
    ) # Request | 

    try:
        # POST request to create a headline and summary from input text
        api_response = api_instance.post_summary_v1_summary(payload)
        pprint(api_response)

    except fds.sdk.AITextSummarization.ApiException as e:
        print("Exception when calling DefaultApi->post_summary_v1_summary: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**Request**](Request.md)|  |

### Return type

**str**

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

