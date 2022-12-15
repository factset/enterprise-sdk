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

import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse200;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2001;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2002;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2006;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2007;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostCompanyEstimatesListByInstrumentRequest;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostCompanyKeyItemsCurrentGetByInstrumentRequest;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostCompanyKeyItemsFiscalYearListByInstrumentRequest;

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
    getCompanyBoardListByInstrumentResponseTypeMap.put(200, new GenericType<InlineResponse2005>(){});
  }
  private static final Map<Integer, GenericType> getCompanyBoardOfficerFunctionDeliveryListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCompanyBoardOfficerFunctionDeliveryListResponseTypeMap.put(200, new GenericType<InlineResponse2006>(){});
  }
  private static final Map<Integer, GenericType> getCompanyBoardTypeListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCompanyBoardTypeListResponseTypeMap.put(200, new GenericType<InlineResponse2007>(){});
  }
  private static final Map<Integer, GenericType> postCompanyEstimatesListByInstrumentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postCompanyEstimatesListByInstrumentResponseTypeMap.put(200, new GenericType<InlineResponse2002>(){});
  }
  private static final Map<Integer, GenericType> postCompanyKeyItemsCurrentGetByInstrumentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postCompanyKeyItemsCurrentGetByInstrumentResponseTypeMap.put(200, new GenericType<InlineResponse200>(){});
  }
  private static final Map<Integer, GenericType> postCompanyKeyItemsFiscalYearListByInstrumentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postCompanyKeyItemsFiscalYearListByInstrumentResponseTypeMap.put(200, new GenericType<InlineResponse2001>(){});
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
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse2005
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2005 getCompanyBoardListByInstrument(String id, java.util.Set<String> attributes, String language) throws ApiException {
    return getCompanyBoardListByInstrumentWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * List of boards for a company, with their officers.
   * List of boards for a company, with their officers. A given person may be a member ofdifferent boards of the same company but also a member of boards of different companies.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse2005&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2005> getCompanyBoardListByInstrumentWithHttpInfo(String id, java.util.Set<String> attributes, String language) throws ApiException {
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
        
        InlineResponse2005
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.getCompanyBoardListByInstrument", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCompanyBoardListByInstrumentResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of officer functions as provided by a delivery.
   * List of officer functions as provided by a delivery.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse2006
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2006 getCompanyBoardOfficerFunctionDeliveryList(java.util.Set<String> attributes, String language) throws ApiException {
    return getCompanyBoardOfficerFunctionDeliveryListWithHttpInfo(attributes, language).getData();
  }

  /**
   * List of officer functions as provided by a delivery.
   * List of officer functions as provided by a delivery.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse2006&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2006> getCompanyBoardOfficerFunctionDeliveryListWithHttpInfo(java.util.Set<String> attributes, String language) throws ApiException {
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
        
        InlineResponse2006
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.getCompanyBoardOfficerFunctionDeliveryList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCompanyBoardOfficerFunctionDeliveryListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of company board types.
   * List of company board types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse2007
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2007 getCompanyBoardTypeList(java.util.Set<String> attributes, String language) throws ApiException {
    return getCompanyBoardTypeListWithHttpInfo(attributes, language).getData();
  }

  /**
   * List of company board types.
   * List of company board types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse2007&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2007> getCompanyBoardTypeListWithHttpInfo(java.util.Set<String> attributes, String language) throws ApiException {
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
        
        InlineResponse2007
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.getCompanyBoardTypeList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCompanyBoardTypeListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Estimates for selected figures for a stock.
   * Fiscal year estimates for selected figures of a stock. Data is available only for common shares; instruments such as preferred shares or depository receipts yield an empty result. For the share type, see endpoint &#x60;/instrument/category/list&#x60; using dataset 23. Data can be retrieved only for the current, the past, and three future fiscal years. For past fiscal years, the estimates are not being replaced by the reported figures. Since a fiscal year and a calendar year do not necessarily match with regard to their start and end dates, the year is derived as the calendar year occupied to a larger extent by the fiscal year, using a June through May fiscal year assignment. That means, fiscal years ending from the 1st of June onwards are assigned to the same calendar year. Dates are interpreted in the timezone of the location of the head office of the company.
   * @param postCompanyEstimatesListByInstrumentRequest  (optional)
   * @return InlineResponse2002
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2002 postCompanyEstimatesListByInstrument(PostCompanyEstimatesListByInstrumentRequest postCompanyEstimatesListByInstrumentRequest) throws ApiException {
    return postCompanyEstimatesListByInstrumentWithHttpInfo(postCompanyEstimatesListByInstrumentRequest).getData();
  }

  /**
   * Estimates for selected figures for a stock.
   * Fiscal year estimates for selected figures of a stock. Data is available only for common shares; instruments such as preferred shares or depository receipts yield an empty result. For the share type, see endpoint &#x60;/instrument/category/list&#x60; using dataset 23. Data can be retrieved only for the current, the past, and three future fiscal years. For past fiscal years, the estimates are not being replaced by the reported figures. Since a fiscal year and a calendar year do not necessarily match with regard to their start and end dates, the year is derived as the calendar year occupied to a larger extent by the fiscal year, using a June through May fiscal year assignment. That means, fiscal years ending from the 1st of June onwards are assigned to the same calendar year. Dates are interpreted in the timezone of the location of the head office of the company.
   * @param postCompanyEstimatesListByInstrumentRequest  (optional)
   * @return ApiResponse&lt;InlineResponse2002&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2002> postCompanyEstimatesListByInstrumentWithHttpInfo(PostCompanyEstimatesListByInstrumentRequest postCompanyEstimatesListByInstrumentRequest) throws ApiException {
    Object localVarPostBody = postCompanyEstimatesListByInstrumentRequest;
    
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
        
        InlineResponse2002
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.postCompanyEstimatesListByInstrument", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postCompanyEstimatesListByInstrumentResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Fundamentals for a stock with potentially daily updates.
   * Fundamentals for a stock with potentially daily updates; any other instrument yields empty values for stock-specific attributes. The price used to calculate the various price-dependent figures is unspecified and the exchange for that price is not identified. Dates are interpreted in the timezone of the data provider. For reported company fundamentals of the previous fiscal years (only closed fiscal years) see endpoint &#x60;/company/keyItems/fiscalYear/listByInstrument.&#x60;
   * @param postCompanyKeyItemsCurrentGetByInstrumentRequest  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse200 postCompanyKeyItemsCurrentGetByInstrument(PostCompanyKeyItemsCurrentGetByInstrumentRequest postCompanyKeyItemsCurrentGetByInstrumentRequest) throws ApiException {
    return postCompanyKeyItemsCurrentGetByInstrumentWithHttpInfo(postCompanyKeyItemsCurrentGetByInstrumentRequest).getData();
  }

  /**
   * Fundamentals for a stock with potentially daily updates.
   * Fundamentals for a stock with potentially daily updates; any other instrument yields empty values for stock-specific attributes. The price used to calculate the various price-dependent figures is unspecified and the exchange for that price is not identified. Dates are interpreted in the timezone of the data provider. For reported company fundamentals of the previous fiscal years (only closed fiscal years) see endpoint &#x60;/company/keyItems/fiscalYear/listByInstrument.&#x60;
   * @param postCompanyKeyItemsCurrentGetByInstrumentRequest  (optional)
   * @return ApiResponse&lt;InlineResponse200&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse200> postCompanyKeyItemsCurrentGetByInstrumentWithHttpInfo(PostCompanyKeyItemsCurrentGetByInstrumentRequest postCompanyKeyItemsCurrentGetByInstrumentRequest) throws ApiException {
    Object localVarPostBody = postCompanyKeyItemsCurrentGetByInstrumentRequest;
    
    // create path and map variables
    String localVarPath = "/company/keyItems/current/getByInstrument";

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
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.postCompanyKeyItemsCurrentGetByInstrument", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postCompanyKeyItemsCurrentGetByInstrumentResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Selected fundamentals for a stock with values as of the end of a fiscal year.
   * Selected fundamentals for a stock with values as of the end of a fiscal year; any other instrument yields empty values for stock-specific attributes. The endpoint allows the retrieval of data only for specified fiscal years by using the start and end properties. Since a fiscal year and a calendar year do not necessarily match with regard to their start and end dates, the year is derived as the calendar year occupied to a larger extent by the fiscal year, using a June through May fiscal year assignment. That means, fiscal years ending from the 1st of June onwards are assigned to the same calendar year. Dates are interpreted in the timezone of the location of the head office of the company.
   * @param postCompanyKeyItemsFiscalYearListByInstrumentRequest  (optional)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2001 postCompanyKeyItemsFiscalYearListByInstrument(PostCompanyKeyItemsFiscalYearListByInstrumentRequest postCompanyKeyItemsFiscalYearListByInstrumentRequest) throws ApiException {
    return postCompanyKeyItemsFiscalYearListByInstrumentWithHttpInfo(postCompanyKeyItemsFiscalYearListByInstrumentRequest).getData();
  }

  /**
   * Selected fundamentals for a stock with values as of the end of a fiscal year.
   * Selected fundamentals for a stock with values as of the end of a fiscal year; any other instrument yields empty values for stock-specific attributes. The endpoint allows the retrieval of data only for specified fiscal years by using the start and end properties. Since a fiscal year and a calendar year do not necessarily match with regard to their start and end dates, the year is derived as the calendar year occupied to a larger extent by the fiscal year, using a June through May fiscal year assignment. That means, fiscal years ending from the 1st of June onwards are assigned to the same calendar year. Dates are interpreted in the timezone of the location of the head office of the company.
   * @param postCompanyKeyItemsFiscalYearListByInstrumentRequest  (optional)
   * @return ApiResponse&lt;InlineResponse2001&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2001> postCompanyKeyItemsFiscalYearListByInstrumentWithHttpInfo(PostCompanyKeyItemsFiscalYearListByInstrumentRequest postCompanyKeyItemsFiscalYearListByInstrumentRequest) throws ApiException {
    Object localVarPostBody = postCompanyKeyItemsFiscalYearListByInstrumentRequest;
    
    // create path and map variables
    String localVarPath = "/company/keyItems/fiscalYear/listByInstrument";

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
        
        InlineResponse2001
      
    > apiResponse = apiClient.invokeAPI("CompanyApi.postCompanyKeyItemsFiscalYearListByInstrument", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postCompanyKeyItemsFiscalYearListByInstrumentResponseTypeMap, false);

    return apiResponse;

  }
}
