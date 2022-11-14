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

import com.factset.sdk.NaturalLanguageProcessing.models.NERInputSchema;
import com.factset.sdk.NaturalLanguageProcessing.models.NERResponseSchema;
import com.factset.sdk.NaturalLanguageProcessing.models.NERValidationError;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NamedEntityRecognitionApi {
  private ApiClient apiClient;

  public NamedEntityRecognitionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NamedEntityRecognitionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> cognitiveNlpV1NerEntitiesPostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    cognitiveNlpV1NerEntitiesPostResponseTypeMap.put(200, new GenericType<NERResponseSchema>(){});
    cognitiveNlpV1NerEntitiesPostResponseTypeMap.put(400, new GenericType<NERValidationError>(){});
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
   * Endpoint to detect entities from text
   * 
   * @param neRInputSchema  (optional)
   * @return NERResponseSchema
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Validation error </td><td>  -  </td></tr>
     </table>
   */
  public NERResponseSchema cognitiveNlpV1NerEntitiesPost(NERInputSchema neRInputSchema) throws ApiException {
    return cognitiveNlpV1NerEntitiesPostWithHttpInfo(neRInputSchema).getData();
  }

  /**
   * Endpoint to detect entities from text
   * 
   * @param neRInputSchema  (optional)
   * @return ApiResponse&lt;NERResponseSchema&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Validation error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NERResponseSchema> cognitiveNlpV1NerEntitiesPostWithHttpInfo(NERInputSchema neRInputSchema) throws ApiException {
    Object localVarPostBody = neRInputSchema;
    
    // create path and map variables
    String localVarPath = "/cognitive/nlp/v1/ner/entities";

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
        
        NERResponseSchema
      
    > apiResponse = apiClient.invokeAPI("NamedEntityRecognitionApi.cognitiveNlpV1NerEntitiesPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, cognitiveNlpV1NerEntitiesPostResponseTypeMap, false);

    return apiResponse;

  }
}
