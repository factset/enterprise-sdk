# fds.sdk.IRNConfiguration.ContactsPhoneNumberTypesApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_phone_number_type**](ContactsPhoneNumberTypesApi.md#create_phone_number_type) | **POST** /v1/phone-number-types | Create a phone type
[**delete_phone_number_type**](ContactsPhoneNumberTypesApi.md#delete_phone_number_type) | **DELETE** /v1/phone-number-types/{phoneNumberTypeId} | Delete a phone type
[**get_phone_number_types**](ContactsPhoneNumberTypesApi.md#get_phone_number_types) | **GET** /v1/phone-number-types | Get list of the phone types configured in your group
[**update_phone_number_type**](ContactsPhoneNumberTypesApi.md#update_phone_number_type) | **PUT** /v1/phone-number-types/{phoneNumberTypeId} | Edit a phone type



# **create_phone_number_type**
> NewItemDto create_phone_number_type(body)

Create a phone type

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import contacts___phone_number_types_api
from fds.sdk.IRNConfiguration.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.IRNConfiguration.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNConfiguration.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNConfiguration.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = contacts___phone_number_types_api.ContactsPhoneNumberTypesApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    body = "body_example" # str | To add phoneNumberType

    try:
        # Create a phone type
        # example passing only required values which don't have defaults set
        api_response = api_instance.create_phone_number_type(body)

        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling ContactsPhoneNumberTypesApi->create_phone_number_type: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **str**| To add phoneNumberType |

### Return type

[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad Request |  -  |
**0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_phone_number_type**
> delete_phone_number_type(phone_number_type_id)

Delete a phone type

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import contacts___phone_number_types_api
from fds.sdk.IRNConfiguration.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.IRNConfiguration.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNConfiguration.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNConfiguration.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = contacts___phone_number_types_api.ContactsPhoneNumberTypesApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    phone_number_type_id = "phoneNumberTypeId_example" # str | phoneNumberTypeId for deleting associated record

    try:
        # Delete a phone type
        # example passing only required values which don't have defaults set
        api_instance.delete_phone_number_type(phone_number_type_id)


    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling ContactsPhoneNumberTypesApi->delete_phone_number_type: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number_type_id** | **str**| phoneNumberTypeId for deleting associated record |

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_phone_number_types**
> [PhoneNumberTypeDto] get_phone_number_types()

Get list of the phone types configured in your group

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import contacts___phone_number_types_api
from fds.sdk.IRNConfiguration.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.IRNConfiguration.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNConfiguration.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNConfiguration.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = contacts___phone_number_types_api.ContactsPhoneNumberTypesApi(api_client)


    try:
        # Get list of the phone types configured in your group
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_phone_number_types()

        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling ContactsPhoneNumberTypesApi->get_phone_number_types: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**[PhoneNumberTypeDto]**](PhoneNumberTypeDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_phone_number_type**
> update_phone_number_type(phone_number_type_id, body)

Edit a phone type

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import contacts___phone_number_types_api
from fds.sdk.IRNConfiguration.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.IRNConfiguration.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNConfiguration.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNConfiguration.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = contacts___phone_number_types_api.ContactsPhoneNumberTypesApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    phone_number_type_id = "phoneNumberTypeId_example" # str | phoneNumberTypeId to update associated record
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    body = "body_example" # str | Update with phoneNumberType

    try:
        # Edit a phone type
        # example passing only required values which don't have defaults set
        api_instance.update_phone_number_type(phone_number_type_id, body)


    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling ContactsPhoneNumberTypesApi->update_phone_number_type: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number_type_id** | **str**| phoneNumberTypeId to update associated record |
 **body** | **str**| Update with phoneNumberType |

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

