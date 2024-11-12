package com.factset.sdk.ProcuretoPayInvoiceandBilling.api;

import com.factset.sdk.ProcuretoPayInvoiceandBilling.ApiException;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.ApiClient;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.ApiResponse;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.Configuration;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import java.io.File;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.models.InvoiceDetails;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InvoiceAndBillingApi {
  private ApiClient apiClient;

  public InvoiceAndBillingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InvoiceAndBillingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getFitsReportGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getFitsReportGetResponseTypeMap.put(200, new GenericType<java.util.List<Object>>(){});
    getFitsReportGetResponseTypeMap.put(404, new GenericType<String>(){});
    getFitsReportGetResponseTypeMap.put(429, new GenericType<String>(){});
  }

  private static final Map<Integer, GenericType> getInvoiceGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getInvoiceGetResponseTypeMap.put(200, new GenericType<File>(){});
    getInvoiceGetResponseTypeMap.put(404, new GenericType<String>(){});
    getInvoiceGetResponseTypeMap.put(429, new GenericType<String>(){});
  }

  private static final Map<Integer, GenericType> invoiceDetailsGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    invoiceDetailsGetResponseTypeMap.put(200, new GenericType<InvoiceDetails>(){});
    invoiceDetailsGetResponseTypeMap.put(404, new GenericType<String>(){});
    invoiceDetailsGetResponseTypeMap.put(429, new GenericType<String>(){});
  }

  private static final Map<Integer, GenericType> listInvoicesGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    listInvoicesGetResponseTypeMap.put(200, new GenericType<java.util.List<Object>>(){});
    listInvoicesGetResponseTypeMap.put(404, new GenericType<String>(){});
    listInvoicesGetResponseTypeMap.put(429, new GenericType<String>(){});
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
   * Returns Fits report by given FITSID
   * 
   * @param fitsID FITSID can be determined by concatenating the AccountNumber + two-digit year (e.g 21 for 2021) and two-digit month (e.g. 01 for January). Available AccountNumbers are available from the /listInvoices endpoint. (required)
   * @return java.util.List<Object>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> Unauthorized </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> Requested Resource not found </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 429 </td><td> Throttle Limit Reached </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public java.util.List<Object> getFitsReportGet(String fitsID) throws ApiException {
    return getFitsReportGetWithHttpInfo(fitsID).getData();
  }

  /**
   * Returns Fits report by given FITSID
   * 
   * @param fitsID FITSID can be determined by concatenating the AccountNumber + two-digit year (e.g 21 for 2021) and two-digit month (e.g. 01 for January). Available AccountNumbers are available from the /listInvoices endpoint. (required)
   * @return ApiResponse&lt;java.util.List<Object>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> Unauthorized </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> Requested Resource not found </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 429 </td><td> Throttle Limit Reached </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<Object>> getFitsReportGetWithHttpInfo(String fitsID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fitsID' is set
    if (fitsID == null) {
      throw new ApiException(400, "Missing the required parameter 'fitsID' when calling getFitsReportGet");
    }
    
    // create path and map variables
    String localVarPath = "/getFitsReport";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fitsID", fitsID));

    
    
    
    final String[] localVarAccepts = {
      "application/json; charset=utf-8", "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        java.util.List<Object>
      
    > apiResponse = apiClient.invokeAPI("InvoiceAndBillingApi.getFitsReportGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getFitsReportGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns PDF of specific invoice
   * A .PDF File
   * @param invoiceId Invoice code you wish to download (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK - PDF File download offered </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> Unauthorized </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> Requested Resource not found </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 429 </td><td> Throttle Limit Reached </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public File getInvoiceGet(String invoiceId) throws ApiException {
    return getInvoiceGetWithHttpInfo(invoiceId).getData();
  }

  /**
   * Returns PDF of specific invoice
   * A .PDF File
   * @param invoiceId Invoice code you wish to download (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK - PDF File download offered </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> Unauthorized </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> Requested Resource not found </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 429 </td><td> Throttle Limit Reached </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<File> getInvoiceGetWithHttpInfo(String invoiceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceId' is set
    if (invoiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceId' when calling getInvoiceGet");
    }
    
    // create path and map variables
    String localVarPath = "/getInvoice";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "invoiceId", invoiceId));

    
    
    
    final String[] localVarAccepts = {
      "appliction/pdf", "application/json; charset=utf-8", "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        File
      
    > apiResponse = apiClient.invokeAPI("InvoiceAndBillingApi.getInvoiceGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getInvoiceGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns details on specific invoice.
   * 
   * @param invoiceId Invoice code to query. See /listInvoices endpoint for list of available invoices to query. (required)
   * @return InvoiceDetails
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> Unauthorized </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> Requested Resource not found </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 429 </td><td> Throttle Limit Reached </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public InvoiceDetails invoiceDetailsGet(String invoiceId) throws ApiException {
    return invoiceDetailsGetWithHttpInfo(invoiceId).getData();
  }

  /**
   * Returns details on specific invoice.
   * 
   * @param invoiceId Invoice code to query. See /listInvoices endpoint for list of available invoices to query. (required)
   * @return ApiResponse&lt;InvoiceDetails&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> Unauthorized </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> Requested Resource not found </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 429 </td><td> Throttle Limit Reached </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<InvoiceDetails> invoiceDetailsGetWithHttpInfo(String invoiceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceId' is set
    if (invoiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceId' when calling invoiceDetailsGet");
    }
    
    // create path and map variables
    String localVarPath = "/invoiceDetails";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "invoiceId", invoiceId));

    
    
    
    final String[] localVarAccepts = {
      "application/json; charset=utf-8", "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        InvoiceDetails
      
    > apiResponse = apiClient.invokeAPI("InvoiceAndBillingApi.invoiceDetailsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, invoiceDetailsGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns all available invoices
   * 
   * @return java.util.List<Object>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> Unauthorized </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> Requested Resource not found </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 429 </td><td> Throttle Limit Reached </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public java.util.List<Object> listInvoicesGet() throws ApiException {
    return listInvoicesGetWithHttpInfo().getData();
  }

  /**
   * Returns all available invoices
   * 
   * @return ApiResponse&lt;java.util.List<Object>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 403 </td><td> Unauthorized </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 404 </td><td> Requested Resource not found </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 429 </td><td> Throttle Limit Reached </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<Object>> listInvoicesGetWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/listInvoices";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json; charset=utf-8", "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        java.util.List<Object>
      
    > apiResponse = apiClient.invokeAPI("InvoiceAndBillingApi.listInvoicesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, listInvoicesGetResponseTypeMap, false);

    return apiResponse;

  }
}
