# FactSet.SDK.FactSetConcordance.Api.PeopleMappingApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetPeopleMappingDeleteForList**](PeopleMappingApi.md#getpeoplemappingdeleteforlist) | **POST** /factset-concordance/v2/people-mapping-delete | Deletes mapping specified by the client.
[**GetPeopleMappingForList**](PeopleMappingApi.md#getpeoplemappingforlist) | **POST** /factset-concordance/v2/people-mapping | Saves a single-mapping specified by the client.
[**GetPeopleUniverse**](PeopleMappingApi.md#getpeopleuniverse) | **GET** /factset-concordance/v2/people-universe | Retrieve all saved mappings within a requested universe
[**GetPeopleUniverseForList**](PeopleMappingApi.md#getpeopleuniverseforlist) | **POST** /factset-concordance/v2/people-universe | Retrieve all saved mappings within a requested universe or large list of client ids



<a name="getpeoplemappingdeleteforlist"></a>
# **GetPeopleMappingDeleteForList**
> PeopleMappingDeleteResponse GetPeopleMappingDeleteForList (EntityMappingDeleteRequest entityMappingDeleteRequest)

Deletes mapping specified by the client.

Delete a Concordance Mapping to the client universe. When making a post, all exiting values are overwritten in the database with the values passed in the request. clientId and universeId are required. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetConcordance.Api;
using FactSet.SDK.FactSetConcordance.Client;
using FactSet.SDK.FactSetConcordance.Model;

namespace Example
{
    public class GetPeopleMappingDeleteForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetConcordance.Client.Configuration();

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

            var apiInstance = new PeopleMappingApi(config);

            var entityMappingDeleteRequest = new EntityMappingDeleteRequest(); // EntityMappingDeleteRequest | A request to delete people mappings specified by the client

            try
            {
                // Deletes mapping specified by the client.
                PeopleMappingDeleteResponse result = apiInstance.GetPeopleMappingDeleteForList(entityMappingDeleteRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PeopleMappingApi.GetPeopleMappingDeleteForList: " + e.Message );
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
 **entityMappingDeleteRequest** | [**EntityMappingDeleteRequest**](EntityMappingDeleteRequest.md)| A request to delete people mappings specified by the client | 

### Return type
[**PeopleMappingDeleteResponse**](PeopleMappingDeleteResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response object for the people-mapping-delete endpoint |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getpeoplemappingforlist"></a>
# **GetPeopleMappingForList**
> PeopleMappingResponse GetPeopleMappingForList (PeopleMappingRequest peopleMappingRequest)

Saves a single-mapping specified by the client.

Saves a single Concordance People Mapping to a given universe. When making a post, all exiting values are overwritten in the database with the values passed in the request. clientId and clientName are required. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetConcordance.Api;
using FactSet.SDK.FactSetConcordance.Client;
using FactSet.SDK.FactSetConcordance.Model;

namespace Example
{
    public class GetPeopleMappingForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetConcordance.Client.Configuration();

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

            var apiInstance = new PeopleMappingApi(config);

            var peopleMappingRequest = new PeopleMappingRequest(); // PeopleMappingRequest | A request to create a single mapping.

            try
            {
                // Saves a single-mapping specified by the client.
                PeopleMappingResponse result = apiInstance.GetPeopleMappingForList(peopleMappingRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PeopleMappingApi.GetPeopleMappingForList: " + e.Message );
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
 **peopleMappingRequest** | [**PeopleMappingRequest**](PeopleMappingRequest.md)| A request to create a single mapping. | 

### Return type
[**PeopleMappingResponse**](PeopleMappingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Single people mapping |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getpeopleuniverse"></a>
# **GetPeopleUniverse**
> PeopleUniverseResponse GetPeopleUniverse (int universeId, List<string> clientId = null, List<string> mapStatus = null, int? offset = null, int? limit = null, List<string> sort = null)

Retrieve all saved mappings within a requested universe

Retrieves all people mappings within a requested universe. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetConcordance.Api;
using FactSet.SDK.FactSetConcordance.Client;
using FactSet.SDK.FactSetConcordance.Model;

namespace Example
{
    public class GetPeopleUniverseExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetConcordance.Client.Configuration();

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

            var apiInstance = new PeopleMappingApi(config);

            var universeId = 1;  // int | Universe identifier. *To create a universe, use the `/universe' endpoint.*
            var clientId = new List<string>(); // List<string> | Filter by the clientId(s) created by the user in a previous mapping.  (optional) 
            var mapStatus = new List<string>(); // List<string> | Filter by the Entity Decisions that have the specified mapStatus, where -   * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name was unable to make a mapping.  (optional) 
            var offset = 0;  // int? | Starting row for records to return or rows to skip. (optional)  (default to 0)
            var limit = 10;  // int? | Limits the number of records in the response. (optional) 
            var sort = new List<string>(); // List<string> | Sort clientId, createdTime, updatedTime, clientPersonName, personId fields in ascending or descending order with asc and desc to indicate the order. Example (clientId:asc) (optional) 

            try
            {
                // Retrieve all saved mappings within a requested universe
                PeopleUniverseResponse result = apiInstance.GetPeopleUniverse(universeId, clientId, mapStatus, offset, limit, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PeopleMappingApi.GetPeopleUniverse: " + e.Message );
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
 **universeId** | **int**| Universe identifier. *To create a universe, use the &#x60;/universe&#39; endpoint.* | 
 **clientId** | [**List&lt;string&gt;**](string.md)| Filter by the clientId(s) created by the user in a previous mapping.  | [optional] 
 **mapStatus** | [**List&lt;string&gt;**](string.md)| Filter by the Entity Decisions that have the specified mapStatus, where -   * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name was unable to make a mapping.  | [optional] 
 **offset** | **int?**| Starting row for records to return or rows to skip. | [optional] [default to 0]
 **limit** | **int?**| Limits the number of records in the response. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sort clientId, createdTime, updatedTime, clientPersonName, personId fields in ascending or descending order with asc and desc to indicate the order. Example (clientId:asc) | [optional] 

### Return type
[**PeopleUniverseResponse**](PeopleUniverseResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response object for FactSet Concordance Universe detail. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getpeopleuniverseforlist"></a>
# **GetPeopleUniverseForList**
> PeopleUniverseResponse GetPeopleUniverseForList (PeopleUniverseRequest peopleUniverseRequest)

Retrieve all saved mappings within a requested universe or large list of client ids

Retrieves all people mappings that were saved in a given universe. Supports filtering by a large number of `clientId`s 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetConcordance.Api;
using FactSet.SDK.FactSetConcordance.Client;
using FactSet.SDK.FactSetConcordance.Model;

namespace Example
{
    public class GetPeopleUniverseForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetConcordance.Client.Configuration();

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

            var apiInstance = new PeopleMappingApi(config);

            var peopleUniverseRequest = new PeopleUniverseRequest(); // PeopleUniverseRequest | A request to fetch all entities of a given universe

            try
            {
                // Retrieve all saved mappings within a requested universe or large list of client ids
                PeopleUniverseResponse result = apiInstance.GetPeopleUniverseForList(peopleUniverseRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PeopleMappingApi.GetPeopleUniverseForList: " + e.Message );
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
 **peopleUniverseRequest** | [**PeopleUniverseRequest**](PeopleUniverseRequest.md)| A request to fetch all entities of a given universe | 

### Return type
[**PeopleUniverseResponse**](PeopleUniverseResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response object for FactSet Concordance Universe detail. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


