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

import com.factset.sdk.FactSetSupplyChain.models.ErrorResponse;
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
  
  private static final Map<Integer, GenericType> getRelationshipsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRelationshipsResponseTypeMap.put(200, new GenericType<RelationshipsResponse>(){});
    getRelationshipsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getRelationshipsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getRelationshipsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getRelationshipsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getRelationshipsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getRelationshipsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getRelationshipsForListResponseTypeMap.put(200, new GenericType<RelationshipsResponse>(){});
    getRelationshipsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getRelationshipsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getRelationshipsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getRelationshipsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getRelationshipsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns Supply Chain Relationships Data.
   * Retrieves Supply Chain Relationship data (current only). Results are first sorted by the number of overlapping products between companies, then by the percentage of overlap. 
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 500  (required)
   * @param relationshipType  The category describing how the source company is connected to another organization. Use this parameter to filter results based on the business relationship type. Defined as:    * **SUPPLIERS** &#x3D; An organization that provides goods or services to the source company. The source company acts as the buyer in this relationship. (inverse of \&quot;Customer\&quot; relationships.)   * **COMPETITORS** &#x3D; An organization explicitly identified by the source company as a rival, usually operating in the same market or industry sector.   * **CUSTOMERS** &#x3D; An organization that receives goods or services from the source company. The source company acts as the seller in this relationship. (Reverse of \&quot;Supplier\&quot; relationships.)   * **PARTNERS** &#x3D; An organization in which the source company holds an ownership interest (i.e., the source company owns shares or equity in the partner). This is the counterpart to an investor relationship, where the external party has an ownership interest in the source company.  (required)
   * @param companyType Specifies the category of companies to include when filtering results:   * **PUBLIC_COMPANIES_ONLY**: Include only relationships involving companies that are publicly traded.            * **PRIVATE_COMPANIES_ONLY**: Include only relationships involving companies that are privately held (not publicly traded).            * **ALL**: Include relationships involving both public and private companies.  (optional, default to PUBLIC_COMPANIES_ONLY)
   * @param relationshipDirection Filters the list of available relationship directions -   * **ALL** &#x3D; Include both direct and reverse relationships.   * **DIRECT** &#x3D; Include only relationships where the source company identified and named the connection to the target company.   * **REVERSE** &#x3D; Include only relationships where the target company identified and named the connection to the source company.  (optional, default to ALL)
   * @return RelationshipsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fetches supply chain relationships data for the requested list of identifiers. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public RelationshipsResponse getRelationships(java.util.List<String> ids, String relationshipType, String companyType, String relationshipDirection) throws ApiException {
    return getRelationshipsWithHttpInfo(ids, relationshipType, companyType, relationshipDirection).getData();
  }

  /**
   * Returns Supply Chain Relationships Data.
   * Retrieves Supply Chain Relationship data (current only). Results are first sorted by the number of overlapping products between companies, then by the percentage of overlap. 
   * @param ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 500  (required)
   * @param relationshipType  The category describing how the source company is connected to another organization. Use this parameter to filter results based on the business relationship type. Defined as:    * **SUPPLIERS** &#x3D; An organization that provides goods or services to the source company. The source company acts as the buyer in this relationship. (inverse of \&quot;Customer\&quot; relationships.)   * **COMPETITORS** &#x3D; An organization explicitly identified by the source company as a rival, usually operating in the same market or industry sector.   * **CUSTOMERS** &#x3D; An organization that receives goods or services from the source company. The source company acts as the seller in this relationship. (Reverse of \&quot;Supplier\&quot; relationships.)   * **PARTNERS** &#x3D; An organization in which the source company holds an ownership interest (i.e., the source company owns shares or equity in the partner). This is the counterpart to an investor relationship, where the external party has an ownership interest in the source company.  (required)
   * @param companyType Specifies the category of companies to include when filtering results:   * **PUBLIC_COMPANIES_ONLY**: Include only relationships involving companies that are publicly traded.            * **PRIVATE_COMPANIES_ONLY**: Include only relationships involving companies that are privately held (not publicly traded).            * **ALL**: Include relationships involving both public and private companies.  (optional, default to PUBLIC_COMPANIES_ONLY)
   * @param relationshipDirection Filters the list of available relationship directions -   * **ALL** &#x3D; Include both direct and reverse relationships.   * **DIRECT** &#x3D; Include only relationships where the source company identified and named the connection to the target company.   * **REVERSE** &#x3D; Include only relationships where the target company identified and named the connection to the source company.  (optional, default to ALL)
   * @return ApiResponse&lt;RelationshipsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Fetches supply chain relationships data for the requested list of identifiers. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RelationshipsResponse> getRelationshipsWithHttpInfo(java.util.List<String> ids, String relationshipType, String companyType, String relationshipDirection) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getRelationships");
    }
    
    // verify the required parameter 'relationshipType' is set
    if (relationshipType == null) {
      throw new ApiException(400, "Missing the required parameter 'relationshipType' when calling getRelationships");
    }
    
    // create path and map variables
    String localVarPath = "/relationships";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "relationshipType", relationshipType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "companyType", companyType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "relationshipDirection", relationshipDirection));

    
    
    
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
      
    > apiResponse = apiClient.invokeAPI("RelationshipsApi.getRelationships", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRelationshipsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns Supply Chain Relationships Data.
   * Retrieves Supply Chain Relationship data (current only). Results are first sorted by the number of overlapping products between companies, then by the percentage of overlap. 
   * @param relationshipsRequest Request body to request a list of Supply Chain financials objects. (required)
   * @return RelationshipsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Supply Chain Relationships data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public RelationshipsResponse getRelationshipsForList(RelationshipsRequest relationshipsRequest) throws ApiException {
    return getRelationshipsForListWithHttpInfo(relationshipsRequest).getData();
  }

  /**
   * Returns Supply Chain Relationships Data.
   * Retrieves Supply Chain Relationship data (current only). Results are first sorted by the number of overlapping products between companies, then by the percentage of overlap. 
   * @param relationshipsRequest Request body to request a list of Supply Chain financials objects. (required)
   * @return ApiResponse&lt;RelationshipsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Supply Chain Relationships data items </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RelationshipsResponse> getRelationshipsForListWithHttpInfo(RelationshipsRequest relationshipsRequest) throws ApiException {
    Object localVarPostBody = relationshipsRequest;
    
    // verify the required parameter 'relationshipsRequest' is set
    if (relationshipsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'relationshipsRequest' when calling getRelationshipsForList");
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
      
    > apiResponse = apiClient.invokeAPI("RelationshipsApi.getRelationshipsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getRelationshipsForListResponseTypeMap, false);

    return apiResponse;

  }
}
