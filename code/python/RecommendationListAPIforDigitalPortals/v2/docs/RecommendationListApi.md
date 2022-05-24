# fds.sdk.RecommendationListAPIforDigitalPortals.RecommendationListApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_recommendation_list_get**](RecommendationListApi.md#get_recommendation_list_get) | **GET** /recommendationList/get | Attributes of a single list.
[**get_recommendation_list_revision_element_list**](RecommendationListApi.md#get_recommendation_list_revision_element_list) | **GET** /recommendationList/revision/element/list | List of elements of a given revision.
[**get_recommendation_list_revision_get**](RecommendationListApi.md#get_recommendation_list_revision_get) | **GET** /recommendationList/revision/get | Attributes of a single revision.
[**get_recommendation_list_revision_search**](RecommendationListApi.md#get_recommendation_list_revision_search) | **GET** /recommendationList/revision/search | Search for revisions of a recommendation list.
[**get_recommendation_list_search**](RecommendationListApi.md#get_recommendation_list_search) | **GET** /recommendationList/search | Search for recommendation lists.
[**post_recommendation_list_revision_list**](RecommendationListApi.md#post_recommendation_list_revision_list) | **POST** /recommendationList/revision/list | List of revisions of a recommendation list.


# **get_recommendation_list_get**
> InlineResponse200 get_recommendation_list_get(id)

Attributes of a single list.

Attributes of a single list, including data about its active revision.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RecommendationListAPIforDigitalPortals
from fds.sdk.RecommendationListAPIforDigitalPortals.api import recommendation_list_api
from fds.sdk.RecommendationListAPIforDigitalPortals.model.inline_response200 import InlineResponse200
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.RecommendationListAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RecommendationListAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RecommendationListAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = recommendation_list_api.RecommendationListApi(api_client)

    id = 3.14 # float | Identifier of the list.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # Attributes of a single list.
        api_response = api_instance.get_recommendation_list_get(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.RecommendationListAPIforDigitalPortals.ApiException as e:
        print("Exception when calling RecommendationListApi->get_recommendation_list_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**| Identifier of the list. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_recommendation_list_revision_element_list**
> InlineResponse2005 get_recommendation_list_revision_element_list(id_revision)

List of elements of a given revision.

List of elements of a given revision.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RecommendationListAPIforDigitalPortals
from fds.sdk.RecommendationListAPIforDigitalPortals.api import recommendation_list_api
from fds.sdk.RecommendationListAPIforDigitalPortals.model.inline_response2005 import InlineResponse2005
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.RecommendationListAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RecommendationListAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RecommendationListAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = recommendation_list_api.RecommendationListApi(api_client)

    id_revision = 3.14 # float | Identifier of the revision.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # List of elements of a given revision.
        api_response = api_instance.get_recommendation_list_revision_element_list(id_revision, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.RecommendationListAPIforDigitalPortals.ApiException as e:
        print("Exception when calling RecommendationListApi->get_recommendation_list_revision_element_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_revision** | **float**| Identifier of the revision. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_recommendation_list_revision_get**
> InlineResponse2002 get_recommendation_list_revision_get(id)

Attributes of a single revision.

Attributes of a single revision.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RecommendationListAPIforDigitalPortals
from fds.sdk.RecommendationListAPIforDigitalPortals.api import recommendation_list_api
from fds.sdk.RecommendationListAPIforDigitalPortals.model.inline_response2002 import InlineResponse2002
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.RecommendationListAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RecommendationListAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RecommendationListAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = recommendation_list_api.RecommendationListApi(api_client)

    id = 3.14 # float | Identifier of the revision.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # Attributes of a single revision.
        api_response = api_instance.get_recommendation_list_revision_get(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.RecommendationListAPIforDigitalPortals.ApiException as e:
        print("Exception when calling RecommendationListApi->get_recommendation_list_revision_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**| Identifier of the revision. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_recommendation_list_revision_search**
> InlineResponse2004 get_recommendation_list_revision_search()

Search for revisions of a recommendation list.

Search for revisions of a recommendation list.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RecommendationListAPIforDigitalPortals
from fds.sdk.RecommendationListAPIforDigitalPortals.api import recommendation_list_api
from fds.sdk.RecommendationListAPIforDigitalPortals.model.inline_response2004 import InlineResponse2004
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.RecommendationListAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RecommendationListAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RecommendationListAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = recommendation_list_api.RecommendationListApi(api_client)

    id_notation = "idNotation_example" # str | Restrict the search to revisions containing an element associated with the identified notation. (optional)
    id_instrument = "idInstrument_example" # str | Restrict the search to revisions pointing to the identified instrument. (optional)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # Search for revisions of a recommendation list.
        api_response = api_instance.get_recommendation_list_revision_search(id_notation=id_notation, id_instrument=id_instrument, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.RecommendationListAPIforDigitalPortals.ApiException as e:
        print("Exception when calling RecommendationListApi->get_recommendation_list_revision_search: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_notation** | **str**| Restrict the search to revisions containing an element associated with the identified notation. | [optional]
 **id_instrument** | **str**| Restrict the search to revisions pointing to the identified instrument. | [optional]
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_recommendation_list_search**
> InlineResponse2001 get_recommendation_list_search()

Search for recommendation lists.

Search for recommendation lists, delivering an array of recommendation lists matching the specified filter criteria. The data provided for each recommendation list includes the currently active revision (or null in case no active revision exists).

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RecommendationListAPIforDigitalPortals
from fds.sdk.RecommendationListAPIforDigitalPortals.api import recommendation_list_api
from fds.sdk.RecommendationListAPIforDigitalPortals.model.inline_response2001 import InlineResponse2001
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.RecommendationListAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RecommendationListAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RecommendationListAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = recommendation_list_api.RecommendationListApi(api_client)

    name = "name_example" # str | Restricts the search to recommendation lists, which contain the provided string in their name attribute. The filter is a case-insensitive substring match. (optional)
    only_active = True # bool | Restrict the search to recommendation lists, which are currently active (e.g., current date is before the recommendation list's activeRange.end date). If set to false, recommendation lists will be returned regardless of their state. (optional)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # Search for recommendation lists.
        api_response = api_instance.get_recommendation_list_search(name=name, only_active=only_active, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.RecommendationListAPIforDigitalPortals.ApiException as e:
        print("Exception when calling RecommendationListApi->get_recommendation_list_search: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| Restricts the search to recommendation lists, which contain the provided string in their name attribute. The filter is a case-insensitive substring match. | [optional]
 **only_active** | **bool**| Restrict the search to recommendation lists, which are currently active (e.g., current date is before the recommendation list&#39;s activeRange.end date). If set to false, recommendation lists will be returned regardless of their state. | [optional]
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_recommendation_list_revision_list**
> InlineResponse2003 post_recommendation_list_revision_list(body)

List of revisions of a recommendation list.

List of revisions of a recommendation list, excluding the elements of each revision.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RecommendationListAPIforDigitalPortals
from fds.sdk.RecommendationListAPIforDigitalPortals.api import recommendation_list_api
from fds.sdk.RecommendationListAPIforDigitalPortals.model.inline_response2003 import InlineResponse2003
from fds.sdk.RecommendationListAPIforDigitalPortals.model.inline_object import InlineObject
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.RecommendationListAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RecommendationListAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RecommendationListAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = recommendation_list_api.RecommendationListApi(api_client)

    body = InlineObject(
        data=RecommendationListRevisionListData(
            id_list=3.14,
            id_revision=[
                3.14,
            ],
            active_range=RecommendationListRevisionListDataActiveRange(
                start="start_example",
                end="end_example",
            ),
        ),
        meta=RecommendationListRevisionListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
        ),
    ) # InlineObject | 

    try:
        # List of revisions of a recommendation list.
        api_response = api_instance.post_recommendation_list_revision_list(body)
        pprint(api_response)

    except fds.sdk.RecommendationListAPIforDigitalPortals.ApiException as e:
        print("Exception when calling RecommendationListApi->post_recommendation_list_revision_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject**](InlineObject.md)|  |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

