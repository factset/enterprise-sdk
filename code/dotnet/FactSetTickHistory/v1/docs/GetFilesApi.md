# FactSet.SDK.FactSetTickHistory.Api.GetFilesApi

All URIs are relative to *https://api-sandbox.factset.com/bulk-documents/tickhistory*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1GetFilesGet**](GetFilesApi.md#v1getfilesget) | **GET** /v1/get-files | Returns the files from tickhistory endpoint for the specified date range


<a name="v1getfilesget"></a>
# **V1GetFilesGet**
> GetFilesResponse V1GetFilesGet (string requestId, int? paginationLimit = null, int? paginationOffset = null)

Returns the files from tickhistory endpoint for the specified date range

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using FactSet.SDK.Utils.Authentication;
using Microsoft.IdentityModel.Tokens;
using FactSet.SDK.FactSetTickHistory.Api;
using FactSet.SDK.FactSetTickHistory.Client;
using FactSet.SDK.FactSetTickHistory.Model;

namespace Example
{
    public class V1GetFilesGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api-sandbox.factset.com/bulk-documents/tickhistory";
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

            var apiInstance = new GetFilesApi(config);
            var requestId = requestId_example;  // string | RequestId returned by request-files endpoint to poll and collect results of the query
            var paginationLimit = 56;  // int? | Specifies the maximum number of results to return per response page (optional)  (default to 20)
            var paginationOffset = 56;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)  (default to 0)

            try
            {
                // Returns the files from tickhistory endpoint for the specified date range
                GetFilesResponse result = apiInstance.V1GetFilesGet(requestId, paginationLimit, paginationOffset);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling GetFilesApi.V1GetFilesGet: " + e.Message );
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
 **requestId** | **string**| RequestId returned by request-files endpoint to poll and collect results of the query | 
 **paginationLimit** | **int?**| Specifies the maximum number of results to return per response page | [optional] [default to 20]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional] [default to 0]

### Return type

[**GetFilesResponse**](GetFilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success&lt;/p&gt; **To download the output file copy the response url in a browser** |  -  |
| **400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

