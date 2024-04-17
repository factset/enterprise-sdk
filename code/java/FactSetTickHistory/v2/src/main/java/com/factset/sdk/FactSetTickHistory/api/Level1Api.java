package com.factset.sdk.FactSetTickHistory.api;

import com.factset.sdk.FactSetTickHistory.ApiException;
import com.factset.sdk.FactSetTickHistory.ApiClient;
import com.factset.sdk.FactSetTickHistory.ApiResponse;
import com.factset.sdk.FactSetTickHistory.Configuration;
import com.factset.sdk.FactSetTickHistory.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetTickHistory.models.CompletedResponse;
import com.factset.sdk.FactSetTickHistory.models.CoverageResponse;
import com.factset.sdk.FactSetTickHistory.models.GetFilesMinuteResponse;
import com.factset.sdk.FactSetTickHistory.models.GetFilesResponse;
import com.factset.sdk.FactSetTickHistory.models.LeveloneRequest;
import com.factset.sdk.FactSetTickHistory.models.MinRequest;
import com.factset.sdk.FactSetTickHistory.models.Status;
import com.factset.sdk.FactSetTickHistory.models.SubmittedResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Level1Api {
  private ApiClient apiClient;

  public Level1Api() {
    this(Configuration.getDefaultApiClient());
  }

  public Level1Api(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getLevel1FileStatusResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getLevel1FileStatusResponseTypeMap.put(201, new GenericType<CompletedResponse>(){});
    getLevel1FileStatusResponseTypeMap.put(202, new GenericType<SubmittedResponse>(){});
    getLevel1FileStatusResponseTypeMap.put(401, new GenericType<Status>(){});
    getLevel1FileStatusResponseTypeMap.put(403, new GenericType<Status>(){});
    getLevel1FileStatusResponseTypeMap.put(404, new GenericType<Status>(){});
    getLevel1FileStatusResponseTypeMap.put(500, new GenericType<Status>(){});
  }

  private static final Map<Integer, GenericType> getMinutebarsFileStatusResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getMinutebarsFileStatusResponseTypeMap.put(201, new GenericType<CompletedResponse>(){});
    getMinutebarsFileStatusResponseTypeMap.put(202, new GenericType<SubmittedResponse>(){});
    getMinutebarsFileStatusResponseTypeMap.put(401, new GenericType<Status>(){});
    getMinutebarsFileStatusResponseTypeMap.put(403, new GenericType<Status>(){});
    getMinutebarsFileStatusResponseTypeMap.put(404, new GenericType<Status>(){});
    getMinutebarsFileStatusResponseTypeMap.put(500, new GenericType<Status>(){});
  }

  private static final Map<Integer, GenericType> getMinutebarsFilesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getMinutebarsFilesResponseTypeMap.put(200, new GenericType<GetFilesMinuteResponse>(){});
    getMinutebarsFilesResponseTypeMap.put(202, new GenericType<SubmittedResponse>(){});
    getMinutebarsFilesResponseTypeMap.put(400, new GenericType<Status>(){});
    getMinutebarsFilesResponseTypeMap.put(401, new GenericType<Status>(){});
    getMinutebarsFilesResponseTypeMap.put(403, new GenericType<Status>(){});
    getMinutebarsFilesResponseTypeMap.put(404, new GenericType<Status>(){});
    getMinutebarsFilesResponseTypeMap.put(500, new GenericType<Status>(){});
  }

  private static final Map<Integer, GenericType> getTickHistoryLevel1FilesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getTickHistoryLevel1FilesResponseTypeMap.put(200, new GenericType<GetFilesResponse>(){});
    getTickHistoryLevel1FilesResponseTypeMap.put(202, new GenericType<SubmittedResponse>(){});
    getTickHistoryLevel1FilesResponseTypeMap.put(400, new GenericType<Status>(){});
    getTickHistoryLevel1FilesResponseTypeMap.put(401, new GenericType<Status>(){});
    getTickHistoryLevel1FilesResponseTypeMap.put(403, new GenericType<Status>(){});
    getTickHistoryLevel1FilesResponseTypeMap.put(404, new GenericType<Status>(){});
    getTickHistoryLevel1FilesResponseTypeMap.put(500, new GenericType<Status>(){});
  }

  private static final Map<Integer, GenericType> requestMinutebarsFilesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    requestMinutebarsFilesResponseTypeMap.put(202, new GenericType<SubmittedResponse>(){});
    requestMinutebarsFilesResponseTypeMap.put(400, new GenericType<Status>(){});
    requestMinutebarsFilesResponseTypeMap.put(401, new GenericType<Status>(){});
    requestMinutebarsFilesResponseTypeMap.put(403, new GenericType<Status>(){});
    requestMinutebarsFilesResponseTypeMap.put(429, new GenericType<Status>(){});
    requestMinutebarsFilesResponseTypeMap.put(500, new GenericType<Status>(){});
  }

  private static final Map<Integer, GenericType> requestTickHistoryCoverageResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    requestTickHistoryCoverageResponseTypeMap.put(200, new GenericType<CoverageResponse>(){});
    requestTickHistoryCoverageResponseTypeMap.put(400, new GenericType<Status>(){});
    requestTickHistoryCoverageResponseTypeMap.put(401, new GenericType<Status>(){});
    requestTickHistoryCoverageResponseTypeMap.put(403, new GenericType<Status>(){});
    requestTickHistoryCoverageResponseTypeMap.put(429, new GenericType<Status>(){});
    requestTickHistoryCoverageResponseTypeMap.put(500, new GenericType<Status>(){});
  }

  private static final Map<Integer, GenericType> requestTickHistoryLevel1FilesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    requestTickHistoryLevel1FilesResponseTypeMap.put(202, new GenericType<SubmittedResponse>(){});
    requestTickHistoryLevel1FilesResponseTypeMap.put(400, new GenericType<Status>(){});
    requestTickHistoryLevel1FilesResponseTypeMap.put(401, new GenericType<Status>(){});
    requestTickHistoryLevel1FilesResponseTypeMap.put(403, new GenericType<Status>(){});
    requestTickHistoryLevel1FilesResponseTypeMap.put(429, new GenericType<Status>(){});
    requestTickHistoryLevel1FilesResponseTypeMap.put(500, new GenericType<Status>(){});
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
   * GetLevel1FileStatusResponseWrapper response = ...;
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
  public static class GetLevel1FileStatusResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetLevel1FileStatusResponseWrapper(int statusCode, Object response) {
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
      GetLevel1FileStatusResponseWrapper other = (GetLevel1FileStatusResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetLevel1FileStatusResponseWrapper {\n"
       + "    statusCode: " + statusCode + "\n"
       + "    response: "
       + Objects.toString(response).replace("\n", "\n    ")
       + "\n}";
    }
  }


 /**
   * Wrapper to support GET /level1/files/minute-bars/status returning different types
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
   * GetMinutebarsFileStatusResponseWrapper response = ...;
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
  public static class GetMinutebarsFileStatusResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetMinutebarsFileStatusResponseWrapper(int statusCode, Object response) {
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
      GetMinutebarsFileStatusResponseWrapper other = (GetMinutebarsFileStatusResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetMinutebarsFileStatusResponseWrapper {\n"
       + "    statusCode: " + statusCode + "\n"
       + "    response: "
       + Objects.toString(response).replace("\n", "\n    ")
       + "\n}";
    }
  }


 /**
   * Wrapper to support GET /level1/files/minute-bars/get returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code GetFilesMinuteResponse }<br>Success&lt;/p&gt; **To download the output file copy the response url in a browser**</li>
   * 
   *   <li>202 : {@code SubmittedResponse }<br>The Request has not finished and the result has NOT been created. </li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetMinutebarsFilesResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     GetFilesMinuteResponse data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     SubmittedResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetMinutebarsFilesResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetMinutebarsFilesResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public GetFilesMinuteResponse getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (GetFilesMinuteResponse) this.response;
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
      GetMinutebarsFilesResponseWrapper other = (GetMinutebarsFilesResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetMinutebarsFilesResponseWrapper {\n"
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
   * GetTickHistoryLevel1FilesResponseWrapper response = ...;
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
  public static class GetTickHistoryLevel1FilesResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetTickHistoryLevel1FilesResponseWrapper(int statusCode, Object response) {
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
      GetTickHistoryLevel1FilesResponseWrapper other = (GetTickHistoryLevel1FilesResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetTickHistoryLevel1FilesResponseWrapper {\n"
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
   * @return GetLevel1FileStatusResponseWrapper
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
  public GetLevel1FileStatusResponseWrapper getLevel1FileStatus(String id) throws ApiException {
    return getLevel1FileStatusWithHttpInfo(id).getData();
  }

  /**
   * Returns the status of the ID
   * Need to plug-in the id get from /create endpoint into /status endpoint
   * @param id id returned by files create endpoint to poll and collect status of the query (required)
   * @return ApiResponse&lt;GetLevel1FileStatusResponseWrapper&gt;
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
  public ApiResponse<GetLevel1FileStatusResponseWrapper> getLevel1FileStatusWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getLevel1FileStatus");
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
        
      
    > apiResponse = apiClient.invokeAPI("Level1Api.getLevel1FileStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getLevel1FileStatusResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetLevel1FileStatusResponseWrapper responseWrapper = new GetLevel1FileStatusResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetLevel1FileStatusResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
  /**
   * Returns the status of the ID
   * Need to plug-in the id get from /create endpoint into /status endpoint
   * @param id id returned by files create endpoint to poll and collect status of the query (required)
   * @return GetMinutebarsFileStatusResponseWrapper
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
  public GetMinutebarsFileStatusResponseWrapper getMinutebarsFileStatus(String id) throws ApiException {
    return getMinutebarsFileStatusWithHttpInfo(id).getData();
  }

  /**
   * Returns the status of the ID
   * Need to plug-in the id get from /create endpoint into /status endpoint
   * @param id id returned by files create endpoint to poll and collect status of the query (required)
   * @return ApiResponse&lt;GetMinutebarsFileStatusResponseWrapper&gt;
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
  public ApiResponse<GetMinutebarsFileStatusResponseWrapper> getMinutebarsFileStatusWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMinutebarsFileStatus");
    }
    
    // create path and map variables
    String localVarPath = "/level1/files/minute-bars/status";

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
        
      
    > apiResponse = apiClient.invokeAPI("Level1Api.getMinutebarsFileStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getMinutebarsFileStatusResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetMinutebarsFileStatusResponseWrapper responseWrapper = new GetMinutebarsFileStatusResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetMinutebarsFileStatusResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
  /**
   * Returns the Minute bars data in files requested in the /create endpoint
   * Returns the files from tickhistory endpoint
   * @param id id returned by files create endpoint to poll and collect results of the query (required)
   * @param paginationLimit Specifies the maximum number of results to return per response page (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional, default to 0)
   * @return GetMinutebarsFilesResponseWrapper
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
  public GetMinutebarsFilesResponseWrapper getMinutebarsFiles(String id, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getMinutebarsFilesWithHttpInfo(id, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the Minute bars data in files requested in the /create endpoint
   * Returns the files from tickhistory endpoint
   * @param id id returned by files create endpoint to poll and collect results of the query (required)
   * @param paginationLimit Specifies the maximum number of results to return per response page (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional, default to 0)
   * @return ApiResponse&lt;GetMinutebarsFilesResponseWrapper&gt;
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
  public ApiResponse<GetMinutebarsFilesResponseWrapper> getMinutebarsFilesWithHttpInfo(String id, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMinutebarsFiles");
    }
    
    // create path and map variables
    String localVarPath = "/level1/files/minute-bars/get";

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
        
      
    > apiResponse = apiClient.invokeAPI("Level1Api.getMinutebarsFiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getMinutebarsFilesResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetMinutebarsFilesResponseWrapper responseWrapper = new GetMinutebarsFilesResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetMinutebarsFilesResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
  /**
   * Returns the tick-by-tick data in files requested in the /create endpoint
   * Returns the files from tickhistory endpoint
   * @param id id returned by files create endpoint to poll and collect results of the query (required)
   * @param paginationLimit Specifies the maximum number of results to return per response page (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional, default to 0)
   * @return GetTickHistoryLevel1FilesResponseWrapper
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
  public GetTickHistoryLevel1FilesResponseWrapper getTickHistoryLevel1Files(String id, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getTickHistoryLevel1FilesWithHttpInfo(id, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the tick-by-tick data in files requested in the /create endpoint
   * Returns the files from tickhistory endpoint
   * @param id id returned by files create endpoint to poll and collect results of the query (required)
   * @param paginationLimit Specifies the maximum number of results to return per response page (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional, default to 0)
   * @return ApiResponse&lt;GetTickHistoryLevel1FilesResponseWrapper&gt;
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
  public ApiResponse<GetTickHistoryLevel1FilesResponseWrapper> getTickHistoryLevel1FilesWithHttpInfo(String id, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTickHistoryLevel1Files");
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
        
      
    > apiResponse = apiClient.invokeAPI("Level1Api.getTickHistoryLevel1Files", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getTickHistoryLevel1FilesResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetTickHistoryLevel1FilesResponseWrapper responseWrapper = new GetTickHistoryLevel1FilesResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetTickHistoryLevel1FilesResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
  /**
   * Requests the creation of Minute bars file
   * 1-minute bars available from 20120101 to previous day. Per request able to fetch upto 6 months of data.
   * @param minRequest  (required)
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
  public SubmittedResponse requestMinutebarsFiles(MinRequest minRequest) throws ApiException {
    return requestMinutebarsFilesWithHttpInfo(minRequest).getData();
  }

  /**
   * Requests the creation of Minute bars file
   * 1-minute bars available from 20120101 to previous day. Per request able to fetch upto 6 months of data.
   * @param minRequest  (required)
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
  public ApiResponse<SubmittedResponse> requestMinutebarsFilesWithHttpInfo(MinRequest minRequest) throws ApiException {
    Object localVarPostBody = minRequest;
    
    // verify the required parameter 'minRequest' is set
    if (minRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'minRequest' when calling requestMinutebarsFiles");
    }
    
    // create path and map variables
    String localVarPath = "/level1/files/minute-bars/create";

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
      
    > apiResponse = apiClient.invokeAPI("Level1Api.requestMinutebarsFiles", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, requestMinutebarsFilesResponseTypeMap, false);

    return apiResponse;

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
  public CoverageResponse requestTickHistoryCoverage(java.util.List<String> tickers, String factsetExchangeCode, java.util.List<String> isins) throws ApiException {
    return requestTickHistoryCoverageWithHttpInfo(tickers, factsetExchangeCode, isins).getData();
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
  public ApiResponse<CoverageResponse> requestTickHistoryCoverageWithHttpInfo(java.util.List<String> tickers, String factsetExchangeCode, java.util.List<String> isins) throws ApiException {
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
      
    > apiResponse = apiClient.invokeAPI("Level1Api.requestTickHistoryCoverage", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, requestTickHistoryCoverageResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Requests the creation of tick-by-tick file
   * Data available from 20120101 to previous day.
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
  public SubmittedResponse requestTickHistoryLevel1Files(LeveloneRequest leveloneRequest) throws ApiException {
    return requestTickHistoryLevel1FilesWithHttpInfo(leveloneRequest).getData();
  }

  /**
   * Requests the creation of tick-by-tick file
   * Data available from 20120101 to previous day.
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
  public ApiResponse<SubmittedResponse> requestTickHistoryLevel1FilesWithHttpInfo(LeveloneRequest leveloneRequest) throws ApiException {
    Object localVarPostBody = leveloneRequest;
    
    // verify the required parameter 'leveloneRequest' is set
    if (leveloneRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'leveloneRequest' when calling requestTickHistoryLevel1Files");
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
      
    > apiResponse = apiClient.invokeAPI("Level1Api.requestTickHistoryLevel1Files", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, requestTickHistoryLevel1FilesResponseTypeMap, false);

    return apiResponse;

  }
}
