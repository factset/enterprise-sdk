# FactSet.SDK.FactSetTickHistory.Api.RequestFilesApi

All URIs are relative to *https://api-sandbox.factset.com/bulk-documents/tickhistory*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1RequestFilesGet**](RequestFilesApi.md#v1requestfilesget) | **GET** /v1/request-files | Returns the requestId and status



<a name="v1requestfilesget"></a>
# **V1RequestFilesGet**
> RequestFilesResponse V1RequestFilesGet (DateTime startDate, DateTime endDate, string ticker = null, string isoCode = null, string fields = null, string startTime = null, string endTime = null, string single = null, string regionalISOCode = null)

Returns the requestId and status

Try it Out - references a Sandbox environment to simulate live reponses.</p> **In Sandbox** data available from 20210101 to 20210131. Current date data is not available.</p> PROD has data from 20120101 to current date &</p> **available IDs is limited to..**</p> US Equity - IBM-USA, F-USA, AAPL-USA, GOOG-USA</p> ASX - CBA-ASX, BHP-ASX</p> LSE - HSBA-LON, VOD-LON</p> Tokyo - 7203-TKS, 4307-TKS</p> Swiss - NESN-SWX, COTN-SWX</p> Singapore - J36-SES &</p> Hong Kong - 700-HKG</p>

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetTickHistory.Api;
using FactSet.SDK.FactSetTickHistory.Client;
using FactSet.SDK.FactSetTickHistory.Model;

namespace Example
{
    public class V1RequestFilesGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetTickHistory.Client.Configuration();

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

            var apiInstance = new RequestFilesApi(config);

            var startDate = DateTime.Parse("2021-01-01");  // DateTime | The date for (or from which) the data is required.</p> **In Sandbox, data available from 1st to 31st Jan'21 only**.
            var endDate = DateTime.Parse("2021-01-31");  // DateTime | The date to which data is required.</p> **In Sandbox, data available from 1st to 31st Jan'21 only**.
            var ticker = "CBA,BHP";  // string | The requested list of security identifiers. <p>**Either ticker(s) + iso_code  (OR) product is allowed**</p> **NOTE**:Only one identifier can be requested per request (optional) 
            var isoCode = "AUS";  // string | The requested ISO code. <p>ticker(s) + iso_code</p> <p>**Does not support multiple iso_codes**</p> (optional) 
            var fields = "\"*\"";  // string | Fields for which data is requested. Refer <a href= \"https://developer.factset.com/api-catalog/factset-tick-history-api#apiDocumentation\">Output fields list</a>. for available fields.</p> **In trial default=all fields** (optional)  (default to "*")
            var startTime = "10:20:30";  // string | The start time of the data being requested. The time should be in HH:MM:SS format. (optional) 
            var endTime = "11:20:30";  // string | The end time of the data being requested. The time should be in HH:MM:SS format. (optional) 
            var single = "true";  // string | Returns data in a single file when single=true. This parameter only works for smaller date/time requests where the file size is upto 128MB. (optional)  (default to false)
            var regionalISOCode = "ASX";  // string | Works in conjunction with iso_code parameter.<p>ticker(s) + iso_code + regionalISOCode</p> <p>**Does not support multiple regionalISOCodes**</p> (optional) 

            try
            {
                // Returns the requestId and status
                RequestFilesResponse result = apiInstance.V1RequestFilesGet(startDate, endDate, ticker, isoCode, fields, startTime, endTime, single, regionalISOCode);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RequestFilesApi.V1RequestFilesGet: " + e.Message );
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
 **startDate** | **DateTime**| The date for (or from which) the data is required.&lt;/p&gt; **In Sandbox, data available from 1st to 31st Jan&#39;21 only**. | 
 **endDate** | **DateTime**| The date to which data is required.&lt;/p&gt; **In Sandbox, data available from 1st to 31st Jan&#39;21 only**. | 
 **ticker** | **string**| The requested list of security identifiers. &lt;p&gt;**Either ticker(s) + iso_code  (OR) product is allowed**&lt;/p&gt; **NOTE**:Only one identifier can be requested per request | [optional] 
 **isoCode** | **string**| The requested ISO code. &lt;p&gt;ticker(s) + iso_code&lt;/p&gt; &lt;p&gt;**Does not support multiple iso_codes**&lt;/p&gt; | [optional] 
 **fields** | **string**| Fields for which data is requested. Refer &lt;a href&#x3D; \&quot;https://developer.factset.com/api-catalog/factset-tick-history-api#apiDocumentation\&quot;&gt;Output fields list&lt;/a&gt;. for available fields.&lt;/p&gt; **In trial default&#x3D;all fields** | [optional] [default to &quot;*&quot;]
 **startTime** | **string**| The start time of the data being requested. The time should be in HH:MM:SS format. | [optional] 
 **endTime** | **string**| The end time of the data being requested. The time should be in HH:MM:SS format. | [optional] 
 **single** | **string**| Returns data in a single file when single&#x3D;true. This parameter only works for smaller date/time requests where the file size is upto 128MB. | [optional] [default to false]
 **regionalISOCode** | **string**| Works in conjunction with iso_code parameter.&lt;p&gt;ticker(s) + iso_code + regionalISOCode&lt;/p&gt; &lt;p&gt;**Does not support multiple regionalISOCodes**&lt;/p&gt; | [optional] 

### Return type
[**RequestFilesResponse**](RequestFilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successs |  -  |
| **400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


