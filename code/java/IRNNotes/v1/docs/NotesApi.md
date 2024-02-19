# NotesApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNote**](NotesApi.md#createNote) | **POST** /v1/notes | Create a note
[**deleteNote**](NotesApi.md#deleteNote) | **DELETE** /v1/notes/{noteId} | Delete a Note
[**getNote**](NotesApi.md#getNote) | **GET** /v1/notes/{noteId} | Get details of a note
[**getNotes**](NotesApi.md#getNotes) | **GET** /v1/notes | Get all the notes in the specified date range filtered on the given identifiers
[**updateNote**](NotesApi.md#updateNote) | **PUT** /v1/notes/{noteId} | Update a note



## createNote

> NewItemDto createNote(createNoteDto, xIRNContributorUsername, xIRNContributorSerial)

Create a note

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.IRNNotes.ApiClient;
import com.factset.sdk.IRNNotes.ApiException;
import com.factset.sdk.IRNNotes.Configuration;
import com.factset.sdk.IRNNotes.auth.*;
import com.factset.sdk.IRNNotes.models.*;
import com.factset.sdk.IRNNotes.api.NotesApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        NotesApi apiInstance = new NotesApi(defaultClient);
        CreateNoteDto createNoteDto = new CreateNoteDto(); // CreateNoteDto | 
        String xIRNContributorUsername = "xIRNContributorUsername_example"; // String | 
        String xIRNContributorSerial = "xIRNContributorSerial_example"; // String | 
        try {
            NewItemDto result = apiInstance.createNote(createNoteDto, xIRNContributorUsername, xIRNContributorSerial);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotesApi#createNote");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createNoteDto** | [**CreateNoteDto**](CreateNoteDto.md)|  |
 **xIRNContributorUsername** | **String**|  | [optional]
 **xIRNContributorSerial** | **String**|  | [optional]

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


## deleteNote

> deleteNote(noteId)

Delete a Note

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.IRNNotes.ApiClient;
import com.factset.sdk.IRNNotes.ApiException;
import com.factset.sdk.IRNNotes.Configuration;
import com.factset.sdk.IRNNotes.auth.*;
import com.factset.sdk.IRNNotes.models.*;
import com.factset.sdk.IRNNotes.api.NotesApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        NotesApi apiInstance = new NotesApi(defaultClient);
        java.util.UUID noteId = new java.util.UUID(); // java.util.UUID | 
        try {
            apiInstance.deleteNote(noteId);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotesApi#deleteNote");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **noteId** | **java.util.UUID**|  |

### Return type

null (empty response body)

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


## getNote

> NoteDto getNote(noteId)

Get details of a note

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.IRNNotes.ApiClient;
import com.factset.sdk.IRNNotes.ApiException;
import com.factset.sdk.IRNNotes.Configuration;
import com.factset.sdk.IRNNotes.auth.*;
import com.factset.sdk.IRNNotes.models.*;
import com.factset.sdk.IRNNotes.api.NotesApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        NotesApi apiInstance = new NotesApi(defaultClient);
        java.util.UUID noteId = new java.util.UUID(); // java.util.UUID | Note Id
        try {
            NoteDto result = apiInstance.getNote(noteId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotesApi#getNote");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **noteId** | **java.util.UUID**| Note Id |

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


## getNotes

> java.util.List<NoteSummaryDto> getNotes(start, end, identifiers, authors, subjects, recommendations, sentiments, limit, offset, modifiedSince, states, filterOnRelatedSymbols, includeRelatedEntities, xIRNIncludeDeleted)

Get all the notes in the specified date range filtered on the given identifiers

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.IRNNotes.ApiClient;
import com.factset.sdk.IRNNotes.ApiException;
import com.factset.sdk.IRNNotes.Configuration;
import com.factset.sdk.IRNNotes.auth.*;
import com.factset.sdk.IRNNotes.models.*;
import com.factset.sdk.IRNNotes.api.NotesApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        NotesApi apiInstance = new NotesApi(defaultClient);
        String start = "start_example"; // String | StartDate
        String end = "end_example"; // String | EndDate
        java.util.List<String> identifiers = Arrays.asList(); // java.util.List<String> | Set of identifiers to filter on
        java.util.List<java.util.UUID> authors = Arrays.asList(); // java.util.List<java.util.UUID> | Set of authors to filter on
        java.util.List<java.util.UUID> subjects = Arrays.asList(); // java.util.List<java.util.UUID> | Set of subjects to filter on
        java.util.List<java.util.UUID> recommendations = Arrays.asList(); // java.util.List<java.util.UUID> | Set of recommendations to filter on
        java.util.List<java.util.UUID> sentiments = Arrays.asList(); // java.util.List<java.util.UUID> | Set of sentiments to filter on
        Integer limit = 56; // Integer | Limit on the number of notes retrieved
        Integer offset = 56; // Integer | Fetch notes after the offset
        String modifiedSince = "modifiedSince_example"; // String | Only return notes which have been modified or created since a particular time
        java.util.List<String> states = Arrays.asList(); // java.util.List<String> | Set of states to filter on
        Boolean filterOnRelatedSymbols = false; // Boolean | Include notes whose related symbols match the identifier filter
        Boolean includeRelatedEntities = false; // Boolean | When set to true fetches notes tagged with all the entities related to identifiers param
        Boolean xIRNIncludeDeleted = false; // Boolean | 
        try {
            java.util.List<NoteSummaryDto> result = apiInstance.getNotes(start, end, identifiers, authors, subjects, recommendations, sentiments, limit, offset, modifiedSince, states, filterOnRelatedSymbols, includeRelatedEntities, xIRNIncludeDeleted);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotesApi#getNotes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **String**| StartDate | [optional]
 **end** | **String**| EndDate | [optional]
 **identifiers** | **List&lt;String&gt;**| Set of identifiers to filter on | [optional]
 **authors** | **List&lt;java.util.UUID&gt;**| Set of authors to filter on | [optional]
 **subjects** | **List&lt;java.util.UUID&gt;**| Set of subjects to filter on | [optional]
 **recommendations** | **List&lt;java.util.UUID&gt;**| Set of recommendations to filter on | [optional]
 **sentiments** | **List&lt;java.util.UUID&gt;**| Set of sentiments to filter on | [optional]
 **limit** | **Integer**| Limit on the number of notes retrieved | [optional]
 **offset** | **Integer**| Fetch notes after the offset | [optional]
 **modifiedSince** | **String**| Only return notes which have been modified or created since a particular time | [optional]
 **states** | **List&lt;String&gt;**| Set of states to filter on | [optional]
 **filterOnRelatedSymbols** | **Boolean**| Include notes whose related symbols match the identifier filter | [optional] [default to false]
 **includeRelatedEntities** | **Boolean**| When set to true fetches notes tagged with all the entities related to identifiers param | [optional] [default to false]
 **xIRNIncludeDeleted** | **Boolean**|  | [optional] [default to false]

### Return type

[**java.util.List&lt;NoteSummaryDto&gt;**](NoteSummaryDto.md)

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


## updateNote

> updateNote(noteId, updateNoteDto)

Update a note

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.IRNNotes.ApiClient;
import com.factset.sdk.IRNNotes.ApiException;
import com.factset.sdk.IRNNotes.Configuration;
import com.factset.sdk.IRNNotes.auth.*;
import com.factset.sdk.IRNNotes.models.*;
import com.factset.sdk.IRNNotes.api.NotesApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        NotesApi apiInstance = new NotesApi(defaultClient);
        java.util.UUID noteId = new java.util.UUID(); // java.util.UUID | Note Id
        UpdateNoteDto updateNoteDto = new UpdateNoteDto(); // UpdateNoteDto | Note details to update
        try {
            apiInstance.updateNote(noteId, updateNoteDto);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotesApi#updateNote");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **noteId** | **java.util.UUID**| Note Id |
 **updateNoteDto** | [**UpdateNoteDto**](UpdateNoteDto.md)| Note details to update | [optional]

### Return type

null (empty response body)

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

