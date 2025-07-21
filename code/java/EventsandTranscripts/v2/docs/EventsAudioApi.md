# EventsAudioApi

All URIs are relative to *https://api.factset.com/content/events/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAudioHistoryFiles**](EventsAudioApi.md#getAudioHistoryFiles) | **GET** /audio/history | Retrieve historical audio recordings and related metadata within FactSet coverage.
[**searchEventsAudio**](EventsAudioApi.md#searchEventsAudio) | **POST** /audio | Retrieve latest audio recordings and related metadata based on different search criteria.



## getAudioHistoryFiles

> EventsAudioHistoryResponse getAudioHistoryFiles(year, trimmed)

Retrieve historical audio recordings and related metadata within FactSet coverage.


This endpoint retrieves an object containing a pre-signed URL from which an archive of all audio data for a specified year can be downloaded.

* Returns **untrimmed** historical audio recordings, which include complete audio files such as intro music & non-speaking portions, and related metadata dating back from May 10, 2011 to Sep 30, 2024.

* Returns **trimmed** historical audio recordings, which are audio files with the non-speaking portions removed, and related metadata dating back from May 10, 2011 to Dec 31, 2024.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.EventsandTranscripts.ApiClient;
import com.factset.sdk.EventsandTranscripts.ApiException;
import com.factset.sdk.EventsandTranscripts.Configuration;
import com.factset.sdk.EventsandTranscripts.auth.*;
import com.factset.sdk.EventsandTranscripts.models.*;
import com.factset.sdk.EventsandTranscripts.api.EventsAudioApi;

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

        EventsAudioApi apiInstance = new EventsAudioApi(defaultClient);
        Integer year = 2021; // Integer | Specifies the year for which the historical audio recordings and related metadata are to be retrieved. 
        Boolean trimmed = false; // Boolean | Specifies if trimmed/untrimmed historical audio recordings should be returned.
        try {
            EventsAudioHistoryResponse result = apiInstance.getAudioHistoryFiles(year, trimmed);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EventsAudioApi#getAudioHistoryFiles");
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
 **year** | **Integer**| Specifies the year for which the historical audio recordings and related metadata are to be retrieved.  |
 **trimmed** | **Boolean**| Specifies if trimmed/untrimmed historical audio recordings should be returned. | [optional] [default to false]

### Return type

[**EventsAudioHistoryResponse**](EventsAudioHistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The historical audio recordings based on the provided year. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## searchEventsAudio

> AudioResponse searchEventsAudio(audioRequest)

Retrieve latest audio recordings and related metadata based on different search criteria.

Retrieves the most recent audio recordings and their metadata based on various criteria like date range, upload time, file name, or specific IDs. Use the appropriate parameters within the `data` object of the request body to specify the search method. Pagination and sorting are controlled via the `meta` object.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.EventsandTranscripts.ApiClient;
import com.factset.sdk.EventsandTranscripts.ApiException;
import com.factset.sdk.EventsandTranscripts.Configuration;
import com.factset.sdk.EventsandTranscripts.auth.*;
import com.factset.sdk.EventsandTranscripts.models.*;
import com.factset.sdk.EventsandTranscripts.api.EventsAudioApi;

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

        EventsAudioApi apiInstance = new EventsAudioApi(defaultClient);
        AudioRequest audioRequest = new AudioRequest(); // AudioRequest | Criteria to search for audio files. Select one mode of search.
        try {
            AudioResponse result = apiInstance.searchEventsAudio(audioRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EventsAudioApi#searchEventsAudio");
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
 **audioRequest** | [**AudioRequest**](AudioRequest.md)| Criteria to search for audio files. Select one mode of search. |

### Return type

[**AudioResponse**](AudioResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The latest audio recordings matching the specified criteria. |  -  |
| **400** | Bad Request. This can occur for several reasons, including invalid parameter combinations or malformed JSON. Please review the \&quot;details\&quot; for more information. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

