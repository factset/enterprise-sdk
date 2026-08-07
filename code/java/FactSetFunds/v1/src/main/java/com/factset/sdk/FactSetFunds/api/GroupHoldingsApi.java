package com.factset.sdk.FactSetFunds.api;

import com.factset.sdk.FactSetFunds.ApiException;
import com.factset.sdk.FactSetFunds.ApiClient;
import com.factset.sdk.FactSetFunds.ApiResponse;
import com.factset.sdk.FactSetFunds.Configuration;
import com.factset.sdk.FactSetFunds.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetFunds.models.BatchStatusResponse;
import com.factset.sdk.FactSetFunds.models.ErrorResponse;
import com.factset.sdk.FactSetFunds.models.GroupHoldingsRequest;
import com.factset.sdk.FactSetFunds.models.GroupHoldingsResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class GroupHoldingsApi {
  private ApiClient apiClient;

  public GroupHoldingsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GroupHoldingsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getGroupHoldingsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getGroupHoldingsResponseTypeMap.put(200, new GenericType<GroupHoldingsResponse>(){});
    getGroupHoldingsResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    getGroupHoldingsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getGroupHoldingsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getGroupHoldingsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getGroupHoldingsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getGroupHoldingsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getGroupHoldingsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getGroupHoldingsForListResponseTypeMap.put(200, new GenericType<GroupHoldingsResponse>(){});
    getGroupHoldingsForListResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    getGroupHoldingsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getGroupHoldingsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getGroupHoldingsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getGroupHoldingsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getGroupHoldingsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  
 /**
   * Wrapper to support GET /factset-funds/v1/holdings/group returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code GroupHoldingsResponse }<br>The Group Holdings response object.</li>
   * 
   *   <li>202 : {@code BatchStatusResponse }<br>Batch request has been accepted.</li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetGroupHoldingsResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     GroupHoldingsResponse data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     BatchStatusResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetGroupHoldingsResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetGroupHoldingsResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public GroupHoldingsResponse getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (GroupHoldingsResponse) this.response;
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
      GetGroupHoldingsResponseWrapper other = (GetGroupHoldingsResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetGroupHoldingsResponseWrapper {\n"
       + "    statusCode: " + statusCode + "\n"
       + "    response: "
       + Objects.toString(response).replace("\n", "\n    ")
       + "\n}";
    }
  }


 /**
   * Wrapper to support POST /factset-funds/v1/holdings/group returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code GroupHoldingsResponse }<br>The Group Holdings response object.</li>
   * 
   *   <li>202 : {@code BatchStatusResponse }<br>Batch request has been accepted.</li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetGroupHoldingsForListResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     GroupHoldingsResponse data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     BatchStatusResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetGroupHoldingsForListResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetGroupHoldingsForListResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public GroupHoldingsResponse getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (GroupHoldingsResponse) this.response;
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
      GetGroupHoldingsForListResponseWrapper other = (GetGroupHoldingsForListResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetGroupHoldingsForListResponseWrapper {\n"
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
   * Get group holdings for a specific date and group.
   * Retrieves the holding percentages for the group and funds specified. Available groups are:   * **ASSET** &#x3D; Asset Class   * **ASSETISTYP** &#x3D; Issue Type with Asset Class   * **CAPGRP** &#x3D; Cap Group   * **CNTRY** &#x3D; Country   * **EXCHANGE** &#x3D; Exchange   * **INDUSTRY** &#x3D; Industry   * **ISSUE_TYPE** &#x3D; Issue Type   * **REGION** &#x3D; Region   * **SECTOR** &#x3D; Sector   * **ULTPARENT** &#x3D; Ultimate Parent 
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs.  Request Limits:    - ids limit &#x3D; 1000 per request(Non batch)    - Batch requests:       * Single day: up to 1500 IDs per request       * Multi-day: up to 500 IDs per request   GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit, it is advised that large request payloads be sent using the respective POST method.  (required)
   * @param asOfDate As of date for historical group holdings in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional)
   * @param group Controls the group of the data returned.   * **ASSET** &#x3D; Asset Class   * **ASSETISTYP** &#x3D; Issue Type with Asset Class   * **CAPGRP** &#x3D; Cap Group   * **CNTRY** &#x3D; Country   * **EXCHANGE** &#x3D; Exchange   * **INDUSTRY** &#x3D; Industry   * **ISSUE_TYPE** &#x3D; Issue Type   * **REGION** &#x3D; Region   * **SECTOR** &#x3D; Sector   * **ULTPARENT** &#x3D; Ultimate Parent        (optional, default to CNTRY)
   * @param batch Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes. Upon requesting batch&#x3D;Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use batch status to see if the job has been completed. Once completed, retrieve the results of the request via batch-result.     (optional, default to N)
   * @return GetGroupHoldingsResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Group Holdings response object. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - Path to Batch Request result. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public GetGroupHoldingsResponseWrapper getGroupHoldings(java.util.List<String> ids, String asOfDate, String group, String batch) throws ApiException {
    return getGroupHoldingsWithHttpInfo(ids, asOfDate, group, batch).getData();
  }

  /**
   * Get group holdings for a specific date and group.
   * Retrieves the holding percentages for the group and funds specified. Available groups are:   * **ASSET** &#x3D; Asset Class   * **ASSETISTYP** &#x3D; Issue Type with Asset Class   * **CAPGRP** &#x3D; Cap Group   * **CNTRY** &#x3D; Country   * **EXCHANGE** &#x3D; Exchange   * **INDUSTRY** &#x3D; Industry   * **ISSUE_TYPE** &#x3D; Issue Type   * **REGION** &#x3D; Region   * **SECTOR** &#x3D; Sector   * **ULTPARENT** &#x3D; Ultimate Parent 
   * @param ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs.  Request Limits:    - ids limit &#x3D; 1000 per request(Non batch)    - Batch requests:       * Single day: up to 1500 IDs per request       * Multi-day: up to 500 IDs per request   GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit, it is advised that large request payloads be sent using the respective POST method.  (required)
   * @param asOfDate As of date for historical group holdings in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional)
   * @param group Controls the group of the data returned.   * **ASSET** &#x3D; Asset Class   * **ASSETISTYP** &#x3D; Issue Type with Asset Class   * **CAPGRP** &#x3D; Cap Group   * **CNTRY** &#x3D; Country   * **EXCHANGE** &#x3D; Exchange   * **INDUSTRY** &#x3D; Industry   * **ISSUE_TYPE** &#x3D; Issue Type   * **REGION** &#x3D; Region   * **SECTOR** &#x3D; Sector   * **ULTPARENT** &#x3D; Ultimate Parent        (optional, default to CNTRY)
   * @param batch Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes. Upon requesting batch&#x3D;Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use batch status to see if the job has been completed. Once completed, retrieve the results of the request via batch-result.     (optional, default to N)
   * @return ApiResponse&lt;GetGroupHoldingsResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Group Holdings response object. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - Path to Batch Request result. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetGroupHoldingsResponseWrapper> getGroupHoldingsWithHttpInfo(java.util.List<String> ids, String asOfDate, String group, String batch) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getGroupHoldings");
    }
    
    // create path and map variables
    String localVarPath = "/factset-funds/v1/holdings/group";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asOfDate", asOfDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group", group));
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
        
      
    > apiResponse = apiClient.invokeAPI("GroupHoldingsApi.getGroupHoldings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getGroupHoldingsResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetGroupHoldingsResponseWrapper responseWrapper = new GetGroupHoldingsResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetGroupHoldingsResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
  /**
   * Get group holdings for a specific date and group.
   * Retrieves the holding percentages for the group and funds specified. Available groups are:   * **ASSET** &#x3D; Asset Class   * **ASSETISTYP** &#x3D; Issue Type with Asset Class   * **CAPGRP** &#x3D; Cap Group   * **CNTRY** &#x3D; Country   * **EXCHANGE** &#x3D; Exchange   * **INDUSTRY** &#x3D; Industry   * **ISSUE_TYPE** &#x3D; Issue Type   * **REGION** &#x3D; Region   * **SECTOR** &#x3D; Sector   * **ULTPARENT** &#x3D; Ultimate Parent 
   * @param groupHoldingsRequest The Group Holdings request body, allowing the user to specify a list of ids, date, and group. (required)
   * @return GetGroupHoldingsForListResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Group Holdings response object. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - Path to Batch Request result. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public GetGroupHoldingsForListResponseWrapper getGroupHoldingsForList(GroupHoldingsRequest groupHoldingsRequest) throws ApiException {
    return getGroupHoldingsForListWithHttpInfo(groupHoldingsRequest).getData();
  }

  /**
   * Get group holdings for a specific date and group.
   * Retrieves the holding percentages for the group and funds specified. Available groups are:   * **ASSET** &#x3D; Asset Class   * **ASSETISTYP** &#x3D; Issue Type with Asset Class   * **CAPGRP** &#x3D; Cap Group   * **CNTRY** &#x3D; Country   * **EXCHANGE** &#x3D; Exchange   * **INDUSTRY** &#x3D; Industry   * **ISSUE_TYPE** &#x3D; Issue Type   * **REGION** &#x3D; Region   * **SECTOR** &#x3D; Sector   * **ULTPARENT** &#x3D; Ultimate Parent 
   * @param groupHoldingsRequest The Group Holdings request body, allowing the user to specify a list of ids, date, and group. (required)
   * @return ApiResponse&lt;GetGroupHoldingsForListResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Group Holdings response object. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - Path to Batch Request result. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetGroupHoldingsForListResponseWrapper> getGroupHoldingsForListWithHttpInfo(GroupHoldingsRequest groupHoldingsRequest) throws ApiException {
    Object localVarPostBody = groupHoldingsRequest;
    
    // verify the required parameter 'groupHoldingsRequest' is set
    if (groupHoldingsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'groupHoldingsRequest' when calling getGroupHoldingsForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-funds/v1/holdings/group";

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
        
      
    > apiResponse = apiClient.invokeAPI("GroupHoldingsApi.getGroupHoldingsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getGroupHoldingsForListResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetGroupHoldingsForListResponseWrapper responseWrapper = new GetGroupHoldingsForListResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetGroupHoldingsForListResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
}
