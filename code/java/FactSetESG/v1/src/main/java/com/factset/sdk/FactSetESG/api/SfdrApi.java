package com.factset.sdk.FactSetESG.api;

import com.factset.sdk.FactSetESG.ApiException;
import com.factset.sdk.FactSetESG.ApiClient;
import com.factset.sdk.FactSetESG.ApiResponse;
import com.factset.sdk.FactSetESG.Configuration;
import com.factset.sdk.FactSetESG.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetESG.models.ErrorResponse;
import com.factset.sdk.FactSetESG.models.SfdrPaiRequest;
import com.factset.sdk.FactSetESG.models.SfdrPaiResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SfdrApi {
  private ApiClient apiClient;

  public SfdrApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SfdrApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getSfdrPaiResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSfdrPaiResponseTypeMap.put(200, new GenericType<SfdrPaiResponse>(){});
    getSfdrPaiResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getSfdrPaiResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getSfdrPaiResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getSfdrPaiResponseTypeMap.put(408, new GenericType<ErrorResponse>(){});
    getSfdrPaiResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getSfdrPaiResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getSfdrPaiForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSfdrPaiForListResponseTypeMap.put(200, new GenericType<SfdrPaiResponse>(){});
    getSfdrPaiForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getSfdrPaiForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getSfdrPaiForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getSfdrPaiForListResponseTypeMap.put(408, new GenericType<ErrorResponse>(){});
    getSfdrPaiForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getSfdrPaiForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Gets Principle Adverse Impact (PAI) data to support compliant SFDR Sustainable Finance Disclosure Regulation (SFDR) reporting
   * SFDR Principle Adverse Impact (PAI) data is built specifically to support compliant Sustainable Finance Disclosure Regulation (SFDR) reporting. FactSet collects PAI data items from publicly available company-reported information and FactSet databases, such as FactSet Fundamentals, FactSet RBICS with Revenue and FactSet People, which are also based on company-disclosures. FactSet uses Truvalue Labs SASB Spotlights for supplemental OECD &amp; UNGC violation checks where company reporting is sparse.  
   * @param ids Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  1500 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total  length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param feelback This parameter would return the latest PAI data based on the indicators or the subtopics requested. This parameter should not be used in conjuction with &#x60;fiscalPeriodStart&#x60; and &#x60;fiscalPeriodEnd&#x60;   (optional, default to false)
   * @param fiscalPeriodStart Fiscal period start is expressed in YYYY formats. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param fiscalPeriodEnd Fiscal period end is expressed in YYYY formats. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param indicators The indicators are the Principal Adverse Impact (PAI) metrics which consists of General, Mandatory and Additional indicators which supports the SFDR reporting.   The General indicators data can retrieved by providing the &#x60;GL001&#x60; and &#x60;GL002&#x60; subTopic codes as input. Please refer to the attached documentation for the full list of subtopics codes and their mapping with the indicators.  The data can also be requested for individual sub topic codes in addition to the indicators mentioned below -    |**SFDR PAI Indicators**|**Description**| |---|---| |**MandatoryIndicators**| Mandatory indicators are the indicators which must be reported under the EU Sustainable Finance Disclosure Regulation (SFDR).| |**AdditionalIndicators**| These are additional environmental and social indicators as mentioned in additional tables as provided in the Annex 1 table in the SFDR RTS report.| |**GHGEmissions**| This mandatory indicator includes metrics related to greenhouse emissions such as - Scope 1, 2, and 3 emissions, footprint and intensity and energy consumption from non-renewable and high climate sectors.| |**Biodiversity**| This mandatory indicator includes metrics pertaining to biodiversity and a company&#39;s impacts on biodiversity-sensitive areas.| |**Water**| This mandatory indicator includes data relating to emissions to water as made by the companies.| |**Waste**| This mandatory indicator includes data relating to hazardous waste as generated by the companies.| |**SocialEmployeeMatters**| This mandatory indicator includes employee-related metrics like gender diversity, pay gap and social-related metrics like violation of UNGC/OECD principles and exposure to controversial weapons.| |**Emissions**| This additional indicator includes metrics related to air pollutants, inorganic pollutants and ozone depleting substance. | |**EnergyPerformance**| This additional indicator includes metrics related to various sources of non-renewable energy as used by the companies. | |**WaterWasteMaterialEmissions**| This mandatory indicator includes employee-related metrics like gender diversity, pay gap and social-related metrics like violation of UNGC/OECD principles and exposure to controversial weapons.| |**AdditionalEmployeeMatters**| This additional indicator includes metrics related to workplace discrimination and safety, whistleblower mechanism and supplier code of conduct.| |**HumanRights**| This additional indicator includes metrics related to both policies and performance of a company in the areas of human rights, forced labor and human trafficking.| |**AntiCorruptionAntiBribery**| This additional indicator includes data related to company violations of anti-corruption and anti-bribery laws, and resulting fines.|  (optional, default to [\&quot;ALL\&quot;])
   * @param calculation This parameter would return the PAI data based on the input provided. All the data for indicators or subtopics requested are returned when the input is &#x60;true&#x60; and the SFDR required metrics are only returned when the input is&#x60;false&#x60;  (optional, default to true)
   * @return SfdrPaiResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The SFDR PAI response object, including the Calculation, Sub Topic Codes, Sub Topic Names, Report End Date,Reporting Period, Standardized Units and Standardized Values </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL used to request the endpoint is not authorized to access it. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 408 </td><td> Request Time-Out. This error would be returned if the request takes more than 29 seconds. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public SfdrPaiResponse getSfdrPai(java.util.List<String> ids, Boolean feelback, String fiscalPeriodStart, String fiscalPeriodEnd, java.util.List<String> indicators, Boolean calculation) throws ApiException {
    return getSfdrPaiWithHttpInfo(ids, feelback, fiscalPeriodStart, fiscalPeriodEnd, indicators, calculation).getData();
  }

  /**
   * Gets Principle Adverse Impact (PAI) data to support compliant SFDR Sustainable Finance Disclosure Regulation (SFDR) reporting
   * SFDR Principle Adverse Impact (PAI) data is built specifically to support compliant Sustainable Finance Disclosure Regulation (SFDR) reporting. FactSet collects PAI data items from publicly available company-reported information and FactSet databases, such as FactSet Fundamentals, FactSet RBICS with Revenue and FactSet People, which are also based on company-disclosures. FactSet uses Truvalue Labs SASB Spotlights for supplemental OECD &amp; UNGC violation checks where company reporting is sparse.  
   * @param ids Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  1500 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total  length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param feelback This parameter would return the latest PAI data based on the indicators or the subtopics requested. This parameter should not be used in conjuction with &#x60;fiscalPeriodStart&#x60; and &#x60;fiscalPeriodEnd&#x60;   (optional, default to false)
   * @param fiscalPeriodStart Fiscal period start is expressed in YYYY formats. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param fiscalPeriodEnd Fiscal period end is expressed in YYYY formats. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint.  (optional)
   * @param indicators The indicators are the Principal Adverse Impact (PAI) metrics which consists of General, Mandatory and Additional indicators which supports the SFDR reporting.   The General indicators data can retrieved by providing the &#x60;GL001&#x60; and &#x60;GL002&#x60; subTopic codes as input. Please refer to the attached documentation for the full list of subtopics codes and their mapping with the indicators.  The data can also be requested for individual sub topic codes in addition to the indicators mentioned below -    |**SFDR PAI Indicators**|**Description**| |---|---| |**MandatoryIndicators**| Mandatory indicators are the indicators which must be reported under the EU Sustainable Finance Disclosure Regulation (SFDR).| |**AdditionalIndicators**| These are additional environmental and social indicators as mentioned in additional tables as provided in the Annex 1 table in the SFDR RTS report.| |**GHGEmissions**| This mandatory indicator includes metrics related to greenhouse emissions such as - Scope 1, 2, and 3 emissions, footprint and intensity and energy consumption from non-renewable and high climate sectors.| |**Biodiversity**| This mandatory indicator includes metrics pertaining to biodiversity and a company&#39;s impacts on biodiversity-sensitive areas.| |**Water**| This mandatory indicator includes data relating to emissions to water as made by the companies.| |**Waste**| This mandatory indicator includes data relating to hazardous waste as generated by the companies.| |**SocialEmployeeMatters**| This mandatory indicator includes employee-related metrics like gender diversity, pay gap and social-related metrics like violation of UNGC/OECD principles and exposure to controversial weapons.| |**Emissions**| This additional indicator includes metrics related to air pollutants, inorganic pollutants and ozone depleting substance. | |**EnergyPerformance**| This additional indicator includes metrics related to various sources of non-renewable energy as used by the companies. | |**WaterWasteMaterialEmissions**| This mandatory indicator includes employee-related metrics like gender diversity, pay gap and social-related metrics like violation of UNGC/OECD principles and exposure to controversial weapons.| |**AdditionalEmployeeMatters**| This additional indicator includes metrics related to workplace discrimination and safety, whistleblower mechanism and supplier code of conduct.| |**HumanRights**| This additional indicator includes metrics related to both policies and performance of a company in the areas of human rights, forced labor and human trafficking.| |**AntiCorruptionAntiBribery**| This additional indicator includes data related to company violations of anti-corruption and anti-bribery laws, and resulting fines.|  (optional, default to [\&quot;ALL\&quot;])
   * @param calculation This parameter would return the PAI data based on the input provided. All the data for indicators or subtopics requested are returned when the input is &#x60;true&#x60; and the SFDR required metrics are only returned when the input is&#x60;false&#x60;  (optional, default to true)
   * @return ApiResponse&lt;SfdrPaiResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The SFDR PAI response object, including the Calculation, Sub Topic Codes, Sub Topic Names, Report End Date,Reporting Period, Standardized Units and Standardized Values </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL used to request the endpoint is not authorized to access it. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 408 </td><td> Request Time-Out. This error would be returned if the request takes more than 29 seconds. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SfdrPaiResponse> getSfdrPaiWithHttpInfo(java.util.List<String> ids, Boolean feelback, String fiscalPeriodStart, String fiscalPeriodEnd, java.util.List<String> indicators, Boolean calculation) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getSfdrPai");
    }
    
    // create path and map variables
    String localVarPath = "/factset-esg/v1/sfdr-pai";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "feelback", feelback));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fiscalPeriodStart", fiscalPeriodStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fiscalPeriodEnd", fiscalPeriodEnd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "indicators", indicators));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "calculation", calculation));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        SfdrPaiResponse
      
    > apiResponse = apiClient.invokeAPI("SfdrApi.getSfdrPai", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSfdrPaiResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Gets Principle Adverse Impact (PAI) data to support compliant SFDR Sustainable Finance Disclosure Regulation (SFDR) reporting
   * SFDR Principle Adverse Impact (PAI) data is built specifically to support compliant Sustainable Finance Disclosure Regulation (SFDR) reporting. FactSet collects PAI data items from publicly available company-reported information and FactSet databases, such as FactSet Fundamentals, FactSet RBICS with Revenue and FactSet People, which are also based on company-disclosures. FactSet uses Truvalue Labs SASB Spotlights for supplemental OECD &amp; UNGC violation checks where company reporting is sparse. 
   * @param sfdrPaiRequest The request body, allows the user to specify a list of ids, date range(Annual), and PAI Indicators (required)
   * @return SfdrPaiResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The SFDR PAI response object, including the Calculation, SubTopic Codes, SubTopic Names, Report End Date,Reporting Period, Standardized Units and Standardized Values </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL used to request the endpoint is not authorized to access it. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 408 </td><td> Request Time-Out. This error would be returned if the request takes more than 29 seconds. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public SfdrPaiResponse getSfdrPaiForList(SfdrPaiRequest sfdrPaiRequest) throws ApiException {
    return getSfdrPaiForListWithHttpInfo(sfdrPaiRequest).getData();
  }

  /**
   * Gets Principle Adverse Impact (PAI) data to support compliant SFDR Sustainable Finance Disclosure Regulation (SFDR) reporting
   * SFDR Principle Adverse Impact (PAI) data is built specifically to support compliant Sustainable Finance Disclosure Regulation (SFDR) reporting. FactSet collects PAI data items from publicly available company-reported information and FactSet databases, such as FactSet Fundamentals, FactSet RBICS with Revenue and FactSet People, which are also based on company-disclosures. FactSet uses Truvalue Labs SASB Spotlights for supplemental OECD &amp; UNGC violation checks where company reporting is sparse. 
   * @param sfdrPaiRequest The request body, allows the user to specify a list of ids, date range(Annual), and PAI Indicators (required)
   * @return ApiResponse&lt;SfdrPaiResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The SFDR PAI response object, including the Calculation, SubTopic Codes, SubTopic Names, Report End Date,Reporting Period, Standardized Units and Standardized Values </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL used to request the endpoint is not authorized to access it. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 408 </td><td> Request Time-Out. This error would be returned if the request takes more than 29 seconds. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SfdrPaiResponse> getSfdrPaiForListWithHttpInfo(SfdrPaiRequest sfdrPaiRequest) throws ApiException {
    Object localVarPostBody = sfdrPaiRequest;
    
    // verify the required parameter 'sfdrPaiRequest' is set
    if (sfdrPaiRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'sfdrPaiRequest' when calling getSfdrPaiForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-esg/v1/sfdr-pai";

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
        
        SfdrPaiResponse
      
    > apiResponse = apiClient.invokeAPI("SfdrApi.getSfdrPaiForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSfdrPaiForListResponseTypeMap, false);

    return apiResponse;

  }
}
