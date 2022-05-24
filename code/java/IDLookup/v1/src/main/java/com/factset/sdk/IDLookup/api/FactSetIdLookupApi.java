package com.factset.sdk.IDLookup.api;

import com.factset.sdk.IDLookup.ApiException;
import com.factset.sdk.IDLookup.ApiClient;
import com.factset.sdk.IDLookup.ApiResponse;
import com.factset.sdk.IDLookup.Configuration;
import com.factset.sdk.IDLookup.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.IDLookup.models.ErrorResponse;
import com.factset.sdk.IDLookup.models.LookupRequest;
import com.factset.sdk.IDLookup.models.LookupResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FactSetIdLookupApi {
  private ApiClient apiClient;

  public FactSetIdLookupApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FactSetIdLookupApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> searchCompanynameResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    searchCompanynameResponseTypeMap.put(200, new GenericType<LookupResponse>(){});
    searchCompanynameResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    searchCompanynameResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    searchCompanynameResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    searchCompanynameResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Search funtionality to return tickers, company names and unique identifiers for FactSet data
   * Service will accept request in JSON formatted request body. The request is sent by passing a query which is an array conitaining search query objects with parameters. The parameters contain search term and filters defined by the end user. This would display a specific set of identifiers based on the request. 
   * @param lookupRequest Post body to lookup any FactSet identifiers (required)
   * @return LookupResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of securities </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication issue </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public LookupResponse searchCompanyname(LookupRequest lookupRequest) throws ApiException {
    return searchCompanynameWithHttpInfo(lookupRequest).getData();
  }

  /**
   * Search funtionality to return tickers, company names and unique identifiers for FactSet data
   * Service will accept request in JSON formatted request body. The request is sent by passing a query which is an array conitaining search query objects with parameters. The parameters contain search term and filters defined by the end user. This would display a specific set of identifiers based on the request. 
   * @param lookupRequest Post body to lookup any FactSet identifiers (required)
   * @return ApiResponse&lt;LookupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of securities </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Authentication issue </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<LookupResponse> searchCompanynameWithHttpInfo(LookupRequest lookupRequest) throws ApiException {
    Object localVarPostBody = lookupRequest;
    
    // verify the required parameter 'lookupRequest' is set
    if (lookupRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'lookupRequest' when calling searchCompanyname");
    }
    
    // create path and map variables
    String localVarPath = "/v1/idsearch";

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
        
        LookupResponse
      
    > apiResponse = apiClient.invokeAPI("FactSetIdLookupApi.searchCompanyname", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, searchCompanynameResponseTypeMap, false);

    return apiResponse;

  }
}
