# fds.sdk.VirtualPortfolioAPIforDigitalPortals.PortfolioApi

All URIs are relative to *http://api-sandbox.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**portfolio_create_post**](PortfolioApi.md#portfolio_create_post) | **POST** /portfolio/create | Create a portfolio.
[**portfolio_delete_post**](PortfolioApi.md#portfolio_delete_post) | **POST** /portfolio/delete | Delete a portfolio.
[**portfolio_evaluation_list_post**](PortfolioApi.md#portfolio_evaluation_list_post) | **POST** /portfolio/evaluation/list | Evaluate a portfolio.
[**portfolio_get_get**](PortfolioApi.md#portfolio_get_get) | **GET** /portfolio/get | Details of a portfolio.
[**portfolio_list_get**](PortfolioApi.md#portfolio_list_get) | **GET** /portfolio/list | List of portfolios with keyfigures.
[**portfolio_modify_post**](PortfolioApi.md#portfolio_modify_post) | **POST** /portfolio/modify | Modify a portfolio.
[**portfolio_name_list_get**](PortfolioApi.md#portfolio_name_list_get) | **GET** /portfolio/name/list | List of portfolios.
[**portfolio_position_list_get**](PortfolioApi.md#portfolio_position_list_get) | **GET** /portfolio/position/list | List all positions of a portfolio.
[**portfolio_transaction_cash_create_post**](PortfolioApi.md#portfolio_transaction_cash_create_post) | **POST** /portfolio/transaction/cash/create | Add a cash transaction to a portfolio.
[**portfolio_transaction_cash_delete_post**](PortfolioApi.md#portfolio_transaction_cash_delete_post) | **POST** /portfolio/transaction/cash/delete | Delete a cash transaction.
[**portfolio_transaction_create_post**](PortfolioApi.md#portfolio_transaction_create_post) | **POST** /portfolio/transaction/create | Add a transaction to a portfolio.
[**portfolio_transaction_delete_post**](PortfolioApi.md#portfolio_transaction_delete_post) | **POST** /portfolio/transaction/delete | Delete a transaction of a portfolio.
[**portfolio_transaction_list_get**](PortfolioApi.md#portfolio_transaction_list_get) | **GET** /portfolio/transaction/list | List of transactions in a portfolio.
[**portfolio_transaction_modify_post**](PortfolioApi.md#portfolio_transaction_modify_post) | **POST** /portfolio/transaction/modify | Modify a transaction in a portfolio.


# **portfolio_create_post**
> InlineResponse201 portfolio_create_post(body)

Create a portfolio.

Create a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of portfolios would exceed 100.|400 Bad Request|

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_response201 import InlineResponse201
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_object import InlineObject
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
    api_instance = portfolio_api.PortfolioApi(api_client)
    body = InlineObject(
        data=PortfolioCreateData(
            name="H",
            currency=PortfolioCreateDataCurrency(
                iso_code="EUR",
            ),
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject | 

    # example passing only required values which don't have defaults set
    try:
        # Create a portfolio.
        api_response = api_instance.portfolio_create_post(body)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->portfolio_create_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject**](InlineObject.md)|  |

### Return type

[**InlineResponse201**](InlineResponse201.md)

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

# **portfolio_delete_post**
> InlineResponse200 portfolio_delete_post()

Delete a portfolio.

Delete a portfolio.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_object1 import InlineObject1
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
    api_instance = portfolio_api.PortfolioApi(api_client)
    body = InlineObject1(
        data=PortfolioDeleteData(
            id="id_example",
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject1 |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Delete a portfolio.
        api_response = api_instance.portfolio_delete_post(body=body)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->portfolio_delete_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject1**](InlineObject1.md)|  | [optional]

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

# **portfolio_evaluation_list_post**
> InlineResponse2004 portfolio_evaluation_list_post()

Evaluate a portfolio.

Performs an evaluation over a period of time and returns portfolio key figures for each day, week, or month.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_response2004 import InlineResponse2004
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_object3 import InlineObject3
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
    api_instance = portfolio_api.PortfolioApi(api_client)
    body = InlineObject3(
        data=PortfolioEvaluationListData(
            id="id_example",
            range=PortfolioEvaluationListDataRange(
                start=dateutil_parser('1970-01-01').date(),
                end=dateutil_parser('1970-01-01').date(),
            ),
            resolution="daily",
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject3 |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Evaluate a portfolio.
        api_response = api_instance.portfolio_evaluation_list_post(body=body)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->portfolio_evaluation_list_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject3**](InlineObject3.md)|  | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

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

# **portfolio_get_get**
> InlineResponse2001 portfolio_get_get(id)

Details of a portfolio.

Details of a portfolio.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_response2001 import InlineResponse2001
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
    api_instance = portfolio_api.PortfolioApi(api_client)
    id = "id_example" # str | Identifier of the portfolio.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Details of a portfolio.
        api_response = api_instance.portfolio_get_get(id)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->portfolio_get_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Details of a portfolio.
        api_response = api_instance.portfolio_get_get(id, attributes=attributes)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->portfolio_get_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of the portfolio. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

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

# **portfolio_list_get**
> InlineResponse2002 portfolio_list_get()

List of portfolios with keyfigures.

List of portfolios with keyfigures.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_response2002 import InlineResponse2002
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
    api_instance = portfolio_api.PortfolioApi(api_client)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    sort = [
        "["name"]",
    ] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["name"]

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List of portfolios with keyfigures.
        api_response = api_instance.portfolio_list_get(attributes=attributes, sort=sort)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->portfolio_list_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["name"]

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

# **portfolio_modify_post**
> InlineResponse2003 portfolio_modify_post()

Modify a portfolio.

Modify a portfolio.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_object2 import InlineObject2
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
    api_instance = portfolio_api.PortfolioApi(api_client)
    body = InlineObject2(
        data=PortfolioModifyData(
            id="id_example",
            name="HBXK<tBV:b1?ZVlP;i9BNC",
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject2 |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Modify a portfolio.
        api_response = api_instance.portfolio_modify_post(body=body)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->portfolio_modify_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject2**](InlineObject2.md)|  | [optional]

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

# **portfolio_name_list_get**
> InlineResponse2005 portfolio_name_list_get()

List of portfolios.

List of portfolios.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_response2005 import InlineResponse2005
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
    api_instance = portfolio_api.PortfolioApi(api_client)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    sort = [
        "["name"]",
    ] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["name"]

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List of portfolios.
        api_response = api_instance.portfolio_name_list_get(attributes=attributes, sort=sort)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->portfolio_name_list_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["name"]

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

# **portfolio_position_list_get**
> InlineResponse2006 portfolio_position_list_get(id)

List all positions of a portfolio.

List all positions of a portfolio.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_response2006 import InlineResponse2006
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
    api_instance = portfolio_api.PortfolioApi(api_client)
    id = "id_example" # str | Identifier of the portfolio.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    # example passing only required values which don't have defaults set
    try:
        # List all positions of a portfolio.
        api_response = api_instance.portfolio_position_list_get(id)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->portfolio_position_list_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List all positions of a portfolio.
        api_response = api_instance.portfolio_position_list_get(id, attributes=attributes)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->portfolio_position_list_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of the portfolio. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

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

# **portfolio_transaction_cash_create_post**
> InlineResponse2011 portfolio_transaction_cash_create_post()

Add a cash transaction to a portfolio.

Add a cash transaction to a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of transactions would exceed 1000.|400 Bad Request|

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_object7 import InlineObject7
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_response2011 import InlineResponse2011
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
    api_instance = portfolio_api.PortfolioApi(api_client)
    body = InlineObject7(
        data=PortfolioTransactionCashCreateData(
            id="id_example",
            time="time_example",
            amount=3.14,
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject7 |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Add a cash transaction to a portfolio.
        api_response = api_instance.portfolio_transaction_cash_create_post(body=body)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->portfolio_transaction_cash_create_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject7**](InlineObject7.md)|  | [optional]

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

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

# **portfolio_transaction_cash_delete_post**
> InlineResponse2007 portfolio_transaction_cash_delete_post()

Delete a cash transaction.

Delete a cash transaction.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_object8 import InlineObject8
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_response2007 import InlineResponse2007
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
    api_instance = portfolio_api.PortfolioApi(api_client)
    body = InlineObject8(
        data=PortfolioTransactionCashDeleteData(
            id="id_example",
            transaction=PortfolioTransactionDeleteDataTransaction(
                id="id_example",
            ),
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject8 |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Delete a cash transaction.
        api_response = api_instance.portfolio_transaction_cash_delete_post(body=body)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->portfolio_transaction_cash_delete_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject8**](InlineObject8.md)|  | [optional]

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

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

# **portfolio_transaction_create_post**
> InlineResponse2011 portfolio_transaction_create_post()

Add a transaction to a portfolio.

Add a transaction to a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of transactions would exceed 1000.|400 Bad Request|

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_response2011 import InlineResponse2011
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_object4 import InlineObject4
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
    api_instance = portfolio_api.PortfolioApi(api_client)
    body = InlineObject4(
        data=PortfolioTransactionCreateData(
            id="id_example",
            type="buy",
            notation=PortfolioTransactionCreateDataNotation(
                id="id_example",
            ),
            time="time_example",
            number_shares=3.14,
            price=3.14,
            charges=3.14,
            exchange_rate=3.14,
            parent_transaction=PortfolioTransactionCreateDataParentTransaction(
                id="id_example",
            ),
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject4 |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Add a transaction to a portfolio.
        api_response = api_instance.portfolio_transaction_create_post(body=body)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->portfolio_transaction_create_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject4**](InlineObject4.md)|  | [optional]

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

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

# **portfolio_transaction_delete_post**
> InlineResponse2007 portfolio_transaction_delete_post()

Delete a transaction of a portfolio.

Delete a transaction of a portfolio.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_object5 import InlineObject5
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_response2007 import InlineResponse2007
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
    api_instance = portfolio_api.PortfolioApi(api_client)
    body = InlineObject5(
        data=PortfolioTransactionDeleteData(
            id="id_example",
            transaction=PortfolioTransactionDeleteDataTransaction(
                id="id_example",
            ),
            notation=PortfolioTransactionDeleteDataNotation(
                id="id_example",
            ),
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject5 |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Delete a transaction of a portfolio.
        api_response = api_instance.portfolio_transaction_delete_post(body=body)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->portfolio_transaction_delete_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject5**](InlineObject5.md)|  | [optional]

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

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

# **portfolio_transaction_list_get**
> InlineResponse2008 portfolio_transaction_list_get(id)

List of transactions in a portfolio.

List of transactions in a portfolio.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_response2008 import InlineResponse2008
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
    api_instance = portfolio_api.PortfolioApi(api_client)
    id = "id_example" # str | Identifier of the portfolio.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    # example passing only required values which don't have defaults set
    try:
        # List of transactions in a portfolio.
        api_response = api_instance.portfolio_transaction_list_get(id)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->portfolio_transaction_list_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List of transactions in a portfolio.
        api_response = api_instance.portfolio_transaction_list_get(id, attributes=attributes)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->portfolio_transaction_list_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of the portfolio. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

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

# **portfolio_transaction_modify_post**
> InlineResponse2009 portfolio_transaction_modify_post()

Modify a transaction in a portfolio.

Modify a transaction in a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |At least one of the parameters `numberShares`, `price`, `charges`, `exchangeRate` or `time` must be set.|400 Bad Request|

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_response2009 import InlineResponse2009
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.inline_object6 import InlineObject6
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
    api_instance = portfolio_api.PortfolioApi(api_client)
    body = InlineObject6(
        data=PortfolioTransactionModifyData(
            id="id_example",
            transaction=PortfolioTransactionModifyDataTransaction(
                id="id_example",
                notation=PortfolioTransactionDeleteDataNotation(
                    id="id_example",
                ),
                time="time_example",
                number_shares=3.14,
                price=3.14,
                charges=3.14,
                exchange_rate=3.14,
            ),
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject6 |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Modify a transaction in a portfolio.
        api_response = api_instance.portfolio_transaction_modify_post(body=body)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->portfolio_transaction_modify_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject6**](InlineObject6.md)|  | [optional]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

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

