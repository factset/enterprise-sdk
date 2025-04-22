# EntityMatchBulkApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEntityDecisions**](EntityMatchBulkApi.md#getEntityDecisions) | **GET** /factset-concordance/v2/entity-decisions | Get the decisions of matches for the requested taskId.
[**getEntityTaskForList**](EntityMatchBulkApi.md#getEntityTaskForList) | **POST** /factset-concordance/v2/entity-task | Input a file with names and attributes, creating a taskId.
[**getEntityTaskStatus**](EntityMatchBulkApi.md#getEntityTaskStatus) | **GET** /factset-concordance/v2/entity-task-status | Gets the status of the requested taskId or all tasks for a User



## getEntityDecisions

> EntityDecisionsResponse getEntityDecisions(taskId, offset, limit)

Get the decisions of matches for the requested taskId.

Retrieves the `Decision` objects for an Entity Task (taskId). The decisions do not include all candidates, but rather the results of concording the requested list of names included in the input file. Mapped entities will include a FactSet Entity Identifier (-E). Results will be saved to the `universeId` specified in the input file.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.auth.*;
import com.factset.sdk.FactSetConcordance.models.*;
import com.factset.sdk.FactSetConcordance.api.EntityMatchBulkApi;

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

        EntityMatchBulkApi apiInstance = new EntityMatchBulkApi(defaultClient);
        Integer taskId = 31589; // Integer | Name of the column for the type Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint.
        Integer offset = 0; // Integer | Starting row for records to return or rows to skip.
        Integer limit = 10; // Integer | Limits the number of records in the response.
        try {
            EntityDecisionsResponse result = apiInstance.getEntityDecisions(taskId, offset, limit);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EntityMatchBulkApi#getEntityDecisions");
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
 **taskId** | **Integer**| Name of the column for the type Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint. |
 **offset** | **Integer**| Starting row for records to return or rows to skip. | [optional] [default to 0]
 **limit** | **Integer**| Limits the number of records in the response. | [optional]

### Return type

[**EntityDecisionsResponse**](EntityDecisionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response object for Entity Decisions endpoint. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getEntityTaskForList

> EntityTaskResponse getEntityTaskForList(universeId, taskName, inputFile, clientIdColumn, nameColumn, countryColumn, urlColumn, stateColumn, priorityColumn, bbgFigiColumn, bbgTickerColumn, bicColumn, cikColumn, crdColumn, cusipColumn, einColumn, factsetIdColumn, fitchColumn, gvkeyColumn, gvkeyIidColumn, isinColumn, jcnColumn, leiColumn, lxidColumn, mdColumn, redCodeColumn, rssdColumn, sedolColumn, sprColumn, tickerColumn, tickerExchangeColumn, tickerRegionColumn, ukchColumn, valorenColumn, wknColumn, includeEntityType, excludeEntityType, includeEntitySubType, excludeEntitySubType, additionalContextColumns, autoRemap)

Input a file with names and attributes, creating a taskId.

Upload a Comma-Separated List file (.csv / UTF-8 encoding) with a list of names and attributes and receive a `taskId`. [Concordance Sample Template File](https://my.apps.factset.com/oa/cms/oaAttachment/57096850-3834-49fd-9d35-d02d72bdb142/27317). The taskId is then used for reference in the */entity-task-status* and */entity-decisions* endpoints to receive results once the task is successful.<p>This is the first step in the overall "Bulk" workflow. Use the /entity-task-status endpoint to check the status.</p> <p> A universeId must be included in request. If you do not have a universe created, reference the `/universe` endpoint.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.io.File;
// Import classes:
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.auth.*;
import com.factset.sdk.FactSetConcordance.models.*;
import com.factset.sdk.FactSetConcordance.api.EntityMatchBulkApi;

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

        EntityMatchBulkApi apiInstance = new EntityMatchBulkApi(defaultClient);
        Integer universeId = 56; // Integer | The id of the universe that entities should be mapped to. Reference the `/universe` endpoint to create a universe, or view available universes via `/universes`.
        String taskName = "taskName_example"; // String | User defined name for the task that will be used to name the output files.
        File inputFile = new File("/path/to/file"); // File | The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data. 
        String clientIdColumn = "clientIdColumn_example"; // String | Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\"clientId\\\". This clientId can be used to create custom mappings or references. 
        String nameColumn = "nameColumn_example"; // String | Header name of the column in the input file that contains the Entity Name to be matched. 
        String countryColumn = "countryColumn_example"; // String | Header Name of the column in the input file that contains the country's ISO Code. This is used to filter the candidates before taking a match decision. 
        String urlColumn = "urlColumn_example"; // String | Header Name of the column in the input file that contains the Entity's URL. URL corresponding to the entity name that is used when evaluating candidates for a match. 
        String stateColumn = "stateColumn_example"; // String | Header Name of the column in the input file that contains the two letter State Code of the state or province where the Entity is located. Currently, only US state codes are supported. 
        String priorityColumn = "priorityColumn_example"; // String | Header Name of the column in the inputfile that contains the priority for the client id. 
        String bbgFigiColumn = "bbgFigiColumn_example"; // String | Header Name of the column in the input file for the type `Bloomberg Listing/Regional/Security ID`.
        String bbgTickerColumn = "bbgTickerColumn_example"; // String | Header Name of the column in the input file for the type Bloomberg `Listing and Regional Ticker`.
        String bicColumn = "bicColumn_example"; // String | Header Name of the column in the input file for the type BICCode, `bank indentification code`. 
        String cikColumn = "cikColumn_example"; // String | Header Name of the column in the input file for the type CIK, `Edgar Central Index Keys`
        String crdColumn = "crdColumn_example"; // String | Header Name of the column in the input file for the type CRD, `Central Registration Depository`.
        String cusipColumn = "cusipColumn_example"; // String | Header Name of the column in the input file for the type `CUSIP`
        String einColumn = "einColumn_example"; // String | Header Name of the column in the input file for the type EIN, `EmployerIdentificationNumber`.
        String factsetIdColumn = "factsetIdColumn_example"; // String | Header Name of the column in the input file for the type FactSet Identifier - `FactSet -E,-S,-R, -L Permanent Identifier`.
        String fitchColumn = "fitchColumn_example"; // String | Header Name of the column in the input file for the type FitchCreditRating, `Fitch Ratings Identifier`.
        String gvkeyColumn = "gvkeyColumn_example"; // String | Header Name of the column in the input file for the type GVKEY - `Compustat Global Company Key`.
        String gvkeyIidColumn = "gvkeyIidColumn_example"; // String | Header Name of the column in the input file for the type GVKEY+IID - `Compustat Global Company Key and Issue Identifier`.
        String isinColumn = "isinColumn_example"; // String | Header Name of the column in the input file for the type `ISIN`.
        String jcnColumn = "jcnColumn_example"; // String | Header Name of the column in the input file for the type JCN - `Japanese Corporate Number`.
        String leiColumn = "leiColumn_example"; // String | Header Name of the column in the input file for the type LEI, `LegalEntityIdentifier`.
        String lxidColumn = "lxidColumn_example"; // String | Header Name of the column in the input file for the type LXID - `Markit Syndicated Loan Identifier`.
        String mdColumn = "mdColumn_example"; // String | Header Name of the column in the input file for the type MoodysIssuer, `Moody's Ratings Identifier`.
        String redCodeColumn = "redCodeColumn_example"; // String | Header Name of the column in the input file for the type Red Code - `Markit Reference Entity Identifier`.
        String rssdColumn = "rssdColumn_example"; // String | Header Name of the column in the input file for the type RSSD, `FederalReserveRSSDIdentifier`.
        String sedolColumn = "sedolColumn_example"; // String | Header Name of the column in the input file for the type `SEDOL`.
        String sprColumn = "sprColumn_example"; // String | Header Name of the column in the input file for the type S&PRating, `S&P Ratings Identifier`.
        String tickerColumn = "tickerColumn_example"; // String | Header Name of the column in the input file for the type `PriceTicker`.
        String tickerExchangeColumn = "tickerExchangeColumn_example"; // String | Header Name of the column in the input file for the type `TickerExchange`.
        String tickerRegionColumn = "tickerRegionColumn_example"; // String | Header Name of the column in the input file for the type `TickerRegion`.
        String ukchColumn = "ukchColumn_example"; // String | Header Name of the column in the input file for the type `UKCompanyHouse`.
        String valorenColumn = "valorenColumn_example"; // String | Header Name of the column in the input file for the type VALOR, `Valoren (\\\"Valor\\\") Identification`.
        String wknColumn = "wknColumn_example"; // String | Header Name of the column in the input file for the type WKN, `German Securities Identification`.
        java.util.List<String> includeEntityType = Arrays.asList(); // java.util.List<String> | Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Only candidates with an entity type specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within `inputFile`.** 
        java.util.List<String> excludeEntityType = Arrays.asList(); // java.util.List<String> | Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Entities with these types will be excluded from the decisions. It is a global option used to filter the candidates before taking a match decision. Candidates with an entity type specified will *not* be considered for the final match result. **Do not include within `inputFile`.** 
        java.util.List<String> includeEntitySubType = Arrays.asList(); // java.util.List<String> | Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Only candidates with an entity subtype specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within `inputFile`.** 
        java.util.List<String> excludeEntitySubType = Arrays.asList(); // java.util.List<String> | Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Candidates with an entity subtype specified will *not* be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within `inputFile`.** 
        java.util.List<String> additionalContextColumns = Arrays.asList(); // java.util.List<String> | Comma separated list of any additional column names in the input file.  To be used by Managed Service for any unmapped records. 
        Boolean autoRemap = true; // Boolean | When `true`, automatically re-evaluates and overwrites existing mappings using updated metadata submitted in this task. Applicable when the specified universe has auto-remap set to true. **Caution: Mapping updates cannot be undone.** 
        try {
            EntityTaskResponse result = apiInstance.getEntityTaskForList(universeId, taskName, inputFile, clientIdColumn, nameColumn, countryColumn, urlColumn, stateColumn, priorityColumn, bbgFigiColumn, bbgTickerColumn, bicColumn, cikColumn, crdColumn, cusipColumn, einColumn, factsetIdColumn, fitchColumn, gvkeyColumn, gvkeyIidColumn, isinColumn, jcnColumn, leiColumn, lxidColumn, mdColumn, redCodeColumn, rssdColumn, sedolColumn, sprColumn, tickerColumn, tickerExchangeColumn, tickerRegionColumn, ukchColumn, valorenColumn, wknColumn, includeEntityType, excludeEntityType, includeEntitySubType, excludeEntitySubType, additionalContextColumns, autoRemap);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EntityMatchBulkApi#getEntityTaskForList");
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
 **nameColumn** | **String**| Header name of the column in the input file that contains the Entity Name to be matched.  |
 **countryColumn** | **String**| Header Name of the column in the input file that contains the country&#39;s ISO Code. This is used to filter the candidates before taking a match decision.  | [optional]
 **urlColumn** | **String**| Header Name of the column in the input file that contains the Entity&#39;s URL. URL corresponding to the entity name that is used when evaluating candidates for a match.  | [optional]
 **stateColumn** | **String**| Header Name of the column in the input file that contains the two letter State Code of the state or province where the Entity is located. Currently, only US state codes are supported.  | [optional]
 **priorityColumn** | **String**| Header Name of the column in the inputfile that contains the priority for the client id.  | [optional]
 **bbgFigiColumn** | **String**| Header Name of the column in the input file for the type &#x60;Bloomberg Listing/Regional/Security ID&#x60;. | [optional]
 **bbgTickerColumn** | **String**| Header Name of the column in the input file for the type Bloomberg &#x60;Listing and Regional Ticker&#x60;. | [optional]
 **bicColumn** | **String**| Header Name of the column in the input file for the type BICCode, &#x60;bank indentification code&#x60;.  | [optional]
 **cikColumn** | **String**| Header Name of the column in the input file for the type CIK, &#x60;Edgar Central Index Keys&#x60; | [optional]
 **crdColumn** | **String**| Header Name of the column in the input file for the type CRD, &#x60;Central Registration Depository&#x60;. | [optional]
 **cusipColumn** | **String**| Header Name of the column in the input file for the type &#x60;CUSIP&#x60; | [optional]
 **einColumn** | **String**| Header Name of the column in the input file for the type EIN, &#x60;EmployerIdentificationNumber&#x60;. | [optional]
 **factsetIdColumn** | **String**| Header Name of the column in the input file for the type FactSet Identifier - &#x60;FactSet -E,-S,-R, -L Permanent Identifier&#x60;. | [optional]
 **fitchColumn** | **String**| Header Name of the column in the input file for the type FitchCreditRating, &#x60;Fitch Ratings Identifier&#x60;. | [optional]
 **gvkeyColumn** | **String**| Header Name of the column in the input file for the type GVKEY - &#x60;Compustat Global Company Key&#x60;. | [optional]
 **gvkeyIidColumn** | **String**| Header Name of the column in the input file for the type GVKEY+IID - &#x60;Compustat Global Company Key and Issue Identifier&#x60;. | [optional]
 **isinColumn** | **String**| Header Name of the column in the input file for the type &#x60;ISIN&#x60;. | [optional]
 **jcnColumn** | **String**| Header Name of the column in the input file for the type JCN - &#x60;Japanese Corporate Number&#x60;. | [optional]
 **leiColumn** | **String**| Header Name of the column in the input file for the type LEI, &#x60;LegalEntityIdentifier&#x60;. | [optional]
 **lxidColumn** | **String**| Header Name of the column in the input file for the type LXID - &#x60;Markit Syndicated Loan Identifier&#x60;. | [optional]
 **mdColumn** | **String**| Header Name of the column in the input file for the type MoodysIssuer, &#x60;Moody&#39;s Ratings Identifier&#x60;. | [optional]
 **redCodeColumn** | **String**| Header Name of the column in the input file for the type Red Code - &#x60;Markit Reference Entity Identifier&#x60;. | [optional]
 **rssdColumn** | **String**| Header Name of the column in the input file for the type RSSD, &#x60;FederalReserveRSSDIdentifier&#x60;. | [optional]
 **sedolColumn** | **String**| Header Name of the column in the input file for the type &#x60;SEDOL&#x60;. | [optional]
 **sprColumn** | **String**| Header Name of the column in the input file for the type S&amp;PRating, &#x60;S&amp;P Ratings Identifier&#x60;. | [optional]
 **tickerColumn** | **String**| Header Name of the column in the input file for the type &#x60;PriceTicker&#x60;. | [optional]
 **tickerExchangeColumn** | **String**| Header Name of the column in the input file for the type &#x60;TickerExchange&#x60;. | [optional]
 **tickerRegionColumn** | **String**| Header Name of the column in the input file for the type &#x60;TickerRegion&#x60;. | [optional]
 **ukchColumn** | **String**| Header Name of the column in the input file for the type &#x60;UKCompanyHouse&#x60;. | [optional]
 **valorenColumn** | **String**| Header Name of the column in the input file for the type VALOR, &#x60;Valoren (\\\&quot;Valor\\\&quot;) Identification&#x60;. | [optional]
 **wknColumn** | **String**| Header Name of the column in the input file for the type WKN, &#x60;German Securities Identification&#x60;. | [optional]
 **includeEntityType** | **List&lt;String&gt;**| Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Only candidates with an entity type specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  | [optional]
 **excludeEntityType** | **List&lt;String&gt;**| Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Entities with these types will be excluded from the decisions. It is a global option used to filter the candidates before taking a match decision. Candidates with an entity type specified will *not* be considered for the final match result. **Do not include within &#x60;inputFile&#x60;.**  | [optional]
 **includeEntitySubType** | **List&lt;String&gt;**| Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Only candidates with an entity subtype specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  | [optional]
 **excludeEntitySubType** | **List&lt;String&gt;**| Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Candidates with an entity subtype specified will *not* be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  | [optional]
 **additionalContextColumns** | **List&lt;String&gt;**| Comma separated list of any additional column names in the input file.  To be used by Managed Service for any unmapped records.  | [optional]
 **autoRemap** | **Boolean**| When &#x60;true&#x60;, automatically re-evaluates and overwrites existing mappings using updated metadata submitted in this task. Applicable when the specified universe has auto-remap set to true. **Caution: Mapping updates cannot be undone.**  | [optional]

### Return type

[**EntityTaskResponse**](EntityTaskResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json;charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. The Entity Task creation is submitted. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getEntityTaskStatus

> EntityTaskStatusResponse getEntityTaskStatus(taskId, offset, limit, status)

Gets the status of the requested taskId or all tasks for a User

Pulls the **status** for ALL the Entity Tasks submitted by a client within the last 30 days, and related details such as task duration and decision rates. Specific Tasks can also be retrieved by using the _taskId_ parameter.<p>Status types include -
  * PENDING - The task has not yet started.
  * IN_PROGRESS - The task is submitted and decisions are in progress.
  * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.
  * FAILURE - The task failed. Reach out to FactSet Support for assistance.
  * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.
  * ABORTED - The task was aborted.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.auth.*;
import com.factset.sdk.FactSetConcordance.models.*;
import com.factset.sdk.FactSetConcordance.api.EntityMatchBulkApi;

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

        EntityMatchBulkApi apiInstance = new EntityMatchBulkApi(defaultClient);
        Integer taskId = 31589; // Integer | Name of the column for the type Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint.
        Integer offset = 0; // Integer | Starting row for records to return or rows to skip.
        Integer limit = 10; // Integer | Limits the number of records in the response.
        java.util.List<String> status = Arrays.asList(); // java.util.List<String> | Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 
        try {
            EntityTaskStatusResponse result = apiInstance.getEntityTaskStatus(taskId, offset, limit, status);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EntityMatchBulkApi#getEntityTaskStatus");
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
 **taskId** | **Integer**| Name of the column for the type Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint. | [optional]
 **offset** | **Integer**| Starting row for records to return or rows to skip. | [optional] [default to 0]
 **limit** | **Integer**| Limits the number of records in the response. | [optional]
 **status** | **List&lt;String&gt;**| Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted.  | [optional] [enum: PENDING, IN_PROGRESS, SUCCESS, FAILURE, BAD_REQUEST, ABORTED]

### Return type

[**EntityTaskStatusResponse**](EntityTaskStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response object for Task Status endpoint. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

