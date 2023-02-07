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

    private static final Map<Integer, GenericType> summarizationHeadlineResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    summarizationHeadlineResponseTypeMap.put(201, new GenericType<SummarizationResultID>(){});
    summarizationHeadlineResponseTypeMap.put(400, new GenericType<ValidationError>(){});
    summarizationHeadlineResponseTypeMap.put(401, new GenericType<HTTPError>(){});
    summarizationHeadlineResponseTypeMap.put(500, new GenericType<HTTPError>(){});
  }
  private static final Map<Integer, GenericType> summarizationHeadlineAndSummaryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    summarizationHeadlineAndSummaryResponseTypeMap.put(201, new GenericType<SummarizationResultID>(){});
    summarizationHeadlineAndSummaryResponseTypeMap.put(400, new GenericType<ValidationError>(){});
    summarizationHeadlineAndSummaryResponseTypeMap.put(401, new GenericType<HTTPError>(){});
    summarizationHeadlineAndSummaryResponseTypeMap.put(500, new GenericType<HTTPError>(){});
  }
  private static final Map<Integer, GenericType> summarizationResultResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    summarizationResultResponseTypeMap.put(200, new GenericType<SummarizationResult>(){});
    summarizationResultResponseTypeMap.put(400, new GenericType<HTTPError>(){});
    summarizationResultResponseTypeMap.put(401, new GenericType<HTTPError>(){});
    summarizationResultResponseTypeMap.put(404, new GenericType<HTTPError>(){});
    summarizationResultResponseTypeMap.put(500, new GenericType<HTTPError>(){});
  }
  private static final Map<Integer, GenericType> summarizationSummaryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    summarizationSummaryResponseTypeMap.put(201, new GenericType<SummarizationResultID>(){});
    summarizationSummaryResponseTypeMap.put(400, new GenericType<ValidationError>(){});
    summarizationSummaryResponseTypeMap.put(401, new GenericType<HTTPError>(){});
    summarizationSummaryResponseTypeMap.put(500, new GenericType<HTTPError>(){});
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
   * Endpoint to generate a headline from text
   * Generate a headline-length summary of plain text
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
  public SummarizationResultID summarizationHeadline(SummarizationRequest summarizationRequest) throws ApiException {
    return summarizationHeadlineWithHttpInfo(summarizationRequest).getData();
  }

  /**
   * Endpoint to generate a headline from text
   * Generate a headline-length summary of plain text
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
  public ApiResponse<SummarizationResultID> summarizationHeadlineWithHttpInfo(SummarizationRequest summarizationRequest) throws ApiException {
    Object localVarPostBody = summarizationRequest;
    
    // create path and map variables
    String localVarPath = "/summarization/headline";

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
      
    > apiResponse = apiClient.invokeAPI("AiTextSummarizationApi.summarizationHeadline", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, summarizationHeadlineResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Endpoint to summarize and generate a headline from text
   * Generate both a paragraph-length, and headline-length summary of plain text
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
  public SummarizationResultID summarizationHeadlineAndSummary(SummarizationRequest summarizationRequest) throws ApiException {
    return summarizationHeadlineAndSummaryWithHttpInfo(summarizationRequest).getData();
  }

  /**
   * Endpoint to summarize and generate a headline from text
   * Generate both a paragraph-length, and headline-length summary of plain text
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
  public ApiResponse<SummarizationResultID> summarizationHeadlineAndSummaryWithHttpInfo(SummarizationRequest summarizationRequest) throws ApiException {
    Object localVarPostBody = summarizationRequest;
    
    // create path and map variables
    String localVarPath = "/summarization/headline-and-summary";

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
      
    > apiResponse = apiClient.invokeAPI("AiTextSummarizationApi.summarizationHeadlineAndSummary", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, summarizationHeadlineAndSummaryResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Endpoint to obtain result of a particular summarization job
   * Retrieve the summarization result from a job started with the other summarization endpoints
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
  public SummarizationResult summarizationResult(String resultId) throws ApiException {
    return summarizationResultWithHttpInfo(resultId).getData();
  }

  /**
   * Endpoint to obtain result of a particular summarization job
   * Retrieve the summarization result from a job started with the other summarization endpoints
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
  public ApiResponse<SummarizationResult> summarizationResultWithHttpInfo(String resultId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'resultId' is set
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling summarizationResult");
    }
    
    // create path and map variables
    String localVarPath = "/summarization/result/{resultId}"
      .replaceAll("\\{" + "resultId" + "\\}", apiClient.escapeString(resultId.toString()));

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
      
    > apiResponse = apiClient.invokeAPI("AiTextSummarizationApi.summarizationResult", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, summarizationResultResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Endpoint to summarize text
   * Generate a paragraph-length summary of plain text
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
  public SummarizationResultID summarizationSummary(SummarizationRequest summarizationRequest) throws ApiException {
    return summarizationSummaryWithHttpInfo(summarizationRequest).getData();
  }

  /**
   * Endpoint to summarize text
   * Generate a paragraph-length summary of plain text
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
  public ApiResponse<SummarizationResultID> summarizationSummaryWithHttpInfo(SummarizationRequest summarizationRequest) throws ApiException {
    Object localVarPostBody = summarizationRequest;
    
    // create path and map variables
    String localVarPath = "/summarization/summary";

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
      
    > apiResponse = apiClient.invokeAPI("AiTextSummarizationApi.summarizationSummary", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, summarizationSummaryResponseTypeMap, false);

    return apiResponse;

  }
}
