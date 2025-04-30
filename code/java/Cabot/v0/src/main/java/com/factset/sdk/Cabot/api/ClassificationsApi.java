package com.factset.sdk.Cabot.api;

import com.factset.sdk.Cabot.ApiException;
import com.factset.sdk.Cabot.ApiClient;
import com.factset.sdk.Cabot.ApiResponse;
import com.factset.sdk.Cabot.Configuration;
import com.factset.sdk.Cabot.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.Cabot.models.ClassificationsResponseRoot;
import com.factset.sdk.Cabot.models.ClientErrorResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ClassificationsApi {
  private ApiClient apiClient;

  public ClassificationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ClassificationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getPortfolioClassificationsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPortfolioClassificationsResponseTypeMap.put(200, new GenericType<ClassificationsResponseRoot>(){});
    getPortfolioClassificationsResponseTypeMap.put(400, new GenericType<ClientErrorResponse>(){});
    getPortfolioClassificationsResponseTypeMap.put(404, new GenericType<ClientErrorResponse>(){});
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
   * Cabot main path for Classifications API
   * Cabot main path for Classifications API
   * @param accountPath The account path of the portfolio you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; (required)
   * @param benchmarkPath The path of the benchmark you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; (required)
   * @return ClassificationsResponseRoot
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad request, invalid query parameters. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 404 </td><td> Path not found </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 408 </td><td> Request timeout. Retry the request in sometime. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. </td><td>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in some time </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
     </table>
   */
  public ClassificationsResponseRoot getPortfolioClassifications(String accountPath, String benchmarkPath) throws ApiException {
    return getPortfolioClassificationsWithHttpInfo(accountPath, benchmarkPath).getData();
  }

  /**
   * Cabot main path for Classifications API
   * Cabot main path for Classifications API
   * @param accountPath The account path of the portfolio you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; (required)
   * @param benchmarkPath The path of the benchmark you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; (required)
   * @return ApiResponse&lt;ClassificationsResponseRoot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad request, invalid query parameters. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 403 </td><td> User is forbidden with current credentials. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 404 </td><td> Path not found </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 408 </td><td> Request timeout. Retry the request in sometime. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Missing/Invalid Content-Type header. Header needs to be set to application/json. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. </td><td>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
       <tr><td> 503 </td><td> Request timed out. Retry the request in some time </td><td>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<ClassificationsResponseRoot> getPortfolioClassificationsWithHttpInfo(String accountPath, String benchmarkPath) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountPath' is set
    if (accountPath == null) {
      throw new ApiException(400, "Missing the required parameter 'accountPath' when calling getPortfolioClassifications");
    }
    
    // verify the required parameter 'benchmarkPath' is set
    if (benchmarkPath == null) {
      throw new ApiException(400, "Missing the required parameter 'benchmarkPath' when calling getPortfolioClassifications");
    }
    
    // create path and map variables
    String localVarPath = "/classifications";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accountPath", accountPath));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "benchmarkPath", benchmarkPath));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ClassificationsResponseRoot
      
    > apiResponse = apiClient.invokeAPI("ClassificationsApi.getPortfolioClassifications", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPortfolioClassificationsResponseTypeMap, false);

    return apiResponse;

  }
}
