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

import com.factset.sdk.FactSetOwnership.models.Batch;
import com.factset.sdk.FactSetOwnership.models.BatchStatusResponse;
import com.factset.sdk.FactSetOwnership.models.ErrorResponse;
import com.factset.sdk.FactSetOwnership.models.OwnershipSummaryRequest;
import com.factset.sdk.FactSetOwnership.models.OwnershipSummaryResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CompanyReportsApi {
  private ApiClient apiClient;

  public CompanyReportsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CompanyReportsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getOwnershipCompanyReportsSummaryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOwnershipCompanyReportsSummaryResponseTypeMap.put(200, new GenericType<OwnershipSummaryResponse>(){});
    getOwnershipCompanyReportsSummaryResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    getOwnershipCompanyReportsSummaryResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getOwnershipCompanyReportsSummaryResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getOwnershipCompanyReportsSummaryResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getOwnershipCompanyReportsSummaryResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getOwnershipCompanyReportsSummaryResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> postOwnershipCompanyReportsSummaryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postOwnershipCompanyReportsSummaryResponseTypeMap.put(200, new GenericType<OwnershipSummaryResponse>(){});
    postOwnershipCompanyReportsSummaryResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    postOwnershipCompanyReportsSummaryResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    postOwnershipCompanyReportsSummaryResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    postOwnershipCompanyReportsSummaryResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    postOwnershipCompanyReportsSummaryResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    postOwnershipCompanyReportsSummaryResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  
 /**
   * Wrapper to support GET /company-reports/summary returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code OwnershipSummaryResponse }<br>Ownership Summary Response.</li>
   * 
   *   <li>202 : {@code BatchStatusResponse }<br>Batch request has been accepted.</li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetOwnershipCompanyReportsSummaryResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     OwnershipSummaryResponse data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     BatchStatusResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetOwnershipCompanyReportsSummaryResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetOwnershipCompanyReportsSummaryResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public OwnershipSummaryResponse getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (OwnershipSummaryResponse) this.response;
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
      GetOwnershipCompanyReportsSummaryResponseWrapper other = (GetOwnershipCompanyReportsSummaryResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetOwnershipCompanyReportsSummaryResponseWrapper {\n"
       + "    statusCode: " + statusCode + "\n"
       + "    response: "
       + Objects.toString(response).replace("\n", "\n    ")
       + "\n}";
    }
  }


 /**
   * Wrapper to support POST /company-reports/summary returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code OwnershipSummaryResponse }<br>Ownership Summary Response.</li>
   * 
   *   <li>202 : {@code BatchStatusResponse }<br>Batch request has been accepted.</li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * PostOwnershipCompanyReportsSummaryResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     OwnershipSummaryResponse data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     BatchStatusResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class PostOwnershipCompanyReportsSummaryResponseWrapper {
    public final int statusCode;
    public final Object response;

    public PostOwnershipCompanyReportsSummaryResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public OwnershipSummaryResponse getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (OwnershipSummaryResponse) this.response;
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
      PostOwnershipCompanyReportsSummaryResponseWrapper other = (PostOwnershipCompanyReportsSummaryResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class PostOwnershipCompanyReportsSummaryResponseWrapper {\n"
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
   * Get current only ownership summary data for a list of requested identifiers.
   * Get current only ownership summary data for a list of requested identifiers. 
   * @param ids Requested list of identifiers.  _**ids limit** &#x3D; 10 per request_ (required)
   * @param batch Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes.  When &#x60;batch&#x3D;Y&#x60;, the service will respond with an HTTP Status Code of 202.  Once a batch request is submitted, use batch status to see if the job has been completed.  Once completed, retrieve the results of the request via batch-result. When using Batch, ids     limit is increased to  1000 ids per request, though limits on query string via GET method still apply.  It&#39;s advised to submit large lists of ids via POST method.  (optional, default to N)
   * @return GetOwnershipCompanyReportsSummaryResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ownership Summary Response. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - Path to Batch Request status. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public GetOwnershipCompanyReportsSummaryResponseWrapper getOwnershipCompanyReportsSummary(java.util.List<String> ids, Batch batch) throws ApiException {
    return getOwnershipCompanyReportsSummaryWithHttpInfo(ids, batch).getData();
  }

  /**
   * Get current only ownership summary data for a list of requested identifiers.
   * Get current only ownership summary data for a list of requested identifiers. 
   * @param ids Requested list of identifiers.  _**ids limit** &#x3D; 10 per request_ (required)
   * @param batch Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes.  When &#x60;batch&#x3D;Y&#x60;, the service will respond with an HTTP Status Code of 202.  Once a batch request is submitted, use batch status to see if the job has been completed.  Once completed, retrieve the results of the request via batch-result. When using Batch, ids     limit is increased to  1000 ids per request, though limits on query string via GET method still apply.  It&#39;s advised to submit large lists of ids via POST method.  (optional, default to N)
   * @return ApiResponse&lt;GetOwnershipCompanyReportsSummaryResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ownership Summary Response. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - Path to Batch Request status. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetOwnershipCompanyReportsSummaryResponseWrapper> getOwnershipCompanyReportsSummaryWithHttpInfo(java.util.List<String> ids, Batch batch) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getOwnershipCompanyReportsSummary");
    }
    
    // create path and map variables
    String localVarPath = "/company-reports/summary";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "batch", batch));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        Object
        
      
    > apiResponse = apiClient.invokeAPI("CompanyReportsApi.getOwnershipCompanyReportsSummary", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOwnershipCompanyReportsSummaryResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetOwnershipCompanyReportsSummaryResponseWrapper responseWrapper = new GetOwnershipCompanyReportsSummaryResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetOwnershipCompanyReportsSummaryResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
  /**
   * Get current only ownership summary data for a list of requested identifiers.
   * Get current only ownership summary data for a list of requested identifiers.
   * @param ownershipSummaryRequest Requesting Ownership Summary Details (required)
   * @return PostOwnershipCompanyReportsSummaryResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ownership Summary Response. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - Path to Batch Request status. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public PostOwnershipCompanyReportsSummaryResponseWrapper postOwnershipCompanyReportsSummary(OwnershipSummaryRequest ownershipSummaryRequest) throws ApiException {
    return postOwnershipCompanyReportsSummaryWithHttpInfo(ownershipSummaryRequest).getData();
  }

  /**
   * Get current only ownership summary data for a list of requested identifiers.
   * Get current only ownership summary data for a list of requested identifiers.
   * @param ownershipSummaryRequest Requesting Ownership Summary Details (required)
   * @return ApiResponse&lt;PostOwnershipCompanyReportsSummaryResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ownership Summary Response. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - Path to Batch Request status. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PostOwnershipCompanyReportsSummaryResponseWrapper> postOwnershipCompanyReportsSummaryWithHttpInfo(OwnershipSummaryRequest ownershipSummaryRequest) throws ApiException {
    Object localVarPostBody = ownershipSummaryRequest;
    
    // verify the required parameter 'ownershipSummaryRequest' is set
    if (ownershipSummaryRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'ownershipSummaryRequest' when calling postOwnershipCompanyReportsSummary");
    }
    
    // create path and map variables
    String localVarPath = "/company-reports/summary";

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
        
      
    > apiResponse = apiClient.invokeAPI("CompanyReportsApi.postOwnershipCompanyReportsSummary", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postOwnershipCompanyReportsSummaryResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    PostOwnershipCompanyReportsSummaryResponseWrapper responseWrapper = new PostOwnershipCompanyReportsSummaryResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<PostOwnershipCompanyReportsSummaryResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
}
