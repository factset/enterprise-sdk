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
from fds.sdk.RecommendationListAPIforDigitalPortals.models import *
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

    id = 3.14 # float | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # Attributes of a single list.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_recommendation_list_get(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.RecommendationListAPIforDigitalPortals.ApiException as e:
        print("Exception when calling RecommendationListApi->get_recommendation_list_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

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
from fds.sdk.RecommendationListAPIforDigitalPortals.models import *
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

    id_revision = 3.14 # float | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # List of elements of a given revision.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_recommendation_list_revision_element_list(id_revision, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.RecommendationListAPIforDigitalPortals.ApiException as e:
        print("Exception when calling RecommendationListApi->get_recommendation_list_revision_element_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_revision** | **float**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

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
from fds.sdk.RecommendationListAPIforDigitalPortals.models import *
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

    id = 3.14 # float | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # Attributes of a single revision.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_recommendation_list_revision_get(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.RecommendationListAPIforDigitalPortals.ApiException as e:
        print("Exception when calling RecommendationListApi->get_recommendation_list_revision_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

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
from fds.sdk.RecommendationListAPIforDigitalPortals.models import *
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

    id_notation = "idNotation_example" # str |  (optional)
    id_instrument = "idInstrument_example" # str |  (optional)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # Search for revisions of a recommendation list.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_recommendation_list_revision_search(id_notation=id_notation, id_instrument=id_instrument, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.RecommendationListAPIforDigitalPortals.ApiException as e:
        print("Exception when calling RecommendationListApi->get_recommendation_list_revision_search: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_notation** | **str**|  | [optional]
 **id_instrument** | **str**|  | [optional]
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

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
from fds.sdk.RecommendationListAPIforDigitalPortals.models import *
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

    name = "name_example" # str |  (optional)
    only_active = True # bool |  (optional)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # Search for recommendation lists.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_recommendation_list_search(name=name, only_active=only_active, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.RecommendationListAPIforDigitalPortals.ApiException as e:
        print("Exception when calling RecommendationListApi->get_recommendation_list_search: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**|  | [optional]
 **only_active** | **bool**|  | [optional]
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

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
> InlineResponse2003 post_recommendation_list_revision_list(inline_object)

List of revisions of a recommendation list.

List of revisions of a recommendation list, excluding the elements of each revision.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RecommendationListAPIforDigitalPortals
from fds.sdk.RecommendationListAPIforDigitalPortals.api import recommendation_list_api
from fds.sdk.RecommendationListAPIforDigitalPortals.models import *
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

    inline_object = InlineObject(
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
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_recommendation_list_revision_list(inline_object)
        pprint(api_response)

    except fds.sdk.RecommendationListAPIforDigitalPortals.ApiException as e:
        print("Exception when calling RecommendationListApi->post_recommendation_list_revision_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object** | [**InlineObject**](InlineObject.md)|  |

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

