# FactSet.SDK.FactSetConcordance.Api.EntityMatchBulkApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetEntityDecisions**](EntityMatchBulkApi.md#getentitydecisions) | **GET** /factset-concordance/v2/entity-decisions | Get the decisions of matches for the requested taskId.
[**GetEntityTaskForList**](EntityMatchBulkApi.md#getentitytaskforlist) | **POST** /factset-concordance/v2/entity-task | Input a file with names and attributes, creating a taskId.
[**GetEntityTaskStatus**](EntityMatchBulkApi.md#getentitytaskstatus) | **GET** /factset-concordance/v2/entity-task-status | Gets the status of the requested taskId or all tasks for a User



<a name="getentitydecisions"></a>
# **GetEntityDecisions**
> EntityDecisionsResponse GetEntityDecisions (int taskId, int? offset = null, int? limit = null)

Get the decisions of matches for the requested taskId.

Retrieves the `Decision` objects for an Entity Task (taskId). The decisions do not include all candidates, but rather the results of concording the requested list of names included in the input file. Mapped entities will include a FactSet Entity Identifier (-E). Results will be saved to the `universeId` specified in the input file. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetConcordance.Api;
using FactSet.SDK.FactSetConcordance.Client;
using FactSet.SDK.FactSetConcordance.Model;

namespace Example
{
    public class GetEntityDecisionsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetConcordance.Client.Configuration();

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

            var apiInstance = new EntityMatchBulkApi(config);

            var taskId = 31589;  // int | Name of the column for the type Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint.
            var offset = 0;  // int? | Starting row for records to return or rows to skip. (optional)  (default to 0)
            var limit = 10;  // int? | Limits the number of records in the response. (optional) 

            try
            {
                // Get the decisions of matches for the requested taskId.
                EntityDecisionsResponse result = apiInstance.GetEntityDecisions(taskId, offset, limit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EntityMatchBulkApi.GetEntityDecisions: " + e.Message );
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
 **taskId** | **int**| Name of the column for the type Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint. | 
 **offset** | **int?**| Starting row for records to return or rows to skip. | [optional] [default to 0]
 **limit** | **int?**| Limits the number of records in the response. | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getentitytaskforlist"></a>
# **GetEntityTaskForList**
> EntityTaskResponse GetEntityTaskForList (int universeId, string taskName, System.IO.Stream inputFile, string clientIdColumn, string nameColumn, string countryColumn = null, string urlColumn = null, string stateColumn = null, string priorityColumn = null, string bbgFigiColumn = null, string bbgTickerColumn = null, string bicColumn = null, string cikColumn = null, string crdColumn = null, string cusipColumn = null, string dunsColumn = null, string einColumn = null, string factsetIdColumn = null, string fitchColumn = null, string gvkeyColumn = null, string gvkeyIidColumn = null, string isinColumn = null, string jcnColumn = null, string leiColumn = null, string lxidColumn = null, string mdColumn = null, string redCodeColumn = null, string rssdColumn = null, string sedolColumn = null, string sprColumn = null, string tickerColumn = null, string tickerExchangeColumn = null, string tickerRegionColumn = null, string ukchColumn = null, string valorenColumn = null, string wknColumn = null, List<string> includeEntityType = null, List<string> excludeEntityType = null, List<string> includeEntitySubType = null, List<string> excludeEntitySubType = null, List<string> additionalContextColumns = null)

Input a file with names and attributes, creating a taskId.

Upload a Comma-Separated List file (.csv / UTF-8 encoding) with a list of names and attributes and receive a `taskId`. [Concordance Sample Template File](https://my.apps.factset.com/oa/cms/oaAttachment/57096850-3834-49fd-9d35-d02d72bdb142/27317). The taskId is then used for reference in the *_/entity-task-status* and *_/entity-decisions* endpoints to receive results once the task is successful.<p>This is the first step in the overall \"Bulk\" workflow. Use the /entity-task-status endpoint to check the status.</p> <p> A universeId must be included in request. If you do not have a universe created, reference the `/universe` endpoint. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetConcordance.Api;
using FactSet.SDK.FactSetConcordance.Client;
using FactSet.SDK.FactSetConcordance.Model;

namespace Example
{
    public class GetEntityTaskForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetConcordance.Client.Configuration();

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

            var apiInstance = new EntityMatchBulkApi(config);

            var universeId = 56;  // int | The id of the universe that entities should be mapped to. Reference the `/universe` endpoint to create a universe, or view available universes via `/universes`.
            var taskName = "taskName_example";  // string | User defined name for the task that will be used to name the output files.
            var inputFile = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // System.IO.Stream | The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data. 
            var clientIdColumn = "clientIdColumn_example";  // string | Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\"clientId\\\". This clientId can be used to create custom mappings or references. 
            var nameColumn = "nameColumn_example";  // string | Header name of the column in the input file that contains the Entity Name to be matched. 
            var countryColumn = "countryColumn_example";  // string | Header Name of the column in the input file that contains the country's ISO Code. This is used to filter the candidates before taking a match decision.  (optional) 
            var urlColumn = "urlColumn_example";  // string | Header Name of the column in the input file that contains the Entity's URL. URL corresponding to the entity name that is used when evaluating candidates for a match.  (optional) 
            var stateColumn = "stateColumn_example";  // string | Header Name of the column in the input file that contains the two letter State Code of the state or province where the Entity is located. Currently, only US state codes are supported.  (optional) 
            var priorityColumn = "priorityColumn_example";  // string | Header Name of the column in the inputfile that contains the priority for the client id.  (optional) 
            var bbgFigiColumn = "bbgFigiColumn_example";  // string | Header Name of the column in the input file for the type `Bloomberg Listing/Regional/Security ID`. (optional) 
            var bbgTickerColumn = "bbgTickerColumn_example";  // string | Header Name of the column in the input file for the type Bloomberg `Listing and Regional Ticker`. (optional) 
            var bicColumn = "bicColumn_example";  // string | Header Name of the column in the input file for the type BICCode, `bank indentification code`.  (optional) 
            var cikColumn = "cikColumn_example";  // string | Header Name of the column in the input file for the type CIK, `Edgar Central Index Keys` (optional) 
            var crdColumn = "crdColumn_example";  // string | Header Name of the column in the input file for the type CRD, `Central Registration Depository`. (optional) 
            var cusipColumn = "cusipColumn_example";  // string | Header Name of the column in the input file for the type `CUSIP` (optional) 
            var dunsColumn = "dunsColumn_example";  // string | Header Name of the column in the input file for the type DUNS, `Dun&Bradstreet`. (optional) 
            var einColumn = "einColumn_example";  // string | Header Name of the column in the input file for the type EIN, `EmployerIdentificationNumber`. (optional) 
            var factsetIdColumn = "factsetIdColumn_example";  // string | Header Name of the column in the input file for the type FactSet Identifier - `FactSet -E,-S,-R, -L Permanent Identifier`. (optional) 
            var fitchColumn = "fitchColumn_example";  // string | Header Name of the column in the input file for the type FitchCreditRating, `Fitch Ratings Identifier`. (optional) 
            var gvkeyColumn = "gvkeyColumn_example";  // string | Header Name of the column in the input file for the type GVKEY - `Compustat Global Company Key`. (optional) 
            var gvkeyIidColumn = "gvkeyIidColumn_example";  // string | Header Name of the column in the input file for the type GVKEY+IID - `Compustat Global Company Key and Issue Identifier`. (optional) 
            var isinColumn = "isinColumn_example";  // string | Header Name of the column in the input file for the type `ISIN`. (optional) 
            var jcnColumn = "jcnColumn_example";  // string | Header Name of the column in the input file for the type JCN - `Japanese Corporate Number`. (optional) 
            var leiColumn = "leiColumn_example";  // string | Header Name of the column in the input file for the type LEI, `LegalEntityIdentifier`. (optional) 
            var lxidColumn = "lxidColumn_example";  // string | Header Name of the column in the input file for the type LXID - `Markit Syndicated Loan Identifier`. (optional) 
            var mdColumn = "mdColumn_example";  // string | Header Name of the column in the input file for the type MoodysIssuer, `Moody's Ratings Identifier`. (optional) 
            var redCodeColumn = "redCodeColumn_example";  // string | Header Name of the column in the input file for the type Red Code - `Markit Reference Entity Identifier`. (optional) 
            var rssdColumn = "rssdColumn_example";  // string | Header Name of the column in the input file for the type RSSD, `FederalReserveRSSDIdentifier`. (optional) 
            var sedolColumn = "sedolColumn_example";  // string | Header Name of the column in the input file for the type `SEDOL`. (optional) 
            var sprColumn = "sprColumn_example";  // string | Header Name of the column in the input file for the type S&PRating, `S&P Ratings Identifier`. (optional) 
            var tickerColumn = "tickerColumn_example";  // string | Header Name of the column in the input file for the type `PriceTicker`. (optional) 
            var tickerExchangeColumn = "tickerExchangeColumn_example";  // string | Header Name of the column in the input file for the type `TickerExchange`. (optional) 
            var tickerRegionColumn = "tickerRegionColumn_example";  // string | Header Name of the column in the input file for the type `TickerRegion`. (optional) 
            var ukchColumn = "ukchColumn_example";  // string | Header Name of the column in the input file for the type `UKCompanyHouse`. (optional) 
            var valorenColumn = "valorenColumn_example";  // string | Header Name of the column in the input file for the type VALOR, `Valoren (\\\"Valor\\\") Identification`. (optional) 
            var wknColumn = "wknColumn_example";  // string | Header Name of the column in the input file for the type WKN, `German Securities Identification`. (optional) 
            var includeEntityType = new List<string>(); // List<string> | Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Only candidates with an entity type specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within `inputFile`.**  (optional) 
            var excludeEntityType = new List<string>(); // List<string> | Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Entities with these types will be excluded from the decisions. It is a global option used to filter the candidates before taking a match decision. Candidates with an entity type specified will *not* be considered for the final match result. **Do not include within `inputFile`.**  (optional) 
            var includeEntitySubType = new List<string>(); // List<string> | Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Only candidates with an entity subtype specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within `inputFile`.**  (optional) 
            var excludeEntitySubType = new List<string>(); // List<string> | Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Candidates with an entity subtype specified will *not* be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within `inputFile`.**  (optional) 
            var additionalContextColumns = new List<string>(); // List<string> | Comma separated list of any additional column names in the input file.  To be used by Managed Service for any unmapped records.  (optional) 

            try
            {
                // Input a file with names and attributes, creating a taskId.
                EntityTaskResponse result = apiInstance.GetEntityTaskForList(universeId, taskName, inputFile, clientIdColumn, nameColumn, countryColumn, urlColumn, stateColumn, priorityColumn, bbgFigiColumn, bbgTickerColumn, bicColumn, cikColumn, crdColumn, cusipColumn, dunsColumn, einColumn, factsetIdColumn, fitchColumn, gvkeyColumn, gvkeyIidColumn, isinColumn, jcnColumn, leiColumn, lxidColumn, mdColumn, redCodeColumn, rssdColumn, sedolColumn, sprColumn, tickerColumn, tickerExchangeColumn, tickerRegionColumn, ukchColumn, valorenColumn, wknColumn, includeEntityType, excludeEntityType, includeEntitySubType, excludeEntitySubType, additionalContextColumns);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EntityMatchBulkApi.GetEntityTaskForList: " + e.Message );
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
 **universeId** | **int**| The id of the universe that entities should be mapped to. Reference the &#x60;/universe&#x60; endpoint to create a universe, or view available universes via &#x60;/universes&#x60;. | 
 **taskName** | **string**| User defined name for the task that will be used to name the output files. | 
 **inputFile** | **System.IO.Stream****System.IO.Stream**| The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data.  | 
 **clientIdColumn** | **string**| Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\&quot;clientId\\\&quot;. This clientId can be used to create custom mappings or references.  | 
 **nameColumn** | **string**| Header name of the column in the input file that contains the Entity Name to be matched.  | 
 **countryColumn** | **string**| Header Name of the column in the input file that contains the country&#39;s ISO Code. This is used to filter the candidates before taking a match decision.  | [optional] 
 **urlColumn** | **string**| Header Name of the column in the input file that contains the Entity&#39;s URL. URL corresponding to the entity name that is used when evaluating candidates for a match.  | [optional] 
 **stateColumn** | **string**| Header Name of the column in the input file that contains the two letter State Code of the state or province where the Entity is located. Currently, only US state codes are supported.  | [optional] 
 **priorityColumn** | **string**| Header Name of the column in the inputfile that contains the priority for the client id.  | [optional] 
 **bbgFigiColumn** | **string**| Header Name of the column in the input file for the type &#x60;Bloomberg Listing/Regional/Security ID&#x60;. | [optional] 
 **bbgTickerColumn** | **string**| Header Name of the column in the input file for the type Bloomberg &#x60;Listing and Regional Ticker&#x60;. | [optional] 
 **bicColumn** | **string**| Header Name of the column in the input file for the type BICCode, &#x60;bank indentification code&#x60;.  | [optional] 
 **cikColumn** | **string**| Header Name of the column in the input file for the type CIK, &#x60;Edgar Central Index Keys&#x60; | [optional] 
 **crdColumn** | **string**| Header Name of the column in the input file for the type CRD, &#x60;Central Registration Depository&#x60;. | [optional] 
 **cusipColumn** | **string**| Header Name of the column in the input file for the type &#x60;CUSIP&#x60; | [optional] 
 **dunsColumn** | **string**| Header Name of the column in the input file for the type DUNS, &#x60;Dun&amp;Bradstreet&#x60;. | [optional] 
 **einColumn** | **string**| Header Name of the column in the input file for the type EIN, &#x60;EmployerIdentificationNumber&#x60;. | [optional] 
 **factsetIdColumn** | **string**| Header Name of the column in the input file for the type FactSet Identifier - &#x60;FactSet -E,-S,-R, -L Permanent Identifier&#x60;. | [optional] 
 **fitchColumn** | **string**| Header Name of the column in the input file for the type FitchCreditRating, &#x60;Fitch Ratings Identifier&#x60;. | [optional] 
 **gvkeyColumn** | **string**| Header Name of the column in the input file for the type GVKEY - &#x60;Compustat Global Company Key&#x60;. | [optional] 
 **gvkeyIidColumn** | **string**| Header Name of the column in the input file for the type GVKEY+IID - &#x60;Compustat Global Company Key and Issue Identifier&#x60;. | [optional] 
 **isinColumn** | **string**| Header Name of the column in the input file for the type &#x60;ISIN&#x60;. | [optional] 
 **jcnColumn** | **string**| Header Name of the column in the input file for the type JCN - &#x60;Japanese Corporate Number&#x60;. | [optional] 
 **leiColumn** | **string**| Header Name of the column in the input file for the type LEI, &#x60;LegalEntityIdentifier&#x60;. | [optional] 
 **lxidColumn** | **string**| Header Name of the column in the input file for the type LXID - &#x60;Markit Syndicated Loan Identifier&#x60;. | [optional] 
 **mdColumn** | **string**| Header Name of the column in the input file for the type MoodysIssuer, &#x60;Moody&#39;s Ratings Identifier&#x60;. | [optional] 
 **redCodeColumn** | **string**| Header Name of the column in the input file for the type Red Code - &#x60;Markit Reference Entity Identifier&#x60;. | [optional] 
 **rssdColumn** | **string**| Header Name of the column in the input file for the type RSSD, &#x60;FederalReserveRSSDIdentifier&#x60;. | [optional] 
 **sedolColumn** | **string**| Header Name of the column in the input file for the type &#x60;SEDOL&#x60;. | [optional] 
 **sprColumn** | **string**| Header Name of the column in the input file for the type S&amp;PRating, &#x60;S&amp;P Ratings Identifier&#x60;. | [optional] 
 **tickerColumn** | **string**| Header Name of the column in the input file for the type &#x60;PriceTicker&#x60;. | [optional] 
 **tickerExchangeColumn** | **string**| Header Name of the column in the input file for the type &#x60;TickerExchange&#x60;. | [optional] 
 **tickerRegionColumn** | **string**| Header Name of the column in the input file for the type &#x60;TickerRegion&#x60;. | [optional] 
 **ukchColumn** | **string**| Header Name of the column in the input file for the type &#x60;UKCompanyHouse&#x60;. | [optional] 
 **valorenColumn** | **string**| Header Name of the column in the input file for the type VALOR, &#x60;Valoren (\\\&quot;Valor\\\&quot;) Identification&#x60;. | [optional] 
 **wknColumn** | **string**| Header Name of the column in the input file for the type WKN, &#x60;German Securities Identification&#x60;. | [optional] 
 **includeEntityType** | [**List&lt;string&gt;**](string.md)| Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Only candidates with an entity type specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  | [optional] 
 **excludeEntityType** | [**List&lt;string&gt;**](string.md)| Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Entities with these types will be excluded from the decisions. It is a global option used to filter the candidates before taking a match decision. Candidates with an entity type specified will *not* be considered for the final match result. **Do not include within &#x60;inputFile&#x60;.**  | [optional] 
 **includeEntitySubType** | [**List&lt;string&gt;**](string.md)| Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Only candidates with an entity subtype specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  | [optional] 
 **excludeEntitySubType** | [**List&lt;string&gt;**](string.md)| Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Candidates with an entity subtype specified will *not* be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  | [optional] 
 **additionalContextColumns** | [**List&lt;string&gt;**](string.md)| Comma separated list of any additional column names in the input file.  To be used by Managed Service for any unmapped records.  | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getentitytaskstatus"></a>
# **GetEntityTaskStatus**
> EntityTaskStatusResponse GetEntityTaskStatus (int? taskId = null, int? offset = null, int? limit = null, List<string> status = null)

Gets the status of the requested taskId or all tasks for a User

Pulls the **status** for ALL the Entity Tasks submitted by a client within the last 30 days, and related details such as task duration and decision rates. Specific Tasks can also be retrieved by using the _taskId_ parameter.<p>Status types include -   * PENDING - The task has not yet started.   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetConcordance.Api;
using FactSet.SDK.FactSetConcordance.Client;
using FactSet.SDK.FactSetConcordance.Model;

namespace Example
{
    public class GetEntityTaskStatusExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetConcordance.Client.Configuration();

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

            var apiInstance = new EntityMatchBulkApi(config);

            var taskId = 31589;  // int? | Name of the column for the type Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint. (optional) 
            var offset = 0;  // int? | Starting row for records to return or rows to skip. (optional)  (default to 0)
            var limit = 10;  // int? | Limits the number of records in the response. (optional) 
            var status = new List<string>(); // List<string> | Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted.  (optional) 

            try
            {
                // Gets the status of the requested taskId or all tasks for a User
                EntityTaskStatusResponse result = apiInstance.GetEntityTaskStatus(taskId, offset, limit, status);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EntityMatchBulkApi.GetEntityTaskStatus: " + e.Message );
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
 **taskId** | **int?**| Name of the column for the type Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint. | [optional] 
 **offset** | **int?**| Starting row for records to return or rows to skip. | [optional] [default to 0]
 **limit** | **int?**| Limits the number of records in the response. | [optional] 
 **status** | [**List&lt;string&gt;**](string.md)| Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted.  | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


