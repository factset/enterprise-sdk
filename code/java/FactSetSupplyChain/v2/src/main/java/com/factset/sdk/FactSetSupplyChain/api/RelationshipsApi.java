package com.factset.sdk.FactSetSupplyChain.api;

import com.factset.sdk.FactSetSupplyChain.ApiException;
import com.factset.sdk.FactSetSupplyChain.ApiClient;
import com.factset.sdk.FactSetSupplyChain.ApiResponse;
import com.factset.sdk.FactSetSupplyChain.Configuration;
import com.factset.sdk.FactSetSupplyChain.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetSupplyChain.models.Batch;
import com.factset.sdk.FactSetSupplyChain.models.ErrorResponse;
import java.time.LocalDate;
import com.factset.sdk.FactSetSupplyChain.models.RelationshipTypeEnum;
import com.factset.sdk.FactSetSupplyChain.models.RelationshipsFieldsEnum;
import com.factset.sdk.FactSetSupplyChain.models.RelationshipsRequest;
import com.factset.sdk.FactSetSupplyChain.models.RelationshipsResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RelationshipsApi {
  private ApiClient apiClient;

  public RelationshipsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RelationshipsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> listRelationshipsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    listRelationshipsResponseTypeMap.put(200, new GenericType<RelationshipsResponse>(){});
    listRelationshipsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    listRelationshipsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    listRelationshipsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    listRelationshipsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    listRelationshipsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    listRelationshipsResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    listRelationshipsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> listRelationshipsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    listRelationshipsForListResponseTypeMap.put(200, new GenericType<RelationshipsResponse>(){});
    listRelationshipsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    listRelationshipsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    listRelationshipsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    listRelationshipsForListResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    listRelationshipsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    listRelationshipsForListResponseTypeMap.put(422, new GenericType<ErrorResponse>(){});
    listRelationshipsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Get competitor or partner relationships for requested entities.
   * Retrieve competitor or partner relationships for the requested entity or entities.  Use the &#x60;relationshipType&#x60; parameter to select one or more relationship types.  Historical data can be accessed only with the Historical product subscription. If the product is not subscribed, data for the latest available period will be returned. 
   * @param ids The requested identifier. FactSet identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs.&lt;p&gt;&lt;strong&gt;IDs limit&lt;/strong&gt; &#x3D; 20 per non-batch request and 1000 per batch request.&lt;/p&gt;&lt;p&gt;Make note, &lt;strong&gt;GET&lt;/strong&gt; Method URL request lines are also limited to a total length of 8192 bytes (8 KB). In cases where the service allows for large numbers of IDs, which may lead to exceeding this request line limit of 8 KB, it is advised that requests with large request lines be made through the respective &lt;strong&gt;POST&lt;/strong&gt; method.&lt;/p&gt; (required)
   * @param relationshipType Controls the relationship types returned in the response. Multiple relationship types can be selected simultaneously.    * **COMPETITOR** &#x3D; Returns entities disclosed by the source company as competitors or rivals.    * **ALL_PARTNERS** &#x3D; Returns all available partner relationship types in a single response.    * **PARTNER_DISTRIBUTION** &#x3D; Returns distribution partnership relationships.    * **PARTNER_EQUITY_INVESTMENT** &#x3D; Returns equity investment partnership relationships.    * **PARTNER_INTEGRATED_PRODUCT_OFFERING** &#x3D; Returns integrated product offering partnerships.    * **PARTNER_INVESTORS** &#x3D; Returns investor-related partnership relationships.    * **PARTNER_JOINT_VENTURE** &#x3D; Returns joint venture partnership relationships.    * **PARTNER_IN_LICENSING** &#x3D; Returns in-licensing partnership relationships.    * **PARTNER_OUT_LICENSING** &#x3D; Returns out-licensing partnership relationships.    * **PARTNER_MANUFACTURING** &#x3D; Returns manufacturing partnership relationships.    * **PARTNER_MARKETING** &#x3D; Returns marketing partnership relationships.    * **PARTNER_RESEARCH_COLLABORATION** &#x3D; Returns research collaboration partnership relationships. (optional, default to [\&quot;COMPETITOR\&quot;])
   * @param date The date requested in YYYY-MM-DD format. If left blank, the API will default to the most recent available data. Future dates (T+1) are not accepted in this endpoint. (optional)
   * @param fields A specific set of attributes to return in the response. If omitted, all fields are returned.  (optional)
   * @param batch Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes. Upon requesting batch&#x3D;Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use the corresponding &#x60;/batch-status&#x60; endpoint to see if the job has been completed. Once completed, retrieve the results of the request via the &#x60;/batch-result&#x60; endpoint.  (optional, default to N)
   * @param paginationLimit Specifies the number of results to return per page. (optional, default to 5)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @return RelationshipsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Relationships response object. The schema of each item in the &#x60;data&#x60; array depends on the &#x60;relationshipType&#x60; parameter. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public RelationshipsResponse listRelationships(java.util.List<String> ids, java.util.List<RelationshipTypeEnum> relationshipType, LocalDate date, java.util.Set<RelationshipsFieldsEnum> fields, Batch batch, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return listRelationshipsWithHttpInfo(ids, relationshipType, date, fields, batch, paginationLimit, paginationOffset).getData();
  }

  /**
   * Get competitor or partner relationships for requested entities.
   * Retrieve competitor or partner relationships for the requested entity or entities.  Use the &#x60;relationshipType&#x60; parameter to select one or more relationship types.  Historical data can be accessed only with the Historical product subscription. If the product is not subscribed, data for the latest available period will be returned. 
   * @param ids The requested identifier. FactSet identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs.&lt;p&gt;&lt;strong&gt;IDs limit&lt;/strong&gt; &#x3D; 20 per non-batch request and 1000 per batch request.&lt;/p&gt;&lt;p&gt;Make note, &lt;strong&gt;GET&lt;/strong&gt; Method URL request lines are also limited to a total length of 8192 bytes (8 KB). In cases where the service allows for large numbers of IDs, which may lead to exceeding this request line limit of 8 KB, it is advised that requests with large request lines be made through the respective &lt;strong&gt;POST&lt;/strong&gt; method.&lt;/p&gt; (required)
   * @param relationshipType Controls the relationship types returned in the response. Multiple relationship types can be selected simultaneously.    * **COMPETITOR** &#x3D; Returns entities disclosed by the source company as competitors or rivals.    * **ALL_PARTNERS** &#x3D; Returns all available partner relationship types in a single response.    * **PARTNER_DISTRIBUTION** &#x3D; Returns distribution partnership relationships.    * **PARTNER_EQUITY_INVESTMENT** &#x3D; Returns equity investment partnership relationships.    * **PARTNER_INTEGRATED_PRODUCT_OFFERING** &#x3D; Returns integrated product offering partnerships.    * **PARTNER_INVESTORS** &#x3D; Returns investor-related partnership relationships.    * **PARTNER_JOINT_VENTURE** &#x3D; Returns joint venture partnership relationships.    * **PARTNER_IN_LICENSING** &#x3D; Returns in-licensing partnership relationships.    * **PARTNER_OUT_LICENSING** &#x3D; Returns out-licensing partnership relationships.    * **PARTNER_MANUFACTURING** &#x3D; Returns manufacturing partnership relationships.    * **PARTNER_MARKETING** &#x3D; Returns marketing partnership relationships.    * **PARTNER_RESEARCH_COLLABORATION** &#x3D; Returns research collaboration partnership relationships. (optional, default to [\&quot;COMPETITOR\&quot;])
   * @param date The date requested in YYYY-MM-DD format. If left blank, the API will default to the most recent available data. Future dates (T+1) are not accepted in this endpoint. (optional)
   * @param fields A specific set of attributes to return in the response. If omitted, all fields are returned.  (optional)
   * @param batch Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes. Upon requesting batch&#x3D;Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use the corresponding &#x60;/batch-status&#x60; endpoint to see if the job has been completed. Once completed, retrieve the results of the request via the &#x60;/batch-result&#x60; endpoint.  (optional, default to N)
   * @param paginationLimit Specifies the number of results to return per page. (optional, default to 5)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)
   * @return ApiResponse&lt;RelationshipsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Relationships response object. The schema of each item in the &#x60;data&#x60; array depends on the &#x60;relationshipType&#x60; parameter. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RelationshipsResponse> listRelationshipsWithHttpInfo(java.util.List<String> ids, java.util.List<RelationshipTypeEnum> relationshipType, LocalDate date, java.util.Set<RelationshipsFieldsEnum> fields, Batch batch, Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling listRelationships");
    }
    
    // create path and map variables
    String localVarPath = "/relationships";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "relationshipType", relationshipType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields", fields));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "batch", batch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        RelationshipsResponse
      
    > apiResponse = apiClient.invokeAPI("RelationshipsApi.listRelationships", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, listRelationshipsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get competitor or partner relationships for a large list of entity IDs.
   * Retrieve competitor or partner relationships for the requested entity or entities.  Use the &#x60;relationshipType&#x60; parameter to select one or more relationship types.  Historical data can be accessed only with the Historical product subscription. If the product is not subscribed, data for the latest available period will be returned. 
   * @param relationshipsRequest The Relationships request body, allowing the user to specify a list of IDs and relationship type. (required)
   * @return RelationshipsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Relationships response object. The schema of each item in the &#x60;data&#x60; array depends on the &#x60;relationshipType&#x60; parameter. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public RelationshipsResponse listRelationshipsForList(RelationshipsRequest relationshipsRequest) throws ApiException {
    return listRelationshipsForListWithHttpInfo(relationshipsRequest).getData();
  }

  /**
   * Get competitor or partner relationships for a large list of entity IDs.
   * Retrieve competitor or partner relationships for the requested entity or entities.  Use the &#x60;relationshipType&#x60; parameter to select one or more relationship types.  Historical data can be accessed only with the Historical product subscription. If the product is not subscribed, data for the latest available period will be returned. 
   * @param relationshipsRequest The Relationships request body, allowing the user to specify a list of IDs and relationship type. (required)
   * @return ApiResponse&lt;RelationshipsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The Relationships response object. The schema of each item in the &#x60;data&#x60; array depends on the &#x60;relationshipType&#x60; parameter. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RelationshipsResponse> listRelationshipsForListWithHttpInfo(RelationshipsRequest relationshipsRequest) throws ApiException {
    Object localVarPostBody = relationshipsRequest;
    
    // verify the required parameter 'relationshipsRequest' is set
    if (relationshipsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'relationshipsRequest' when calling listRelationshipsForList");
    }
    
    // create path and map variables
    String localVarPath = "/relationships";

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
        
        RelationshipsResponse
      
    > apiResponse = apiClient.invokeAPI("RelationshipsApi.listRelationshipsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, listRelationshipsForListResponseTypeMap, false);

    return apiResponse;

  }
}
