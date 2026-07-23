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

import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.ChatCompletionChunk;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.ChatCompletionRequest;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.ErrorResponse;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.ModelList;

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
    chatCompletionResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    chatCompletionResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    chatCompletionResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> listModelsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    listModelsResponseTypeMap.put(200, new GenericType<ModelList>(){});
    listModelsResponseTypeMap.put(429, new GenericType<ErrorResponse>(){});
    listModelsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Stream a chat completion (OpenAI-compatible)
   * Accepts an OpenAI-style Chat Completions request and streams &#x60;chat.completion.chunk&#x60; frames via Server-Sent Events.  The &#x60;messages&#x60; array is searched in reverse for the last entry with &#x60;role: user&#x60;; everything else is discarded before the request is forwarded to the agent. 
   * @param consumer Identify the requestor (required)
   * @param chatCompletionRequest  (required)
   * @return ChatCompletionChunk
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A stream of OpenAI &#x60;chat.completion.chunk&#x60; frames delivered via Server-Sent Events. The stream terminates with &#x60;data: [DONE]&#x60;.  </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid request body or missing user message. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ChatCompletionChunk chatCompletion(String consumer, ChatCompletionRequest chatCompletionRequest) throws ApiException {
    return chatCompletionWithHttpInfo(consumer, chatCompletionRequest).getData();
  }

  /**
   * Stream a chat completion (OpenAI-compatible)
   * Accepts an OpenAI-style Chat Completions request and streams &#x60;chat.completion.chunk&#x60; frames via Server-Sent Events.  The &#x60;messages&#x60; array is searched in reverse for the last entry with &#x60;role: user&#x60;; everything else is discarded before the request is forwarded to the agent. 
   * @param consumer Identify the requestor (required)
   * @param chatCompletionRequest  (required)
   * @return ApiResponse&lt;ChatCompletionChunk&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A stream of OpenAI &#x60;chat.completion.chunk&#x60; frames delivered via Server-Sent Events. The stream terminates with &#x60;data: [DONE]&#x60;.  </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid request body or missing user message. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ChatCompletionChunk> chatCompletionWithHttpInfo(String consumer, ChatCompletionRequest chatCompletionRequest) throws ApiException {
    Object localVarPostBody = chatCompletionRequest;
    
    // verify the required parameter 'consumer' is set
    if (consumer == null) {
      throw new ApiException(400, "Missing the required parameter 'consumer' when calling chatCompletion");
    }
    
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
      "text/event-stream", "application/json"
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
   * List available models (OpenAI-compatible)
   * Returns the static list of models accepted by &#x60;/chat/completions&#x60;. Mirrors the OpenAI &#x60;GET /v1/models&#x60; shape so OpenAI-compatible clients can discover the model ID. 
   * @param consumer Identify the requestor (required)
   * @return ModelList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Model list. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ModelList listModels(String consumer) throws ApiException {
    return listModelsWithHttpInfo(consumer).getData();
  }

  /**
   * List available models (OpenAI-compatible)
   * Returns the static list of models accepted by &#x60;/chat/completions&#x60;. Mirrors the OpenAI &#x60;GET /v1/models&#x60; shape so OpenAI-compatible clients can discover the model ID. 
   * @param consumer Identify the requestor (required)
   * @return ApiResponse&lt;ModelList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Model list. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ModelList> listModelsWithHttpInfo(String consumer) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'consumer' is set
    if (consumer == null) {
      throw new ApiException(400, "Missing the required parameter 'consumer' when calling listModels");
    }
    
    // create path and map variables
    String localVarPath = "/models";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "consumer", consumer));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
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
