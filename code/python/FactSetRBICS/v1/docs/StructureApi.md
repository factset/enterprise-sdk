# fds.sdk.FactSetRBICS.StructureApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_rbics_structure**](StructureApi.md#get_rbics_structure) | **GET** /factset-rbics/v1/structure | Get the full RBICS Taxonomy Structure Ids, Names, and effective periods.
[**get_rbics_structure_for_list**](StructureApi.md#get_rbics_structure_for_list) | **POST** /factset-rbics/v1/structure | Get the full RBICS Taxonomy Structure Ids, Names, and effective periods.



# **get_rbics_structure**
> StructureResponse get_rbics_structure()

Get the full RBICS Taxonomy Structure Ids, Names, and effective periods.

Understand the full RBICS Taxonomy Structure through time to help organize your analysis or facilitate the use of RBICS in application development.  Designed to overcome disparate and non-standardized company disclosures, the RBICS taxonomy is a normalized global industry classification consisting of a fourteen-by-six matrix. There are twelve economies with two specialty sectors, each with six incremental detailed layers, resulting in over 1,600 sector groups.  The top-levels' market-defined approach groups companies based on their behavioral similarities and stock price co-movement, while the patented product-based approach used in the lower levels enables the necessary precision to capture the specialty sectors of global markets. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetRBICS
from fds.sdk.FactSetRBICS.api import structure_api
from fds.sdk.FactSetRBICS.models import *
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
configuration = fds.sdk.FactSetRBICS.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetRBICS.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetRBICS.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = structure_api.StructureApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    rbics_ids = ["101010000000","55"] # [str] | RBICS Taxonomy Id Filter. Use to lookup the structure details for the Id requested.  (optional)
    level = 1 # int | RBICS industry levels to include in the response. All levels from 1-N will be returned. For example, '3' returns all levels 1,2 and 3. To request all levels, request level=6. Level 1 is returned by default.   |Level|Description|Number of Groups|   |---|---|---|   |1|Economomy|14|   |2|Sector|37   |3|Sub-Sector|109|   |4|Industry Group|366|   |5|Inudstry|901|   |6|Sub-Industry|1629|  (optional)
    include_names = True # bool | Option to include or exclude industry Names and the L6 Description. true = Include Names; false = Exclude Names. (optional) if omitted the server will use the default value of True
    date = "2017-07-24" # str | Effective date for data expressed in YYYY-MM-DD format. If no date is requested, the default behavior is to return the full history for the requested entity. (optional)

    try:
        # Get the full RBICS Taxonomy Structure Ids, Names, and effective periods.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_rbics_structure(rbics_ids=rbics_ids, level=level, include_names=include_names, date=date)

        pprint(api_response)

    except fds.sdk.FactSetRBICS.ApiException as e:
        print("Exception when calling StructureApi->get_rbics_structure: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rbics_ids** | **[str]**| RBICS Taxonomy Id Filter. Use to lookup the structure details for the Id requested.  | [optional]
 **level** | **int**| RBICS industry levels to include in the response. All levels from 1-N will be returned. For example, &#39;3&#39; returns all levels 1,2 and 3. To request all levels, request level&#x3D;6. Level 1 is returned by default.   |Level|Description|Number of Groups|   |---|---|---|   |1|Economomy|14|   |2|Sector|37   |3|Sub-Sector|109|   |4|Industry Group|366|   |5|Inudstry|901|   |6|Sub-Industry|1629|  | [optional]
 **include_names** | **bool**| Option to include or exclude industry Names and the L6 Description. true &#x3D; Include Names; false &#x3D; Exclude Names. | [optional] if omitted the server will use the default value of True
 **date** | **str**| Effective date for data expressed in YYYY-MM-DD format. If no date is requested, the default behavior is to return the full history for the requested entity. | [optional]

### Return type

[**StructureResponse**](StructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response producing an array of Entity Focus Objects |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_rbics_structure_for_list**
> StructureResponse get_rbics_structure_for_list(structure_request)

Get the full RBICS Taxonomy Structure Ids, Names, and effective periods.

Get the full RBICS Taxonomy Structure Ids, Names, and effective periods. POST method is optimal for requesting large lists of `rbicsIds`. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetRBICS
from fds.sdk.FactSetRBICS.api import structure_api
from fds.sdk.FactSetRBICS.models import *
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
configuration = fds.sdk.FactSetRBICS.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetRBICS.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetRBICS.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = structure_api.StructureApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    structure_request = StructureRequest(
        rbics_ids=RbicsIds(["101010000000","55"]),
        level=LevelStructure(3),
        include_names=True,
        date="2020-09-30",
    ) # StructureRequest | Request Body to request a list of RBICS Structure objects.

    try:
        # Get the full RBICS Taxonomy Structure Ids, Names, and effective periods.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_rbics_structure_for_list(structure_request)

        pprint(api_response)

    except fds.sdk.FactSetRBICS.ApiException as e:
        print("Exception when calling StructureApi->get_rbics_structure_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **structure_request** | [**StructureRequest**](StructureRequest.md)| Request Body to request a list of RBICS Structure objects. |

### Return type

[**StructureResponse**](StructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response producing an array of RBICS Structure Objects |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

