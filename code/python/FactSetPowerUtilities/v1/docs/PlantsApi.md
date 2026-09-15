# fds.sdk.FactSetPowerUtilities.PlantsApi

All URIs are relative to *https://api.factset.com/content/factset-power-utilities/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list_plant_ids**](PlantsApi.md#list_plant_ids) | **GET** /plants/ids | Returns discoverable power plant IDs



# **list_plant_ids**
> PlantIdsResponse list_plant_ids()

Returns discoverable power plant IDs

Returns a paginated list of FactSet power plant asset identifiers matching the specified filter criteria, along with plant name, status, fuel type, and geographic location (nearest city, region, country, continent, and coordinates).  For unit-level metadata and technical details, see `POST /units/details`. You can provide either plant IDs or unit IDs to `/units/details` to retrieve unit-level data with full mapping information (unit names, EIA codes, grades, regions).  Reflects current data only; historical or point-in-time values are not retained. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPowerUtilities
from fds.sdk.FactSetPowerUtilities.api import plants_api
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
    api_instance = plants_api.PlantsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    iso_code = ["ERCOT"] # [str] | Filter plants by ISO/TSO market area code (e.g., `\"ERCOT\"`, `\"PJM\"` for US ISO/RTOs; other codes for non-US TSOs as coverage expands). (optional)
    country = ["United States"] # [str] | Filter plants by country name (e.g., `\"United States\"`, `\"Canada\"`, `\"United Kingdom\"`). (optional)
    region = ["Texas"] # [str] | Filter plants by region (e.g., a US state name such as `\"Texas\"`, `\"Tennessee\"`). (optional)
    plant_status = ["Operational"] # [str] | Filter plants by operational status. (optional)
    plant_ids = ["B00121-M"] # [str] | Filter results to the specified FactSet plant asset identifiers. If omitted, all plants matching other filter criteria are returned. (optional)
    min_capacity_mw = 100 # float | Filter plants by minimum nameplate capacity in megawatts (MW), inclusive. Returns plants with capacity greater than or equal to this value. (optional)
    max_capacity_mw = 5000 # float | Filter plants by maximum nameplate capacity in megawatts (MW), inclusive. Returns plants with capacity less than or equal to this value. (optional)
    pagination_limit = 100 # int | Maximum number of results to return per request. (optional) if omitted the server will use the default value of 100
    pagination_offset = 0 # int | Number of results to skip. Use with `_paginationLimit` for paging through large result sets. (optional) if omitted the server will use the default value of 0

    try:
        # Returns discoverable power plant IDs
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.list_plant_ids(iso_code=iso_code, country=country, region=region, plant_status=plant_status, plant_ids=plant_ids, min_capacity_mw=min_capacity_mw, max_capacity_mw=max_capacity_mw, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetPowerUtilities.ApiException as e:
        print("Exception when calling PlantsApi->list_plant_ids: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iso_code** | **[str]**| Filter plants by ISO/TSO market area code (e.g., &#x60;\&quot;ERCOT\&quot;&#x60;, &#x60;\&quot;PJM\&quot;&#x60; for US ISO/RTOs; other codes for non-US TSOs as coverage expands). | [optional]
 **country** | **[str]**| Filter plants by country name (e.g., &#x60;\&quot;United States\&quot;&#x60;, &#x60;\&quot;Canada\&quot;&#x60;, &#x60;\&quot;United Kingdom\&quot;&#x60;). | [optional]
 **region** | **[str]**| Filter plants by region (e.g., a US state name such as &#x60;\&quot;Texas\&quot;&#x60;, &#x60;\&quot;Tennessee\&quot;&#x60;). | [optional]
 **plant_status** | **[str]**| Filter plants by operational status. | [optional]
 **plant_ids** | **[str]**| Filter results to the specified FactSet plant asset identifiers. If omitted, all plants matching other filter criteria are returned. | [optional]
 **min_capacity_mw** | **float**| Filter plants by minimum nameplate capacity in megawatts (MW), inclusive. Returns plants with capacity greater than or equal to this value. | [optional]
 **max_capacity_mw** | **float**| Filter plants by maximum nameplate capacity in megawatts (MW), inclusive. Returns plants with capacity less than or equal to this value. | [optional]
 **pagination_limit** | **int**| Maximum number of results to return per request. | [optional] if omitted the server will use the default value of 100
 **pagination_offset** | **int**| Number of results to skip. Use with &#x60;_paginationLimit&#x60; for paging through large result sets. | [optional] if omitted the server will use the default value of 0

### Return type

[**PlantIdsResponse**](PlantIdsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with a list of plant identifiers |  -  |
**400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
**401** | Unauthenticated — no valid credentials were provided. |  -  |
**403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
**404** | Not Found — the requested resource was not found. |  -  |
**429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
**500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
**503** | Service Unavailable — the service is temporarily unavailable. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

