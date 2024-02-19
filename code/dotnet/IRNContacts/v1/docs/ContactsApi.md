# FactSet.SDK.IRNContacts.Api.ContactsApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateContact**](ContactsApi.md#createcontact) | **POST** /v1/contacts | Create a contact
[**DeleteContact**](ContactsApi.md#deletecontact) | **DELETE** /v1/contacts/{contactId} | Delete a contact
[**GetContact**](ContactsApi.md#getcontact) | **GET** /v1/contacts/{contactId} | Get all custom field and standard field details on a specific contact
[**GetContactEvents**](ContactsApi.md#getcontactevents) | **GET** /v1/contacts/{contactId}/events | Get a contact’s audit history
[**GetContactNotes**](ContactsApi.md#getcontactnotes) | **GET** /v1/contacts/{contactId}/about | Get the About field content for a specific contact
[**GetContactRecords**](ContactsApi.md#getcontactrecords) | **GET** /v1/contacts/{contactId}/records | Get all notes and meetings where a specific contact was tagged
[**GetContactRelationships**](ContactsApi.md#getcontactrelationships) | **GET** /v1/contacts/{contactId}/relationships | Returns a list of a contact’s relationships
[**GetContacts**](ContactsApi.md#getcontacts) | **GET** /v1/contacts | Get list of all contacts in your group along with some of their standard field data
[**PatchContact**](ContactsApi.md#patchcontact) | **PATCH** /v1/contacts/{contactId} | Edit a contact’s standard field and custom field data



<a name="createcontact"></a>
# **CreateContact**
> NewItemDto CreateContact (ContactSaveDto contactSaveDto = null)

Create a contact

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNContacts.Api;
using FactSet.SDK.IRNContacts.Client;
using FactSet.SDK.IRNContacts.Model;

namespace Example
{
    public class CreateContactExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNContacts.Client.Configuration();

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

            var apiInstance = new ContactsApi(config);

            var contactSaveDto = new ContactSaveDto(); // ContactSaveDto | contactSaveDto object to save (optional) 

            try
            {
                // Create a contact
                NewItemDto result = apiInstance.CreateContact(contactSaveDto);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactsApi.CreateContact: " + e.Message );
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
 **contactSaveDto** | [**ContactSaveDto**](ContactSaveDto.md)| contactSaveDto object to save | [optional] 

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
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="deletecontact"></a>
# **DeleteContact**
> void DeleteContact (Guid contactId)

Delete a contact

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNContacts.Api;
using FactSet.SDK.IRNContacts.Client;
using FactSet.SDK.IRNContacts.Model;

namespace Example
{
    public class DeleteContactExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNContacts.Client.Configuration();

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

            var apiInstance = new ContactsApi(config);

            var contactId = "contactId_example";  // Guid | contactId to delete associated record

            try
            {
                // Delete a contact
                apiInstance.DeleteContact(contactId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactsApi.DeleteContact: " + e.Message );
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
 **contactId** | **Guid**| contactId to delete associated record | 

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


<a name="getcontact"></a>
# **GetContact**
> ContactDto GetContact (Guid contactId)

Get all custom field and standard field details on a specific contact

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNContacts.Api;
using FactSet.SDK.IRNContacts.Client;
using FactSet.SDK.IRNContacts.Model;

namespace Example
{
    public class GetContactExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNContacts.Client.Configuration();

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

            var apiInstance = new ContactsApi(config);

            var contactId = "contactId_example";  // Guid | contactId to get associated record

            try
            {
                // Get all custom field and standard field details on a specific contact
                ContactDto result = apiInstance.GetContact(contactId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactsApi.GetContact: " + e.Message );
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
 **contactId** | **Guid**| contactId to get associated record | 

### Return type
[**ContactDto**](ContactDto.md)

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


<a name="getcontactevents"></a>
# **GetContactEvents**
> List&lt;ContactEventDto&gt; GetContactEvents (Guid contactId)

Get a contact’s audit history

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNContacts.Api;
using FactSet.SDK.IRNContacts.Client;
using FactSet.SDK.IRNContacts.Model;

namespace Example
{
    public class GetContactEventsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNContacts.Client.Configuration();

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

            var apiInstance = new ContactsApi(config);

            var contactId = "contactId_example";  // Guid | contactId to get associated records

            try
            {
                // Get a contact’s audit history
                List<ContactEventDto> result = apiInstance.GetContactEvents(contactId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactsApi.GetContactEvents: " + e.Message );
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
 **contactId** | **Guid**| contactId to get associated records | 

### Return type
[**List&lt;ContactEventDto&gt;**](ContactEventDto.md)

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


<a name="getcontactnotes"></a>
# **GetContactNotes**
> string GetContactNotes (Guid contactId)

Get the About field content for a specific contact

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNContacts.Api;
using FactSet.SDK.IRNContacts.Client;
using FactSet.SDK.IRNContacts.Model;

namespace Example
{
    public class GetContactNotesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNContacts.Client.Configuration();

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

            var apiInstance = new ContactsApi(config);

            var contactId = "contactId_example";  // Guid | contactId of associated record

            try
            {
                // Get the About field content for a specific contact
                string result = apiInstance.GetContactNotes(contactId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactsApi.GetContactNotes: " + e.Message );
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
 **contactId** | **Guid**| contactId of associated record | 

### Return type
**string**

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


<a name="getcontactrecords"></a>
# **GetContactRecords**
> List&lt;RecordPreviewDto&gt; GetContactRecords (Guid contactId)

Get all notes and meetings where a specific contact was tagged

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNContacts.Api;
using FactSet.SDK.IRNContacts.Client;
using FactSet.SDK.IRNContacts.Model;

namespace Example
{
    public class GetContactRecordsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNContacts.Client.Configuration();

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

            var apiInstance = new ContactsApi(config);

            var contactId = "contactId_example";  // Guid | contactId to get associated records

            try
            {
                // Get all notes and meetings where a specific contact was tagged
                List<RecordPreviewDto> result = apiInstance.GetContactRecords(contactId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactsApi.GetContactRecords: " + e.Message );
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
 **contactId** | **Guid**| contactId to get associated records | 

### Return type
[**List&lt;RecordPreviewDto&gt;**](RecordPreviewDto.md)

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


<a name="getcontactrelationships"></a>
# **GetContactRelationships**
> List&lt;ContactRelationshipDto&gt; GetContactRelationships (Guid contactId)

Returns a list of a contact’s relationships

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNContacts.Api;
using FactSet.SDK.IRNContacts.Client;
using FactSet.SDK.IRNContacts.Model;

namespace Example
{
    public class GetContactRelationshipsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNContacts.Client.Configuration();

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

            var apiInstance = new ContactsApi(config);

            var contactId = "contactId_example";  // Guid | contactId to get associated records

            try
            {
                // Returns a list of a contact’s relationships
                List<ContactRelationshipDto> result = apiInstance.GetContactRelationships(contactId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactsApi.GetContactRelationships: " + e.Message );
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
 **contactId** | **Guid**| contactId to get associated records | 

### Return type
[**List&lt;ContactRelationshipDto&gt;**](ContactRelationshipDto.md)

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


<a name="getcontacts"></a>
# **GetContacts**
> List&lt;ContactSummaryDto&gt; GetContacts (string fullName = null, string emailAddress = null, string identifier = null, string employerName = null, bool? customFieldValues = null, string search = null, string sort = null, bool? includeLastMeetingDate = null, int? limit = null)

Get list of all contacts in your group along with some of their standard field data

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNContacts.Api;
using FactSet.SDK.IRNContacts.Client;
using FactSet.SDK.IRNContacts.Model;

namespace Example
{
    public class GetContactsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNContacts.Client.Configuration();

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

            var apiInstance = new ContactsApi(config);

            var fullName = "fullName_example";  // string | Filter results on fullName (optional) 
            var emailAddress = "emailAddress_example";  // string | Filter results on emailAddress (optional) 
            var identifier = "identifier_example";  // string | Filter results on identifier (optional) 
            var employerName = "employerName_example";  // string | Filter results on employerName (optional) 
            var customFieldValues = false;  // bool? | Includes custom field values in response if true (optional)  (default to false)
            var search = "search_example";  // string | Filter results on the combination of fullName, emailAddress, identifier and employerName (optional) 
            var sort = "sort_example";  // string |  (optional) 
            var includeLastMeetingDate = false;  // bool? | If true, returns when they were last tagged as an attendee in an IRN meeting (optional)  (default to false)
            var limit = 0;  // int? | Restrict number of records returned (optional)  (default to 0)

            try
            {
                // Get list of all contacts in your group along with some of their standard field data
                List<ContactSummaryDto> result = apiInstance.GetContacts(fullName, emailAddress, identifier, employerName, customFieldValues, search, sort, includeLastMeetingDate, limit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactsApi.GetContacts: " + e.Message );
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
 **fullName** | **string**| Filter results on fullName | [optional] 
 **emailAddress** | **string**| Filter results on emailAddress | [optional] 
 **identifier** | **string**| Filter results on identifier | [optional] 
 **employerName** | **string**| Filter results on employerName | [optional] 
 **customFieldValues** | **bool?**| Includes custom field values in response if true | [optional] [default to false]
 **search** | **string**| Filter results on the combination of fullName, emailAddress, identifier and employerName | [optional] 
 **sort** | **string**|  | [optional] 
 **includeLastMeetingDate** | **bool?**| If true, returns when they were last tagged as an attendee in an IRN meeting | [optional] [default to false]
 **limit** | **int?**| Restrict number of records returned | [optional] [default to 0]

### Return type
[**List&lt;ContactSummaryDto&gt;**](ContactSummaryDto.md)

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


<a name="patchcontact"></a>
# **PatchContact**
> void PatchContact (Guid contactId, List<Operation> operation = null)

Edit a contact’s standard field and custom field data

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNContacts.Api;
using FactSet.SDK.IRNContacts.Client;
using FactSet.SDK.IRNContacts.Model;

namespace Example
{
    public class PatchContactExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNContacts.Client.Configuration();

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

            var apiInstance = new ContactsApi(config);

            var contactId = "contactId_example";  // Guid | contactId to update associated record
            var operation = new List<Operation>(); // List<Operation> | contactSaveDtoPatch object to update (optional) 

            try
            {
                // Edit a contact’s standard field and custom field data
                apiInstance.PatchContact(contactId, operation);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactsApi.PatchContact: " + e.Message );
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
 **contactId** | **Guid**| contactId to update associated record | 
 **operation** | [**List&lt;Operation&gt;**](Operation.md)| contactSaveDtoPatch object to update | [optional] 

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
| **0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


