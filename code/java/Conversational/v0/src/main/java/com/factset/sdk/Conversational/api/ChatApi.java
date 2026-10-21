package com.factset.sdk.Conversational.api;

import com.factset.sdk.Conversational.ApiException;
import com.factset.sdk.Conversational.ApiClient;
import com.factset.sdk.Conversational.ApiResponse;
import com.factset.sdk.Conversational.Configuration;
import com.factset.sdk.Conversational.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.Conversational.models.ChatCompletionChunk;
import com.factset.sdk.Conversational.models.ChatCompletionRequest;
import com.factset.sdk.Conversational.models.ModelList;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ChatApi {
  private ApiClient apiClient;

  public ChatApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ChatApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> chatCompletionResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    chatCompletionResponseTypeMap.put(200, new GenericType<ChatCompletionChunk>(){});
    chatCompletionResponseTypeMap.put(400, new GenericType<String>(){});
    chatCompletionResponseTypeMap.put(401, new GenericType<String>(){});
    chatCompletionResponseTypeMap.put(403, new GenericType<String>(){});
    chatCompletionResponseTypeMap.put(404, new GenericType<String>(){});
    chatCompletionResponseTypeMap.put(429, new GenericType<String>(){});
    chatCompletionResponseTypeMap.put(500, new GenericType<String>(){});
  }

  private static final Map<Integer, GenericType> listModelsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    listModelsResponseTypeMap.put(200, new GenericType<ModelList>(){});
    listModelsResponseTypeMap.put(401, new GenericType<String>(){});
    listModelsResponseTypeMap.put(403, new GenericType<String>(){});
    listModelsResponseTypeMap.put(429, new GenericType<String>(){});
    listModelsResponseTypeMap.put(500, new GenericType<String>(){});
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
   * Ask a question and stream back the answer (OpenAI-compatible)
   * Send a question and get the answer back as a live stream of small pieces of text, rather than one big response at the end, formatted the way OpenAI&#39;s Chat Completions API formats its output.  You send your question in the &#x60;messages&#x60; array, using the same shape OpenAI uses. The API looks for the last message where &#x60;role&#x60; is &#x60;\&quot;user\&quot;&#x60; and treats that as the question being asked right now — any earlier messages in the array, or a system prompt, are not read.  To have a back-and-forth conversation, include the &#x60;factset_configuration.conversation_id&#x60; you received from a previous call, and the assistant will pick up where that conversation left off. Leave it out to start a brand new conversation — you&#39;ll be given a fresh id in the first piece of the response, which you should hold onto and send back next time. 
   * @param chatCompletionRequest  (required)
   * @param consumer A short name identifying which application or integration is making this call, used for FactSet&#39;s own usage tracking. If omitted, usage is tracked under a generic default value rather than the request being rejected. (optional)
   * @return ChatCompletionChunk
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. The response isn&#39;t a single JSON object — it&#39;s a live stream of small messages (\&quot;chunks\&quot;), sent one at a time as the answer is generated, using the Server-Sent Events format (each chunk looks like &#x60;data: { ... }&#x60; followed by a blank line). When the answer is finished, the server sends a final &#x60;data: [DONE]&#x60; line so the client knows to stop reading.  The very first chunk includes a &#x60;conversation_id&#x60; field. Save this value — sending it back in a later request&#39;s &#x60;factset_configuration.conversation_id&#x60; lets you continue this same conversation. No other chunk repeats this field.  </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The request couldn&#39;t be understood or was missing something required. This happens when: the request body isn&#39;t in the expected shape, there&#39;s no message with &#x60;role: \&quot;user\&quot;&#x60; to answer, the &#x60;model&#x60; value is missing or isn&#39;t one of the supported models, or &#x60;factset_configuration.conversation_id&#x60; was provided but isn&#39;t a properly formatted UUID. The body is a plain-text message, not a JSON object.  </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> You&#39;re not properly authenticated. Make sure you&#39;re using a valid API key or valid OAuth 2.0 credentials. The body is a plain-text message, not a JSON object. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> You don&#39;t have the required permissions for this request — typically because your account or API key isn&#39;t entitled to this service, or because you&#39;re calling from an IP address that isn&#39;t allowed for the API key you&#39;re using. The body is a plain-text message, not a JSON object. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The &#x60;conversation_id&#x60; you sent couldn&#39;t be found — either it was never created, or it belongs to a different user/account than the one making this request. The body is a plain-text message, not a JSON object.  </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> You&#39;ve sent more requests than are currently allowed in a given period of time. Wait a moment and try again. </td><td>  * RateLimit-Limit - Request limit per minute. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * Retry-After - How long (in seconds) to wait before attempting to send a new request. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  * X-RateLimit-Limit-Minute - Request limit per minute. <br>  * X-RateLimit-Remaining-Minute - Number of available requests in the minute. <br>  </td></tr>
       <tr><td> 500 </td><td> Something went wrong on the server while handling the request. This isn&#39;t caused by anything in your request; retrying later may help. The body is a plain-text message, not a JSON object. </td><td>  -  </td></tr>
     </table>
   */
  public ChatCompletionChunk chatCompletion(ChatCompletionRequest chatCompletionRequest, String consumer) throws ApiException {
    return chatCompletionWithHttpInfo(chatCompletionRequest, consumer).getData();
  }

  /**
   * Ask a question and stream back the answer (OpenAI-compatible)
   * Send a question and get the answer back as a live stream of small pieces of text, rather than one big response at the end, formatted the way OpenAI&#39;s Chat Completions API formats its output.  You send your question in the &#x60;messages&#x60; array, using the same shape OpenAI uses. The API looks for the last message where &#x60;role&#x60; is &#x60;\&quot;user\&quot;&#x60; and treats that as the question being asked right now — any earlier messages in the array, or a system prompt, are not read.  To have a back-and-forth conversation, include the &#x60;factset_configuration.conversation_id&#x60; you received from a previous call, and the assistant will pick up where that conversation left off. Leave it out to start a brand new conversation — you&#39;ll be given a fresh id in the first piece of the response, which you should hold onto and send back next time. 
   * @param chatCompletionRequest  (required)
   * @param consumer A short name identifying which application or integration is making this call, used for FactSet&#39;s own usage tracking. If omitted, usage is tracked under a generic default value rather than the request being rejected. (optional)
   * @return ApiResponse&lt;ChatCompletionChunk&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success. The response isn&#39;t a single JSON object — it&#39;s a live stream of small messages (\&quot;chunks\&quot;), sent one at a time as the answer is generated, using the Server-Sent Events format (each chunk looks like &#x60;data: { ... }&#x60; followed by a blank line). When the answer is finished, the server sends a final &#x60;data: [DONE]&#x60; line so the client knows to stop reading.  The very first chunk includes a &#x60;conversation_id&#x60; field. Save this value — sending it back in a later request&#39;s &#x60;factset_configuration.conversation_id&#x60; lets you continue this same conversation. No other chunk repeats this field.  </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The request couldn&#39;t be understood or was missing something required. This happens when: the request body isn&#39;t in the expected shape, there&#39;s no message with &#x60;role: \&quot;user\&quot;&#x60; to answer, the &#x60;model&#x60; value is missing or isn&#39;t one of the supported models, or &#x60;factset_configuration.conversation_id&#x60; was provided but isn&#39;t a properly formatted UUID. The body is a plain-text message, not a JSON object.  </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> You&#39;re not properly authenticated. Make sure you&#39;re using a valid API key or valid OAuth 2.0 credentials. The body is a plain-text message, not a JSON object. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> You don&#39;t have the required permissions for this request — typically because your account or API key isn&#39;t entitled to this service, or because you&#39;re calling from an IP address that isn&#39;t allowed for the API key you&#39;re using. The body is a plain-text message, not a JSON object. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The &#x60;conversation_id&#x60; you sent couldn&#39;t be found — either it was never created, or it belongs to a different user/account than the one making this request. The body is a plain-text message, not a JSON object.  </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> You&#39;ve sent more requests than are currently allowed in a given period of time. Wait a moment and try again. </td><td>  * RateLimit-Limit - Request limit per minute. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * Retry-After - How long (in seconds) to wait before attempting to send a new request. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  * X-RateLimit-Limit-Minute - Request limit per minute. <br>  * X-RateLimit-Remaining-Minute - Number of available requests in the minute. <br>  </td></tr>
       <tr><td> 500 </td><td> Something went wrong on the server while handling the request. This isn&#39;t caused by anything in your request; retrying later may help. The body is a plain-text message, not a JSON object. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ChatCompletionChunk> chatCompletionWithHttpInfo(ChatCompletionRequest chatCompletionRequest, String consumer) throws ApiException {
    Object localVarPostBody = chatCompletionRequest;
    
    // verify the required parameter 'chatCompletionRequest' is set
    if (chatCompletionRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'chatCompletionRequest' when calling chatCompletion");
    }
    
    // create path and map variables
    String localVarPath = "/chat/completions";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "consumer", consumer));

    
    
    
    final String[] localVarAccepts = {
      "text/event-stream", "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ChatCompletionChunk
      
    > apiResponse = apiClient.invokeAPI("ChatApi.chatCompletion", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, chatCompletionResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List the models you can use (OpenAI-compatible)
   * Returns the list of model names you&#39;re allowed to use with &#x60;/chat/completions&#x60;. This mirrors the shape of OpenAI&#39;s own &#x60;GET /v1/models&#x60; endpoint, so tools built for OpenAI can discover which model names are valid without any special handling.  There are currently two models, and they behave the same way except for one difference: &#x60;fds-web-answer-2.0&#x60; is allowed to search the public web for extra information when answering, while &#x60;fds-answer-2.0&#x60; only uses FactSet&#39;s own data. There&#39;s no separate switch to turn web search on or off — you choose it by picking which model to use. 
   * @return ModelList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Model list. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> You&#39;re not properly authenticated. Make sure you&#39;re using a valid API key or valid OAuth 2.0 credentials. The body is a plain-text message, not a JSON object. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> You don&#39;t have the required permissions for this request — typically because your account or API key isn&#39;t entitled to this service, or because you&#39;re calling from an IP address that isn&#39;t allowed for the API key you&#39;re using. The body is a plain-text message, not a JSON object. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> You&#39;ve sent more requests than are currently allowed in a given period of time. Wait a moment and try again. </td><td>  * RateLimit-Limit - Request limit per minute. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * Retry-After - How long (in seconds) to wait before attempting to send a new request. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  * X-RateLimit-Limit-Minute - Request limit per minute. <br>  * X-RateLimit-Remaining-Minute - Number of available requests in the minute. <br>  </td></tr>
       <tr><td> 500 </td><td> Something went wrong on the server while handling the request. This isn&#39;t caused by anything in your request; retrying later may help. The body is a plain-text message, not a JSON object. </td><td>  -  </td></tr>
     </table>
   */
  public ModelList listModels() throws ApiException {
    return listModelsWithHttpInfo().getData();
  }

  /**
   * List the models you can use (OpenAI-compatible)
   * Returns the list of model names you&#39;re allowed to use with &#x60;/chat/completions&#x60;. This mirrors the shape of OpenAI&#39;s own &#x60;GET /v1/models&#x60; endpoint, so tools built for OpenAI can discover which model names are valid without any special handling.  There are currently two models, and they behave the same way except for one difference: &#x60;fds-web-answer-2.0&#x60; is allowed to search the public web for extra information when answering, while &#x60;fds-answer-2.0&#x60; only uses FactSet&#39;s own data. There&#39;s no separate switch to turn web search on or off — you choose it by picking which model to use. 
   * @return ApiResponse&lt;ModelList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Model list. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> You&#39;re not properly authenticated. Make sure you&#39;re using a valid API key or valid OAuth 2.0 credentials. The body is a plain-text message, not a JSON object. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> You don&#39;t have the required permissions for this request — typically because your account or API key isn&#39;t entitled to this service, or because you&#39;re calling from an IP address that isn&#39;t allowed for the API key you&#39;re using. The body is a plain-text message, not a JSON object. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> You&#39;ve sent more requests than are currently allowed in a given period of time. Wait a moment and try again. </td><td>  * RateLimit-Limit - Request limit per minute. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * Retry-After - How long (in seconds) to wait before attempting to send a new request. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  * X-RateLimit-Limit-Minute - Request limit per minute. <br>  * X-RateLimit-Remaining-Minute - Number of available requests in the minute. <br>  </td></tr>
       <tr><td> 500 </td><td> Something went wrong on the server while handling the request. This isn&#39;t caused by anything in your request; retrying later may help. The body is a plain-text message, not a JSON object. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ModelList> listModelsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/models";

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
        
        ModelList
      
    > apiResponse = apiClient.invokeAPI("ChatApi.listModels", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, listModelsResponseTypeMap, false);

    return apiResponse;

  }
}
