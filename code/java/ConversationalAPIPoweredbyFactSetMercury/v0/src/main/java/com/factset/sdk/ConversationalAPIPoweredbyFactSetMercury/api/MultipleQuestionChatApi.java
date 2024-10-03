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

import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.ChatPollingRequest;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.Error;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.QueryChatRequest;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.QueryChatResponse;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.QueryResponse;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.RateLimitExceededError;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.StatusPollResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class MultipleQuestionChatApi {
  private ApiClient apiClient;

  public MultipleQuestionChatApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MultipleQuestionChatApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getChatResultResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getChatResultResponseTypeMap.put(200, new GenericType<QueryResponse>(){});
    getChatResultResponseTypeMap.put(400, new GenericType<Error>(){});
    getChatResultResponseTypeMap.put(401, new GenericType<String>(){});
    getChatResultResponseTypeMap.put(403, new GenericType<String>(){});
    getChatResultResponseTypeMap.put(405, new GenericType<String>(){});
    getChatResultResponseTypeMap.put(429, new GenericType<RateLimitExceededError>(){});
    getChatResultResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> getChatStatusResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getChatStatusResponseTypeMap.put(201, new GenericType<StatusPollResponse>(){});
    getChatStatusResponseTypeMap.put(202, new GenericType<StatusPollResponse>(){});
    getChatStatusResponseTypeMap.put(400, new GenericType<Error>(){});
    getChatStatusResponseTypeMap.put(401, new GenericType<String>(){});
    getChatStatusResponseTypeMap.put(403, new GenericType<String>(){});
    getChatStatusResponseTypeMap.put(405, new GenericType<String>(){});
    getChatStatusResponseTypeMap.put(429, new GenericType<RateLimitExceededError>(){});
    getChatStatusResponseTypeMap.put(500, new GenericType<Error>(){});
  }

  private static final Map<Integer, GenericType> queryChatResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    queryChatResponseTypeMap.put(202, new GenericType<QueryChatResponse>(){});
    queryChatResponseTypeMap.put(400, new GenericType<Error>(){});
    queryChatResponseTypeMap.put(401, new GenericType<String>(){});
    queryChatResponseTypeMap.put(403, new GenericType<String>(){});
    queryChatResponseTypeMap.put(405, new GenericType<String>(){});
    queryChatResponseTypeMap.put(429, new GenericType<RateLimitExceededError>(){});
    queryChatResponseTypeMap.put(500, new GenericType<Error>(){});
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
   * Retrieve the completed response for your query.
   * Returns FactSet content and data in response to the query provided to the &#x60;/query&#x60; endpoint. This endpoint is the final step in the query request process. Responses contain a combination of Microsoft Adaptive Cards for data/tables and markdown for text. 
   * @param chatPollingRequest ID representing the chat process for your query (required)
   * @return QueryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Api-Supported-Versions - Comma-separated list of supported major versions. <br>  * Api-Version - Full semantic version of the API. <br>  * RateLimit-Limit - Request limit per second. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * X-RateLimit-Limit-minute - Request limit per minute. <br>  * X-RateLimit-Remaining-minute - Number of available requests in the current minute. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - You are not properly authenticated for use of this API. Please make sure you are logged in to the developer portal or using a valid API key (managed [via this developer portal page](https://developer.factset.com/manage-api-keys)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have the entitlements enabled for this service. Please reach out to your FactSet Support Team representative to receive the proper entitlements. </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed - The requested endpoint does not support the used HTTP method. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - The /result endpoint is currently rate-limited to 10 requests per second for an individual organization. If you are receiving an unexpected amount of these errors, please contact the API team at [genai.offplatform@factset.com](genai.offplatform@factset.com). </td><td>  * RateLimit-Limit - Request limit per second. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * Retry-After - How long (in seconds) to wait before attempting to send a new request. <br>  * X-RateLimit-Limit-minute - Request limit per minute. <br>  * X-RateLimit-Remaining-minute - Number of available requests in the current minute. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public QueryResponse getChatResult(ChatPollingRequest chatPollingRequest) throws ApiException {
    return getChatResultWithHttpInfo(chatPollingRequest).getData();
  }

  /**
   * Retrieve the completed response for your query.
   * Returns FactSet content and data in response to the query provided to the &#x60;/query&#x60; endpoint. This endpoint is the final step in the query request process. Responses contain a combination of Microsoft Adaptive Cards for data/tables and markdown for text. 
   * @param chatPollingRequest ID representing the chat process for your query (required)
   * @return ApiResponse&lt;QueryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Api-Supported-Versions - Comma-separated list of supported major versions. <br>  * Api-Version - Full semantic version of the API. <br>  * RateLimit-Limit - Request limit per second. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * X-RateLimit-Limit-minute - Request limit per minute. <br>  * X-RateLimit-Remaining-minute - Number of available requests in the current minute. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - You are not properly authenticated for use of this API. Please make sure you are logged in to the developer portal or using a valid API key (managed [via this developer portal page](https://developer.factset.com/manage-api-keys)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have the entitlements enabled for this service. Please reach out to your FactSet Support Team representative to receive the proper entitlements. </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed - The requested endpoint does not support the used HTTP method. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - The /result endpoint is currently rate-limited to 10 requests per second for an individual organization. If you are receiving an unexpected amount of these errors, please contact the API team at [genai.offplatform@factset.com](genai.offplatform@factset.com). </td><td>  * RateLimit-Limit - Request limit per second. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * Retry-After - How long (in seconds) to wait before attempting to send a new request. <br>  * X-RateLimit-Limit-minute - Request limit per minute. <br>  * X-RateLimit-Remaining-minute - Number of available requests in the current minute. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QueryResponse> getChatResultWithHttpInfo(ChatPollingRequest chatPollingRequest) throws ApiException {
    Object localVarPostBody = chatPollingRequest;
    
    // verify the required parameter 'chatPollingRequest' is set
    if (chatPollingRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'chatPollingRequest' when calling getChatResult");
    }
    
    // create path and map variables
    String localVarPath = "/result";

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
        
        QueryResponse
      
    > apiResponse = apiClient.invokeAPI("MultipleQuestionChatApi.getChatResult", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getChatResultResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve the status of a chat response process.
   * Returns the status of a chat response for a given chat job ID (recevied from the &#x60;/query&#x60; endpoint). Poll the &#x60;/status&#x60; endpoint with your job ID to confirm when your data is ready. Answers may take minutes to generate, depending on the complexity of the query. 
   * @param chatPollingRequest ID representing the chat process for your query (required)
   * @return StatusPollResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  * Location - Relative URL to the query response. <br>  * Api-Supported-Versions - Comma-separated list of supported major versions. <br>  * Api-Version - Full semantic version of the API. <br>  * RateLimit-Limit - Request limit per second. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * X-RateLimit-Limit-minute - Request limit per minute. <br>  * X-RateLimit-Remaining-minute - Number of available requests in the current minute. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * Location - Relative URL to check the status of the request. <br>  * Api-Supported-Versions - Comma-separated list of supported major versions. <br>  * Api-Version - Full semantic version of the API. <br>  * RateLimit-Limit - Request limit per second. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * X-RateLimit-Limit-minute - Request limit per minute. <br>  * X-RateLimit-Remaining-minute - Number of available requests in the current minute. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - You are not properly authenticated for use of this API. Please make sure you are logged in to the developer portal or using a valid API key (managed [via this dev](https://developer.factset.com/manage-api-keys)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have the entitlements enabled for this service. Please reach out to your FactSet Support Team representative to receive the proper entitlements. </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed - The requested endpoint does not support the used HTTP method. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - The /status endpoint is currently rate-limited to 10 requests per second for an individual organization. If you are receiving an unexpected amount of these errors, please contact the API team at [genai.offplatform@factset.com](genai.offplatform@factset.com). </td><td>  * RateLimit-Limit - Request limit per second. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * Retry-After - How long (in seconds) to wait before attempting to send a new request. <br>  * X-RateLimit-Limit-minute - Request limit per minute. <br>  * X-RateLimit-Remaining-minute - Number of available requests in the current minute. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public StatusPollResponse getChatStatus(ChatPollingRequest chatPollingRequest) throws ApiException {
    return getChatStatusWithHttpInfo(chatPollingRequest).getData();
  }

  /**
   * Retrieve the status of a chat response process.
   * Returns the status of a chat response for a given chat job ID (recevied from the &#x60;/query&#x60; endpoint). Poll the &#x60;/status&#x60; endpoint with your job ID to confirm when your data is ready. Answers may take minutes to generate, depending on the complexity of the query. 
   * @param chatPollingRequest ID representing the chat process for your query (required)
   * @return ApiResponse&lt;StatusPollResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  * Location - Relative URL to the query response. <br>  * Api-Supported-Versions - Comma-separated list of supported major versions. <br>  * Api-Version - Full semantic version of the API. <br>  * RateLimit-Limit - Request limit per second. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * X-RateLimit-Limit-minute - Request limit per minute. <br>  * X-RateLimit-Remaining-minute - Number of available requests in the current minute. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * Location - Relative URL to check the status of the request. <br>  * Api-Supported-Versions - Comma-separated list of supported major versions. <br>  * Api-Version - Full semantic version of the API. <br>  * RateLimit-Limit - Request limit per second. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * X-RateLimit-Limit-minute - Request limit per minute. <br>  * X-RateLimit-Remaining-minute - Number of available requests in the current minute. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - You are not properly authenticated for use of this API. Please make sure you are logged in to the developer portal or using a valid API key (managed [via this dev](https://developer.factset.com/manage-api-keys)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have the entitlements enabled for this service. Please reach out to your FactSet Support Team representative to receive the proper entitlements. </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed - The requested endpoint does not support the used HTTP method. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - The /status endpoint is currently rate-limited to 10 requests per second for an individual organization. If you are receiving an unexpected amount of these errors, please contact the API team at [genai.offplatform@factset.com](genai.offplatform@factset.com). </td><td>  * RateLimit-Limit - Request limit per second. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * Retry-After - How long (in seconds) to wait before attempting to send a new request. <br>  * X-RateLimit-Limit-minute - Request limit per minute. <br>  * X-RateLimit-Remaining-minute - Number of available requests in the current minute. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<StatusPollResponse> getChatStatusWithHttpInfo(ChatPollingRequest chatPollingRequest) throws ApiException {
    Object localVarPostBody = chatPollingRequest;
    
    // verify the required parameter 'chatPollingRequest' is set
    if (chatPollingRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'chatPollingRequest' when calling getChatStatus");
    }
    
    // create path and map variables
    String localVarPath = "/status";

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
        
        StatusPollResponse
      
    > apiResponse = apiClient.invokeAPI("MultipleQuestionChatApi.getChatStatus", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getChatStatusResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Create a query request for a given natural language query.
   * Returns a job ID for polling the response to a natural language query for financial data as well as a chat ID to continue asking questions in the same conversational context. This endpoint is an interface for initiating responses from FactSet Mercury, our large language model for surfacing FactSet datasets through conversational natural language queries. Use the &#x60;/query&#x60; endpoint to generate responses for questions in or out of a conversational message chain context. Responses contain a job ID, used to request the status and result of the current question, and a chat ID, used to ask further questions in the same conversation message chain. Requests to &#x60;/query&#x60; without a chat ID will initialize a conversation, while requests with a chat ID will continue the conversation in the context of all previous sent and received messages in that conversation. 
   * @param queryChatRequest Natural language query for FactSet data (required)
   * @return QueryChatResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * Location - Relative URL to check the status of the request. <br>  * Api-Supported-Versions - Comma-separated list of supported major versions. <br>  * Api-Version - Full semantic version of the API. <br>  * RateLimit-Limit - Request limit per second. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  * X-RateLimit-Limit-Hour - Request limit per hour. <br>  * X-RateLimit-Remaining-Hour - Number of available requests in the hour. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - You are not properly authenticated for use of this API. Please make sure you are logged in to the developer portal or using a valid API key (managed [via this developer portal page](https://developer.factset.com/manage-api-keys)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have the entitlements enabled for this service. Please reach out to your FactSet Support Team representative to receive the proper entitlements. </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed - The requested endpoint does not support the used HTTP method. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - The /query endpoint is currently rate-limited to 50 requests per minute and 1000 requests per hour for an individual organization. If you are receiving an unexpected amount of these errors, please contact the API team at [genai.offplatform@factset.com](genai.offplatform@factset.com). </td><td>  * RateLimit-Limit - Request limit per second. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * Retry-After - How long (in seconds) to wait before attempting to send a new request. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  * X-RateLimit-Limit-Hour - Request limit per hour. <br>  * X-RateLimit-Remaining-Hour - Number of available requests in the hour. <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public QueryChatResponse queryChat(QueryChatRequest queryChatRequest) throws ApiException {
    return queryChatWithHttpInfo(queryChatRequest).getData();
  }

  /**
   * Create a query request for a given natural language query.
   * Returns a job ID for polling the response to a natural language query for financial data as well as a chat ID to continue asking questions in the same conversational context. This endpoint is an interface for initiating responses from FactSet Mercury, our large language model for surfacing FactSet datasets through conversational natural language queries. Use the &#x60;/query&#x60; endpoint to generate responses for questions in or out of a conversational message chain context. Responses contain a job ID, used to request the status and result of the current question, and a chat ID, used to ask further questions in the same conversation message chain. Requests to &#x60;/query&#x60; without a chat ID will initialize a conversation, while requests with a chat ID will continue the conversation in the context of all previous sent and received messages in that conversation. 
   * @param queryChatRequest Natural language query for FactSet data (required)
   * @return ApiResponse&lt;QueryChatResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * Location - Relative URL to check the status of the request. <br>  * Api-Supported-Versions - Comma-separated list of supported major versions. <br>  * Api-Version - Full semantic version of the API. <br>  * RateLimit-Limit - Request limit per second. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  * X-RateLimit-Limit-Hour - Request limit per hour. <br>  * X-RateLimit-Remaining-Hour - Number of available requests in the hour. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - You are not properly authenticated for use of this API. Please make sure you are logged in to the developer portal or using a valid API key (managed [via this developer portal page](https://developer.factset.com/manage-api-keys)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have the entitlements enabled for this service. Please reach out to your FactSet Support Team representative to receive the proper entitlements. </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed - The requested endpoint does not support the used HTTP method. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - The /query endpoint is currently rate-limited to 50 requests per minute and 1000 requests per hour for an individual organization. If you are receiving an unexpected amount of these errors, please contact the API team at [genai.offplatform@factset.com](genai.offplatform@factset.com). </td><td>  * RateLimit-Limit - Request limit per second. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * Retry-After - How long (in seconds) to wait before attempting to send a new request. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  * X-RateLimit-Limit-Hour - Request limit per hour. <br>  * X-RateLimit-Remaining-Hour - Number of available requests in the hour. <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QueryChatResponse> queryChatWithHttpInfo(QueryChatRequest queryChatRequest) throws ApiException {
    Object localVarPostBody = queryChatRequest;
    
    // verify the required parameter 'queryChatRequest' is set
    if (queryChatRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'queryChatRequest' when calling queryChat");
    }
    
    // create path and map variables
    String localVarPath = "/query";

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
        
        QueryChatResponse
      
    > apiResponse = apiClient.invokeAPI("MultipleQuestionChatApi.queryChat", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, queryChatResponseTypeMap, false);

    return apiResponse;

  }
}
