# PeopleMatchBulkApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPeopleDecisions**](PeopleMatchBulkApi.md#getPeopleDecisions) | **GET** /factset-concordance/v2/people-decisions | Get the decisions of matches for the requested taskId.
[**getPeopleTaskForList**](PeopleMatchBulkApi.md#getPeopleTaskForList) | **POST** /factset-concordance/v2/people-task | Create a People Concordance Task.
[**getPeopleTaskStatus**](PeopleMatchBulkApi.md#getPeopleTaskStatus) | **GET** /factset-concordance/v2/people-task-status | Get the Status of the People Tasks.



## getPeopleDecisions

> PeopleDecisionsResponse getPeopleDecisions(taskId, offset, limit)

Get the decisions of matches for the requested taskId.

Retrieves the `Decision` objects for an People Task (taskId). The decisions do not include all candidates, but rather the results of concording the requested list of names included in the input file. Mapped entities will include a FactSet Entity Identifier (-E). Results will be saved to the `universeId` specified in the input file.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.auth.*;
import com.factset.sdk.FactSetConcordance.models.*;
import com.factset.sdk.FactSetConcordance.api.PeopleMatchBulkApi;

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

        PeopleMatchBulkApi apiInstance = new PeopleMatchBulkApi(defaultClient);
        Integer taskId = 31589; // Integer | Concordance Task Identifier. The taskId is created in response from the /people-task endpoint.
        Integer offset = 0; // Integer | Starting row for records to return or rows to skip.
        Integer limit = 10; // Integer | Limits the number of records in the response.
        try {
            PeopleDecisionsResponse result = apiInstance.getPeopleDecisions(taskId, offset, limit);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PeopleMatchBulkApi#getPeopleDecisions");
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
 **taskId** | **Integer**| Concordance Task Identifier. The taskId is created in response from the /people-task endpoint. |
 **offset** | **Integer**| Starting row for records to return or rows to skip. | [optional] [default to 0]
 **limit** | **Integer**| Limits the number of records in the response. | [optional]

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


## getPeopleTaskForList

> PeopleTaskResponse getPeopleTaskForList(universeId, taskName, inputFile, clientIdColumn, entityColumn, firstNameColumn, lastNameColumn, middleNameColumn, personNameColumn, priorityColumn, salutationColumn, suffixColumn)

Create a People Concordance Task.

The "Bulk" workflow allows the user to create a People Concordance Task. Uploading of a Comma-Separated List file (.csv / UTF-8 encoding) with a list of names and attributes and creation of a task id is mandatory to start the process.
   The taskId is then used for reference in the /people-task-status and /people-decisions endpoints to receive results once the task is successful.The /people-task-status endpoint is to check the status of the Tasks as per the ids.
    A universeId must be included in request. If you do not have a universe created, reference the /universe endpoint.The bulk workflow supports a two way approach for the user.
  **The user can use these parameters in the following ways.**
    1.Filling all the required fields including the `personNameColumn`.(do not include `firstNameColumn`,`lastNameColumn` & `middleNameColumn`)
    2.Filling all the required fields excluding the `personNameColumn`.(Ensure atleast the `lastNameColumn` is filled)


### Example

```java
import java.io.File;
// Import classes:
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.auth.*;
import com.factset.sdk.FactSetConcordance.models.*;
import com.factset.sdk.FactSetConcordance.api.PeopleMatchBulkApi;

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

        PeopleMatchBulkApi apiInstance = new PeopleMatchBulkApi(defaultClient);
        Integer universeId = 56; // Integer | The id of the universe that entities should be mapped to. Reference the `/universe` endpoint to create a universe, or view available universes via `/universes`.
        String taskName = "taskName_example"; // String | User defined name for the task that will be used to name the output files.
        File inputFile = new File("/path/to/file"); // File | The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data. 
        String clientIdColumn = "clientIdColumn_example"; // String | Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\"clientId\\\". This clientId can be used to create custom mappings or references. 
        String entityColumn = "entityColumn_example"; // String | Header name of the column in the input file that contains the Entity Name to be matched. 
        String firstNameColumn = "firstNameColumn_example"; // String | First name of the person.**Do not include with `personNameColumn`**.  
        String lastNameColumn = "lastNameColumn_example"; // String | Lat name of the person.**Do not include with `personNameColumn`**. 
        String middleNameColumn = "middleNameColumn_example"; // String | Middle name of the person.**Do not include within `personNameColumn`**. 
        String personNameColumn = "personNameColumn_example"; // String | Header name of the column in the input file that contains the name of the person to be matched. **Do not include with `firstNameColumn` and `lastNameColumn`.** 
        String priorityColumn = "priorityColumn_example"; // String | Priority associated to the clientId. Used for manual mapping. 
        String salutationColumn = "salutationColumn_example"; // String | The salutation of the person.**Do not include with `personNameColumn`**. 
        String suffixColumn = "suffixColumn_example"; // String | A name suffix, that follows a person's full name and provides additional information about the person.**Do not include with `personNameColumn`**. 
        try {
            PeopleTaskResponse result = apiInstance.getPeopleTaskForList(universeId, taskName, inputFile, clientIdColumn, entityColumn, firstNameColumn, lastNameColumn, middleNameColumn, personNameColumn, priorityColumn, salutationColumn, suffixColumn);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PeopleMatchBulkApi#getPeopleTaskForList");
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
 **universeId** | **Integer**| The id of the universe that entities should be mapped to. Reference the &#x60;/universe&#x60; endpoint to create a universe, or view available universes via &#x60;/universes&#x60;. |
 **taskName** | **String**| User defined name for the task that will be used to name the output files. |
 **inputFile** | **File**| The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data.  |
 **clientIdColumn** | **String**| Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\&quot;clientId\\\&quot;. This clientId can be used to create custom mappings or references.  |
 **entityColumn** | **String**| Header name of the column in the input file that contains the Entity Name to be matched.  |
 **firstNameColumn** | **String**| First name of the person.**Do not include with &#x60;personNameColumn&#x60;**.   | [optional]
 **lastNameColumn** | **String**| Lat name of the person.**Do not include with &#x60;personNameColumn&#x60;**.  | [optional]
 **middleNameColumn** | **String**| Middle name of the person.**Do not include within &#x60;personNameColumn&#x60;**.  | [optional]
 **personNameColumn** | **String**| Header name of the column in the input file that contains the name of the person to be matched. **Do not include with &#x60;firstNameColumn&#x60; and &#x60;lastNameColumn&#x60;.**  | [optional]
 **priorityColumn** | **String**| Priority associated to the clientId. Used for manual mapping.  | [optional]
 **salutationColumn** | **String**| The salutation of the person.**Do not include with &#x60;personNameColumn&#x60;**.  | [optional]
 **suffixColumn** | **String**| A name suffix, that follows a person&#39;s full name and provides additional information about the person.**Do not include with &#x60;personNameColumn&#x60;**.  | [optional]

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


## getPeopleTaskStatus

> PeopleTaskStatusResponse getPeopleTaskStatus(taskId, offset, limit, status)

Get the Status of the People Tasks.

Pulls the **status** for ALL the People Tasks submitted by a client within the last 30 days, and related details such as task duration and decision rates. Specific Tasks can also be retrieved by using the _taskId_ parameter.<p>Status types include -
  * PENDING - The task has not yet started.
  * IN_PROGRESS - The task is submitted and decisions are in progress.
  * SUCCESS - The task was successful! Move to the /people-decisions endpoint to retrieve decisions.
  * FAILURE - The task failed. Reach out to FactSet Support for assistance.
  * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.
  * ABORTED - The task was aborted.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.auth.*;
import com.factset.sdk.FactSetConcordance.models.*;
import com.factset.sdk.FactSetConcordance.api.PeopleMatchBulkApi;

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

        PeopleMatchBulkApi apiInstance = new PeopleMatchBulkApi(defaultClient);
        Integer taskId = 31589; // Integer | Concordance Task Identifier. The taskId is created in response from the /people-task endpoint.
        Integer offset = 0; // Integer | Starting row for records to return or rows to skip.
        Integer limit = 10; // Integer | Limits the number of records in the response.
        java.util.List<String> status = Arrays.asList(); // java.util.List<String> | Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 
        try {
            PeopleTaskStatusResponse result = apiInstance.getPeopleTaskStatus(taskId, offset, limit, status);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PeopleMatchBulkApi#getPeopleTaskStatus");
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
 **taskId** | **Integer**| Concordance Task Identifier. The taskId is created in response from the /people-task endpoint. | [optional]
 **offset** | **Integer**| Starting row for records to return or rows to skip. | [optional] [default to 0]
 **limit** | **Integer**| Limits the number of records in the response. | [optional]
 **status** | **List&lt;String&gt;**| Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted.  | [optional] [enum: PENDING, IN_PROGRESS, SUCCESS, FAILURE, BAD_REQUEST, ABORTED]

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

