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

import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.Error;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.FeedbackRequest;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.RateLimitExceededError;

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
   * Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses. 
   * @param feedbackRequest ID represents the response ID received from the &#x60;/result&#x60; endpoint. Send this along with a boolean representing whether the response was helpful or not.  If you would like to provide additional natural language feedback, you can also include a string with your comments. Feedback will be accepted for 24 hours after the initial response.  **Note:** Feedback is optional, but we appreciate any input you can provide.  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Api-Supported-Versions - Comma-separated list of supported major versions. <br>  * Api-Version - Full semantic version of the API. <br>  * RateLimit-Limit - Request limit per second. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * X-RateLimit-Limit-minute - Request limit per minute. <br>  * X-RateLimit-Remaining-minute - Number of available requests in the current minute. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request - This may be due to an invalid request body or response ID. A response ID is invalid if it does not exist, is expired, or feedback has already been provided for this response.  </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - You are not properly authenticated for use of this API. Please make sure you are logged in to the developer portal or using a valid API key (managed [via this developer portal page](https://developer.factset.com/manage-api-keys)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have the entitlements enabled for this service. Please reach out to your FactSet Support Team representative to receive the proper entitlements. </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed - The requested endpoint does not support the used HTTP method. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - The &#x60;/feedback&#x60; endpoint is currently rate-limited to 10 requests per second for an individual organization. If you are receiving an unexpected amount of these errors, please contact the API team at [genai.offplatform@factset.com](genai.offplatform@factset.com). </td><td>  * RateLimit-Limit - Request limit per second. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * Retry-After - How long (in seconds) to wait before attempting to send a new request. <br>  * X-RateLimit-Limit-minute - Request limit per minute. <br>  * X-RateLimit-Remaining-minute - Number of available requests in the current minute. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public void sendFeedback(FeedbackRequest feedbackRequest) throws ApiException {
    sendFeedbackWithHttpInfo(feedbackRequest);
  }

  /**
   * Send feedback on the response to a query.
   * Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses. 
   * @param feedbackRequest ID represents the response ID received from the &#x60;/result&#x60; endpoint. Send this along with a boolean representing whether the response was helpful or not.  If you would like to provide additional natural language feedback, you can also include a string with your comments. Feedback will be accepted for 24 hours after the initial response.  **Note:** Feedback is optional, but we appreciate any input you can provide.  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Api-Supported-Versions - Comma-separated list of supported major versions. <br>  * Api-Version - Full semantic version of the API. <br>  * RateLimit-Limit - Request limit per second. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * X-RateLimit-Limit-minute - Request limit per minute. <br>  * X-RateLimit-Remaining-minute - Number of available requests in the current minute. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request - This may be due to an invalid request body or response ID. A response ID is invalid if it does not exist, is expired, or feedback has already been provided for this response.  </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - You are not properly authenticated for use of this API. Please make sure you are logged in to the developer portal or using a valid API key (managed [via this developer portal page](https://developer.factset.com/manage-api-keys)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have the entitlements enabled for this service. Please reach out to your FactSet Support Team representative to receive the proper entitlements. </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed - The requested endpoint does not support the used HTTP method. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - The &#x60;/feedback&#x60; endpoint is currently rate-limited to 10 requests per second for an individual organization. If you are receiving an unexpected amount of these errors, please contact the API team at [genai.offplatform@factset.com](genai.offplatform@factset.com). </td><td>  * RateLimit-Limit - Request limit per second. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * Retry-After - How long (in seconds) to wait before attempting to send a new request. <br>  * X-RateLimit-Limit-minute - Request limit per minute. <br>  * X-RateLimit-Remaining-minute - Number of available requests in the current minute. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  </td></tr>
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
