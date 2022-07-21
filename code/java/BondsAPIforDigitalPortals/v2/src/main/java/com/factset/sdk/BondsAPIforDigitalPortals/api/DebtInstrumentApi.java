package com.factset.sdk.BondsAPIforDigitalPortals.api;

import com.factset.sdk.BondsAPIforDigitalPortals.ApiException;
import com.factset.sdk.BondsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.BondsAPIforDigitalPortals.ApiResponse;
import com.factset.sdk.BondsAPIforDigitalPortals.Configuration;
import com.factset.sdk.BondsAPIforDigitalPortals.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineObject;
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineObject1;
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineObject2;
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse200;
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse2001;
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse2002;
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse2003;
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse2004;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DebtInstrumentApi {
  private ApiClient apiClient;

  public DebtInstrumentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DebtInstrumentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getDebtInstrumentGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDebtInstrumentGetResponseTypeMap.put(200, new GenericType<InlineResponse200>(){});
  }
  private static final Map<Integer, GenericType> getDebtInstrumentKeyFiguresNotationGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getDebtInstrumentKeyFiguresNotationGetResponseTypeMap.put(200, new GenericType<InlineResponse2002>(){});
  }
  private static final Map<Integer, GenericType> postDebtInstrumentIssuerSearchResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postDebtInstrumentIssuerSearchResponseTypeMap.put(200, new GenericType<InlineResponse2001>(){});
  }
  private static final Map<Integer, GenericType> postDebtInstrumentNotationScreenerSearchResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postDebtInstrumentNotationScreenerSearchResponseTypeMap.put(200, new GenericType<InlineResponse2003>(){});
  }
  private static final Map<Integer, GenericType> postDebtInstrumentNotationScreenerValueRangesGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postDebtInstrumentNotationScreenerValueRangesGetResponseTypeMap.put(200, new GenericType<InlineResponse2004>(){});
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
   * Fundamental data for a debt instrument.
   * Fundamental data for a debt instrument; any other instrument yields empty values for debt-instrument-specific attributes. Dates are interpreted in the timezone of the issuer.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse200 getDebtInstrumentGet(String id, java.util.Set<String> attributes, String language) throws ApiException {
    return getDebtInstrumentGetWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Fundamental data for a debt instrument.
   * Fundamental data for a debt instrument; any other instrument yields empty values for debt-instrument-specific attributes. Dates are interpreted in the timezone of the issuer.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language  (optional)
   * @return ApiResponse&lt;InlineResponse200&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse200> getDebtInstrumentGetWithHttpInfo(String id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getDebtInstrumentGet");
    }
    
    // create path and map variables
    String localVarPath = "/debtInstrument/get";

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
        
        InlineResponse200
      
    > apiResponse = apiClient.invokeAPI("DebtInstrumentApi.getDebtInstrumentGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDebtInstrumentGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Key figures of a debt instrument.
   * Key figures of a debt instrument. The key figures are calculated using delayed prices with an additional delay of 10 minutes after an  update of the debt instrument&#39;s price. Special product features such as the right to a maturity extension, an attached option, or convertibility are not considered for the key figure calculation. Further, a calculation is not performed for perpetual products and for products with variable interest rate.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse2002
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2002 getDebtInstrumentKeyFiguresNotationGet(String id, java.util.Set<String> attributes) throws ApiException {
    return getDebtInstrumentKeyFiguresNotationGetWithHttpInfo(id, attributes).getData();
  }

  /**
   * Key figures of a debt instrument.
   * Key figures of a debt instrument. The key figures are calculated using delayed prices with an additional delay of 10 minutes after an  update of the debt instrument&#39;s price. Special product features such as the right to a maturity extension, an attached option, or convertibility are not considered for the key figure calculation. Further, a calculation is not performed for perpetual products and for products with variable interest rate.
   * @param id  (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse2002&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2002> getDebtInstrumentKeyFiguresNotationGetWithHttpInfo(String id, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getDebtInstrumentKeyFiguresNotationGet");
    }
    
    // create path and map variables
    String localVarPath = "/debtInstrument/keyFigures/notation/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InlineResponse2002
      
    > apiResponse = apiClient.invokeAPI("DebtInstrumentApi.getDebtInstrumentKeyFiguresNotationGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getDebtInstrumentKeyFiguresNotationGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Search for issuers of debt instruments.
   * Search for issuers of debt instruments. FactSet does not consolidate the data provided by different suppliers, therefore the result may contain more than one identifier for a given issuer. The response is limited to 100 results.
   * @param inlineObject  (optional)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2001 postDebtInstrumentIssuerSearch(InlineObject inlineObject) throws ApiException {
    return postDebtInstrumentIssuerSearchWithHttpInfo(inlineObject).getData();
  }

  /**
   * Search for issuers of debt instruments.
   * Search for issuers of debt instruments. FactSet does not consolidate the data provided by different suppliers, therefore the result may contain more than one identifier for a given issuer. The response is limited to 100 results.
   * @param inlineObject  (optional)
   * @return ApiResponse&lt;InlineResponse2001&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2001> postDebtInstrumentIssuerSearchWithHttpInfo(InlineObject inlineObject) throws ApiException {
    Object localVarPostBody = inlineObject;
    
    // create path and map variables
    String localVarPath = "/debtInstrument/issuer/search";

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
      
    > apiResponse = apiClient.invokeAPI("DebtInstrumentApi.postDebtInstrumentIssuerSearch", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postDebtInstrumentIssuerSearchResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Screener for debt instruments&#39; notations based on debt instrument-specific parameters.
   * Screener for debt instruments&#39; notations based on debt instrument-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.
   * @param inlineObject1  (optional)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2003 postDebtInstrumentNotationScreenerSearch(InlineObject1 inlineObject1) throws ApiException {
    return postDebtInstrumentNotationScreenerSearchWithHttpInfo(inlineObject1).getData();
  }

  /**
   * Screener for debt instruments&#39; notations based on debt instrument-specific parameters.
   * Screener for debt instruments&#39; notations based on debt instrument-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.
   * @param inlineObject1  (optional)
   * @return ApiResponse&lt;InlineResponse2003&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2003> postDebtInstrumentNotationScreenerSearchWithHttpInfo(InlineObject1 inlineObject1) throws ApiException {
    Object localVarPostBody = inlineObject1;
    
    // create path and map variables
    String localVarPath = "/debtInstrument/notation/screener/search";

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
        
        InlineResponse2003
      
    > apiResponse = apiClient.invokeAPI("DebtInstrumentApi.postDebtInstrumentNotationScreenerSearch", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postDebtInstrumentNotationScreenerSearchResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Possible values and value ranges for the parameters used in the endpoint &#x60;/debtInstrument/notation/screener/search.&#x60;
   * The endpoint returns the possible values and value ranges for the parameters used in the endpoint &#x60;/debtInstrument/notation/screener/search&#x60;. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. The functionality may be used to pre-fill the values and value ranges of the parameters of the &#x60;/debtInstrument/notation/screener/search&#x60; endpoint so that performing a search always leads to a non-empty set of notations. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.
   * @param inlineObject2  (optional)
   * @return InlineResponse2004
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2004 postDebtInstrumentNotationScreenerValueRangesGet(InlineObject2 inlineObject2) throws ApiException {
    return postDebtInstrumentNotationScreenerValueRangesGetWithHttpInfo(inlineObject2).getData();
  }

  /**
   * Possible values and value ranges for the parameters used in the endpoint &#x60;/debtInstrument/notation/screener/search.&#x60;
   * The endpoint returns the possible values and value ranges for the parameters used in the endpoint &#x60;/debtInstrument/notation/screener/search&#x60;. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. The functionality may be used to pre-fill the values and value ranges of the parameters of the &#x60;/debtInstrument/notation/screener/search&#x60; endpoint so that performing a search always leads to a non-empty set of notations. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.
   * @param inlineObject2  (optional)
   * @return ApiResponse&lt;InlineResponse2004&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2004> postDebtInstrumentNotationScreenerValueRangesGetWithHttpInfo(InlineObject2 inlineObject2) throws ApiException {
    Object localVarPostBody = inlineObject2;
    
    // create path and map variables
    String localVarPath = "/debtInstrument/notation/screener/valueRanges/get";

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
        
        InlineResponse2004
      
    > apiResponse = apiClient.invokeAPI("DebtInstrumentApi.postDebtInstrumentNotationScreenerValueRangesGet", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postDebtInstrumentNotationScreenerValueRangesGetResponseTypeMap, false);

    return apiResponse;

  }
}
