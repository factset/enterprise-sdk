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

import com.factset.sdk.NaturalLanguageProcessing.models.HTTPError;
import com.factset.sdk.NaturalLanguageProcessing.models.SummarizationRequest;
import com.factset.sdk.NaturalLanguageProcessing.models.SummarizationResult;
import com.factset.sdk.NaturalLanguageProcessing.models.SummarizationResultID;
import com.factset.sdk.NaturalLanguageProcessing.models.ValidationError;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AiTextSummarizationApi {
  private ApiClient apiClient;

  public AiTextSummarizationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AiTextSummarizationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> cognitiveNlpV1SummarizationHeadlineAndSummaryPostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    cognitiveNlpV1SummarizationHeadlineAndSummaryPostResponseTypeMap.put(201, new GenericType<SummarizationResultID>(){});
    cognitiveNlpV1SummarizationHeadlineAndSummaryPostResponseTypeMap.put(400, new GenericType<ValidationError>(){});
    cognitiveNlpV1SummarizationHeadlineAndSummaryPostResponseTypeMap.put(401, new GenericType<HTTPError>(){});
    cognitiveNlpV1SummarizationHeadlineAndSummaryPostResponseTypeMap.put(500, new GenericType<HTTPError>(){});
  }
  private static final Map<Integer, GenericType> cognitiveNlpV1SummarizationHeadlinePostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    cognitiveNlpV1SummarizationHeadlinePostResponseTypeMap.put(201, new GenericType<SummarizationResultID>(){});
    cognitiveNlpV1SummarizationHeadlinePostResponseTypeMap.put(400, new GenericType<ValidationError>(){});
    cognitiveNlpV1SummarizationHeadlinePostResponseTypeMap.put(401, new GenericType<HTTPError>(){});
    cognitiveNlpV1SummarizationHeadlinePostResponseTypeMap.put(500, new GenericType<HTTPError>(){});
  }
  private static final Map<Integer, GenericType> cognitiveNlpV1SummarizationResultResultIdGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    cognitiveNlpV1SummarizationResultResultIdGetResponseTypeMap.put(200, new GenericType<SummarizationResult>(){});
    cognitiveNlpV1SummarizationResultResultIdGetResponseTypeMap.put(400, new GenericType<HTTPError>(){});
    cognitiveNlpV1SummarizationResultResultIdGetResponseTypeMap.put(401, new GenericType<HTTPError>(){});
    cognitiveNlpV1SummarizationResultResultIdGetResponseTypeMap.put(404, new GenericType<HTTPError>(){});
    cognitiveNlpV1SummarizationResultResultIdGetResponseTypeMap.put(500, new GenericType<HTTPError>(){});
  }
  private static final Map<Integer, GenericType> cognitiveNlpV1SummarizationSummaryPostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    cognitiveNlpV1SummarizationSummaryPostResponseTypeMap.put(201, new GenericType<SummarizationResultID>(){});
    cognitiveNlpV1SummarizationSummaryPostResponseTypeMap.put(400, new GenericType<ValidationError>(){});
    cognitiveNlpV1SummarizationSummaryPostResponseTypeMap.put(401, new GenericType<HTTPError>(){});
    cognitiveNlpV1SummarizationSummaryPostResponseTypeMap.put(500, new GenericType<HTTPError>(){});
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
   * POST request for summarizing an input text
   * 
   * @param summarizationRequest  (optional)
   * @return SummarizationResultID
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
  public SummarizationResultID cognitiveNlpV1SummarizationHeadlineAndSummaryPost(SummarizationRequest summarizationRequest) throws ApiException {
    return cognitiveNlpV1SummarizationHeadlineAndSummaryPostWithHttpInfo(summarizationRequest).getData();
  }

  /**
   * POST request for summarizing an input text
   * 
   * @param summarizationRequest  (optional)
   * @return ApiResponse&lt;SummarizationResultID&gt;
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
  public ApiResponse<SummarizationResultID> cognitiveNlpV1SummarizationHeadlineAndSummaryPostWithHttpInfo(SummarizationRequest summarizationRequest) throws ApiException {
    Object localVarPostBody = summarizationRequest;
    
    // create path and map variables
    String localVarPath = "/cognitive/nlp/v1/summarization/headline-and-summary";

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
        
        SummarizationResultID
      
    > apiResponse = apiClient.invokeAPI("AiTextSummarizationApi.cognitiveNlpV1SummarizationHeadlineAndSummaryPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, cognitiveNlpV1SummarizationHeadlineAndSummaryPostResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * POST request for summarizing an input text
   * 
   * @param summarizationRequest  (optional)
   * @return SummarizationResultID
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
  public SummarizationResultID cognitiveNlpV1SummarizationHeadlinePost(SummarizationRequest summarizationRequest) throws ApiException {
    return cognitiveNlpV1SummarizationHeadlinePostWithHttpInfo(summarizationRequest).getData();
  }

  /**
   * POST request for summarizing an input text
   * 
   * @param summarizationRequest  (optional)
   * @return ApiResponse&lt;SummarizationResultID&gt;
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
  public ApiResponse<SummarizationResultID> cognitiveNlpV1SummarizationHeadlinePostWithHttpInfo(SummarizationRequest summarizationRequest) throws ApiException {
    Object localVarPostBody = summarizationRequest;
    
    // create path and map variables
    String localVarPath = "/cognitive/nlp/v1/summarization/headline";

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
        
        SummarizationResultID
      
    > apiResponse = apiClient.invokeAPI("AiTextSummarizationApi.cognitiveNlpV1SummarizationHeadlinePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, cognitiveNlpV1SummarizationHeadlinePostResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * GET request for obtaining response of a particular processing job
   * 
   * @param resultId  (required)
   * @return SummarizationResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Access Denied </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public SummarizationResult cognitiveNlpV1SummarizationResultResultIdGet(String resultId) throws ApiException {
    return cognitiveNlpV1SummarizationResultResultIdGetWithHttpInfo(resultId).getData();
  }

  /**
   * GET request for obtaining response of a particular processing job
   * 
   * @param resultId  (required)
   * @return ApiResponse&lt;SummarizationResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Access Denied </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SummarizationResult> cognitiveNlpV1SummarizationResultResultIdGetWithHttpInfo(String resultId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'resultId' is set
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling cognitiveNlpV1SummarizationResultResultIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/cognitive/nlp/v1/summarization/result/{result_id}"
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
        
        SummarizationResult
      
    > apiResponse = apiClient.invokeAPI("AiTextSummarizationApi.cognitiveNlpV1SummarizationResultResultIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, cognitiveNlpV1SummarizationResultResultIdGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * POST request for summarizing an input text
   * 
   * @param summarizationRequest  (optional)
   * @return SummarizationResultID
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
  public SummarizationResultID cognitiveNlpV1SummarizationSummaryPost(SummarizationRequest summarizationRequest) throws ApiException {
    return cognitiveNlpV1SummarizationSummaryPostWithHttpInfo(summarizationRequest).getData();
  }

  /**
   * POST request for summarizing an input text
   * 
   * @param summarizationRequest  (optional)
   * @return ApiResponse&lt;SummarizationResultID&gt;
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
  public ApiResponse<SummarizationResultID> cognitiveNlpV1SummarizationSummaryPostWithHttpInfo(SummarizationRequest summarizationRequest) throws ApiException {
    Object localVarPostBody = summarizationRequest;
    
    // create path and map variables
    String localVarPath = "/cognitive/nlp/v1/summarization/summary";

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
        
        SummarizationResultID
      
    > apiResponse = apiClient.invokeAPI("AiTextSummarizationApi.cognitiveNlpV1SummarizationSummaryPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, cognitiveNlpV1SummarizationSummaryPostResponseTypeMap, false);

    return apiResponse;

  }
}
