package com.factset.sdk.CompanyLogo.api;

import com.factset.sdk.CompanyLogo.ApiException;
import com.factset.sdk.CompanyLogo.ApiClient;
import com.factset.sdk.CompanyLogo.ApiResponse;
import com.factset.sdk.CompanyLogo.Configuration;
import com.factset.sdk.CompanyLogo.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.CompanyLogo.models.ErrorResponse;
import com.factset.sdk.CompanyLogo.models.InlineResponse200;
import com.factset.sdk.CompanyLogo.models.PostCompanyLogoRequest;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CompanyLogosApi {
  private ApiClient apiClient;

  public CompanyLogosApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CompanyLogosApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> postCompanyLogoResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postCompanyLogoResponseTypeMap.put(200, new GenericType<InlineResponse200>(){});
    postCompanyLogoResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    postCompanyLogoResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    postCompanyLogoResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    postCompanyLogoResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Retrieves logos for one or more publicly traded companies.
   * Retrieves high-quality logos for one or more publicly traded companies using standard identifiers (e.g., ticker symbols, ISIN). Logos are available in a selection of predefined sizes or can be generated on-the-fly to custom dimensions. The endpoint accepts up to 100 identifiers per request. Note: Requesting a large number of logos in a single call may result in increased response times.
   * @param postCompanyLogoRequest Request Body (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated API Key or Token. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. The API Key or token is not authorized. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse200 postCompanyLogo(PostCompanyLogoRequest postCompanyLogoRequest) throws ApiException {
    return postCompanyLogoWithHttpInfo(postCompanyLogoRequest).getData();
  }

  /**
   * Retrieves logos for one or more publicly traded companies.
   * Retrieves high-quality logos for one or more publicly traded companies using standard identifiers (e.g., ticker symbols, ISIN). Logos are available in a selection of predefined sizes or can be generated on-the-fly to custom dimensions. The endpoint accepts up to 100 identifiers per request. Note: Requesting a large number of logos in a single call may result in increased response times.
   * @param postCompanyLogoRequest Request Body (optional)
   * @return ApiResponse&lt;InlineResponse200&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated API Key or Token. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. The API Key or token is not authorized. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse200> postCompanyLogoWithHttpInfo(PostCompanyLogoRequest postCompanyLogoRequest) throws ApiException {
    Object localVarPostBody = postCompanyLogoRequest;
    
    // create path and map variables
    String localVarPath = "/company/logo";

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
        
        InlineResponse200
      
    > apiResponse = apiClient.invokeAPI("CompanyLogosApi.postCompanyLogo", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postCompanyLogoResponseTypeMap, false);

    return apiResponse;

  }
}
