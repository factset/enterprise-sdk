# FactSet.SDK.FactSetSupplyChain.Api.SupplyChainApi

All URIs are relative to *https://api.factset.com/content/factset-supply-chain/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ListSupplyChain**](SupplyChainApi.md#listsupplychain) | **GET** /supply-chain | Get supply chain relationships for requested entities.
[**ListSupplyChainForList**](SupplyChainApi.md#listsupplychainforlist) | **POST** /supply-chain | Get supply chain relationships for a large list of entity IDs.



<a name="listsupplychain"></a>
# **ListSupplyChain**
> SupplyChainResponse ListSupplyChain (List<string> ids, SupplyChainRelationshipType? relationshipType = null, DateTime? date = null, List<SupplyChainFieldsEnum> fields = null, Batch? batch = null, int? paginationLimit = null, int? paginationOffset = null)

Get supply chain relationships for requested entities.

Retrieve supplier and customer relationships for the requested entity or entities.  Includes:  - subsidiaries - revenue percentages - relevance grades - centrality measures - relationship keywords  Use the `relationshipType` parameter to filter by:  - `CUSTOMER` - `SUPPLIER`  Historical data can be accessed only with the Historical product subscription. If the product is not subscribed, data for the latest available period will be returned. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetSupplyChain.Api;
using FactSet.SDK.FactSetSupplyChain.Client;
using FactSet.SDK.FactSetSupplyChain.Model;

namespace Example
{
    public class ListSupplyChainExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetSupplyChain.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new SupplyChainApi(config);

            var ids = new List<string>(); // List<string> | The requested identifier. FactSet identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs.<p><strong>IDs limit</strong> = 20 per non-batch request and 1000 per batch request.</p><p>Make note, <strong>GET</strong> Method URL request lines are also limited to a total length of 8192 bytes (8 KB). In cases where the service allows for large numbers of IDs, which may lead to exceeding this request line limit of 8 KB, it is advised that requests with large request lines be made through the respective <strong>POST</strong> method.</p>
            var relationshipType = (SupplyChainRelationshipType) "CUSTOMER";  // SupplyChainRelationshipType? | Controls the type of supply chain relationship returned.   * **CUSTOMER** = Returns entities to which the source company sells products/services.   * **SUPPLIER** = Returns entities from which the source company purchases goods or services. (optional) 
            var date = DateTime.Parse("2025-12-31");  // DateTime? | The date requested in YYYY-MM-DD format. If left blank, the API will default to the most recent available data. Future dates (T+1) are not accepted in this endpoint. (optional) 
            var fields = new List<SupplyChainFieldsEnum>(); // List<SupplyChainFieldsEnum> | A specific set of attributes to return in the response. If omitted, all fields are returned.  (optional) 
            var batch = (Batch) "Y";  // Batch? | Enables the ability to asynchronously \"batch\" the request, supporting a long-running request for up to 20 minutes. Upon requesting batch=Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use the corresponding `/batch-status` endpoint to see if the job has been completed. Once completed, retrieve the results of the request via the `/batch-result` endpoint.  (optional) 
            var paginationLimit = 5;  // int? | Specifies the number of results to return per page. (optional)  (default to 5)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional)  (default to 0)

            try
            {
                // Get supply chain relationships for requested entities.
                SupplyChainResponse result = apiInstance.ListSupplyChain(ids, relationshipType, date, fields, batch, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SupplyChainApi.ListSupplyChain: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**List&lt;string&gt;**](string.md)| The requested identifier. FactSet identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs.&lt;p&gt;&lt;strong&gt;IDs limit&lt;/strong&gt; &#x3D; 20 per non-batch request and 1000 per batch request.&lt;/p&gt;&lt;p&gt;Make note, &lt;strong&gt;GET&lt;/strong&gt; Method URL request lines are also limited to a total length of 8192 bytes (8 KB). In cases where the service allows for large numbers of IDs, which may lead to exceeding this request line limit of 8 KB, it is advised that requests with large request lines be made through the respective &lt;strong&gt;POST&lt;/strong&gt; method.&lt;/p&gt; | 
 **relationshipType** | **SupplyChainRelationshipType?**| Controls the type of supply chain relationship returned.   * **CUSTOMER** &#x3D; Returns entities to which the source company sells products/services.   * **SUPPLIER** &#x3D; Returns entities from which the source company purchases goods or services. | [optional] 
 **date** | **DateTime?**| The date requested in YYYY-MM-DD format. If left blank, the API will default to the most recent available data. Future dates (T+1) are not accepted in this endpoint. | [optional] 
 **fields** | [**List&lt;SupplyChainFieldsEnum&gt;**](SupplyChainFieldsEnum.md)| A specific set of attributes to return in the response. If omitted, all fields are returned.  | [optional] 
 **batch** | **Batch?**| Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes. Upon requesting batch&#x3D;Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use the corresponding &#x60;/batch-status&#x60; endpoint to see if the job has been completed. Once completed, retrieve the results of the request via the &#x60;/batch-result&#x60; endpoint.  | [optional] 
 **paginationLimit** | **int?**| Specifies the number of results to return per page. | [optional] [default to 5]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

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
| **200** | Successful response containing supply chain relationships for the requested entity IDs. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested resource was not found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="listsupplychainforlist"></a>
# **ListSupplyChainForList**
> SupplyChainResponse ListSupplyChainForList (SupplyChainRequest supplyChainRequest)

Get supply chain relationships for a large list of entity IDs.

Retrieve supplier and customer relationships for a large list of entity IDs.  Includes:  - subsidiaries - revenue percentages - relevance grades - centrality measures - relationship keywords  Use the `relationshipType` parameter to filter by:  - `CUSTOMER` - `SUPPLIER`  Historical data can be accessed only with the Historical product subscription. If the product is not subscribed, data for the latest available period will be returned. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetSupplyChain.Api;
using FactSet.SDK.FactSetSupplyChain.Client;
using FactSet.SDK.FactSetSupplyChain.Model;

namespace Example
{
    public class ListSupplyChainForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetSupplyChain.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new SupplyChainApi(config);

            var supplyChainRequest = new SupplyChainRequest(); // SupplyChainRequest | The Supply Chain request body, allowing the user to specify a list of IDs.

            try
            {
                // Get supply chain relationships for a large list of entity IDs.
                SupplyChainResponse result = apiInstance.ListSupplyChainForList(supplyChainRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SupplyChainApi.ListSupplyChainForList: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supplyChainRequest** | [**SupplyChainRequest**](SupplyChainRequest.md)| The Supply Chain request body, allowing the user to specify a list of IDs. | 

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
| **200** | Successful response containing supply chain relationships for the large list of entity IDs. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested resource was not found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


