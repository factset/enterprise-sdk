# fds.sdk.NaturalLanguageProcessing.AIThemesApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cognitive_nlp_v1_themes_post**](AIThemesApi.md#cognitive_nlp_v1_themes_post) | **POST** /cognitive/nlp/v1/themes | POST request to extract themes from text


# **cognitive_nlp_v1_themes_post**
> ThemesRoot cognitive_nlp_v1_themes_post(theme_parameters_root)

POST request to extract themes from text

This endpoint extracts themes from unstructured text. Each theme (`themeText`) is also given a score (`themeScore`). This score shows the relevancy of the theme within the text. Example Output: ```json {   \"data\": [   {     \"themeText\": \"home entertainment results\",     \"themeScore\": 0.92   },   {     \"themeText\": \".....\",     \"themeScore\": .....   }] } ``` 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NaturalLanguageProcessing
from fds.sdk.NaturalLanguageProcessing.api import ai_themes_api
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
    api_instance = ai_themes_api.AIThemesApi(api_client)

    theme_parameters_root = ThemeParametersRoot(
        data=ThemeParameters(
            text="Studio Entertainment: At Studio Entertainment, operating income decreased in the quarter due to lower theatrical distribution and home entertainment results. Worldwide theatrical results continued to be adversely impacted by COVID-19, as theaters were closed in many key markets both domestically and internationally. With no significant worldwide theatrical releases in the quarter, we faced a difficult comparison against the strong performance of The Lion King and Toy Story 4 in the prior-year quarter. Operating Results: On our last earnings call, we said that we expected Q4 operating results of our DTC businesses to improve by approximately $100mm relative to the prior-year quarter. Our results came in better than that guidance, with operating income at our DTC businesses improving by approximately $300mm vs. the prior year due to better-than-expected performance across all three of our streaming services. I will note that we do not plan to further update any of our subscriber numbers until our Investor Day on December 10 At our International Channels, lower results were due to lower affiliate and advertising revenues, partially offset by a decrease in cost.",
        ),
        meta={},
    ) # ThemeParametersRoot | 

    try:
        # POST request to extract themes from text
        # example passing only required values which don't have defaults set
        api_response = api_instance.cognitive_nlp_v1_themes_post(theme_parameters_root)
        pprint(api_response)

    except fds.sdk.NaturalLanguageProcessing.ApiException as e:
        print("Exception when calling AIThemesApi->cognitive_nlp_v1_themes_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **theme_parameters_root** | [**ThemeParametersRoot**](ThemeParametersRoot.md)|  |

### Return type

[**ThemesRoot**](ThemesRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response, generated themes |  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  |
**400** | The browser (or proxy) sent a request that this server could not understand. |  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  |
**401** | The server could not verify that you are authorized to access the URL requested. You either supplied the wrong credentials (e.g. a bad password), or your browser doesn&#39;t understand how to supply the credentials required. |  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  |
**403** | You don&#39;t have the permission to access the requested resource. It is either read-protected or not readable by the server. |  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  |
**404** | The requested URL was not found on the server. If you entered the URL manually please check your spelling and try again. |  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  |
**500** | The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. |  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  |
**503** | The server is temporarily unable to service your request due to maintenance downtime or capacity problems. Please try again later. |  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

