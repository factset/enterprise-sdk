# FactSet.SDK.FactSetOptions.Api.SnapshotApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetOptionsSnapshotForList**](SnapshotApi.md#getoptionssnapshotforlist) | **POST** /factset-options/v1/snapshot | Returns all the profile information for the list of identifiers as of a specific date


<a name="getoptionssnapshotforlist"></a>
# **GetOptionsSnapshotForList**
> SnapshotResponse GetOptionsSnapshotForList (SnapshotRequest snapshotRequest)

Returns all the profile information for the list of identifiers as of a specific date

Returns all the profile information for the list of identifiers for a specific date. The data includes -  * Expiration Date * Greek - Delta * Implied Volatility * Price  * Style * Type * Underlying Security * Underlying Security Price * Open Interest * Name    *Currently only OPRA Exchange is supproted with exchange ISO \"USA\"* 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetOptions.Api;
using FactSet.SDK.FactSetOptions.Client;
using FactSet.SDK.FactSetOptions.Model;

namespace Example
{
    public class GetOptionsSnapshotForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetOptions.Client.Configuration();

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

            var apiInstance = new SnapshotApi(config);

            var snapshotRequest = new SnapshotRequest(); // SnapshotRequest | Snapshot Request Object

            try
            {
                // Returns all the profile information for the list of identifiers as of a specific date
                SnapshotResponse result = apiInstance.GetOptionsSnapshotForList(snapshotRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SnapshotApi.GetOptionsSnapshotForList: " + e.Message );
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
 **snapshotRequest** | [**SnapshotRequest**](SnapshotRequest.md)| Snapshot Request Object | 

### Return type
[**SnapshotResponse**](SnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Snapshot Response Object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

