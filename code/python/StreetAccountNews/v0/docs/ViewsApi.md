# fds.sdk.StreetAccountNews.ViewsApi

All URIs are relative to *https://api.factset.com/research/news/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_street_account_view**](ViewsApi.md#create_street_account_view) | **POST** /streetaccount/views/{id} | Creates and saves a StreetAccount view
[**delete_street_account_view**](ViewsApi.md#delete_street_account_view) | **DELETE** /streetaccount/views/{id} | Deletes an existing StreetAccount view
[**edit_street_account_view**](ViewsApi.md#edit_street_account_view) | **PUT** /streetaccount/views/{id} | Edits and saves an existing StreetAccount view
[**get_street_account_views**](ViewsApi.md#get_street_account_views) | **GET** /streetaccount/views | Retrieves StreetAccount search views



# **create_street_account_view**
> CreateEditDeleteViewResponse create_street_account_view(id)

Creates and saves a StreetAccount view

This endpoint allows you to create a new StreetAccount view. Select watchlists/tickers and filters of your choice to create and save a view.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StreetAccountNews
from fds.sdk.StreetAccountNews.api import views_api
from fds.sdk.StreetAccountNews.models import *
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
configuration = fds.sdk.StreetAccountNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StreetAccountNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StreetAccountNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = views_api.ViewsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "SA News View" # str | view id of the view which is the be created
    create_or_edit_view_body = CreateOrEditViewBody(
        data=CreateOrEditViewBodyData(
            tickers=[
                CreateOrEditViewTickers(
                    name="Russell 1000",
                    value="R.1000",
                    type="Index",
                ),
            ],
            categories=[
                "Earnings",
            ],
            regions=[
                "North America",
            ],
            topics=[
                "Market Summaries",
            ],
            sectors=[
                "Gold & Silver",
            ],
            is_primary=True,
            quick_alert=False,
        ),
    ) # CreateOrEditViewBody | Create or Edit View Body which needs to be sent with request (optional)

    try:
        # Creates and saves a StreetAccount view
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.create_street_account_view(id, create_or_edit_view_body=create_or_edit_view_body)

        pprint(api_response)

    except fds.sdk.StreetAccountNews.ApiException as e:
        print("Exception when calling ViewsApi->create_street_account_view: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| view id of the view which is the be created |
 **create_or_edit_view_body** | [**CreateOrEditViewBody**](CreateOrEditViewBody.md)| Create or Edit View Body which needs to be sent with request | [optional]

### Return type

[**CreateEditDeleteViewResponse**](CreateEditDeleteViewResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_street_account_view**
> CreateEditDeleteViewResponse delete_street_account_view(id)

Deletes an existing StreetAccount view

This endpoint allows you to delete a previously saved StreetAccount view.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StreetAccountNews
from fds.sdk.StreetAccountNews.api import views_api
from fds.sdk.StreetAccountNews.models import *
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
configuration = fds.sdk.StreetAccountNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StreetAccountNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StreetAccountNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = views_api.ViewsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "SA News View" # str | view id of the view to be deleted

    try:
        # Deletes an existing StreetAccount view
        # example passing only required values which don't have defaults set
        api_response = api_instance.delete_street_account_view(id)

        pprint(api_response)

    except fds.sdk.StreetAccountNews.ApiException as e:
        print("Exception when calling ViewsApi->delete_street_account_view: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| view id of the view to be deleted |

### Return type

[**CreateEditDeleteViewResponse**](CreateEditDeleteViewResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**204** | No Content |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **edit_street_account_view**
> CreateEditDeleteViewResponse edit_street_account_view(id)

Edits and saves an existing StreetAccount view

This endpoint allows you to edit the criteria used for a previously saved StreetAccount view.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StreetAccountNews
from fds.sdk.StreetAccountNews.api import views_api
from fds.sdk.StreetAccountNews.models import *
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
configuration = fds.sdk.StreetAccountNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StreetAccountNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StreetAccountNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = views_api.ViewsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "SA News View" # str | view id of the view to be edited
    create_or_edit_view_body = CreateOrEditViewBody(
        data=CreateOrEditViewBodyData(
            tickers=[
                CreateOrEditViewTickers(
                    name="Russell 1000",
                    value="R.1000",
                    type="Index",
                ),
            ],
            categories=[
                "Earnings",
            ],
            regions=[
                "North America",
            ],
            topics=[
                "Market Summaries",
            ],
            sectors=[
                "Gold & Silver",
            ],
            is_primary=True,
            quick_alert=False,
        ),
    ) # CreateOrEditViewBody | Create or Edit View Body which needs to be sent with request (optional)

    try:
        # Edits and saves an existing StreetAccount view
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.edit_street_account_view(id, create_or_edit_view_body=create_or_edit_view_body)

        pprint(api_response)

    except fds.sdk.StreetAccountNews.ApiException as e:
        print("Exception when calling ViewsApi->edit_street_account_view: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| view id of the view to be edited |
 **create_or_edit_view_body** | [**CreateOrEditViewBody**](CreateOrEditViewBody.md)| Create or Edit View Body which needs to be sent with request | [optional]

### Return type

[**CreateEditDeleteViewResponse**](CreateEditDeleteViewResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_street_account_views**
> Views get_street_account_views()

Retrieves StreetAccount search views

This endpoint allows you to pull the full list of StreetAccount views that have been previously saved.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StreetAccountNews
from fds.sdk.StreetAccountNews.api import views_api
from fds.sdk.StreetAccountNews.models import *
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
configuration = fds.sdk.StreetAccountNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StreetAccountNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StreetAccountNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = views_api.ViewsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Retrieves StreetAccount search views
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_street_account_views()

        pprint(api_response)

    except fds.sdk.StreetAccountNews.ApiException as e:
        print("Exception when calling ViewsApi->get_street_account_views: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**Views**](Views.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

