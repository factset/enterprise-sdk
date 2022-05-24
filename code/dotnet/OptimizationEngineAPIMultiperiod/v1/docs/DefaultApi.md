# FactSet.SDK.OptimizationEngineAPIMultiperiod.Api.DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MpoV1OptimizeFPOPost**](DefaultApi.md#mpov1optimizefpopost) | **POST** /mpo/v1/optimizeFPO | 


<a name="mpov1optimizefpopost"></a>
# **MpoV1OptimizeFPOPost**
> OptimizerOutputsMultiPeriodOutput MpoV1OptimizeFPOPost (OptimizerInputsMultiPeriodInput multiPeriodInput = null)



### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OptimizationEngineAPIMultiperiod.Api;
using FactSet.SDK.OptimizationEngineAPIMultiperiod.Client;
using FactSet.SDK.OptimizationEngineAPIMultiperiod.Model;

namespace Example
{
    public class MpoV1OptimizeFPOPostExample
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

            var apiInstance = new DefaultApi(config);
            var multiPeriodInput = new OptimizerInputsMultiPeriodInput(); // OptimizerInputsMultiPeriodInput | Multiperiod protobuf input (optional) 

            try
            {
                OptimizerOutputsMultiPeriodOutput result = apiInstance.MpoV1OptimizeFPOPost(multiPeriodInput);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DefaultApi.MpoV1OptimizeFPOPost: " + e.Message );
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
 **multiPeriodInput** | [**OptimizerInputsMultiPeriodInput**](OptimizerInputsMultiPeriodInput.md)| Multiperiod protobuf input | [optional] 

### Return type
[**OptimizerOutputsMultiPeriodOutput**](OptimizerOutputsMultiPeriodOutput.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/x-protobuf
 - **Accept**: application/x-protobuf


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Multiperiod protobuf output |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

