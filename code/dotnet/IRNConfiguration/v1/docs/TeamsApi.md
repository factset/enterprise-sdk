# FactSet.SDK.IRNConfiguration.Api.TeamsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1TeamsGet**](TeamsApi.md#v1teamsget) | **GET** /v1/teams | Get all Teams
[**V1TeamsTeamIdGet**](TeamsApi.md#v1teamsteamidget) | **GET** /v1/teams/{teamId} | Get Team details for the given Id provided


<a name="v1teamsget"></a>
# **V1TeamsGet**
> List&lt;TeamSummaryDto&gt; V1TeamsGet (bool? xIRNIgnorePermissions = null)

Get all Teams

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNConfiguration.Api;
using FactSet.SDK.IRNConfiguration.Client;
using FactSet.SDK.IRNConfiguration.Model;

namespace Example
{
    public class V1TeamsGetExample
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

            var apiInstance = new TeamsApi(config);
            var xIRNIgnorePermissions = true;  // bool? |  (optional)  (default to false)

            try
            {
                // Get all Teams
                List<TeamSummaryDto> result = apiInstance.V1TeamsGet(xIRNIgnorePermissions);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling TeamsApi.V1TeamsGet: " + e.Message );
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
 **xIRNIgnorePermissions** | **bool?**|  | [optional] [default to false]

### Return type

[**List&lt;TeamSummaryDto&gt;**](TeamSummaryDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1teamsteamidget"></a>
# **V1TeamsTeamIdGet**
> TeamConfigDto V1TeamsTeamIdGet (Guid teamId, bool? xIRNIgnorePermissions = null)

Get Team details for the given Id provided

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNConfiguration.Api;
using FactSet.SDK.IRNConfiguration.Client;
using FactSet.SDK.IRNConfiguration.Model;

namespace Example
{
    public class V1TeamsTeamIdGetExample
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

            var apiInstance = new TeamsApi(config);
            var teamId = 38400000-8cf0-11bd-b23e-10b96e4ef00d;  // Guid | Id
            var xIRNIgnorePermissions = true;  // bool? |  (optional)  (default to false)

            try
            {
                // Get Team details for the given Id provided
                TeamConfigDto result = apiInstance.V1TeamsTeamIdGet(teamId, xIRNIgnorePermissions);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling TeamsApi.V1TeamsTeamIdGet: " + e.Message );
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
 **teamId** | **Guid**| Id | 
 **xIRNIgnorePermissions** | **bool?**|  | [optional] [default to false]

### Return type

[**TeamConfigDto**](TeamConfigDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

