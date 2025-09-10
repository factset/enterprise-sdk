package com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.api;

import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiException;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiClient;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiResponse;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.Configuration;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.BadFeedbackRequestError;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.FeedbackRequest;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.ForbiddenError;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.InternalServerError;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FeedbackApi {
  private ApiClient apiClient;

  public FeedbackApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FeedbackApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> sendFeedbackResponseTypeMap = new HashMap<Integer, GenericType>();

  


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
   * Send feedback on the response to a query.
   * Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses.  Feedback will only be accepted within 24 hours of the original response, and only once for each response ID. If you would like to provide additional feedback, please reach out to your FactSet Support Team representative. 
   * @param feedbackRequest Body containing the ID of the response from FactSet Mercury as well as the feedback on that response.  The responseId field must be populated with the ID received from the &#x60;/result&#x60; endpoint. Send this along with a boolean representing whether the response was helpful or not.  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * Api-Deprected-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request to /feedback endpoint </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed [via this developer portal page](https://developer.factset.com/manage-api-keys)) or valid OAuth 2.0 credentials (see [OAuth 2.0 documentation on the developer portal](https://developer.factset.com/learn/authentication-oauth2)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have the proper permissions for this request.   Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to.  This may also be due to your IP address being unsupported by the API key you are currently using. Please ensure your IP address is whitelisted for the API key you are using. IP addresses can be managed per API key via [this developer portal page](https://developer.factset.com/manage-api-keys).  </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed - The requested endpoint does not support the used HTTP method. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - This endpoint is currently rate-limited to 10 requests per second and 300 requests per minute for an individual user serial. If you are receiving an unexpected amount of these errors, please contact the API team by selecting &#x60;Report Issue&#x60; at the top of this page. </td><td>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public void sendFeedback(FeedbackRequest feedbackRequest) throws ApiException {
    sendFeedbackWithHttpInfo(feedbackRequest);
  }

  /**
   * Send feedback on the response to a query.
   * Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses.  Feedback will only be accepted within 24 hours of the original response, and only once for each response ID. If you would like to provide additional feedback, please reach out to your FactSet Support Team representative. 
   * @param feedbackRequest Body containing the ID of the response from FactSet Mercury as well as the feedback on that response.  The responseId field must be populated with the ID received from the &#x60;/result&#x60; endpoint. Send this along with a boolean representing whether the response was helpful or not.  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * Api-Deprected-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request to /feedback endpoint </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed [via this developer portal page](https://developer.factset.com/manage-api-keys)) or valid OAuth 2.0 credentials (see [OAuth 2.0 documentation on the developer portal](https://developer.factset.com/learn/authentication-oauth2)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have the proper permissions for this request.   Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to.  This may also be due to your IP address being unsupported by the API key you are currently using. Please ensure your IP address is whitelisted for the API key you are using. IP addresses can be managed per API key via [this developer portal page](https://developer.factset.com/manage-api-keys).  </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed - The requested endpoint does not support the used HTTP method. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - This endpoint is currently rate-limited to 10 requests per second and 300 requests per minute for an individual user serial. If you are receiving an unexpected amount of these errors, please contact the API team by selecting &#x60;Report Issue&#x60; at the top of this page. </td><td>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> sendFeedbackWithHttpInfo(FeedbackRequest feedbackRequest) throws ApiException {
    Object localVarPostBody = feedbackRequest;
    
    // verify the required parameter 'feedbackRequest' is set
    if (feedbackRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'feedbackRequest' when calling sendFeedback");
    }
    
    // create path and map variables
    String localVarPath = "/feedback";

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
      Void
    > apiResponse = apiClient.invokeAPI("FeedbackApi.sendFeedback", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, sendFeedbackResponseTypeMap, false);

    return apiResponse;

  }
}
