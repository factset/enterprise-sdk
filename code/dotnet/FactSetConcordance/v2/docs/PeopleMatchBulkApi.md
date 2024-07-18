# FactSet.SDK.FactSetConcordance.Api.PeopleMatchBulkApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetPeopleDecisions**](PeopleMatchBulkApi.md#getpeopledecisions) | **GET** /factset-concordance/v2/people-decisions | Get the decisions of matches for the requested taskId.
[**GetPeopleTaskForList**](PeopleMatchBulkApi.md#getpeopletaskforlist) | **POST** /factset-concordance/v2/people-task | Create a People Concordance Task.
[**GetPeopleTaskStatus**](PeopleMatchBulkApi.md#getpeopletaskstatus) | **GET** /factset-concordance/v2/people-task-status | Get the Status of the People Tasks.



<a name="getpeopledecisions"></a>
# **GetPeopleDecisions**
> PeopleDecisionsResponse GetPeopleDecisions (int taskId, int? offset = null, int? limit = null)

Get the decisions of matches for the requested taskId.

Retrieves the `Decision` objects for an People Task (taskId). The decisions do not include all candidates, but rather the results of concording the requested list of names included in the input file. Mapped entities will include a FactSet Entity Identifier (-E). Results will be saved to the `universeId` specified in the input file. 

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
    public class GetPeopleDecisionsExample
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

            var apiInstance = new PeopleMatchBulkApi(config);

            var taskId = 31589;  // int | Concordance Task Identifier. The taskId is created in response from the /people-task endpoint.
            var offset = 0;  // int? | Starting row for records to return or rows to skip. (optional)  (default to 0)
            var limit = 10;  // int? | Limits the number of records in the response. (optional) 

            try
            {
                // Get the decisions of matches for the requested taskId.
                PeopleDecisionsResponse result = apiInstance.GetPeopleDecisions(taskId, offset, limit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PeopleMatchBulkApi.GetPeopleDecisions: " + e.Message );
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
 **taskId** | **int**| Concordance Task Identifier. The taskId is created in response from the /people-task endpoint. | 
 **offset** | **int?**| Starting row for records to return or rows to skip. | [optional] [default to 0]
 **limit** | **int?**| Limits the number of records in the response. | [optional] 

### Return type
[**PeopleDecisionsResponse**](PeopleDecisionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response object for People Decisions endpoint. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getpeopletaskforlist"></a>
# **GetPeopleTaskForList**
> PeopleTaskResponse GetPeopleTaskForList (int universeId, string taskName, System.IO.Stream inputFile, string clientIdColumn, string entityColumn, List<string> additionalContextColumns = null, string firstNameColumn = null, string lastNameColumn = null, string middleNameColumn = null, string personNameColumn = null, string priorityColumn = null, string salutationColumn = null, string suffixColumn = null)

Create a People Concordance Task.

The \"Bulk\" workflow allows the user to create a People Concordance Task. Uploading of a Comma-Separated List file (.csv / UTF-8 encoding) with a list of names and attributes and creation of a task id is mandatory to start the process. [Concordance Sample People Template](https://my.apps.factset.com/oa/cms/oaAttachment/8bd62c75-8f78-48c0-a27d-9cd186c9a54a/27317)    The taskId is then used for reference in the /people-task-status and /people-decisions endpoints to receive results once the task is successful.The /people-task-status endpoint is to check the status of the Tasks as per the ids.     A universeId must be included in request. If you do not have a universe created, reference the /universe endpoint.The bulk workflow supports a two way approach for the user.   **The user can use these parameters in the following ways.**     1.Filling all the required fields including the `personNameColumn`.(do not include `firstNameColumn`,`lastNameColumn` & `middleNameColumn`)     2.Filling all the required fields excluding the `personNameColumn`.(Ensure atleast the `lastNameColumn` is filled) 

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
    public class GetPeopleTaskForListExample
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

            var apiInstance = new PeopleMatchBulkApi(config);

            var universeId = 56;  // int | The id of the universe that entities should be mapped to. Reference the `/universe` endpoint to create a universe, or view available universes via `/universes`.
            var taskName = "taskName_example";  // string | User defined name for the task that will be used to name the output files.
            var inputFile = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // System.IO.Stream | The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data. 
            var clientIdColumn = "clientIdColumn_example";  // string | Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\"clientId\\\". This clientId can be used to create custom mappings or references. 
            var entityColumn = "entityColumn_example";  // string | Header name of the column in the input file that contains the Entity Name to be matched. 
            var additionalContextColumns = new List<string>(); // List<string> | Comma separated list of any additional column names in the input file.  To be used by Managed Service for any unmapped records.  (optional) 
            var firstNameColumn = "firstNameColumn_example";  // string | First name of the person.**Do not include with `personNameColumn`**.   (optional) 
            var lastNameColumn = "lastNameColumn_example";  // string | Lat name of the person.**Do not include with `personNameColumn`**.  (optional) 
            var middleNameColumn = "middleNameColumn_example";  // string | Middle name of the person.**Do not include within `personNameColumn`**.  (optional) 
            var personNameColumn = "personNameColumn_example";  // string | Header name of the column in the input file that contains the name of the person to be matched. **Do not include with `firstNameColumn` and `lastNameColumn`.**  (optional) 
            var priorityColumn = "priorityColumn_example";  // string | Priority associated to the clientId. Used for manual mapping.  (optional) 
            var salutationColumn = "salutationColumn_example";  // string | The salutation of the person.**Do not include with `personNameColumn`**.  (optional) 
            var suffixColumn = "suffixColumn_example";  // string | A name suffix, that follows a person's full name and provides additional information about the person.**Do not include with `personNameColumn`**.  (optional) 

            try
            {
                // Create a People Concordance Task.
                PeopleTaskResponse result = apiInstance.GetPeopleTaskForList(universeId, taskName, inputFile, clientIdColumn, entityColumn, additionalContextColumns, firstNameColumn, lastNameColumn, middleNameColumn, personNameColumn, priorityColumn, salutationColumn, suffixColumn);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PeopleMatchBulkApi.GetPeopleTaskForList: " + e.Message );
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
 **universeId** | **int**| The id of the universe that entities should be mapped to. Reference the &#x60;/universe&#x60; endpoint to create a universe, or view available universes via &#x60;/universes&#x60;. | 
 **taskName** | **string**| User defined name for the task that will be used to name the output files. | 
 **inputFile** | **System.IO.Stream****System.IO.Stream**| The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data.  | 
 **clientIdColumn** | **string**| Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\&quot;clientId\\\&quot;. This clientId can be used to create custom mappings or references.  | 
 **entityColumn** | **string**| Header name of the column in the input file that contains the Entity Name to be matched.  | 
 **additionalContextColumns** | [**List&lt;string&gt;**](string.md)| Comma separated list of any additional column names in the input file.  To be used by Managed Service for any unmapped records.  | [optional] 
 **firstNameColumn** | **string**| First name of the person.**Do not include with &#x60;personNameColumn&#x60;**.   | [optional] 
 **lastNameColumn** | **string**| Lat name of the person.**Do not include with &#x60;personNameColumn&#x60;**.  | [optional] 
 **middleNameColumn** | **string**| Middle name of the person.**Do not include within &#x60;personNameColumn&#x60;**.  | [optional] 
 **personNameColumn** | **string**| Header name of the column in the input file that contains the name of the person to be matched. **Do not include with &#x60;firstNameColumn&#x60; and &#x60;lastNameColumn&#x60;.**  | [optional] 
 **priorityColumn** | **string**| Priority associated to the clientId. Used for manual mapping.  | [optional] 
 **salutationColumn** | **string**| The salutation of the person.**Do not include with &#x60;personNameColumn&#x60;**.  | [optional] 
 **suffixColumn** | **string**| A name suffix, that follows a person&#39;s full name and provides additional information about the person.**Do not include with &#x60;personNameColumn&#x60;**.  | [optional] 

### Return type
[**PeopleTaskResponse**](PeopleTaskResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=utf-8, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. The People Task creation is submitted. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getpeopletaskstatus"></a>
# **GetPeopleTaskStatus**
> PeopleTaskStatusResponse GetPeopleTaskStatus (int? taskId = null, int? offset = null, int? limit = null, List<string> status = null)

Get the Status of the People Tasks.

Pulls the **status** for ALL the People Tasks submitted by a client within the last 30 days, and related details such as task duration and decision rates. Specific Tasks can also be retrieved by using the _taskId_ parameter.<p>Status types include -   * PENDING - The task has not yet started.   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /people-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 

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
    public class GetPeopleTaskStatusExample
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

            var apiInstance = new PeopleMatchBulkApi(config);

            var taskId = 31589;  // int? | Concordance Task Identifier. The taskId is created in response from the /people-task endpoint. (optional) 
            var offset = 0;  // int? | Starting row for records to return or rows to skip. (optional)  (default to 0)
            var limit = 10;  // int? | Limits the number of records in the response. (optional) 
            var status = new List<string>(); // List<string> | Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted.  (optional) 

            try
            {
                // Get the Status of the People Tasks.
                PeopleTaskStatusResponse result = apiInstance.GetPeopleTaskStatus(taskId, offset, limit, status);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PeopleMatchBulkApi.GetPeopleTaskStatus: " + e.Message );
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
 **taskId** | **int?**| Concordance Task Identifier. The taskId is created in response from the /people-task endpoint. | [optional] 
 **offset** | **int?**| Starting row for records to return or rows to skip. | [optional] [default to 0]
 **limit** | **int?**| Limits the number of records in the response. | [optional] 
 **status** | [**List&lt;string&gt;**](string.md)| Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted.  | [optional] 

### Return type
[**PeopleTaskStatusResponse**](PeopleTaskStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response object for People Task Status endpoint. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


