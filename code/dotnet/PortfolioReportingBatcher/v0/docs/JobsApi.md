# FactSet.SDK.PortfolioReportingBatcher.Api.JobsApi

All URIs are relative to *https://api.factset.com/analytics/prb/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDetailsForJob**](JobsApi.md#getdetailsforjob) | **GET** /jobs/{type}/{name} | Get details for the given PRB job



<a name="getdetailsforjob"></a>
# **GetDetailsForJob**
> JobDetailsResponse GetDetailsForJob (JobTypes type, string name, List<string> attribute = null)

Get details for the given PRB job

Use this endpoint to fetch the documents, tasks, accounts, and/or runs for the PRB job given in the path. Please note jobs with type PD will not return tasks nor accounts so this will be ignored if given as part of the array of attributes in the request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.PortfolioReportingBatcher.Api;
using FactSet.SDK.PortfolioReportingBatcher.Client;
using FactSet.SDK.PortfolioReportingBatcher.Model;

namespace Example
{
    public class GetDetailsForJobExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PortfolioReportingBatcher.Client.Configuration();

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

            var apiInstance = new JobsApi(config);

            var type = (JobTypes) "ADF";  // JobTypes | The jobs type
            var name = "name_example";  // string | The jobs name
            var attribute = new List<string>(); // List<string> | The attribute parameter accepts a list of the given enums, separated by commas. Each of them returns the respective data associated with the job. Runs returns the run history of the job. (optional) 

            try
            {
                // Get details for the given PRB job
                JobDetailsResponse result = apiInstance.GetDetailsForJob(type, name, attribute);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling JobsApi.GetDetailsForJob: " + e.Message );
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
 **type** | **JobTypes**| The jobs type | 
 **name** | **string**| The jobs name | 
 **attribute** | [**List&lt;string&gt;**](string.md)| The attribute parameter accepts a list of the given enums, separated by commas. Each of them returns the respective data associated with the job. Runs returns the run history of the job. | [optional] 

### Return type
[**JobDetailsResponse**](JobDetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  |
| **400** | Invalid post body parameters. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  |
| **404** | Not Found - invalid inputs |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  |
| **429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


