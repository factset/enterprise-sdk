# FactSet.SDK.Symbology.Api.HistoricalIdentifierResolutionApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BatchHistoricalIdentifierResolution**](HistoricalIdentifierResolutionApi.md#batchhistoricalidentifierresolution) | **POST** /symbology/v3/historical-identifier-resolution | Returns the specified historical output identifiers for the given input identifier.
[**HistoricalIdentifierResolution**](HistoricalIdentifierResolutionApi.md#historicalidentifierresolution) | **GET** /symbology/v3/historical-identifier-resolution | Returns the specified historical output identifiers for the given input identifier.



<a name="batchhistoricalidentifierresolution"></a>
# **BatchHistoricalIdentifierResolution**
> IdentifierResolutionHistoricalResponse BatchHistoricalIdentifierResolution (IdentifierResolutionHistoricalRequest identifierResolutionHistoricalRequest)

Returns the specified historical output identifiers for the given input identifier.

This endpoint enables the retrieval of historical CUSIP, SEDOL, ISIN, and tickerRegion identifiers. Users can input any of the listed identifiers and resolve one input symbol to multiple different output symbols in a single request. Both input and output symbols must be declared. The `asOfDate` field allows users to retrieve the full history of an identifier or the specific identifiers as of the requested date.  * **BIC*** - Bank Identification Code (e.g. ABXXHKH1) (Input only) * **CIK** - Edgar Central Index Keys (e.g. 0000100331) (Input only) * **CRD** - Central Registration Depository (e.g. 149722) (Input only) * **EIN** - Employer Identification Number (e.g. 953540776) (Input only) * **FITCH*** - Fitch Ratings Identifier (e.g. 47504) (Input only) * **LEI** - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) (Input only) * **MD*** - Moody's Ratings Identifier (e.g. 0823736553) (Input only) * **SPR*** - S&P Ratings Identifier (e.g. 301939) (Input only) * **VALOREN** - Valoren (\"Valor\") Identification (e.g. 685558) (Input only) * **WKN*** - German Securities Identification (\"Wertpapierkennnummer\") (e.g. A0MU9T) (Input only) * **UKCH** - UK Company House Identifier (e.g.CE012494) (Input only) * **RSSD** - Federal Reserve RSSD Identifier (1139297) (Input only) * **SEDOL*** * **CUSIP*** * **fsymEntityId** - FactSet entity Id (Input only) * **fsymSecurityId** - FactSet security level permanent identifier (Input only) * **fsymRegionalId** - FactSet regional level permanent identifier (Input only) * **fsymListingId** - FactSet listing level permanent identifier (Input only) * **ISIN*** * **tickerExchange** - Ticker Exchange, a marketplace where stocks, bonds, commodities, and derivatives are bought and sold. (e.g. GOOGL-NAS) (Input only) * **tickerRegion** - Ticker Region, geographical region or market segment where a particular stock or security is listed and traded. (e.g. GOOGL-US) * **bloombergFigi** - Bloomberg Listing/Regional/Security Identifier (output symbols: bloombergFigiListing, bloombergFigiRegional & bloombergFigiSecurity ) (e.g. BBG009S39JY5) (Input only) * **bloombergTicker** - Bloomberg Listing and Regional Ticker Identifier (output symbols: bloombergRegionalTicker & bloombergListingTicker) (e.g. GOOGL UW) (Input only) * **GVKEY** - CompuStat Entity Identifier (e.g. 063172) (Input only) * **GVKEY & IID** - CompuStat Security Identifier (e.g.063172001) (Input only) * **JCN** - Japan Corporate Number (e.g. 9011101021173) (Input only) * **LoanX** - Markit Bank Loan Security Identifier (e.g. LX130668) (Input only) * **MarkitRed** - Markit Entity Identifier (e.g. 3D337C) (Input only)  **These symbol types require additional subscriptions. If you would like to gain access to these symbol types, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Symbology.Api;
using FactSet.SDK.Symbology.Client;
using FactSet.SDK.Symbology.Model;

namespace Example
{
    public class BatchHistoricalIdentifierResolutionExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Symbology.Client.Configuration();

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

            var apiInstance = new HistoricalIdentifierResolutionApi(config);

            var identifierResolutionHistoricalRequest = new IdentifierResolutionHistoricalRequest(); // IdentifierResolutionHistoricalRequest | Request Body for Historical Identifier Resolution.

