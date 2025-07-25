package com.factset.sdk.RealTimeOptions.api;

import com.factset.sdk.RealTimeOptions.ApiException;
import com.factset.sdk.RealTimeOptions.ApiClient;
import com.factset.sdk.RealTimeOptions.ApiResponse;
import com.factset.sdk.RealTimeOptions.Configuration;
import com.factset.sdk.RealTimeOptions.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.RealTimeOptions.models.InlineResponse200;
import com.factset.sdk.RealTimeOptions.models.InlineResponse2001;
import com.factset.sdk.RealTimeOptions.models.InlineResponse2002;
import com.factset.sdk.RealTimeOptions.models.InlineResponse2003;
import com.factset.sdk.RealTimeOptions.models.InlineResponse2004;
import com.factset.sdk.RealTimeOptions.models.PostOptionByClassListRequest;
import com.factset.sdk.RealTimeOptions.models.PostOptionByClassValueRangesGetRequest;
import com.factset.sdk.RealTimeOptions.models.PostOptionClassScreenerSearchRequest;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OptionApi {
  private ApiClient apiClient;

  public OptionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OptionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getOptionGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOptionGetResponseTypeMap.put(200, new GenericType<InlineResponse200>(){});
  }

  private static final Map<Integer, GenericType> getOptionKeyFiguresGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOptionKeyFiguresGetResponseTypeMap.put(200, new GenericType<InlineResponse2004>(){});
  }

  private static final Map<Integer, GenericType> postOptionByClassListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postOptionByClassListResponseTypeMap.put(200, new GenericType<InlineResponse2001>(){});
  }

  private static final Map<Integer, GenericType> postOptionByClassValueRangesGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postOptionByClassValueRangesGetResponseTypeMap.put(200, new GenericType<InlineResponse2002>(){});
  }

  private static final Map<Integer, GenericType> postOptionClassScreenerSearchResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    postOptionClassScreenerSearchResponseTypeMap.put(200, new GenericType<InlineResponse2003>(){});
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
   * Fundamental data for an option contract.
   * Fundamental data for an option contract; any other instrument yields empty             values for option contract-specific attributes. Dates are interpreted in the time             zone of the exchange. Option contracts are exchange-specific; each option contract             instrument has exactly one notation.
   * @param identifier Identifier to resolve. (required)
   * @param identifierType Type of the identifier. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param metaLanguage ISO 639-1 code of the language. (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse200 getOptionGet(String identifier, String identifierType, java.util.Set<String> attributes, String metaLanguage) throws ApiException {
    return getOptionGetWithHttpInfo(identifier, identifierType, attributes, metaLanguage).getData();
  }

  /**
   * Fundamental data for an option contract.
   * Fundamental data for an option contract; any other instrument yields empty             values for option contract-specific attributes. Dates are interpreted in the time             zone of the exchange. Option contracts are exchange-specific; each option contract             instrument has exactly one notation.
   * @param identifier Identifier to resolve. (required)
   * @param identifierType Type of the identifier. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param metaLanguage ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse200&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse200> getOptionGetWithHttpInfo(String identifier, String identifierType, java.util.Set<String> attributes, String metaLanguage) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getOptionGet");
    }
    
    // verify the required parameter 'identifierType' is set
    if (identifierType == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierType' when calling getOptionGet");
    }
    
    // create path and map variables
    String localVarPath = "/option/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifierType", identifierType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metaLanguage", metaLanguage));

    
    
    
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
      
    > apiResponse = apiClient.invokeAPI("OptionApi.getOptionGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOptionGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Key figures of an option contract.
   * Key figures of an option contract.
   * @param identifier Identifier to resolve. (required)
   * @param identifierType Type of the identifier. An instrument level identifier is resolved to a listing level identifier according to the configured listing selection rules. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier, identifying the primary listing in the region. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol, identifying the primary listing in the region. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return InlineResponse2004
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2004 getOptionKeyFiguresGet(String identifier, String identifierType, java.util.Set<String> attributes) throws ApiException {
    return getOptionKeyFiguresGetWithHttpInfo(identifier, identifierType, attributes).getData();
  }

  /**
   * Key figures of an option contract.
   * Key figures of an option contract.
   * @param identifier Identifier to resolve. (required)
   * @param identifierType Type of the identifier. An instrument level identifier is resolved to a listing level identifier according to the configured listing selection rules. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier, identifying the primary listing in the region. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol, identifying the primary listing in the region. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @return ApiResponse&lt;InlineResponse2004&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2004> getOptionKeyFiguresGetWithHttpInfo(String identifier, String identifierType, java.util.Set<String> attributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getOptionKeyFiguresGet");
    }
    
    // verify the required parameter 'identifierType' is set
    if (identifierType == null) {
      throw new ApiException(400, "Missing the required parameter 'identifierType' when calling getOptionKeyFiguresGet");
    }
    
    // create path and map variables
    String localVarPath = "/option/key-figures/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifier", identifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identifierType", identifierType));
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
        
        InlineResponse2004
      
    > apiResponse = apiClient.invokeAPI("OptionApi.getOptionKeyFiguresGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOptionKeyFiguresGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List of option contracts for an option class.
   * List of option contracts for an option class. The list can be filtered based on option contract-specific parameters. All identifiers used as parameters must be valid and entitled.
   * @param postOptionByClassListRequest Request Body (optional)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2001 postOptionByClassList(PostOptionByClassListRequest postOptionByClassListRequest) throws ApiException {
    return postOptionByClassListWithHttpInfo(postOptionByClassListRequest).getData();
  }

  /**
   * List of option contracts for an option class.
   * List of option contracts for an option class. The list can be filtered based on option contract-specific parameters. All identifiers used as parameters must be valid and entitled.
   * @param postOptionByClassListRequest Request Body (optional)
   * @return ApiResponse&lt;InlineResponse2001&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2001> postOptionByClassListWithHttpInfo(PostOptionByClassListRequest postOptionByClassListRequest) throws ApiException {
    Object localVarPostBody = postOptionByClassListRequest;
    
    // create path and map variables
    String localVarPath = "/option/by-class/list";

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
      
    > apiResponse = apiClient.invokeAPI("OptionApi.postOptionByClassList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postOptionByClassListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Possible values and value ranges for the parameters used in the endpoint &#x60;/option/by-class/list&#x60;.
   * The endpoint returns the possible values and value ranges for the parameters used in the endpoint &#x60;/option/by-class/list&#x60;. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. The functionality may be used to pre-fill the values and value ranges of the parameters of the &#x60;/option/by-class/list&#x60; endpoint so that performing a search always leads to a non-empty list of notations. Lists of distinct values, e.g. identifiers, are sorted descending by the number of notations for each value.
   * @param postOptionByClassValueRangesGetRequest Request Body (optional)
   * @return InlineResponse2002
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2002 postOptionByClassValueRangesGet(PostOptionByClassValueRangesGetRequest postOptionByClassValueRangesGetRequest) throws ApiException {
    return postOptionByClassValueRangesGetWithHttpInfo(postOptionByClassValueRangesGetRequest).getData();
  }

  /**
   * Possible values and value ranges for the parameters used in the endpoint &#x60;/option/by-class/list&#x60;.
   * The endpoint returns the possible values and value ranges for the parameters used in the endpoint &#x60;/option/by-class/list&#x60;. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. The functionality may be used to pre-fill the values and value ranges of the parameters of the &#x60;/option/by-class/list&#x60; endpoint so that performing a search always leads to a non-empty list of notations. Lists of distinct values, e.g. identifiers, are sorted descending by the number of notations for each value.
   * @param postOptionByClassValueRangesGetRequest Request Body (optional)
   * @return ApiResponse&lt;InlineResponse2002&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2002> postOptionByClassValueRangesGetWithHttpInfo(PostOptionByClassValueRangesGetRequest postOptionByClassValueRangesGetRequest) throws ApiException {
    Object localVarPostBody = postOptionByClassValueRangesGetRequest;
    
    // create path and map variables
    String localVarPath = "/option/by-class/value-ranges/get";

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
      
    > apiResponse = apiClient.invokeAPI("OptionApi.postOptionByClassValueRangesGet", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postOptionByClassValueRangesGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Screener for option classes based on option class-specific parameters.
   * Screener for option classes based on option class-specific parameters. An option class is defined by an exchange and includes all option contracts with the same reference data (e.g. underlying instrument). The result is limited to the 500 option classes with the most option contracts per class, that satisfy all the selected filters. All identifiers used as parameters must be valid and entitled.
   * @param postOptionClassScreenerSearchRequest Request Body (optional)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2003 postOptionClassScreenerSearch(PostOptionClassScreenerSearchRequest postOptionClassScreenerSearchRequest) throws ApiException {
    return postOptionClassScreenerSearchWithHttpInfo(postOptionClassScreenerSearchRequest).getData();
  }

  /**
   * Screener for option classes based on option class-specific parameters.
   * Screener for option classes based on option class-specific parameters. An option class is defined by an exchange and includes all option contracts with the same reference data (e.g. underlying instrument). The result is limited to the 500 option classes with the most option contracts per class, that satisfy all the selected filters. All identifiers used as parameters must be valid and entitled.
   * @param postOptionClassScreenerSearchRequest Request Body (optional)
   * @return ApiResponse&lt;InlineResponse2003&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2003> postOptionClassScreenerSearchWithHttpInfo(PostOptionClassScreenerSearchRequest postOptionClassScreenerSearchRequest) throws ApiException {
    Object localVarPostBody = postOptionClassScreenerSearchRequest;
    
    // create path and map variables
    String localVarPath = "/option/class/screener/search";

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
      
    > apiResponse = apiClient.invokeAPI("OptionApi.postOptionClassScreenerSearch", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, postOptionClassScreenerSearchResponseTypeMap, false);

    return apiResponse;

  }
}
