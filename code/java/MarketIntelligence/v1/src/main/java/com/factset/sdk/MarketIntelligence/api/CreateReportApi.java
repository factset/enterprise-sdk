package com.factset.sdk.MarketIntelligence.api;

import com.factset.sdk.MarketIntelligence.ApiException;
import com.factset.sdk.MarketIntelligence.ApiClient;
import com.factset.sdk.MarketIntelligence.ApiResponse;
import com.factset.sdk.MarketIntelligence.Configuration;
import com.factset.sdk.MarketIntelligence.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.MarketIntelligence.models.MIAPIPostRequest;
import com.factset.sdk.MarketIntelligence.models.PostResponseInfo;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CreateReportApi {
  private ApiClient apiClient;

  public CreateReportApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CreateReportApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> createPostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createPostResponseTypeMap.put(200, new GenericType<PostResponseInfo>(){});
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
   * Create new report templates including portfolio or market news and data.
   * Endpoint to create a new Market Intelligence report. If you want to retrieve a report you created, use get-reports call mentioned below.
   * @param miAPIPostRequest  (required)
   * @return PostResponseInfo
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response, report created. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid identifier or Unknown error </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing/invalid Credentials or Authentication failure </td><td>  -  </td></tr>
     </table>
   */
  public PostResponseInfo createPost(MIAPIPostRequest miAPIPostRequest) throws ApiException {
    return createPostWithHttpInfo(miAPIPostRequest).getData();
  }

  /**
   * Create new report templates including portfolio or market news and data.
   * Endpoint to create a new Market Intelligence report. If you want to retrieve a report you created, use get-reports call mentioned below.
   * @param miAPIPostRequest  (required)
   * @return ApiResponse&lt;PostResponseInfo&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response, report created. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid identifier or Unknown error </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing/invalid Credentials or Authentication failure </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PostResponseInfo> createPostWithHttpInfo(MIAPIPostRequest miAPIPostRequest) throws ApiException {
    Object localVarPostBody = miAPIPostRequest;
    
    // verify the required parameter 'miAPIPostRequest' is set
    if (miAPIPostRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'miAPIPostRequest' when calling createPost");
    }
    
    // create path and map variables
    String localVarPath = "/create";

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
        
        PostResponseInfo
      
    > apiResponse = apiClient.invokeAPI("CreateReportApi.createPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createPostResponseTypeMap, false);

    return apiResponse;

  }
}
