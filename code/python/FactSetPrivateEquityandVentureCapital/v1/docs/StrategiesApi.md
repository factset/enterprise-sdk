# fds.sdk.FactSetPrivateEquityandVentureCapital.StrategiesApi

All URIs are relative to *https://api.factset.com/content/factset-pevc/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_entity_strategies**](StrategiesApi.md#get_entity_strategies) | **GET** /entities/strategies | Retrieve detailed investment strategy mandates for a specified fund or General Partner.



# **get_entity_strategies**
> EntityStrategiesResponse get_entity_strategies(ids)

Retrieve detailed investment strategy mandates for a specified fund or General Partner.

Provides a granular breakdown of the defined investment mandate for a fund or General Partner (GP). The strategy is multi-faceted, covering areas such as target **geographic exposure** (region, country, state), preferred **industry/sector** focus, targeted **investment instruments** (e.g., debt, equity, convertible notes), and **control criteria**.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPrivateEquityandVentureCapital
from fds.sdk.FactSetPrivateEquityandVentureCapital.api import strategies_api
from fds.sdk.FactSetPrivateEquityandVentureCapital.models import *
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
configuration = fds.sdk.FactSetPrivateEquityandVentureCapital.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPrivateEquityandVentureCapital.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPrivateEquityandVentureCapital.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = strategies_api.StrategiesApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["001JYM-E","005GEM-E"] # [str] | A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format 'XXXXXX-E' and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint

    try:
        # Retrieve detailed investment strategy mandates for a specified fund or General Partner.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_entity_strategies(ids)

        pprint(api_response)

    except fds.sdk.FactSetPrivateEquityandVentureCapital.ApiException as e:
        print("Exception when calling StrategiesApi->get_entity_strategies: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint |

### Return type

[**EntityStrategiesResponse**](EntityStrategiesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

