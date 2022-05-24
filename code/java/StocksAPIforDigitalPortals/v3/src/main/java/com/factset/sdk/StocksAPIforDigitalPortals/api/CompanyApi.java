package com.factset.sdk.StocksAPIforDigitalPortals.api;

import com.factset.sdk.StocksAPIforDigitalPortals.ApiException;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiClient;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiResponse;
import com.factset.sdk.StocksAPIforDigitalPortals.Configuration;
import com.factset.sdk.StocksAPIforDigitalPortals.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineObject;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse200;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2003;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CompanyApi {
  private ApiClient apiClient;

  public CompanyApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CompanyApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getCompanyBoardListByInstrumentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCompanyBoardListByInstrumentResponseTypeMap.put(200, new GenericType<InlineResponse2003>(){});
  }
  private static final Map<Integer, GenericType> getCompanyBoardOfficerFunctionDeliveryListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCompanyBoardOfficerFunctionDeliveryListResponseTypeMap.put(200, new GenericType<InlineResponse2004>(){});
  }
  private static final Map<Integer, GenericType> getCompanyBoardTypeListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCompanyBoardTypeListResponseTypeMap.put(200, new GenericType<InlineResponse2005>(){});
  }
  private static final Map<Integer, GenericType> postCompanyEstimatesListByInstrumentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postCompanyEstimatesListByInstrumentResponseTypeMap.put(200, new GenericType<InlineResponse200>(){});
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
   * List of boards for a company, with their officers.
   * List of boards for a company, with their officers. A given person may be a member ofdifferent boards of the same company but also a member of boards of different companies.
   * @param id Identifier of the instrument representing company shares.Any other instrument yields empty values. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2003 getCompanyBoardListByInstrument(String id, java.util.Set<String> attributes, String language) throws ApiException {
    return getCompanyBoardListByInstrumentWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * List of boards for a company, with their officers.
   * List of boards for a company, with their officers. A given person may be a member ofdifferent boards of the same company but also a member of boards of different companies.
   * @param id Identifier of the instrument representing company shares.Any other instrument yields empty values. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2003&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2003> getCompanyBoardListByInstrumentWithHttpInfo(String id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCompanyBoardListByInstrument");
    }
    
    // create path and map variables
    String localVarPath = "/company/board/listByInstrument";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse2003
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.getCompanyBoardListByInstrument", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCompanyBoardListByInstrumentResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of officer functions as provided by a delivery.
   * List of officer functions as provided by a delivery.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse2004
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2004 getCompanyBoardOfficerFunctionDeliveryList(java.util.Set<String> attributes, String language) throws ApiException {
    return getCompanyBoardOfficerFunctionDeliveryListWithHttpInfo(attributes, language).getData();
  }

  /**
   * List of officer functions as provided by a delivery.
   * List of officer functions as provided by a delivery.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2004&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2004> getCompanyBoardOfficerFunctionDeliveryListWithHttpInfo(java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/company/board/officer/function/delivery/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse2004
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.getCompanyBoardOfficerFunctionDeliveryList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCompanyBoardOfficerFunctionDeliveryListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of company board types.
   * List of company board types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse2005
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2005 getCompanyBoardTypeList(java.util.Set<String> attributes, String language) throws ApiException {
    return getCompanyBoardTypeListWithHttpInfo(attributes, language).getData();
  }

  /**
   * List of company board types.
   * List of company board types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse2005&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2005> getCompanyBoardTypeListWithHttpInfo(java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/company/board/type/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse2005
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.getCompanyBoardTypeList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCompanyBoardTypeListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Estimates for selected figures for a stock.
   * Fiscal year estimates for selected figures of a stock. Data is available only for common shares; instruments such as preferred shares or depository receipts yield an empty result. For the share type, see endpoint &#x60;/instrument/category/list&#x60; using dataset 23. Data can be retrieved only for the current, the past, and three future fiscal years. For past fiscal years, the estimates are not being replaced by the reported figures. Since a fiscal year and a calendar year do not necessarily match with regard to their start and end dates, the year is derived as the calendar year occupied to a larger extent by the fiscal year, using a June through May fiscal year assignment. That means, fiscal years ending from the 1st of June onwards are assigned to the same calendar year. Dates are interpreted in the timezone of the location of the head office of the company.
   * @param body  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse200 postCompanyEstimatesListByInstrument(InlineObject body) throws ApiException {
    return postCompanyEstimatesListByInstrumentWithHttpInfo(body).getData();
  }

  /**
   * Estimates for selected figures for a stock.
   * Fiscal year estimates for selected figures of a stock. Data is available only for common shares; instruments such as preferred shares or depository receipts yield an empty result. For the share type, see endpoint &#x60;/instrument/category/list&#x60; using dataset 23. Data can be retrieved only for the current, the past, and three future fiscal years. For past fiscal years, the estimates are not being replaced by the reported figures. Since a fiscal year and a calendar year do not necessarily match with regard to their start and end dates, the year is derived as the calendar year occupied to a larger extent by the fiscal year, using a June through May fiscal year assignment. That means, fiscal years ending from the 1st of June onwards are assigned to the same calendar year. Dates are interpreted in the timezone of the location of the head office of the company.
   * @param body  (optional)
   * @return ApiResponse&lt;InlineResponse200&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse200> postCompanyEstimatesListByInstrumentWithHttpInfo(InlineObject body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/company/estimates/listByInstrument";

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
        
        InlineResponse200
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.postCompanyEstimatesListByInstrument", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postCompanyEstimatesListByInstrumentResponseTypeMap, false);

    return apiResponse;

  }
}
