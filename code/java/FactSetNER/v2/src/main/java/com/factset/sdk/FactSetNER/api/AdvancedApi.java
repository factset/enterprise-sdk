package com.factset.sdk.FactSetNER.api;

import com.factset.sdk.FactSetNER.ApiException;
import com.factset.sdk.FactSetNER.ApiClient;
import com.factset.sdk.FactSetNER.ApiResponse;
import com.factset.sdk.FactSetNER.Configuration;
import com.factset.sdk.FactSetNER.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetNER.models.AdvancedRequestRoot;
import com.factset.sdk.FactSetNER.models.ErrorResponse;
import com.factset.sdk.FactSetNER.models.OutputRoot;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class AdvancedApi {
  private ApiClient apiClient;

  public AdvancedApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AdvancedApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> postAdvancedNerExtractionResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postAdvancedNerExtractionResponseTypeMap.put(200, new GenericType<OutputRoot>(){});
    postAdvancedNerExtractionResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    postAdvancedNerExtractionResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    postAdvancedNerExtractionResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    postAdvancedNerExtractionResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
    postAdvancedNerExtractionResponseTypeMap.put(502, new GenericType<ErrorResponse>(){});
    postAdvancedNerExtractionResponseTypeMap.put(504, new GenericType<ErrorResponse>(){});
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
   * Advanced Processing
   * NER endpoint optimized for accuracy and entity coverage, supports single-input processing. Supports financial entity types such as cryptocurrency, index, rate, yield, commodity, currency, future, fund, asset, and debt instrument in addition to Express entity types.  Optionally select a model via &#x60;data.model&#x60; in the request body. Supported models: - GPT 5.2 - Claude Sonnet 4.6 - Llama 4 Scout Instruct (the default)  Requests are limited to a 30-second timeout. 
   * @param advancedRequestRoot  (required)
   * @return OutputRoot
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful entity extraction </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
       <tr><td> 502 </td><td> Upstream model gateway error </td><td>  -  </td></tr>
       <tr><td> 504 </td><td> Request exceeded the 30-second processing timeout </td><td>  -  </td></tr>
     </table>
   */
  public OutputRoot postAdvancedNerExtraction(AdvancedRequestRoot advancedRequestRoot) throws ApiException {
    return postAdvancedNerExtractionWithHttpInfo(advancedRequestRoot).getData();
  }

  /**
   * Advanced Processing
   * NER endpoint optimized for accuracy and entity coverage, supports single-input processing. Supports financial entity types such as cryptocurrency, index, rate, yield, commodity, currency, future, fund, asset, and debt instrument in addition to Express entity types.  Optionally select a model via &#x60;data.model&#x60; in the request body. Supported models: - GPT 5.2 - Claude Sonnet 4.6 - Llama 4 Scout Instruct (the default)  Requests are limited to a 30-second timeout. 
   * @param advancedRequestRoot  (required)
   * @return ApiResponse&lt;OutputRoot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful entity extraction </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
       <tr><td> 502 </td><td> Upstream model gateway error </td><td>  -  </td></tr>
       <tr><td> 504 </td><td> Request exceeded the 30-second processing timeout </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OutputRoot> postAdvancedNerExtractionWithHttpInfo(AdvancedRequestRoot advancedRequestRoot) throws ApiException {
    Object localVarPostBody = advancedRequestRoot;
    
    // verify the required parameter 'advancedRequestRoot' is set
    if (advancedRequestRoot == null) {
      throw new ApiException(400, "Missing the required parameter 'advancedRequestRoot' when calling postAdvancedNerExtraction");
    }
    
    // create path and map variables
    String localVarPath = "/advanced/extract";

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
        
        OutputRoot
      
    > apiResponse = apiClient.invokeAPI("AdvancedApi.postAdvancedNerExtraction", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postAdvancedNerExtractionResponseTypeMap, false);

    return apiResponse;

  }
}
