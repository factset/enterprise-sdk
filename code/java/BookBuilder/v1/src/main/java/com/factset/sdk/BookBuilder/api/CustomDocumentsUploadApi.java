package com.factset.sdk.BookBuilder.api;

import com.factset.sdk.BookBuilder.ApiException;
import com.factset.sdk.BookBuilder.ApiClient;
import com.factset.sdk.BookBuilder.ApiResponse;
import com.factset.sdk.BookBuilder.Configuration;
import com.factset.sdk.BookBuilder.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import java.io.File;
import com.factset.sdk.BookBuilder.models.InvalidUploadDocumentRequest;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CustomDocumentsUploadApi {
  private ApiClient apiClient;

  public CustomDocumentsUploadApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomDocumentsUploadApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> uploadCustomDocumentResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    uploadCustomDocumentResponseTypeMap.put(200, new GenericType<java.util.List<Object>>(){});
    uploadCustomDocumentResponseTypeMap.put(400, new GenericType<InvalidUploadDocumentRequest>(){});
    uploadCustomDocumentResponseTypeMap.put(401, new GenericType<String>(){});
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
   * Upload a custom document
   * Upload any third-party documents that need to be included in the final PDF. Once uploaded, the successful response will be a unique fileurl that can be used to add the files to the PDF output using the create-book endpoint. Supported files include Powerpoint, Word, RTF, and PDF. The total size should not exceed 250MB and each file should not exceed 10MB. 
   * @param _file  (optional)
   * @return java.util.List<Object>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response contains file name, fileURL of the book uploaded </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid ticker or Unknown error </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<Object> uploadCustomDocument(java.util.List<File> _file) throws ApiException {
    return uploadCustomDocumentWithHttpInfo(_file).getData();
  }

  /**
   * Upload a custom document
   * Upload any third-party documents that need to be included in the final PDF. Once uploaded, the successful response will be a unique fileurl that can be used to add the files to the PDF output using the create-book endpoint. Supported files include Powerpoint, Word, RTF, and PDF. The total size should not exceed 250MB and each file should not exceed 10MB. 
   * @param _file  (optional)
   * @return ApiResponse&lt;java.util.List<Object>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response contains file name, fileURL of the book uploaded </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid ticker or Unknown error </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<Object>> uploadCustomDocumentWithHttpInfo(java.util.List<File> _file) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/upload-custom-document";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    if (_file != null)
      localVarFormParams.put("file", _file);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        java.util.List<Object>
      
    > apiResponse = apiClient.invokeAPI("CustomDocumentsUploadApi.uploadCustomDocument", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, uploadCustomDocumentResponseTypeMap, false);

    return apiResponse;

  }
}
