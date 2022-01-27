# FactSet.SDK.IDLookup.Api.FactSetIDLookupApi

All URIs are relative to *https://api.factset.com/idsearch*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SearchCompanyname**](FactSetIDLookupApi.md#searchcompanyname) | **POST** /v1/idsearch | Search funtionality to return tickers, company names and unique identifiers for FactSet data


<a name="searchcompanyname"></a>
# **SearchCompanyname**
> LookupResponse SearchCompanyname (LookupRequest lookupRequest)

Search funtionality to return tickers, company names and unique identifiers for FactSet data

Service will accept request in JSON formatted request body. The request is sent by passing a query which is an array conitaining search query objects with parameters. The parameters contain search term and filters defined by the end user. This would display a specific set of identifiers based on the request. 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using FactSet.SDK.Utils.Authentication;
using Microsoft.IdentityModel.Tokens;
using FactSet.SDK.IDLookup.Api;
using FactSet.SDK.IDLookup.Client;
using FactSet.SDK.IDLookup.Model;

namespace Example
{
    public class SearchCompanynameExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.factset.com/idsearch";
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

            var apiInstance = new FactSetIDLookupApi(config);
            var lookupRequest = new LookupRequest(); // LookupRequest | Post body to lookup any FactSet identifiers

            try
            {
                // Search funtionality to return tickers, company names and unique identifiers for FactSet data
                LookupResponse result = apiInstance.SearchCompanyname(lookupRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling FactSetIDLookupApi.SearchCompanyname: " + e.Message );
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
 **lookupRequest** | [**LookupRequest**](LookupRequest.md)| Post body to lookup any FactSet identifiers | 

### Return type

[**LookupResponse**](LookupResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of securities |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication issue |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

