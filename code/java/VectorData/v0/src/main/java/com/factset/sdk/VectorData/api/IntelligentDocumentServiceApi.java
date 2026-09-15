package com.factset.sdk.VectorData.api;

import com.factset.sdk.VectorData.ApiException;
import com.factset.sdk.VectorData.ApiClient;
import com.factset.sdk.VectorData.ApiResponse;
import com.factset.sdk.VectorData.Configuration;
import com.factset.sdk.VectorData.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.VectorData.models.ErrorResult;
import com.factset.sdk.VectorData.models.IdsDocumentDownloadRequest;
import com.factset.sdk.VectorData.models.IdsDocumentDownloadResponse;
import com.factset.sdk.VectorData.models.IdsDocumentSearchRequest;
import com.factset.sdk.VectorData.models.IdsDocumentSearchResponse;
import com.factset.sdk.VectorData.models.IdsDocumentStatusRequest;
import com.factset.sdk.VectorData.models.IdsDocumentStatusResponse;
import com.factset.sdk.VectorData.models.IdsDocumentUploadRequest;
import com.factset.sdk.VectorData.models.IdsDocumentUploadResponse;
import com.factset.sdk.VectorData.models.IdsDocumentsListResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class IntelligentDocumentServiceApi {
  private ApiClient apiClient;

  public IntelligentDocumentServiceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IntelligentDocumentServiceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> createIdsDocumentUploadResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createIdsDocumentUploadResponseTypeMap.put(202, new GenericType<IdsDocumentUploadResponse>(){});
    createIdsDocumentUploadResponseTypeMap.put(400, new GenericType<ErrorResult>(){});
    createIdsDocumentUploadResponseTypeMap.put(401, new GenericType<ErrorResult>(){});
    createIdsDocumentUploadResponseTypeMap.put(403, new GenericType<ErrorResult>(){});
    createIdsDocumentUploadResponseTypeMap.put(404, new GenericType<ErrorResult>(){});
    createIdsDocumentUploadResponseTypeMap.put(415, new GenericType<ErrorResult>(){});
    createIdsDocumentUploadResponseTypeMap.put(422, new GenericType<ErrorResult>(){});
    createIdsDocumentUploadResponseTypeMap.put(429, new GenericType<ErrorResult>(){});
    createIdsDocumentUploadResponseTypeMap.put(500, new GenericType<ErrorResult>(){});
  }

  private static final Map<Integer, GenericType> getIdsDocumentDownloadResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getIdsDocumentDownloadResponseTypeMap.put(200, new GenericType<IdsDocumentDownloadResponse>(){});
    getIdsDocumentDownloadResponseTypeMap.put(202, new GenericType<IdsDocumentStatusResponse>(){});
    getIdsDocumentDownloadResponseTypeMap.put(400, new GenericType<ErrorResult>(){});
    getIdsDocumentDownloadResponseTypeMap.put(401, new GenericType<ErrorResult>(){});
    getIdsDocumentDownloadResponseTypeMap.put(403, new GenericType<ErrorResult>(){});
    getIdsDocumentDownloadResponseTypeMap.put(404, new GenericType<ErrorResult>(){});
    getIdsDocumentDownloadResponseTypeMap.put(415, new GenericType<ErrorResult>(){});
    getIdsDocumentDownloadResponseTypeMap.put(422, new GenericType<ErrorResult>(){});
    getIdsDocumentDownloadResponseTypeMap.put(429, new GenericType<ErrorResult>(){});
    getIdsDocumentDownloadResponseTypeMap.put(500, new GenericType<ErrorResult>(){});
  }

  private static final Map<Integer, GenericType> getIdsDocumentStatusResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getIdsDocumentStatusResponseTypeMap.put(201, new GenericType<IdsDocumentStatusResponse>(){});
    getIdsDocumentStatusResponseTypeMap.put(202, new GenericType<IdsDocumentStatusResponse>(){});
    getIdsDocumentStatusResponseTypeMap.put(400, new GenericType<ErrorResult>(){});
    getIdsDocumentStatusResponseTypeMap.put(401, new GenericType<ErrorResult>(){});
    getIdsDocumentStatusResponseTypeMap.put(403, new GenericType<ErrorResult>(){});
    getIdsDocumentStatusResponseTypeMap.put(404, new GenericType<ErrorResult>(){});
    getIdsDocumentStatusResponseTypeMap.put(415, new GenericType<ErrorResult>(){});
    getIdsDocumentStatusResponseTypeMap.put(422, new GenericType<ErrorResult>(){});
    getIdsDocumentStatusResponseTypeMap.put(429, new GenericType<ErrorResult>(){});
    getIdsDocumentStatusResponseTypeMap.put(500, new GenericType<ErrorResult>(){});
  }

  private static final Map<Integer, GenericType> listAllIdsDocumentsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    listAllIdsDocumentsResponseTypeMap.put(200, new GenericType<IdsDocumentsListResponse>(){});
    listAllIdsDocumentsResponseTypeMap.put(400, new GenericType<ErrorResult>(){});
    listAllIdsDocumentsResponseTypeMap.put(401, new GenericType<ErrorResult>(){});
    listAllIdsDocumentsResponseTypeMap.put(403, new GenericType<ErrorResult>(){});
    listAllIdsDocumentsResponseTypeMap.put(500, new GenericType<ErrorResult>(){});
  }

  private static final Map<Integer, GenericType> searchIdsDocumentsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    searchIdsDocumentsResponseTypeMap.put(200, new GenericType<IdsDocumentSearchResponse>(){});
    searchIdsDocumentsResponseTypeMap.put(400, new GenericType<ErrorResult>(){});
    searchIdsDocumentsResponseTypeMap.put(401, new GenericType<ErrorResult>(){});
    searchIdsDocumentsResponseTypeMap.put(403, new GenericType<ErrorResult>(){});
    searchIdsDocumentsResponseTypeMap.put(415, new GenericType<ErrorResult>(){});
    searchIdsDocumentsResponseTypeMap.put(422, new GenericType<ErrorResult>(){});
    searchIdsDocumentsResponseTypeMap.put(429, new GenericType<ErrorResult>(){});
    searchIdsDocumentsResponseTypeMap.put(500, new GenericType<ErrorResult>(){});
  }

  
 /**
   * Wrapper to support POST /documents/download returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code IdsDocumentDownloadResponse }<br>Presigned download URL returned.</li>
   * 
   *   <li>202 : {@code IdsDocumentStatusResponse }<br>Document is still being processed. Poll status before downloading.</li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetIdsDocumentDownloadResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     IdsDocumentDownloadResponse data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     IdsDocumentStatusResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetIdsDocumentDownloadResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetIdsDocumentDownloadResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public IdsDocumentDownloadResponse getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (IdsDocumentDownloadResponse) this.response;
    }
    
    public IdsDocumentStatusResponse getResponse202() throws ApiException {
      if (this.statusCode != 202) {
        throw new ApiException(500, "Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
      }
      return (IdsDocumentStatusResponse) this.response;
    }
    

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      GetIdsDocumentDownloadResponseWrapper other = (GetIdsDocumentDownloadResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetIdsDocumentDownloadResponseWrapper {\n"
       + "    statusCode: " + statusCode + "\n"
       + "    response: "
       + Objects.toString(response).replace("\n", "\n    ")
       + "\n}";
    }
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
   * Register a document and receive a presigned upload URL
   * Registers a document for Intelligent Document Service ingestion and returns a document ID plus a short-lived presigned HTTPS URL. PUT the file to that URL, then poll &#x60;/documents/status&#x60; until the document reaches a terminal state (&#x60;success&#x60; or &#x60;failed&#x60;). Supported file types include Pdf, Text, Html, Md and Xml.
   * @param idsDocumentUploadRequest Document registration request. (required)
   * @return IdsDocumentUploadResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Document registered. Presigned upload URL returned. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request - malformed syntax or missing required fields. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated - missing or invalid credentials. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - authenticated but not authorised. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified documentID was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity - document exists but is not in awaitingUpload status. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - rate limit exceeded. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public IdsDocumentUploadResponse createIdsDocumentUpload(IdsDocumentUploadRequest idsDocumentUploadRequest) throws ApiException {
    return createIdsDocumentUploadWithHttpInfo(idsDocumentUploadRequest).getData();
  }

  /**
   * Register a document and receive a presigned upload URL
   * Registers a document for Intelligent Document Service ingestion and returns a document ID plus a short-lived presigned HTTPS URL. PUT the file to that URL, then poll &#x60;/documents/status&#x60; until the document reaches a terminal state (&#x60;success&#x60; or &#x60;failed&#x60;). Supported file types include Pdf, Text, Html, Md and Xml.
   * @param idsDocumentUploadRequest Document registration request. (required)
   * @return ApiResponse&lt;IdsDocumentUploadResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Document registered. Presigned upload URL returned. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request - malformed syntax or missing required fields. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated - missing or invalid credentials. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - authenticated but not authorised. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified documentID was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity - document exists but is not in awaitingUpload status. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests - rate limit exceeded. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IdsDocumentUploadResponse> createIdsDocumentUploadWithHttpInfo(IdsDocumentUploadRequest idsDocumentUploadRequest) throws ApiException {
    Object localVarPostBody = idsDocumentUploadRequest;
    
    // verify the required parameter 'idsDocumentUploadRequest' is set
    if (idsDocumentUploadRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'idsDocumentUploadRequest' when calling createIdsDocumentUpload");
    }
    
    // create path and map variables
    String localVarPath = "/documents/register";

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
        
        IdsDocumentUploadResponse
      
    > apiResponse = apiClient.invokeAPI("IntelligentDocumentServiceApi.createIdsDocumentUpload", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createIdsDocumentUploadResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get a presigned URL to download processed document output.
   * Returns a short-lived presigned HTTPS URL for each requested document so the client can download the processed output JSON. Accepts one or more &#x60;documentIDs&#x60;. Available only when a document status is &#x60;Success&#x60; — returns &#x60;422&#x60; if status is not &#x60;Success&#x60;, and &#x60;202&#x60; if the document is still inprogress (&#x60;AwaitingUpload&#x60; or &#x60;Processing&#x60;). Prefer polling &#x60;/documents/status&#x60; until terminal before calling this endpoint.
   * @param idsDocumentDownloadRequest Document download request. (required)
   * @return GetIdsDocumentDownloadResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Presigned download URL returned. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Document is still being processed. Poll status before downloading. </td><td>  * Location - Path to Batch Request status. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified documentID was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity - document status is not success; download is only available after successful processing. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public GetIdsDocumentDownloadResponseWrapper getIdsDocumentDownload(IdsDocumentDownloadRequest idsDocumentDownloadRequest) throws ApiException {
    return getIdsDocumentDownloadWithHttpInfo(idsDocumentDownloadRequest).getData();
  }

  /**
   * Get a presigned URL to download processed document output.
   * Returns a short-lived presigned HTTPS URL for each requested document so the client can download the processed output JSON. Accepts one or more &#x60;documentIDs&#x60;. Available only when a document status is &#x60;Success&#x60; — returns &#x60;422&#x60; if status is not &#x60;Success&#x60;, and &#x60;202&#x60; if the document is still inprogress (&#x60;AwaitingUpload&#x60; or &#x60;Processing&#x60;). Prefer polling &#x60;/documents/status&#x60; until terminal before calling this endpoint.
   * @param idsDocumentDownloadRequest Document download request. (required)
   * @return ApiResponse&lt;GetIdsDocumentDownloadResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Presigned download URL returned. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Document is still being processed. Poll status before downloading. </td><td>  * Location - Path to Batch Request status. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified documentID was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity - document status is not success; download is only available after successful processing. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetIdsDocumentDownloadResponseWrapper> getIdsDocumentDownloadWithHttpInfo(IdsDocumentDownloadRequest idsDocumentDownloadRequest) throws ApiException {
    Object localVarPostBody = idsDocumentDownloadRequest;
    
    // verify the required parameter 'idsDocumentDownloadRequest' is set
    if (idsDocumentDownloadRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'idsDocumentDownloadRequest' when calling getIdsDocumentDownload");
    }
    
    // create path and map variables
    String localVarPath = "/documents/download";

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
        Object
        
      
    > apiResponse = apiClient.invokeAPI("IntelligentDocumentServiceApi.getIdsDocumentDownload", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getIdsDocumentDownloadResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetIdsDocumentDownloadResponseWrapper responseWrapper = new GetIdsDocumentDownloadResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetIdsDocumentDownloadResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
  /**
   * Retrieve ingestion status for one or more documents.
   * Returns the current lifecycle state for each requested document ID, including timestamps and any pipeline failure details. Accepts one or more &#x60;documentIDs&#x60;. Returns &#x60;201&#x60; when all requested documents are in a terminal state (&#x60;Success&#x60;or &#x60;Failed&#x60;), and &#x60;202&#x60; while any are still in progress (&#x60;AwaitingUpload&#x60; or&#x60;Processing&#x60;). Poll until a &#x60;201&#x60; is received before calling&#x60;/documents/download&#x60; or &#x60;/documents/search&#x60;.
   * @param idsDocumentStatusRequest Document status request. (required)
   * @return IdsDocumentStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Terminal status returned (success or failed). </td><td>  * Location - Path to Batch Request status. <br>  </td></tr>
       <tr><td> 202 </td><td> Document is still in-progress. Poll again shortly. </td><td>  * Location - Path to Batch Request status. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified documentID was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public IdsDocumentStatusResponse getIdsDocumentStatus(IdsDocumentStatusRequest idsDocumentStatusRequest) throws ApiException {
    return getIdsDocumentStatusWithHttpInfo(idsDocumentStatusRequest).getData();
  }

  /**
   * Retrieve ingestion status for one or more documents.
   * Returns the current lifecycle state for each requested document ID, including timestamps and any pipeline failure details. Accepts one or more &#x60;documentIDs&#x60;. Returns &#x60;201&#x60; when all requested documents are in a terminal state (&#x60;Success&#x60;or &#x60;Failed&#x60;), and &#x60;202&#x60; while any are still in progress (&#x60;AwaitingUpload&#x60; or&#x60;Processing&#x60;). Poll until a &#x60;201&#x60; is received before calling&#x60;/documents/download&#x60; or &#x60;/documents/search&#x60;.
   * @param idsDocumentStatusRequest Document status request. (required)
   * @return ApiResponse&lt;IdsDocumentStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Terminal status returned (success or failed). </td><td>  * Location - Path to Batch Request status. <br>  </td></tr>
       <tr><td> 202 </td><td> Document is still in-progress. Poll again shortly. </td><td>  * Location - Path to Batch Request status. <br>  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified documentID was not found. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IdsDocumentStatusResponse> getIdsDocumentStatusWithHttpInfo(IdsDocumentStatusRequest idsDocumentStatusRequest) throws ApiException {
    Object localVarPostBody = idsDocumentStatusRequest;
    
    // verify the required parameter 'idsDocumentStatusRequest' is set
    if (idsDocumentStatusRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'idsDocumentStatusRequest' when calling getIdsDocumentStatus");
    }
    
    // create path and map variables
    String localVarPath = "/documents/status";

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
        
        IdsDocumentStatusResponse
      
    > apiResponse = apiClient.invokeAPI("IntelligentDocumentServiceApi.getIdsDocumentStatus", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getIdsDocumentStatusResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * List all uploaded documents
   * Returns a paginated list of all documents uploaded by the authenticated tenant.
   * @param paginationLimit Number of results to return per page. (optional, default to 10)
   * @param paginationOffset Page number of the results to return.  (optional, default to 0)
   * @return IdsDocumentsListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Document list returned. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public IdsDocumentsListResponse listAllIdsDocuments(Integer paginationLimit, Integer paginationOffset) throws ApiException {
    return listAllIdsDocumentsWithHttpInfo(paginationLimit, paginationOffset).getData();
  }

  /**
   * List all uploaded documents
   * Returns a paginated list of all documents uploaded by the authenticated tenant.
   * @param paginationLimit Number of results to return per page. (optional, default to 10)
   * @param paginationOffset Page number of the results to return.  (optional, default to 0)
   * @return ApiResponse&lt;IdsDocumentsListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Document list returned. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IdsDocumentsListResponse> listAllIdsDocumentsWithHttpInfo(Integer paginationLimit, Integer paginationOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/documents/list";

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
        
        IdsDocumentsListResponse
      
    > apiResponse = apiClient.invokeAPI("IntelligentDocumentServiceApi.listAllIdsDocuments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, listAllIdsDocumentsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Semantically search uploaded documents
   * Performs natural-language semantic search across documents ingested through the Intelligent Document Service and returns matching chunks ranked by similarity score. Requires a &#x60;query&#x60; and one or more &#x60;sources&#x60;. Optionally restrict results to specific &#x60;documentIDs&#x60;. Supports offset pagination and sorting by &#x60;SimilarityScore&#x60;.
   * @param idsDocumentSearchRequest Document search request. (required)
   * @return IdsDocumentSearchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Search results returned, ranked by similarity score. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public IdsDocumentSearchResponse searchIdsDocuments(IdsDocumentSearchRequest idsDocumentSearchRequest) throws ApiException {
    return searchIdsDocumentsWithHttpInfo(idsDocumentSearchRequest).getData();
  }

  /**
   * Semantically search uploaded documents
   * Performs natural-language semantic search across documents ingested through the Intelligent Document Service and returns matching chunks ranked by similarity score. Requires a &#x60;query&#x60; and one or more &#x60;sources&#x60;. Optionally restrict results to specific &#x60;documentIDs&#x60;. Supports offset pagination and sorting by &#x60;SimilarityScore&#x60;.
   * @param idsDocumentSearchRequest Document search request. (required)
   * @return ApiResponse&lt;IdsDocumentSearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Search results returned, ranked by similarity score. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity. </td><td>  -  </td></tr>
       <tr><td> 429 </td><td> Too Many Requests. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IdsDocumentSearchResponse> searchIdsDocumentsWithHttpInfo(IdsDocumentSearchRequest idsDocumentSearchRequest) throws ApiException {
    Object localVarPostBody = idsDocumentSearchRequest;
    
    // verify the required parameter 'idsDocumentSearchRequest' is set
    if (idsDocumentSearchRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'idsDocumentSearchRequest' when calling searchIdsDocuments");
    }
    
    // create path and map variables
    String localVarPath = "/documents/search";

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
        
        IdsDocumentSearchResponse
      
    > apiResponse = apiClient.invokeAPI("IntelligentDocumentServiceApi.searchIdsDocuments", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, searchIdsDocumentsResponseTypeMap, false);

    return apiResponse;

  }
}
