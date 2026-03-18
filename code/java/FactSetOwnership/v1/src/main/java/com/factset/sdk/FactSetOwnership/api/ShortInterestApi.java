package com.factset.sdk.FactSetOwnership.api;

import com.factset.sdk.FactSetOwnership.ApiException;
import com.factset.sdk.FactSetOwnership.ApiClient;
import com.factset.sdk.FactSetOwnership.ApiResponse;
import com.factset.sdk.FactSetOwnership.Configuration;
import com.factset.sdk.FactSetOwnership.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetOwnership.models.ErrorResponse;
import com.factset.sdk.FactSetOwnership.models.ShortInterestRequest;
import com.factset.sdk.FactSetOwnership.models.ShortInterestResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ShortInterestApi {
  private ApiClient apiClient;

  public ShortInterestApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ShortInterestApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getShortInterestResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getShortInterestResponseTypeMap.put(200, new GenericType<ShortInterestResponse>(){});
    getShortInterestResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getShortInterestResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getShortInterestResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getShortInterestResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getShortInterestResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postShortInterestResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postShortInterestResponseTypeMap.put(200, new GenericType<ShortInterestResponse>(){});
    postShortInterestResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    postShortInterestResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    postShortInterestResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    postShortInterestResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    postShortInterestResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Gets short interest data for a requested identifier.
   * Returns short interest data for the specified security, sourced from NYSE, NASDAQ, and TSX exchanges via FactSet. Data is updated semi-monthly on scheduled dates and times in Eastern Time (ET). Note that the exact update dates may vary slightly due to weekends, market holidays, and other calendar adjustments. If the &#x60;years&#x60; parameter is provided, the short interest percentage and float percentage value will be returned as null, since historical data for this value is not available.
   * @param ids Requested short interest identifier. &lt;p&gt;***id limit** &#x3D;  1 per request*&lt;/p&gt; (required)
   * @param years Number of years of short interest data to include. Specify an integer value from 1 to 10. If the years parameter is provided, the short interest percentage and short interest float percentage will be returned as null, since historical data for this value is not available. (optional)
   * @return ShortInterestResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Short Interest Response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ShortInterestResponse getShortInterest(java.util.List<String> ids, Integer years) throws ApiException {
    return getShortInterestWithHttpInfo(ids, years).getData();
  }

  /**
   * Gets short interest data for a requested identifier.
   * Returns short interest data for the specified security, sourced from NYSE, NASDAQ, and TSX exchanges via FactSet. Data is updated semi-monthly on scheduled dates and times in Eastern Time (ET). Note that the exact update dates may vary slightly due to weekends, market holidays, and other calendar adjustments. If the &#x60;years&#x60; parameter is provided, the short interest percentage and float percentage value will be returned as null, since historical data for this value is not available.
   * @param ids Requested short interest identifier. &lt;p&gt;***id limit** &#x3D;  1 per request*&lt;/p&gt; (required)
   * @param years Number of years of short interest data to include. Specify an integer value from 1 to 10. If the years parameter is provided, the short interest percentage and short interest float percentage will be returned as null, since historical data for this value is not available. (optional)
   * @return ApiResponse&lt;ShortInterestResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Short Interest Response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ShortInterestResponse> getShortInterestWithHttpInfo(java.util.List<String> ids, Integer years) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getShortInterest");
    }
    
    // create path and map variables
    String localVarPath = "/short-interest";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "years", years));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ShortInterestResponse
      
    > apiResponse = apiClient.invokeAPI("ShortInterestApi.getShortInterest", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getShortInterestResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Gets short interest data for a requested identifier.
   * Returns short interest data for the specified security, sourced from NYSE, NASDAQ, and TSX exchanges via FactSet. Data is updated semi-monthly on scheduled dates and times in Eastern Time (ET). Note that the exact update dates may vary slightly due to weekends, market holidays, and other calendar adjustments. If the &#x60;years&#x60; parameter is provided, the short interest percentage and float percentage value will be returned as null, since historical data for this value is not available.
   * @param shortInterestRequest Requesting short interest data for securities. (required)
   * @return ShortInterestResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Short Interest Response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ShortInterestResponse postShortInterest(ShortInterestRequest shortInterestRequest) throws ApiException {
    return postShortInterestWithHttpInfo(shortInterestRequest).getData();
  }

  /**
   * Gets short interest data for a requested identifier.
   * Returns short interest data for the specified security, sourced from NYSE, NASDAQ, and TSX exchanges via FactSet. Data is updated semi-monthly on scheduled dates and times in Eastern Time (ET). Note that the exact update dates may vary slightly due to weekends, market holidays, and other calendar adjustments. If the &#x60;years&#x60; parameter is provided, the short interest percentage and float percentage value will be returned as null, since historical data for this value is not available.
   * @param shortInterestRequest Requesting short interest data for securities. (required)
   * @return ApiResponse&lt;ShortInterestResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Short Interest Response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ShortInterestResponse> postShortInterestWithHttpInfo(ShortInterestRequest shortInterestRequest) throws ApiException {
    Object localVarPostBody = shortInterestRequest;
    
    // verify the required parameter 'shortInterestRequest' is set
    if (shortInterestRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'shortInterestRequest' when calling postShortInterest");
    }
    
    // create path and map variables
    String localVarPath = "/short-interest";

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
        
        ShortInterestResponse
      
    > apiResponse = apiClient.invokeAPI("ShortInterestApi.postShortInterest", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postShortInterestResponseTypeMap, false);

    return apiResponse;

  }
}
