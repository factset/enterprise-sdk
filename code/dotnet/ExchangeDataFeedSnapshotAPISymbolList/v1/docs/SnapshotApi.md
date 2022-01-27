# FactSet.SDK.ExchangeDataFeedSnapshotAPISymbolList.Api.SnapshotApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDFSnapshot**](SnapshotApi.md#getdfsnapshot) | **GET** /DFSnapshot | Request a snapshot of exchange data for a list of symbols.
[**PostDFSnapshot**](SnapshotApi.md#postdfsnapshot) | **POST** /DFSnapshot | Snap exchange data. Use if URL lengh of 2,048 is exceeded.


<a name="getdfsnapshot"></a>
# **GetDFSnapshot**
> DFSnapshotResponse GetDFSnapshot (string ids = null, string oc = null, string fields = null, string sf = null, string format = null, string serv = null, string reqId = null)

Request a snapshot of exchange data for a list of symbols.

 `ids` and `oc` are required parameters, but only one can be used based on request. Use `ids` for regular snapshot requests, and `oc` for requesting an option chain.   **Try it Out** feature is available using a pre-recorded sandbox environment. Follow Try it Out inscrutions on each parameter to develop a request and view a sample server response.  '*You must be logged into the Developer Portal and obtain an **[API Key](https://developer.factset.com/factset/api-key-listing)** for ''Try it Out'' to receive a successful server response. Select **Authorize** button or visit **[Authentication Support](https://developer.factset.com/authentication)** for more details.*' 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using FactSet.SDK.Utils.Authentication;
using Microsoft.IdentityModel.Tokens;
using FactSet.SDK.ExchangeDataFeedSnapshotAPISymbolList.Api;
using FactSet.SDK.ExchangeDataFeedSnapshotAPISymbolList.Client;
using FactSet.SDK.ExchangeDataFeedSnapshotAPISymbolList.Model;

namespace Example
{
    public class GetDFSnapshotExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api-sandbox.factset.com";
            // Configure HTTP basic authorization: FactSetApiKey
            config.Username = "YOUR_USERNAME";
            config.Password = "YOUR_PASSWORD";
            // Configure OAuth2 access token for authorization: FactSetOAuth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            // Configure FactSet Authentication Client to automatically retrieve token for: FactSetOAuth2

            // using path to configuration:
            String pathToConfig = "";   // String contining absolute path to your configuration
            config.OAuth2Client = new ConfidentialClient(pathToConfig);

            // OR

            // If your configuration information is not within a file, you will provide the following information to create a new configuration.
            //   `name` - "Application Name registered with the FactSet Developer Portal",
            //   `clientId` - "Client ID registered with the FactSet Developer Portal",
            //   `clientAuthType` - For confidential client this will be "Confidential",
            //   `owners` - new List<string>() { "Owner ID(s) of this configuration" },
            //   `jwk` - new JsonWebKey(@"{
            //                     'kty': 'RSA',
            //                     'use': 'sig',
            //                     'alg': 'RS256',
            //                     'kid': 'Key ID',
            //                     'd': 'ECC Private Key',
            //                     'n': 'Modulus',
            //                     'e': 'Exponent',
            //                     'p': 'First Prime Factor',
            //                     'q': 'Second Prime Factor',
            //                     'dp': 'First Factor CRT Exponent',
            //                     'dq': 'Second Factor CRT Exponent',
            //                      'qi': 'First CRT Coefficient',
            //           }");

            // `NB`: Within the JWK parameters kty, alg, use, kid, n, e, d, p, q, dp, dq, qi are required for authorization.
            
            var config = new FactSet.SDK.Utils.Authentication.Configuration(name, clientId, clientAuthType, owners, jwk);
            config.OAuth2Client = new ConfidentialClient(config);

            var apiInstance = new SnapshotApi(config);
            var ids = ids_example;  // string | Requested symbols or securities. **Required** if not using `oc`. This is a comma-seperated list with a maximum of 500. Each symbol can be a FactSet Exchange Symbol, CUSIP, or SEDOL. This can be used in combination with `chain` parameter to pull in a custom portfolio.<P>**Try it out** - Choose one or multiple - IBM-USA, BABA-USA, WALMEX-MX, 7203-TKS, VOD-LON, NPN-JSE, MABAX, NZF, SPY-USA, AGG-USA, GLD-USA, AOR-USA, MNA-USA, UUP-USA, SP50-SPX, ESX-STX, XAO-ASX, WD-MSX, NG00-USA, GC00-USA, CC00-USA, C00-USA, FC00-USA, ER00-USA, EURUSD-FX1, USDMXN-FX1, AUDJPY-FX1, EURCZK-FX1, USDILS-FX1, USDZAR-FX1, US10YY-TU1, FDS#190621C00145000-USA, FDS#190621P00145000-USA. *Leave blank if you are trying the `oc` parameter*.</p> (optional) 
            var oc = oc_example;  // string | Option Chain, accepts one underlying symbol for which the option chain will be returned. **Required** if not using `ids`. <p>**Try it Out** - Only available for BABA-USA</p> (optional) 
            var fields = fields_example;  // string | All available fields. This is a comma-seperated list (no spaces). **Required** only when using `oc`. Otherwise, leave blank to return all fields by default. See definitions for details on available field names and Field ID #s. The Data Service Manual has complete reference.<p>**Try it Out** - All fields available. Use either FID # or name. For `oc`, recommend to use BID_1,ASK_1,STRIKE_PRICE. (optional) 
            var sf = sf_example;  // string | Symbol Filters, ability to apply filtering to the result of an option chain `oc` request based on available fields and values for the symbols. `sf`=VALUE_[filter],[field],[value]   * **VALUE_MINMAX** -  Field value will be within specified interval. ex. - VALUE_MINMAX,BID_1,min,max   * **VALUE_EQUALS** - Field value will equal specified value. ex. - VALUE_EQUALS,BID_1,value   * **VALUE_NOT_EQUALS** - Field value will not equal specified value. ex. - VALUE_NOT_EQUALS,BID_1,value      **Try it Out** - depends on fields used. Example - VALUE_MINMAX,STRIKE_PRICE,120,130   (optional) 
            var format = format_example;  // string | The format of the output file.<p>**Try it Out** - All formats available</p> (optional)  (default to XML)
            var serv = serv_example;  // string | The Data Service that handles the request for the specified symbols. Available live services are -    * **FDS1** -Production Data Service   * **FDS_FUND** -Fundamental Data Service used for End-of-Day data.  **Try it Out** - use FDS1  (optional) 
            var reqId = reqId_example;  // string | Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response.<p> **Try it Out** - any value can be passed through.</p> (optional) 

            try
            {
                // Request a snapshot of exchange data for a list of symbols.
                DFSnapshotResponse result = apiInstance.GetDFSnapshot(ids, oc, fields, sf, format, serv, reqId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SnapshotApi.GetDFSnapshot: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **string**| Requested symbols or securities. **Required** if not using &#x60;oc&#x60;. This is a comma-seperated list with a maximum of 500. Each symbol can be a FactSet Exchange Symbol, CUSIP, or SEDOL. This can be used in combination with &#x60;chain&#x60; parameter to pull in a custom portfolio.&lt;P&gt;**Try it out** - Choose one or multiple - IBM-USA, BABA-USA, WALMEX-MX, 7203-TKS, VOD-LON, NPN-JSE, MABAX, NZF, SPY-USA, AGG-USA, GLD-USA, AOR-USA, MNA-USA, UUP-USA, SP50-SPX, ESX-STX, XAO-ASX, WD-MSX, NG00-USA, GC00-USA, CC00-USA, C00-USA, FC00-USA, ER00-USA, EURUSD-FX1, USDMXN-FX1, AUDJPY-FX1, EURCZK-FX1, USDILS-FX1, USDZAR-FX1, US10YY-TU1, FDS#190621C00145000-USA, FDS#190621P00145000-USA. *Leave blank if you are trying the &#x60;oc&#x60; parameter*.&lt;/p&gt; | [optional] 
 **oc** | **string**| Option Chain, accepts one underlying symbol for which the option chain will be returned. **Required** if not using &#x60;ids&#x60;. &lt;p&gt;**Try it Out** - Only available for BABA-USA&lt;/p&gt; | [optional] 
 **fields** | **string**| All available fields. This is a comma-seperated list (no spaces). **Required** only when using &#x60;oc&#x60;. Otherwise, leave blank to return all fields by default. See definitions for details on available field names and Field ID #s. The Data Service Manual has complete reference.&lt;p&gt;**Try it Out** - All fields available. Use either FID # or name. For &#x60;oc&#x60;, recommend to use BID_1,ASK_1,STRIKE_PRICE. | [optional] 
 **sf** | **string**| Symbol Filters, ability to apply filtering to the result of an option chain &#x60;oc&#x60; request based on available fields and values for the symbols. &#x60;sf&#x60;&#x3D;VALUE_[filter],[field],[value]   * **VALUE_MINMAX** -  Field value will be within specified interval. ex. - VALUE_MINMAX,BID_1,min,max   * **VALUE_EQUALS** - Field value will equal specified value. ex. - VALUE_EQUALS,BID_1,value   * **VALUE_NOT_EQUALS** - Field value will not equal specified value. ex. - VALUE_NOT_EQUALS,BID_1,value      **Try it Out** - depends on fields used. Example - VALUE_MINMAX,STRIKE_PRICE,120,130   | [optional] 
 **format** | **string**| The format of the output file.&lt;p&gt;**Try it Out** - All formats available&lt;/p&gt; | [optional] [default to XML]
 **serv** | **string**| The Data Service that handles the request for the specified symbols. Available live services are -    * **FDS1** -Production Data Service   * **FDS_FUND** -Fundamental Data Service used for End-of-Day data.  **Try it Out** - use FDS1  | [optional] 
 **reqId** | **string**| Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response.&lt;p&gt; **Try it Out** - any value can be passed through.&lt;/p&gt; | [optional] 

### Return type

[**DFSnapshotResponse**](DFSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, text/csv


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **402** | Invalid HTTP method. Either the method is not POST or GET or exceeds the maximum request length (currently set at 5000 bytes). The description field will indicate the exact reason. |  -  |
| **403** | Invalid HTTP URL. Necessary query parameters are missing in the request. The description field will indicate the exact reason. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postdfsnapshot"></a>
# **PostDFSnapshot**
> DFSnapshotResponse PostDFSnapshot (string ids = null, string oc = null, string fields = null, string sf = null, string format = null, string serv = null, string reqId = null)

Snap exchange data. Use if URL lengh of 2,048 is exceeded.

Request Snapshot exchange data. Use POST when your URL length exceeds 2,048 characters.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using FactSet.SDK.Utils.Authentication;
using Microsoft.IdentityModel.Tokens;
using FactSet.SDK.ExchangeDataFeedSnapshotAPISymbolList.Api;
using FactSet.SDK.ExchangeDataFeedSnapshotAPISymbolList.Client;
using FactSet.SDK.ExchangeDataFeedSnapshotAPISymbolList.Model;

namespace Example
{
    public class PostDFSnapshotExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api-sandbox.factset.com";
            // Configure HTTP basic authorization: FactSetApiKey
            config.Username = "YOUR_USERNAME";
            config.Password = "YOUR_PASSWORD";
            // Configure OAuth2 access token for authorization: FactSetOAuth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            // Configure FactSet Authentication Client to automatically retrieve token for: FactSetOAuth2

            // using path to configuration:
            String pathToConfig = "";   // String contining absolute path to your configuration
            config.OAuth2Client = new ConfidentialClient(pathToConfig);

            // OR

            // If your configuration information is not within a file, you will provide the following information to create a new configuration.
            //   `name` - "Application Name registered with the FactSet Developer Portal",
            //   `clientId` - "Client ID registered with the FactSet Developer Portal",
            //   `clientAuthType` - For confidential client this will be "Confidential",
            //   `owners` - new List<string>() { "Owner ID(s) of this configuration" },
            //   `jwk` - new JsonWebKey(@"{
            //                     'kty': 'RSA',
            //                     'use': 'sig',
            //                     'alg': 'RS256',
            //                     'kid': 'Key ID',
            //                     'd': 'ECC Private Key',
            //                     'n': 'Modulus',
            //                     'e': 'Exponent',
            //                     'p': 'First Prime Factor',
            //                     'q': 'Second Prime Factor',
            //                     'dp': 'First Factor CRT Exponent',
            //                     'dq': 'Second Factor CRT Exponent',
            //                      'qi': 'First CRT Coefficient',
            //           }");

            // `NB`: Within the JWK parameters kty, alg, use, kid, n, e, d, p, q, dp, dq, qi are required for authorization.
            
            var config = new FactSet.SDK.Utils.Authentication.Configuration(name, clientId, clientAuthType, owners, jwk);
            config.OAuth2Client = new ConfidentialClient(config);

            var apiInstance = new SnapshotApi(config);
            var ids = ids_example;  // string | Requested symbols or securities. **Required** if not using `oc`. This is a comma-seperated list with a maximum of 500. Each symbol can be a FactSet Exchange Symbol, CUSIP, or SEDOL. This can be used in combination with `chain` parameter to pull in a custom portfolio.<P>**Try it out** - Choose one or multiple - IBM-USA, BABA-USA, WALMEX-MX, 7203-TKS, VOD-LON, NPN-JSE, MABAX, NZF, SPY-USA, AGG-USA, GLD-USA, AOR-USA, MNA-USA, UUP-USA, SP50-SPX, ESX-STX, XAO-ASX, WD-MSX, NG00-USA, GC00-USA, CC00-USA, C00-USA, FC00-USA, ER00-USA, EURUSD-FX1, USDMXN-FX1, AUDJPY-FX1, EURCZK-FX1, USDILS-FX1, USDZAR-FX1, US10YY-TU1, FDS#190621C00145000-USA, FDS#190621P00145000-USA. *Leave blank if you are trying the `oc` parameter*.</p> (optional) 
            var oc = oc_example;  // string | Option Chain, accepts one underlying symbol for which the option chain will be returned. **Required** if not using `ids`. <p>**Try it Out** - Only available for BABA-USA</p> (optional) 
            var fields = fields_example;  // string | All available fields. This is a comma-seperated list (no spaces). **Required** only when using `oc`. Otherwise, leave blank to return all fields by default. See definitions for details on available field names and Field ID #s. The Data Service Manual has complete reference.<p>**Try it Out** - All fields available. Use either FID # or name. For `oc`, recommend to use BID_1,ASK_1,STRIKE_PRICE. (optional) 
            var sf = sf_example;  // string | Symbol Filters, ability to apply filtering to the result of an option chain `oc` request based on available fields and values for the symbols. `sf`=VALUE_[filter],[field],[value]   * **VALUE_MINMAX** -  Field value will be within specified interval. ex. - VALUE_MINMAX,BID_1,min,max   * **VALUE_EQUALS** - Field value will equal specified value. ex. - VALUE_EQUALS,BID_1,value   * **VALUE_NOT_EQUALS** - Field value will not equal specified value. ex. - VALUE_NOT_EQUALS,BID_1,value      **Try it Out** - depends on fields used. Example - VALUE_MINMAX,STRIKE_PRICE,120,130   (optional) 
            var format = format_example;  // string | The format of the output file.<p>**Try it Out** - All formats available</p> (optional)  (default to XML)
            var serv = serv_example;  // string | The Data Service that handles the request for the specified symbols. Available live services are -    * **FDS1** -Production Data Service   * **FDS_FUND** -Fundamental Data Service used for End-of-Day data.  **Try it Out** - use FDS1  (optional) 
            var reqId = reqId_example;  // string | Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response.<p> **Try it Out** - any value can be passed through.</p> (optional) 

            try
            {
                // Snap exchange data. Use if URL lengh of 2,048 is exceeded.
                DFSnapshotResponse result = apiInstance.PostDFSnapshot(ids, oc, fields, sf, format, serv, reqId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SnapshotApi.PostDFSnapshot: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **string**| Requested symbols or securities. **Required** if not using &#x60;oc&#x60;. This is a comma-seperated list with a maximum of 500. Each symbol can be a FactSet Exchange Symbol, CUSIP, or SEDOL. This can be used in combination with &#x60;chain&#x60; parameter to pull in a custom portfolio.&lt;P&gt;**Try it out** - Choose one or multiple - IBM-USA, BABA-USA, WALMEX-MX, 7203-TKS, VOD-LON, NPN-JSE, MABAX, NZF, SPY-USA, AGG-USA, GLD-USA, AOR-USA, MNA-USA, UUP-USA, SP50-SPX, ESX-STX, XAO-ASX, WD-MSX, NG00-USA, GC00-USA, CC00-USA, C00-USA, FC00-USA, ER00-USA, EURUSD-FX1, USDMXN-FX1, AUDJPY-FX1, EURCZK-FX1, USDILS-FX1, USDZAR-FX1, US10YY-TU1, FDS#190621C00145000-USA, FDS#190621P00145000-USA. *Leave blank if you are trying the &#x60;oc&#x60; parameter*.&lt;/p&gt; | [optional] 
 **oc** | **string**| Option Chain, accepts one underlying symbol for which the option chain will be returned. **Required** if not using &#x60;ids&#x60;. &lt;p&gt;**Try it Out** - Only available for BABA-USA&lt;/p&gt; | [optional] 
 **fields** | **string**| All available fields. This is a comma-seperated list (no spaces). **Required** only when using &#x60;oc&#x60;. Otherwise, leave blank to return all fields by default. See definitions for details on available field names and Field ID #s. The Data Service Manual has complete reference.&lt;p&gt;**Try it Out** - All fields available. Use either FID # or name. For &#x60;oc&#x60;, recommend to use BID_1,ASK_1,STRIKE_PRICE. | [optional] 
 **sf** | **string**| Symbol Filters, ability to apply filtering to the result of an option chain &#x60;oc&#x60; request based on available fields and values for the symbols. &#x60;sf&#x60;&#x3D;VALUE_[filter],[field],[value]   * **VALUE_MINMAX** -  Field value will be within specified interval. ex. - VALUE_MINMAX,BID_1,min,max   * **VALUE_EQUALS** - Field value will equal specified value. ex. - VALUE_EQUALS,BID_1,value   * **VALUE_NOT_EQUALS** - Field value will not equal specified value. ex. - VALUE_NOT_EQUALS,BID_1,value      **Try it Out** - depends on fields used. Example - VALUE_MINMAX,STRIKE_PRICE,120,130   | [optional] 
 **format** | **string**| The format of the output file.&lt;p&gt;**Try it Out** - All formats available&lt;/p&gt; | [optional] [default to XML]
 **serv** | **string**| The Data Service that handles the request for the specified symbols. Available live services are -    * **FDS1** -Production Data Service   * **FDS_FUND** -Fundamental Data Service used for End-of-Day data.  **Try it Out** - use FDS1  | [optional] 
 **reqId** | **string**| Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response.&lt;p&gt; **Try it Out** - any value can be passed through.&lt;/p&gt; | [optional] 

### Return type

[**DFSnapshotResponse**](DFSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, text/csv


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **402** | Invalid HTTP method. Either the method is not POST or GET or exceeds the maximum request length (currently set at 5000 bytes). The description field will indicate the exact reason. |  -  |
| **403** | Invalid HTTP URL. Necessary query parameters are missing in the request. The description field will indicate the exact reason. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

