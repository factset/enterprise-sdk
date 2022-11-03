# PeopleMatchApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPeopleMatch**](PeopleMatchApi.md#getPeopleMatch) | **GET** /factset-concordance/v2/people-match | Find potential people matches given a person&#39;s name.People matches can be retrieved using person&#39;s name and other attributes like firstname, middlename and lastname.
[**getPeopleMatchForList**](PeopleMatchApi.md#getPeopleMatchForList) | **POST** /factset-concordance/v2/people-match | Find potential people matches given a person&#39;s name.



## getPeopleMatch

> PeopleMatchesResponse getPeopleMatch(entity, personName, salutation, firstName, middleName, lastName, suffix)

Find potential people matches given a person&#39;s name.People matches can be retrieved using person&#39;s name and other attributes like firstname, middlename and lastname.

Finds the best people candidates matching the given name. <p>**Max of 1 Name permitted in a single GET request.** Use the POST method for /people-match to fetch up to 25 names. Otherwise, use the "People Match - Bulk" workflow to submit larger universes of names to be concorded via a file.</p><p>


### Example

```java
// Import classes:
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.auth.*;
import com.factset.sdk.FactSetConcordance.models.*;
import com.factset.sdk.FactSetConcordance.api.PeopleMatchApi;

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

        PeopleMatchApi apiInstance = new PeopleMatchApi(defaultClient);
        String entity = "Microsoft"; // String | Entity the person is associated with. It is used to filter the candidates before taking a match decision. Can be entity ID or name. The supported entity types match the what is supported via the /company match.
        String personName = "Bill Gates"; // String | Name of Person to match.
        String salutation = "Mr"; // String | Title in person's name. This parameter should not be provided when the person name is provided as the input.
        String firstName = "Bill"; // String | First name of person. This parameter should not be provided when the person name is provided as the input.
        String middleName = "Henry"; // String | Middle name of person.This parameter should not be provided when the person name is provided as the input.
        String lastName = "Gates"; // String | Last name of person. This parameter should not be provided when the person name is provided as the input.
        String suffix = "III"; // String | Suffix in person's name. This parameter should not be provided when the person name is provided as the input.
        try {
            PeopleMatchesResponse result = apiInstance.getPeopleMatch(entity, personName, salutation, firstName, middleName, lastName, suffix);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PeopleMatchApi#getPeopleMatch");
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
 **entity** | **String**| Entity the person is associated with. It is used to filter the candidates before taking a match decision. Can be entity ID or name. The supported entity types match the what is supported via the /company match. |
 **personName** | **String**| Name of Person to match. | [optional]
 **salutation** | **String**| Title in person&#39;s name. This parameter should not be provided when the person name is provided as the input. | [optional]
 **firstName** | **String**| First name of person. This parameter should not be provided when the person name is provided as the input. | [optional]
 **middleName** | **String**| Middle name of person.This parameter should not be provided when the person name is provided as the input. | [optional]
 **lastName** | **String**| Last name of person. This parameter should not be provided when the person name is provided as the input. | [optional]
 **suffix** | **String**| Suffix in person&#39;s name. This parameter should not be provided when the person name is provided as the input. | [optional]

### Return type

[**PeopleMatchesResponse**](PeopleMatchesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing People Match results. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getPeopleMatchForList

> PeopleMatchesResponse getPeopleMatchForList(peopleMatchRequest)

Find potential people matches given a person&#39;s name.

Finds the best candidate people matching the given people names. Additional attributes can be supplied to narrow the search. If a `universeId` is provided, any match for an input including a `clientId` will be saved to that universe.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.auth.*;
import com.factset.sdk.FactSetConcordance.models.*;
import com.factset.sdk.FactSetConcordance.api.PeopleMatchApi;

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

        PeopleMatchApi apiInstance = new PeopleMatchApi(defaultClient);
        PeopleMatchRequest peopleMatchRequest = new PeopleMatchRequest(); // PeopleMatchRequest | A request to People match.
        try {
            PeopleMatchesResponse result = apiInstance.getPeopleMatchForList(peopleMatchRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PeopleMatchApi#getPeopleMatchForList");
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
 **peopleMatchRequest** | [**PeopleMatchRequest**](PeopleMatchRequest.md)| A request to People match. |

### Return type

[**PeopleMatchesResponse**](PeopleMatchesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing People Match results. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

