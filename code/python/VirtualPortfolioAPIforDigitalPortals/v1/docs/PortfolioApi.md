# fds.sdk.VirtualPortfolioAPIforDigitalPortals.PortfolioApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_portfolio_get**](PortfolioApi.md#get_portfolio_get) | **GET** /portfolio/get | Details of a portfolio.
[**get_portfolio_list**](PortfolioApi.md#get_portfolio_list) | **GET** /portfolio/list | List of portfolios with keyfigures.
[**get_portfolio_name_list**](PortfolioApi.md#get_portfolio_name_list) | **GET** /portfolio/name/list | List of portfolios.
[**get_portfolio_position_list**](PortfolioApi.md#get_portfolio_position_list) | **GET** /portfolio/position/list | List all open positions of a portfolio.
[**get_portfolio_transaction_list**](PortfolioApi.md#get_portfolio_transaction_list) | **GET** /portfolio/transaction/list | List of transactions in a portfolio.
[**post_portfolio_create**](PortfolioApi.md#post_portfolio_create) | **POST** /portfolio/create | Create a portfolio.
[**post_portfolio_delete**](PortfolioApi.md#post_portfolio_delete) | **POST** /portfolio/delete | Delete a portfolio.
[**post_portfolio_evaluation_list**](PortfolioApi.md#post_portfolio_evaluation_list) | **POST** /portfolio/evaluation/list | Evaluate a portfolio.
[**post_portfolio_modify**](PortfolioApi.md#post_portfolio_modify) | **POST** /portfolio/modify | Modify a portfolio.
[**post_portfolio_payout_create**](PortfolioApi.md#post_portfolio_payout_create) | **POST** /portfolio/payout/create | Add a payout to a portfolio.
[**post_portfolio_payout_delete**](PortfolioApi.md#post_portfolio_payout_delete) | **POST** /portfolio/payout/delete | Delete a payout of a portfolio.
[**post_portfolio_payout_list**](PortfolioApi.md#post_portfolio_payout_list) | **POST** /portfolio/payout/list | List of payouts in a portfolio.
[**post_portfolio_payout_modify**](PortfolioApi.md#post_portfolio_payout_modify) | **POST** /portfolio/payout/modify | Modify a payout in a portfolio.
[**post_portfolio_position_closed_list**](PortfolioApi.md#post_portfolio_position_closed_list) | **POST** /portfolio/position/closed/list | List all closed positions of a portfolio.
[**post_portfolio_transaction_cash_create**](PortfolioApi.md#post_portfolio_transaction_cash_create) | **POST** /portfolio/transaction/cash/create | Add a cash transaction to a portfolio.
[**post_portfolio_transaction_cash_delete**](PortfolioApi.md#post_portfolio_transaction_cash_delete) | **POST** /portfolio/transaction/cash/delete | Delete a cash transaction.
[**post_portfolio_transaction_create**](PortfolioApi.md#post_portfolio_transaction_create) | **POST** /portfolio/transaction/create | Add a transaction to a portfolio.
[**post_portfolio_transaction_delete**](PortfolioApi.md#post_portfolio_transaction_delete) | **POST** /portfolio/transaction/delete | Delete a transaction of a portfolio.
[**post_portfolio_transaction_modify**](PortfolioApi.md#post_portfolio_transaction_modify) | **POST** /portfolio/transaction/modify | Modify a transaction in a portfolio.


# **get_portfolio_get**
> InlineResponse2001 get_portfolio_get(id)

Details of a portfolio.

Details of a portfolio.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
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
    api_instance = portfolio_api.PortfolioApi(api_client)

    id = "id_example" # str | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Details of a portfolio.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_portfolio_get(id, attributes=attributes)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->get_portfolio_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  |
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

# **get_portfolio_list**
> InlineResponse2002 get_portfolio_list()

List of portfolios with keyfigures.

List of portfolios with keyfigures.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
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
    api_instance = portfolio_api.PortfolioApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    sort = ["name"] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["name"]

    try:
        # List of portfolios with keyfigures.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_portfolio_list(attributes=attributes, sort=sort)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->get_portfolio_list: %s\n" % e)
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

# **get_portfolio_name_list**
> InlineResponse2005 get_portfolio_name_list()

List of portfolios.

List of portfolios.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
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
    api_instance = portfolio_api.PortfolioApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    sort = ["name"] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["name"]

    try:
        # List of portfolios.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_portfolio_name_list(attributes=attributes, sort=sort)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->get_portfolio_name_list: %s\n" % e)
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

# **get_portfolio_position_list**
> InlineResponse2009 get_portfolio_position_list(id)

List all open positions of a portfolio.

List all open positions of a portfolio.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
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
    api_instance = portfolio_api.PortfolioApi(api_client)

    id = "id_example" # str | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)
    sort = ["positions.instrument.name"] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["positions.instrument.name"]
    pagination_offset = 0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0
    pagination_limit = 20 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20

    try:
        # List all open positions of a portfolio.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_portfolio_position_list(id, attributes=attributes, language=language, sort=sort, pagination_offset=pagination_offset, pagination_limit=pagination_limit)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->get_portfolio_position_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["positions.instrument.name"]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

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

# **get_portfolio_transaction_list**
> InlineResponse20011 get_portfolio_transaction_list(id)

List of transactions in a portfolio.

List of transactions in a portfolio.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
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
    api_instance = portfolio_api.PortfolioApi(api_client)

    id = "id_example" # str | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)
    sort = ["instrument.name"] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 7 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["instrument.name"]
    pagination_offset = 0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0
    pagination_limit = 20 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20

    try:
        # List of transactions in a portfolio.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_portfolio_transaction_list(id, attributes=attributes, language=language, sort=sort, pagination_offset=pagination_offset, pagination_limit=pagination_limit)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->get_portfolio_transaction_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 7 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["instrument.name"]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20

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

# **post_portfolio_create**
> InlineResponse201 post_portfolio_create(inline_object)

Create a portfolio.

Create a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of portfolios would exceed 100.|400 Bad Request|

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
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
    api_instance = portfolio_api.PortfolioApi(api_client)

    inline_object = InlineObject(
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

    try:
        # Create a portfolio.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_portfolio_create(inline_object)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->post_portfolio_create: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object** | [**InlineObject**](InlineObject.md)|  |

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

# **post_portfolio_delete**
> InlineResponse200 post_portfolio_delete()

Delete a portfolio.

Delete a portfolio.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
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
    api_instance = portfolio_api.PortfolioApi(api_client)

    inline_object1 = InlineObject1(
        data=PortfolioDeleteData(
            id="id_example",
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject1 |  (optional)

    try:
        # Delete a portfolio.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_portfolio_delete(inline_object1=inline_object1)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->post_portfolio_delete: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object1** | [**InlineObject1**](InlineObject1.md)|  | [optional]

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

# **post_portfolio_evaluation_list**
> InlineResponse2004 post_portfolio_evaluation_list()

Evaluate a portfolio.

Performs an evaluation over a period of time and returns portfolio key figures for each day, week, or month.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
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
    api_instance = portfolio_api.PortfolioApi(api_client)

    inline_object3 = InlineObject3(
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

    try:
        # Evaluate a portfolio.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_portfolio_evaluation_list(inline_object3=inline_object3)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->post_portfolio_evaluation_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object3** | [**InlineObject3**](InlineObject3.md)|  | [optional]

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

# **post_portfolio_modify**
> InlineResponse2003 post_portfolio_modify()

Modify a portfolio.

Modify a portfolio.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
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
    api_instance = portfolio_api.PortfolioApi(api_client)

    inline_object2 = InlineObject2(
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

    try:
        # Modify a portfolio.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_portfolio_modify(inline_object2=inline_object2)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->post_portfolio_modify: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object2** | [**InlineObject2**](InlineObject2.md)|  | [optional]

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

# **post_portfolio_payout_create**
> InlineResponse2011 post_portfolio_payout_create()

Add a payout to a portfolio.

Add a payout to a portfolio.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
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
    api_instance = portfolio_api.PortfolioApi(api_client)

    inline_object4 = InlineObject4(
        data=PortfolioPayoutCreateData(
            id="id_example",
            type="dividend",
            notation=PortfolioPayoutCreateDataNotation(
                id="id_example",
            ),
            time="time_example",
            amount=3.14,
            transaction=PortfolioPayoutCreateDataTransaction(
                id="id_example",
            ),
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject4 |  (optional)

    try:
        # Add a payout to a portfolio.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_portfolio_payout_create(inline_object4=inline_object4)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->post_portfolio_payout_create: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object4** | [**InlineObject4**](InlineObject4.md)|  | [optional]

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

# **post_portfolio_payout_delete**
> InlineResponse2006 post_portfolio_payout_delete()

Delete a payout of a portfolio.

Delete a payout of a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |Invalid payout identifier.|400 Bad Request|

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
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
    api_instance = portfolio_api.PortfolioApi(api_client)

    inline_object5 = InlineObject5(
        data=PortfolioPayoutDeleteData(
            id="id_example",
            payout=PortfolioPayoutDeleteDataPayout(
                id="id_example",
            ),
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject5 |  (optional)

    try:
        # Delete a payout of a portfolio.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_portfolio_payout_delete(inline_object5=inline_object5)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->post_portfolio_payout_delete: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object5** | [**InlineObject5**](InlineObject5.md)|  | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

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

# **post_portfolio_payout_list**
> InlineResponse2007 post_portfolio_payout_list(inline_object6)

List of payouts in a portfolio.

List of payouts in a portfolio.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
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
    api_instance = portfolio_api.PortfolioApi(api_client)

    inline_object6 = InlineObject6(
        data=PortfolioPayoutListData(
            id="id_example",
            filter=PortfolioPayoutListDataFilter(
                instrument=PortfolioPayoutListDataFilterInstrument(
                    id="id_example",
                ),
            ),
        ),
        meta=PortfolioPayoutListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            sort=["time"],
            pagination=PortfolioPayoutListMetaPagination(
                offset=0,
                limit=20,
            ),
        ),
    ) # InlineObject6 | 

    try:
        # List of payouts in a portfolio.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_portfolio_payout_list(inline_object6)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->post_portfolio_payout_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object6** | [**InlineObject6**](InlineObject6.md)|  |

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

# **post_portfolio_payout_modify**
> InlineResponse2008 post_portfolio_payout_modify()

Modify a payout in a portfolio.

Modify a payout in a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |At least one of the parameters `notation`, `type`, `amount`, `transaction` or `time` must be set.|400 Bad Request| |Invalid payout identifier.|400 Bad Request|

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
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
    api_instance = portfolio_api.PortfolioApi(api_client)

    inline_object7 = InlineObject7(
        data=PortfolioPayoutModifyData(
            id="id_example",
            payout=PortfolioPayoutModifyDataPayout(
                id="id_example",
                type="dividend",
                notation=PortfolioPayoutModifyDataPayoutNotation(
                    id="id_example",
                ),
                time="time_example",
                amount=3.14,
                transaction=PortfolioPayoutModifyDataPayoutTransaction(
                    id="id_example",
                ),
            ),
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject7 |  (optional)

    try:
        # Modify a payout in a portfolio.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_portfolio_payout_modify(inline_object7=inline_object7)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->post_portfolio_payout_modify: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object7** | [**InlineObject7**](InlineObject7.md)|  | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

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

# **post_portfolio_position_closed_list**
> InlineResponse20010 post_portfolio_position_closed_list()

List all closed positions of a portfolio.

List all closed positions of a portfolio.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
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
    api_instance = portfolio_api.PortfolioApi(api_client)

    inline_object8 = InlineObject8(
        data=PortfolioPositionClosedListData(
            id="id_example",
            range=PortfolioPositionClosedListDataRange(
                start=dateutil_parser('1970-01-01').date(),
                end=dateutil_parser('1970-01-01').date(),
            ),
        ),
        meta=PortfolioPositionClosedListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
            sort=["positions.instrument.name"],
            pagination=PortfolioPositionClosedListMetaPagination(
                offset=0,
                limit=20,
            ),
        ),
    ) # InlineObject8 |  (optional)

    try:
        # List all closed positions of a portfolio.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_portfolio_position_closed_list(inline_object8=inline_object8)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->post_portfolio_position_closed_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object8** | [**InlineObject8**](InlineObject8.md)|  | [optional]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

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

# **post_portfolio_transaction_cash_create**
> InlineResponse2012 post_portfolio_transaction_cash_create()

Add a cash transaction to a portfolio.

Add a cash transaction to a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of transactions would exceed 1000.|400 Bad Request|

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
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
    api_instance = portfolio_api.PortfolioApi(api_client)

    inline_object12 = InlineObject12(
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
    ) # InlineObject12 |  (optional)

    try:
        # Add a cash transaction to a portfolio.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_portfolio_transaction_cash_create(inline_object12=inline_object12)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->post_portfolio_transaction_cash_create: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object12** | [**InlineObject12**](InlineObject12.md)|  | [optional]

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
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_portfolio_transaction_cash_delete**
> InlineResponse2006 post_portfolio_transaction_cash_delete()

Delete a cash transaction.

Delete a cash transaction.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
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
    api_instance = portfolio_api.PortfolioApi(api_client)

    inline_object13 = InlineObject13(
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
    ) # InlineObject13 |  (optional)

    try:
        # Delete a cash transaction.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_portfolio_transaction_cash_delete(inline_object13=inline_object13)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->post_portfolio_transaction_cash_delete: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object13** | [**InlineObject13**](InlineObject13.md)|  | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

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

# **post_portfolio_transaction_create**
> InlineResponse2012 post_portfolio_transaction_create()

Add a transaction to a portfolio.

Add a transaction to a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of transactions would exceed 1000.|400 Bad Request|

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
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
    api_instance = portfolio_api.PortfolioApi(api_client)

    inline_object9 = InlineObject9(
        data=PortfolioTransactionCreateData(
            id="id_example",
            type="buy",
            notation=PortfolioPayoutCreateDataNotation(
                id="id_example",
            ),
            time="time_example",
            number_shares=3.14,
            price=3.14,
            charges=0,
            exchange_rate=1,
            parent_transaction=PortfolioTransactionCreateDataParentTransaction(
                id="id_example",
            ),
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject9 |  (optional)

    try:
        # Add a transaction to a portfolio.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_portfolio_transaction_create(inline_object9=inline_object9)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->post_portfolio_transaction_create: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object9** | [**InlineObject9**](InlineObject9.md)|  | [optional]

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

# **post_portfolio_transaction_delete**
> InlineResponse2006 post_portfolio_transaction_delete()

Delete a transaction of a portfolio.

Delete a transaction of a portfolio.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
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
    api_instance = portfolio_api.PortfolioApi(api_client)

    inline_object10 = InlineObject10(
        data=PortfolioTransactionDeleteData(
            id="id_example",
            transaction=PortfolioTransactionDeleteDataTransaction(
                id="id_example",
            ),
            notation=PortfolioPayoutModifyDataPayoutNotation(
                id="id_example",
            ),
        ),
        meta=PortfolioCreateMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject10 |  (optional)

    try:
        # Delete a transaction of a portfolio.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_portfolio_transaction_delete(inline_object10=inline_object10)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->post_portfolio_transaction_delete: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object10** | [**InlineObject10**](InlineObject10.md)|  | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

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

# **post_portfolio_transaction_modify**
> InlineResponse2008 post_portfolio_transaction_modify()

Modify a transaction in a portfolio.

Modify a transaction in a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |At least one of the parameters `numberShares`, `price`, `charges`, `exchangeRate` or `time` must be set.|400 Bad Request|

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
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
    api_instance = portfolio_api.PortfolioApi(api_client)

    inline_object11 = InlineObject11(
        data=PortfolioTransactionModifyData(
            id="id_example",
            transaction=PortfolioTransactionModifyDataTransaction(
                id="id_example",
                notation=PortfolioPayoutModifyDataPayoutNotation(
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
    ) # InlineObject11 |  (optional)

    try:
        # Modify a transaction in a portfolio.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_portfolio_transaction_modify(inline_object11=inline_object11)
        pprint(api_response)

    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->post_portfolio_transaction_modify: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object11** | [**InlineObject11**](InlineObject11.md)|  | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

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

