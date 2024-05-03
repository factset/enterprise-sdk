package com.factset.sdk.FactSetMergersandAcquisitions.api;

import com.factset.sdk.FactSetMergersandAcquisitions.ApiException;
import com.factset.sdk.FactSetMergersandAcquisitions.ApiClient;
import com.factset.sdk.FactSetMergersandAcquisitions.ApiResponse;
import com.factset.sdk.FactSetMergersandAcquisitions.Configuration;
import com.factset.sdk.FactSetMergersandAcquisitions.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetMergersandAcquisitions.models.DealsPublicRequest;
import com.factset.sdk.FactSetMergersandAcquisitions.models.DealsPublicResponse;
import com.factset.sdk.FactSetMergersandAcquisitions.models.DealsRequest;
import com.factset.sdk.FactSetMergersandAcquisitions.models.DealsResponse;
import com.factset.sdk.FactSetMergersandAcquisitions.models.DetailsRequest;
import com.factset.sdk.FactSetMergersandAcquisitions.models.DetailsResponse;
import com.factset.sdk.FactSetMergersandAcquisitions.models.ErrorResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class DealsApi {
  private ApiClient apiClient;

  public DealsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DealsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getDealsByCompanyListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDealsByCompanyListResponseTypeMap.put(200, new GenericType<DealsResponse>(){});
    getDealsByCompanyListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getDealsByCompanyListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getDealsByCompanyListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getDealsByCompanyListResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getDealsByCompanyListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getDealsByCompanyListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getDealsDetailsListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDealsDetailsListResponseTypeMap.put(200, new GenericType<DetailsResponse>(){});
    getDealsDetailsListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getDealsDetailsListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getDealsDetailsListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getDealsDetailsListResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getDealsDetailsListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getDealsDetailsListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getPublicTargetDealsListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPublicTargetDealsListResponseTypeMap.put(200, new GenericType<DealsPublicResponse>(){});
    getPublicTargetDealsListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getPublicTargetDealsListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getPublicTargetDealsListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getPublicTargetDealsListResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    getPublicTargetDealsListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getPublicTargetDealsListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns details for a list of companies.
   * Gets deals for a specified list of companies within a date range. Deals returned are any in which the requested company is involved as either the buyer, seller, or target. The start and end date parameters will find deals based on their announcement date. The response of this endpoint includes &#x60;dealId&#x60; which can be sent to the &#x60;/deals/details&#x60; endpoint for more information about the deal. 
   * @param dealsRequest Request object for &#x60;Deals&#x60;. (required)
   * @return DealsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of deals </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public DealsResponse getDealsByCompanyList(DealsRequest dealsRequest) throws ApiException {
    return getDealsByCompanyListWithHttpInfo(dealsRequest).getData();
  }

  /**
   * Returns details for a list of companies.
   * Gets deals for a specified list of companies within a date range. Deals returned are any in which the requested company is involved as either the buyer, seller, or target. The start and end date parameters will find deals based on their announcement date. The response of this endpoint includes &#x60;dealId&#x60; which can be sent to the &#x60;/deals/details&#x60; endpoint for more information about the deal. 
   * @param dealsRequest Request object for &#x60;Deals&#x60;. (required)
   * @return ApiResponse&lt;DealsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of deals </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DealsResponse> getDealsByCompanyListWithHttpInfo(DealsRequest dealsRequest) throws ApiException {
    Object localVarPostBody = dealsRequest;
    
    // verify the required parameter 'dealsRequest' is set
    if (dealsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'dealsRequest' when calling getDealsByCompanyList");
    }
    
    // create path and map variables
    String localVarPath = "/deals/by-company";

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
        
        DealsResponse
      
    > apiResponse = apiClient.invokeAPI("DealsApi.getDealsByCompanyList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDealsByCompanyListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns details for specified deals.
   * Gets deal details for a specified list of FactSet deal identifiers. Monetary values returned by this API are converted and represented in USD. 
   * @param detailsRequest Request object for &#x60;Deal Details&#x60;. (required)
   * @return DetailsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of deal details </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public DetailsResponse getDealsDetailsList(DetailsRequest detailsRequest) throws ApiException {
    return getDealsDetailsListWithHttpInfo(detailsRequest).getData();
  }

  /**
   * Returns details for specified deals.
   * Gets deal details for a specified list of FactSet deal identifiers. Monetary values returned by this API are converted and represented in USD. 
   * @param detailsRequest Request object for &#x60;Deal Details&#x60;. (required)
   * @return ApiResponse&lt;DetailsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of deal details </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DetailsResponse> getDealsDetailsListWithHttpInfo(DetailsRequest detailsRequest) throws ApiException {
    Object localVarPostBody = detailsRequest;
    
    // verify the required parameter 'detailsRequest' is set
    if (detailsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'detailsRequest' when calling getDealsDetailsList");
    }
    
    // create path and map variables
    String localVarPath = "/deals/details";

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
      
    > apiResponse = apiClient.invokeAPI("DealsApi.getDealsDetailsList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDealsDetailsListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns a list of deals in which the target is a public company.
   * Gets deals in which the target is a public company for a specified date range and status. The start and end date parameters will find deals based on their announcement date. The response of this endpoint includes &#x60;dealId&#x60; which can be sent to the &#x60;/deals/details&#x60; endpoint for more information about the deal. 
   * @param dealsPublicRequest Request object for &#x60;Deals&#x60;. (required)
   * @return DealsPublicResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of deals </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public DealsPublicResponse getPublicTargetDealsList(DealsPublicRequest dealsPublicRequest) throws ApiException {
    return getPublicTargetDealsListWithHttpInfo(dealsPublicRequest).getData();
  }

  /**
   * Returns a list of deals in which the target is a public company.
   * Gets deals in which the target is a public company for a specified date range and status. The start and end date parameters will find deals based on their announcement date. The response of this endpoint includes &#x60;dealId&#x60; which can be sent to the &#x60;/deals/details&#x60; endpoint for more information about the deal. 
   * @param dealsPublicRequest Request object for &#x60;Deals&#x60;. (required)
   * @return ApiResponse&lt;DealsPublicResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of deals </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested endpoint could not be found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DealsPublicResponse> getPublicTargetDealsListWithHttpInfo(DealsPublicRequest dealsPublicRequest) throws ApiException {
    Object localVarPostBody = dealsPublicRequest;
    
    // verify the required parameter 'dealsPublicRequest' is set
    if (dealsPublicRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'dealsPublicRequest' when calling getPublicTargetDealsList");
    }
    
    // create path and map variables
    String localVarPath = "/deals/public-targets";

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
        
        DealsPublicResponse
      
    > apiResponse = apiClient.invokeAPI("DealsApi.getPublicTargetDealsList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPublicTargetDealsListResponseTypeMap, false);

    return apiResponse;

  }
}
