# FactSet.SDK.Symbology.Api.IdentifierResolutionApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BatchIdentifierResolution**](IdentifierResolutionApi.md#batchidentifierresolution) | **POST** /symbology/v3/identifier-resolution | Returns the specified output identifiers for the specified input identifier.
[**IdentifierResolution**](IdentifierResolutionApi.md#identifierresolution) | **GET** /symbology/v3/identifier-resolution | Returns the specified output identifiers for the specified input identifier.



<a name="batchidentifierresolution"></a>
# **BatchIdentifierResolution**
> IdentifierResolutionResponse BatchIdentifierResolution (IdentifierResolutionRequest identifierResolutionRequest)

Returns the specified output identifiers for the specified input identifier.

The Identifier Resolution endpoint provides flexibility for requesting and receiving both third-party and FactSet Permanent identifiers. Users can both input and output most of the listed identifiers, with exceptions noted below.  All input and output symbols must be declared, and users have the ability to resolve one input symbol to many different output symbols in one request.  * BIC* - Bank Identification Code (e.g. ABXXHKH1) * CIK - Edgar Central Index Keys (e.g. 0000100331) * CRD - Central Registration Depository (e.g. 149722) * DUNS - Dun & Bradstreet Data Universal Numbering System (e.g. 621513451) (Input only) * EIN - Employer Identification Number (e.g. 953540776) * FITCH* - Fitch Ratings Identifier (e.g. 47504) * LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) * MD* - Moody's Ratings Identifier (e.g. 0823736553) * SPR* - S&P Ratings Identifier (e.g. 301939) * VALOREN - Valoren (\"Valor\") Identification (e.g. 685558) (Input only) * WKN* - German Securities Identification (\"Wert\") (e.g. A0MU9T) * UKCH - UK Company House Identifier(e.g.CE012494) * RSSD - Federal Reserve RSSD Identifier(1139297) * SEDOL* * CUSIP* * fsymEntityId - FactSet entity Id * fsymSecurityId - FactSet security level permanent identifier * fsymRegionalId - FactSet regional level permanent identifier * fsymListingId - FactSet listing level permanent identifier * ISIN* * tickerExchange * tickerRegion * bloombergFigi (Input only) * bloombergTicker (Input only) * GVKEY (Input only) * GVKEY & IID (Input only) * JCN * LoanX (Input only) * Markit Red (Input only)  **These symbol types require additional subscriptions. If you would like to gain access to these symbol types, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Symbology.Api;
using FactSet.SDK.Symbology.Client;
using FactSet.SDK.Symbology.Model;

namespace Example
{
    public class BatchIdentifierResolutionExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Symbology.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new IdentifierResolutionApi(config);

            var identifierResolutionRequest = new IdentifierResolutionRequest(); // IdentifierResolutionRequest | Request Body for Identifier Resolution.

            try
            {
                // Returns the specified output identifiers for the specified input identifier.
                IdentifierResolutionResponse result = apiInstance.BatchIdentifierResolution(identifierResolutionRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling IdentifierResolutionApi.BatchIdentifierResolution: " + e.Message );
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
 **identifierResolutionRequest** | [**IdentifierResolutionRequest**](IdentifierResolutionRequest.md)| Request Body for Identifier Resolution. | 

### Return type
[**IdentifierResolutionResponse**](IdentifierResolutionResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Symbol translation objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** |  |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="identifierresolution"></a>
# **IdentifierResolution**
> IdentifierResolutionResponse IdentifierResolution (List<string> ids, string inputSymbolType, List<string> outputSymbolTypes)

Returns the specified output identifiers for the specified input identifier.

The Identifier Resolution endpoint provides flexibility for requesting and receiving both third-party and FactSet Permanent identifiers. Users can both input and output most of the listed identifiers, with exceptions noted below.  All input and output symbols must be declared, and users have the ability to resolve one input symbol to many different output symbols in one request.  * BIC* - Bank Identification Code (e.g. ABXXHKH1) * CIK - Edgar Central Index Keys (e.g. 0000100331) * CRD - Central Registration Depository (e.g. 149722) * DUNS - Dun & Bradstreet Data Universal Numbering System (e.g. 621513451) (Input only) * EIN - Employer Identification Number (e.g. 953540776) * FITCH* - Fitch Ratings Identifier (e.g. 47504) * LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) * MD* - Moody's Ratings Identifier (e.g. 0823736553) * SPR* - S&P Ratings Identifier (e.g. 301939) * VALOREN - Valoren (\"Valor\") Identification (e.g. 685558) (Input only) * WKN* - German Securities Identification (\"Wert\") (e.g. A0MU9T) * UKCH - UK Company House Identifier(e.g.CE012494) * RSSD - Federal Reserve RSSD Identifier(1139297) * SEDOL* * CUSIP* * fsymEntityId - FactSet entity Id * fsymSecurityId - FactSet security level permanent identifier * fsymRegionalId - FactSet regional level permanent identifier * fsymListingId - FactSet listing level permanent identifier * ISIN* * tickerExchange * tickerRegion * bloombergFigi (Input only) * bloombergTicker (Input only) * GVKEY (Input only) * GVKEY & IID (Input only) * JCN * LoanX (Input only) * Markit Red (Input only)  **These symbol types require additional subscriptions. If you would like to gain access to these symbol types, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Symbology.Api;
using FactSet.SDK.Symbology.Client;
using FactSet.SDK.Symbology.Model;

namespace Example
{
    public class IdentifierResolutionExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Symbology.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new IdentifierResolutionApi(config);

            var ids = new List<string>(); // List<string> | Requested security or entity identifiers. All requested identifiers must be of the same type. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  3000 per request*</p>   *<p>NOTE:  GET Method URL request lines are also limited to a total   length of 8192 bytes (8KB). In cases where the service allows for thousands   of ids, which may lead to exceeding this request line limit of 8KB, its   advised for any requests with large request lines to be requested through   the respective \"POST\" method.</p>* 
            var inputSymbolType = "BIC";  // string | The type of symbol being inputted. Only one type of symbol is accepted with each request.  (default to tickerRegion)
            var outputSymbolTypes = new List<string>(); // List<string> | The type of symbols being outputted. Multiple types of symbols can be outputted with each request. The user must be authorized for the requested identifier type.

            try
            {
                // Returns the specified output identifiers for the specified input identifier.
                IdentifierResolutionResponse result = apiInstance.IdentifierResolution(ids, inputSymbolType, outputSymbolTypes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling IdentifierResolutionApi.IdentifierResolution: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| Requested security or entity identifiers. All requested identifiers must be of the same type. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt;   *&lt;p&gt;NOTE:  GET Method URL request lines are also limited to a total   length of 8192 bytes (8KB). In cases where the service allows for thousands   of ids, which may lead to exceeding this request line limit of 8KB, its   advised for any requests with large request lines to be requested through   the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **inputSymbolType** | **string**| The type of symbol being inputted. Only one type of symbol is accepted with each request.  | [default to tickerRegion]
 **outputSymbolTypes** | [**List&lt;string&gt;**](string.md)| The type of symbols being outputted. Multiple types of symbols can be outputted with each request. The user must be authorized for the requested identifier type. | 

### Return type
[**IdentifierResolutionResponse**](IdentifierResolutionResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Symbol translation objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** |  |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


