package com.factset.sdk.FactSetConcordance.api;

import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiResponse;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetConcordance.models.EntityDecisionsResponse;
import com.factset.sdk.FactSetConcordance.models.EntityTaskResponse;
import com.factset.sdk.FactSetConcordance.models.EntityTaskStatusResponse;
import com.factset.sdk.FactSetConcordance.models.ErrorResponse;
import java.io.File;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EntityMatchBulkApi {
  private ApiClient apiClient;

  public EntityMatchBulkApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EntityMatchBulkApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getEntityDecisionsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEntityDecisionsResponseTypeMap.put(200, new GenericType<EntityDecisionsResponse>(){});
    getEntityDecisionsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEntityDecisionsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getEntityDecisionsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getEntityDecisionsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getEntityDecisionsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getEntityTaskForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEntityTaskForListResponseTypeMap.put(200, new GenericType<EntityTaskResponse>(){});
    getEntityTaskForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEntityTaskForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getEntityTaskForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getEntityTaskForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getEntityTaskForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getEntityTaskStatusResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEntityTaskStatusResponseTypeMap.put(200, new GenericType<EntityTaskStatusResponse>(){});
    getEntityTaskStatusResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEntityTaskStatusResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getEntityTaskStatusResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getEntityTaskStatusResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getEntityTaskStatusResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  


  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the decisions of matches for the requested taskId.
   * Retrieves the &#x60;Decision&#x60; objects for an Entity Task (taskId). The decisions do not include all candidates, but rather the results of concording the requested list of names included in the input file. Mapped entities will include a FactSet Entity Identifier (-E). Results will be saved to the &#x60;universeId&#x60; specified in the input file. 
   * @param taskId Name of the column for the type Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint. (required)
   * @param offset Starting row for records to return or rows to skip. (optional, default to 0)
   * @param limit Limits the number of records in the response. (optional)
   * @return EntityDecisionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for Entity Decisions endpoint. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public EntityDecisionsResponse getEntityDecisions(Integer taskId, Integer offset, Integer limit) throws ApiException {
    return getEntityDecisionsWithHttpInfo(taskId, offset, limit).getData();
  }

  /**
   * Get the decisions of matches for the requested taskId.
   * Retrieves the &#x60;Decision&#x60; objects for an Entity Task (taskId). The decisions do not include all candidates, but rather the results of concording the requested list of names included in the input file. Mapped entities will include a FactSet Entity Identifier (-E). Results will be saved to the &#x60;universeId&#x60; specified in the input file. 
   * @param taskId Name of the column for the type Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint. (required)
   * @param offset Starting row for records to return or rows to skip. (optional, default to 0)
   * @param limit Limits the number of records in the response. (optional)
   * @return ApiResponse&lt;EntityDecisionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for Entity Decisions endpoint. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntityDecisionsResponse> getEntityDecisionsWithHttpInfo(Integer taskId, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling getEntityDecisions");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/entity-decisions";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taskId", taskId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=utf-8", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EntityDecisionsResponse
      
    > apiResponse = apiClient.invokeAPI("EntityMatchBulkApi.getEntityDecisions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEntityDecisionsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Input a file with names and attributes, creating a taskId.
   * Upload a Comma-Separated List file (.csv / UTF-8 encoding) with a list of names and attributes and receive a &#x60;taskId&#x60;. [Concordance Sample Template File](https://my.apps.factset.com/oa/cms/oaAttachment/57096850-3834-49fd-9d35-d02d72bdb142/27317). The taskId is then used for reference in the *_/entity-task-status* and *_/entity-decisions* endpoints to receive results once the task is successful.&lt;p&gt;This is the first step in the overall \&quot;Bulk\&quot; workflow. Use the /entity-task-status endpoint to check the status.&lt;/p&gt; &lt;p&gt; A universeId must be included in request. If you do not have a universe created, reference the &#x60;/universe&#x60; endpoint. 
   * @param universeId The id of the universe that entities should be mapped to. Reference the &#x60;/universe&#x60; endpoint to create a universe, or view available universes via &#x60;/universes&#x60;. (required)
   * @param taskName User defined name for the task that will be used to name the output files. (required)
   * @param inputFile The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data.  (required)
   * @param clientIdColumn Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\&quot;clientId\\\&quot;. This clientId can be used to create custom mappings or references.  (required)
   * @param nameColumn Header name of the column in the input file that contains the Entity Name to be matched.  (required)
   * @param countryColumn Header Name of the column in the input file that contains the country&#39;s ISO Code. This is used to filter the candidates before taking a match decision.  (optional)
   * @param urlColumn Header Name of the column in the input file that contains the Entity&#39;s URL. URL corresponding to the entity name that is used when evaluating candidates for a match.  (optional)
   * @param stateColumn Header Name of the column in the input file that contains the two letter State Code of the state or province where the Entity is located. Currently, only US state codes are supported.  (optional)
   * @param priorityColumn Header Name of the column in the inputfile that contains the priority for the client id.  (optional)
   * @param bbgFigiColumn Header Name of the column in the input file for the type &#x60;Bloomberg Listing/Regional/Security ID&#x60;. (optional)
   * @param bbgTickerColumn Header Name of the column in the input file for the type Bloomberg &#x60;Listing and Regional Ticker&#x60;. (optional)
   * @param bicColumn Header Name of the column in the input file for the type BICCode, &#x60;bank indentification code&#x60;.  (optional)
   * @param cikColumn Header Name of the column in the input file for the type CIK, &#x60;Edgar Central Index Keys&#x60; (optional)
   * @param crdColumn Header Name of the column in the input file for the type CRD, &#x60;Central Registration Depository&#x60;. (optional)
   * @param cusipColumn Header Name of the column in the input file for the type &#x60;CUSIP&#x60; (optional)
   * @param einColumn Header Name of the column in the input file for the type EIN, &#x60;EmployerIdentificationNumber&#x60;. (optional)
   * @param factsetIdColumn Header Name of the column in the input file for the type FactSet Identifier - &#x60;FactSet -E,-S,-R, -L Permanent Identifier&#x60;. (optional)
   * @param fitchColumn Header Name of the column in the input file for the type FitchCreditRating, &#x60;Fitch Ratings Identifier&#x60;. (optional)
   * @param gvkeyColumn Header Name of the column in the input file for the type GVKEY - &#x60;Compustat Global Company Key&#x60;. (optional)
   * @param gvkeyIidColumn Header Name of the column in the input file for the type GVKEY+IID - &#x60;Compustat Global Company Key and Issue Identifier&#x60;. (optional)
   * @param isinColumn Header Name of the column in the input file for the type &#x60;ISIN&#x60;. (optional)
   * @param jcnColumn Header Name of the column in the input file for the type JCN - &#x60;Japanese Corporate Number&#x60;. (optional)
   * @param leiColumn Header Name of the column in the input file for the type LEI, &#x60;LegalEntityIdentifier&#x60;. (optional)
   * @param lxidColumn Header Name of the column in the input file for the type LXID - &#x60;Markit Syndicated Loan Identifier&#x60;. (optional)
   * @param mdColumn Header Name of the column in the input file for the type MoodysIssuer, &#x60;Moody&#39;s Ratings Identifier&#x60;. (optional)
   * @param redCodeColumn Header Name of the column in the input file for the type Red Code - &#x60;Markit Reference Entity Identifier&#x60;. (optional)
   * @param rssdColumn Header Name of the column in the input file for the type RSSD, &#x60;FederalReserveRSSDIdentifier&#x60;. (optional)
   * @param sedolColumn Header Name of the column in the input file for the type &#x60;SEDOL&#x60;. (optional)
   * @param sprColumn Header Name of the column in the input file for the type S&amp;PRating, &#x60;S&amp;P Ratings Identifier&#x60;. (optional)
   * @param tickerColumn Header Name of the column in the input file for the type &#x60;PriceTicker&#x60;. (optional)
   * @param tickerExchangeColumn Header Name of the column in the input file for the type &#x60;TickerExchange&#x60;. (optional)
   * @param tickerRegionColumn Header Name of the column in the input file for the type &#x60;TickerRegion&#x60;. (optional)
   * @param ukchColumn Header Name of the column in the input file for the type &#x60;UKCompanyHouse&#x60;. (optional)
   * @param valorenColumn Header Name of the column in the input file for the type VALOR, &#x60;Valoren (\\\&quot;Valor\\\&quot;) Identification&#x60;. (optional)
   * @param wknColumn Header Name of the column in the input file for the type WKN, &#x60;German Securities Identification&#x60;. (optional)
   * @param includeEntityType Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Only candidates with an entity type specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  (optional)
   * @param excludeEntityType Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Entities with these types will be excluded from the decisions. It is a global option used to filter the candidates before taking a match decision. Candidates with an entity type specified will *not* be considered for the final match result. **Do not include within &#x60;inputFile&#x60;.**  (optional)
   * @param includeEntitySubType Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Only candidates with an entity subtype specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  (optional)
   * @param excludeEntitySubType Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Candidates with an entity subtype specified will *not* be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  (optional)
   * @param additionalContextColumns Comma separated list of any additional column names in the input file.  To be used by Managed Service for any unmapped records.  (optional)
   * @param autoRemap When &#x60;true&#x60;, automatically re-evaluates and overwrites existing mappings using updated metadata submitted in this task. Applicable when the specified universe has auto-remap set to true. **Caution: Mapping updates cannot be undone.**  (optional)
   * @return EntityTaskResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK. The Entity Task creation is submitted. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public EntityTaskResponse getEntityTaskForList(Integer universeId, String taskName, File inputFile, String clientIdColumn, String nameColumn, String countryColumn, String urlColumn, String stateColumn, String priorityColumn, String bbgFigiColumn, String bbgTickerColumn, String bicColumn, String cikColumn, String crdColumn, String cusipColumn, String einColumn, String factsetIdColumn, String fitchColumn, String gvkeyColumn, String gvkeyIidColumn, String isinColumn, String jcnColumn, String leiColumn, String lxidColumn, String mdColumn, String redCodeColumn, String rssdColumn, String sedolColumn, String sprColumn, String tickerColumn, String tickerExchangeColumn, String tickerRegionColumn, String ukchColumn, String valorenColumn, String wknColumn, java.util.List<String> includeEntityType, java.util.List<String> excludeEntityType, java.util.List<String> includeEntitySubType, java.util.List<String> excludeEntitySubType, java.util.List<String> additionalContextColumns, Boolean autoRemap) throws ApiException {
    return getEntityTaskForListWithHttpInfo(universeId, taskName, inputFile, clientIdColumn, nameColumn, countryColumn, urlColumn, stateColumn, priorityColumn, bbgFigiColumn, bbgTickerColumn, bicColumn, cikColumn, crdColumn, cusipColumn, einColumn, factsetIdColumn, fitchColumn, gvkeyColumn, gvkeyIidColumn, isinColumn, jcnColumn, leiColumn, lxidColumn, mdColumn, redCodeColumn, rssdColumn, sedolColumn, sprColumn, tickerColumn, tickerExchangeColumn, tickerRegionColumn, ukchColumn, valorenColumn, wknColumn, includeEntityType, excludeEntityType, includeEntitySubType, excludeEntitySubType, additionalContextColumns, autoRemap).getData();
  }

  /**
   * Input a file with names and attributes, creating a taskId.
   * Upload a Comma-Separated List file (.csv / UTF-8 encoding) with a list of names and attributes and receive a &#x60;taskId&#x60;. [Concordance Sample Template File](https://my.apps.factset.com/oa/cms/oaAttachment/57096850-3834-49fd-9d35-d02d72bdb142/27317). The taskId is then used for reference in the *_/entity-task-status* and *_/entity-decisions* endpoints to receive results once the task is successful.&lt;p&gt;This is the first step in the overall \&quot;Bulk\&quot; workflow. Use the /entity-task-status endpoint to check the status.&lt;/p&gt; &lt;p&gt; A universeId must be included in request. If you do not have a universe created, reference the &#x60;/universe&#x60; endpoint. 
   * @param universeId The id of the universe that entities should be mapped to. Reference the &#x60;/universe&#x60; endpoint to create a universe, or view available universes via &#x60;/universes&#x60;. (required)
   * @param taskName User defined name for the task that will be used to name the output files. (required)
   * @param inputFile The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data.  (required)
   * @param clientIdColumn Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\&quot;clientId\\\&quot;. This clientId can be used to create custom mappings or references.  (required)
   * @param nameColumn Header name of the column in the input file that contains the Entity Name to be matched.  (required)
   * @param countryColumn Header Name of the column in the input file that contains the country&#39;s ISO Code. This is used to filter the candidates before taking a match decision.  (optional)
   * @param urlColumn Header Name of the column in the input file that contains the Entity&#39;s URL. URL corresponding to the entity name that is used when evaluating candidates for a match.  (optional)
   * @param stateColumn Header Name of the column in the input file that contains the two letter State Code of the state or province where the Entity is located. Currently, only US state codes are supported.  (optional)
   * @param priorityColumn Header Name of the column in the inputfile that contains the priority for the client id.  (optional)
   * @param bbgFigiColumn Header Name of the column in the input file for the type &#x60;Bloomberg Listing/Regional/Security ID&#x60;. (optional)
   * @param bbgTickerColumn Header Name of the column in the input file for the type Bloomberg &#x60;Listing and Regional Ticker&#x60;. (optional)
   * @param bicColumn Header Name of the column in the input file for the type BICCode, &#x60;bank indentification code&#x60;.  (optional)
   * @param cikColumn Header Name of the column in the input file for the type CIK, &#x60;Edgar Central Index Keys&#x60; (optional)
   * @param crdColumn Header Name of the column in the input file for the type CRD, &#x60;Central Registration Depository&#x60;. (optional)
   * @param cusipColumn Header Name of the column in the input file for the type &#x60;CUSIP&#x60; (optional)
   * @param einColumn Header Name of the column in the input file for the type EIN, &#x60;EmployerIdentificationNumber&#x60;. (optional)
   * @param factsetIdColumn Header Name of the column in the input file for the type FactSet Identifier - &#x60;FactSet -E,-S,-R, -L Permanent Identifier&#x60;. (optional)
   * @param fitchColumn Header Name of the column in the input file for the type FitchCreditRating, &#x60;Fitch Ratings Identifier&#x60;. (optional)
   * @param gvkeyColumn Header Name of the column in the input file for the type GVKEY - &#x60;Compustat Global Company Key&#x60;. (optional)
   * @param gvkeyIidColumn Header Name of the column in the input file for the type GVKEY+IID - &#x60;Compustat Global Company Key and Issue Identifier&#x60;. (optional)
   * @param isinColumn Header Name of the column in the input file for the type &#x60;ISIN&#x60;. (optional)
   * @param jcnColumn Header Name of the column in the input file for the type JCN - &#x60;Japanese Corporate Number&#x60;. (optional)
   * @param leiColumn Header Name of the column in the input file for the type LEI, &#x60;LegalEntityIdentifier&#x60;. (optional)
   * @param lxidColumn Header Name of the column in the input file for the type LXID - &#x60;Markit Syndicated Loan Identifier&#x60;. (optional)
   * @param mdColumn Header Name of the column in the input file for the type MoodysIssuer, &#x60;Moody&#39;s Ratings Identifier&#x60;. (optional)
   * @param redCodeColumn Header Name of the column in the input file for the type Red Code - &#x60;Markit Reference Entity Identifier&#x60;. (optional)
   * @param rssdColumn Header Name of the column in the input file for the type RSSD, &#x60;FederalReserveRSSDIdentifier&#x60;. (optional)
   * @param sedolColumn Header Name of the column in the input file for the type &#x60;SEDOL&#x60;. (optional)
   * @param sprColumn Header Name of the column in the input file for the type S&amp;PRating, &#x60;S&amp;P Ratings Identifier&#x60;. (optional)
   * @param tickerColumn Header Name of the column in the input file for the type &#x60;PriceTicker&#x60;. (optional)
   * @param tickerExchangeColumn Header Name of the column in the input file for the type &#x60;TickerExchange&#x60;. (optional)
   * @param tickerRegionColumn Header Name of the column in the input file for the type &#x60;TickerRegion&#x60;. (optional)
   * @param ukchColumn Header Name of the column in the input file for the type &#x60;UKCompanyHouse&#x60;. (optional)
   * @param valorenColumn Header Name of the column in the input file for the type VALOR, &#x60;Valoren (\\\&quot;Valor\\\&quot;) Identification&#x60;. (optional)
   * @param wknColumn Header Name of the column in the input file for the type WKN, &#x60;German Securities Identification&#x60;. (optional)
   * @param includeEntityType Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Only candidates with an entity type specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  (optional)
   * @param excludeEntityType Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Entities with these types will be excluded from the decisions. It is a global option used to filter the candidates before taking a match decision. Candidates with an entity type specified will *not* be considered for the final match result. **Do not include within &#x60;inputFile&#x60;.**  (optional)
   * @param includeEntitySubType Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Only candidates with an entity subtype specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  (optional)
   * @param excludeEntitySubType Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Candidates with an entity subtype specified will *not* be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  (optional)
   * @param additionalContextColumns Comma separated list of any additional column names in the input file.  To be used by Managed Service for any unmapped records.  (optional)
   * @param autoRemap When &#x60;true&#x60;, automatically re-evaluates and overwrites existing mappings using updated metadata submitted in this task. Applicable when the specified universe has auto-remap set to true. **Caution: Mapping updates cannot be undone.**  (optional)
   * @return ApiResponse&lt;EntityTaskResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK. The Entity Task creation is submitted. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntityTaskResponse> getEntityTaskForListWithHttpInfo(Integer universeId, String taskName, File inputFile, String clientIdColumn, String nameColumn, String countryColumn, String urlColumn, String stateColumn, String priorityColumn, String bbgFigiColumn, String bbgTickerColumn, String bicColumn, String cikColumn, String crdColumn, String cusipColumn, String einColumn, String factsetIdColumn, String fitchColumn, String gvkeyColumn, String gvkeyIidColumn, String isinColumn, String jcnColumn, String leiColumn, String lxidColumn, String mdColumn, String redCodeColumn, String rssdColumn, String sedolColumn, String sprColumn, String tickerColumn, String tickerExchangeColumn, String tickerRegionColumn, String ukchColumn, String valorenColumn, String wknColumn, java.util.List<String> includeEntityType, java.util.List<String> excludeEntityType, java.util.List<String> includeEntitySubType, java.util.List<String> excludeEntitySubType, java.util.List<String> additionalContextColumns, Boolean autoRemap) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'universeId' is set
    if (universeId == null) {
      throw new ApiException(400, "Missing the required parameter 'universeId' when calling getEntityTaskForList");
    }
    
    // verify the required parameter 'taskName' is set
    if (taskName == null) {
      throw new ApiException(400, "Missing the required parameter 'taskName' when calling getEntityTaskForList");
    }
    
    // verify the required parameter 'inputFile' is set
    if (inputFile == null) {
      throw new ApiException(400, "Missing the required parameter 'inputFile' when calling getEntityTaskForList");
    }
    
    // verify the required parameter 'clientIdColumn' is set
    if (clientIdColumn == null) {
      throw new ApiException(400, "Missing the required parameter 'clientIdColumn' when calling getEntityTaskForList");
    }
    
    // verify the required parameter 'nameColumn' is set
    if (nameColumn == null) {
      throw new ApiException(400, "Missing the required parameter 'nameColumn' when calling getEntityTaskForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/entity-task";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    if (universeId != null)
      localVarFormParams.put("universeId", universeId);
if (taskName != null)
      localVarFormParams.put("taskName", taskName);
if (inputFile != null)
      localVarFormParams.put("inputFile", inputFile);
if (clientIdColumn != null)
      localVarFormParams.put("clientIdColumn", clientIdColumn);
if (nameColumn != null)
      localVarFormParams.put("nameColumn", nameColumn);
if (countryColumn != null)
      localVarFormParams.put("countryColumn", countryColumn);
if (urlColumn != null)
      localVarFormParams.put("urlColumn", urlColumn);
if (stateColumn != null)
      localVarFormParams.put("stateColumn", stateColumn);
if (priorityColumn != null)
      localVarFormParams.put("priorityColumn", priorityColumn);
if (bbgFigiColumn != null)
      localVarFormParams.put("bbgFigiColumn", bbgFigiColumn);
if (bbgTickerColumn != null)
      localVarFormParams.put("bbgTickerColumn", bbgTickerColumn);
if (bicColumn != null)
      localVarFormParams.put("bicColumn", bicColumn);
if (cikColumn != null)
      localVarFormParams.put("cikColumn", cikColumn);
if (crdColumn != null)
      localVarFormParams.put("crdColumn", crdColumn);
if (cusipColumn != null)
      localVarFormParams.put("cusipColumn", cusipColumn);
if (einColumn != null)
      localVarFormParams.put("einColumn", einColumn);
if (factsetIdColumn != null)
      localVarFormParams.put("factsetIdColumn", factsetIdColumn);
if (fitchColumn != null)
      localVarFormParams.put("fitchColumn", fitchColumn);
if (gvkeyColumn != null)
      localVarFormParams.put("gvkeyColumn", gvkeyColumn);
if (gvkeyIidColumn != null)
      localVarFormParams.put("gvkeyIidColumn", gvkeyIidColumn);
if (isinColumn != null)
      localVarFormParams.put("isinColumn", isinColumn);
if (jcnColumn != null)
      localVarFormParams.put("jcnColumn", jcnColumn);
if (leiColumn != null)
      localVarFormParams.put("leiColumn", leiColumn);
if (lxidColumn != null)
      localVarFormParams.put("lxidColumn", lxidColumn);
if (mdColumn != null)
      localVarFormParams.put("mdColumn", mdColumn);
if (redCodeColumn != null)
      localVarFormParams.put("redCodeColumn", redCodeColumn);
if (rssdColumn != null)
      localVarFormParams.put("rssdColumn", rssdColumn);
if (sedolColumn != null)
      localVarFormParams.put("sedolColumn", sedolColumn);
if (sprColumn != null)
      localVarFormParams.put("sprColumn", sprColumn);
if (tickerColumn != null)
      localVarFormParams.put("tickerColumn", tickerColumn);
if (tickerExchangeColumn != null)
      localVarFormParams.put("tickerExchangeColumn", tickerExchangeColumn);
if (tickerRegionColumn != null)
      localVarFormParams.put("tickerRegionColumn", tickerRegionColumn);
if (ukchColumn != null)
      localVarFormParams.put("ukchColumn", ukchColumn);
if (valorenColumn != null)
      localVarFormParams.put("valorenColumn", valorenColumn);
if (wknColumn != null)
      localVarFormParams.put("wknColumn", wknColumn);
if (includeEntityType != null)
      localVarFormParams.put("includeEntityType", includeEntityType);
if (excludeEntityType != null)
      localVarFormParams.put("excludeEntityType", excludeEntityType);
if (includeEntitySubType != null)
      localVarFormParams.put("includeEntitySubType", includeEntitySubType);
if (excludeEntitySubType != null)
      localVarFormParams.put("excludeEntitySubType", excludeEntitySubType);
if (additionalContextColumns != null)
      localVarFormParams.put("additionalContextColumns", additionalContextColumns);
if (autoRemap != null)
      localVarFormParams.put("autoRemap", autoRemap);

    final String[] localVarAccepts = {
      "application/json;charset=utf-8", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EntityTaskResponse
      
    > apiResponse = apiClient.invokeAPI("EntityMatchBulkApi.getEntityTaskForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEntityTaskForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Gets the status of the requested taskId or all tasks for a User
   * Pulls the **status** for ALL the Entity Tasks submitted by a client within the last 30 days, and related details such as task duration and decision rates. Specific Tasks can also be retrieved by using the _taskId_ parameter.&lt;p&gt;Status types include -   * PENDING - The task has not yet started.   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 
   * @param taskId Name of the column for the type Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint. (optional)
   * @param offset Starting row for records to return or rows to skip. (optional, default to 0)
   * @param limit Limits the number of records in the response. (optional)
   * @param status Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted.  (optional)
   * @return EntityTaskStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for Task Status endpoint. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public EntityTaskStatusResponse getEntityTaskStatus(Integer taskId, Integer offset, Integer limit, java.util.List<String> status) throws ApiException {
    return getEntityTaskStatusWithHttpInfo(taskId, offset, limit, status).getData();
  }

  /**
   * Gets the status of the requested taskId or all tasks for a User
   * Pulls the **status** for ALL the Entity Tasks submitted by a client within the last 30 days, and related details such as task duration and decision rates. Specific Tasks can also be retrieved by using the _taskId_ parameter.&lt;p&gt;Status types include -   * PENDING - The task has not yet started.   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 
   * @param taskId Name of the column for the type Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint. (optional)
   * @param offset Starting row for records to return or rows to skip. (optional, default to 0)
   * @param limit Limits the number of records in the response. (optional)
   * @param status Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted.  (optional)
   * @return ApiResponse&lt;EntityTaskStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response object for Task Status endpoint. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntityTaskStatusResponse> getEntityTaskStatusWithHttpInfo(Integer taskId, Integer offset, Integer limit, java.util.List<String> status) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/entity-task-status";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taskId", taskId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "status", status));

    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=utf-8", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EntityTaskStatusResponse
      
    > apiResponse = apiClient.invokeAPI("EntityMatchBulkApi.getEntityTaskStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEntityTaskStatusResponseTypeMap, false);

    return apiResponse;

  }
}
