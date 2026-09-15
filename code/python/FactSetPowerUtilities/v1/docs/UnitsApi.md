# fds.sdk.FactSetPowerUtilities.UnitsApi

All URIs are relative to *https://api.factset.com/content/factset-power-utilities/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list_plant_units**](UnitsApi.md#list_plant_units) | **POST** /units/details | Returns power plant unit metadata and technical details
[**list_units_ownership**](UnitsApi.md#list_units_ownership) | **POST** /units/ownership | Returns power plant unit ownership details



# **list_plant_units**
> PlantUnitsResponse list_plant_units(plant_units_request)

Returns power plant unit metadata and technical details

Returns metadata and technical detail data for one of five categories, selected via the `category` discriminator in the request body:  * **`Metadata`** — General plant metadata: plant name, ISO/TSO assignment, primary fuel type, nameplate capacity, operational status, owner details, and key lifecycle dates. * **`Pipeline`** — Gas pipeline connections: pipeline name and pipeline sequence (for units supplied by more than one pipeline). * **`Solar`** — Solar-specific technical specifications: installed capacity (DC), array/tracking type, tilt and azimuth angle, thin-film flag, and land area. * **`Wind`** — Wind turbine technical specifications: turbine count, model, manufacturer, hub height, and rotor swept area. * **`Thermal`** — Thermal/fossil technical specifications: design heat rate.  For unit ownership details, use `POST /units/ownership`.  This endpoint operates at the unit level, matching the underlying source data.  Reflects current data only; historical or point-in-time values are not retained.  **Input flexibility:** You can provide either plant IDs or unit IDs. When you provide a plant ID, all units within that plant are returned. Unit names, parent plant IDs, EIA codes, project grades, and regional mappings are included in the metadata response. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPowerUtilities
from fds.sdk.FactSetPowerUtilities.api import units_api
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
    api_instance = units_api.UnitsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    plant_units_request = PlantUnitsRequest(
        data=PlantUnitsRequestData(),
        meta=RequestMeta(
            pagination=RequestPagination(
                limit=100,
                offset=0,
            ),
        ),
    ) # PlantUnitsRequest | 

    try:
        # Returns power plant unit metadata and technical details
        # example passing only required values which don't have defaults set
        api_response = api_instance.list_plant_units(plant_units_request)

        pprint(api_response)

    except fds.sdk.FactSetPowerUtilities.ApiException as e:
        print("Exception when calling UnitsApi->list_plant_units: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **plant_units_request** | [**PlantUnitsRequest**](PlantUnitsRequest.md)|  |

### Return type

[**PlantUnitsResponse**](PlantUnitsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. Record shape matches the requested &#x60;category&#x60;. |  -  |
**400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
**401** | Unauthenticated — no valid credentials were provided. |  -  |
**403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
**404** | Not Found — the requested resource was not found. |  -  |
**415** | Unsupported Media Type — the request body was not JSON or the Content-Type header was missing. |  -  |
**422** | Unprocessable Entity — the request was syntactically valid but semantically incorrect (e.g., invalid date range). |  -  |
**429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
**500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
**503** | Service Unavailable — the service is temporarily unavailable. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_units_ownership**
> UnitsOwnershipResponse list_units_ownership(units_ownership_request)

Returns power plant unit ownership details

Returns ownership records for the specified unit IDs, including owner name, FactSet entity ID, ownership percentage, ultimate parent entity, and the plant ID for each unit.  This endpoint is a convenience endpoint that returns ownership data with the plant ID included. For other unit detail categories (metadata, pipeline, solar, wind, thermal), use `POST /units/details`.  Reflects current data only; historical or point-in-time values are not retained. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPowerUtilities
from fds.sdk.FactSetPowerUtilities.api import units_api
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
    api_instance = units_api.UnitsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    units_ownership_request = UnitsOwnershipRequest(
        data=UnitsOwnershipRequestData(
            ids=PlantUnitIds(["B00121-M","05RLSM-M"]),
        ),
        meta=RequestMeta(
            pagination=RequestPagination(
                limit=100,
                offset=0,
            ),
        ),
    ) # UnitsOwnershipRequest | 

    try:
        # Returns power plant unit ownership details
        # example passing only required values which don't have defaults set
        api_response = api_instance.list_units_ownership(units_ownership_request)

        pprint(api_response)

    except fds.sdk.FactSetPowerUtilities.ApiException as e:
        print("Exception when calling UnitsApi->list_units_ownership: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **units_ownership_request** | [**UnitsOwnershipRequest**](UnitsOwnershipRequest.md)|  |

### Return type

[**UnitsOwnershipResponse**](UnitsOwnershipResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with unit ownership records. |  -  |
**400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
**401** | Unauthenticated — no valid credentials were provided. |  -  |
**403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
**404** | Not Found — the requested resource was not found. |  -  |
**415** | Unsupported Media Type — the request body was not JSON or the Content-Type header was missing. |  -  |
**422** | Unprocessable Entity — the request was syntactically valid but semantically incorrect (e.g., invalid date range). |  -  |
**429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
**500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
**503** | Service Unavailable — the service is temporarily unavailable. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

