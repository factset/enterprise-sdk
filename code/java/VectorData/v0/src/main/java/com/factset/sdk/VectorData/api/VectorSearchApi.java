package com.factset.sdk.VectorData.api;

import com.factset.sdk.VectorData.ApiException;
import com.factset.sdk.VectorData.ApiClient;
import com.factset.sdk.VectorData.ApiResponse;
import com.factset.sdk.VectorData.Configuration;
import com.factset.sdk.VectorData.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.VectorData.models.ErrorResult;
import com.factset.sdk.VectorData.models.FormTypesResponse;
import com.factset.sdk.VectorData.models.SearchRequest;
import com.factset.sdk.VectorData.models.SearchResponse;
import com.factset.sdk.VectorData.models.SourceResponseData;
import com.factset.sdk.VectorData.models.VectorResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class VectorSearchApi {
  private ApiClient apiClient;

  public VectorSearchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VectorSearchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getFormTypesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFormTypesResponseTypeMap.put(200, new GenericType<FormTypesResponse>(){});
    getFormTypesResponseTypeMap.put(400, new GenericType<ErrorResult>(){});
    getFormTypesResponseTypeMap.put(401, new GenericType<ErrorResult>(){});
    getFormTypesResponseTypeMap.put(403, new GenericType<ErrorResult>(){});
    getFormTypesResponseTypeMap.put(500, new GenericType<ErrorResult>(){});
  }

  private static final Map<Integer, GenericType> getVectorResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getVectorResponseTypeMap.put(200, new GenericType<VectorResponse>(){});
    getVectorResponseTypeMap.put(400, new GenericType<ErrorResult>(){});
    getVectorResponseTypeMap.put(401, new GenericType<ErrorResult>(){});
    getVectorResponseTypeMap.put(403, new GenericType<ErrorResult>(){});
    getVectorResponseTypeMap.put(404, new GenericType<ErrorResult>(){});
    getVectorResponseTypeMap.put(422, new GenericType<ErrorResult>(){});
    getVectorResponseTypeMap.put(500, new GenericType<ErrorResult>(){});
  }

  private static final Map<Integer, GenericType> postSearchResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postSearchResponseTypeMap.put(200, new GenericType<SearchResponse>(){});
    postSearchResponseTypeMap.put(400, new GenericType<ErrorResult>(){});
    postSearchResponseTypeMap.put(401, new GenericType<ErrorResult>(){});
    postSearchResponseTypeMap.put(403, new GenericType<ErrorResult>(){});
    postSearchResponseTypeMap.put(422, new GenericType<ErrorResult>(){});
    postSearchResponseTypeMap.put(500, new GenericType<ErrorResult>(){});
  }

  private static final Map<Integer, GenericType> retrieveSourcesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    retrieveSourcesResponseTypeMap.put(200, new GenericType<SourceResponseData>(){});
    retrieveSourcesResponseTypeMap.put(400, new GenericType<ErrorResult>(){});
    retrieveSourcesResponseTypeMap.put(401, new GenericType<ErrorResult>(){});
    retrieveSourcesResponseTypeMap.put(403, new GenericType<ErrorResult>(){});
    retrieveSourcesResponseTypeMap.put(500, new GenericType<ErrorResult>(){});
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
   * Returns the available form types
   * Retrieves and delivers a comprehensive list of all available &#x60;formTypes&#x60;.
   * @return FormTypesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public FormTypesResponse getFormTypes() throws ApiException {
    return getFormTypesWithHttpInfo().getData();
  }

  /**
   * Returns the available form types
   * Retrieves and delivers a comprehensive list of all available &#x60;formTypes&#x60;.
   * @return ApiResponse&lt;FormTypesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FormTypesResponse> getFormTypesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/form-types";

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FormTypesResponse
      
    > apiResponse = apiClient.invokeAPI("VectorSearchApi.getFormTypes", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFormTypesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns vector data and metadata for specified vector IDs
   * Retrieves the complete vector embedding and all associated metadata for one or more vector IDs. Optionally returns trimmed vectors (metadata only) when the trimmed parameter is set to true.
   * @param vectorId Unique identifier for a document (required)
   * @param trimmed If true, returns metadata only without vector embeddings. If false, includes full vector embeddings in the response. (optional, default to false)
   * @param paginationLimit Number of results to return per page. (optional, default to 10)
   * @param paginationOffset Page number of the results to return.  (optional, default to 0)
   * @return VectorResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Validation failed for one or more request parameters or body fields. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public VectorResponse getVector(java.util.List<String> vectorId, Boolean trimmed, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getVectorWithHttpInfo(vectorId, trimmed, paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns vector data and metadata for specified vector IDs
   * Retrieves the complete vector embedding and all associated metadata for one or more vector IDs. Optionally returns trimmed vectors (metadata only) when the trimmed parameter is set to true.
   * @param vectorId Unique identifier for a document (required)
   * @param trimmed If true, returns metadata only without vector embeddings. If false, includes full vector embeddings in the response. (optional, default to false)
   * @param paginationLimit Number of results to return per page. (optional, default to 10)
   * @param paginationOffset Page number of the results to return.  (optional, default to 0)
   * @return ApiResponse&lt;VectorResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Validation failed for one or more request parameters or body fields. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VectorResponse> getVectorWithHttpInfo(java.util.List<String> vectorId, Boolean trimmed, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'vectorId' is set
    if (vectorId == null) {
      throw new ApiException(400, "Missing the required parameter 'vectorId' when calling getVector");
    }
    
    // create path and map variables
    String localVarPath = "/vector";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "vectorId", vectorId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trimmed", trimmed));
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
        
        VectorResponse
      
    > apiResponse = apiClient.invokeAPI("VectorSearchApi.getVector", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getVectorResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Perform semantic search and return ranked results with similarity scores
   * Performs semantic search across vectorized financial documents and returns results ranked by similarity score. Supports filtering by themes (including ESG themes and search concepts), sentiment, form types, date ranges, and entity identifiers.
   * @param searchRequest Input parameters for semantic search. (required)
   * @return SearchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns search results with similarity scores </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Validation failed for one or more request parameters or body fields. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public SearchResponse postSearch(SearchRequest searchRequest) throws ApiException {
    return postSearchWithHttpInfo(searchRequest).getData();
  }

  /**
   * Perform semantic search and return ranked results with similarity scores
   * Performs semantic search across vectorized financial documents and returns results ranked by similarity score. Supports filtering by themes (including ESG themes and search concepts), sentiment, form types, date ranges, and entity identifiers.
   * @param searchRequest Input parameters for semantic search. (required)
   * @return ApiResponse&lt;SearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns search results with similarity scores </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Validation failed for one or more request parameters or body fields. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SearchResponse> postSearchWithHttpInfo(SearchRequest searchRequest) throws ApiException {
    Object localVarPostBody = searchRequest;
    
    // verify the required parameter 'searchRequest' is set
    if (searchRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'searchRequest' when calling postSearch");
    }
    
    // create path and map variables
    String localVarPath = "/search";

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
        
        SearchResponse
      
    > apiResponse = apiClient.invokeAPI("VectorSearchApi.postSearch", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postSearchResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the available data sources
   * Retrieves and delivers a comprehensive list of all available &#x60;sources&#x60;.
   * @param entitledSources If true, returns only entitled sources. If false, returns all the available sources. (optional, default to false)
   * @param type Filters type of sources. (optional)
   * @return SourceResponseData
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public SourceResponseData retrieveSources(Boolean entitledSources, java.util.List<String> type) throws ApiException {
    return retrieveSourcesWithHttpInfo(entitledSources, type).getData();
  }

  /**
   * Returns the available data sources
   * Retrieves and delivers a comprehensive list of all available &#x60;sources&#x60;.
   * @param entitledSources If true, returns only entitled sources. If false, returns all the available sources. (optional, default to false)
   * @param type Filters type of sources. (optional)
   * @return ApiResponse&lt;SourceResponseData&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SourceResponseData> retrieveSourcesWithHttpInfo(Boolean entitledSources, java.util.List<String> type) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/sources";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entitledSources", entitledSources));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "type", type));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        SourceResponseData
      
    > apiResponse = apiClient.invokeAPI("VectorSearchApi.retrieveSources", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, retrieveSourcesResponseTypeMap, false);

    return apiResponse;

  }
}
