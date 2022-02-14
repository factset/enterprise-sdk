# fds.sdk.VirtualPortfolioAPIforDigitalPortals.WatchlistApi

All URIs are relative to *http://api-sandbox.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**watchlist_create_post**](WatchlistApi.md#watchlist_create_post) | **POST** /watchlist/create | Create a watchlist.
[**watchlist_delete_post**](WatchlistApi.md#watchlist_delete_post) | **POST** /watchlist/delete | Delete a watchlist.
[**watchlist_list_get**](WatchlistApi.md#watchlist_list_get) | **GET** /watchlist/list | List of watchlists.
[**watchlist_modify_post**](WatchlistApi.md#watchlist_modify_post) | **POST** /watchlist/modify | Modify a watchlist.
[**watchlist_position_create_post**](WatchlistApi.md#watchlist_position_create_post) | **POST** /watchlist/position/create | Add a position to a watchlist.
[**watchlist_position_delete_post**](WatchlistApi.md#watchlist_position_delete_post) | **POST** /watchlist/position/delete | Delete a position of a watchlist.
[**watchlist_position_list_get**](WatchlistApi.md#watchlist_position_list_get) | **GET** /watchlist/position/list | List of positions of a watchlist.
[**watchlist_position_modify_post**](WatchlistApi.md#watchlist_position_modify_post) | **POST** /watchlist/position/modify | Modify a position in a watchlist.


# **watchlist_create_post**
> InlineResponse2012 watchlist_create_post()

Create a watchlist.

Create a watchlist.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of watchlists would exceed 100.|400 Bad Request|

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import watchlist_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_response2012 import InlineResponse2012
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_object9 import InlineObject9
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)
    body = InlineObject9(
        data=WatchlistCreateData(
            name="HBXK<tBV:b1?ZVlP;i9BNC",
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject9 |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Create a watchlist.
        api_response = api_instance.watchlist_create_post(body=body)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->watchlist_create_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject9**](InlineObject9.md)|  | [optional]

### Return type

[**InlineResponse2012**](InlineResponse2012.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **watchlist_delete_post**
> InlineResponse200 watchlist_delete_post()

Delete a watchlist.

Delete a watchlist.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import watchlist_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_object10 import InlineObject10
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_response200 import InlineResponse200
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)
    body = InlineObject10(
        data=WatchlistDeleteData(
            id="id_example",
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject10 |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Delete a watchlist.
        api_response = api_instance.watchlist_delete_post(body=body)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->watchlist_delete_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject10**](InlineObject10.md)|  | [optional]

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

# **watchlist_list_get**
> InlineResponse20010 watchlist_list_get()

List of watchlists.

List of watchlists.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import watchlist_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_response20010 import InlineResponse20010
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    sort = [
        "["name"]",
    ] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 4 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["name"]

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List of watchlists.
        api_response = api_instance.watchlist_list_get(attributes=attributes, sort=sort)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->watchlist_list_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 4 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["name"]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

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
> InlineResponse2003 watchlist_modify_post()

Modify a watchlist.

Modify a watchlist.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import watchlist_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_response2003 import InlineResponse2003
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_object11 import InlineObject11
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)
    body = InlineObject11(
        data=WatchlistModifyData(
            id="id_example",
            name="HBXK<tBV:b1?ZVlP;i9BNC",
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject11 |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Modify a watchlist.
        api_response = api_instance.watchlist_modify_post(body=body)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->watchlist_modify_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject11**](InlineObject11.md)|  | [optional]

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

# **watchlist_position_create_post**
> InlineResponse2013 watchlist_position_create_post()

Add a position to a watchlist.

Add a position to a watchlist.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |Maximum number of watchlist positions would exceed 100.|400 Bad Request| |The watchlist does not exist.|400 Bad Request| |The notation already exists in the watchlist.|400 Bad Request|

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import watchlist_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_object12 import InlineObject12
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_response2013 import InlineResponse2013
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)
    body = InlineObject12(
        data=WatchlistPositionCreateData(
            id="id_example",
            notation=PortfolioTransactionCreateDataNotation(
                id="id_example",
            ),
            comment="HBXK<tBV:b1?ZVlP;i9BNC",
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject12 |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Add a position to a watchlist.
        api_response = api_instance.watchlist_position_create_post(body=body)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->watchlist_position_create_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject12**](InlineObject12.md)|  | [optional]

### Return type

[**InlineResponse2013**](InlineResponse2013.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **watchlist_position_delete_post**
> InlineResponse2003 watchlist_position_delete_post()

Delete a position of a watchlist.

Delete a position of a watchlist.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import watchlist_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_object13 import InlineObject13
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_response2003 import InlineResponse2003
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)
    body = InlineObject13(
        data=WatchlistPositionDeleteData(
            id="id_example",
            position=WatchlistPositionDeleteDataPosition(
                id=3.14,
            ),
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject13 |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Delete a position of a watchlist.
        api_response = api_instance.watchlist_position_delete_post(body=body)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->watchlist_position_delete_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject13**](InlineObject13.md)|  | [optional]

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

# **watchlist_position_list_get**
> InlineResponse20011 watchlist_position_list_get(id)

List of positions of a watchlist.

List of positions of a watchlist.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import watchlist_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_response20011 import InlineResponse20011
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)
    id = "id_example" # str | Identifier of the watchlist.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    sort = [
        "["id"]",
    ] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["id"]

    # example passing only required values which don't have defaults set
    try:
        # List of positions of a watchlist.
        api_response = api_instance.watchlist_position_list_get(id)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->watchlist_position_list_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List of positions of a watchlist.
        api_response = api_instance.watchlist_position_list_get(id, attributes=attributes, sort=sort)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->watchlist_position_list_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of the watchlist. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["id"]

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

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
> InlineResponse2003 watchlist_position_modify_post()

Modify a position in a watchlist.

Modify a position in a watchlist.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |At least one of the parameters `notation` or `comment` must be set.|400 Bad Request| |The notation already exists in the watchlist.|400 Bad Request|

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import watchlist_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_object14 import InlineObject14
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_response2003 import InlineResponse2003
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)
    body = InlineObject14(
        data=WatchlistPositionModifyData(
            id="id_example",
            position=WatchlistPositionModifyDataPosition(
                id=3.14,
            ),
            notation=PortfolioTransactionCreateDataNotation(
                id="id_example",
            ),
            comment="HBXK<tBV:b1?ZVlP;i9BNC",
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject14 |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Modify a position in a watchlist.
        api_response = api_instance.watchlist_position_modify_post(body=body)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->watchlist_position_modify_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject14**](InlineObject14.md)|  | [optional]

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

