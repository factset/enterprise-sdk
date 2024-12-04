package com.factset.sdk.StreetAccountNews.api;

import com.factset.sdk.StreetAccountNews.ApiException;
import com.factset.sdk.StreetAccountNews.ApiClient;
import com.factset.sdk.StreetAccountNews.ApiResponse;
import com.factset.sdk.StreetAccountNews.Configuration;
import com.factset.sdk.StreetAccountNews.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.StreetAccountNews.models.AcceptedResponse;
import com.factset.sdk.StreetAccountNews.models.CreateFilesRequest;
import com.factset.sdk.StreetAccountNews.models.Error;
import com.factset.sdk.StreetAccountNews.models.GetfilesResponse;
import com.factset.sdk.StreetAccountNews.models.SubmittedResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class StreetAccountHistoricalStoriesApi {
  private ApiClient apiClient;

  public StreetAccountHistoricalStoriesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StreetAccountHistoricalStoriesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getFilesDataResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFilesDataResponseTypeMap.put(200, new GenericType<GetfilesResponse>(){});
    getFilesDataResponseTypeMap.put(400, new GenericType<Error>(){});
    getFilesDataResponseTypeMap.put(401, new GenericType<Error>(){});
    getFilesDataResponseTypeMap.put(403, new GenericType<Error>(){});
    getFilesDataResponseTypeMap.put(404, new GenericType<Error>(){});
    getFilesDataResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getStatusDataResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getStatusDataResponseTypeMap.put(201, new GenericType<SubmittedResponse>(){});
    getStatusDataResponseTypeMap.put(202, new GenericType<AcceptedResponse>(){});
    getStatusDataResponseTypeMap.put(400, new GenericType<Error>(){});
    getStatusDataResponseTypeMap.put(401, new GenericType<Error>(){});
    getStatusDataResponseTypeMap.put(403, new GenericType<Error>(){});
    getStatusDataResponseTypeMap.put(404, new GenericType<Error>(){});
    getStatusDataResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> requestFilesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    requestFilesResponseTypeMap.put(202, new GenericType<AcceptedResponse>(){});
    requestFilesResponseTypeMap.put(400, new GenericType<Error>(){});
    requestFilesResponseTypeMap.put(401, new GenericType<Error>(){});
    requestFilesResponseTypeMap.put(403, new GenericType<Error>(){});
    requestFilesResponseTypeMap.put(429, new GenericType<Error>(){});
    requestFilesResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  
 /**
   * Wrapper to support GET /historical/files/status returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>201 : {@code SubmittedResponse }<br>The Request has been Created. </li>
   * 
   *   <li>202 : {@code AcceptedResponse }<br>The Request has been Accepted. </li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetStatusDataResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 201:
   *     SubmittedResponse data201 = response.getResponse201();
   *     break;
   *   case 202:
   *     AcceptedResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetStatusDataResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetStatusDataResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public SubmittedResponse getResponse201() throws ApiException {
      if (this.statusCode != 201) {
        throw new ApiException(500, "Invalid response getter called. getResponse201 can't return a " + this.statusCode + " response");
      }
      return (SubmittedResponse) this.response;
    }
    
    public AcceptedResponse getResponse202() throws ApiException {
      if (this.statusCode != 202) {
        throw new ApiException(500, "Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
      }
      return (AcceptedResponse) this.response;
    }
    

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      GetStatusDataResponseWrapper other = (GetStatusDataResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetStatusDataResponseWrapper {\n"
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
   * Returns the StreetAccount Historical data in files requested in the /historical/files/create endpoint.
   * Need to plug-in the ID got from /historical/files/create into /historical/files/status endpoint
   * @param id ID returned by the /historical/files/create endpoint to collect the results of the query (required)
   * @param paginationLimit Specifies the maximum number of results to return per result (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results (optional)
   * @return GetfilesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  * Location - Relative location to poll for status. <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public GetfilesResponse getFilesData(String id, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getFilesDataWithHttpInfo(id, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the StreetAccount Historical data in files requested in the /historical/files/create endpoint.
   * Need to plug-in the ID got from /historical/files/create into /historical/files/status endpoint
   * @param id ID returned by the /historical/files/create endpoint to collect the results of the query (required)
   * @param paginationLimit Specifies the maximum number of results to return per result (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results (optional)
   * @return ApiResponse&lt;GetfilesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  * Location - Relative location to poll for status. <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetfilesResponse> getFilesDataWithHttpInfo(String id, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getFilesData");
    }
    
    // create path and map variables
    String localVarPath = "/historical/files/get";

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
        
        GetfilesResponse
      
    > apiResponse = apiClient.invokeAPI("StreetAccountHistoricalStoriesApi.getFilesData", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFilesDataResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the status of the request
   * Need to plug-in the ID get from /historical/files/create endpoint into /historical/files/status endpoint
   * @param id ID returned by the /historical/files/create endpoint to know the status (required)
   * @param paginationLimit Specifies the maximum number of results to return per result (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)
   * @return GetStatusDataResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> The Request has been Created.  </td><td>  * Location - Relative location to poll for status. <br>  </td></tr>
       <tr><td> 202 </td><td> The Request has been Accepted.  </td><td>  * Location - Relative location to poll for status. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public GetStatusDataResponseWrapper getStatusData(String id, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getStatusDataWithHttpInfo(id, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the status of the request
   * Need to plug-in the ID get from /historical/files/create endpoint into /historical/files/status endpoint
   * @param id ID returned by the /historical/files/create endpoint to know the status (required)
   * @param paginationLimit Specifies the maximum number of results to return per result (optional)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)
   * @return ApiResponse&lt;GetStatusDataResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> The Request has been Created.  </td><td>  * Location - Relative location to poll for status. <br>  </td></tr>
       <tr><td> 202 </td><td> The Request has been Accepted.  </td><td>  * Location - Relative location to poll for status. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetStatusDataResponseWrapper> getStatusDataWithHttpInfo(String id, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getStatusData");
    }
    
    // create path and map variables
    String localVarPath = "/historical/files/status";

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
        
      
    > apiResponse = apiClient.invokeAPI("StreetAccountHistoricalStoriesApi.getStatusData", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getStatusDataResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetStatusDataResponseWrapper responseWrapper = new GetStatusDataResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetStatusDataResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
  /**
   * Requests the creation of StreetAccount News Files with historical data.
   * Data available from past 10 years, 2 years of data can be retrieved per API request and an ID is returned.
   * @param createFilesRequest  (required)
   * @return AcceptedResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> The Request has been Accepted.  </td><td>  * Location - Relative location to poll for status. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public AcceptedResponse requestFiles(CreateFilesRequest createFilesRequest) throws ApiException {
    return requestFilesWithHttpInfo(createFilesRequest).getData();
  }

  /**
   * Requests the creation of StreetAccount News Files with historical data.
   * Data available from past 10 years, 2 years of data can be retrieved per API request and an ID is returned.
   * @param createFilesRequest  (required)
   * @return ApiResponse&lt;AcceptedResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> The Request has been Accepted.  </td><td>  * Location - Relative location to poll for status. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too many requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AcceptedResponse> requestFilesWithHttpInfo(CreateFilesRequest createFilesRequest) throws ApiException {
    Object localVarPostBody = createFilesRequest;
    
    // verify the required parameter 'createFilesRequest' is set
    if (createFilesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createFilesRequest' when calling requestFiles");
    }
    
    // create path and map variables
    String localVarPath = "/historical/files/create";

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
        
        AcceptedResponse
      
    > apiResponse = apiClient.invokeAPI("StreetAccountHistoricalStoriesApi.requestFiles", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, requestFilesResponseTypeMap, false);

    return apiResponse;

  }
}
