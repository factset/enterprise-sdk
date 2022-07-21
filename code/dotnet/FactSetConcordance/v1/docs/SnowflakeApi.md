# FactSet.SDK.FactSetConcordance.Api.SnowflakeApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetSnowflakeEntityMatch**](SnowflakeApi.md#getsnowflakeentitymatch) | **GET** /factset-concordance/v1/snowflake-entity-match | Perform an entity match and return a snowflake-friendly response. 1 Name per request.
[**GetSnowflakeEntityMatchForList**](SnowflakeApi.md#getsnowflakeentitymatchforlist) | **POST** /factset-concordance/v1/snowflake-entity-match | Perform an entity search and return a snowflake-friendly response. Up to 25 Names per request.


<a name="getsnowflakeentitymatch"></a>
# **GetSnowflakeEntityMatch**
> SnowflakeEntityMatchResponse GetSnowflakeEntityMatch (string name, string country = null, string state = null, string url = null)

Perform an entity match and return a snowflake-friendly response. 1 Name per request.

Finds the best candidate entities matching the given entity name. Additional attributes can be supplied to narrow the search. *This endpoint is used natively within Snowflake and is not to be consumed directly by users. Reach out to your FactSet Account team to learn more about Concordance in Snowflake.* 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetConcordance.Api;
using FactSet.SDK.FactSetConcordance.Client;
using FactSet.SDK.FactSetConcordance.Model;

namespace Example
{
    public class GetSnowflakeEntityMatchExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetConcordance.Client.Configuration();

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

            var apiInstance = new SnowflakeApi(config);

            var name = FactSet;  // string | Name of Entity to match.
            var country = US;  // string | ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). (optional) 
            var state = CT;  // string | Two-character state code corresponding to the entity name that is used when evaluating candidates for a match. Currently, only US state codes are supported. (optional) 
            var url = "url_example";  // string | URL corresponding to the entity name that is used when evaluating candidates for a match. (optional) 

            try
            {
                // Perform an entity match and return a snowflake-friendly response. 1 Name per request.
                SnowflakeEntityMatchResponse result = apiInstance.GetSnowflakeEntityMatch(name, country, state, url);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SnowflakeApi.GetSnowflakeEntityMatch: " + e.Message );
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
 **name** | **string**| Name of Entity to match. | 
 **country** | **string**| ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). | [optional] 
 **state** | **string**| Two-character state code corresponding to the entity name that is used when evaluating candidates for a match. Currently, only US state codes are supported. | [optional] 
 **url** | **string**| URL corresponding to the entity name that is used when evaluating candidates for a match. | [optional] 

### Return type
[**SnowflakeEntityMatchResponse**](SnowflakeEntityMatchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response object for the entity-match object in a snowflake friendly response model. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getsnowflakeentitymatchforlist"></a>
# **GetSnowflakeEntityMatchForList**
> SnowflakeEntityMatchResponse GetSnowflakeEntityMatchForList (SnowflakeEntityMatchRequest snowflakeEntityMatchRequest)

Perform an entity search and return a snowflake-friendly response. Up to 25 Names per request.

Finds the best candidate entities matching the given company name. Additional attributes can be supplied to narrow the search. *This endpoint is used natively within Snowflake and is not to be consumed directly by users. Reach out to your FactSet Account team to learn more about Concordance in Snowflake.* 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetConcordance.Api;
using FactSet.SDK.FactSetConcordance.Client;
using FactSet.SDK.FactSetConcordance.Model;

namespace Example
{
    public class GetSnowflakeEntityMatchForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetConcordance.Client.Configuration();

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

            var apiInstance = new SnowflakeApi(config);

            var snowflakeEntityMatchRequest = new SnowflakeEntityMatchRequest(); // SnowflakeEntityMatchRequest | A request to match an entity name and its attributes within Snowflake.

            try
            {
                // Perform an entity search and return a snowflake-friendly response. Up to 25 Names per request.
                SnowflakeEntityMatchResponse result = apiInstance.GetSnowflakeEntityMatchForList(snowflakeEntityMatchRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SnowflakeApi.GetSnowflakeEntityMatchForList: " + e.Message );
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
 **snowflakeEntityMatchRequest** | [**SnowflakeEntityMatchRequest**](SnowflakeEntityMatchRequest.md)| A request to match an entity name and its attributes within Snowflake. | 

### Return type
[**SnowflakeEntityMatchResponse**](SnowflakeEntityMatchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response object for the entity-match object in a snowflake friendly response model. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

