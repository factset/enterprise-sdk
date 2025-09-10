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

import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.BadRequestError;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.BadRequestErrorWithInvalidDataSchema;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.ChatPollingRequest;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.ForbiddenError;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.InternalServerError;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.QueryChatRequest;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.QueryChatResponse;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.QueryResponse;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.ResourceNotFoundError;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.StatusPollResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ChatApi {
  private ApiClient apiClient;

  public ChatApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ChatApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getChatResultResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getChatResultResponseTypeMap.put(200, new GenericType<QueryResponse>(){});
    getChatResultResponseTypeMap.put(400, new GenericType<BadRequestErrorWithInvalidDataSchema>(){});
    getChatResultResponseTypeMap.put(401, new GenericType<String>(){});
    getChatResultResponseTypeMap.put(403, new GenericType<String>(){});
    getChatResultResponseTypeMap.put(404, new GenericType<ResourceNotFoundError>(){});
    getChatResultResponseTypeMap.put(405, new GenericType<String>(){});
    getChatResultResponseTypeMap.put(500, new GenericType<InternalServerError>(){});
  }

  private static final Map<Integer, GenericType> getChatStatusResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getChatStatusResponseTypeMap.put(201, new GenericType<StatusPollResponse>(){});
    getChatStatusResponseTypeMap.put(202, new GenericType<StatusPollResponse>(){});
    getChatStatusResponseTypeMap.put(400, new GenericType<BadRequestError>(){});
    getChatStatusResponseTypeMap.put(401, new GenericType<String>(){});
    getChatStatusResponseTypeMap.put(403, new GenericType<String>(){});
    getChatStatusResponseTypeMap.put(404, new GenericType<ResourceNotFoundError>(){});
    getChatStatusResponseTypeMap.put(405, new GenericType<String>(){});
    getChatStatusResponseTypeMap.put(500, new GenericType<InternalServerError>(){});
  }

  private static final Map<Integer, GenericType> sendQueryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    sendQueryResponseTypeMap.put(202, new GenericType<QueryChatResponse>(){});
    sendQueryResponseTypeMap.put(400, new GenericType<BadRequestErrorWithInvalidDataSchema>(){});
    sendQueryResponseTypeMap.put(401, new GenericType<String>(){});
    sendQueryResponseTypeMap.put(403, new GenericType<String>(){});
    sendQueryResponseTypeMap.put(404, new GenericType<ResourceNotFoundError>(){});
    sendQueryResponseTypeMap.put(405, new GenericType<String>(){});
    sendQueryResponseTypeMap.put(500, new GenericType<InternalServerError>(){});
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
   * Retrieve the completed response for your query
   * Use this endpoint to retrieve the results of your query to FactSet Mercury. This endpoint is the final step in the query polling process. Once the status for your jobId is &#x60;created&#x60;, you can retrieve the query response using this &#x60;/result&#x60; endpoint.  The response will contain the natural language answer to your query, supporting data and content that FactSet Mercury has surfaced, and suggestions for further engagement with FactSet Mercury.   Data and content will be returned using various defined and standard formats, such as markdown and Microsoft Adaptive Cards. Please see the examples and data schemas associated with the &#x60;/result&#x60; endpoint for details.  **Please note:** The ID contained in the response represents the ID for the response itself, it does not match the chatId or jobId. Please use this response ID at the &#x60;/feedback&#x60; endpoint to provide feedback on the response. 
   * @param chatPollingRequest Polling request body, containing the job ID for your response generation process (required)
   * @return QueryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * Api-Deprected-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request - The request was invalid or could not be processed. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed [via this developer portal page](https://developer.factset.com/manage-api-keys)) or valid OAuth 2.0 credentials (see [OAuth 2.0 documentation on the developer portal](https://developer.factset.com/learn/authentication-oauth2)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have the proper permissions for this request.   Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to.  This may also be due to your IP address being unsupported by the API key you are currently using. Please ensure your IP address is whitelisted for the API key you are using. IP addresses can be managed per API key via [this developer portal page](https://developer.factset.com/manage-api-keys).  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource Not Found - Could not find the requested resource. Please make sure you are using a valid endpoint and resource ID for the request. </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed - The requested endpoint does not support the used HTTP method. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - This endpoint is currently rate-limited to 10 requests per second and 300 requests per minute for an individual user serial. If you are receiving an unexpected amount of these errors, please contact the API team by selecting &#x60;Report Issue&#x60; at the top of this page. </td><td>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public QueryResponse getChatResult(ChatPollingRequest chatPollingRequest) throws ApiException {
    return getChatResultWithHttpInfo(chatPollingRequest).getData();
  }

  /**
   * Retrieve the completed response for your query
   * Use this endpoint to retrieve the results of your query to FactSet Mercury. This endpoint is the final step in the query polling process. Once the status for your jobId is &#x60;created&#x60;, you can retrieve the query response using this &#x60;/result&#x60; endpoint.  The response will contain the natural language answer to your query, supporting data and content that FactSet Mercury has surfaced, and suggestions for further engagement with FactSet Mercury.   Data and content will be returned using various defined and standard formats, such as markdown and Microsoft Adaptive Cards. Please see the examples and data schemas associated with the &#x60;/result&#x60; endpoint for details.  **Please note:** The ID contained in the response represents the ID for the response itself, it does not match the chatId or jobId. Please use this response ID at the &#x60;/feedback&#x60; endpoint to provide feedback on the response. 
   * @param chatPollingRequest Polling request body, containing the job ID for your response generation process (required)
   * @return ApiResponse&lt;QueryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * Api-Deprected-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request - The request was invalid or could not be processed. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed [via this developer portal page](https://developer.factset.com/manage-api-keys)) or valid OAuth 2.0 credentials (see [OAuth 2.0 documentation on the developer portal](https://developer.factset.com/learn/authentication-oauth2)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have the proper permissions for this request.   Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to.  This may also be due to your IP address being unsupported by the API key you are currently using. Please ensure your IP address is whitelisted for the API key you are using. IP addresses can be managed per API key via [this developer portal page](https://developer.factset.com/manage-api-keys).  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource Not Found - Could not find the requested resource. Please make sure you are using a valid endpoint and resource ID for the request. </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed - The requested endpoint does not support the used HTTP method. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - This endpoint is currently rate-limited to 10 requests per second and 300 requests per minute for an individual user serial. If you are receiving an unexpected amount of these errors, please contact the API team by selecting &#x60;Report Issue&#x60; at the top of this page. </td><td>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  </td></tr>
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
      
    > apiResponse = apiClient.invokeAPI("ChatApi.getChatResult", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getChatResultResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve the status of a chat response generation process
   * Use this endpoint to retrieve the status of a chat response for a given chat job ID (received from the &#x60;/query&#x60; endpoint). Poll the &#x60;/status&#x60; endpoint with your job ID to confirm when your data is ready.  Answers may take minutes to generate, depending on the complexity of the query.  Returns a 202 status code if the response is still processing, and a 201 status code if the response is ready. 
   * @param chatPollingRequest Polling request body, containing the job ID for your response generation process (required)
   * @return StatusPollResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  * Location -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * Api-Deprected-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * Location -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * Api-Deprected-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed [via this developer portal page](https://developer.factset.com/manage-api-keys)) or valid OAuth 2.0 credentials (see [OAuth 2.0 documentation on the developer portal](https://developer.factset.com/learn/authentication-oauth2)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have the proper permissions for this request.   Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to.  This may also be due to your IP address being unsupported by the API key you are currently using. Please ensure your IP address is whitelisted for the API key you are using. IP addresses can be managed per API key via [this developer portal page](https://developer.factset.com/manage-api-keys).  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource Not Found - Could not find the requested resource. Please make sure you are using a valid endpoint and resource ID for the request. </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed - The requested endpoint does not support the used HTTP method. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - This endpoint is currently rate-limited to 10 requests per second and 300 requests per minute for an individual user serial. If you are receiving an unexpected amount of these errors, please contact the API team by selecting &#x60;Report Issue&#x60; at the top of this page. </td><td>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public StatusPollResponse getChatStatus(ChatPollingRequest chatPollingRequest) throws ApiException {
    return getChatStatusWithHttpInfo(chatPollingRequest).getData();
  }

  /**
   * Retrieve the status of a chat response generation process
   * Use this endpoint to retrieve the status of a chat response for a given chat job ID (received from the &#x60;/query&#x60; endpoint). Poll the &#x60;/status&#x60; endpoint with your job ID to confirm when your data is ready.  Answers may take minutes to generate, depending on the complexity of the query.  Returns a 202 status code if the response is still processing, and a 201 status code if the response is ready. 
   * @param chatPollingRequest Polling request body, containing the job ID for your response generation process (required)
   * @return ApiResponse&lt;StatusPollResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  * Location -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * Api-Deprected-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * Location -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * Api-Deprected-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed [via this developer portal page](https://developer.factset.com/manage-api-keys)) or valid OAuth 2.0 credentials (see [OAuth 2.0 documentation on the developer portal](https://developer.factset.com/learn/authentication-oauth2)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have the proper permissions for this request.   Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to.  This may also be due to your IP address being unsupported by the API key you are currently using. Please ensure your IP address is whitelisted for the API key you are using. IP addresses can be managed per API key via [this developer portal page](https://developer.factset.com/manage-api-keys).  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource Not Found - Could not find the requested resource. Please make sure you are using a valid endpoint and resource ID for the request. </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed - The requested endpoint does not support the used HTTP method. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - This endpoint is currently rate-limited to 10 requests per second and 300 requests per minute for an individual user serial. If you are receiving an unexpected amount of these errors, please contact the API team by selecting &#x60;Report Issue&#x60; at the top of this page. </td><td>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  </td></tr>
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
      
    > apiResponse = apiClient.invokeAPI("ChatApi.getChatStatus", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getChatStatusResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Send a natural language query to FactSet Mercury
   * Use this endpoint to send a natural language query to FactSet Mercury, our large language model for surfacing FactSet datasets through conversational natural language queries. A request to &#x60;/query&#x60; will initiate the response generation process for the given query. Queries can be sent as standalone questions or as part of a conversational message chain, using a chat ID to maintain context.  Responses from &#x60;/query&#x60; contain the following: * **jobId**: used in subsequent endpoints to poll the status of response generation and retrieve the response from FactSet Mercury. * **chatId**: optionally used to ask further questions in the same conversational message chain.  Please see the [Conversational API Online Assistant page](https://my.apps.factset.com/oa/pages/23209) for details around available content and types of questions the Conversational API can answer. 
   * @param queryChatRequest Request body to the &#x60;/query&#x60; endpoint, containing the natural language query to be sent to FactSet Mercury and an optional chat ID for continuing an ongoing conversation. (required)
   * @return QueryChatResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * Location -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * Api-Deprected-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * X-RateLimit-Limit-Hour -  <br>  * X-RateLimit-Remaining-Hour -  <br>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request - The request was invalid or could not be processed. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed [via this developer portal page](https://developer.factset.com/manage-api-keys)) or valid OAuth 2.0 credentials (see [OAuth 2.0 documentation on the developer portal](https://developer.factset.com/learn/authentication-oauth2)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have the proper permissions for this request.   Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to.  This may also be due to your IP address being unsupported by the API key you are currently using. Please ensure your IP address is whitelisted for the API key you are using. IP addresses can be managed per API key via [this developer portal page](https://developer.factset.com/manage-api-keys).  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource Not Found - Could not find the requested resource. Please make sure you are using a valid endpoint and resource ID for the request. </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed - The requested endpoint does not support the used HTTP method. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - The /query endpoint is currently rate-limited to 10 requests per minute and 200 requests per hour for an individual user serial. If you are receiving an unexpected amount of these errors, please contact the API team by selecting &#x60;Report Issue&#x60; at the top of this page. </td><td>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-Hour -  <br>  * X-RateLimit-Remaining-Hour -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public QueryChatResponse sendQuery(QueryChatRequest queryChatRequest) throws ApiException {
    return sendQueryWithHttpInfo(queryChatRequest).getData();
  }

  /**
   * Send a natural language query to FactSet Mercury
   * Use this endpoint to send a natural language query to FactSet Mercury, our large language model for surfacing FactSet datasets through conversational natural language queries. A request to &#x60;/query&#x60; will initiate the response generation process for the given query. Queries can be sent as standalone questions or as part of a conversational message chain, using a chat ID to maintain context.  Responses from &#x60;/query&#x60; contain the following: * **jobId**: used in subsequent endpoints to poll the status of response generation and retrieve the response from FactSet Mercury. * **chatId**: optionally used to ask further questions in the same conversational message chain.  Please see the [Conversational API Online Assistant page](https://my.apps.factset.com/oa/pages/23209) for details around available content and types of questions the Conversational API can answer. 
   * @param queryChatRequest Request body to the &#x60;/query&#x60; endpoint, containing the natural language query to be sent to FactSet Mercury and an optional chat ID for continuing an ongoing conversation. (required)
   * @return ApiResponse&lt;QueryChatResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * Location -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * Api-Deprected-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * X-RateLimit-Limit-Hour -  <br>  * X-RateLimit-Remaining-Hour -  <br>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request - The request was invalid or could not be processed. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed [via this developer portal page](https://developer.factset.com/manage-api-keys)) or valid OAuth 2.0 credentials (see [OAuth 2.0 documentation on the developer portal](https://developer.factset.com/learn/authentication-oauth2)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have the proper permissions for this request.   Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to.  This may also be due to your IP address being unsupported by the API key you are currently using. Please ensure your IP address is whitelisted for the API key you are using. IP addresses can be managed per API key via [this developer portal page](https://developer.factset.com/manage-api-keys).  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource Not Found - Could not find the requested resource. Please make sure you are using a valid endpoint and resource ID for the request. </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed - The requested endpoint does not support the used HTTP method. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - The /query endpoint is currently rate-limited to 10 requests per minute and 200 requests per hour for an individual user serial. If you are receiving an unexpected amount of these errors, please contact the API team by selecting &#x60;Report Issue&#x60; at the top of this page. </td><td>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-Hour -  <br>  * X-RateLimit-Remaining-Hour -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QueryChatResponse> sendQueryWithHttpInfo(QueryChatRequest queryChatRequest) throws ApiException {
    Object localVarPostBody = queryChatRequest;
    
    // verify the required parameter 'queryChatRequest' is set
    if (queryChatRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'queryChatRequest' when calling sendQuery");
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
      
    > apiResponse = apiClient.invokeAPI("ChatApi.sendQuery", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, sendQueryResponseTypeMap, false);

    return apiResponse;

  }
}
