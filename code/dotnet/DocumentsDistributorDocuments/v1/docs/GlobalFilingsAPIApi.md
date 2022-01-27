# FactSet.SDK.DocumentsDistributorDocuments.Api.GlobalFilingsAPIApi

All URIs are relative to *https://api.factset.com/bulk-documents*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GlobalFilingsV1FormTypesGet**](GlobalFilingsAPIApi.md#globalfilingsv1formtypesget) | **GET** /global-filings/v1/form-types | Retrieve form types for each available Filings Source
[**GlobalFilingsV1ListFilesGet**](GlobalFilingsAPIApi.md#globalfilingsv1listfilesget) | **GET** /global-filings/v1/list-files | Retrieve filings and metadata within FactSet coverage


<a name="globalfilingsv1formtypesget"></a>
# **GlobalFilingsV1FormTypesGet**
> Response GlobalFilingsV1FormTypesGet (string source)

Retrieve form types for each available Filings Source

Gets all available form types for the filings sources. Source parameter can be used to filter the results.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using FactSet.SDK.Utils.Authentication;
using Microsoft.IdentityModel.Tokens;
using FactSet.SDK.DocumentsDistributorDocuments.Api;
using FactSet.SDK.DocumentsDistributorDocuments.Client;
using FactSet.SDK.DocumentsDistributorDocuments.Model;

namespace Example
{
    public class GlobalFilingsV1FormTypesGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.factset.com/bulk-documents";
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

            var apiInstance = new GlobalFilingsAPIApi(config);
            var source = source_example;  // string | This parameter filters the results based on the source of the filings document.

            try
            {
                // Retrieve form types for each available Filings Source
                Response result = apiInstance.GlobalFilingsV1FormTypesGet(source);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling GlobalFilingsAPIApi.GlobalFilingsV1FormTypesGet: " + e.Message );
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
 **source** | **string**| This parameter filters the results based on the source of the filings document. | 

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Form Types data items |  -  |
| **400** | Bad request- invalid or missing parameter |  -  |
| **401** | Authentication Failed |  -  |
| **403** | Entitlements Not Found |  -  |
| **500** | Internal Service Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="globalfilingsv1listfilesget"></a>
# **GlobalFilingsV1ListFilesGet**
> Response GlobalFilingsV1ListFilesGet (string source, int paginationLimit, int paginationOffset, string sort = null, string startDate = null, string endDate = null, string ids = null, string formType = null)

Retrieve filings and metadata within FactSet coverage

Gets the latest 25 filings files. Parameters can be used to filter and narrow down the results

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using FactSet.SDK.Utils.Authentication;
using Microsoft.IdentityModel.Tokens;
using FactSet.SDK.DocumentsDistributorDocuments.Api;
using FactSet.SDK.DocumentsDistributorDocuments.Client;
using FactSet.SDK.DocumentsDistributorDocuments.Model;

namespace Example
{
    public class GlobalFilingsV1ListFilesGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.factset.com/bulk-documents";
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

            var apiInstance = new GlobalFilingsAPIApi(config);
            var source = source_example;  // string | This parameter filters the results based on the source of the filings documents.
            var paginationLimit = 56;  // int | Specifies the maximum number of results to return per result (max. 25)
            var paginationOffset = 56;  // int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
            var sort = sort_example;  // string | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used (optional)  (default to -startDate)
            var startDate = 2020-07-01;  // string | The earliest date the API should fetch for. Dates can be YYYY-MM-DD format (optional) 
            var endDate = 2020-12-01;  // string | The latest date the API should fetch for. Dates can be YYYY-MM-DD format (optional) 
            var ids = AAPL;  // string | This parameter filters the results based on ticker ID. (optional) 
            var formType = 10-Q;  // string | This parameter filters the results based on filings formType. Use the form-types endpoint to view the formTypes available by filings source. (optional) 

            try
            {
                // Retrieve filings and metadata within FactSet coverage
                Response result = apiInstance.GlobalFilingsV1ListFilesGet(source, paginationLimit, paginationOffset, sort, startDate, endDate, ids, formType);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling GlobalFilingsAPIApi.GlobalFilingsV1ListFilesGet: " + e.Message );
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
 **source** | **string**| This parameter filters the results based on the source of the filings documents. | 
 **paginationLimit** | **int**| Specifies the maximum number of results to return per result (max. 25) | 
 **paginationOffset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | 
 **sort** | **string**| Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used | [optional] [default to -startDate]
 **startDate** | **string**| The earliest date the API should fetch for. Dates can be YYYY-MM-DD format | [optional] 
 **endDate** | **string**| The latest date the API should fetch for. Dates can be YYYY-MM-DD format | [optional] 
 **ids** | **string**| This parameter filters the results based on ticker ID. | [optional] 
 **formType** | **string**| This parameter filters the results based on filings formType. Use the form-types endpoint to view the formTypes available by filings source. | [optional] 

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Global Filings data items |  -  |
| **400** | Bad request- invalid or missing parameter |  -  |
| **401** | Authentication Failed |  -  |
| **403** | Entitlements Not Found |  -  |
| **500** | Internal Service Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

