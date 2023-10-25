# NotesConfigurationApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAssignedFactSetUsers**](NotesConfigurationApi.md#getAssignedFactSetUsers) | **GET** /v1/users | Get all assigned FactSet users
[**getAuthors**](NotesConfigurationApi.md#getAuthors) | **GET** /v1/authors | Get all Authors
[**getClientsSalesRepresentative**](NotesConfigurationApi.md#getClientsSalesRepresentative) | **GET** /v1/group/client-sales-representative | 
[**getCustomFields**](NotesConfigurationApi.md#getCustomFields) | **GET** /v1/custom-fields | Get all Custom Fields
[**getGroup**](NotesConfigurationApi.md#getGroup) | **GET** /v1/group | Get Group details
[**getRecommendations**](NotesConfigurationApi.md#getRecommendations) | **GET** /v1/recommendations | Get all Recommendations
[**getSentiments**](NotesConfigurationApi.md#getSentiments) | **GET** /v1/sentiments | Get all Sentiments
[**getSubject**](NotesConfigurationApi.md#getSubject) | **GET** /v1/subjects/{subjectId} | Get Subject details for the given Id provided
[**getSubjects**](NotesConfigurationApi.md#getSubjects) | **GET** /v1/subjects | Get all Subjects
[**getTeam**](NotesConfigurationApi.md#getTeam) | **GET** /v1/teams/{teamId} | Get Team details for the given Id provided
[**getTeams**](NotesConfigurationApi.md#getTeams) | **GET** /v1/teams | Get all Teams



## getAssignedFactSetUsers

> java.util.List<UserConfigDto> getAssignedFactSetUsers()

Get all assigned FactSet users

### Example

```java
// Import classes:
import com.factset.sdk.IRNConfiguration.ApiClient;
import com.factset.sdk.IRNConfiguration.ApiException;
import com.factset.sdk.IRNConfiguration.Configuration;
import com.factset.sdk.IRNConfiguration.auth.*;
import com.factset.sdk.IRNConfiguration.models.*;
import com.factset.sdk.IRNConfiguration.api.NotesConfigurationApi;

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

        NotesConfigurationApi apiInstance = new NotesConfigurationApi(defaultClient);
        try {
            java.util.List<UserConfigDto> result = apiInstance.getAssignedFactSetUsers();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotesConfigurationApi#getAssignedFactSetUsers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**java.util.List&lt;UserConfigDto&gt;**](UserConfigDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAuthors

> java.util.List<AuthorConfigDto> getAuthors(xIRNIgnorePermissions)

Get all Authors

### Example

```java
// Import classes:
import com.factset.sdk.IRNConfiguration.ApiClient;
import com.factset.sdk.IRNConfiguration.ApiException;
import com.factset.sdk.IRNConfiguration.Configuration;
import com.factset.sdk.IRNConfiguration.auth.*;
import com.factset.sdk.IRNConfiguration.models.*;
import com.factset.sdk.IRNConfiguration.api.NotesConfigurationApi;

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

        NotesConfigurationApi apiInstance = new NotesConfigurationApi(defaultClient);
        Boolean xIRNIgnorePermissions = false; // Boolean | 
        try {
            java.util.List<AuthorConfigDto> result = apiInstance.getAuthors(xIRNIgnorePermissions);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotesConfigurationApi#getAuthors");
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
 **xIRNIgnorePermissions** | **Boolean**|  | [optional] [default to false]

### Return type

[**java.util.List&lt;AuthorConfigDto&gt;**](AuthorConfigDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |


## getClientsSalesRepresentative

> ClientSalesRepresentativeDto getClientsSalesRepresentative()



### Example

```java
// Import classes:
import com.factset.sdk.IRNConfiguration.ApiClient;
import com.factset.sdk.IRNConfiguration.ApiException;
import com.factset.sdk.IRNConfiguration.Configuration;
import com.factset.sdk.IRNConfiguration.auth.*;
import com.factset.sdk.IRNConfiguration.models.*;
import com.factset.sdk.IRNConfiguration.api.NotesConfigurationApi;

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

        NotesConfigurationApi apiInstance = new NotesConfigurationApi(defaultClient);
        try {
            ClientSalesRepresentativeDto result = apiInstance.getClientsSalesRepresentative();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotesConfigurationApi#getClientsSalesRepresentative");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ClientSalesRepresentativeDto**](ClientSalesRepresentativeDto.md)

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


## getCustomFields

> java.util.List<CustomFieldConfigDto> getCustomFields(xIRNIgnorePermissions)

Get all Custom Fields

### Example

```java
// Import classes:
import com.factset.sdk.IRNConfiguration.ApiClient;
import com.factset.sdk.IRNConfiguration.ApiException;
import com.factset.sdk.IRNConfiguration.Configuration;
import com.factset.sdk.IRNConfiguration.auth.*;
import com.factset.sdk.IRNConfiguration.models.*;
import com.factset.sdk.IRNConfiguration.api.NotesConfigurationApi;

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

        NotesConfigurationApi apiInstance = new NotesConfigurationApi(defaultClient);
        Boolean xIRNIgnorePermissions = false; // Boolean | 
        try {
            java.util.List<CustomFieldConfigDto> result = apiInstance.getCustomFields(xIRNIgnorePermissions);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotesConfigurationApi#getCustomFields");
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
 **xIRNIgnorePermissions** | **Boolean**|  | [optional] [default to false]

### Return type

[**java.util.List&lt;CustomFieldConfigDto&gt;**](CustomFieldConfigDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |


## getGroup

> GroupConfigDto getGroup()

Get Group details

### Example

```java
// Import classes:
import com.factset.sdk.IRNConfiguration.ApiClient;
import com.factset.sdk.IRNConfiguration.ApiException;
import com.factset.sdk.IRNConfiguration.Configuration;
import com.factset.sdk.IRNConfiguration.auth.*;
import com.factset.sdk.IRNConfiguration.models.*;
import com.factset.sdk.IRNConfiguration.api.NotesConfigurationApi;

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

        NotesConfigurationApi apiInstance = new NotesConfigurationApi(defaultClient);
        try {
            GroupConfigDto result = apiInstance.getGroup();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotesConfigurationApi#getGroup");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GroupConfigDto**](GroupConfigDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getRecommendations

> java.util.List<RecommendationConfigDto> getRecommendations()

Get all Recommendations

### Example

```java
// Import classes:
import com.factset.sdk.IRNConfiguration.ApiClient;
import com.factset.sdk.IRNConfiguration.ApiException;
import com.factset.sdk.IRNConfiguration.Configuration;
import com.factset.sdk.IRNConfiguration.auth.*;
import com.factset.sdk.IRNConfiguration.models.*;
import com.factset.sdk.IRNConfiguration.api.NotesConfigurationApi;

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

        NotesConfigurationApi apiInstance = new NotesConfigurationApi(defaultClient);
        try {
            java.util.List<RecommendationConfigDto> result = apiInstance.getRecommendations();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotesConfigurationApi#getRecommendations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**java.util.List&lt;RecommendationConfigDto&gt;**](RecommendationConfigDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getSentiments

> java.util.List<SentimentConfigDto> getSentiments()

Get all Sentiments

### Example

```java
// Import classes:
import com.factset.sdk.IRNConfiguration.ApiClient;
import com.factset.sdk.IRNConfiguration.ApiException;
import com.factset.sdk.IRNConfiguration.Configuration;
import com.factset.sdk.IRNConfiguration.auth.*;
import com.factset.sdk.IRNConfiguration.models.*;
import com.factset.sdk.IRNConfiguration.api.NotesConfigurationApi;

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

        NotesConfigurationApi apiInstance = new NotesConfigurationApi(defaultClient);
        try {
            java.util.List<SentimentConfigDto> result = apiInstance.getSentiments();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotesConfigurationApi#getSentiments");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**java.util.List&lt;SentimentConfigDto&gt;**](SentimentConfigDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getSubject

> SubjectConfigDto getSubject(subjectId, xIRNIgnorePermissions)

Get Subject details for the given Id provided

### Example

```java
// Import classes:
import com.factset.sdk.IRNConfiguration.ApiClient;
import com.factset.sdk.IRNConfiguration.ApiException;
import com.factset.sdk.IRNConfiguration.Configuration;
import com.factset.sdk.IRNConfiguration.auth.*;
import com.factset.sdk.IRNConfiguration.models.*;
import com.factset.sdk.IRNConfiguration.api.NotesConfigurationApi;

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

        NotesConfigurationApi apiInstance = new NotesConfigurationApi(defaultClient);
        java.util.UUID subjectId = new java.util.UUID(); // java.util.UUID | Id
        Boolean xIRNIgnorePermissions = false; // Boolean | 
        try {
            SubjectConfigDto result = apiInstance.getSubject(subjectId, xIRNIgnorePermissions);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotesConfigurationApi#getSubject");
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
 **subjectId** | **java.util.UUID**| Id |
 **xIRNIgnorePermissions** | **Boolean**|  | [optional] [default to false]

### Return type

[**SubjectConfigDto**](SubjectConfigDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## getSubjects

> java.util.List<SubjectSummaryDto> getSubjects(xIRNIgnorePermissions)

Get all Subjects

### Example

```java
// Import classes:
import com.factset.sdk.IRNConfiguration.ApiClient;
import com.factset.sdk.IRNConfiguration.ApiException;
import com.factset.sdk.IRNConfiguration.Configuration;
import com.factset.sdk.IRNConfiguration.auth.*;
import com.factset.sdk.IRNConfiguration.models.*;
import com.factset.sdk.IRNConfiguration.api.NotesConfigurationApi;

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

        NotesConfigurationApi apiInstance = new NotesConfigurationApi(defaultClient);
        Boolean xIRNIgnorePermissions = false; // Boolean | 
        try {
            java.util.List<SubjectSummaryDto> result = apiInstance.getSubjects(xIRNIgnorePermissions);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotesConfigurationApi#getSubjects");
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
 **xIRNIgnorePermissions** | **Boolean**|  | [optional] [default to false]

### Return type

[**java.util.List&lt;SubjectSummaryDto&gt;**](SubjectSummaryDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |


## getTeam

> TeamConfigDto getTeam(teamId, xIRNIgnorePermissions)

Get Team details for the given Id provided

### Example

```java
// Import classes:
import com.factset.sdk.IRNConfiguration.ApiClient;
import com.factset.sdk.IRNConfiguration.ApiException;
import com.factset.sdk.IRNConfiguration.Configuration;
import com.factset.sdk.IRNConfiguration.auth.*;
import com.factset.sdk.IRNConfiguration.models.*;
import com.factset.sdk.IRNConfiguration.api.NotesConfigurationApi;

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

        NotesConfigurationApi apiInstance = new NotesConfigurationApi(defaultClient);
        java.util.UUID teamId = new java.util.UUID(); // java.util.UUID | Id
        Boolean xIRNIgnorePermissions = false; // Boolean | 
        try {
            TeamConfigDto result = apiInstance.getTeam(teamId, xIRNIgnorePermissions);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotesConfigurationApi#getTeam");
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
 **teamId** | **java.util.UUID**| Id |
 **xIRNIgnorePermissions** | **Boolean**|  | [optional] [default to false]

### Return type

[**TeamConfigDto**](TeamConfigDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## getTeams

> java.util.List<TeamSummaryDto> getTeams(xIRNIgnorePermissions)

Get all Teams

### Example

```java
// Import classes:
import com.factset.sdk.IRNConfiguration.ApiClient;
import com.factset.sdk.IRNConfiguration.ApiException;
import com.factset.sdk.IRNConfiguration.Configuration;
import com.factset.sdk.IRNConfiguration.auth.*;
import com.factset.sdk.IRNConfiguration.models.*;
import com.factset.sdk.IRNConfiguration.api.NotesConfigurationApi;

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

        NotesConfigurationApi apiInstance = new NotesConfigurationApi(defaultClient);
        Boolean xIRNIgnorePermissions = false; // Boolean | 
        try {
            java.util.List<TeamSummaryDto> result = apiInstance.getTeams(xIRNIgnorePermissions);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotesConfigurationApi#getTeams");
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
 **xIRNIgnorePermissions** | **Boolean**|  | [optional] [default to false]

### Return type

[**java.util.List&lt;TeamSummaryDto&gt;**](TeamSummaryDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |

