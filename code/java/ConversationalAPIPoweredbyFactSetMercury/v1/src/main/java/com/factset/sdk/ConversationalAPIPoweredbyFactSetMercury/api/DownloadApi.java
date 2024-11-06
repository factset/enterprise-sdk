package com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.api;

import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiException;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiClient;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiResponse;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.Configuration;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.BadRequestError;
import java.io.File;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.FileDownloadRequest;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.ForbiddenError;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.InternalServerError;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.ResourceNotFoundError;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class DownloadApi {
  private ApiClient apiClient;

  public DownloadApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DownloadApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> downloadFileResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    downloadFileResponseTypeMap.put(200, new GenericType<File>(){});
    downloadFileResponseTypeMap.put(400, new GenericType<BadRequestError>(){});
    downloadFileResponseTypeMap.put(401, new GenericType<String>(){});
    downloadFileResponseTypeMap.put(403, new GenericType<String>(){});
    downloadFileResponseTypeMap.put(404, new GenericType<ResourceNotFoundError>(){});
    downloadFileResponseTypeMap.put(405, new GenericType<String>(){});
    downloadFileResponseTypeMap.put(500, new GenericType<InternalServerError>(){});
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
   * Retrieve data file based on file ID.
   * If your response from the &#x60;/result&#x60; endpoint contains a file ID within a NextStep Download action, you can retrieve the file using this endpoint.  Files are available for download for 24 hours after generation.  Returns a downloadable Excel .xlsx file referenced in the NextStep action returned from the &#x60;/result&#x60; endpoint.  Any of the following content can be embedded into a downloadable Excel file: * ActiveGraph * ExcelChart * STACH Table (as Excel) 
   * @param fileDownloadRequest ID refers to the file ID in the NextStep action returned from the &#x60;/result&#x60; endpoint (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Content-Disposition - Content is expected to be an attachment. <br>  * Content-Type - Content type of the file. <br>  * Transfer-Encoding - Form of encoding used for the file. <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * Api-Deprected-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed [via this developer portal page](https://developer.factset.com/manage-api-keys)) or valid OAuth 2.0 credentials (see [OAuth 2.0 documentation on the developer portal](https://developer.factset.com/learn/authentication-oauth2)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have the proper permissions for this request. Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource Not Found - Could not find the requested resource. Please make sure you are using a valid endpoint and resource ID for the request. </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed - The requested endpoint does not support the used HTTP method. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - This endpoint is currently rate-limited to 10 requests per second for an individual user serial. If you are receiving an unexpected amount of these errors, please contact the API team at [genai.offplatform@factset.com](genai.offplatform@factset.com). </td><td>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public File downloadFile(FileDownloadRequest fileDownloadRequest) throws ApiException {
    return downloadFileWithHttpInfo(fileDownloadRequest).getData();
  }

  /**
   * Retrieve data file based on file ID.
   * If your response from the &#x60;/result&#x60; endpoint contains a file ID within a NextStep Download action, you can retrieve the file using this endpoint.  Files are available for download for 24 hours after generation.  Returns a downloadable Excel .xlsx file referenced in the NextStep action returned from the &#x60;/result&#x60; endpoint.  Any of the following content can be embedded into a downloadable Excel file: * ActiveGraph * ExcelChart * STACH Table (as Excel) 
   * @param fileDownloadRequest ID refers to the file ID in the NextStep action returned from the &#x60;/result&#x60; endpoint (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Content-Disposition - Content is expected to be an attachment. <br>  * Content-Type - Content type of the file. <br>  * Transfer-Encoding - Form of encoding used for the file. <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * Api-Deprected-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-DataDirect-Request-Key -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed [via this developer portal page](https://developer.factset.com/manage-api-keys)) or valid OAuth 2.0 credentials (see [OAuth 2.0 documentation on the developer portal](https://developer.factset.com/learn/authentication-oauth2)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - You do not have the proper permissions for this request. Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource Not Found - Could not find the requested resource. Please make sure you are using a valid endpoint and resource ID for the request. </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed - The requested endpoint does not support the used HTTP method. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - This endpoint is currently rate-limited to 10 requests per second for an individual user serial. If you are receiving an unexpected amount of these errors, please contact the API team at [genai.offplatform@factset.com](genai.offplatform@factset.com). </td><td>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> downloadFileWithHttpInfo(FileDownloadRequest fileDownloadRequest) throws ApiException {
    Object localVarPostBody = fileDownloadRequest;
    
    // verify the required parameter 'fileDownloadRequest' is set
    if (fileDownloadRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'fileDownloadRequest' when calling downloadFile");
    }
    
    // create path and map variables
    String localVarPath = "/download/file";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/json", "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        File
      
    > apiResponse = apiClient.invokeAPI("DownloadApi.downloadFile", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, downloadFileResponseTypeMap, false);

    return apiResponse;

  }
}
