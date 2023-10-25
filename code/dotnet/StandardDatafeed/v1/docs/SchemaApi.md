# FactSet.SDK.StandardDatafeed.Api.SchemaApi

All URIs are relative to *https://api.factset.com/bulk-documents/sdf/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetV1ListSchemas**](SchemaApi.md#getv1listschemas) | **GET** /list-schemas | schemas



<a name="getv1listschemas"></a>
# **GetV1ListSchemas**
> ListSchemas GetV1ListSchemas (string schema = null, int? sequence = null)

schemas

<a href=https://api.factset.com/bulk-documents/sdf/v1/list-schemas>List-Schemas</a> helper end point provides the list of schemas subscribed by the client and their corresponding sequences if no query parameters are passed in the request.   If schema & sequence number (version number of schema) are passed in the request, this endpoint provides a downloadable presigned url containing the schema information.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StandardDatafeed.Api;
using FactSet.SDK.StandardDatafeed.Client;
using FactSet.SDK.StandardDatafeed.Model;

namespace Example
{
    public class GetV1ListSchemasExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StandardDatafeed.Client.Configuration();

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

            var apiInstance = new SchemaApi(config);

            var schema = "schema_example";  // string | schema name</p> </p> **Example: acta_v1, fgp_v1, yn_v1**  QFL:- To query QFL data, please use value:   **qfl_v1**  (optional) 
            var sequence = 56;  // int? | Version number of a schema  Please enter the sequence number associated with the schema passed in the request **Example: \"8\" from acta_v1: [8],**  QFL:- Enter the sequence number associated with the qfl schema   **Note:** Please pass sequence parameter only while passing the schema parameter in the request (optional) 

            try
            {
                // schemas
                ListSchemas result = apiInstance.GetV1ListSchemas(schema, sequence);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SchemaApi.GetV1ListSchemas: " + e.Message );
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
 **schema** | **string**| schema name&lt;/p&gt; &lt;/p&gt; **Example: acta_v1, fgp_v1, yn_v1**  QFL:- To query QFL data, please use value:   **qfl_v1**  | [optional] 
 **sequence** | **int?**| Version number of a schema  Please enter the sequence number associated with the schema passed in the request **Example: \&quot;8\&quot; from acta_v1: [8],**  QFL:- Enter the sequence number associated with the qfl schema   **Note:** Please pass sequence parameter only while passing the schema parameter in the request | [optional] 

### Return type
[**ListSchemas**](ListSchemas.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


