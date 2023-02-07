package com.factset.sdk.NaturalLanguageProcessing.api;

import com.factset.sdk.NaturalLanguageProcessing.ApiException;
import com.factset.sdk.NaturalLanguageProcessing.ApiClient;
import com.factset.sdk.NaturalLanguageProcessing.ApiResponse;
import com.factset.sdk.NaturalLanguageProcessing.Configuration;
import com.factset.sdk.NaturalLanguageProcessing.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.NaturalLanguageProcessing.models.QnAAnswerParametersRoot;
import com.factset.sdk.NaturalLanguageProcessing.models.QnAAnswerRoot;
import com.factset.sdk.NaturalLanguageProcessing.models.QnAHTTPErrorRoot;
import com.factset.sdk.NaturalLanguageProcessing.models.QnATaskRoot;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QuestionAnswerApi {
  private ApiClient apiClient;

  public QuestionAnswerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public QuestionAnswerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> qnaGetAnswersResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    qnaGetAnswersResponseTypeMap.put(200, new GenericType<QnAAnswerRoot>(){});
    qnaGetAnswersResponseTypeMap.put(202, new GenericType<QnATaskRoot>(){});
    qnaGetAnswersResponseTypeMap.put(401, new GenericType<QnAHTTPErrorRoot>(){});
    qnaGetAnswersResponseTypeMap.put(404, new GenericType<QnAHTTPErrorRoot>(){});
    qnaGetAnswersResponseTypeMap.put(500, new GenericType<QnAHTTPErrorRoot>(){});
  }
  private static final Map<Integer, GenericType> qnaGetStatusResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    qnaGetStatusResponseTypeMap.put(201, new GenericType<QnATaskRoot>(){});
    qnaGetStatusResponseTypeMap.put(202, new GenericType<QnATaskRoot>(){});
    qnaGetStatusResponseTypeMap.put(401, new GenericType<QnAHTTPErrorRoot>(){});
    qnaGetStatusResponseTypeMap.put(404, new GenericType<QnAHTTPErrorRoot>(){});
    qnaGetStatusResponseTypeMap.put(500, new GenericType<QnAHTTPErrorRoot>(){});
  }
  private static final Map<Integer, GenericType> qnaPostQuestionResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    qnaPostQuestionResponseTypeMap.put(202, new GenericType<QnATaskRoot>(){});
    qnaPostQuestionResponseTypeMap.put(400, new GenericType<QnAHTTPErrorRoot>(){});
    qnaPostQuestionResponseTypeMap.put(401, new GenericType<QnAHTTPErrorRoot>(){});
    qnaPostQuestionResponseTypeMap.put(500, new GenericType<QnAHTTPErrorRoot>(){});
  }

   
 /**
   * Wrapper to support GET /qna/answers/{id} returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code QnAAnswerRoot }<br>OK</li>
   * 
   *   <li>202 : {@code QnATaskRoot }<br>Accepted</li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * QnaGetAnswersResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     QnAAnswerRoot data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     QnATaskRoot data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class QnaGetAnswersResponseWrapper {
    public final int statusCode;
    public final Object response;

    public QnaGetAnswersResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public QnAAnswerRoot getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (QnAAnswerRoot) this.response;
    }
    
    public QnATaskRoot getResponse202() throws ApiException {
      if (this.statusCode != 202) {
        throw new ApiException(500, "Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
      }
      return (QnATaskRoot) this.response;
    }
    

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      QnaGetAnswersResponseWrapper other = (QnaGetAnswersResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class QnaGetAnswersResponseWrapper {\n"
       + "    statusCode: " + statusCode + "\n"
       + "    response: "
       + Objects.toString(response).replace("\n", "\n    ")
       + "\n}";
    }
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
   * Get the answer(s)
   * Obtain the results from the original task request. The &#x60;id&#x60; parameter represents the identifier from the task and comes from the POST request which created the task. Once the task is complete, the result can be fetched with this endpoint.
   * @param id Identifier from the Question &amp; Answer task and comes from the POST request which created the task (required)
   * @return QnaGetAnswersResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  </td></tr>
       <tr><td> 401 </td><td> The server could not verify that you are authorized to access the URL requested. You either supplied the wrong credentials (e.g. a bad password), or your browser doesn&#39;t understand how to supply the credentials required. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested URL was not found on the server. If you entered the URL manually please check your spelling and try again. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. </td><td>  -  </td></tr>
     </table>
   */
  public QnaGetAnswersResponseWrapper qnaGetAnswers(String id) throws ApiException {
    return qnaGetAnswersWithHttpInfo(id).getData();
  }

  /**
   * Get the answer(s)
   * Obtain the results from the original task request. The &#x60;id&#x60; parameter represents the identifier from the task and comes from the POST request which created the task. Once the task is complete, the result can be fetched with this endpoint.
   * @param id Identifier from the Question &amp; Answer task and comes from the POST request which created the task (required)
   * @return ApiResponse&lt;QnaGetAnswersResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  </td></tr>
       <tr><td> 401 </td><td> The server could not verify that you are authorized to access the URL requested. You either supplied the wrong credentials (e.g. a bad password), or your browser doesn&#39;t understand how to supply the credentials required. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested URL was not found on the server. If you entered the URL manually please check your spelling and try again. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QnaGetAnswersResponseWrapper> qnaGetAnswersWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling qnaGetAnswers");
    }
    
    // create path and map variables
    String localVarPath = "/qna/answers/{id}"
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
        Object
        
      
    > apiResponse = apiClient.invokeAPI("QuestionAnswerApi.qnaGetAnswers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, qnaGetAnswersResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    QnaGetAnswersResponseWrapper responseWrapper = new QnaGetAnswersResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<QnaGetAnswersResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
  /**
   * Get the completion status
   * Endpoint to obtain the status of the task request. The &#x60;id&#x60; parameter represents the identifier of the task created and comes from the POST request which created the task.
   * @param id Identifier from the Question &amp; Answer task and comes from the POST request which created the task (required)
   * @return QnATaskRoot
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  </td></tr>
       <tr><td> 401 </td><td> The server could not verify that you are authorized to access the URL requested. You either supplied the wrong credentials (e.g. a bad password), or your browser doesn&#39;t understand how to supply the credentials required. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested URL was not found on the server. If you entered the URL manually please check your spelling and try again. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. </td><td>  -  </td></tr>
     </table>
   */
  public QnATaskRoot qnaGetStatus(String id) throws ApiException {
    return qnaGetStatusWithHttpInfo(id).getData();
  }

  /**
   * Get the completion status
   * Endpoint to obtain the status of the task request. The &#x60;id&#x60; parameter represents the identifier of the task created and comes from the POST request which created the task.
   * @param id Identifier from the Question &amp; Answer task and comes from the POST request which created the task (required)
   * @return ApiResponse&lt;QnATaskRoot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  </td></tr>
       <tr><td> 401 </td><td> The server could not verify that you are authorized to access the URL requested. You either supplied the wrong credentials (e.g. a bad password), or your browser doesn&#39;t understand how to supply the credentials required. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested URL was not found on the server. If you entered the URL manually please check your spelling and try again. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QnATaskRoot> qnaGetStatusWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling qnaGetStatus");
    }
    
    // create path and map variables
    String localVarPath = "/qna/answers/{id}/status"
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
        
        QnATaskRoot
      
    > apiResponse = apiClient.invokeAPI("QuestionAnswerApi.qnaGetStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, qnaGetStatusResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Post a question for answer(s)
   * Create a task submission by providing plain text and question(s). The underlying model will answer the question. The created task needs to be polled to obtain the results. Please check the schema(s) for each of the status codes for more details about the task.
   * @param qnAAnswerParametersRoot  (required)
   * @return QnATaskRoot
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  </td></tr>
       <tr><td> 400 </td><td> The browser (or proxy) sent a request that this server could not understand. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> The server could not verify that you are authorized to access the URL requested. You either supplied the wrong credentials (e.g. a bad password), or your browser doesn&#39;t understand how to supply the credentials required. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. </td><td>  -  </td></tr>
     </table>
   */
  public QnATaskRoot qnaPostQuestion(QnAAnswerParametersRoot qnAAnswerParametersRoot) throws ApiException {
    return qnaPostQuestionWithHttpInfo(qnAAnswerParametersRoot).getData();
  }

  /**
   * Post a question for answer(s)
   * Create a task submission by providing plain text and question(s). The underlying model will answer the question. The created task needs to be polled to obtain the results. Please check the schema(s) for each of the status codes for more details about the task.
   * @param qnAAnswerParametersRoot  (required)
   * @return ApiResponse&lt;QnATaskRoot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  </td></tr>
       <tr><td> 400 </td><td> The browser (or proxy) sent a request that this server could not understand. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> The server could not verify that you are authorized to access the URL requested. You either supplied the wrong credentials (e.g. a bad password), or your browser doesn&#39;t understand how to supply the credentials required. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QnATaskRoot> qnaPostQuestionWithHttpInfo(QnAAnswerParametersRoot qnAAnswerParametersRoot) throws ApiException {
    Object localVarPostBody = qnAAnswerParametersRoot;
    
    // verify the required parameter 'qnAAnswerParametersRoot' is set
    if (qnAAnswerParametersRoot == null) {
      throw new ApiException(400, "Missing the required parameter 'qnAAnswerParametersRoot' when calling qnaPostQuestion");
    }
    
    // create path and map variables
    String localVarPath = "/qna/answers";

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
        
        QnATaskRoot
      
    > apiResponse = apiClient.invokeAPI("QuestionAnswerApi.qnaPostQuestion", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, qnaPostQuestionResponseTypeMap, false);

    return apiResponse;

  }
}
