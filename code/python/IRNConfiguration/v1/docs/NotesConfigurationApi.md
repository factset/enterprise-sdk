# fds.sdk.IRNConfiguration.NotesConfigurationApi

All URIs are relative to *https://api.factset.com/research/irn/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_assigned_fact_set_users**](NotesConfigurationApi.md#get_assigned_fact_set_users) | **GET** /users | Get all assigned FactSet users
[**get_authors**](NotesConfigurationApi.md#get_authors) | **GET** /authors | Get all Authors
[**get_clients_sales_representative**](NotesConfigurationApi.md#get_clients_sales_representative) | **GET** /group/client-sales-representative | Get Client Sales Representative
[**get_custom_fields**](NotesConfigurationApi.md#get_custom_fields) | **GET** /custom-fields | Get all Custom Fields
[**get_group**](NotesConfigurationApi.md#get_group) | **GET** /group | Get Group details
[**get_recommendations**](NotesConfigurationApi.md#get_recommendations) | **GET** /recommendations | Get all Recommendations
[**get_sentiments**](NotesConfigurationApi.md#get_sentiments) | **GET** /sentiments | Get all Sentiments
[**get_subject**](NotesConfigurationApi.md#get_subject) | **GET** /subjects/{subjectId} | Get Subject details for the given Id provided
[**get_subjects**](NotesConfigurationApi.md#get_subjects) | **GET** /subjects | Get all Subjects
[**get_team**](NotesConfigurationApi.md#get_team) | **GET** /teams/{teamId} | Get Team details for the given Id provided
[**get_teams**](NotesConfigurationApi.md#get_teams) | **GET** /teams | Get all Teams



# **get_assigned_fact_set_users**
> [UserConfigDto] get_assigned_fact_set_users()

Get all assigned FactSet users

Get all assigned FactSet users in your group

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import notes___configuration_api
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
    api_instance = notes___configuration_api.NotesConfigurationApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Get all assigned FactSet users
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_assigned_fact_set_users()

        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling NotesConfigurationApi->get_assigned_fact_set_users: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**[UserConfigDto]**](UserConfigDto.md)

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

# **get_authors**
> [AuthorConfigDto] get_authors()

Get all Authors

Get all Authors

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import notes___configuration_api
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
    api_instance = notes___configuration_api.NotesConfigurationApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    x_irn_ignore_permissions = False # bool | If set to true, permissions will be ignored. Default is false. (optional) if omitted the server will use the default value of False

    try:
        # Get all Authors
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_authors(x_irn_ignore_permissions=x_irn_ignore_permissions)

        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling NotesConfigurationApi->get_authors: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_irn_ignore_permissions** | **bool**| If set to true, permissions will be ignored. Default is false. | [optional] if omitted the server will use the default value of False

### Return type

[**[AuthorConfigDto]**](AuthorConfigDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**403** | Forbidden |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_clients_sales_representative**
> ClientSalesRepresentativeDto get_clients_sales_representative()

Get Client Sales Representative

Get the client sales representative for the group

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import notes___configuration_api
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
    api_instance = notes___configuration_api.NotesConfigurationApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Get Client Sales Representative
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_clients_sales_representative()

        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling NotesConfigurationApi->get_clients_sales_representative: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ClientSalesRepresentativeDto**](ClientSalesRepresentativeDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_custom_fields**
> [CustomFieldConfigDto] get_custom_fields()

Get all Custom Fields

Get all customfields configured in your group

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import notes___configuration_api
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
    api_instance = notes___configuration_api.NotesConfigurationApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    x_irn_ignore_permissions = False # bool |  (optional) if omitted the server will use the default value of False

    try:
        # Get all Custom Fields
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_custom_fields(x_irn_ignore_permissions=x_irn_ignore_permissions)

        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling NotesConfigurationApi->get_custom_fields: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_irn_ignore_permissions** | **bool**|  | [optional] if omitted the server will use the default value of False

### Return type

[**[CustomFieldConfigDto]**](CustomFieldConfigDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**403** | Forbidden |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_group**
> GroupConfigDto get_group()

Get Group details

Get all the group details

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import notes___configuration_api
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
    api_instance = notes___configuration_api.NotesConfigurationApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Get Group details
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_group()

        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling NotesConfigurationApi->get_group: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**GroupConfigDto**](GroupConfigDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_recommendations**
> [RecommendationConfigDto] get_recommendations()

Get all Recommendations

Get all recommendations configured in your group

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import notes___configuration_api
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
    api_instance = notes___configuration_api.NotesConfigurationApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Get all Recommendations
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_recommendations()

        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling NotesConfigurationApi->get_recommendations: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**[RecommendationConfigDto]**](RecommendationConfigDto.md)

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

# **get_sentiments**
> [SentimentConfigDto] get_sentiments()

Get all Sentiments

Get all sentiments configured in your group

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import notes___configuration_api
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
    api_instance = notes___configuration_api.NotesConfigurationApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Get all Sentiments
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_sentiments()

        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling NotesConfigurationApi->get_sentiments: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**[SentimentConfigDto]**](SentimentConfigDto.md)

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

# **get_subject**
> SubjectConfigDto get_subject(subject_id)

Get Subject details for the given Id provided

Get all details of a given subject

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import notes___configuration_api
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
    api_instance = notes___configuration_api.NotesConfigurationApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    subject_id = "subjectId_example" # str | Id
    x_irn_ignore_permissions = False # bool |  (optional) if omitted the server will use the default value of False

    try:
        # Get Subject details for the given Id provided
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_subject(subject_id, x_irn_ignore_permissions=x_irn_ignore_permissions)

        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling NotesConfigurationApi->get_subject: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subject_id** | **str**| Id |
 **x_irn_ignore_permissions** | **bool**|  | [optional] if omitted the server will use the default value of False

### Return type

[**SubjectConfigDto**](SubjectConfigDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_subjects**
> [SubjectSummaryDto] get_subjects()

Get all Subjects

Get all subjects configured in your group

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import notes___configuration_api
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
    api_instance = notes___configuration_api.NotesConfigurationApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    x_irn_ignore_permissions = False # bool |  (optional) if omitted the server will use the default value of False

    try:
        # Get all Subjects
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_subjects(x_irn_ignore_permissions=x_irn_ignore_permissions)

        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling NotesConfigurationApi->get_subjects: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_irn_ignore_permissions** | **bool**|  | [optional] if omitted the server will use the default value of False

### Return type

[**[SubjectSummaryDto]**](SubjectSummaryDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**403** | Forbidden |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_team**
> TeamConfigDto get_team(team_id)

Get Team details for the given Id provided

Get all details of a given team

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import notes___configuration_api
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
    api_instance = notes___configuration_api.NotesConfigurationApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    team_id = "teamId_example" # str | Id
    x_irn_ignore_permissions = False # bool | If set to true, permissions will be ignored. Default is false. (optional) if omitted the server will use the default value of False

    try:
        # Get Team details for the given Id provided
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_team(team_id, x_irn_ignore_permissions=x_irn_ignore_permissions)

        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling NotesConfigurationApi->get_team: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **team_id** | **str**| Id |
 **x_irn_ignore_permissions** | **bool**| If set to true, permissions will be ignored. Default is false. | [optional] if omitted the server will use the default value of False

### Return type

[**TeamConfigDto**](TeamConfigDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_teams**
> [TeamSummaryDto] get_teams()

Get all Teams

Get all teams configured in your group

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import notes___configuration_api
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
    api_instance = notes___configuration_api.NotesConfigurationApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    x_irn_ignore_permissions = False # bool | If set to true, permissions will be ignored. Default is false. (optional) if omitted the server will use the default value of False

    try:
        # Get all Teams
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_teams(x_irn_ignore_permissions=x_irn_ignore_permissions)

        pprint(api_response)

    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling NotesConfigurationApi->get_teams: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_irn_ignore_permissions** | **bool**| If set to true, permissions will be ignored. Default is false. | [optional] if omitted the server will use the default value of False

### Return type

[**[TeamSummaryDto]**](TeamSummaryDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**403** | Forbidden |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

