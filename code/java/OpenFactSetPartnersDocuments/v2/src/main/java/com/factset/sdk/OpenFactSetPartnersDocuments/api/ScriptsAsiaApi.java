package com.factset.sdk.OpenFactSetPartnersDocuments.api;

import com.factset.sdk.OpenFactSetPartnersDocuments.ApiException;
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiClient;
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiResponse;
import com.factset.sdk.OpenFactSetPartnersDocuments.Configuration;
import com.factset.sdk.OpenFactSetPartnersDocuments.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.OpenFactSetPartnersDocuments.models.AuthStatus;
import java.time.LocalDate;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.ScriptsAsiaResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ScriptsAsiaApi {
  private ApiClient apiClient;

  public ScriptsAsiaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ScriptsAsiaApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getScriptsAsiaFilesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getScriptsAsiaFilesResponseTypeMap.put(200, new GenericType<ScriptsAsiaResponse>(){});
    getScriptsAsiaFilesResponseTypeMap.put(400, new GenericType<AuthStatus>(){});
    getScriptsAsiaFilesResponseTypeMap.put(401, new GenericType<AuthStatus>(){});
    getScriptsAsiaFilesResponseTypeMap.put(403, new GenericType<AuthStatus>(){});
    getScriptsAsiaFilesResponseTypeMap.put(500, new GenericType<AuthStatus>(){});
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
   * Returns the daily files from Open:FactSet Partner - Scripts Asia.
   * Returns XML files and relevant metadata provided by Open: FactSet Partner – Scripts Asia. - type&#x3D;delta returns the files from March 1st 2023 to current date. - type&#x3D;full will returns the files from start of date until Feb 28th 2023.
   * @param sort Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param trackingId Unique Scripts Asia identifier assigned to an event.  (optional)
   * @param saId This parameter filters the results based on saId of the Transcript.  (optional)
   * @param startDate The earliest date of the Scripts Asia file the API should return based on date.  (optional)
   * @param endDate The latest date of the Scripts Asia file the API should return based on date.           (optional)
   * @param companyName This parameter filters the results based on Company Name of the Transcript.  (optional)
   * @param eventType This parameter filters the results based on eventType of the Transcript.  (optional)
   * @param languageType This parameter filters the results based on language type(either English or local) of the Transcript.  (optional, default to local)
   * @param fileName This parameter is used to filters the results based on file name. (optional)
   * @param type Specifies the type of the file. (optional, default to delta)
   * @return ScriptsAsiaResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for Scripts Asia files. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ScriptsAsiaResponse getScriptsAsiaFiles(String sort, Integer paginationLimit, Integer paginationOffset, String trackingId, String saId, LocalDate startDate, LocalDate endDate, String companyName, String eventType, String languageType, String fileName, String type) throws ApiException {
    return getScriptsAsiaFilesWithHttpInfo(sort, paginationLimit, paginationOffset, trackingId, saId, startDate, endDate, companyName, eventType, languageType, fileName, type).getData();
  }

  /**
   * Returns the daily files from Open:FactSet Partner - Scripts Asia.
   * Returns XML files and relevant metadata provided by Open: FactSet Partner – Scripts Asia. - type&#x3D;delta returns the files from March 1st 2023 to current date. - type&#x3D;full will returns the files from start of date until Feb 28th 2023.
   * @param sort Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)
   * @param paginationLimit Specifies the maximum number of results to return per result. (optional, default to 20)
   * @param paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)
   * @param trackingId Unique Scripts Asia identifier assigned to an event.  (optional)
   * @param saId This parameter filters the results based on saId of the Transcript.  (optional)
   * @param startDate The earliest date of the Scripts Asia file the API should return based on date.  (optional)
   * @param endDate The latest date of the Scripts Asia file the API should return based on date.           (optional)
   * @param companyName This parameter filters the results based on Company Name of the Transcript.  (optional)
   * @param eventType This parameter filters the results based on eventType of the Transcript.  (optional)
   * @param languageType This parameter filters the results based on language type(either English or local) of the Transcript.  (optional, default to local)
   * @param fileName This parameter is used to filters the results based on file name. (optional)
   * @param type Specifies the type of the file. (optional, default to delta)
   * @return ApiResponse&lt;ScriptsAsiaResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Download link &amp; metadata for Scripts Asia files. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScriptsAsiaResponse> getScriptsAsiaFilesWithHttpInfo(String sort, Integer paginationLimit, Integer paginationOffset, String trackingId, String saId, LocalDate startDate, LocalDate endDate, String companyName, String eventType, String languageType, String fileName, String type) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/scripts-asia/transcripts";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trackingId", trackingId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "saId", saId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "companyName", companyName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventType", eventType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "languageType", languageType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fileName", fileName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ScriptsAsiaResponse
      
    > apiResponse = apiClient.invokeAPI("ScriptsAsiaApi.getScriptsAsiaFiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getScriptsAsiaFilesResponseTypeMap, false);

    return apiResponse;

  }
}
