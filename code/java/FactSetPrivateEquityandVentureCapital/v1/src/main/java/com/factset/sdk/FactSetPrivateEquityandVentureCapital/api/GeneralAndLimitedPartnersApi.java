package com.factset.sdk.FactSetPrivateEquityandVentureCapital.api;

import com.factset.sdk.FactSetPrivateEquityandVentureCapital.ApiException;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.ApiClient;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.ApiResponse;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.Configuration;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.ErrorResponse;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.FundLimitedPartnersResponse;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.GPDetailsResponse;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.GPFundsResponse;
import java.time.LocalDate;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class GeneralAndLimitedPartnersApi {
  private ApiClient apiClient;

  public GeneralAndLimitedPartnersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GeneralAndLimitedPartnersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getFundLimitedPartnersResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFundLimitedPartnersResponseTypeMap.put(200, new GenericType<FundLimitedPartnersResponse>(){});
    getFundLimitedPartnersResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFundLimitedPartnersResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFundLimitedPartnersResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFundLimitedPartnersResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFundLimitedPartnersResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getGPResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getGPResponseTypeMap.put(200, new GenericType<GPDetailsResponse>(){});
    getGPResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getGPResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getGPResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getGPResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getGPResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getGPFundsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getGPFundsResponseTypeMap.put(200, new GenericType<GPFundsResponse>(){});
    getGPFundsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getGPFundsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getGPFundsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getGPFundsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getGPFundsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Retrieve the Limited Partners (LPs) and their capital commitments to specific funds.
   * Returns a list of **Limited Partners** (investors) associated with the specified funds, along with details of their **capital commitments** (investment amounts) and the **commit date**. This data is essential for understanding a fund&#39;s LP base.  Use the &#x60;/universe&#x60; endpoint and input the fund&#39;s name, setting the &#x60;entityType&#x60; to the most appropriate type (e.g., VEN, FAF, PVF).
   * @param ids A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint (required)
   * @return FundLimitedPartnersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public FundLimitedPartnersResponse getFundLimitedPartners(java.util.List<String> ids) throws ApiException {
    return getFundLimitedPartnersWithHttpInfo(ids).getData();
  }

  /**
   * Retrieve the Limited Partners (LPs) and their capital commitments to specific funds.
   * Returns a list of **Limited Partners** (investors) associated with the specified funds, along with details of their **capital commitments** (investment amounts) and the **commit date**. This data is essential for understanding a fund&#39;s LP base.  Use the &#x60;/universe&#x60; endpoint and input the fund&#39;s name, setting the &#x60;entityType&#x60; to the most appropriate type (e.g., VEN, FAF, PVF).
   * @param ids A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint (required)
   * @return ApiResponse&lt;FundLimitedPartnersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FundLimitedPartnersResponse> getFundLimitedPartnersWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getFundLimitedPartners");
    }
    
    // create path and map variables
    String localVarPath = "/limited-partners/funds";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "ids", ids));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        FundLimitedPartnersResponse
      
    > apiResponse = apiClient.invokeAPI("GeneralAndLimitedPartnersApi.getFundLimitedPartners", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFundLimitedPartnersResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve core profile and summary data for specified General Partner (GP) firms.
   * Retrieves the primary descriptive and profile information for one or more General Partner firms. This includes firm-level details such as the **Asset Under Management (AUM)** and a high-level overview of their **investment strategy** (e.g., target industry, geography).  Use the &#x60;/universe&#x60; endpoint and input the GP firm name, with &#x60;entityType&#x60; set to &#x60;HOL&#x60;. Only use &#x60;entityId&#x60; values whose &#x60;entityTypeCode&#x60; is &#x60;HOL&#x60; in your request.
   * @param ids A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **General Partner (GP) firms**. These IDs are used to identify the management companies of the funds. (required)
   * @param asOfDate The as-of date for the AUM data in **YYYY-MM-DD** format. Returns the AUM value as of the specified date.  Note:  - If omitted: The response will return the latest available AUM data. - Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @return GPDetailsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public GPDetailsResponse getGP(java.util.List<String> ids, LocalDate asOfDate) throws ApiException {
    return getGPWithHttpInfo(ids, asOfDate).getData();
  }

  /**
   * Retrieve core profile and summary data for specified General Partner (GP) firms.
   * Retrieves the primary descriptive and profile information for one or more General Partner firms. This includes firm-level details such as the **Asset Under Management (AUM)** and a high-level overview of their **investment strategy** (e.g., target industry, geography).  Use the &#x60;/universe&#x60; endpoint and input the GP firm name, with &#x60;entityType&#x60; set to &#x60;HOL&#x60;. Only use &#x60;entityId&#x60; values whose &#x60;entityTypeCode&#x60; is &#x60;HOL&#x60; in your request.
   * @param ids A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **General Partner (GP) firms**. These IDs are used to identify the management companies of the funds. (required)
   * @param asOfDate The as-of date for the AUM data in **YYYY-MM-DD** format. Returns the AUM value as of the specified date.  Note:  - If omitted: The response will return the latest available AUM data. - Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @return ApiResponse&lt;GPDetailsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GPDetailsResponse> getGPWithHttpInfo(java.util.List<String> ids, LocalDate asOfDate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getGP");
    }
    
    // create path and map variables
    String localVarPath = "/general-partners";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asOfDate", asOfDate));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        GPDetailsResponse
      
    > apiResponse = apiClient.invokeAPI("GeneralAndLimitedPartnersApi.getGP", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getGPResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Retrieve the list of all Private Equity and Venture Capital Funds managed by specified General Partners.
   * Returns a list of all Private Equity and Venture Capital funds that are actively or historically managed by the specified General Partner firms. This provides a complete view of a GP&#39;s fund vintage and strategy history.  Use the &#x60;/universe&#x60; endpoint and input the GP firm name, with &#x60;entityType&#x60; set to &#x60;HOL&#x60;. Only use &#x60;entityId&#x60; values whose &#x60;entityTypeCode&#x60; is &#x60;HOL&#x60; in your request.
   * @param ids A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **General Partner (GP) firms**. These IDs are used to identify the management companies of the funds. (required)
   * @return GPFundsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public GPFundsResponse getGPFunds(java.util.List<String> ids) throws ApiException {
    return getGPFundsWithHttpInfo(ids).getData();
  }

  /**
   * Retrieve the list of all Private Equity and Venture Capital Funds managed by specified General Partners.
   * Returns a list of all Private Equity and Venture Capital funds that are actively or historically managed by the specified General Partner firms. This provides a complete view of a GP&#39;s fund vintage and strategy history.  Use the &#x60;/universe&#x60; endpoint and input the GP firm name, with &#x60;entityType&#x60; set to &#x60;HOL&#x60;. Only use &#x60;entityId&#x60; values whose &#x60;entityTypeCode&#x60; is &#x60;HOL&#x60; in your request.
   * @param ids A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **General Partner (GP) firms**. These IDs are used to identify the management companies of the funds. (required)
   * @return ApiResponse&lt;GPFundsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GPFundsResponse> getGPFundsWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getGPFunds");
    }
    
    // create path and map variables
    String localVarPath = "/general-partners/funds";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "ids", ids));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        GPFundsResponse
      
    > apiResponse = apiClient.invokeAPI("GeneralAndLimitedPartnersApi.getGPFunds", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getGPFundsResponseTypeMap, false);

    return apiResponse;

  }
}
