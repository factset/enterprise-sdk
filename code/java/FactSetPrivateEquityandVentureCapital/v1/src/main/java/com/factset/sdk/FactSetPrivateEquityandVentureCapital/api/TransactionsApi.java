package com.factset.sdk.FactSetPrivateEquityandVentureCapital.api;

import com.factset.sdk.FactSetPrivateEquityandVentureCapital.ApiException;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.ApiClient;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.ApiResponse;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.Configuration;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.ErrorResponse;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.TransactionDetailsResponse;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.TransactionMaActivityResponse;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.TransactionSearchRequest;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.TransactionSearchResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class TransactionsApi {
  private ApiClient apiClient;

  public TransactionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TransactionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getTransactionResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTransactionResponseTypeMap.put(200, new GenericType<TransactionDetailsResponse>(){});
    getTransactionResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getTransactionResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getTransactionResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getTransactionResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getTransactionResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getTransactionMAActivityResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTransactionMAActivityResponseTypeMap.put(200, new GenericType<TransactionMaActivityResponse>(){});
    getTransactionMAActivityResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getTransactionMAActivityResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getTransactionMAActivityResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getTransactionMAActivityResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getTransactionMAActivityResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> searchTransactionsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    searchTransactionsResponseTypeMap.put(200, new GenericType<TransactionSearchResponse>(){});
    searchTransactionsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    searchTransactionsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    searchTransactionsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    searchTransactionsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    searchTransactionsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Retrieve comprehensive details for a list of Private Equity or Venture Capital transactions.
   * Retrieves rich, fundamental data for one or more private investment transactions, such as a **Venture Capital funding round** or a **Private Equity buyout**. This includes the **deal size** (transaction amount), **transaction date**, participating **investors**, **security type** (e.g., common stock, preferred stock), and the round&#39;s **stage**.
   * @param ids A list of unique FactSet-generated identifiers for **Private Equity or Venture Capital transactions**. These IDs link to a single investment event, distinct from the main deal ID. (required)
   * @return TransactionDetailsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public TransactionDetailsResponse getTransaction(java.util.List<Integer> ids) throws ApiException {
    return getTransactionWithHttpInfo(ids).getData();
  }

  /**
   * Retrieve comprehensive details for a list of Private Equity or Venture Capital transactions.
   * Retrieves rich, fundamental data for one or more private investment transactions, such as a **Venture Capital funding round** or a **Private Equity buyout**. This includes the **deal size** (transaction amount), **transaction date**, participating **investors**, **security type** (e.g., common stock, preferred stock), and the round&#39;s **stage**.
   * @param ids A list of unique FactSet-generated identifiers for **Private Equity or Venture Capital transactions**. These IDs link to a single investment event, distinct from the main deal ID. (required)
   * @return ApiResponse&lt;TransactionDetailsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TransactionDetailsResponse> getTransactionWithHttpInfo(java.util.List<Integer> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getTransaction");
    }
    
    // create path and map variables
    String localVarPath = "/transactions";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "ids", ids));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        TransactionDetailsResponse
      
    > apiResponse = apiClient.invokeAPI("TransactionsApi.getTransaction", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTransactionResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve detailed M&amp;A advisory and investment information for specified transactions.
   * Provides specific details related to Mergers &amp; Acquisitions (M&amp;A) activity for a given transaction. This includes information on M&amp;A **advisors** (e.g., financial, legal) and the specific **investments** made by General Partner and Limited Partner investors in the context of the M&amp;A deal.
   * @param ids A list of unique FactSet-generated identifiers for **Private Equity or Venture Capital transactions**. These IDs link to a single investment event, distinct from the main deal ID. (required)
   * @return TransactionMaActivityResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public TransactionMaActivityResponse getTransactionMAActivity(java.util.List<Integer> ids) throws ApiException {
    return getTransactionMAActivityWithHttpInfo(ids).getData();
  }

  /**
   * Retrieve detailed M&amp;A advisory and investment information for specified transactions.
   * Provides specific details related to Mergers &amp; Acquisitions (M&amp;A) activity for a given transaction. This includes information on M&amp;A **advisors** (e.g., financial, legal) and the specific **investments** made by General Partner and Limited Partner investors in the context of the M&amp;A deal.
   * @param ids A list of unique FactSet-generated identifiers for **Private Equity or Venture Capital transactions**. These IDs link to a single investment event, distinct from the main deal ID. (required)
   * @return ApiResponse&lt;TransactionMaActivityResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TransactionMaActivityResponse> getTransactionMAActivityWithHttpInfo(java.util.List<Integer> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getTransactionMAActivity");
    }
    
    // create path and map variables
    String localVarPath = "/transactions/ma-activity";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "ids", ids));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        TransactionMaActivityResponse
      
    > apiResponse = apiClient.invokeAPI("TransactionsApi.getTransactionMAActivity", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTransactionMAActivityResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Search and filter the universe of transactions by deal size, date range, stage, and portfolio company.
   * Allows users to query the universe of private transactions using a set of powerful filters. Filters can include specific **portfolio companies**, **investment stages** (e.g., Seed, Growth, Late), **transaction date range**, and **minimum/maximum transaction amounts** in USD.
   * @param transactionSearchRequest  (required)
   * @return TransactionSearchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public TransactionSearchResponse searchTransactions(TransactionSearchRequest transactionSearchRequest) throws ApiException {
    return searchTransactionsWithHttpInfo(transactionSearchRequest).getData();
  }

  /**
   * Search and filter the universe of transactions by deal size, date range, stage, and portfolio company.
   * Allows users to query the universe of private transactions using a set of powerful filters. Filters can include specific **portfolio companies**, **investment stages** (e.g., Seed, Growth, Late), **transaction date range**, and **minimum/maximum transaction amounts** in USD.
   * @param transactionSearchRequest  (required)
   * @return ApiResponse&lt;TransactionSearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TransactionSearchResponse> searchTransactionsWithHttpInfo(TransactionSearchRequest transactionSearchRequest) throws ApiException {
    Object localVarPostBody = transactionSearchRequest;
    
    // verify the required parameter 'transactionSearchRequest' is set
    if (transactionSearchRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionSearchRequest' when calling searchTransactions");
    }
    
    // create path and map variables
    String localVarPath = "/transactions/search";

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
        
        TransactionSearchResponse
      
    > apiResponse = apiClient.invokeAPI("TransactionsApi.searchTransactions", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, searchTransactionsResponseTypeMap, false);

    return apiResponse;

  }
}
