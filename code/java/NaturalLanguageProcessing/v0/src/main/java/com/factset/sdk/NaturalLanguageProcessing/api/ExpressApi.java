package com.factset.sdk.NaturalLanguageProcessing.api;

import com.factset.sdk.NaturalLanguageProcessing.ApiException;
import com.factset.sdk.NaturalLanguageProcessing.ApiClient;
import com.factset.sdk.NaturalLanguageProcessing.ApiResponse;
import com.factset.sdk.NaturalLanguageProcessing.Configuration;
import com.factset.sdk.NaturalLanguageProcessing.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.NaturalLanguageProcessing.models.ErrorResponse;
import com.factset.sdk.NaturalLanguageProcessing.models.ExpressRequestRoot;
import com.factset.sdk.NaturalLanguageProcessing.models.OutputRoot;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ExpressApi {
  private ApiClient apiClient;

  public ExpressApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExpressApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> postExpressNerExtractionResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postExpressNerExtractionResponseTypeMap.put(200, new GenericType<OutputRoot>(){});
    postExpressNerExtractionResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    postExpressNerExtractionResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
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
   * Express Processing
   * NER endpoint optimized for speed, supports batch processing up to 10 inputs. Supports person, organization, location, product, datetime, period, and numerical entity types.
   * @param expressRequestRoot  (required)
   * @return OutputRoot
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful entity extraction </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public OutputRoot postExpressNerExtraction(ExpressRequestRoot expressRequestRoot) throws ApiException {
    return postExpressNerExtractionWithHttpInfo(expressRequestRoot).getData();
  }

  /**
   * Express Processing
   * NER endpoint optimized for speed, supports batch processing up to 10 inputs. Supports person, organization, location, product, datetime, period, and numerical entity types.
   * @param expressRequestRoot  (required)
   * @return ApiResponse&lt;OutputRoot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful entity extraction </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OutputRoot> postExpressNerExtractionWithHttpInfo(ExpressRequestRoot expressRequestRoot) throws ApiException {
    Object localVarPostBody = expressRequestRoot;
    
    // verify the required parameter 'expressRequestRoot' is set
    if (expressRequestRoot == null) {
      throw new ApiException(400, "Missing the required parameter 'expressRequestRoot' when calling postExpressNerExtraction");
    }
    
    // create path and map variables
    String localVarPath = "/express";

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
      
    > apiResponse = apiClient.invokeAPI("ExpressApi.postExpressNerExtraction", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postExpressNerExtractionResponseTypeMap, false);

    return apiResponse;

  }
}
