# FactSet.SDK.ProcuretoPayAPISCIM.Api.FirmDescriptionsApi

All URIs are relative to *https://api.factset.com/scim/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**FirmDescriptionsGet**](FirmDescriptionsApi.md#firmdescriptionsget) | **GET** /FirmDescriptions | Get a list of firm descriptions.
[**FirmDescriptionsIdGet**](FirmDescriptionsApi.md#firmdescriptionsidget) | **GET** /FirmDescriptions/{id} | Get a firm description.



<a name="firmdescriptionsget"></a>
# **FirmDescriptionsGet**
> FirmDescriptionResourceList FirmDescriptionsGet (string filter = null, int? startIndex = null, int? count = null, string attributes = null, string excludedAttributes = null)

Get a list of firm descriptions.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProcuretoPayAPISCIM.Api;
using FactSet.SDK.ProcuretoPayAPISCIM.Client;
using FactSet.SDK.ProcuretoPayAPISCIM.Model;

namespace Example
{
    public class FirmDescriptionsGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ProcuretoPayAPISCIM.Client.Configuration();

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

            var apiInstance = new FirmDescriptionsApi(config);

            var filter = "filter_example";  // string | Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \"re\" operator for regular expression matching against strings. (optional) 
            var startIndex = 56;  // int? | Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional) 
            var count = 56;  // int? | Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional) 
            var attributes = "attributes_example";  // string | Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter. (optional) 
            var excludedAttributes = "excludedAttributes_example";  // string | Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter. (optional) 

            try
            {
                // Get a list of firm descriptions.
                FirmDescriptionResourceList result = apiInstance.FirmDescriptionsGet(filter, startIndex, count, attributes, excludedAttributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FirmDescriptionsApi.FirmDescriptionsGet: " + e.Message );
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
 **filter** | **string**| Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \&quot;re\&quot; operator for regular expression matching against strings. | [optional] 
 **startIndex** | **int?**| Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. | [optional] 
 **count** | **int?**| Maximum resource count. The server will not return more resources than this value, although it may return fewer. | [optional] 
 **attributes** | **string**| Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter. | [optional] 
 **excludedAttributes** | **string**| Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter. | [optional] 

### Return type
[**FirmDescriptionResourceList**](FirmDescriptionResourceList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Invalid filter value provided. |  -  |
| **401** | User has not been authenticated. |  -  |
| **403** | User is not authorized to use this API. |  -  |
| **500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="firmdescriptionsidget"></a>
# **FirmDescriptionsIdGet**
> FirmDescriptionResource FirmDescriptionsIdGet (string id)

Get a firm description.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProcuretoPayAPISCIM.Api;
using FactSet.SDK.ProcuretoPayAPISCIM.Client;
using FactSet.SDK.ProcuretoPayAPISCIM.Model;

namespace Example
{
    public class FirmDescriptionsIdGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ProcuretoPayAPISCIM.Client.Configuration();

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

            var apiInstance = new FirmDescriptionsApi(config);

            var id = "id_example";  // string | ID of resource.

            try
            {
                // Get a firm description.
                FirmDescriptionResource result = apiInstance.FirmDescriptionsIdGet(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FirmDescriptionsApi.FirmDescriptionsIdGet: " + e.Message );
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
 **id** | **string**| ID of resource. | 

### Return type
[**FirmDescriptionResource**](FirmDescriptionResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **401** | User has not been authenticated. |  -  |
| **403** | User is not authorized to use this API. |  -  |
| **404** | Firm description not found. |  -  |
| **500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