            try
            {
                // Returns the specified historical output identifiers for the given input identifier.
                IdentifierResolutionHistoricalResponse result = apiInstance.BatchHistoricalIdentifierResolution(identifierResolutionHistoricalRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling HistoricalIdentifierResolutionApi.BatchHistoricalIdentifierResolution: " + e.Message );
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
 **identifierResolutionHistoricalRequest** | [**IdentifierResolutionHistoricalRequest**](IdentifierResolutionHistoricalRequest.md)| Request Body for Historical Identifier Resolution. | 

### Return type
[**IdentifierResolutionHistoricalResponse**](IdentifierResolutionHistoricalResponse.md)

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


<a name="historicalidentifierresolution"></a>
# **HistoricalIdentifierResolution**
> IdentifierResolutionHistoricalResponse HistoricalIdentifierResolution (List<string> ids, string inputSymbolType, List<string> outputSymbolTypes, DateTime? asOfDate = null)

Returns the specified historical output identifiers for the given input identifier.

This endpoint enables the retrieval of historical CUSIP, SEDOL, ISIN, and tickerRegion identifiers. Users can input any of the listed identifiers and resolve one input symbol to multiple different output symbols in a single request. Both input and output symbols must be declared. The `asOfDate` field allows users to retrieve the full history of an identifier or the specific identifiers as of the requested date.  * **BIC*** - Bank Identification Code (e.g. ABXXHKH1) (Input only) * **CIK** - Edgar Central Index Keys (e.g. 0000100331) (Input only) * **CRD** - Central Registration Depository (e.g. 149722) (Input only) * **EIN** - Employer Identification Number (e.g. 953540776) (Input only) * **FITCH*** - Fitch Ratings Identifier (e.g. 47504) (Input only) * **LEI** - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) (Input only) * **MD*** - Moody's Ratings Identifier (e.g. 0823736553) (Input only) * **SPR*** - S&P Ratings Identifier (e.g. 301939) (Input only) * **VALOREN** - Valoren (\"Valor\") Identification (e.g. 685558) (Input only) * **WKN*** - German Securities Identification (\"Wertpapierkennnummer\") (e.g. A0MU9T) (Input only) * **UKCH** - UK Company House Identifier (e.g.CE012494) (Input only) * **RSSD** - Federal Reserve RSSD Identifier (1139297) (Input only) * **SEDOL*** * **CUSIP*** * **fsymEntityId** - FactSet entity Id (Input only) * **fsymSecurityId** - FactSet security level permanent identifier (Input only) * **fsymRegionalId** - FactSet regional level permanent identifier (Input only) * **fsymListingId** - FactSet listing level permanent identifier (Input only) * **ISIN*** * **tickerExchange** - Ticker Exchange is a marketplace where stocks, bonds, commodities, and derivatives are bought and sold. (e.g. GOOGL-NAS) (Input only) * **tickerRegion** - Ticker Region is the geographical region or market segment where a particular stock or security is listed and traded. (e.g. GOOGL-US) * **bloombergFigi** - Bloomberg Listing/Regional/Security Identifier (output symbols: bloombergFigiListing, bloombergFigiRegional & bloombergFigiSecurity ) (e.g. BBG009S39JY5) (Input only) * **bloombergTicker** - Bloomberg Listing and Regional Ticker Identifier (output symbols: bloombergRegionalTicker & bloombergListingTicker) (e.g. GOOGL UW) (Input only) * **GVKEY** - CompuStat Entity Identifier (e.g. 063172) (Input only) * **GVKEY & IID** - CompuStat Security Identifier (e.g.063172001) (Input only) * **JCN** - Japan Corporate Number (e.g. 9011101021173) (Input only) * **LoanX** - Markit Bank Loan Security Identifier (e.g. LX130668) (Input only) * **MarkitRed** - Markit Entity Identifier (e.g. 3D337C) (Input only)   **These symbol types require additional subscriptions. If you would like to gain access to these symbol types, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Symbology.Api;
using FactSet.SDK.Symbology.Client;
using FactSet.SDK.Symbology.Model;

namespace Example
{
    public class HistoricalIdentifierResolutionExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Symbology.Client.Configuration();

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

            var apiInstance = new HistoricalIdentifierResolutionApi(config);

            var ids = new List<string>(); // List<string> | Requested security or entity identifiers. All requested identifiers must be of the same type. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  100 per request*</p>   *<p>NOTE:  GET Method URL request lines are also limited to a total   length of 8192 bytes (8KB). In cases where the service allows for thousands   of ids, which may lead to exceeding this request line limit of 8KB, its   advised for any requests with large request lines to be requested through   the respective \"POST\" method.</p>* 
            var inputSymbolType = "BIC";  // string | The type of symbol being inputted. Only one type of symbol is accepted with each request. 
            var outputSymbolTypes = new List<string>(); // List<string> | The type of symbols being outputted. Multiple types of symbols can be outputted with each request. The user must be authorized for the requested identifier type.
            var asOfDate = DateTime.Parse("2010-01-01");  // DateTime? | As of date for historical symbol request in YYYY-MM-DD format. If no `asOfDate` is requested, the response will include the full history of the identifier.  (optional) 

            try
            {
                // Returns the specified historical output identifiers for the given input identifier.
                IdentifierResolutionHistoricalResponse result = apiInstance.HistoricalIdentifierResolution(ids, inputSymbolType, outputSymbolTypes, asOfDate);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling HistoricalIdentifierResolutionApi.HistoricalIdentifierResolution: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| Requested security or entity identifiers. All requested identifiers must be of the same type. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  100 per request*&lt;/p&gt;   *&lt;p&gt;NOTE:  GET Method URL request lines are also limited to a total   length of 8192 bytes (8KB). In cases where the service allows for thousands   of ids, which may lead to exceeding this request line limit of 8KB, its   advised for any requests with large request lines to be requested through   the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **inputSymbolType** | **string**| The type of symbol being inputted. Only one type of symbol is accepted with each request.  | 
 **outputSymbolTypes** | [**List&lt;string&gt;**](string.md)| The type of symbols being outputted. Multiple types of symbols can be outputted with each request. The user must be authorized for the requested identifier type. | 
 **asOfDate** | **DateTime?**| As of date for historical symbol request in YYYY-MM-DD format. If no &#x60;asOfDate&#x60; is requested, the response will include the full history of the identifier.  | [optional] 

### Return type
[**IdentifierResolutionHistoricalResponse**](IdentifierResolutionHistoricalResponse.md)

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


