# FactSet.SDK.Vermilion.Api.EntityApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetEntityValuesByCode**](EntityApi.md#getentityvaluesbycode) | **GET** /v1/{tenant}/entities/{entityCode}/values | Gets the entity values



<a name="getentityvaluesbycode"></a>
# **GetEntityValuesByCode**
> EntityFieldValueDTO GetEntityValuesByCode (string tenant, string entityCode, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null, int? showAll = null)

Gets the entity values

Gets the entity values for the specified entity

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class GetEntityValuesByCodeExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Vermilion.Client.Configuration();

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

            var apiInstance = new EntityApi(config);

            var tenant = "TENANT";  // string | The code of the tenancy
            var entityCode = "ENTCODE";  // string | The code of the entity
            var sort = new List<string>(); // List<string> | The entity field to sort on. Can only be sorted on entity key, description or secondary key fields. Append \"-\" to sort in descending order. If no parameter given, it will be sorted by key field in ascending order by default (optional) 
            var paginationLimit = 25;  // int? | Non-negative maximum number of entries to return. Default is 25 (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Non-negative number of entries to skip. Default is 0 (optional)  (default to 0)
            var showAll = 0;  // int? | Whether to show all field values for each entity row. Value should either be 1 or 0. Default is 0 (false). Otherwise, show all field values in a JSON array named \"fieldsWithValues\", with each array value being a string in the format of \"**<FIELD_NAME> : <FIELD_VALUE>**\". Both key and description field values will be included in this JSON array too. (optional)  (default to 0)

            try
            {
                // Gets the entity values
                EntityFieldValueDTO result = apiInstance.GetEntityValuesByCode(tenant, entityCode, sort, paginationLimit, paginationOffset, showAll);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EntityApi.GetEntityValuesByCode: " + e.Message );
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
 **tenant** | **string**| The code of the tenancy | 
 **entityCode** | **string**| The code of the entity | 
 **sort** | [**List&lt;string&gt;**](string.md)| The entity field to sort on. Can only be sorted on entity key, description or secondary key fields. Append \&quot;-\&quot; to sort in descending order. If no parameter given, it will be sorted by key field in ascending order by default | [optional] 
 **paginationLimit** | **int?**| Non-negative maximum number of entries to return. Default is 25 | [optional] [default to 25]
 **paginationOffset** | **int?**| Non-negative number of entries to skip. Default is 0 | [optional] [default to 0]
 **showAll** | **int?**| Whether to show all field values for each entity row. Value should either be 1 or 0. Default is 0 (false). Otherwise, show all field values in a JSON array named \&quot;fieldsWithValues\&quot;, with each array value being a string in the format of \&quot;**&lt;FIELD_NAME&gt; : &lt;FIELD_VALUE&gt;**\&quot;. Both key and description field values will be included in this JSON array too. | [optional] [default to 0]

### Return type
[**EntityFieldValueDTO**](EntityFieldValueDTO.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | The supplied entity code was either missing or invalid, or the entity was not found |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view datasources in VRS |  -  |
| **404** | The supplied entity code was not found |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


