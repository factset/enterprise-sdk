# fds.sdk.VirtualPortfolioAPIforDigitalPortals.WatchlistApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_watchlist_get**](WatchlistApi.md#get_watchlist_get) | **GET** /watchlist/get | Details of a watchlist.
[**get_watchlist_list**](WatchlistApi.md#get_watchlist_list) | **GET** /watchlist/list | List of watchlists.
[**get_watchlist_position_list**](WatchlistApi.md#get_watchlist_position_list) | **GET** /watchlist/position/list | List of positions of a watchlist.
[**post_watchlist_create**](WatchlistApi.md#post_watchlist_create) | **POST** /watchlist/create | Create a watchlist.
[**post_watchlist_delete**](WatchlistApi.md#post_watchlist_delete) | **POST** /watchlist/delete | Delete a watchlist.
[**post_watchlist_modify**](WatchlistApi.md#post_watchlist_modify) | **POST** /watchlist/modify | Modify a watchlist.
[**post_watchlist_position_create**](WatchlistApi.md#post_watchlist_position_create) | **POST** /watchlist/position/create | Add a position to a watchlist.
[**post_watchlist_position_delete**](WatchlistApi.md#post_watchlist_position_delete) | **POST** /watchlist/position/delete | Delete a position of a watchlist.
[**post_watchlist_position_get**](WatchlistApi.md#post_watchlist_position_get) | **POST** /watchlist/position/get | Details of the position of a watchlist.
[**post_watchlist_position_modify**](WatchlistApi.md#post_watchlist_position_modify) | **POST** /watchlist/position/modify | Modify a position in a watchlist.


# **get_watchlist_get**
> InlineResponse20012 get_watchlist_get(id)

Details of a watchlist.

Details of a watchlist.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import watchlist_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.models import *
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
configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)

    id = "id_example" # str | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Details of a watchlist.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_watchlist_get(id, attributes=attributes)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->get_watchlist_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

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

# **get_watchlist_list**
> InlineResponse20013 get_watchlist_list()

List of watchlists.

List of watchlists.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import watchlist_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.models import *
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
configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    sort = ["name"] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 4 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["name"]

    try:
        # List of watchlists.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_watchlist_list(attributes=attributes, sort=sort)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->get_watchlist_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 4 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["name"]

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

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

# **get_watchlist_position_list**
> InlineResponse20015 get_watchlist_position_list(id)

List of positions of a watchlist.

List of positions of a watchlist.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import watchlist_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.models import *
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
configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)

    id = "id_example" # str | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    sort = ["id"] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["id"]

    try:
        # List of positions of a watchlist.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_watchlist_position_list(id, attributes=attributes, sort=sort)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->get_watchlist_position_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["id"]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

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

# **post_watchlist_create**
> InlineResponse2013 post_watchlist_create()

Create a watchlist.

Create a watchlist.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of watchlists would exceed 100.|400 Bad Request|

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import watchlist_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.models import *
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
configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)

    inline_object14 = InlineObject14(
        data=WatchlistCreateData(
            name="HBXK<tBV:b1?ZVlP;i9BNC",
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject14 |  (optional)

    try:
        # Create a watchlist.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_watchlist_create(inline_object14=inline_object14)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->post_watchlist_create: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object14** | [**InlineObject14**](InlineObject14.md)|  | [optional]

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

# **post_watchlist_delete**
> InlineResponse200 post_watchlist_delete()

Delete a watchlist.

Delete a watchlist.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import watchlist_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.models import *
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
configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)

    inline_object15 = InlineObject15(
        data=WatchlistDeleteData(
            id="id_example",
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject15 |  (optional)

    try:
        # Delete a watchlist.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_watchlist_delete(inline_object15=inline_object15)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->post_watchlist_delete: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object15** | [**InlineObject15**](InlineObject15.md)|  | [optional]

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

# **post_watchlist_modify**
> InlineResponse2003 post_watchlist_modify()

Modify a watchlist.

Modify a watchlist.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import watchlist_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.models import *
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
configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)

    inline_object16 = InlineObject16(
        data=WatchlistModifyData(
            id="id_example",
            name="HBXK<tBV:b1?ZVlP;i9BNC",
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject16 |  (optional)

    try:
        # Modify a watchlist.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_watchlist_modify(inline_object16=inline_object16)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->post_watchlist_modify: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object16** | [**InlineObject16**](InlineObject16.md)|  | [optional]

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

# **post_watchlist_position_create**
> InlineResponse2014 post_watchlist_position_create()

Add a position to a watchlist.

Add a position to a watchlist.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |Maximum number of watchlist positions would exceed 100.|400 Bad Request| |The watchlist does not exist.|400 Bad Request| |The notation already exists in the watchlist.|400 Bad Request|

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import watchlist_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.models import *
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
configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)

    inline_object17 = InlineObject17(
        data=WatchlistPositionCreateData(
            id="id_example",
            notation=PortfolioPayoutCreateDataNotation(
                id="id_example",
            ),
            comment="HBXK<tBV:b1?ZVlP;i9BNC",
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject17 |  (optional)

    try:
        # Add a position to a watchlist.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_watchlist_position_create(inline_object17=inline_object17)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->post_watchlist_position_create: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object17** | [**InlineObject17**](InlineObject17.md)|  | [optional]

### Return type

[**InlineResponse2014**](InlineResponse2014.md)

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

# **post_watchlist_position_delete**
> InlineResponse2003 post_watchlist_position_delete()

Delete a position of a watchlist.

Delete a position of a watchlist.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import watchlist_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.models import *
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
configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)

    inline_object18 = InlineObject18(
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
    ) # InlineObject18 |  (optional)

    try:
        # Delete a position of a watchlist.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_watchlist_position_delete(inline_object18=inline_object18)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->post_watchlist_position_delete: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object18** | [**InlineObject18**](InlineObject18.md)|  | [optional]

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

# **post_watchlist_position_get**
> InlineResponse20014 post_watchlist_position_get()

Details of the position of a watchlist.

Details of the position of a watchlist.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import watchlist_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.models import *
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
configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)

    inline_object19 = InlineObject19(
        data=WatchlistPositionGetData(
            id="id_example",
            position=WatchlistPositionGetDataPosition(
                id=3.14,
            ),
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject19 |  (optional)

    try:
        # Details of the position of a watchlist.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_watchlist_position_get(inline_object19=inline_object19)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->post_watchlist_position_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object19** | [**InlineObject19**](InlineObject19.md)|  | [optional]

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

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

# **post_watchlist_position_modify**
> InlineResponse2003 post_watchlist_position_modify()

Modify a position in a watchlist.

Modify a position in a watchlist.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |At least one of the parameters `notation` or `comment` must be set.|400 Bad Request| |The notation already exists in the watchlist.|400 Bad Request|

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import watchlist_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.models import *
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
configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = watchlist_api.WatchlistApi(api_client)

    inline_object20 = InlineObject20(
        data=WatchlistPositionModifyData(
            id="id_example",
            position=WatchlistPositionModifyDataPosition(
                id=3.14,
            ),
            notation=PortfolioPayoutCreateDataNotation(
                id="id_example",
            ),
            comment="HBXK<tBV:b1?ZVlP;i9BNC",
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject20 |  (optional)

    try:
        # Modify a position in a watchlist.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_watchlist_position_modify(inline_object20=inline_object20)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling WatchlistApi->post_watchlist_position_modify: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object20** | [**InlineObject20**](InlineObject20.md)|  | [optional]

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

