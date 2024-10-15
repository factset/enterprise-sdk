package com.factset.sdk.FactSetDebtCapitalStructure.api;

import com.factset.sdk.FactSetDebtCapitalStructure.ApiException;
import com.factset.sdk.FactSetDebtCapitalStructure.ApiClient;
import com.factset.sdk.FactSetDebtCapitalStructure.ApiResponse;
import com.factset.sdk.FactSetDebtCapitalStructure.Configuration;
import com.factset.sdk.FactSetDebtCapitalStructure.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetDebtCapitalStructure.models.DetailsRequest;
import com.factset.sdk.FactSetDebtCapitalStructure.models.DetailsResponse;
import com.factset.sdk.FactSetDebtCapitalStructure.models.ErrorResponse;
import com.factset.sdk.FactSetDebtCapitalStructure.models.InterimDetailsRequest;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ReferenceApi {
  private ApiClient apiClient;

  public ReferenceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReferenceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getDetailsListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDetailsListResponseTypeMap.put(200, new GenericType<DetailsResponse>(){});
    getDetailsListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getDetailsListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getDetailsListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getDetailsListResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getDetailsListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getDetailsListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getInterimDetailsListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getInterimDetailsListResponseTypeMap.put(200, new GenericType<DetailsResponse>(){});
    getInterimDetailsListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getInterimDetailsListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getInterimDetailsListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getInterimDetailsListResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getInterimDetailsListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getInterimDetailsListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns debt instruments for a list of companies.
   * Gets instruments of varying types such as Revolving Credit, Term Loans, ST Debt Total, Notes/Bonds, and Other. 
   * @param detailsRequest Request object for &#x60;Details&#x60;. (required)
   * @return DetailsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of details </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public DetailsResponse getDetailsList(DetailsRequest detailsRequest) throws ApiException {
    return getDetailsListWithHttpInfo(detailsRequest).getData();
  }

  /**
   * Returns debt instruments for a list of companies.
   * Gets instruments of varying types such as Revolving Credit, Term Loans, ST Debt Total, Notes/Bonds, and Other. 
   * @param detailsRequest Request object for &#x60;Details&#x60;. (required)
   * @return ApiResponse&lt;DetailsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of details </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DetailsResponse> getDetailsListWithHttpInfo(DetailsRequest detailsRequest) throws ApiException {
    Object localVarPostBody = detailsRequest;
    
    // verify the required parameter 'detailsRequest' is set
    if (detailsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'detailsRequest' when calling getDetailsList");
    }
    
    // create path and map variables
    String localVarPath = "/details";

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
        
        DetailsResponse
      
    > apiResponse = apiClient.invokeAPI("ReferenceApi.getDetailsList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDetailsListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns most recently available debt instrument data for a list of companies.
   * Gets instruments of varying types such as Revolving Credit, Term Loans, ST Debt Total, Notes/Bonds, and Other. The data returned by this endpoint is for the interim period and only returns the most recently available value. 
   * @param interimDetailsRequest Request object for &#x60;Details&#x60;. (required)
   * @return DetailsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of interim details </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public DetailsResponse getInterimDetailsList(InterimDetailsRequest interimDetailsRequest) throws ApiException {
    return getInterimDetailsListWithHttpInfo(interimDetailsRequest).getData();
  }

  /**
   * Returns most recently available debt instrument data for a list of companies.
   * Gets instruments of varying types such as Revolving Credit, Term Loans, ST Debt Total, Notes/Bonds, and Other. The data returned by this endpoint is for the interim period and only returns the most recently available value. 
   * @param interimDetailsRequest Request object for &#x60;Details&#x60;. (required)
   * @return ApiResponse&lt;DetailsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of interim details </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DetailsResponse> getInterimDetailsListWithHttpInfo(InterimDetailsRequest interimDetailsRequest) throws ApiException {
    Object localVarPostBody = interimDetailsRequest;
    
    // verify the required parameter 'interimDetailsRequest' is set
    if (interimDetailsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'interimDetailsRequest' when calling getInterimDetailsList");
    }
    
    // create path and map variables
    String localVarPath = "/details-interim";

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
        
        DetailsResponse
      
    > apiResponse = apiClient.invokeAPI("ReferenceApi.getInterimDetailsList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInterimDetailsListResponseTypeMap, false);

    return apiResponse;

  }
}
