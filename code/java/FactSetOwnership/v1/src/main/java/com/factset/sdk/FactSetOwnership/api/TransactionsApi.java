package com.factset.sdk.FactSetOwnership.api;

import com.factset.sdk.FactSetOwnership.ApiException;
import com.factset.sdk.FactSetOwnership.ApiClient;
import com.factset.sdk.FactSetOwnership.ApiResponse;
import com.factset.sdk.FactSetOwnership.Configuration;
import com.factset.sdk.FactSetOwnership.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetOwnership.models.ErrorResponse;
import com.factset.sdk.FactSetOwnership.models.InsiderTransactionsRequest;
import com.factset.sdk.FactSetOwnership.models.InsiderTransactionsResponse;
import com.factset.sdk.FactSetOwnership.models.InstitutionalTransactionsRequest;
import com.factset.sdk.FactSetOwnership.models.InstitutionalTransactionsResponse;
import java.time.LocalDate;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class TransactionsApi {
  private ApiClient apiClient;

  public TransactionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TransactionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getOwnershipInsiderTransactionsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOwnershipInsiderTransactionsResponseTypeMap.put(200, new GenericType<InsiderTransactionsResponse>(){});
    getOwnershipInsiderTransactionsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getOwnershipInsiderTransactionsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getOwnershipInsiderTransactionsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getOwnershipInsiderTransactionsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getOwnershipInsiderTransactionsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getOwnershipInstitutionalTransactionsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOwnershipInstitutionalTransactionsResponseTypeMap.put(200, new GenericType<InstitutionalTransactionsResponse>(){});
    getOwnershipInstitutionalTransactionsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getOwnershipInstitutionalTransactionsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getOwnershipInstitutionalTransactionsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getOwnershipInstitutionalTransactionsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getOwnershipInstitutionalTransactionsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postOwnershipInsiderTransactionsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postOwnershipInsiderTransactionsResponseTypeMap.put(200, new GenericType<InsiderTransactionsResponse>(){});
    postOwnershipInsiderTransactionsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    postOwnershipInsiderTransactionsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    postOwnershipInsiderTransactionsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    postOwnershipInsiderTransactionsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    postOwnershipInsiderTransactionsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postOwnershipInstitutionalTransactionsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postOwnershipInstitutionalTransactionsResponseTypeMap.put(200, new GenericType<InstitutionalTransactionsResponse>(){});
    postOwnershipInstitutionalTransactionsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    postOwnershipInstitutionalTransactionsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    postOwnershipInstitutionalTransactionsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    postOwnershipInstitutionalTransactionsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    postOwnershipInstitutionalTransactionsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Get insider transactions details for a list of requested identifiers.
   * Gets insider transaction details for a list of requested identifiers. 
   * @param ids Requested list of security identifiers. &lt;p&gt;***ids limit** &#x3D;  10 per request*&lt;/p  &gt; &lt;p&gt;***Batch ids limit** &#x3D;  1000 per request*&lt;/p  &gt;. (required)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  (required)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  (required)
   * @param transactionType Controls the Transaction Type of the data returned. By default, the service will return All Transaction Types.   * **A** &#x3D; All Transaction Types - returns all available transaction types.   * **P** &#x3D; Open Market Purchases - shares on the open market.   * **S** &#x3D;  Open Market Sales - selling shares on the open market.   * **PS** &#x3D; Open Market Purchases &amp; Sales - buying and selling shares on the open market.   * **O** &#x3D; Options Exercised - executing stock options to acquire shares.   * **M** &#x3D; Other Transactions - any other types of equity-related actions not covered above.  (optional, default to A)
   * @param rowExclusion Controls the exlcusion of specific transaction rows from the data returned. By default, the service will exclude Derivative and Blank Transaction Types.   * **DB** &#x3D;  Derivative and Blank Transaction Types - excludes both derivative and blank transaction types.   * **B** &#x3D; Blank Transaction Types - excludes only blank transaction types.   * **N** &#x3D;   None - includes all transaction types without exclusion.  (optional, default to DB)
   * @param currency Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional, default to LOCAL)
   * @param batch Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes.  When &#x60;batch&#x3D;Y&#x60;, the service will respond with an HTTP Status Code of 202.  Once a batch request is submitted, use batch status to see if the job has been completed.  Once completed, retrieve the results of the request via batch-result. When using Batch, ids     limit is increased to  1000 ids per request, though limits on query string via GET method still apply.  It&#39;s advised to submit large lists of ids via POST method.  (optional, default to N)
   * @return InsiderTransactionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Insider Transactions Response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public InsiderTransactionsResponse getOwnershipInsiderTransactions(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, String transactionType, String rowExclusion, String currency, String batch) throws ApiException {
    return getOwnershipInsiderTransactionsWithHttpInfo(ids, startDate, endDate, transactionType, rowExclusion, currency, batch).getData();
  }

  /**
   * Get insider transactions details for a list of requested identifiers.
   * Gets insider transaction details for a list of requested identifiers. 
   * @param ids Requested list of security identifiers. &lt;p&gt;***ids limit** &#x3D;  10 per request*&lt;/p  &gt; &lt;p&gt;***Batch ids limit** &#x3D;  1000 per request*&lt;/p  &gt;. (required)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  (required)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  (required)
   * @param transactionType Controls the Transaction Type of the data returned. By default, the service will return All Transaction Types.   * **A** &#x3D; All Transaction Types - returns all available transaction types.   * **P** &#x3D; Open Market Purchases - shares on the open market.   * **S** &#x3D;  Open Market Sales - selling shares on the open market.   * **PS** &#x3D; Open Market Purchases &amp; Sales - buying and selling shares on the open market.   * **O** &#x3D; Options Exercised - executing stock options to acquire shares.   * **M** &#x3D; Other Transactions - any other types of equity-related actions not covered above.  (optional, default to A)
   * @param rowExclusion Controls the exlcusion of specific transaction rows from the data returned. By default, the service will exclude Derivative and Blank Transaction Types.   * **DB** &#x3D;  Derivative and Blank Transaction Types - excludes both derivative and blank transaction types.   * **B** &#x3D; Blank Transaction Types - excludes only blank transaction types.   * **N** &#x3D;   None - includes all transaction types without exclusion.  (optional, default to DB)
   * @param currency Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional, default to LOCAL)
   * @param batch Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes.  When &#x60;batch&#x3D;Y&#x60;, the service will respond with an HTTP Status Code of 202.  Once a batch request is submitted, use batch status to see if the job has been completed.  Once completed, retrieve the results of the request via batch-result. When using Batch, ids     limit is increased to  1000 ids per request, though limits on query string via GET method still apply.  It&#39;s advised to submit large lists of ids via POST method.  (optional, default to N)
   * @return ApiResponse&lt;InsiderTransactionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Insider Transactions Response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InsiderTransactionsResponse> getOwnershipInsiderTransactionsWithHttpInfo(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, String transactionType, String rowExclusion, String currency, String batch) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getOwnershipInsiderTransactions");
    }
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling getOwnershipInsiderTransactions");
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling getOwnershipInsiderTransactions");
    }
    
    // create path and map variables
    String localVarPath = "/transactions/insider";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "transactionType", transactionType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rowExclusion", rowExclusion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "batch", batch));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InsiderTransactionsResponse
      
    > apiResponse = apiClient.invokeAPI("TransactionsApi.getOwnershipInsiderTransactions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOwnershipInsiderTransactionsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get institutional transaction details for a list of requested identifiers.
   * Get institutional transaction details for a list of requested identifiers. 
   * @param ids Requested list of security identifiers. &lt;p&gt;***ids limit** &#x3D;  10 per request*&lt;/p  &gt; &lt;p&gt;***Batch ids limit** &#x3D;  1000 per request*&lt;/p  &gt;. (required)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  (required)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  (required)
   * @param currency Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional, default to LOCAL)
   * @param frequency Controls the display frequency of the data returned.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **MTD** &#x3D; Month-to-date   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **CQTD** &#x3D;  Calendar quarter-to-date   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **CYTD** &#x3D; Calendar Year-to-date.  (optional, default to M)
   * @param topNHolders Specifies the number of top holders whose data is returned.   * **ALL** &#x3D; All holders   * **5** &#x3D; Top 5 Institutional Holders   * **10** &#x3D; Top 10 Institutional Holders   * **25** &#x3D; Top 25 Institutional Holders   * **50** &#x3D; Top 50 Institutional Holders   * **100** &#x3D; Top 100 Institutional Holders  (optional, default to 25)
   * @param holderType Controls the Holder Type of the data returned. By default, the service will return Institutional Holders. Requesting All Holders is not currently supported. Only a single Holder Type is allowed per request.   * **F** &#x3D; Institutions   * **M** &#x3D; Mutual Funds   * **S** &#x3D;  Insiders/Stakeholders   * **FS** &#x3D; Institutions/Insiders   * **B** &#x3D; Beneficial Owners  (optional, default to F)
   * @param periodOfMeasure Determines the range over which the code calculates change for Percent Ownership and Position Change.   * **1M** &#x3D; 1 Month (last 30 days)   * **3M** &#x3D; 3 Months (last 90 days)   * **6M** &#x3D; 6 Months (last 180 days)   * **12M** &#x3D; 12 Months (last 365 days)  (optional, default to 6M)
   * @param batch Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes.  When &#x60;batch&#x3D;Y&#x60;, the service will respond with an HTTP Status Code of 202.  Once a batch request is submitted, use batch status to see if the job has been completed.  Once completed, retrieve the results of the request via batch-result. When using Batch, ids     limit is increased to  1000 ids per request, though limits on query string via GET method still apply.  It&#39;s advised to submit large lists of ids via POST method.  (optional, default to N)
   * @return InstitutionalTransactionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Institutional Transactions Response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public InstitutionalTransactionsResponse getOwnershipInstitutionalTransactions(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, String currency, String frequency, String topNHolders, String holderType, String periodOfMeasure, String batch) throws ApiException {
    return getOwnershipInstitutionalTransactionsWithHttpInfo(ids, startDate, endDate, currency, frequency, topNHolders, holderType, periodOfMeasure, batch).getData();
  }

  /**
   * Get institutional transaction details for a list of requested identifiers.
   * Get institutional transaction details for a list of requested identifiers. 
   * @param ids Requested list of security identifiers. &lt;p&gt;***ids limit** &#x3D;  10 per request*&lt;/p  &gt; &lt;p&gt;***Batch ids limit** &#x3D;  1000 per request*&lt;/p  &gt;. (required)
   * @param startDate The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  (required)
   * @param endDate The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  (required)
   * @param currency Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional, default to LOCAL)
   * @param frequency Controls the display frequency of the data returned.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **MTD** &#x3D; Month-to-date   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **CQTD** &#x3D;  Calendar quarter-to-date   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **CYTD** &#x3D; Calendar Year-to-date.  (optional, default to M)
   * @param topNHolders Specifies the number of top holders whose data is returned.   * **ALL** &#x3D; All holders   * **5** &#x3D; Top 5 Institutional Holders   * **10** &#x3D; Top 10 Institutional Holders   * **25** &#x3D; Top 25 Institutional Holders   * **50** &#x3D; Top 50 Institutional Holders   * **100** &#x3D; Top 100 Institutional Holders  (optional, default to 25)
   * @param holderType Controls the Holder Type of the data returned. By default, the service will return Institutional Holders. Requesting All Holders is not currently supported. Only a single Holder Type is allowed per request.   * **F** &#x3D; Institutions   * **M** &#x3D; Mutual Funds   * **S** &#x3D;  Insiders/Stakeholders   * **FS** &#x3D; Institutions/Insiders   * **B** &#x3D; Beneficial Owners  (optional, default to F)
   * @param periodOfMeasure Determines the range over which the code calculates change for Percent Ownership and Position Change.   * **1M** &#x3D; 1 Month (last 30 days)   * **3M** &#x3D; 3 Months (last 90 days)   * **6M** &#x3D; 6 Months (last 180 days)   * **12M** &#x3D; 12 Months (last 365 days)  (optional, default to 6M)
   * @param batch Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes.  When &#x60;batch&#x3D;Y&#x60;, the service will respond with an HTTP Status Code of 202.  Once a batch request is submitted, use batch status to see if the job has been completed.  Once completed, retrieve the results of the request via batch-result. When using Batch, ids     limit is increased to  1000 ids per request, though limits on query string via GET method still apply.  It&#39;s advised to submit large lists of ids via POST method.  (optional, default to N)
   * @return ApiResponse&lt;InstitutionalTransactionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Institutional Transactions Response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InstitutionalTransactionsResponse> getOwnershipInstitutionalTransactionsWithHttpInfo(java.util.List<String> ids, LocalDate startDate, LocalDate endDate, String currency, String frequency, String topNHolders, String holderType, String periodOfMeasure, String batch) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getOwnershipInstitutionalTransactions");
    }
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling getOwnershipInstitutionalTransactions");
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling getOwnershipInstitutionalTransactions");
    }
    
    // create path and map variables
    String localVarPath = "/transactions/institutional";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "frequency", frequency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "topNHolders", topNHolders));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "holderType", holderType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "periodOfMeasure", periodOfMeasure));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "batch", batch));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InstitutionalTransactionsResponse
      
    > apiResponse = apiClient.invokeAPI("TransactionsApi.getOwnershipInstitutionalTransactions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOwnershipInstitutionalTransactionsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get insider transactions details for a list of requested identifiers.
   * Gets insider transaction details for a list of requested identifiers.
   * @param insiderTransactionsRequest Requesting Insider Transaction Details (required)
   * @return InsiderTransactionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Insider Transactions Response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public InsiderTransactionsResponse postOwnershipInsiderTransactions(InsiderTransactionsRequest insiderTransactionsRequest) throws ApiException {
    return postOwnershipInsiderTransactionsWithHttpInfo(insiderTransactionsRequest).getData();
  }

  /**
   * Get insider transactions details for a list of requested identifiers.
   * Gets insider transaction details for a list of requested identifiers.
   * @param insiderTransactionsRequest Requesting Insider Transaction Details (required)
   * @return ApiResponse&lt;InsiderTransactionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Insider Transactions Response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InsiderTransactionsResponse> postOwnershipInsiderTransactionsWithHttpInfo(InsiderTransactionsRequest insiderTransactionsRequest) throws ApiException {
    Object localVarPostBody = insiderTransactionsRequest;
    
    // verify the required parameter 'insiderTransactionsRequest' is set
    if (insiderTransactionsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'insiderTransactionsRequest' when calling postOwnershipInsiderTransactions");
    }
    
    // create path and map variables
    String localVarPath = "/transactions/insider";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InsiderTransactionsResponse
      
    > apiResponse = apiClient.invokeAPI("TransactionsApi.postOwnershipInsiderTransactions", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postOwnershipInsiderTransactionsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Gets institutional transaction details for a list of requested identifiers.
   * Gets institutional transaction details for a list of requested identifiers.
   * @param institutionalTransactionsRequest Requesting Institutional Transaction Details (required)
   * @return InstitutionalTransactionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Institutional Transactions Response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public InstitutionalTransactionsResponse postOwnershipInstitutionalTransactions(InstitutionalTransactionsRequest institutionalTransactionsRequest) throws ApiException {
    return postOwnershipInstitutionalTransactionsWithHttpInfo(institutionalTransactionsRequest).getData();
  }

  /**
   * Gets institutional transaction details for a list of requested identifiers.
   * Gets institutional transaction details for a list of requested identifiers.
   * @param institutionalTransactionsRequest Requesting Institutional Transaction Details (required)
   * @return ApiResponse&lt;InstitutionalTransactionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Institutional Transactions Response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InstitutionalTransactionsResponse> postOwnershipInstitutionalTransactionsWithHttpInfo(InstitutionalTransactionsRequest institutionalTransactionsRequest) throws ApiException {
    Object localVarPostBody = institutionalTransactionsRequest;
    
    // verify the required parameter 'institutionalTransactionsRequest' is set
    if (institutionalTransactionsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'institutionalTransactionsRequest' when calling postOwnershipInstitutionalTransactions");
    }
    
    // create path and map variables
    String localVarPath = "/transactions/institutional";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InstitutionalTransactionsResponse
      
    > apiResponse = apiClient.invokeAPI("TransactionsApi.postOwnershipInstitutionalTransactions", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postOwnershipInstitutionalTransactionsResponseTypeMap, false);

    return apiResponse;

  }
}
