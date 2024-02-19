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
import com.factset.sdk.FactSetTickHistory.models.LevelTwoRequest;
import com.factset.sdk.FactSetTickHistory.models.LeveltwoGetFilesResponse;
import com.factset.sdk.FactSetTickHistory.models.Status;
import com.factset.sdk.FactSetTickHistory.models.SubmittedResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Level2Api {
  private ApiClient apiClient;

  public Level2Api() {
    this(Configuration.getDefaultApiClient());
  }

  public Level2Api(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getLevel2FileStatusResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getLevel2FileStatusResponseTypeMap.put(201, new GenericType<CompletedResponse>(){});
    getLevel2FileStatusResponseTypeMap.put(202, new GenericType<SubmittedResponse>(){});
    getLevel2FileStatusResponseTypeMap.put(401, new GenericType<Status>(){});
    getLevel2FileStatusResponseTypeMap.put(403, new GenericType<Status>(){});
    getLevel2FileStatusResponseTypeMap.put(404, new GenericType<Status>(){});
    getLevel2FileStatusResponseTypeMap.put(500, new GenericType<Status>(){});
  }

  private static final Map<Integer, GenericType> getTickHistoryLevel2FilesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTickHistoryLevel2FilesResponseTypeMap.put(200, new GenericType<LeveltwoGetFilesResponse>(){});
    getTickHistoryLevel2FilesResponseTypeMap.put(202, new GenericType<SubmittedResponse>(){});
    getTickHistoryLevel2FilesResponseTypeMap.put(400, new GenericType<Status>(){});
    getTickHistoryLevel2FilesResponseTypeMap.put(401, new GenericType<Status>(){});
    getTickHistoryLevel2FilesResponseTypeMap.put(403, new GenericType<Status>(){});
    getTickHistoryLevel2FilesResponseTypeMap.put(404, new GenericType<Status>(){});
    getTickHistoryLevel2FilesResponseTypeMap.put(500, new GenericType<Status>(){});
  }

  private static final Map<Integer, GenericType> requestTickHistoryLeve2FilesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    requestTickHistoryLeve2FilesResponseTypeMap.put(202, new GenericType<SubmittedResponse>(){});
    requestTickHistoryLeve2FilesResponseTypeMap.put(400, new GenericType<Status>(){});
    requestTickHistoryLeve2FilesResponseTypeMap.put(401, new GenericType<Status>(){});
    requestTickHistoryLeve2FilesResponseTypeMap.put(403, new GenericType<Status>(){});
    requestTickHistoryLeve2FilesResponseTypeMap.put(429, new GenericType<Status>(){});
    requestTickHistoryLeve2FilesResponseTypeMap.put(500, new GenericType<Status>(){});
  }

  
 /**
   * Wrapper to support GET /level2/files/status returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>201 : {@code CompletedResponse }<br>The Request has been created and the response has been created. </li>
   * 
   *   <li>202 : {@code SubmittedResponse }<br>The Request has not finished and the result has NOT been created. </li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetLevel2FileStatusResponseWrapper response = ...;
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
  public static class GetLevel2FileStatusResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetLevel2FileStatusResponseWrapper(int statusCode, Object response) {
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
      GetLevel2FileStatusResponseWrapper other = (GetLevel2FileStatusResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetLevel2FileStatusResponseWrapper {\n"
       + "    statusCode: " + statusCode + "\n"
       + "    response: "
       + Objects.toString(response).replace("\n", "\n    ")
       + "\n}";
    }
  }


 /**
   * Wrapper to support GET /level2/files/get returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code LeveltwoGetFilesResponse }<br>Success&lt;/p&gt; **To download the output file copy the response url in a browser**</li>
   * 
   *   <li>202 : {@code SubmittedResponse }<br> The Request has not finished and the result has NOT been created. </li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetTickHistoryLevel2FilesResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     LeveltwoGetFilesResponse data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     SubmittedResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetTickHistoryLevel2FilesResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetTickHistoryLevel2FilesResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public LeveltwoGetFilesResponse getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (LeveltwoGetFilesResponse) this.response;
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
      GetTickHistoryLevel2FilesResponseWrapper other = (GetTickHistoryLevel2FilesResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetTickHistoryLevel2FilesResponseWrapper {\n"
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
   * Returns the status of the ID
   * Need to plug-in the id get from /create endpoint into /status endpoint
   * @param id id returned by files create endpoint to poll and collect status of the query (required)
   * @return GetLevel2FileStatusResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> The Request has been created and the response has been created.  </td><td>  * Location - Relative location to poll for status. <br>  </td></tr>
       <tr><td> 202 </td><td> The Request has not finished and the result has NOT been created.  </td><td>  * Location - Relative location to poll for status. <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> id not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
   */
  public GetLevel2FileStatusResponseWrapper getLevel2FileStatus(String id) throws ApiException {
    return getLevel2FileStatusWithHttpInfo(id).getData();
  }

  /**
   * Returns the status of the ID
   * Need to plug-in the id get from /create endpoint into /status endpoint
   * @param id id returned by files create endpoint to poll and collect status of the query (required)
   * @return ApiResponse&lt;GetLevel2FileStatusResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> The Request has been created and the response has been created.  </td><td>  * Location - Relative location to poll for status. <br>  </td></tr>
       <tr><td> 202 </td><td> The Request has not finished and the result has NOT been created.  </td><td>  * Location - Relative location to poll for status. <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> id not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetLevel2FileStatusResponseWrapper> getLevel2FileStatusWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getLevel2FileStatus");
    }
    
    // create path and map variables
    String localVarPath = "/level2/files/status";

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
        
      
    > apiResponse = apiClient.invokeAPI("Level2Api.getLevel2FileStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getLevel2FileStatusResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetLevel2FileStatusResponseWrapper responseWrapper = new GetLevel2FileStatusResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetLevel2FileStatusResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
  /**
   * Returns the tick history files requested in the /create endpoint
   * Returns the files from tickhistory endpoint
   * @param id id returned by files create endpoint to poll and collect results of the query (required)
   * @param paginationLimit Specifies the maximum number of results to return per response page (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional, default to 0)
   * @return GetTickHistoryLevel2FilesResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success&lt;/p&gt; **To download the output file copy the response url in a browser** </td><td>  -  </td></tr>
       <tr><td> 202 </td><td>  The Request has not finished and the result has NOT been created.  </td><td>  * Location - Relative location to poll for status. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> id not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
   */
  public GetTickHistoryLevel2FilesResponseWrapper getTickHistoryLevel2Files(String id, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getTickHistoryLevel2FilesWithHttpInfo(id, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the tick history files requested in the /create endpoint
   * Returns the files from tickhistory endpoint
   * @param id id returned by files create endpoint to poll and collect results of the query (required)
   * @param paginationLimit Specifies the maximum number of results to return per response page (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional, default to 0)
   * @return ApiResponse&lt;GetTickHistoryLevel2FilesResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success&lt;/p&gt; **To download the output file copy the response url in a browser** </td><td>  -  </td></tr>
       <tr><td> 202 </td><td>  The Request has not finished and the result has NOT been created.  </td><td>  * Location - Relative location to poll for status. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> id not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetTickHistoryLevel2FilesResponseWrapper> getTickHistoryLevel2FilesWithHttpInfo(String id, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTickHistoryLevel2Files");
    }
    
    // create path and map variables
    String localVarPath = "/level2/files/get";

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
        
      
    > apiResponse = apiClient.invokeAPI("Level2Api.getTickHistoryLevel2Files", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTickHistoryLevel2FilesResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetTickHistoryLevel2FilesResponseWrapper responseWrapper = new GetTickHistoryLevel2FilesResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetTickHistoryLevel2FilesResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
  /**
   * Returns the ID for the requested data.
   * Data available from past 6 years to previous day.
   * @param levelTwoRequest  (required)
   * @return SubmittedResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> The Request has been Accepted.  </td><td>  * Location - Relative location to poll for status. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
   */
  public SubmittedResponse requestTickHistoryLeve2Files(LevelTwoRequest levelTwoRequest) throws ApiException {
    return requestTickHistoryLeve2FilesWithHttpInfo(levelTwoRequest).getData();
  }

  /**
   * Returns the ID for the requested data.
   * Data available from past 6 years to previous day.
   * @param levelTwoRequest  (required)
   * @return ApiResponse&lt;SubmittedResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> The Request has been Accepted.  </td><td>  * Location - Relative location to poll for status. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubmittedResponse> requestTickHistoryLeve2FilesWithHttpInfo(LevelTwoRequest levelTwoRequest) throws ApiException {
    Object localVarPostBody = levelTwoRequest;
    
    // verify the required parameter 'levelTwoRequest' is set
    if (levelTwoRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'levelTwoRequest' when calling requestTickHistoryLeve2Files");
    }
    
    // create path and map variables
    String localVarPath = "/level2/files/create";

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
      
    > apiResponse = apiClient.invokeAPI("Level2Api.requestTickHistoryLeve2Files", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, requestTickHistoryLeve2FilesResponseTypeMap, false);

    return apiResponse;

  }
}
