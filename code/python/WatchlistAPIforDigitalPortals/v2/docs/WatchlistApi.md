# fds.sdk.WatchlistAPIforDigitalPortals.WatchlistApi

All URIs are relative to *http://api-sandbox.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**watchlist_create_post**](WatchlistApi.md#watchlist_create_post) | **POST** /watchlist/create | Create watchlist.
[**watchlist_delete_post**](WatchlistApi.md#watchlist_delete_post) | **POST** /watchlist/delete | The endpoint deletes a watchlist.
[**watchlist_list_get**](WatchlistApi.md#watchlist_list_get) | **GET** /watchlist/list | List watchlists.
[**watchlist_modify_post**](WatchlistApi.md#watchlist_modify_post) | **POST** /watchlist/modify | Rename a watchlist.
[**watchlist_position_create_post**](WatchlistApi.md#watchlist_position_create_post) | **POST** /watchlist/position/create | Add position in watchlist.
[**watchlist_position_delete_post**](WatchlistApi.md#watchlist_position_delete_post) | **POST** /watchlist/position/delete | Add position in watchlist.
[**watchlist_position_list_get**](WatchlistApi.md#watchlist_position_list_get) | **GET** /watchlist/position/list | List positions of watchlist.
[**watchlist_position_modify_post**](WatchlistApi.md#watchlist_position_modify_post) | **POST** /watchlist/position/modify | Add position in watchlist.


# **watchlist_create_post**
> InlineResponse200 watchlist_create_post()

Create watchlist.

The endpoint creates a new watchlist.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.WatchlistAPIforDigitalPortals
from fds.sdk.WatchlistAPIforDigitalPortals.api import watchlist_api
from fds.sdk.WatchlistAPIforDigitalPortals.models import *
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
configuration = fds.sdk.WatchlistAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.WatchlistAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.WatchlistAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)

    body = InlineObject(
        data=WatchlistCreateData(
            name="name_example",
        ),
        meta=WatchlistCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject |  (optional)

    try:
        # Create watchlist.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.watchlist_create_post(body=body)
        pprint(api_response)

    except fds.sdk.WatchlistAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->watchlist_create_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject**](InlineObject.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

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

# **watchlist_delete_post**
> InlineResponse2001 watchlist_delete_post()

The endpoint deletes a watchlist.

The endpoint deletes a watchlist.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.WatchlistAPIforDigitalPortals
from fds.sdk.WatchlistAPIforDigitalPortals.api import watchlist_api
from fds.sdk.WatchlistAPIforDigitalPortals.models import *
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
configuration = fds.sdk.WatchlistAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.WatchlistAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.WatchlistAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)

    body = InlineObject1(
        data=WatchlistCreateData(
            name="name_example",
        ),
        meta=WatchlistCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject1 |  (optional)

    try:
        # The endpoint deletes a watchlist.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.watchlist_delete_post(body=body)
        pprint(api_response)

    except fds.sdk.WatchlistAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->watchlist_delete_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject1**](InlineObject1.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

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

# **watchlist_list_get**
> InlineResponse2002 watchlist_list_get()

List watchlists.

The endpoint lists all watchlist of a user.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.WatchlistAPIforDigitalPortals
from fds.sdk.WatchlistAPIforDigitalPortals.api import watchlist_api
from fds.sdk.WatchlistAPIforDigitalPortals.models import *
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
configuration = fds.sdk.WatchlistAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.WatchlistAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.WatchlistAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    sort = [
        "["name"]",
    ] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["name"]
    pagination_offset = 0.0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0.0
    pagination_limit = 20.0 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20.0

    try:
        # List watchlists.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.watchlist_list_get(attributes=attributes, sort=sort, pagination_offset=pagination_offset, pagination_limit=pagination_limit)
        pprint(api_response)

    except fds.sdk.WatchlistAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->watchlist_list_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["name"]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0.0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20.0

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

# **watchlist_modify_post**
> InlineResponse200 watchlist_modify_post()

Rename a watchlist.

The endpoint renames a watchlist.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.WatchlistAPIforDigitalPortals
from fds.sdk.WatchlistAPIforDigitalPortals.api import watchlist_api
from fds.sdk.WatchlistAPIforDigitalPortals.models import *
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
configuration = fds.sdk.WatchlistAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.WatchlistAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.WatchlistAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)

    body = InlineObject2(
        data=WatchlistModifyData(
            name="name_example",
            name_new="name_new_example",
        ),
        meta=WatchlistCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject2 |  (optional)

    try:
        # Rename a watchlist.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.watchlist_modify_post(body=body)
        pprint(api_response)

    except fds.sdk.WatchlistAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->watchlist_modify_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject2**](InlineObject2.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

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

# **watchlist_position_create_post**
> InlineResponse2003 watchlist_position_create_post()

Add position in watchlist.

The endpoint adds a new position in a watchlist.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.WatchlistAPIforDigitalPortals
from fds.sdk.WatchlistAPIforDigitalPortals.api import watchlist_api
from fds.sdk.WatchlistAPIforDigitalPortals.models import *
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
configuration = fds.sdk.WatchlistAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.WatchlistAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.WatchlistAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)

    body = InlineObject3(
        data=WatchlistPositionCreateData(
            name="name_example",
            notation="notation_example",
            additional_data="additional_data_example",
        ),
        meta=WatchlistCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject3 |  (optional)

    try:
        # Add position in watchlist.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.watchlist_position_create_post(body=body)
        pprint(api_response)

    except fds.sdk.WatchlistAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->watchlist_position_create_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject3**](InlineObject3.md)|  | [optional]

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

# **watchlist_position_delete_post**
> InlineResponse200 watchlist_position_delete_post()

Add position in watchlist.

The endpoint deletes a position in a watchlist.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.WatchlistAPIforDigitalPortals
from fds.sdk.WatchlistAPIforDigitalPortals.api import watchlist_api
from fds.sdk.WatchlistAPIforDigitalPortals.models import *
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
configuration = fds.sdk.WatchlistAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.WatchlistAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.WatchlistAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)

    body = InlineObject4(
        data=WatchlistPositionDeleteData(
            name="name_example",
            id=3.14,
        ),
        meta=WatchlistCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject4 |  (optional)

    try:
        # Add position in watchlist.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.watchlist_position_delete_post(body=body)
        pprint(api_response)

    except fds.sdk.WatchlistAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->watchlist_position_delete_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject4**](InlineObject4.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

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

# **watchlist_position_list_get**
> InlineResponse2004 watchlist_position_list_get(name)

List positions of watchlist.

The endpoint lists the positions of a watchlist.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.WatchlistAPIforDigitalPortals
from fds.sdk.WatchlistAPIforDigitalPortals.api import watchlist_api
from fds.sdk.WatchlistAPIforDigitalPortals.models import *
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
configuration = fds.sdk.WatchlistAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.WatchlistAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.WatchlistAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)

    name = "name_example" # str | Name of watchlist
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    sort = [
        "["id"]",
    ] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["id"]
    pagination_offset = 0.0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0.0
    pagination_limit = 20.0 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20.0

    try:
        # List positions of watchlist.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.watchlist_position_list_get(name, attributes=attributes, sort=sort, pagination_offset=pagination_offset, pagination_limit=pagination_limit)
        pprint(api_response)

    except fds.sdk.WatchlistAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->watchlist_position_list_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| Name of watchlist |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["id"]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0.0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20.0

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

# **watchlist_position_modify_post**
> InlineResponse200 watchlist_position_modify_post()

Add position in watchlist.

The endpoint modifies a position in a watchlist. All properties except the position id are modifiable by the endpoint.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.WatchlistAPIforDigitalPortals
from fds.sdk.WatchlistAPIforDigitalPortals.api import watchlist_api
from fds.sdk.WatchlistAPIforDigitalPortals.models import *
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
configuration = fds.sdk.WatchlistAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.WatchlistAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.WatchlistAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)

    body = InlineObject5(
        data=WatchlistPositionModifyData(
            name="name_example",
            id=3.14,
            notation="notation_example",
            additional_data="additional_data_example",
        ),
        meta=WatchlistCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject5 |  (optional)

    try:
        # Add position in watchlist.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.watchlist_position_modify_post(body=body)
        pprint(api_response)

    except fds.sdk.WatchlistAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->watchlist_position_modify_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject5**](InlineObject5.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

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

