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
    getIssueResponseTypeMap.put(401, new GenericType<String>(){});
    getIssueResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getIssueResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getIssueResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> patchIssueResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    patchIssueResponseTypeMap.put(200, new GenericType<IdResponse>(){});
    patchIssueResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    patchIssueResponseTypeMap.put(401, new GenericType<String>(){});
    patchIssueResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    patchIssueResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postIssueResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postIssueResponseTypeMap.put(201, new GenericType<IdResponse>(){});
    postIssueResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    postIssueResponseTypeMap.put(401, new GenericType<String>(){});
    postIssueResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    postIssueResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postReplyResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postReplyResponseTypeMap.put(201, new GenericType<IdResponse>(){});
    postReplyResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    postReplyResponseTypeMap.put(401, new GenericType<String>(){});
    postReplyResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
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
   * This endpoint allows retrieval of client information associated with a specific issue ID. When an issue contains file attachments, the Issue Tracker will return relative paths for these files. You can refer to the sample responses given in the examples and API Overview.
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
   * This endpoint allows retrieval of client information associated with a specific issue ID. When an issue contains file attachments, the Issue Tracker will return relative paths for these files. You can refer to the sample responses given in the examples and API Overview.
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
      "application/json", "text/plain"
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
   * Update issue details
   *  Update Issue Properties Following Mentioned Constraints     Combo Updates (Must be sent together):  1. Title + Severity 2. ProductId + CategoryId  Single Field Updates: 1. Title, Severity, ProductId can be updated alone 2. Status (alone)  2.1 If setting status to \&quot;Closed\&quot;, closeContent is mandatory 3. ReadOnly (alone)  3.1 Only allowed if issue is already \&quot;Closed\&quot;  Invalid Combinations (Will be rejected):  1. Mixing Title with Status 2. Updating Status + ReadOnly together 3. Severity + ProductId 4. Status &#x3D; \&quot;Closed\&quot; without closeContent 5. Setting ReadOnly when RPD is not closed.
   * @param id ID of Issue Tracker issue (required)
   * @param updateIssueRequest  (optional)
   * @return IdResponse
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
  public IdResponse patchIssue(String id, UpdateIssueRequest updateIssueRequest) throws ApiException {
    return patchIssueWithHttpInfo(id, updateIssueRequest).getData();
  }

  /**
   * Update issue details
   *  Update Issue Properties Following Mentioned Constraints     Combo Updates (Must be sent together):  1. Title + Severity 2. ProductId + CategoryId  Single Field Updates: 1. Title, Severity, ProductId can be updated alone 2. Status (alone)  2.1 If setting status to \&quot;Closed\&quot;, closeContent is mandatory 3. ReadOnly (alone)  3.1 Only allowed if issue is already \&quot;Closed\&quot;  Invalid Combinations (Will be rejected):  1. Mixing Title with Status 2. Updating Status + ReadOnly together 3. Severity + ProductId 4. Status &#x3D; \&quot;Closed\&quot; without closeContent 5. Setting ReadOnly when RPD is not closed.
   * @param id ID of Issue Tracker issue (required)
   * @param updateIssueRequest  (optional)
   * @return ApiResponse&lt;IdResponse&gt;
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
  public ApiResponse<IdResponse> patchIssueWithHttpInfo(String id, UpdateIssueRequest updateIssueRequest) throws ApiException {
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
      "application/json", "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        IdResponse
      
    > apiResponse = apiClient.invokeAPI("IssueApi.patchIssue", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, patchIssueResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Creates a Issue Tracker issue
   * Creates a new issue in Issue Tracker     **Note:** connectorId, connectorDisplayId can be sent when integrations are configured on product, to sync back the updates from FactSet side. connectorDisplayId can&#39;t be set without connectorDisplayId. Reachout to factset team to check if the integrations re enabled on the product.
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
   * Creates a new issue in Issue Tracker     **Note:** connectorId, connectorDisplayId can be sent when integrations are configured on product, to sync back the updates from FactSet side. connectorDisplayId can&#39;t be set without connectorDisplayId. Reachout to factset team to check if the integrations re enabled on the product.
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
      "application/json", "text/plain"
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
      "application/json", "text/plain"
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
