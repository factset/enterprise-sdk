# FactSet.SDK.IRNNotes.Api.NotesApi

All URIs are relative to *https://api.factset.com/research/irn/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateNote**](NotesApi.md#createnote) | **POST** /notes | Create a note
[**DeleteNote**](NotesApi.md#deletenote) | **DELETE** /notes/{noteId} | Delete a Note
[**GetNote**](NotesApi.md#getnote) | **GET** /notes/{noteId} | Get details of a note
[**GetNotes**](NotesApi.md#getnotes) | **GET** /notes | Get all the notes in the specified date range filtered on the given identifiers
[**UpdateNote**](NotesApi.md#updatenote) | **PUT** /notes/{noteId} | Updates a note by replacing existing note with new data



<a name="createnote"></a>
# **CreateNote**
> NewItemDto CreateNote (CreateNoteDto createNoteDto, string xIRNContributorUsername = null, string xIRNContributorSerial = null)

Create a note

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNNotes.Api;
using FactSet.SDK.IRNNotes.Client;
using FactSet.SDK.IRNNotes.Model;

namespace Example
{
    public class CreateNoteExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNNotes.Client.Configuration();

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

            var apiInstance = new NotesApi(config);

            var createNoteDto = new CreateNoteDto(); // CreateNoteDto | 
            var xIRNContributorUsername = "xIRNContributorUsername_example";  // string |  (optional) 
            var xIRNContributorSerial = "xIRNContributorSerial_example";  // string |  (optional) 

            try
            {
                // Create a note
                NewItemDto result = apiInstance.CreateNote(createNoteDto, xIRNContributorUsername, xIRNContributorSerial);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotesApi.CreateNote: " + e.Message );
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
 **createNoteDto** | [**CreateNoteDto**](CreateNoteDto.md)|  | 
 **xIRNContributorUsername** | **string**|  | [optional] 
 **xIRNContributorSerial** | **string**|  | [optional] 

### Return type
[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success - Returns unique identifier of the note created |  -  |
| **400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="deletenote"></a>
# **DeleteNote**
> void DeleteNote (Guid noteId)

Delete a Note

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNNotes.Api;
using FactSet.SDK.IRNNotes.Client;
using FactSet.SDK.IRNNotes.Model;

namespace Example
{
    public class DeleteNoteExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNNotes.Client.Configuration();

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

            var apiInstance = new NotesApi(config);

            var noteId = "noteId_example";  // Guid | Note Id

            try
            {
                // Delete a Note
                apiInstance.DeleteNote(noteId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotesApi.DeleteNote: " + e.Message );
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
 **noteId** | **Guid**| Note Id | 

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


<a name="getnote"></a>
# **GetNote**
> NoteDto GetNote (Guid noteId)

Get details of a note

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNNotes.Api;
using FactSet.SDK.IRNNotes.Client;
using FactSet.SDK.IRNNotes.Model;

namespace Example
{
    public class GetNoteExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNNotes.Client.Configuration();

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

            var apiInstance = new NotesApi(config);

            var noteId = "noteId_example";  // Guid | Note Id

            try
            {
                // Get details of a note
                NoteDto result = apiInstance.GetNote(noteId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotesApi.GetNote: " + e.Message );
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
 **noteId** | **Guid**| Note Id | 

### Return type
[**NoteDto**](NoteDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not Found |  -  |
| **0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getnotes"></a>
# **GetNotes**
> List&lt;NoteSummaryDto&gt; GetNotes (string start = null, string end = null, List<string> identifiers = null, List<Guid> authors = null, List<Guid> subjects = null, List<Guid> recommendations = null, List<Guid> sentiments = null, int? limit = null, int? offset = null, string modifiedSince = null, List<string> states = null, bool? filterOnRelatedSymbols = null, bool? includeRelatedEntities = null, bool? xIRNIncludeDeleted = null)

Get all the notes in the specified date range filtered on the given identifiers

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNNotes.Api;
using FactSet.SDK.IRNNotes.Client;
using FactSet.SDK.IRNNotes.Model;

namespace Example
{
    public class GetNotesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNNotes.Client.Configuration();

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

            var apiInstance = new NotesApi(config);

            var start = "start_example";  // string | StartDate (optional) 
            var end = "end_example";  // string | EndDate (optional) 
            var identifiers = new List<string>(); // List<string> | Set of identifiers to filter on (optional) 
            var authors = new List<Guid>(); // List<Guid> | Set of authors to filter on (optional) 
            var subjects = new List<Guid>(); // List<Guid> | Set of subjects to filter on (optional) 
            var recommendations = new List<Guid>(); // List<Guid> | Set of recommendations to filter on (optional) 
            var sentiments = new List<Guid>(); // List<Guid> | Set of sentiments to filter on (optional) 
            var limit = 56;  // int? | Limit on the number of notes retrieved (optional) 
            var offset = 56;  // int? | Fetch notes after the offset (optional) 
            var modifiedSince = "modifiedSince_example";  // string | Only return notes which have been modified or created since a particular time (optional) 
            var states = new List<string>(); // List<string> | Set of states to filter on (optional) 
            var filterOnRelatedSymbols = false;  // bool? | Include notes whose related symbols match the identifier filter (optional)  (default to false)
            var includeRelatedEntities = false;  // bool? | When set to true fetches notes tagged with all the entities related to identifiers param (optional)  (default to false)
            var xIRNIncludeDeleted = false;  // bool? |  (optional)  (default to false)

            try
            {
                // Get all the notes in the specified date range filtered on the given identifiers
                List<NoteSummaryDto> result = apiInstance.GetNotes(start, end, identifiers, authors, subjects, recommendations, sentiments, limit, offset, modifiedSince, states, filterOnRelatedSymbols, includeRelatedEntities, xIRNIncludeDeleted);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotesApi.GetNotes: " + e.Message );
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
 **start** | **string**| StartDate | [optional] 
 **end** | **string**| EndDate | [optional] 
 **identifiers** | [**List&lt;string&gt;**](string.md)| Set of identifiers to filter on | [optional] 
 **authors** | [**List&lt;Guid&gt;**](Guid.md)| Set of authors to filter on | [optional] 
 **subjects** | [**List&lt;Guid&gt;**](Guid.md)| Set of subjects to filter on | [optional] 
 **recommendations** | [**List&lt;Guid&gt;**](Guid.md)| Set of recommendations to filter on | [optional] 
 **sentiments** | [**List&lt;Guid&gt;**](Guid.md)| Set of sentiments to filter on | [optional] 
 **limit** | **int?**| Limit on the number of notes retrieved | [optional] 
 **offset** | **int?**| Fetch notes after the offset | [optional] 
 **modifiedSince** | **string**| Only return notes which have been modified or created since a particular time | [optional] 
 **states** | [**List&lt;string&gt;**](string.md)| Set of states to filter on | [optional] 
 **filterOnRelatedSymbols** | **bool?**| Include notes whose related symbols match the identifier filter | [optional] [default to false]
 **includeRelatedEntities** | **bool?**| When set to true fetches notes tagged with all the entities related to identifiers param | [optional] [default to false]
 **xIRNIncludeDeleted** | **bool?**|  | [optional] [default to false]

### Return type
[**List&lt;NoteSummaryDto&gt;**](NoteSummaryDto.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="updatenote"></a>
# **UpdateNote**
> void UpdateNote (Guid noteId, UpdateNoteDto updateNoteDto = null)

Updates a note by replacing existing note with new data

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNNotes.Api;
using FactSet.SDK.IRNNotes.Client;
using FactSet.SDK.IRNNotes.Model;

namespace Example
{
    public class UpdateNoteExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNNotes.Client.Configuration();

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

            var apiInstance = new NotesApi(config);

            var noteId = "noteId_example";  // Guid | Note Id
            var updateNoteDto = new UpdateNoteDto(); // UpdateNoteDto | The new data for the note (optional) 

            try
            {
                // Updates a note by replacing existing note with new data
                apiInstance.UpdateNote(noteId, updateNoteDto);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotesApi.UpdateNote: " + e.Message );
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
 **noteId** | **Guid**| Note Id | 
 **updateNoteDto** | [**UpdateNoteDto**](UpdateNoteDto.md)| The new data for the note | [optional] 

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
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


