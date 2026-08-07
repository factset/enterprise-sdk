# fds.sdk.FactSetSupplyChain.SupplyChainApi

All URIs are relative to *https://api.factset.com/content/factset-supply-chain/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list_supply_chain**](SupplyChainApi.md#list_supply_chain) | **GET** /supply-chain | Get supply chain relationships for requested entities.
[**list_supply_chain_for_list**](SupplyChainApi.md#list_supply_chain_for_list) | **POST** /supply-chain | Get supply chain relationships for a large list of entity IDs.



# **list_supply_chain**
> SupplyChainResponse list_supply_chain(ids)

Get supply chain relationships for requested entities.

Retrieve supplier and customer relationships for the requested entity or entities.  Includes:  - subsidiaries - revenue percentages - relevance grades - centrality measures - relationship keywords  Use the `relationshipType` parameter to filter by:  - `CUSTOMER` - `SUPPLIER`  Historical data can be accessed only with the Historical product subscription. If the product is not subscribed, data for the latest available period will be returned. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetSupplyChain
from fds.sdk.FactSetSupplyChain.api import supply_chain_api
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
    api_instance = supply_chain_api.SupplyChainApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["000C7F-E"] # [str] | The requested identifier. FactSet identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs.<p><strong>IDs limit</strong> = 20 per non-batch request and 1000 per batch request.</p><p>Make note, <strong>GET</strong> Method URL request lines are also limited to a total length of 8192 bytes (8 KB). In cases where the service allows for large numbers of IDs, which may lead to exceeding this request line limit of 8 KB, it is advised that requests with large request lines be made through the respective <strong>POST</strong> method.</p>
    relationship_type = SupplyChainRelationshipType("CUSTOMER") # SupplyChainRelationshipType | Controls the type of supply chain relationship returned.   * **CUSTOMER** = Returns entities to which the source company sells products/services.   * **SUPPLIER** = Returns entities from which the source company purchases goods or services. (optional)
    date = dateutil_parser('2025-12-31').date() # date | The date requested in YYYY-MM-DD format. If left blank, the API will default to the most recent available data. Future dates (T+1) are not accepted in this endpoint. (optional)
    fields = SupplyChainFields([
        SupplyChainFieldsEnum("supplierSubsidiaries"),
    ]) # SupplyChainFields | A specific set of attributes to return in the response. If omitted, all fields are returned.  (optional)
    batch = Batch("N") # Batch | Enables the ability to asynchronously \"batch\" the request, supporting a long-running request for up to 20 minutes. Upon requesting batch=Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use the corresponding `/batch-status` endpoint to see if the job has been completed. Once completed, retrieve the results of the request via the `/batch-result` endpoint.  (optional)
    pagination_limit = 5 # int | Specifies the number of results to return per page. (optional) if omitted the server will use the default value of 5
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional) if omitted the server will use the default value of 0

    try:
        # Get supply chain relationships for requested entities.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.list_supply_chain(ids, relationship_type=relationship_type, date=date, fields=fields, batch=batch, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetSupplyChain.ApiException as e:
        print("Exception when calling SupplyChainApi->list_supply_chain: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested identifier. FactSet identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs.&lt;p&gt;&lt;strong&gt;IDs limit&lt;/strong&gt; &#x3D; 20 per non-batch request and 1000 per batch request.&lt;/p&gt;&lt;p&gt;Make note, &lt;strong&gt;GET&lt;/strong&gt; Method URL request lines are also limited to a total length of 8192 bytes (8 KB). In cases where the service allows for large numbers of IDs, which may lead to exceeding this request line limit of 8 KB, it is advised that requests with large request lines be made through the respective &lt;strong&gt;POST&lt;/strong&gt; method.&lt;/p&gt; |
 **relationship_type** | **SupplyChainRelationshipType**| Controls the type of supply chain relationship returned.   * **CUSTOMER** &#x3D; Returns entities to which the source company sells products/services.   * **SUPPLIER** &#x3D; Returns entities from which the source company purchases goods or services. | [optional]
 **date** | **date**| The date requested in YYYY-MM-DD format. If left blank, the API will default to the most recent available data. Future dates (T+1) are not accepted in this endpoint. | [optional]
 **fields** | **SupplyChainFields**| A specific set of attributes to return in the response. If omitted, all fields are returned.  | [optional]
 **batch** | **Batch**| Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes. Upon requesting batch&#x3D;Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use the corresponding &#x60;/batch-status&#x60; endpoint to see if the job has been completed. Once completed, retrieve the results of the request via the &#x60;/batch-result&#x60; endpoint.  | [optional]
 **pagination_limit** | **int**| Specifies the number of results to return per page. | [optional] if omitted the server will use the default value of 5
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] if omitted the server will use the default value of 0

### Return type

[**SupplyChainResponse**](SupplyChainResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response containing supply chain relationships for the requested entity IDs. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested resource was not found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_supply_chain_for_list**
> SupplyChainResponse list_supply_chain_for_list(supply_chain_request)

Get supply chain relationships for a large list of entity IDs.

Retrieve supplier and customer relationships for a large list of entity IDs.  Includes:  - subsidiaries - revenue percentages - relevance grades - centrality measures - relationship keywords  Use the `relationshipType` parameter to filter by:  - `CUSTOMER` - `SUPPLIER`  Historical data can be accessed only with the Historical product subscription. If the product is not subscribed, data for the latest available period will be returned. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetSupplyChain
from fds.sdk.FactSetSupplyChain.api import supply_chain_api
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
    api_instance = supply_chain_api.SupplyChainApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    supply_chain_request = SupplyChainRequest(
        data=SupplyChainRequestData(
            ids=Ids(["000C7F-E","0FPWZD-E"]),
            relationship_type=SupplyChainRelationshipType("CUSTOMER"),
            date=dateutil_parser('Wed Dec 31 00:00:00 UTC 2025').date(),
            fields=SupplyChainFields([
                SupplyChainFieldsEnum("supplierSubsidiaries"),
            ]),
            batch=Batch("N"),
        ),
        meta=RequestMeta(
            pagination=RequestPagination(
                limit=100,
                offset=0,
            ),
        ),
    ) # SupplyChainRequest | The Supply Chain request body, allowing the user to specify a list of IDs.

    try:
        # Get supply chain relationships for a large list of entity IDs.
        # example passing only required values which don't have defaults set
        api_response = api_instance.list_supply_chain_for_list(supply_chain_request)

        pprint(api_response)

    except fds.sdk.FactSetSupplyChain.ApiException as e:
        print("Exception when calling SupplyChainApi->list_supply_chain_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supply_chain_request** | [**SupplyChainRequest**](SupplyChainRequest.md)| The Supply Chain request body, allowing the user to specify a list of IDs. |

### Return type

[**SupplyChainResponse**](SupplyChainResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response containing supply chain relationships for the large list of entity IDs. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested resource was not found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

