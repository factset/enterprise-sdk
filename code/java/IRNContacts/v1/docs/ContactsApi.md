# ContactsApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createContact**](ContactsApi.md#createContact) | **POST** /v1/contacts | Create a contact
[**deleteContact**](ContactsApi.md#deleteContact) | **DELETE** /v1/contacts/{contactId} | Delete a contact
[**getContact**](ContactsApi.md#getContact) | **GET** /v1/contacts/{contactId} | Get all custom field and standard field details on a specific contact
[**getContactEvents**](ContactsApi.md#getContactEvents) | **GET** /v1/contacts/{contactId}/events | Get a contact’s audit history
[**getContactNotes**](ContactsApi.md#getContactNotes) | **GET** /v1/contacts/{contactId}/about | Get the About field content for a specific contact
[**getContactRecords**](ContactsApi.md#getContactRecords) | **GET** /v1/contacts/{contactId}/records | Get all notes and meetings where a specific contact was tagged
[**getContactRelationships**](ContactsApi.md#getContactRelationships) | **GET** /v1/contacts/{contactId}/relationships | Returns a list of a contact’s relationships
[**getContacts**](ContactsApi.md#getContacts) | **GET** /v1/contacts | Get list of all contacts in your group along with some of their standard field data
[**patchContact**](ContactsApi.md#patchContact) | **PATCH** /v1/contacts/{contactId} | Edit a contact’s standard field and custom field data



## createContact

> NewItemDto createContact(contactSaveDto)

Create a contact

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.models.*;
import com.factset.sdk.IRNContacts.api.ContactsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        ContactSaveDto contactSaveDto = new ContactSaveDto(); // ContactSaveDto | contactSaveDto object to save
        try {
            NewItemDto result = apiInstance.createContact(contactSaveDto);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#createContact");
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


## deleteContact

> deleteContact(contactId)

Delete a contact

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.models.*;
import com.factset.sdk.IRNContacts.api.ContactsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        java.util.UUID contactId = new java.util.UUID(); // java.util.UUID | contactId to delete associated record
        try {
            apiInstance.deleteContact(contactId);

        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#deleteContact");
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
 **contactId** | **java.util.UUID**| contactId to delete associated record |

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


## getContact

> ContactDto getContact(contactId)

Get all custom field and standard field details on a specific contact

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.models.*;
import com.factset.sdk.IRNContacts.api.ContactsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        java.util.UUID contactId = new java.util.UUID(); // java.util.UUID | contactId to get associated record
        try {
            ContactDto result = apiInstance.getContact(contactId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#getContact");
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
 **contactId** | **java.util.UUID**| contactId to get associated record |

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


## getContactEvents

> java.util.List<ContactEventDto> getContactEvents(contactId)

Get a contact’s audit history

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.models.*;
import com.factset.sdk.IRNContacts.api.ContactsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        java.util.UUID contactId = new java.util.UUID(); // java.util.UUID | contactId to get associated records
        try {
            java.util.List<ContactEventDto> result = apiInstance.getContactEvents(contactId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#getContactEvents");
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
 **contactId** | **java.util.UUID**| contactId to get associated records |

### Return type

[**java.util.List&lt;ContactEventDto&gt;**](ContactEventDto.md)

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


## getContactNotes

> String getContactNotes(contactId)

Get the About field content for a specific contact

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.models.*;
import com.factset.sdk.IRNContacts.api.ContactsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        java.util.UUID contactId = new java.util.UUID(); // java.util.UUID | contactId of associated record
        try {
            String result = apiInstance.getContactNotes(contactId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#getContactNotes");
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
 **contactId** | **java.util.UUID**| contactId of associated record |

### Return type

**String**

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


## getContactRecords

> java.util.List<RecordPreviewDto> getContactRecords(contactId)

Get all notes and meetings where a specific contact was tagged

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.models.*;
import com.factset.sdk.IRNContacts.api.ContactsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        java.util.UUID contactId = new java.util.UUID(); // java.util.UUID | contactId to get associated records
        try {
            java.util.List<RecordPreviewDto> result = apiInstance.getContactRecords(contactId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#getContactRecords");
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
 **contactId** | **java.util.UUID**| contactId to get associated records |

### Return type

[**java.util.List&lt;RecordPreviewDto&gt;**](RecordPreviewDto.md)

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


## getContactRelationships

> java.util.List<ContactRelationshipDto> getContactRelationships(contactId)

Returns a list of a contact’s relationships

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.models.*;
import com.factset.sdk.IRNContacts.api.ContactsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        java.util.UUID contactId = new java.util.UUID(); // java.util.UUID | contactId to get associated records
        try {
            java.util.List<ContactRelationshipDto> result = apiInstance.getContactRelationships(contactId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#getContactRelationships");
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
 **contactId** | **java.util.UUID**| contactId to get associated records |

### Return type

[**java.util.List&lt;ContactRelationshipDto&gt;**](ContactRelationshipDto.md)

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


## getContacts

> java.util.List<ContactSummaryDto> getContacts(fullName, emailAddress, identifier, employerName, customFieldValues, search, sort, includeLastMeetingDate, limit)

Get list of all contacts in your group along with some of their standard field data

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.models.*;
import com.factset.sdk.IRNContacts.api.ContactsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        String fullName = "fullName_example"; // String | Filter results on fullName
        String emailAddress = "emailAddress_example"; // String | Filter results on emailAddress
        String identifier = "identifier_example"; // String | Filter results on identifier
        String employerName = "employerName_example"; // String | Filter results on employerName
        Boolean customFieldValues = false; // Boolean | Includes custom field values in response if true
        String search = "search_example"; // String | Filter results on the combination of fullName, emailAddress, identifier and employerName
        String sort = "sort_example"; // String | 
        Boolean includeLastMeetingDate = false; // Boolean | If true, returns when they were last tagged as an attendee in an IRN meeting
        Integer limit = 0; // Integer | Restrict number of records returned
        try {
            java.util.List<ContactSummaryDto> result = apiInstance.getContacts(fullName, emailAddress, identifier, employerName, customFieldValues, search, sort, includeLastMeetingDate, limit);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#getContacts");
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
 **fullName** | **String**| Filter results on fullName | [optional]
 **emailAddress** | **String**| Filter results on emailAddress | [optional]
 **identifier** | **String**| Filter results on identifier | [optional]
 **employerName** | **String**| Filter results on employerName | [optional]
 **customFieldValues** | **Boolean**| Includes custom field values in response if true | [optional] [default to false]
 **search** | **String**| Filter results on the combination of fullName, emailAddress, identifier and employerName | [optional]
 **sort** | **String**|  | [optional]
 **includeLastMeetingDate** | **Boolean**| If true, returns when they were last tagged as an attendee in an IRN meeting | [optional] [default to false]
 **limit** | **Integer**| Restrict number of records returned | [optional] [default to 0]

### Return type

[**java.util.List&lt;ContactSummaryDto&gt;**](ContactSummaryDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## patchContact

> patchContact(contactId, operation)

Edit a contact’s standard field and custom field data

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.models.*;
import com.factset.sdk.IRNContacts.api.ContactsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        java.util.UUID contactId = new java.util.UUID(); // java.util.UUID | contactId to update associated record
        java.util.List<Operation> operation = Arrays.asList(); // java.util.List<Operation> | contactSaveDtoPatch object to update
        try {
            apiInstance.patchContact(contactId, operation);

        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#patchContact");
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
 **contactId** | **java.util.UUID**| contactId to update associated record |
 **operation** | [**List&lt;Operation&gt;**](Operation.md)| contactSaveDtoPatch object to update | [optional]

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
| **0** | Error |  -  |

