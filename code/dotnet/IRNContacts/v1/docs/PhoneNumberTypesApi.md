# FactSet.SDK.IRNContacts.Api.PhoneNumberTypesApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1PhoneNumberTypesGet**](PhoneNumberTypesApi.md#v1phonenumbertypesget) | **GET** /v1/phone-number-types | Get list of the phone types configured in your group
[**V1PhoneNumberTypesPhoneNumberTypeIdDelete**](PhoneNumberTypesApi.md#v1phonenumbertypesphonenumbertypeiddelete) | **DELETE** /v1/phone-number-types/{phoneNumberTypeId} | Delete a phone type
[**V1PhoneNumberTypesPhoneNumberTypeIdPut**](PhoneNumberTypesApi.md#v1phonenumbertypesphonenumbertypeidput) | **PUT** /v1/phone-number-types/{phoneNumberTypeId} | Edit a phone type
[**V1PhoneNumberTypesPost**](PhoneNumberTypesApi.md#v1phonenumbertypespost) | **POST** /v1/phone-number-types | Create a phone type


<a name="v1phonenumbertypesget"></a>
# **V1PhoneNumberTypesGet**
> List&lt;PhoneNumberTypeDto&gt; V1PhoneNumberTypesGet ()

Get list of the phone types configured in your group

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNContacts.Api;
using FactSet.SDK.IRNContacts.Client;
using FactSet.SDK.IRNContacts.Model;

namespace Example
{
    public class V1PhoneNumberTypesGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new PhoneNumberTypesApi(config);

            try
            {
                // Get list of the phone types configured in your group
                List<PhoneNumberTypeDto> result = apiInstance.V1PhoneNumberTypesGet();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PhoneNumberTypesApi.V1PhoneNumberTypesGet: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PhoneNumberTypeDto&gt;**](PhoneNumberTypeDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1phonenumbertypesphonenumbertypeiddelete"></a>
# **V1PhoneNumberTypesPhoneNumberTypeIdDelete**
> void V1PhoneNumberTypesPhoneNumberTypeIdDelete (Guid phoneNumberTypeId)

Delete a phone type

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNContacts.Api;
using FactSet.SDK.IRNContacts.Client;
using FactSet.SDK.IRNContacts.Model;

namespace Example
{
    public class V1PhoneNumberTypesPhoneNumberTypeIdDeleteExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new PhoneNumberTypesApi(config);
            var phoneNumberTypeId = 38400000-8cf0-11bd-b23e-10b96e4ef00d;  // Guid | phoneNumberTypeId for deleting associated record

            try
            {
                // Delete a phone type
                apiInstance.V1PhoneNumberTypesPhoneNumberTypeIdDelete(phoneNumberTypeId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PhoneNumberTypesApi.V1PhoneNumberTypesPhoneNumberTypeIdDelete: " + e.Message );
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
 **phoneNumberTypeId** | **Guid**| phoneNumberTypeId for deleting associated record | 

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1phonenumbertypesphonenumbertypeidput"></a>
# **V1PhoneNumberTypesPhoneNumberTypeIdPut**
> void V1PhoneNumberTypesPhoneNumberTypeIdPut (Guid phoneNumberTypeId, string body)

Edit a phone type

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNContacts.Api;
using FactSet.SDK.IRNContacts.Client;
using FactSet.SDK.IRNContacts.Model;

namespace Example
{
    public class V1PhoneNumberTypesPhoneNumberTypeIdPutExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new PhoneNumberTypesApi(config);
            var phoneNumberTypeId = 38400000-8cf0-11bd-b23e-10b96e4ef00d;  // Guid | phoneNumberTypeId to update associated record
            var body = body_example;  // string | Update with phoneNumberType

            try
            {
                // Edit a phone type
                apiInstance.V1PhoneNumberTypesPhoneNumberTypeIdPut(phoneNumberTypeId, body);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PhoneNumberTypesApi.V1PhoneNumberTypesPhoneNumberTypeIdPut: " + e.Message );
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
 **phoneNumberTypeId** | **Guid**| phoneNumberTypeId to update associated record | 
 **body** | **string**| Update with phoneNumberType | 

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1phonenumbertypespost"></a>
# **V1PhoneNumberTypesPost**
> Guid V1PhoneNumberTypesPost (string body)

Create a phone type

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNContacts.Api;
using FactSet.SDK.IRNContacts.Client;
using FactSet.SDK.IRNContacts.Model;

namespace Example
{
    public class V1PhoneNumberTypesPostExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new PhoneNumberTypesApi(config);
            var body = body_example;  // string | To add phoneNumberType

            try
            {
                // Create a phone type
                Guid result = apiInstance.V1PhoneNumberTypesPost(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PhoneNumberTypesApi.V1PhoneNumberTypesPost: " + e.Message );
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
 **body** | **string**| To add phoneNumberType | 

### Return type

**Guid**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **400** | Bad Request |  -  |
| **0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

