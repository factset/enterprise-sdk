# fds.sdk.AnalyticsDatastore.MappingsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_insight_mapping**](MappingsApi.md#get_insight_mapping) | **GET** /analytics/pub-datastore/swivel/v1/{document}/{assetName}/{reportId}/{tileId}/{accountId}/{configId}/{date} | Redirects to the underlying Insight/Vault data in a Stach format.
[**get_pdf_ppt_mapping**](MappingsApi.md#get_pdf_ppt_mapping) | **GET** /analytics/pub-datastore/swivel/v1/{document}/{accountId}/{date} | Redirects to the raw PPT/PDF output created by the Publisher service.
[**get_stach_mapping**](MappingsApi.md#get_stach_mapping) | **GET** /analytics/pub-datastore/swivel/v1/{document}/{assetName}/{reportId}/{tileId}/{accountId}/{date} | Redirects to the underlying PA/SPAR data represented in a Stach format.
[**get_stach_mapping_no_date**](MappingsApi.md#get_stach_mapping_no_date) | **GET** /analytics/pub-datastore/swivel/v1/{document}/{assetName}/{reportId}/{tileId}/{accountId} | Redirects to the underlying PA/SPAR data represented in a Stach format, with no as of date specified.



# **get_insight_mapping**
> get_insight_mapping(document, asset_name, report_id, tile_id, account_id, config_id, date)

Redirects to the underlying Insight/Vault data in a Stach format.

The inclusion of a configId in the path indicates this is for Insight/Vault mappings only, as PA/SPAR mappings do not support the concept of configuration id.    Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.    Note: Due to Swagger UI functionality, the redirect is automatically followed when using 'Try it out', so instead of the 302 Header response, a 200 is returned with the Cargo response Body.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.AnalyticsDatastore
from fds.sdk.AnalyticsDatastore.api import mappings_api
from fds.sdk.AnalyticsDatastore.models import *
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
configuration = fds.sdk.AnalyticsDatastore.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.AnalyticsDatastore.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.AnalyticsDatastore.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = mappings_api.MappingsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    document = "Analytics_Datastore" # str | The Analytics Datafeed document containing the report
    asset_name = "ADS_Demo.PA3" # str | The PA/SPAR asset name and extension
    report_id = "report7" # str | The PA/SPAR report ID
    tile_id = "tile0" # str | The PA/SPAR tile ID
    account_id = "LARGE_CORE" # str | The account ID
    config_id = "acb5150d-4333-49e7-8e33-4f7fa749691e" # str | The Vault configuration ID
    date = dateutil_parser('2023-01-01').date() # date | The as of date for the report

    try:
        # Redirects to the underlying Insight/Vault data in a Stach format.
        # example passing only required values which don't have defaults set
        api_instance.get_insight_mapping(document, asset_name, report_id, tile_id, account_id, config_id, date)


    except fds.sdk.AnalyticsDatastore.ApiException as e:
        print("Exception when calling MappingsApi->get_insight_mapping: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document** | **str**| The Analytics Datafeed document containing the report |
 **asset_name** | **str**| The PA/SPAR asset name and extension |
 **report_id** | **str**| The PA/SPAR report ID |
 **tile_id** | **str**| The PA/SPAR tile ID |
 **account_id** | **str**| The account ID |
 **config_id** | **str**| The Vault configuration ID |
 **date** | **date**| The as of date for the report |

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**302** | Expected response, contains the Cargo URL in the Location header. |  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_pdf_ppt_mapping**
> get_pdf_ppt_mapping(document, account_id, date)

Redirects to the raw PPT/PDF output created by the Publisher service.

Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.    Note: Due to Swagger UI functionality, the redirect is automatically followed when using 'Try it out', so instead of the 302 Header response, a 200 is returned with the Cargo response Body.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.AnalyticsDatastore
from fds.sdk.AnalyticsDatastore.api import mappings_api
from fds.sdk.AnalyticsDatastore.models import *
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
configuration = fds.sdk.AnalyticsDatastore.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.AnalyticsDatastore.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.AnalyticsDatastore.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = mappings_api.MappingsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    document = "Analytics_Datastore" # str | The Publisher document containing the report
    account_id = "LARGE_CORE" # str | The account ID
    date = dateutil_parser('2023-01-01').date() # date | The as of date for the report

    try:
        # Redirects to the raw PPT/PDF output created by the Publisher service.
        # example passing only required values which don't have defaults set
        api_instance.get_pdf_ppt_mapping(document, account_id, date)


    except fds.sdk.AnalyticsDatastore.ApiException as e:
        print("Exception when calling MappingsApi->get_pdf_ppt_mapping: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document** | **str**| The Publisher document containing the report |
 **account_id** | **str**| The account ID |
 **date** | **date**| The as of date for the report |

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**302** | Expected response, contains the Cargo URL in the Location header. |  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_stach_mapping**
> get_stach_mapping(document, asset_name, report_id, tile_id, account_id, date)

Redirects to the underlying PA/SPAR data represented in a Stach format.

Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.    Note: Due to Swagger UI functionality, the redirect is automatically followed when using 'Try it out', so instead of the 302 Header response, a 200 is returned with the Cargo response Body.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.AnalyticsDatastore
from fds.sdk.AnalyticsDatastore.api import mappings_api
from fds.sdk.AnalyticsDatastore.models import *
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
configuration = fds.sdk.AnalyticsDatastore.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.AnalyticsDatastore.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.AnalyticsDatastore.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = mappings_api.MappingsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    document = "Analytics_Datastore" # str | The Publisher or Analytics Datafeed document containing the report
    asset_name = "ADS_Demo.PA3" # str | The PA/SPAR asset name and extension
    report_id = "report7" # str | The PA/SPAR report ID
    tile_id = "tile0" # str | The PA/SPAR tile ID
    account_id = "LARGE_CORE" # str | The account ID
    date = dateutil_parser('2023-01-01').date() # date | The as of date for the report

    try:
        # Redirects to the underlying PA/SPAR data represented in a Stach format.
        # example passing only required values which don't have defaults set
        api_instance.get_stach_mapping(document, asset_name, report_id, tile_id, account_id, date)


    except fds.sdk.AnalyticsDatastore.ApiException as e:
        print("Exception when calling MappingsApi->get_stach_mapping: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document** | **str**| The Publisher or Analytics Datafeed document containing the report |
 **asset_name** | **str**| The PA/SPAR asset name and extension |
 **report_id** | **str**| The PA/SPAR report ID |
 **tile_id** | **str**| The PA/SPAR tile ID |
 **account_id** | **str**| The account ID |
 **date** | **date**| The as of date for the report |

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**302** | Expected response, contains the Cargo URL in the Location header. |  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_stach_mapping_no_date**
> get_stach_mapping_no_date(document, asset_name, report_id, tile_id, account_id)

Redirects to the underlying PA/SPAR data represented in a Stach format, with no as of date specified.

Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.    Note: Due to Swagger UI functionality, the redirect is automatically followed when using 'Try it out', so instead of the 302 Header response, a 200 is returned with the Cargo response Body.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.AnalyticsDatastore
from fds.sdk.AnalyticsDatastore.api import mappings_api
from fds.sdk.AnalyticsDatastore.models import *
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
configuration = fds.sdk.AnalyticsDatastore.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.AnalyticsDatastore.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.AnalyticsDatastore.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = mappings_api.MappingsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    document = "Analytics_Datastore" # str | The Publisher or Analytics Datafeed document containing the report
    asset_name = "ADS_Demo.PA3" # str | The PA/SPAR asset name and extension
    report_id = "report7" # str | The PA/SPAR report ID
    tile_id = "tile0" # str | The PA/SPAR tile ID
    account_id = "LARGE_CORE" # str | The account ID

    try:
        # Redirects to the underlying PA/SPAR data represented in a Stach format, with no as of date specified.
        # example passing only required values which don't have defaults set
        api_instance.get_stach_mapping_no_date(document, asset_name, report_id, tile_id, account_id)


    except fds.sdk.AnalyticsDatastore.ApiException as e:
        print("Exception when calling MappingsApi->get_stach_mapping_no_date: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document** | **str**| The Publisher or Analytics Datafeed document containing the report |
 **asset_name** | **str**| The PA/SPAR asset name and extension |
 **report_id** | **str**| The PA/SPAR report ID |
 **tile_id** | **str**| The PA/SPAR tile ID |
 **account_id** | **str**| The account ID |

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**302** | Expected response, contains the Cargo URL in the Location header. |  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

