package com.factset.sdk.OpenFactSetPartnersDocuments.api;

import com.factset.sdk.OpenFactSetPartnersDocuments.ApiException;
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiClient;
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiResponse;
import com.factset.sdk.OpenFactSetPartnersDocuments.Configuration;
import com.factset.sdk.OpenFactSetPartnersDocuments.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.OpenFactSetPartnersDocuments.models.AuthStatus;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.BeamEndpointsResponse;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.BiomarkersResponse;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.CollaboratorsResponse;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.DataResponse;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.DiseasesResponse;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.FullHistoryResponse;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.InterventionResponse;
import java.time.OffsetDateTime;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.OrangePurpleResponse;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.PrimaryOutcomeResponse;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.SponsorsResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OzmosiApi {
  private ApiClient apiClient;

  public OzmosiApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OzmosiApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getOzmosiBiomarkersDailyResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOzmosiBiomarkersDailyResponseTypeMap.put(200, new GenericType<BiomarkersResponse>(){});
    getOzmosiBiomarkersDailyResponseTypeMap.put(400, new GenericType<AuthStatus>(){});
    getOzmosiBiomarkersDailyResponseTypeMap.put(401, new GenericType<AuthStatus>(){});
    getOzmosiBiomarkersDailyResponseTypeMap.put(403, new GenericType<AuthStatus>(){});
    getOzmosiBiomarkersDailyResponseTypeMap.put(500, new GenericType<AuthStatus>(){});
  }

  private static final Map<Integer, GenericType> getOzmosiClinicalTrialsDailyResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOzmosiClinicalTrialsDailyResponseTypeMap.put(200, new GenericType<DataResponse>(){});
    getOzmosiClinicalTrialsDailyResponseTypeMap.put(400, new GenericType<AuthStatus>(){});
    getOzmosiClinicalTrialsDailyResponseTypeMap.put(401, new GenericType<AuthStatus>(){});
    getOzmosiClinicalTrialsDailyResponseTypeMap.put(403, new GenericType<AuthStatus>(){});
    getOzmosiClinicalTrialsDailyResponseTypeMap.put(500, new GenericType<AuthStatus>(){});
  }

  private static final Map<Integer, GenericType> getOzmosiClinicalTrialsHistoryResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOzmosiClinicalTrialsHistoryResponseTypeMap.put(200, new GenericType<FullHistoryResponse>(){});
    getOzmosiClinicalTrialsHistoryResponseTypeMap.put(400, new GenericType<AuthStatus>(){});
    getOzmosiClinicalTrialsHistoryResponseTypeMap.put(401, new GenericType<AuthStatus>(){});
    getOzmosiClinicalTrialsHistoryResponseTypeMap.put(403, new GenericType<AuthStatus>(){});
    getOzmosiClinicalTrialsHistoryResponseTypeMap.put(500, new GenericType<AuthStatus>(){});
  }

  private static final Map<Integer, GenericType> getOzmosiCollaboratorsDailyResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOzmosiCollaboratorsDailyResponseTypeMap.put(200, new GenericType<CollaboratorsResponse>(){});
    getOzmosiCollaboratorsDailyResponseTypeMap.put(400, new GenericType<AuthStatus>(){});
    getOzmosiCollaboratorsDailyResponseTypeMap.put(401, new GenericType<AuthStatus>(){});
    getOzmosiCollaboratorsDailyResponseTypeMap.put(403, new GenericType<AuthStatus>(){});
    getOzmosiCollaboratorsDailyResponseTypeMap.put(500, new GenericType<AuthStatus>(){});
  }

  private static final Map<Integer, GenericType> getOzmosiDiseasesDailyResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOzmosiDiseasesDailyResponseTypeMap.put(200, new GenericType<DiseasesResponse>(){});
    getOzmosiDiseasesDailyResponseTypeMap.put(400, new GenericType<AuthStatus>(){});
    getOzmosiDiseasesDailyResponseTypeMap.put(401, new GenericType<AuthStatus>(){});
    getOzmosiDiseasesDailyResponseTypeMap.put(403, new GenericType<AuthStatus>(){});
    getOzmosiDiseasesDailyResponseTypeMap.put(500, new GenericType<AuthStatus>(){});
  }

  private static final Map<Integer, GenericType> getOzmosiEndpointsDailyResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOzmosiEndpointsDailyResponseTypeMap.put(200, new GenericType<BeamEndpointsResponse>(){});
    getOzmosiEndpointsDailyResponseTypeMap.put(400, new GenericType<AuthStatus>(){});
    getOzmosiEndpointsDailyResponseTypeMap.put(401, new GenericType<AuthStatus>(){});
    getOzmosiEndpointsDailyResponseTypeMap.put(403, new GenericType<AuthStatus>(){});
    getOzmosiEndpointsDailyResponseTypeMap.put(500, new GenericType<AuthStatus>(){});
  }

  private static final Map<Integer, GenericType> getOzmosiInterventionDailyResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOzmosiInterventionDailyResponseTypeMap.put(200, new GenericType<InterventionResponse>(){});
    getOzmosiInterventionDailyResponseTypeMap.put(400, new GenericType<AuthStatus>(){});
    getOzmosiInterventionDailyResponseTypeMap.put(401, new GenericType<AuthStatus>(){});
    getOzmosiInterventionDailyResponseTypeMap.put(403, new GenericType<AuthStatus>(){});
    getOzmosiInterventionDailyResponseTypeMap.put(500, new GenericType<AuthStatus>(){});
  }

  private static final Map<Integer, GenericType> getOzmosiOrangepurpleDailyResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOzmosiOrangepurpleDailyResponseTypeMap.put(200, new GenericType<OrangePurpleResponse>(){});
    getOzmosiOrangepurpleDailyResponseTypeMap.put(400, new GenericType<AuthStatus>(){});
    getOzmosiOrangepurpleDailyResponseTypeMap.put(401, new GenericType<AuthStatus>(){});
    getOzmosiOrangepurpleDailyResponseTypeMap.put(403, new GenericType<AuthStatus>(){});
    getOzmosiOrangepurpleDailyResponseTypeMap.put(500, new GenericType<AuthStatus>(){});
  }

  private static final Map<Integer, GenericType> getOzmosiPrimaryoutcomeDailyResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOzmosiPrimaryoutcomeDailyResponseTypeMap.put(200, new GenericType<PrimaryOutcomeResponse>(){});
    getOzmosiPrimaryoutcomeDailyResponseTypeMap.put(400, new GenericType<AuthStatus>(){});
    getOzmosiPrimaryoutcomeDailyResponseTypeMap.put(401, new GenericType<AuthStatus>(){});
    getOzmosiPrimaryoutcomeDailyResponseTypeMap.put(403, new GenericType<AuthStatus>(){});
    getOzmosiPrimaryoutcomeDailyResponseTypeMap.put(500, new GenericType<AuthStatus>(){});
  }

  private static final Map<Integer, GenericType> getOzmosiSponsorsDailyResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOzmosiSponsorsDailyResponseTypeMap.put(200, new GenericType<SponsorsResponse>(){});
    getOzmosiSponsorsDailyResponseTypeMap.put(400, new GenericType<AuthStatus>(){});
    getOzmosiSponsorsDailyResponseTypeMap.put(401, new GenericType<AuthStatus>(){});
    getOzmosiSponsorsDailyResponseTypeMap.put(403, new GenericType<AuthStatus>(){});
    getOzmosiSponsorsDailyResponseTypeMap.put(500, new GenericType<AuthStatus>(){});
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
   * Returns the daily files of Biomarkers Details from Open:FactSet Partner - Ozmosi.
   * Returns the daily files of Biomarkers Details from Open:FactSet Partner - Ozmosi.
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param clinicalTrialId This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
   * @param biomarkerName This parameter specifies the abbreviated name of any patient biomarkers being targeted for research in the trial. (optional)
   * @param biomarkerFullName Specifies the full name of the biomarker. (optional)
   * @return BiomarkersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for Biomarkers Details. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public BiomarkersResponse getOzmosiBiomarkersDaily(Integer paginationLimit, Integer paginationOffset, String clinicalTrialId, String biomarkerName, String biomarkerFullName) throws ApiException {
    return getOzmosiBiomarkersDailyWithHttpInfo(paginationLimit, paginationOffset, clinicalTrialId, biomarkerName, biomarkerFullName).getData();
  }

  /**
   * Returns the daily files of Biomarkers Details from Open:FactSet Partner - Ozmosi.
   * Returns the daily files of Biomarkers Details from Open:FactSet Partner - Ozmosi.
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param clinicalTrialId This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
   * @param biomarkerName This parameter specifies the abbreviated name of any patient biomarkers being targeted for research in the trial. (optional)
   * @param biomarkerFullName Specifies the full name of the biomarker. (optional)
   * @return ApiResponse&lt;BiomarkersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for Biomarkers Details. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BiomarkersResponse> getOzmosiBiomarkersDailyWithHttpInfo(Integer paginationLimit, Integer paginationOffset, String clinicalTrialId, String biomarkerName, String biomarkerFullName) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/ozmosi/biomarkers/daily";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "clinicalTrialId", clinicalTrialId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "biomarkerName", biomarkerName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "biomarkerFullName", biomarkerFullName));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        BiomarkersResponse
      
    > apiResponse = apiClient.invokeAPI("OzmosiApi.getOzmosiBiomarkersDaily", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOzmosiBiomarkersDailyResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the daily files of Clinical Trial Details from Open:FactSet Partner - Ozmosi.
   * Returns the daily files of Clinical Trial Details from Open:FactSet Partner - Ozmosi.
   * @param sort Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)
   * @param paginationLimit Specifies the maximum number of results to return per result Default value 20 and Maximum value 300 (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param clinicalTrialId This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
   * @param officialTitle Specifies full scientific title of a trial. (optional)
   * @param trialId This parameter specifies ID of the trial assigned by the trial registry. (optional)
   * @param date Specifies the timestamp of each version of a trial in YYYY-MM-DD format. (optional)
   * @return DataResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for Clinical Trial Details. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public DataResponse getOzmosiClinicalTrialsDaily(String sort, Integer paginationLimit, Integer paginationOffset, String clinicalTrialId, String officialTitle, String trialId, OffsetDateTime date) throws ApiException {
    return getOzmosiClinicalTrialsDailyWithHttpInfo(sort, paginationLimit, paginationOffset, clinicalTrialId, officialTitle, trialId, date).getData();
  }

  /**
   * Returns the daily files of Clinical Trial Details from Open:FactSet Partner - Ozmosi.
   * Returns the daily files of Clinical Trial Details from Open:FactSet Partner - Ozmosi.
   * @param sort Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)
   * @param paginationLimit Specifies the maximum number of results to return per result Default value 20 and Maximum value 300 (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param clinicalTrialId This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
   * @param officialTitle Specifies full scientific title of a trial. (optional)
   * @param trialId This parameter specifies ID of the trial assigned by the trial registry. (optional)
   * @param date Specifies the timestamp of each version of a trial in YYYY-MM-DD format. (optional)
   * @return ApiResponse&lt;DataResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for Clinical Trial Details. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DataResponse> getOzmosiClinicalTrialsDailyWithHttpInfo(String sort, Integer paginationLimit, Integer paginationOffset, String clinicalTrialId, String officialTitle, String trialId, OffsetDateTime date) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/ozmosi/clinical-trials/daily";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "clinicalTrialId", clinicalTrialId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "officialTitle", officialTitle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trialId", trialId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        DataResponse
      
    > apiResponse = apiClient.invokeAPI("OzmosiApi.getOzmosiClinicalTrialsDaily", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOzmosiClinicalTrialsDailyResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the history files from Open:FactSet Partner - Ozmosi
   * Returns the historical files from June 23rd, 2005 to current date.
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @return FullHistoryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for Ozmosi full history. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public FullHistoryResponse getOzmosiClinicalTrialsHistory(Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return getOzmosiClinicalTrialsHistoryWithHttpInfo(paginationLimit, paginationOffset).getData();
  }

  /**
   * Returns the history files from Open:FactSet Partner - Ozmosi
   * Returns the historical files from June 23rd, 2005 to current date.
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @return ApiResponse&lt;FullHistoryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for Ozmosi full history. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FullHistoryResponse> getOzmosiClinicalTrialsHistoryWithHttpInfo(Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/ozmosi/clinical-trials/history";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

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
        
        FullHistoryResponse
      
    > apiResponse = apiClient.invokeAPI("OzmosiApi.getOzmosiClinicalTrialsHistory", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOzmosiClinicalTrialsHistoryResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the daily files of Collaborators Details from Open:FactSet Partner - Ozmosi.
   * Returns the daily files of Collaborators Details from Open:FactSet Partner - Ozmosi.
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param clinicalTrialId This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
   * @param beamCollaboratorsName It specifies the cleaned name of the collaborator. (optional)
   * @param beamCollaboratorsTicker It specifies the Stock ticker for collaborator. (optional)
   * @return CollaboratorsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for Collaborators Details.. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public CollaboratorsResponse getOzmosiCollaboratorsDaily(Integer paginationLimit, Integer paginationOffset, String clinicalTrialId, String beamCollaboratorsName, String beamCollaboratorsTicker) throws ApiException {
    return getOzmosiCollaboratorsDailyWithHttpInfo(paginationLimit, paginationOffset, clinicalTrialId, beamCollaboratorsName, beamCollaboratorsTicker).getData();
  }

  /**
   * Returns the daily files of Collaborators Details from Open:FactSet Partner - Ozmosi.
   * Returns the daily files of Collaborators Details from Open:FactSet Partner - Ozmosi.
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param clinicalTrialId This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
   * @param beamCollaboratorsName It specifies the cleaned name of the collaborator. (optional)
   * @param beamCollaboratorsTicker It specifies the Stock ticker for collaborator. (optional)
   * @return ApiResponse&lt;CollaboratorsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for Collaborators Details.. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CollaboratorsResponse> getOzmosiCollaboratorsDailyWithHttpInfo(Integer paginationLimit, Integer paginationOffset, String clinicalTrialId, String beamCollaboratorsName, String beamCollaboratorsTicker) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/ozmosi/collaborators/daily";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "clinicalTrialId", clinicalTrialId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "beamCollaboratorsName", beamCollaboratorsName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "beamCollaboratorsTicker", beamCollaboratorsTicker));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        CollaboratorsResponse
      
    > apiResponse = apiClient.invokeAPI("OzmosiApi.getOzmosiCollaboratorsDaily", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOzmosiCollaboratorsDailyResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the daily files of Diseases Details from Open:FactSet Partner- Ozmosi.
   * Returns the daily files of Diseases Details from Open:FactSet Partner- Ozmosi.
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param clinicalTrialId This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
   * @param diseaseArea Specifies the cleaned disease name. (optional)
   * @param subTherapyArea Specifies the Sub Therapy Area of the disease. (optional)
   * @param therapyArea Specifies the Therapy Area of the disease. (optional)
   * @return DiseasesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for Diseases Details. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public DiseasesResponse getOzmosiDiseasesDaily(Integer paginationLimit, Integer paginationOffset, String clinicalTrialId, String diseaseArea, String subTherapyArea, String therapyArea) throws ApiException {
    return getOzmosiDiseasesDailyWithHttpInfo(paginationLimit, paginationOffset, clinicalTrialId, diseaseArea, subTherapyArea, therapyArea).getData();
  }

  /**
   * Returns the daily files of Diseases Details from Open:FactSet Partner- Ozmosi.
   * Returns the daily files of Diseases Details from Open:FactSet Partner- Ozmosi.
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param clinicalTrialId This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
   * @param diseaseArea Specifies the cleaned disease name. (optional)
   * @param subTherapyArea Specifies the Sub Therapy Area of the disease. (optional)
   * @param therapyArea Specifies the Therapy Area of the disease. (optional)
   * @return ApiResponse&lt;DiseasesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for Diseases Details. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DiseasesResponse> getOzmosiDiseasesDailyWithHttpInfo(Integer paginationLimit, Integer paginationOffset, String clinicalTrialId, String diseaseArea, String subTherapyArea, String therapyArea) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/ozmosi/diseases/daily";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "clinicalTrialId", clinicalTrialId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "diseaseArea", diseaseArea));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subTherapyArea", subTherapyArea));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "therapyArea", therapyArea));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        DiseasesResponse
      
    > apiResponse = apiClient.invokeAPI("OzmosiApi.getOzmosiDiseasesDaily", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOzmosiDiseasesDailyResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the daily files of Beam Endpoints Details from Open:FactSet Partner - Ozmosi.
   * Returns the daily files of Beam Endpoints Details from Open:FactSet Partner - Ozmosi.
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param clinicalTrialId This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
   * @param name This parameter specifies cleaned and standardized abbreviations of primary endpoints that are common or of key interest. (optional)
   * @param fullForm This parameter specifies cleaned and standardized full names of primary endpoints that are common or of key interest. (optional)
   * @return BeamEndpointsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for Beam Endpoint Details. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public BeamEndpointsResponse getOzmosiEndpointsDaily(Integer paginationLimit, Integer paginationOffset, String clinicalTrialId, String name, String fullForm) throws ApiException {
    return getOzmosiEndpointsDailyWithHttpInfo(paginationLimit, paginationOffset, clinicalTrialId, name, fullForm).getData();
  }

  /**
   * Returns the daily files of Beam Endpoints Details from Open:FactSet Partner - Ozmosi.
   * Returns the daily files of Beam Endpoints Details from Open:FactSet Partner - Ozmosi.
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param clinicalTrialId This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
   * @param name This parameter specifies cleaned and standardized abbreviations of primary endpoints that are common or of key interest. (optional)
   * @param fullForm This parameter specifies cleaned and standardized full names of primary endpoints that are common or of key interest. (optional)
   * @return ApiResponse&lt;BeamEndpointsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for Beam Endpoint Details. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BeamEndpointsResponse> getOzmosiEndpointsDailyWithHttpInfo(Integer paginationLimit, Integer paginationOffset, String clinicalTrialId, String name, String fullForm) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/ozmosi/beam-endpoints/daily";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "clinicalTrialId", clinicalTrialId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fullForm", fullForm));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        BeamEndpointsResponse
      
    > apiResponse = apiClient.invokeAPI("OzmosiApi.getOzmosiEndpointsDaily", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOzmosiEndpointsDailyResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the daily files of Intervention details from Open:FactSet Partner - Ozmosi.
   * Returns the daily files of Intervention details from Open:FactSet Partner - Ozmosi.
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param clinicalTrialId This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
   * @param beamInterventionName This parameter specifies the name of intervention applied. (optional)
   * @param beamInterventionDesc It specifies the description of intervention applied. (optional)
   * @return InterventionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for Intervention Details. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public InterventionResponse getOzmosiInterventionDaily(Integer paginationLimit, Integer paginationOffset, String clinicalTrialId, String beamInterventionName, String beamInterventionDesc) throws ApiException {
    return getOzmosiInterventionDailyWithHttpInfo(paginationLimit, paginationOffset, clinicalTrialId, beamInterventionName, beamInterventionDesc).getData();
  }

  /**
   * Returns the daily files of Intervention details from Open:FactSet Partner - Ozmosi.
   * Returns the daily files of Intervention details from Open:FactSet Partner - Ozmosi.
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param clinicalTrialId This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
   * @param beamInterventionName This parameter specifies the name of intervention applied. (optional)
   * @param beamInterventionDesc It specifies the description of intervention applied. (optional)
   * @return ApiResponse&lt;InterventionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for Intervention Details. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InterventionResponse> getOzmosiInterventionDailyWithHttpInfo(Integer paginationLimit, Integer paginationOffset, String clinicalTrialId, String beamInterventionName, String beamInterventionDesc) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/ozmosi/intervention/daily";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "clinicalTrialId", clinicalTrialId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "beamInterventionName", beamInterventionName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "beamInterventionDesc", beamInterventionDesc));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InterventionResponse
      
    > apiResponse = apiClient.invokeAPI("OzmosiApi.getOzmosiInterventionDaily", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOzmosiInterventionDailyResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the daily files of OrangePurple Details from Open:FactSet Partner - Ozmosi.
   * Returns the daily files of OrangePurple Details from Open:FaStset Partner - Ozmosi.
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param clinicalTrialId This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
   * @param beamOpNovelDrug This parameter identifies if the trial includes a drug that is not approved by the FDA. (optional)
   * @param beamOpNovelTarget It lists the unapproved drug. (optional)
   * @return OrangePurpleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for OrangePurple Details. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public OrangePurpleResponse getOzmosiOrangepurpleDaily(Integer paginationLimit, Integer paginationOffset, String clinicalTrialId, String beamOpNovelDrug, String beamOpNovelTarget) throws ApiException {
    return getOzmosiOrangepurpleDailyWithHttpInfo(paginationLimit, paginationOffset, clinicalTrialId, beamOpNovelDrug, beamOpNovelTarget).getData();
  }

  /**
   * Returns the daily files of OrangePurple Details from Open:FactSet Partner - Ozmosi.
   * Returns the daily files of OrangePurple Details from Open:FaStset Partner - Ozmosi.
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param clinicalTrialId This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
   * @param beamOpNovelDrug This parameter identifies if the trial includes a drug that is not approved by the FDA. (optional)
   * @param beamOpNovelTarget It lists the unapproved drug. (optional)
   * @return ApiResponse&lt;OrangePurpleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for OrangePurple Details. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OrangePurpleResponse> getOzmosiOrangepurpleDailyWithHttpInfo(Integer paginationLimit, Integer paginationOffset, String clinicalTrialId, String beamOpNovelDrug, String beamOpNovelTarget) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/ozmosi/orangepurple/daily";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "clinicalTrialId", clinicalTrialId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "beamOpNovelDrug", beamOpNovelDrug));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "beamOpNovelTarget", beamOpNovelTarget));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        OrangePurpleResponse
      
    > apiResponse = apiClient.invokeAPI("OzmosiApi.getOzmosiOrangepurpleDaily", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOzmosiOrangepurpleDailyResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the daily files of PrimaryOutcome Details from Open:FactSet Partner - Ozmosi.
   * Returns the daily files of PrimaryOutcome Details from Open:FactSet Partner - Ozmosi.
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param clinicalTrialId This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
   * @param primaryOutcomeMeasure It specifies the description of each primary outcome measure (or for observational studies, specific key measurement[s] or observation[s] used to describe patterns of diseases or traits or associations with exposures, risk factors or treatment). (optional)
   * @param primaryOutcomeDesc It describes the metric used to characterize the specific primary outcome measure, if not included in the primary outcome measure title. (optional)
   * @return PrimaryOutcomeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for PrimaryOutcome Details </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public PrimaryOutcomeResponse getOzmosiPrimaryoutcomeDaily(Integer paginationLimit, Integer paginationOffset, String clinicalTrialId, String primaryOutcomeMeasure, String primaryOutcomeDesc) throws ApiException {
    return getOzmosiPrimaryoutcomeDailyWithHttpInfo(paginationLimit, paginationOffset, clinicalTrialId, primaryOutcomeMeasure, primaryOutcomeDesc).getData();
  }

  /**
   * Returns the daily files of PrimaryOutcome Details from Open:FactSet Partner - Ozmosi.
   * Returns the daily files of PrimaryOutcome Details from Open:FactSet Partner - Ozmosi.
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param clinicalTrialId This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
   * @param primaryOutcomeMeasure It specifies the description of each primary outcome measure (or for observational studies, specific key measurement[s] or observation[s] used to describe patterns of diseases or traits or associations with exposures, risk factors or treatment). (optional)
   * @param primaryOutcomeDesc It describes the metric used to characterize the specific primary outcome measure, if not included in the primary outcome measure title. (optional)
   * @return ApiResponse&lt;PrimaryOutcomeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for PrimaryOutcome Details </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PrimaryOutcomeResponse> getOzmosiPrimaryoutcomeDailyWithHttpInfo(Integer paginationLimit, Integer paginationOffset, String clinicalTrialId, String primaryOutcomeMeasure, String primaryOutcomeDesc) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/ozmosi/primaryoutcome/daily";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "clinicalTrialId", clinicalTrialId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "primaryOutcomeMeasure", primaryOutcomeMeasure));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "primaryOutcomeDesc", primaryOutcomeDesc));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        PrimaryOutcomeResponse
      
    > apiResponse = apiClient.invokeAPI("OzmosiApi.getOzmosiPrimaryoutcomeDaily", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOzmosiPrimaryoutcomeDailyResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the daily files of Sponsors Details from Open:FactSet Partner - Ozmosi.
   * Returns the daily files of Sponsors Details from Open:FactSet Partner - Ozmosi.
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param clinicalTrialId This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
   * @param beamSponsorsName It specifies the cleaned name of the Sponsor. (optional)
   * @param beamSponsorsTicker It specifies the stock ticker for primary sponsor. (optional)
   * @return SponsorsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for Sponsors Details. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public SponsorsResponse getOzmosiSponsorsDaily(Integer paginationLimit, Integer paginationOffset, String clinicalTrialId, String beamSponsorsName, String beamSponsorsTicker) throws ApiException {
    return getOzmosiSponsorsDailyWithHttpInfo(paginationLimit, paginationOffset, clinicalTrialId, beamSponsorsName, beamSponsorsTicker).getData();
  }

  /**
   * Returns the daily files of Sponsors Details from Open:FactSet Partner - Ozmosi.
   * Returns the daily files of Sponsors Details from Open:FactSet Partner - Ozmosi.
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param clinicalTrialId This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
   * @param beamSponsorsName It specifies the cleaned name of the Sponsor. (optional)
   * @param beamSponsorsTicker It specifies the stock ticker for primary sponsor. (optional)
   * @return ApiResponse&lt;SponsorsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for Sponsors Details. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SponsorsResponse> getOzmosiSponsorsDailyWithHttpInfo(Integer paginationLimit, Integer paginationOffset, String clinicalTrialId, String beamSponsorsName, String beamSponsorsTicker) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/ozmosi/sponsors/daily";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "clinicalTrialId", clinicalTrialId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "beamSponsorsName", beamSponsorsName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "beamSponsorsTicker", beamSponsorsTicker));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        SponsorsResponse
      
    > apiResponse = apiClient.invokeAPI("OzmosiApi.getOzmosiSponsorsDaily", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOzmosiSponsorsDailyResponseTypeMap, false);

    return apiResponse;

  }
}
