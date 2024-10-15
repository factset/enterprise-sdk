package com.factset.sdk.IssueTracker.api;

import com.factset.sdk.IssueTracker.ApiException;
import com.factset.sdk.IssueTracker.ApiClient;
import com.factset.sdk.IssueTracker.ApiResponse;
import com.factset.sdk.IssueTracker.Configuration;
import com.factset.sdk.IssueTracker.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.IssueTracker.models.CommentRequest;
import com.factset.sdk.IssueTracker.models.ErrorResponse;
import com.factset.sdk.IssueTracker.models.IdResponse;
import com.factset.sdk.IssueTracker.models.Issue;
import com.factset.sdk.IssueTracker.models.IssueRequest;
import com.factset.sdk.IssueTracker.models.UpdateIssueRequest;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class IssueApi {
  private ApiClient apiClient;

  public IssueApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IssueApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getIssueResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getIssueResponseTypeMap.put(200, new GenericType<Issue>(){});
    getIssueResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getIssueResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> patchIssueResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> postIssueResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postIssueResponseTypeMap.put(201, new GenericType<IdResponse>(){});
    postIssueResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    postIssueResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postReplyResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postReplyResponseTypeMap.put(201, new GenericType<IdResponse>(){});
    postReplyResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    postReplyResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Get the matched issue details
   * Retrieve the information of the client with the matching issue Id.
   * @param id ID of Issue Tracker issue (required)
   * @return Issue
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public Issue getIssue(String id) throws ApiException {
    return getIssueWithHttpInfo(id).getData();
  }

  /**
   * Get the matched issue details
   * Retrieve the information of the client with the matching issue Id.
   * @param id ID of Issue Tracker issue (required)
   * @return ApiResponse&lt;Issue&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Issue> getIssueWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getIssue");
    }
    
    // create path and map variables
    String localVarPath = "/issues/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
        
        Issue
      
    > apiResponse = apiClient.invokeAPI("IssueApi.getIssue", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getIssueResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Update severity and subject of issue or productId and categoryId of issue
   * User can update either &#x60;isCritical&#x60; with &#x60;subject&#x60; or &#x60;productId&#x60; with &#x60;categoryId&#x60;.    **Note:** Users are not allowed to update &#x60;isCritical&#x60; with &#x60;productId&#x60; or &#x60;subject&#x60; with &#x60;productId&#x60;
   * @param id ID of Issue Tracker issue (required)
   * @param updateIssueRequest  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public void patchIssue(String id, UpdateIssueRequest updateIssueRequest) throws ApiException {
    patchIssueWithHttpInfo(id, updateIssueRequest);
  }

  /**
   * Update severity and subject of issue or productId and categoryId of issue
   * User can update either &#x60;isCritical&#x60; with &#x60;subject&#x60; or &#x60;productId&#x60; with &#x60;categoryId&#x60;.    **Note:** Users are not allowed to update &#x60;isCritical&#x60; with &#x60;productId&#x60; or &#x60;subject&#x60; with &#x60;productId&#x60;
   * @param id ID of Issue Tracker issue (required)
   * @param updateIssueRequest  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> patchIssueWithHttpInfo(String id, UpdateIssueRequest updateIssueRequest) throws ApiException {
    Object localVarPostBody = updateIssueRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchIssue");
    }
    
    // create path and map variables
    String localVarPath = "/issues/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
      Void
    > apiResponse = apiClient.invokeAPI("IssueApi.patchIssue", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, patchIssueResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Creates a Issue Tracker issue
   * Creates a new issue in Issue Tracker
   * @param issueRequest  (optional)
   * @return IdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public IdResponse postIssue(IssueRequest issueRequest) throws ApiException {
    return postIssueWithHttpInfo(issueRequest).getData();
  }

  /**
   * Creates a Issue Tracker issue
   * Creates a new issue in Issue Tracker
   * @param issueRequest  (optional)
   * @return ApiResponse&lt;IdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IdResponse> postIssueWithHttpInfo(IssueRequest issueRequest) throws ApiException {
    Object localVarPostBody = issueRequest;
    
    // create path and map variables
    String localVarPath = "/issues";

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
        
        IdResponse
      
    > apiResponse = apiClient.invokeAPI("IssueApi.postIssue", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postIssueResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * post comment to Issue Tracker issue
   * Reply to the existing matched issue 
   * @param id ID of Issue Tracker issue (required)
   * @param commentRequest  (optional)
   * @return IdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public IdResponse postReply(String id, CommentRequest commentRequest) throws ApiException {
    return postReplyWithHttpInfo(id, commentRequest).getData();
  }

  /**
   * post comment to Issue Tracker issue
   * Reply to the existing matched issue 
   * @param id ID of Issue Tracker issue (required)
   * @param commentRequest  (optional)
   * @return ApiResponse&lt;IdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IdResponse> postReplyWithHttpInfo(String id, CommentRequest commentRequest) throws ApiException {
    Object localVarPostBody = commentRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling postReply");
    }
    
    // create path and map variables
    String localVarPath = "/issues/{id}/comments"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
        
        IdResponse
      
    > apiResponse = apiClient.invokeAPI("IssueApi.postReply", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postReplyResponseTypeMap, false);

    return apiResponse;

  }
}
