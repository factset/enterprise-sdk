# fds.sdk.FactSetSupplyChain.RelationshipsApi

All URIs are relative to *https://api.factset.com/content/factset-supply-chain/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_relationships**](RelationshipsApi.md#get_relationships) | **GET** /relationships | Returns Supply Chain Relationships Data.
[**get_relationships_for_list**](RelationshipsApi.md#get_relationships_for_list) | **POST** /relationships | Returns Supply Chain Relationships Data.



# **get_relationships**
> RelationshipsResponse get_relationships(ids, )

Returns Supply Chain Relationships Data.

Returns Supply Chain Relationships Data. This data is sorted primarily by the number of overlapping products, followed by the overlap percentage. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetSupplyChain
from fds.sdk.FactSetSupplyChain.api import relationships_api
from fds.sdk.FactSetSupplyChain.models import *
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
configuration = fds.sdk.FactSetSupplyChain.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetSupplyChain.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetSupplyChain.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = relationships_api.RelationshipsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["AAPL-USA"] # [str] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 500 
    company_type = "PUBLIC_COMPANIES_ONLY" # str | Specifies the type of companies to filter by  -   * **PUBLIC_COMPANIES_ONLY** = Display public company relationships only.   * **PRIVATE_COMPANIES_ONLY** = Display private company relationships only.   * **ALL** = Display public and private company relationships.  (optional) if omitted the server will use the default value of "PUBLIC_COMPANIES_ONLY"
    relationship_direction = "ALL" # str | Filters the list of available relationship directions -   * **ALL** = All relationship directions.   * **DIRECT** = Direct indicates that the source company named the relationship.   * **REVERSE** = Reverse indicates that the target company named the relationship.  (optional) if omitted the server will use the default value of "ALL"

    try:
        # Returns Supply Chain Relationships Data.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_relationships(ids, company_type=company_type, relationship_direction=relationship_direction)

        pprint(api_response)

    except fds.sdk.FactSetSupplyChain.ApiException as e:
        print("Exception when calling RelationshipsApi->get_relationships: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 500  |
 **relationship_type** | **str**| Specifies the type of relationship to filter the results  -   * **SUPPLIERS** &#x3D; Entities from which the source company purchases goods or services; the opposite of “Customer” relationship.   * **COMPETITORS** &#x3D; Entities disclosed by the source company as competitors.   * **CUSTOMERS** &#x3D; Entities to which the source company sells products/services; the “opposite” of Supplier relationship.   * **PARTNERS** &#x3D; Entities in which the source company owns an equity stake (“opposite” of an Investor relationship).  | defaults to "SUPPLIERS"
 **company_type** | **str**| Specifies the type of companies to filter by  -   * **PUBLIC_COMPANIES_ONLY** &#x3D; Display public company relationships only.   * **PRIVATE_COMPANIES_ONLY** &#x3D; Display private company relationships only.   * **ALL** &#x3D; Display public and private company relationships.  | [optional] if omitted the server will use the default value of "PUBLIC_COMPANIES_ONLY"
 **relationship_direction** | **str**| Filters the list of available relationship directions -   * **ALL** &#x3D; All relationship directions.   * **DIRECT** &#x3D; Direct indicates that the source company named the relationship.   * **REVERSE** &#x3D; Reverse indicates that the target company named the relationship.  | [optional] if omitted the server will use the default value of "ALL"

### Return type

[**RelationshipsResponse**](RelationshipsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetches supply chain relationships data for the requested list of identifiers. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_relationships_for_list**
> RelationshipsResponse get_relationships_for_list(relationships_request)

Returns Supply Chain Relationships Data.

Returns Supply Chain Relationships Data. This data is sorted primarily by the number of overlapping products, followed by the overlap percentage. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetSupplyChain
from fds.sdk.FactSetSupplyChain.api import relationships_api
from fds.sdk.FactSetSupplyChain.models import *
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
configuration = fds.sdk.FactSetSupplyChain.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetSupplyChain.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetSupplyChain.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = relationships_api.RelationshipsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    relationships_request = RelationshipsRequest(
        data=RelationshipsRequestBody(
            ids=RelationshipIds({"oneId":{"summary":"One Security Identifier","value":["AAPL-USA"]},"multipleIds":{"summary":"Multiple Security Identifiers","value":["FDS-US","AAPL-US","MSFT-US"]}}),
            relationship_type=RelationshipType("COMPETITORS"),
            company_type=CompanyType("PUBLIC_COMPANIES_ONLY"),
            relationship_direction=RelationshipDirection("ALL"),
        ),
    ) # RelationshipsRequest | Request body to request a list of Supply Chain financials objects.

    try:
        # Returns Supply Chain Relationships Data.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_relationships_for_list(relationships_request)

        pprint(api_response)

    except fds.sdk.FactSetSupplyChain.ApiException as e:
        print("Exception when calling RelationshipsApi->get_relationships_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relationships_request** | [**RelationshipsRequest**](RelationshipsRequest.md)| Request body to request a list of Supply Chain financials objects. |

### Return type

[**RelationshipsResponse**](RelationshipsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Supply Chain Relationships data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

