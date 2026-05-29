# fds.sdk.FactSetPrivateEquityandVentureCapital.UniverseApi

All URIs are relative to *https://api.factset.com/content/factset-pevc/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_universe**](UniverseApi.md#get_universe) | **GET** /universe | Returns Entity Candidates and Matches for a single name and attributes.



# **get_universe**
> EntityMatchesResponse get_universe(name)

Returns Entity Candidates and Matches for a single name and attributes.

Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search.  Returns a list of potential entity matches, along with a match indicator, to assist in identifying the correct entity within the FactSet universe.  **Max of 1 Name permitted in a single request.** 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPrivateEquityandVentureCapital
from fds.sdk.FactSetPrivateEquityandVentureCapital.api import universe_api
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
    api_instance = universe_api.UniverseApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    name = "Alto Pharmacy" # str | The proper name of a Private Equity/Venture Capital firm, Fund, or Portfolio Company to be matched against the FactSet entity universe.<br/>  <p>***max length** =  200 per request*</p> 
    country = "US" # str | The two-character ISO2 country code corresponding to the entity's primary location. Providing this code helps to narrow the entity match candidates, significantly improving the accuracy of the matching algorithm. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). (optional)
    entity_type = [
        "PVT",
    ] # [str] | Three-character FactSet entity type code used to filter candidates in order to determine the final match result.   |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---|   |PVT|Private Company|SUB|Subsidiary|   |HOL|Holding Company|JVT|Joint Venture|   |NPO|Non-Profit Organization|      |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---|   |FAF| Family of Funds (Venture Capital/Private Equity)|PVF|Private Equity Fund / Alternative Investment|   |VEN|Venture Capital Fund| (optional)

    try:
        # Returns Entity Candidates and Matches for a single name and attributes.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_universe(name, country=country, entity_type=entity_type)

        pprint(api_response)

    except fds.sdk.FactSetPrivateEquityandVentureCapital.ApiException as e:
        print("Exception when calling UniverseApi->get_universe: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| The proper name of a Private Equity/Venture Capital firm, Fund, or Portfolio Company to be matched against the FactSet entity universe.&lt;br/&gt;  &lt;p&gt;***max length** &#x3D;  200 per request*&lt;/p&gt;  |
 **country** | **str**| The two-character ISO2 country code corresponding to the entity&#39;s primary location. Providing this code helps to narrow the entity match candidates, significantly improving the accuracy of the matching algorithm. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). | [optional]
 **entity_type** | **[str]**| Three-character FactSet entity type code used to filter candidates in order to determine the final match result.   |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---|   |PVT|Private Company|SUB|Subsidiary|   |HOL|Holding Company|JVT|Joint Venture|   |NPO|Non-Profit Organization|      |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---|   |FAF| Family of Funds (Venture Capital/Private Equity)|PVF|Private Equity Fund / Alternative Investment|   |VEN|Venture Capital Fund| | [optional]

### Return type

[**EntityMatchesResponse**](EntityMatchesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response containing Entity Match results. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

