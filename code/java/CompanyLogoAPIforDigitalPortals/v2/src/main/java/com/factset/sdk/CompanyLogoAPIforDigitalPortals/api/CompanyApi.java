package com.factset.sdk.CompanyLogoAPIforDigitalPortals.api;

import com.factset.sdk.CompanyLogoAPIforDigitalPortals.ApiException;
import com.factset.sdk.CompanyLogoAPIforDigitalPortals.ApiClient;
import com.factset.sdk.CompanyLogoAPIforDigitalPortals.ApiResponse;
import com.factset.sdk.CompanyLogoAPIforDigitalPortals.Configuration;
import com.factset.sdk.CompanyLogoAPIforDigitalPortals.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.CompanyLogoAPIforDigitalPortals.models.InlineResponse200;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CompanyApi {
  private ApiClient apiClient;

  public CompanyApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CompanyApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getCompanyLogoGetByInstrumentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCompanyLogoGetByInstrumentResponseTypeMap.put(200, new GenericType<InlineResponse200>(){});
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
   * URLs of company logos.
   * URLs of transparent company logos in different sizes. A small square logo is 31x31 pixels. A small rectangular logo has a maximum width of 88 pixels and a maximum height of 31 pixels. A medium or large logo has the size of the small logo scaled up by 200% and 300% respectively. A vector logo can be rendered at any size.
   * @param id Identifier of an instrument. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse200 getCompanyLogoGetByInstrument(String id, java.util.Set<String> attributes) throws ApiException {
    return getCompanyLogoGetByInstrumentWithHttpInfo(id, attributes).getData();
  }

  /**
   * URLs of company logos.
   * URLs of transparent company logos in different sizes. A small square logo is 31x31 pixels. A small rectangular logo has a maximum width of 88 pixels and a maximum height of 31 pixels. A medium or large logo has the size of the small logo scaled up by 200% and 300% respectively. A vector logo can be rendered at any size.
   * @param id Identifier of an instrument. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse200&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse200> getCompanyLogoGetByInstrumentWithHttpInfo(String id, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCompanyLogoGetByInstrument");
    }
    
    // create path and map variables
    String localVarPath = "/company/logo/getByInstrument";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse200
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.getCompanyLogoGetByInstrument", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCompanyLogoGetByInstrumentResponseTypeMap, false);

    return apiResponse;

  }
}
