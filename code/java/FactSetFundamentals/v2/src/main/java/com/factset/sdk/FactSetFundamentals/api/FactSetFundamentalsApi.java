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
import com.factset.sdk.FactSetFundamentals.models.FundamentalsRequest;
import com.factset.sdk.FactSetFundamentals.models.FundamentalsResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FactSetFundamentalsApi {
  private ApiClient apiClient;

  public FactSetFundamentalsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FactSetFundamentalsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getFdsFundamentalsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFdsFundamentalsForListResponseTypeMap.put(200, new GenericType<FundamentalsResponse>(){});
    getFdsFundamentalsForListResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    getFdsFundamentalsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getFdsFundamentalsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getFdsFundamentalsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getFdsFundamentalsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getFdsFundamentalsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  
 /**
   * Wrapper to support POST /fundamentals returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code FundamentalsResponse }<br>Fundamental data items</li>
   * 
   *   <li>202 : {@code BatchStatusResponse }<br>Batch request has been accepted.</li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetFdsFundamentalsForListResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     FundamentalsResponse data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     BatchStatusResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetFdsFundamentalsForListResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetFdsFundamentalsForListResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public FundamentalsResponse getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (FundamentalsResponse) this.response;
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
      GetFdsFundamentalsForListResponseWrapper other = (GetFdsFundamentalsForListResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetFdsFundamentalsForListResponseWrapper {\n"
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
   * Returns Company Fundamental Data.
   * Retrieves FactSet Fundamental standardized data for specified securities. Use the &#x60;&#x60;&#x60;/metrics&#x60;&#x60;&#x60; endpoint to retrieve a full list of valid metrics or data items.   The &#x60;&#x60;&#x60;/fundamentals&#x60;&#x60;&#x60; endpoint currently supports Long Running asynchronous requests up to **20 minutes** via batch parameter. Id limit is set to 5000 ids per request when using batch capability and 250 ids per request without batching (1 metric per ID, for 1 day in both the cases). This feature is available for all users. 
   * @param fundamentalsRequest Request object for requesting fundamentals data (required)
   * @return GetFdsFundamentalsForListResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fundamental data items </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - Path to Batch Request result. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public GetFdsFundamentalsForListResponseWrapper getFdsFundamentalsForList(FundamentalsRequest fundamentalsRequest) throws ApiException {
    return getFdsFundamentalsForListWithHttpInfo(fundamentalsRequest).getData();
  }

  /**
   * Returns Company Fundamental Data.
   * Retrieves FactSet Fundamental standardized data for specified securities. Use the &#x60;&#x60;&#x60;/metrics&#x60;&#x60;&#x60; endpoint to retrieve a full list of valid metrics or data items.   The &#x60;&#x60;&#x60;/fundamentals&#x60;&#x60;&#x60; endpoint currently supports Long Running asynchronous requests up to **20 minutes** via batch parameter. Id limit is set to 5000 ids per request when using batch capability and 250 ids per request without batching (1 metric per ID, for 1 day in both the cases). This feature is available for all users. 
   * @param fundamentalsRequest Request object for requesting fundamentals data (required)
   * @return ApiResponse&lt;GetFdsFundamentalsForListResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fundamental data items </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - Path to Batch Request result. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetFdsFundamentalsForListResponseWrapper> getFdsFundamentalsForListWithHttpInfo(FundamentalsRequest fundamentalsRequest) throws ApiException {
    Object localVarPostBody = fundamentalsRequest;
    
    // verify the required parameter 'fundamentalsRequest' is set
    if (fundamentalsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'fundamentalsRequest' when calling getFdsFundamentalsForList");
    }
    
    // create path and map variables
    String localVarPath = "/fundamentals";

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
        
      
    > apiResponse = apiClient.invokeAPI("FactSetFundamentalsApi.getFdsFundamentalsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFdsFundamentalsForListResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetFdsFundamentalsForListResponseWrapper responseWrapper = new GetFdsFundamentalsForListResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetFdsFundamentalsForListResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
}
