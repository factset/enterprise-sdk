package com.factset.sdk.FactSetPeople.api;

import com.factset.sdk.FactSetPeople.ApiException;
import com.factset.sdk.FactSetPeople.ApiClient;
import com.factset.sdk.FactSetPeople.ApiResponse;
import com.factset.sdk.FactSetPeople.Configuration;
import com.factset.sdk.FactSetPeople.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetPeople.models.CompanyCompensationRequest;
import com.factset.sdk.FactSetPeople.models.CompanyCompensationResponse;
import com.factset.sdk.FactSetPeople.models.CompanyPeopleRequest;
import com.factset.sdk.FactSetPeople.models.CompanyPeopleResponse;
import com.factset.sdk.FactSetPeople.models.CompanyPositionsRequest;
import com.factset.sdk.FactSetPeople.models.CompanyPositionsResponse;
import com.factset.sdk.FactSetPeople.models.CompanyStatsRequest;
import com.factset.sdk.FactSetPeople.models.CompanyStatsResponse;
import com.factset.sdk.FactSetPeople.models.ErrorResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CompanyApi {
  private ApiClient apiClient;

  public CompanyApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CompanyApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getCompanyCompensationResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCompanyCompensationResponseTypeMap.put(200, new GenericType<CompanyCompensationResponse>(){});
    getCompanyCompensationResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getCompanyCompensationResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getCompanyCompensationResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getCompanyCompensationResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getCompanyCompensationResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getCompanyCompensationForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCompanyCompensationForListResponseTypeMap.put(200, new GenericType<CompanyCompensationResponse>(){});
    getCompanyCompensationForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getCompanyCompensationForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getCompanyCompensationForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getCompanyCompensationForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getCompanyCompensationForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getCompanyPeopleResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCompanyPeopleResponseTypeMap.put(200, new GenericType<CompanyPeopleResponse>(){});
    getCompanyPeopleResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getCompanyPeopleResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getCompanyPeopleResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getCompanyPeopleResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getCompanyPeopleResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getCompanyPeopleForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCompanyPeopleForListResponseTypeMap.put(200, new GenericType<CompanyPeopleResponse>(){});
    getCompanyPeopleForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getCompanyPeopleForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getCompanyPeopleForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getCompanyPeopleForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getCompanyPeopleForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getCompanyPositionsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCompanyPositionsResponseTypeMap.put(200, new GenericType<CompanyPositionsResponse>(){});
    getCompanyPositionsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getCompanyPositionsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getCompanyPositionsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getCompanyPositionsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getCompanyPositionsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getCompanyPositionsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCompanyPositionsForListResponseTypeMap.put(200, new GenericType<CompanyPositionsResponse>(){});
    getCompanyPositionsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getCompanyPositionsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getCompanyPositionsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getCompanyPositionsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getCompanyPositionsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getCompanyStatsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCompanyStatsResponseTypeMap.put(200, new GenericType<CompanyStatsResponse>(){});
    getCompanyStatsResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getCompanyStatsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getCompanyStatsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getCompanyStatsResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getCompanyStatsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getCompanyStatsForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCompanyStatsForListResponseTypeMap.put(200, new GenericType<CompanyStatsResponse>(){});
    getCompanyStatsForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getCompanyStatsForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getCompanyStatsForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getCompanyStatsForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getCompanyStatsForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns the compensation details of the people for the specified company identifier
   * Returns the list of company-level executive compensation data items for the top executives listed in annual filings.The coverage of the compensation details for the executives are limited to US region. All the compensation figures are expressed in raw units.  
   * @param ids The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @return CompanyCompensationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Company Compensation objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public CompanyCompensationResponse getCompanyCompensation(java.util.List<String> ids) throws ApiException {
    return getCompanyCompensationWithHttpInfo(ids).getData();
  }

  /**
   * Returns the compensation details of the people for the specified company identifier
   * Returns the list of company-level executive compensation data items for the top executives listed in annual filings.The coverage of the compensation details for the executives are limited to US region. All the compensation figures are expressed in raw units.  
   * @param ids The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @return ApiResponse&lt;CompanyCompensationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Company Compensation objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CompanyCompensationResponse> getCompanyCompensationWithHttpInfo(java.util.List<String> ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getCompanyCompensation");
    }
    
    // create path and map variables
    String localVarPath = "/factset-people/v1/company-compensation";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        CompanyCompensationResponse
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.getCompanyCompensation", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCompanyCompensationResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the compensation details for the people for the specified company identifier
   * Returns the list of company-level executive compensation data items for the top executives listed in annual filings for the most recent fiscal year. The coverage of the compensation details for the executives are limited to US region. All the compensation figures are expressed in raw units.  
   * @param companyCompensationRequest  (required)
   * @return CompanyCompensationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Company Positions objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public CompanyCompensationResponse getCompanyCompensationForList(CompanyCompensationRequest companyCompensationRequest) throws ApiException {
    return getCompanyCompensationForListWithHttpInfo(companyCompensationRequest).getData();
  }

  /**
   * Returns the compensation details for the people for the specified company identifier
   * Returns the list of company-level executive compensation data items for the top executives listed in annual filings for the most recent fiscal year. The coverage of the compensation details for the executives are limited to US region. All the compensation figures are expressed in raw units.  
   * @param companyCompensationRequest  (required)
   * @return ApiResponse&lt;CompanyCompensationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Company Positions objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CompanyCompensationResponse> getCompanyCompensationForListWithHttpInfo(CompanyCompensationRequest companyCompensationRequest) throws ApiException {
    Object localVarPostBody = companyCompensationRequest;
    
    // verify the required parameter 'companyCompensationRequest' is set
    if (companyCompensationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'companyCompensationRequest' when calling getCompanyCompensationForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-people/v1/company-compensation";

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
        
        CompanyCompensationResponse
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.getCompanyCompensationForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCompanyCompensationForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the list of people for the specified company identifiers
   * Returns the list of executives associated the company identifier requested. Information includes the job functions, email, phone, title, name, and FactSet Entity Identifier. The personId returned can then be used in the &#x60;/profiles&#x60; endpoint to learn more about the given person. 
   * @param ids The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param function Controls the types of people returned based on high-level job functions. Filter by -    |function|description|   |---|---|   |PEOPLE|Retrieve **ALL** Executives of a requested company|   |OFFICER|Retrieve only the Officers of a requested company|   |DIRECTOR|Retrieve only the Directors of a requested company|  (optional, default to PEOPLE)
   * @return CompanyPeopleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Company People objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public CompanyPeopleResponse getCompanyPeople(java.util.List<String> ids, String function) throws ApiException {
    return getCompanyPeopleWithHttpInfo(ids, function).getData();
  }

  /**
   * Returns the list of people for the specified company identifiers
   * Returns the list of executives associated the company identifier requested. Information includes the job functions, email, phone, title, name, and FactSet Entity Identifier. The personId returned can then be used in the &#x60;/profiles&#x60; endpoint to learn more about the given person. 
   * @param ids The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param function Controls the types of people returned based on high-level job functions. Filter by -    |function|description|   |---|---|   |PEOPLE|Retrieve **ALL** Executives of a requested company|   |OFFICER|Retrieve only the Officers of a requested company|   |DIRECTOR|Retrieve only the Directors of a requested company|  (optional, default to PEOPLE)
   * @return ApiResponse&lt;CompanyPeopleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Company People objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CompanyPeopleResponse> getCompanyPeopleWithHttpInfo(java.util.List<String> ids, String function) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getCompanyPeople");
    }
    
    // create path and map variables
    String localVarPath = "/factset-people/v1/company-people";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "function", function));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        CompanyPeopleResponse
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.getCompanyPeople", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCompanyPeopleResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the list of people associated for a large list of company identitifers
   * Returns the list of executives associated the company identifier requested. Information includes the job functions, email, phone, title, name, and FactSet Entity Identifier. The personId returned can then be used in the /profiles endpoint to learn more about the given person. 
   * @param companyPeopleRequest  (required)
   * @return CompanyPeopleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Company People objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public CompanyPeopleResponse getCompanyPeopleForList(CompanyPeopleRequest companyPeopleRequest) throws ApiException {
    return getCompanyPeopleForListWithHttpInfo(companyPeopleRequest).getData();
  }

  /**
   * Returns the list of people associated for a large list of company identitifers
   * Returns the list of executives associated the company identifier requested. Information includes the job functions, email, phone, title, name, and FactSet Entity Identifier. The personId returned can then be used in the /profiles endpoint to learn more about the given person. 
   * @param companyPeopleRequest  (required)
   * @return ApiResponse&lt;CompanyPeopleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Company People objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CompanyPeopleResponse> getCompanyPeopleForListWithHttpInfo(CompanyPeopleRequest companyPeopleRequest) throws ApiException {
    Object localVarPostBody = companyPeopleRequest;
    
    // verify the required parameter 'companyPeopleRequest' is set
    if (companyPeopleRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'companyPeopleRequest' when calling getCompanyPeopleForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-people/v1/company-people";

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
        
        CompanyPeopleResponse
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.getCompanyPeopleForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCompanyPeopleForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the list of people for the specified company identifiers and position
   * Returns the list of people, name, and title for a list of company ids and requested position. Positions include-   * Chairman   * Chief Executive Officer   * President   * Chief Operating Officer   * Chief Financial Officer   * Chief Technology Officer   * Chief Investment Officer   * Founder(s)   * Compliance Officer   * Admin   * Independent Director   * Directors/Board Members   * Investor Relations   * Legal Counsel   * Treasurer   * Sales and Marketing Managers   * Human Resources 
   * @param ids The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param position Controls the position details returned for the requested company. By default, the service returns the CEO name, title, and ID for the requested company ids.   |position|description|   |---|---|   |CHAIR|Chairman|   |CEO|Chief Executive Officer|   |PRES|President|   |COO|Chief Operating Officer|   |CFO|Chief Financial Officer|   |CTO|Chief Technology Officer|   |CIO|Chief Investment Officer|   |FOU|Founder(s)|   |CMP|Compliance Officer|   |ADM|Admin|   |IND|Independent Director|   |BRD|Directors/Board Members|   |IR|Investor Relations|   |LEG|Legal Counsel|   |TREAS|Treasurer|   |MKT|Sales and Marketing Managers|   |HR|Human Resources|  (optional, default to CEO)
   * @return CompanyPositionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Company Positions objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public CompanyPositionsResponse getCompanyPositions(java.util.List<String> ids, String position) throws ApiException {
    return getCompanyPositionsWithHttpInfo(ids, position).getData();
  }

  /**
   * Returns the list of people for the specified company identifiers and position
   * Returns the list of people, name, and title for a list of company ids and requested position. Positions include-   * Chairman   * Chief Executive Officer   * President   * Chief Operating Officer   * Chief Financial Officer   * Chief Technology Officer   * Chief Investment Officer   * Founder(s)   * Compliance Officer   * Admin   * Independent Director   * Directors/Board Members   * Investor Relations   * Legal Counsel   * Treasurer   * Sales and Marketing Managers   * Human Resources 
   * @param ids The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param position Controls the position details returned for the requested company. By default, the service returns the CEO name, title, and ID for the requested company ids.   |position|description|   |---|---|   |CHAIR|Chairman|   |CEO|Chief Executive Officer|   |PRES|President|   |COO|Chief Operating Officer|   |CFO|Chief Financial Officer|   |CTO|Chief Technology Officer|   |CIO|Chief Investment Officer|   |FOU|Founder(s)|   |CMP|Compliance Officer|   |ADM|Admin|   |IND|Independent Director|   |BRD|Directors/Board Members|   |IR|Investor Relations|   |LEG|Legal Counsel|   |TREAS|Treasurer|   |MKT|Sales and Marketing Managers|   |HR|Human Resources|  (optional, default to CEO)
   * @return ApiResponse&lt;CompanyPositionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Company Positions objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CompanyPositionsResponse> getCompanyPositionsWithHttpInfo(java.util.List<String> ids, String position) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getCompanyPositions");
    }
    
    // create path and map variables
    String localVarPath = "/factset-people/v1/company-positions";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "position", position));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        CompanyPositionsResponse
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.getCompanyPositions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCompanyPositionsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the list of people associated for a large list of company identitifers and position
   * Returns the list of people, name, and title for a list of company ids and requested position. Positions include-   * Chairman   * Chief Executive Officer   * President   * Chief Operating Officer   * Chief Financial Officer   * Chief Technology Officer   * Chief Investment Officer   * Founder(s)   * Compliance Officer   * Admin   * Independent Director   * Directors/Board Members   * Investor Relations   * Legal Counsel   * Treasurer   * Sales and Marketing Managers   * Human Resources 
   * @param companyPositionsRequest  (required)
   * @return CompanyPositionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Company Positions objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public CompanyPositionsResponse getCompanyPositionsForList(CompanyPositionsRequest companyPositionsRequest) throws ApiException {
    return getCompanyPositionsForListWithHttpInfo(companyPositionsRequest).getData();
  }

  /**
   * Returns the list of people associated for a large list of company identitifers and position
   * Returns the list of people, name, and title for a list of company ids and requested position. Positions include-   * Chairman   * Chief Executive Officer   * President   * Chief Operating Officer   * Chief Financial Officer   * Chief Technology Officer   * Chief Investment Officer   * Founder(s)   * Compliance Officer   * Admin   * Independent Director   * Directors/Board Members   * Investor Relations   * Legal Counsel   * Treasurer   * Sales and Marketing Managers   * Human Resources 
   * @param companyPositionsRequest  (required)
   * @return ApiResponse&lt;CompanyPositionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Company Positions objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CompanyPositionsResponse> getCompanyPositionsForListWithHttpInfo(CompanyPositionsRequest companyPositionsRequest) throws ApiException {
    Object localVarPostBody = companyPositionsRequest;
    
    // verify the required parameter 'companyPositionsRequest' is set
    if (companyPositionsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'companyPositionsRequest' when calling getCompanyPositionsForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-people/v1/company-positions";

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
        
        CompanyPositionsResponse
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.getCompanyPositionsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCompanyPositionsForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns statistics about top leadership of a company.
   * Returns the statistics such as the average age, tenure, compensation of leadership, number of executives, and the gender diversity of leadership. We can utilize the data for analyzing a company&#39;s board and management. 
   * @param ids The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param mbType Search based on the management and board types. The types include -  |type|description| |---|---| |MB|Management &amp; Board| |MGMT|Management| |BRD|Board|  (optional, default to MB)
   * @return CompanyStatsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Company Stats objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public CompanyStatsResponse getCompanyStats(java.util.List<String> ids, String mbType) throws ApiException {
    return getCompanyStatsWithHttpInfo(ids, mbType).getData();
  }

  /**
   * Returns statistics about top leadership of a company.
   * Returns the statistics such as the average age, tenure, compensation of leadership, number of executives, and the gender diversity of leadership. We can utilize the data for analyzing a company&#39;s board and management. 
   * @param ids The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param mbType Search based on the management and board types. The types include -  |type|description| |---|---| |MB|Management &amp; Board| |MGMT|Management| |BRD|Board|  (optional, default to MB)
   * @return ApiResponse&lt;CompanyStatsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Company Stats objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CompanyStatsResponse> getCompanyStatsWithHttpInfo(java.util.List<String> ids, String mbType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getCompanyStats");
    }
    
    // create path and map variables
    String localVarPath = "/factset-people/v1/company-stats";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mbType", mbType));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        CompanyStatsResponse
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.getCompanyStats", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCompanyStatsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns statistics about top leadership of a company.
   * Returns the statistics such as the average age, tenure, compensation of leadership, number of executives, and the gender diversity of leadership. We can utilize the data for analyzing a company&#39;s board and management.  
   * @param companyStatsRequest  (required)
   * @return CompanyStatsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Company Positions objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public CompanyStatsResponse getCompanyStatsForList(CompanyStatsRequest companyStatsRequest) throws ApiException {
    return getCompanyStatsForListWithHttpInfo(companyStatsRequest).getData();
  }

  /**
   * Returns statistics about top leadership of a company.
   * Returns the statistics such as the average age, tenure, compensation of leadership, number of executives, and the gender diversity of leadership. We can utilize the data for analyzing a company&#39;s board and management.  
   * @param companyStatsRequest  (required)
   * @return ApiResponse&lt;CompanyStatsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Array of Company Positions objects. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CompanyStatsResponse> getCompanyStatsForListWithHttpInfo(CompanyStatsRequest companyStatsRequest) throws ApiException {
    Object localVarPostBody = companyStatsRequest;
    
    // verify the required parameter 'companyStatsRequest' is set
    if (companyStatsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'companyStatsRequest' when calling getCompanyStatsForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-people/v1/company-stats";

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
        
        CompanyStatsResponse
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.getCompanyStatsForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCompanyStatsForListResponseTypeMap, false);

    return apiResponse;

  }
}
