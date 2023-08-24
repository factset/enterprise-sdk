package com.factset.sdk.FactSetTickHistory.api;

import com.factset.sdk.FactSetTickHistory.ApiException;
import com.factset.sdk.FactSetTickHistory.ApiClient;
import com.factset.sdk.FactSetTickHistory.ApiResponse;
import com.factset.sdk.FactSetTickHistory.Configuration;
import com.factset.sdk.FactSetTickHistory.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetTickHistory.models.CompletedResponse;
import com.factset.sdk.FactSetTickHistory.models.CoverageResponse;
import com.factset.sdk.FactSetTickHistory.models.GetFilesResponse;
import com.factset.sdk.FactSetTickHistory.models.LeveloneRequest;
import com.factset.sdk.FactSetTickHistory.models.Status;
import com.factset.sdk.FactSetTickHistory.models.SubmittedResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Level1Api {
  private ApiClient apiClient;

  public Level1Api() {
    this(Configuration.getDefaultApiClient());
  }

  public Level1Api(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getIdResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getIdResponseTypeMap.put(202, new GenericType<SubmittedResponse>(){});
    getIdResponseTypeMap.put(400, new GenericType<Status>(){});
    getIdResponseTypeMap.put(401, new GenericType<Status>(){});
    getIdResponseTypeMap.put(403, new GenericType<Status>(){});
    getIdResponseTypeMap.put(429, new GenericType<Status>(){});
    getIdResponseTypeMap.put(500, new GenericType<Status>(){});
  }

  private static final Map<Integer, GenericType> getStatusLevel1ResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStatusLevel1ResponseTypeMap.put(201, new GenericType<CompletedResponse>(){});
    getStatusLevel1ResponseTypeMap.put(202, new GenericType<SubmittedResponse>(){});
    getStatusLevel1ResponseTypeMap.put(401, new GenericType<Status>(){});
    getStatusLevel1ResponseTypeMap.put(403, new GenericType<Status>(){});
    getStatusLevel1ResponseTypeMap.put(404, new GenericType<Status>(){});
    getStatusLevel1ResponseTypeMap.put(500, new GenericType<Status>(){});
  }

  private static final Map<Integer, GenericType> getTickHistoryCoverageResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTickHistoryCoverageResponseTypeMap.put(200, new GenericType<CoverageResponse>(){});
    getTickHistoryCoverageResponseTypeMap.put(400, new GenericType<Status>(){});
    getTickHistoryCoverageResponseTypeMap.put(401, new GenericType<Status>(){});
    getTickHistoryCoverageResponseTypeMap.put(403, new GenericType<Status>(){});
    getTickHistoryCoverageResponseTypeMap.put(429, new GenericType<Status>(){});
    getTickHistoryCoverageResponseTypeMap.put(500, new GenericType<Status>(){});
  }

  private static final Map<Integer, GenericType> getTickHistoryFilesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTickHistoryFilesResponseTypeMap.put(200, new GenericType<GetFilesResponse>(){});
    getTickHistoryFilesResponseTypeMap.put(202, new GenericType<SubmittedResponse>(){});
    getTickHistoryFilesResponseTypeMap.put(400, new GenericType<Status>(){});
    getTickHistoryFilesResponseTypeMap.put(401, new GenericType<Status>(){});
    getTickHistoryFilesResponseTypeMap.put(403, new GenericType<Status>(){});
    getTickHistoryFilesResponseTypeMap.put(404, new GenericType<Status>(){});
    getTickHistoryFilesResponseTypeMap.put(500, new GenericType<Status>(){});
  }

  
 /**
   * Wrapper to support GET /level1/files/status returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>201 : {@code CompletedResponse }<br> The Request has been created and the response has been created. </li>
   * 
   *   <li>202 : {@code SubmittedResponse }<br>The Request has not finished and the result has NOT been created. </li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetStatusLevel1ResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 201:
   *     CompletedResponse data201 = response.getResponse201();
   *     break;
   *   case 202:
   *     SubmittedResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetStatusLevel1ResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetStatusLevel1ResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public CompletedResponse getResponse201() throws ApiException {
      if (this.statusCode != 201) {
        throw new ApiException(500, "Invalid response getter called. getResponse201 can't return a " + this.statusCode + " response");
      }
      return (CompletedResponse) this.response;
    }
    
    public SubmittedResponse getResponse202() throws ApiException {
      if (this.statusCode != 202) {
        throw new ApiException(500, "Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
      }
      return (SubmittedResponse) this.response;
    }
    

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      GetStatusLevel1ResponseWrapper other = (GetStatusLevel1ResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetStatusLevel1ResponseWrapper {\n"
       + "    statusCode: " + statusCode + "\n"
       + "    response: "
       + Objects.toString(response).replace("\n", "\n    ")
       + "\n}";
    }
  }


 /**
   * Wrapper to support GET /level1/files/get returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code GetFilesResponse }<br>Success&lt;/p&gt; **To download the output file copy the response url in a browser**</li>
   * 
   *   <li>202 : {@code SubmittedResponse }<br>The Request has not finished and the result has NOT been created. </li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetTickHistoryFilesResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     GetFilesResponse data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     SubmittedResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetTickHistoryFilesResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetTickHistoryFilesResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public GetFilesResponse getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (GetFilesResponse) this.response;
    }
    
    public SubmittedResponse getResponse202() throws ApiException {
      if (this.statusCode != 202) {
        throw new ApiException(500, "Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
      }
      return (SubmittedResponse) this.response;
    }
    

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      GetTickHistoryFilesResponseWrapper other = (GetTickHistoryFilesResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetTickHistoryFilesResponseWrapper {\n"
       + "    statusCode: " + statusCode + "\n"
       + "    response: "
       + Objects.toString(response).replace("\n", "\n    ")
       + "\n}";
    }
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
   * Returns the ID for the requested data.
   * Data available from 20120101 to current date.
   * @param leveloneRequest  (required)
   * @return SubmittedResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> The Request has been Accepted </td><td>  * Location - Relative location to poll for status. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
   */
  public SubmittedResponse getId(LeveloneRequest leveloneRequest) throws ApiException {
    return getIdWithHttpInfo(leveloneRequest).getData();
  }

  /**
   * Returns the ID for the requested data.
   * Data available from 20120101 to current date.
   * @param leveloneRequest  (required)
   * @return ApiResponse&lt;SubmittedResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> The Request has been Accepted </td><td>  * Location - Relative location to poll for status. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubmittedResponse> getIdWithHttpInfo(LeveloneRequest leveloneRequest) throws ApiException {
    Object localVarPostBody = leveloneRequest;
    
    // verify the required parameter 'leveloneRequest' is set
    if (leveloneRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'leveloneRequest' when calling getId");
    }
    
    // create path and map variables
    String localVarPath = "/level1/files/create";

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
        
        SubmittedResponse
      
    > apiResponse = apiClient.invokeAPI("Level1Api.getId", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getIdResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the status of the ID
   * Need to plug-in the id get from /create endpoint into /status endpoint
   * @param id id returned by files create endpoint to poll and collect status of the query (required)
   * @return GetStatusLevel1ResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td>  The Request has been created and the response has been created.  </td><td>  * Location - Relative location to poll for status. <br>  </td></tr>
       <tr><td> 202 </td><td> The Request has not finished and the result has NOT been created.  </td><td>  * Location - Relative location to poll for status. <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> id not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
   */
  public GetStatusLevel1ResponseWrapper getStatusLevel1(String id) throws ApiException {
    return getStatusLevel1WithHttpInfo(id).getData();
  }

  /**
   * Returns the status of the ID
   * Need to plug-in the id get from /create endpoint into /status endpoint
   * @param id id returned by files create endpoint to poll and collect status of the query (required)
   * @return ApiResponse&lt;GetStatusLevel1ResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td>  The Request has been created and the response has been created.  </td><td>  * Location - Relative location to poll for status. <br>  </td></tr>
       <tr><td> 202 </td><td> The Request has not finished and the result has NOT been created.  </td><td>  * Location - Relative location to poll for status. <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> id not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetStatusLevel1ResponseWrapper> getStatusLevel1WithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getStatusLevel1");
    }
    
    // create path and map variables
    String localVarPath = "/level1/files/status";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        Object
        
      
    > apiResponse = apiClient.invokeAPI("Level1Api.getStatusLevel1", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStatusLevel1ResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetStatusLevel1ResponseWrapper responseWrapper = new GetStatusLevel1ResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetStatusLevel1ResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
  /**
   * Returns the coverage for the requested ticker/isin along with other response fields for Level1 data.
   * Returns coverage for specified tickers for Level1 Data
   * @param tickers &lt;P&gt; The requested list of one or more tickers.&lt;/p&gt;   The &#x60;tickers&#x60; and &#x60;isins&#x60;  parameters provide two different ways to specify the identifiers for data retrieved. Please enter either the tickers or isins parameter.   &lt;P&gt; Maximum 10 tickers per request&lt;/p&gt;      (optional)
   * @param factsetExchangeCode &lt;p&gt;This parameter is used to filter the results based on the FactSet specific regional or composite exchange code.&lt;/p&gt; **NOTE**:Does not support multiple factsetExchangeCodes (optional)
   * @param isins &lt;P&gt; Specifies the ISIN of the record. &lt;/p&gt;    Please enter either the &#x60;tickers&#x60; or &#x60;isins&#x60; parameter.     &lt;P&gt; Maximum 10 ISINs per request.&lt;/p&gt;       (optional)
   * @return CoverageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success&lt;/p&gt; </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
   */
  public CoverageResponse getTickHistoryCoverage(java.util.List<String> tickers, String factsetExchangeCode, java.util.List<String> isins) throws ApiException {
    return getTickHistoryCoverageWithHttpInfo(tickers, factsetExchangeCode, isins).getData();
  }

  /**
   * Returns the coverage for the requested ticker/isin along with other response fields for Level1 data.
   * Returns coverage for specified tickers for Level1 Data
   * @param tickers &lt;P&gt; The requested list of one or more tickers.&lt;/p&gt;   The &#x60;tickers&#x60; and &#x60;isins&#x60;  parameters provide two different ways to specify the identifiers for data retrieved. Please enter either the tickers or isins parameter.   &lt;P&gt; Maximum 10 tickers per request&lt;/p&gt;      (optional)
   * @param factsetExchangeCode &lt;p&gt;This parameter is used to filter the results based on the FactSet specific regional or composite exchange code.&lt;/p&gt; **NOTE**:Does not support multiple factsetExchangeCodes (optional)
   * @param isins &lt;P&gt; Specifies the ISIN of the record. &lt;/p&gt;    Please enter either the &#x60;tickers&#x60; or &#x60;isins&#x60; parameter.     &lt;P&gt; Maximum 10 ISINs per request.&lt;/p&gt;       (optional)
   * @return ApiResponse&lt;CoverageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success&lt;/p&gt; </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CoverageResponse> getTickHistoryCoverageWithHttpInfo(java.util.List<String> tickers, String factsetExchangeCode, java.util.List<String> isins) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/level1/coverage";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "tickers", tickers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "factsetExchangeCode", factsetExchangeCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "isins", isins));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        CoverageResponse
      
    > apiResponse = apiClient.invokeAPI("Level1Api.getTickHistoryCoverage", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTickHistoryCoverageResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the tick history files requested in the /create endpoint
   * Returns the files from tickhistory endpoint
   * @param id id returned by files create endpoint to poll and collect results of the query (required)
   * @param paginationLimit Specifies the maximum number of results to return per response page (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional, default to 0)
   * @return GetTickHistoryFilesResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success&lt;/p&gt; **To download the output file copy the response url in a browser** </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> The Request has not finished and the result has NOT been created.  </td><td>  * Location - Relative location to poll for status. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> id not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
   */
  public GetTickHistoryFilesResponseWrapper getTickHistoryFiles(String id, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getTickHistoryFilesWithHttpInfo(id, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the tick history files requested in the /create endpoint
   * Returns the files from tickhistory endpoint
   * @param id id returned by files create endpoint to poll and collect results of the query (required)
   * @param paginationLimit Specifies the maximum number of results to return per response page (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional, default to 0)
   * @return ApiResponse&lt;GetTickHistoryFilesResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success&lt;/p&gt; **To download the output file copy the response url in a browser** </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> The Request has not finished and the result has NOT been created.  </td><td>  * Location - Relative location to poll for status. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> id not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetTickHistoryFilesResponseWrapper> getTickHistoryFilesWithHttpInfo(String id, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTickHistoryFiles");
    }
    
    // create path and map variables
    String localVarPath = "/level1/files/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        Object
        
      
    > apiResponse = apiClient.invokeAPI("Level1Api.getTickHistoryFiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTickHistoryFilesResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetTickHistoryFilesResponseWrapper responseWrapper = new GetTickHistoryFilesResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetTickHistoryFilesResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
}
