# FactSet.SDK.AnalyticsDatastore.Api.ObjectsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCargoEndpoint**](ObjectsApi.md#getcargoendpoint) | **GET** /analytics/pub-datastore/cargo/v1/groups/{groupId}/objects/{objectId} | Gets an object given an ID. In this case ID retrieved from mapping Location header, object data in response body.



<a name="getcargoendpoint"></a>
# **GetCargoEndpoint**
> void GetCargoEndpoint (string groupId, string objectId)

Gets an object given an ID. In this case ID retrieved from mapping Location header, object data in response body.

Raw object data can be found in the response body. This can be either the mapped PDF/PPT or STACH json, depending on the mapping. https://pages.github.factset.com/analytics-reporting/stachschema/#/    Optional request header \"accept-encoding\", with allowed values of \"br\" and \"gzip\". If accept-encoding is passed, the response is compressed.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.AnalyticsDatastore.Api;
using FactSet.SDK.AnalyticsDatastore.Client;
using FactSet.SDK.AnalyticsDatastore.Model;

namespace Example
{
    public class GetCargoEndpointExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.AnalyticsDatastore.Client.Configuration();

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

            var apiInstance = new ObjectsApi(config);

            var groupId = "a4186c50f8e74f979d271dd22298c901";  // string | The ID of the group
            var objectId = "fe875bc4150542dea6bc237663a01a0d";  // string | The ID of the object

            try
            {
                // Gets an object given an ID. In this case ID retrieved from mapping Location header, object data in response body.
                apiInstance.GetCargoEndpoint(groupId, objectId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ObjectsApi.GetCargoEndpoint: " + e.Message );
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
 **groupId** | **string**| The ID of the group | 
 **objectId** | **string**| The ID of the object | 

### Return type
void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response, returns json response body of the report. |  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  * Content-Encoding - Standard HTTP header. Header value based on Accept-Encoding Request header. <br>  * Content-Type - Standard HTTP header. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


