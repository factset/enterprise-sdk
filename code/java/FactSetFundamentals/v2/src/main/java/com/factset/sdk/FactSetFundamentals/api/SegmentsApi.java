package com.factset.sdk.FactSetFundamentals.api;

import com.factset.sdk.FactSetFundamentals.ApiException;
import com.factset.sdk.FactSetFundamentals.ApiClient;
import com.factset.sdk.FactSetFundamentals.ApiResponse;
import com.factset.sdk.FactSetFundamentals.Configuration;
import com.factset.sdk.FactSetFundamentals.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetFundamentals.models.BatchStatusResponse;
import com.factset.sdk.FactSetFundamentals.models.ErrorResponse;
import com.factset.sdk.FactSetFundamentals.models.SegmentsRequest;
import com.factset.sdk.FactSetFundamentals.models.SegmentsResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SegmentsApi {
  private ApiClient apiClient;

  public SegmentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SegmentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getFdsSegmentsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFdsSegmentsForListResponseTypeMap.put(200, new GenericType<SegmentsResponse>(){});
    getFdsSegmentsForListResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    getFdsSegmentsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFdsSegmentsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFdsSegmentsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFdsSegmentsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFdsSegmentsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  
 /**
   * Wrapper to support POST /segments returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code SegmentsResponse }<br>Segment data items</li>
   * 
   *   <li>202 : {@code BatchStatusResponse }<br>Batch request has been accepted.</li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetFdsSegmentsForListResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     SegmentsResponse data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     BatchStatusResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetFdsSegmentsForListResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetFdsSegmentsForListResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public SegmentsResponse getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (SegmentsResponse) this.response;
    }
    
    public BatchStatusResponse getResponse202() throws ApiException {
      if (this.statusCode != 202) {
        throw new ApiException(500, "Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
      }
      return (BatchStatusResponse) this.response;
    }
    

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      GetFdsSegmentsForListResponseWrapper other = (GetFdsSegmentsForListResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetFdsSegmentsForListResponseWrapper {\n"
       + "    statusCode: " + statusCode + "\n"
       + "    response: "
       + Objects.toString(response).replace("\n", "\n    ")
       + "\n}";
    }
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
   * Returns Company Segment Data.
   * Retrieves Sales Metrics data for specified companies.  The &#x60;&#x60;&#x60;/segments&#x60;&#x60;&#x60; endpoint currently supports Long Running asynchronous requests up to **20 minutes** via batch parameter. Id limits are increased to 30000 ids per request when using batch capability.This 30000 id limit has been derived based on single metric for one day. This feature is available for all users. 
   * @param segmentsRequest Request object for requesting segments data (required)
   * @return GetFdsSegmentsForListResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Segment data items </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - Path to Batch Request result. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public GetFdsSegmentsForListResponseWrapper getFdsSegmentsForList(SegmentsRequest segmentsRequest) throws ApiException {
    return getFdsSegmentsForListWithHttpInfo(segmentsRequest).getData();
  }

  /**
   * Returns Company Segment Data.
   * Retrieves Sales Metrics data for specified companies.  The &#x60;&#x60;&#x60;/segments&#x60;&#x60;&#x60; endpoint currently supports Long Running asynchronous requests up to **20 minutes** via batch parameter. Id limits are increased to 30000 ids per request when using batch capability.This 30000 id limit has been derived based on single metric for one day. This feature is available for all users. 
   * @param segmentsRequest Request object for requesting segments data (required)
   * @return ApiResponse&lt;GetFdsSegmentsForListResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Segment data items </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - Path to Batch Request result. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetFdsSegmentsForListResponseWrapper> getFdsSegmentsForListWithHttpInfo(SegmentsRequest segmentsRequest) throws ApiException {
    Object localVarPostBody = segmentsRequest;
    
    // verify the required parameter 'segmentsRequest' is set
    if (segmentsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'segmentsRequest' when calling getFdsSegmentsForList");
    }
    
    // create path and map variables
    String localVarPath = "/segments";

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
        Object
        
      
    > apiResponse = apiClient.invokeAPI("SegmentsApi.getFdsSegmentsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFdsSegmentsForListResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetFdsSegmentsForListResponseWrapper responseWrapper = new GetFdsSegmentsForListResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetFdsSegmentsForListResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
}
