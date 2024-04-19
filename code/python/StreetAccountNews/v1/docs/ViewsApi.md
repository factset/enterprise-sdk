# fds.sdk.StreetAccountNews.ViewsApi

All URIs are relative to *https://api.factset.com/streetaccount/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_quick_alert_for_view**](ViewsApi.md#create_quick_alert_for_view) | **POST** /quick-alert/create | Creates a quick-alert for given saved view
[**create_street_account_view**](ViewsApi.md#create_street_account_view) | **POST** /views/create | Creates and saves a StreetAccount view
[**delete_quickalert_view**](ViewsApi.md#delete_quickalert_view) | **POST** /quick-alert/delete | Deletes an existing quick alert for a view.
[**delete_street_account_view**](ViewsApi.md#delete_street_account_view) | **POST** /views/delete | Deletes an existing StreetAccount view
[**edit_street_account_view**](ViewsApi.md#edit_street_account_view) | **POST** /views/update | Edits and saves an existing StreetAccount view
[**get_street_account_views**](ViewsApi.md#get_street_account_views) | **GET** /views | Retrieves StreetAccount search views



# **create_quick_alert_for_view**
> QuickAlertsResponse create_quick_alert_for_view()

Creates a quick-alert for given saved view

This endpoint takes in a view name and provides realtime email updates on new stories coming in for the view. Only one quick alert can be enabled for a view at a time.  

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

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    quick_alerts_body = QuickAlertsBody(
        data=QuickAlertsBodyData(
            name="StreetAccount News",
        ),
    ) # QuickAlertsBody | View name to get an alert (optional)

    try:
        # Creates a quick-alert for given saved view
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.create_quick_alert_for_view(quick_alerts_body=quick_alerts_body)

        pprint(api_response)

    except fds.sdk.StreetAccountNews.ApiException as e:
        print("Exception when calling ViewsApi->create_quick_alert_for_view: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quick_alerts_body** | [**QuickAlertsBody**](QuickAlertsBody.md)| View name to get an alert | [optional]

### Return type

[**QuickAlertsResponse**](QuickAlertsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Creates quick-alert for view. |  -  |
**400** | Bad Request. This can occur for invalid parameter. |  -  |
**404** | Not Found |  -  |
**429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**500** | Internal Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_street_account_view**
> CreateViewResponse create_street_account_view()

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

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    create_or_edit_view_body = CreateOrEditViewBody(
        data=CreateOrEditViewBodyData(
            name="SA News View",
            tickers=[
                CreateOrEditViewTickers(
                    name="Russell 1000",
                    value="R.1000",
                    type="Index",
                ),
            ],
            is_primary=True,
            categories=[
                "Earnings",
            ],
            topics=[
                "Market Summaries",
            ],
            regions=[
                "North America",
            ],
            sectors=[
                "Financial",
            ],
            quick_alert=False,
        ),
    ) # CreateOrEditViewBody | Create or Edit View Body which needs to be sent with request (optional)

    try:
        # Creates and saves a StreetAccount view
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.create_street_account_view(create_or_edit_view_body=create_or_edit_view_body)

        pprint(api_response)

    except fds.sdk.StreetAccountNews.ApiException as e:
        print("Exception when calling ViewsApi->create_street_account_view: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_or_edit_view_body** | [**CreateOrEditViewBody**](CreateOrEditViewBody.md)| Create or Edit View Body which needs to be sent with request | [optional]

### Return type

[**CreateViewResponse**](CreateViewResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Creates StreetAccount view for the provided filters. |  -  |
**400** | Bad Request. This can occur for invalid parameter. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
**429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_quickalert_view**
> delete_quickalert_view()

Deletes an existing quick alert for a view.

This endpoint allows you to delete a quick alert from a previously saved view.

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

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    quick_alerts_body = QuickAlertsBody(
        data=QuickAlertsBodyData(
            name="StreetAccount News",
        ),
    ) # QuickAlertsBody | View name to get an alert (optional)

    try:
        # Deletes an existing quick alert for a view.
        # example passing only required values which don't have defaults set
        # and optional values
        api_instance.delete_quickalert_view(quick_alerts_body=quick_alerts_body)


    except fds.sdk.StreetAccountNews.ApiException as e:
        print("Exception when calling ViewsApi->delete_quickalert_view: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quick_alerts_body** | [**QuickAlertsBody**](QuickAlertsBody.md)| View name to get an alert | [optional]

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Quick alert deleted. |  -  |
**400** | Bad Request. This can occur for invalid parameter. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
**429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_street_account_view**
> delete_street_account_view()

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

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    delete_view_body = DeleteViewBody(
        data=DeleteViewBodyData(
            name="SA News View",
        ),
    ) # DeleteViewBody | Delete View Body which needs to be sent with request (optional)

    try:
        # Deletes an existing StreetAccount view
        # example passing only required values which don't have defaults set
        # and optional values
        api_instance.delete_street_account_view(delete_view_body=delete_view_body)


    except fds.sdk.StreetAccountNews.ApiException as e:
        print("Exception when calling ViewsApi->delete_street_account_view: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_view_body** | [**DeleteViewBody**](DeleteViewBody.md)| Delete View Body which needs to be sent with request | [optional]

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**400** | Bad Request. This can occur for invalid parameter. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
**429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **edit_street_account_view**
> edit_street_account_view()

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

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    create_or_edit_view_body = CreateOrEditViewBody(
        data=CreateOrEditViewBodyData(
            name="SA News View",
            tickers=[
                CreateOrEditViewTickers(
                    name="Russell 1000",
                    value="R.1000",
                    type="Index",
                ),
            ],
            is_primary=True,
            categories=[
                "Earnings",
            ],
            topics=[
                "Market Summaries",
            ],
            regions=[
                "North America",
            ],
            sectors=[
                "Financial",
            ],
            quick_alert=False,
        ),
    ) # CreateOrEditViewBody | Create or Edit View Body which needs to be sent with request (optional)

    try:
        # Edits and saves an existing StreetAccount view
        # example passing only required values which don't have defaults set
        # and optional values
        api_instance.edit_street_account_view(create_or_edit_view_body=create_or_edit_view_body)


    except fds.sdk.StreetAccountNews.ApiException as e:
        print("Exception when calling ViewsApi->edit_street_account_view: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_or_edit_view_body** | [**CreateOrEditViewBody**](CreateOrEditViewBody.md)| Create or Edit View Body which needs to be sent with request | [optional]

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**400** | Bad Request. This can occur for invalid parameter. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
**429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |
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
**200** | Returns views. |  -  |
**400** | Bad Request. This can occur for invalid parameter. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
**429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

