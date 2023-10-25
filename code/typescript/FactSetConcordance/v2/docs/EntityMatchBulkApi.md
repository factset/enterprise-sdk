# factsetconcordance.EntityMatchBulkApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEntityDecisions**](EntityMatchBulkApi.md#getEntityDecisions) | **GET** /factset-concordance/v2/entity-decisions | Get the decisions of matches for the requested taskId.
[**getEntityTaskForList**](EntityMatchBulkApi.md#getEntityTaskForList) | **POST** /factset-concordance/v2/entity-task | Input a file with names and attributes, creating a taskId.
[**getEntityTaskStatus**](EntityMatchBulkApi.md#getEntityTaskStatus) | **GET** /factset-concordance/v2/entity-task-status | Gets the status of the requested taskId or all tasks for a User



## getEntityDecisions

> EntityDecisionsResponse getEntityDecisions(taskId, opts)

Get the decisions of matches for the requested taskId.

Retrieves the &#x60;Decision&#x60; objects for an Entity Task (taskId). The decisions do not include all candidates, but rather the results of concording the requested list of names included in the input file. Mapped entities will include a FactSet Entity Identifier (-E). Results will be saved to the &#x60;universeId&#x60; specified in the input file. 

### Example

```javascript
const { ApiClient, EntityMatchBulkApi } = require('@factset/sdk-factsetconcordance');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
//
// The confidential client instance should be reused in production environments.
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new EntityMatchBulkApi();
const taskId = 31589; // Number | Name of the column for the type Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint.
const opts = {
  'offset': 0, // Number | Starting row for records to return or rows to skip.
  'limit': 10 // Number | Limits the number of records in the response.
};

// Call api endpoint
apiInstance.getEntityDecisions(taskId, opts).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **Number**| Name of the column for the type Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint. | 
 **offset** | **Number**| Starting row for records to return or rows to skip. | [optional] [default to 0]
 **limit** | **Number**| Limits the number of records in the response. | [optional] 

### Return type

[**EntityDecisionsResponse**](EntityDecisionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8, application/json


## getEntityTaskForList

> EntityTaskResponse getEntityTaskForList(universeId, taskName, inputFile, clientIdColumn, nameColumn, opts)

Input a file with names and attributes, creating a taskId.

Upload a Comma-Separated List file (.csv / UTF-8 encoding) with a list of names and attributes and receive a &#x60;taskId&#x60;. The taskId is then used for reference in the *_/entity-task-status* and *_/entity-decisions* endpoints to receive results once the task is successful.&lt;p&gt;This is the first step in the overall \&quot;Bulk\&quot; workflow. Use the /entity-task-status endpoint to check the status.&lt;/p&gt; &lt;p&gt; A universeId must be included in request. If you do not have a universe created, reference the &#x60;/universe&#x60; endpoint. 

### Example

```javascript
const { ApiClient, EntityMatchBulkApi } = require('@factset/sdk-factsetconcordance');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
//
// The confidential client instance should be reused in production environments.
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new EntityMatchBulkApi();
const universeId = 56; // Number | The id of the universe that entities should be mapped to. Reference the `/universe` endpoint to create a universe, or view available universes via `/universes`.
const taskName = "taskName_example"; // String | User defined name for the task that will be used to name the output files.
const inputFile = "/path/to/file"; // File | The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data. 
const clientIdColumn = "clientIdColumn_example"; // String | Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\"clientId\\\". This clientId can be used to create custom mappings or references. 
const nameColumn = "nameColumn_example"; // String | Header name of the column in the input file that contains the Entity Name to be matched. 
const opts = {
  'countryColumn': "countryColumn_example", // String | Header Name of the column in the input file that contains the country's ISO Code. This is used to filter the candidates before taking a match decision. 
  'urlColumn': "urlColumn_example", // String | Header Name of the column in the input file that contains the Entity's URL. URL corresponding to the entity name that is used when evaluating candidates for a match. 
  'stateColumn': "stateColumn_example", // String | Header Name of the column in the input file that contains the two letter State Code of the state or province where the Entity is located. Currently, only US state codes are supported. 
  'priorityColumn': "priorityColumn_example", // String | Header Name of the column in the inputfile that contains the priority for the client id. 
  'bbgFigiColumn': "bbgFigiColumn_example", // String | Header Name of the column in the input file for the type `Bloomberg Listing/Regional/Security ID`.
  'bbgTickerColumn': "bbgTickerColumn_example", // String | Header Name of the column in the input file for the type Bloomberg `Listing and Regional Ticker`.
  'bicColumn': "bicColumn_example", // String | Header Name of the column in the input file for the type BICCode, `bank indentification code`. 
  'cikColumn': "cikColumn_example", // String | Header Name of the column in the input file for the type CIK, `Edgar Central Index Keys`
  'crdColumn': "crdColumn_example", // String | Header Name of the column in the input file for the type CRD, `Central Registration Depository`.
  'cusipColumn': "cusipColumn_example", // String | Header Name of the column in the input file for the type `CUSIP`
  'dunsColumn': "dunsColumn_example", // String | Header Name of the column in the input file for the type DUNS, `Dun&Bradstreet`.
  'einColumn': "einColumn_example", // String | Header Name of the column in the input file for the type EIN, `EmployerIdentificationNumber`.
  'factsetIdColumn': "factsetIdColumn_example", // String | Header Name of the column in the input file for the type FactSet Identifier - `FactSet -E,-S,-R, -L Permanent Identifier`.
  'fitchColumn': "fitchColumn_example", // String | Header Name of the column in the input file for the type FitchCreditRating, `Fitch Ratings Identifier`.
  'gvkeyColumn': "gvkeyColumn_example", // String | Header Name of the column in the input file for the type GVKEY - `Compustat Global Company Key`.
  'gvkeyIidColumn': "gvkeyIidColumn_example", // String | Header Name of the column in the input file for the type GVKEY+IID - `Compustat Global Company Key and Issue Identifier`.
  'isinColumn': "isinColumn_example", // String | Header Name of the column in the input file for the type `ISIN`.
  'jcnColumn': "jcnColumn_example", // String | Header Name of the column in the input file for the type JCN - `Japanese Corporate Number`.
  'leiColumn': "leiColumn_example", // String | Header Name of the column in the input file for the type LEI, `LegalEntityIdentifier`.
  'lxidColumn': "lxidColumn_example", // String | Header Name of the column in the input file for the type LXID - `Markit Syndicated Loan Identifier`.
  'mdColumn': "mdColumn_example", // String | Header Name of the column in the input file for the type MoodysIssuer, `Moody's Ratings Identifier`.
  'redCodeColumn': "redCodeColumn_example", // String | Header Name of the column in the input file for the type Red Code - `Markit Reference Entity Identifier`.
  'rssdColumn': "rssdColumn_example", // String | Header Name of the column in the input file for the type RSSD, `FederalReserveRSSDIdentifier`.
  'sedolColumn': "sedolColumn_example", // String | Header Name of the column in the input file for the type `SEDOL`.
  'sprColumn': "sprColumn_example", // String | Header Name of the column in the input file for the type S&PRating, `S&P Ratings Identifier`.
  'tickerColumn': "tickerColumn_example", // String | Header Name of the column in the input file for the type `PriceTicker`.
  'tickerExchangeColumn': "tickerExchangeColumn_example", // String | Header Name of the column in the input file for the type `TickerExchange`.
  'tickerRegionColumn': "tickerRegionColumn_example", // String | Header Name of the column in the input file for the type `TickerRegion`.
  'ukchColumn': "ukchColumn_example", // String | Header Name of the column in the input file for the type `UKCompanyHouse`.
  'valorenColumn': "valorenColumn_example", // String | Header Name of the column in the input file for the type VALOR, `Valoren (\\\"Valor\\\") Identification`.
  'wknColumn': "wknColumn_example", // String | Header Name of the column in the input file for the type WKN, `German Securities Identification`.
  'includeEntityType': ["PUB"], // [String] | Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Only candidates with an entity type specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within `inputFile`.** 
  'excludeEntityType': ["EXT"], // [String] | Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Entities with these types will be excluded from the decisions. It is a global option used to filter the candidates before taking a match decision. Candidates with an entity type specified will *not* be considered for the final match result. **Do not include within `inputFile`.** 
  'includeEntitySubType': ["PR"], // [String] | Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Only candidates with an entity subtype specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within `inputFile`.** 
  'excludeEntitySubType': ["IB"] // [String] | Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Candidates with an entity subtype specified will *not* be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within `inputFile`.** 
};

// Call api endpoint
apiInstance.getEntityTaskForList(universeId, taskName, inputFile, clientIdColumn, nameColumn, opts).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **universeId** | **Number**| The id of the universe that entities should be mapped to. Reference the &#x60;/universe&#x60; endpoint to create a universe, or view available universes via &#x60;/universes&#x60;. | 
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
 **dunsColumn** | **String**| Header Name of the column in the input file for the type DUNS, &#x60;Dun&amp;Bradstreet&#x60;. | [optional] 
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
 **includeEntityType** | [**[String]**](String.md)| Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Only candidates with an entity type specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  | [optional] 
 **excludeEntityType** | [**[String]**](String.md)| Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Entities with these types will be excluded from the decisions. It is a global option used to filter the candidates before taking a match decision. Candidates with an entity type specified will *not* be considered for the final match result. **Do not include within &#x60;inputFile&#x60;.**  | [optional] 
 **includeEntitySubType** | [**[String]**](String.md)| Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Only candidates with an entity subtype specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  | [optional] 
 **excludeEntitySubType** | [**[String]**](String.md)| Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Candidates with an entity subtype specified will *not* be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  | [optional] 

### Return type

[**EntityTaskResponse**](EntityTaskResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json;charset=utf-8, application/json


## getEntityTaskStatus

> EntityTaskStatusResponse getEntityTaskStatus(opts)

Gets the status of the requested taskId or all tasks for a User

Pulls the **status** for ALL the Entity Tasks submitted by a client within the last 30 days, and related details such as task duration and decision rates. Specific Tasks can also be retrieved by using the _taskId_ parameter.&lt;p&gt;Status types include -   * PENDING - The task has not yet started.   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 

### Example

```javascript
const { ApiClient, EntityMatchBulkApi } = require('@factset/sdk-factsetconcordance');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
//
// The confidential client instance should be reused in production environments.
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new EntityMatchBulkApi();
const opts = {
  'taskId': 31589, // Number | Name of the column for the type Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint.
  'offset': 0, // Number | Starting row for records to return or rows to skip.
  'limit': 10, // Number | Limits the number of records in the response.
  'status': ["null"] // [String] | Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 
};

// Call api endpoint
apiInstance.getEntityTaskStatus(opts).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **Number**| Name of the column for the type Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint. | [optional] 
 **offset** | **Number**| Starting row for records to return or rows to skip. | [optional] [default to 0]
 **limit** | **Number**| Limits the number of records in the response. | [optional] 
 **status** | [**[String]**](String.md)| Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted.  | [optional] 

### Return type

[**EntityTaskStatusResponse**](EntityTaskStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8, application/json

