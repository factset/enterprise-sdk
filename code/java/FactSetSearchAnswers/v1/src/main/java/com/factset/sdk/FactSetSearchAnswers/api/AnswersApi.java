package com.factset.sdk.FactSetSearchAnswers.api;

import com.factset.sdk.FactSetSearchAnswers.ApiException;
import com.factset.sdk.FactSetSearchAnswers.ApiClient;
import com.factset.sdk.FactSetSearchAnswers.ApiResponse;
import com.factset.sdk.FactSetSearchAnswers.Configuration;
import com.factset.sdk.FactSetSearchAnswers.Pair;

import javax.ws.rs.core.GenericType;

import com.factset.sdk.FactSetSearchAnswers.models.AdaptiveCardAnswerSuccessResponse;
import com.factset.sdk.FactSetSearchAnswers.models.AnswerFailureResponse;
import com.factset.sdk.FactSetSearchAnswers.models.DataAnswerSuccessResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AnswersApi {
  private ApiClient apiClient;

  public AnswersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AnswersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
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
   * Fetch FactSet answer in Adaptive Card format
   * Returns an answer to the specified query (if valid answer exists) in the Adaptive Card format (https://adaptivecards.io/).
   * @param query Query for desired answer (e.g., \&quot;fds price\&quot;) (required)
   * @param includeThumbnail Includes thumbnail of Adaptive Card in response (optional, default to false)
   * @param disableNoAnswerResponses Disables no-result answer responses (no-results and answer without data) (optional, default to true)
   * @return AdaptiveCardAnswerSuccessResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Request was successful. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Missing or empty query. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unhandled error occurred while processing the request. </td><td>  -  </td></tr>
     </table>
   */
  public AdaptiveCardAnswerSuccessResponse searchForAdaptiveCardAnswer(String query, Boolean includeThumbnail, Boolean disableNoAnswerResponses) throws ApiException {
    return searchForAdaptiveCardAnswerWithHttpInfo(query, includeThumbnail, disableNoAnswerResponses).getData();
  }

  /**
   * Fetch FactSet answer in Adaptive Card format
   * Returns an answer to the specified query (if valid answer exists) in the Adaptive Card format (https://adaptivecards.io/).
   * @param query Query for desired answer (e.g., \&quot;fds price\&quot;) (required)
   * @param includeThumbnail Includes thumbnail of Adaptive Card in response (optional, default to false)
   * @param disableNoAnswerResponses Disables no-result answer responses (no-results and answer without data) (optional, default to true)
   * @return ApiResponse&lt;AdaptiveCardAnswerSuccessResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Request was successful. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Missing or empty query. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unhandled error occurred while processing the request. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AdaptiveCardAnswerSuccessResponse> searchForAdaptiveCardAnswerWithHttpInfo(String query, Boolean includeThumbnail, Boolean disableNoAnswerResponses) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'query' is set
    if (query == null) {
      throw new ApiException(400, "Missing the required parameter 'query' when calling searchForAdaptiveCardAnswer");
    }
    
    // create path and map variables
    String localVarPath = "/search/answers/v1/adaptive-card";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeThumbnail", includeThumbnail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "disableNoAnswerResponses", disableNoAnswerResponses));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<AdaptiveCardAnswerSuccessResponse> localVarReturnType = new GenericType<AdaptiveCardAnswerSuccessResponse>() {};

    return apiClient.invokeAPI("AnswersApi.searchForAdaptiveCardAnswer", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Fetch FactSet answer in data format
   * Returns an answer to the specified query (if a valid answer exists). Returns the answer data only (as JSON), without any markup information.
   * @param query Query for desired answer (e.g., \&quot;fds price\&quot;) (required)
   * @return DataAnswerSuccessResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Request was successful. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Missing or empty query. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unhandled error occurred while processing the request. </td><td>  -  </td></tr>
     </table>
   */
  public DataAnswerSuccessResponse searchForDataAnswer(String query) throws ApiException {
    return searchForDataAnswerWithHttpInfo(query).getData();
  }

  /**
   * Fetch FactSet answer in data format
   * Returns an answer to the specified query (if a valid answer exists). Returns the answer data only (as JSON), without any markup information.
   * @param query Query for desired answer (e.g., \&quot;fds price\&quot;) (required)
   * @return ApiResponse&lt;DataAnswerSuccessResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Request was successful. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Missing or empty query. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unhandled error occurred while processing the request. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DataAnswerSuccessResponse> searchForDataAnswerWithHttpInfo(String query) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'query' is set
    if (query == null) {
      throw new ApiException(400, "Missing the required parameter 'query' when calling searchForDataAnswer");
    }
    
    // create path and map variables
    String localVarPath = "/search/answers/v1/data";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<DataAnswerSuccessResponse> localVarReturnType = new GenericType<DataAnswerSuccessResponse>() {};

    return apiClient.invokeAPI("AnswersApi.searchForDataAnswer", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
