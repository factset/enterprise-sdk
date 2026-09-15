# fds.sdk.FactSetPowerUtilities.ReferenceApi

All URIs are relative to *https://api.factset.com/content/factset-power-utilities/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list_entity_history**](ReferenceApi.md#list_entity_history) | **GET** /reference/entity-history | Returns entity and security history records
[**list_iso_mapping**](ReferenceApi.md#list_iso_mapping) | **GET** /reference/iso-mapping | Returns ISO/TSO mapping data
[**list_location_mapping**](ReferenceApi.md#list_location_mapping) | **GET** /reference/location-mapping | Returns power price location mapping data
[**list_zone_mapping**](ReferenceApi.md#list_zone_mapping) | **GET** /reference/zone-mapping | Returns price zone and hub mapping data



# **list_entity_history**
> EntityHistoryResponse list_entity_history()

Returns entity and security history records

Returns entity and security history records combining security-to-entity identifier mappings and entity ownership structure history, including immediate and ultimate parent entities.  **Helpful for:** Understanding entity relationships and parent-subsidiary structures related to plant ownership data returned by `POST /units/ownership`. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPowerUtilities
from fds.sdk.FactSetPowerUtilities.api import reference_api
from fds.sdk.FactSetPowerUtilities.models import *
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
configuration = fds.sdk.FactSetPowerUtilities.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPowerUtilities.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPowerUtilities.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = reference_api.ReferenceApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    factset_entity_id = "0GSF7D-E" # str | Filter records by a specific FactSet entity identifier (e.g., `\"0GSF7D-E\"`). (optional)
    pagination_limit = 100 # int | Maximum number of results to return per request. (optional) if omitted the server will use the default value of 100
    pagination_offset = 0 # int | Number of results to skip. (optional) if omitted the server will use the default value of 0

    try:
        # Returns entity and security history records
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.list_entity_history(factset_entity_id=factset_entity_id, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetPowerUtilities.ApiException as e:
        print("Exception when calling ReferenceApi->list_entity_history: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **factset_entity_id** | **str**| Filter records by a specific FactSet entity identifier (e.g., &#x60;\&quot;0GSF7D-E\&quot;&#x60;). | [optional]
 **pagination_limit** | **int**| Maximum number of results to return per request. | [optional] if omitted the server will use the default value of 100
 **pagination_offset** | **int**| Number of results to skip. | [optional] if omitted the server will use the default value of 0

### Return type

[**EntityHistoryResponse**](EntityHistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with entity history records |  -  |
**400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
**401** | Unauthenticated — no valid credentials were provided. |  -  |
**403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
**404** | Not Found — the requested resource was not found. |  -  |
**429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
**500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
**503** | Service Unavailable — the service is temporarily unavailable. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_iso_mapping**
> IsoMappingResponse list_iso_mapping()

Returns ISO/TSO mapping data

Returns the complete list of ISO/TSO codes and their corresponding names.  **Helpful for:** Use this endpoint to understand available ISO/TSO codes for filtering in `GET /plants/ids` (via the `isoCode` parameter) and `GET /market-data/coverage`.  Reflects current data only; historical or point-in-time values are not retained. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPowerUtilities
from fds.sdk.FactSetPowerUtilities.api import reference_api
from fds.sdk.FactSetPowerUtilities.models import *
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
configuration = fds.sdk.FactSetPowerUtilities.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPowerUtilities.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPowerUtilities.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = reference_api.ReferenceApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    pagination_limit = 100 # int | Maximum number of results to return per request. (optional) if omitted the server will use the default value of 100
    pagination_offset = 0 # int | Number of results to skip. (optional) if omitted the server will use the default value of 0

    try:
        # Returns ISO/TSO mapping data
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.list_iso_mapping(pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetPowerUtilities.ApiException as e:
        print("Exception when calling ReferenceApi->list_iso_mapping: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagination_limit** | **int**| Maximum number of results to return per request. | [optional] if omitted the server will use the default value of 100
 **pagination_offset** | **int**| Number of results to skip. | [optional] if omitted the server will use the default value of 0

### Return type

[**IsoMappingResponse**](IsoMappingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with ISO/TSO mapping records |  -  |
**400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
**401** | Unauthenticated — no valid credentials were provided. |  -  |
**403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
**404** | Not Found — the requested resource was not found. |  -  |
**429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
**500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
**503** | Service Unavailable — the service is temporarily unavailable. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_location_mapping**
> LocationMappingResponse list_location_mapping()

Returns power price location mapping data

Returns the list of ISO/TSO power price location codes (hub codes) used by `POST /prices` for the `Power`, `SparkSpread`, and `Forward` categories, with their names. Use the returned `locationId` values as input to those endpoints.  Note: these `iso_loc_code` identifiers are a distinct code space from the `iso_zone_code` identifiers used by `POST /prices?category=Capacity` — see `GET /reference/zone-mapping` for those.  Reflects current data only; historical or point-in-time values are not retained. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPowerUtilities
from fds.sdk.FactSetPowerUtilities.api import reference_api
from fds.sdk.FactSetPowerUtilities.models import *
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
configuration = fds.sdk.FactSetPowerUtilities.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPowerUtilities.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPowerUtilities.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = reference_api.ReferenceApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    iso_code = "ERCOT" # str | Filter locations by ISO/TSO market. (optional)
    pagination_limit = 100 # int | Maximum number of results to return per request. (optional) if omitted the server will use the default value of 100
    pagination_offset = 0 # int | Number of results to skip. (optional) if omitted the server will use the default value of 0

    try:
        # Returns power price location mapping data
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.list_location_mapping(iso_code=iso_code, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetPowerUtilities.ApiException as e:
        print("Exception when calling ReferenceApi->list_location_mapping: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iso_code** | **str**| Filter locations by ISO/TSO market. | [optional]
 **pagination_limit** | **int**| Maximum number of results to return per request. | [optional] if omitted the server will use the default value of 100
 **pagination_offset** | **int**| Number of results to skip. | [optional] if omitted the server will use the default value of 0

### Return type

[**LocationMappingResponse**](LocationMappingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with power price location mapping records |  -  |
**400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
**401** | Unauthenticated — no valid credentials were provided. |  -  |
**403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
**404** | Not Found — the requested resource was not found. |  -  |
**429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
**500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
**503** | Service Unavailable — the service is temporarily unavailable. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_zone_mapping**
> ZoneMappingResponse list_zone_mapping()

Returns price zone and hub mapping data

Returns the list of ISO/TSO load distribution area and zone codes used by `POST /prices?category=Capacity`, with their names, price units, and auction frequency. Use the returned `locationId` values as input to that endpoint.  Note: these `iso_zone_code` identifiers are a distinct code space from the `iso_loc_code` identifiers used by `POST /prices` for the `Power`, `SparkSpread`, and `Forward` categories.  Reflects current data only; historical or point-in-time values are not retained. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPowerUtilities
from fds.sdk.FactSetPowerUtilities.api import reference_api
from fds.sdk.FactSetPowerUtilities.models import *
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
configuration = fds.sdk.FactSetPowerUtilities.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPowerUtilities.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPowerUtilities.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = reference_api.ReferenceApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    iso_code = "PJM" # str | Filter locations by ISO/TSO market. (optional)
    pagination_limit = 100 # int | Maximum number of results to return per request. (optional) if omitted the server will use the default value of 100
    pagination_offset = 0 # int | Number of results to skip. (optional) if omitted the server will use the default value of 0

    try:
        # Returns price zone and hub mapping data
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.list_zone_mapping(iso_code=iso_code, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetPowerUtilities.ApiException as e:
        print("Exception when calling ReferenceApi->list_zone_mapping: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iso_code** | **str**| Filter locations by ISO/TSO market. | [optional]
 **pagination_limit** | **int**| Maximum number of results to return per request. | [optional] if omitted the server will use the default value of 100
 **pagination_offset** | **int**| Number of results to skip. | [optional] if omitted the server will use the default value of 0

### Return type

[**ZoneMappingResponse**](ZoneMappingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with zone and hub mapping records |  -  |
**400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
**401** | Unauthenticated — no valid credentials were provided. |  -  |
**403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
**404** | Not Found — the requested resource was not found. |  -  |
**429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
**500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
**503** | Service Unavailable — the service is temporarily unavailable. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

