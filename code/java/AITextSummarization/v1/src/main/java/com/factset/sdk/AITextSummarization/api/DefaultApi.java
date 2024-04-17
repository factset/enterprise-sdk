package com.factset.sdk.AITextSummarization.api;

import com.factset.sdk.AITextSummarization.ApiException;
import com.factset.sdk.AITextSummarization.ApiClient;
import com.factset.sdk.AITextSummarization.ApiResponse;
import com.factset.sdk.AITextSummarization.Configuration;
import com.factset.sdk.AITextSummarization.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.AITextSummarization.models.BadRequestResponse;
import com.factset.sdk.AITextSummarization.models.InternalServerErrorResponse;
import com.factset.sdk.AITextSummarization.models.Request;
import com.factset.sdk.AITextSummarization.models.SuccessResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getResultV1ResultResultIdResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getResultV1ResultResultIdResponseTypeMap.put(200, new GenericType<SuccessResponse>(){});
    getResultV1ResultResultIdResponseTypeMap.put(400, new GenericType<BadRequestResponse>(){});
    getResultV1ResultResultIdResponseTypeMap.put(500, new GenericType<InternalServerErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postHeadlineAndSummaryV1HeadlineAndSummaryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postHeadlineAndSummaryV1HeadlineAndSummaryResponseTypeMap.put(201, new GenericType<String>(){});
    postHeadlineAndSummaryV1HeadlineAndSummaryResponseTypeMap.put(400, new GenericType<BadRequestResponse>(){});
    postHeadlineAndSummaryV1HeadlineAndSummaryResponseTypeMap.put(500, new GenericType<InternalServerErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postHeadlineV1HeadlineResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postHeadlineV1HeadlineResponseTypeMap.put(201, new GenericType<String>(){});
    postHeadlineV1HeadlineResponseTypeMap.put(400, new GenericType<BadRequestResponse>(){});
    postHeadlineV1HeadlineResponseTypeMap.put(500, new GenericType<InternalServerErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postSummaryV1SummaryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postSummaryV1SummaryResponseTypeMap.put(201, new GenericType<String>(){});
    postSummaryV1SummaryResponseTypeMap.put(400, new GenericType<BadRequestResponse>(){});
    postSummaryV1SummaryResponseTypeMap.put(500, new GenericType<InternalServerErrorResponse>(){});
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
   * GET request that returns the full headline and summary results from the initial POST requests
   * Endpoint that returns the full headline and summary results from the initial POST requests.
   * @param resultId  (required)
   * @return SuccessResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Processing </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Access Denied </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Invalid Result ID </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public SuccessResponse getResultV1ResultResultId(String resultId) throws ApiException {
    return getResultV1ResultResultIdWithHttpInfo(resultId).getData();
  }

  /**
   * GET request that returns the full headline and summary results from the initial POST requests
   * Endpoint that returns the full headline and summary results from the initial POST requests.
   * @param resultId  (required)
   * @return ApiResponse&lt;SuccessResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Processing </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Access Denied </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Invalid Result ID </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SuccessResponse> getResultV1ResultResultIdWithHttpInfo(String resultId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'resultId' is set
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling getResultV1ResultResultId");
    }
    
    // create path and map variables
    String localVarPath = "/result/{result_id}"
      .replaceAll("\\{" + "result_id" + "\\}", apiClient.escapeString(resultId.toString()));

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
        
        SuccessResponse
      
    > apiResponse = apiClient.invokeAPI("DefaultApi.getResultV1ResultResultId", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getResultV1ResultResultIdResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * POST request to create a 2-3 sentence summary from input text
   * Endpoint for initiating a processing job to create a 2-3 sentence summary from input text.
   * @param payload  (required)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Unique Result ID </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Access Denied </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public String postHeadlineAndSummaryV1HeadlineAndSummary(Request payload) throws ApiException {
    return postHeadlineAndSummaryV1HeadlineAndSummaryWithHttpInfo(payload).getData();
  }

  /**
   * POST request to create a 2-3 sentence summary from input text
   * Endpoint for initiating a processing job to create a 2-3 sentence summary from input text.
   * @param payload  (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Unique Result ID </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Access Denied </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> postHeadlineAndSummaryV1HeadlineAndSummaryWithHttpInfo(Request payload) throws ApiException {
    Object localVarPostBody = payload;
    
    // verify the required parameter 'payload' is set
    if (payload == null) {
      throw new ApiException(400, "Missing the required parameter 'payload' when calling postHeadlineAndSummaryV1HeadlineAndSummary");
    }
    
    // create path and map variables
    String localVarPath = "/headline-and-summary";

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
        
        String
      
    > apiResponse = apiClient.invokeAPI("DefaultApi.postHeadlineAndSummaryV1HeadlineAndSummary", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postHeadlineAndSummaryV1HeadlineAndSummaryResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * POST request to create a headline from input text
   * Endpoint for initiating a processing job to create a headline from input text.
   * @param payload  (required)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Unique Result ID </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Access Denied </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public String postHeadlineV1Headline(Request payload) throws ApiException {
    return postHeadlineV1HeadlineWithHttpInfo(payload).getData();
  }

  /**
   * POST request to create a headline from input text
   * Endpoint for initiating a processing job to create a headline from input text.
   * @param payload  (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Unique Result ID </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Access Denied </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> postHeadlineV1HeadlineWithHttpInfo(Request payload) throws ApiException {
    Object localVarPostBody = payload;
    
    // verify the required parameter 'payload' is set
    if (payload == null) {
      throw new ApiException(400, "Missing the required parameter 'payload' when calling postHeadlineV1Headline");
    }
    
    // create path and map variables
    String localVarPath = "/headline";

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
        
        String
      
    > apiResponse = apiClient.invokeAPI("DefaultApi.postHeadlineV1Headline", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postHeadlineV1HeadlineResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * POST request to create a headline and summary from input text
   * Endpoint for initiating a processing job to create a headline and summary from input text.
   * @param payload  (required)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Unique Result ID </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Access Denied </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public String postSummaryV1Summary(Request payload) throws ApiException {
    return postSummaryV1SummaryWithHttpInfo(payload).getData();
  }

  /**
   * POST request to create a headline and summary from input text
   * Endpoint for initiating a processing job to create a headline and summary from input text.
   * @param payload  (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Unique Result ID </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Access Denied </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> postSummaryV1SummaryWithHttpInfo(Request payload) throws ApiException {
    Object localVarPostBody = payload;
    
    // verify the required parameter 'payload' is set
    if (payload == null) {
      throw new ApiException(400, "Missing the required parameter 'payload' when calling postSummaryV1Summary");
    }
    
    // create path and map variables
    String localVarPath = "/summary";

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
        
        String
      
    > apiResponse = apiClient.invokeAPI("DefaultApi.postSummaryV1Summary", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postSummaryV1SummaryResponseTypeMap, false);

    return apiResponse;

  }
}
