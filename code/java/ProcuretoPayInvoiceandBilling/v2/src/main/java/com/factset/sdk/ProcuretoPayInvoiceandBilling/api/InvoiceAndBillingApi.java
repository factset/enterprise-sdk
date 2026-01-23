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

import com.factset.sdk.ProcuretoPayInvoiceandBilling.models.Accounts;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.models.ErrorResponse;
import java.io.File;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.models.Invoice;
import com.factset.sdk.ProcuretoPayInvoiceandBilling.models.ProductGroups;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InvoiceAndBillingApi {
  private ApiClient apiClient;

  public InvoiceAndBillingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InvoiceAndBillingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> downloadInvoiceResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    downloadInvoiceResponseTypeMap.put(200, new GenericType<File>(){});
    downloadInvoiceResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    downloadInvoiceResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    downloadInvoiceResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    downloadInvoiceResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> fitsReportResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    fitsReportResponseTypeMap.put(200, new GenericType<ProductGroups>(){});
    fitsReportResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    fitsReportResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    fitsReportResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    fitsReportResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> invoiceDetailsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    invoiceDetailsResponseTypeMap.put(200, new GenericType<Invoice>(){});
    invoiceDetailsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    invoiceDetailsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    invoiceDetailsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    invoiceDetailsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> listAccountsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    listAccountsResponseTypeMap.put(200, new GenericType<Accounts>(){});
    listAccountsResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    listAccountsResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    listAccountsResponseTypeMap.put(404, new GenericType<ErrorResponse>(){});
    listAccountsResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Get a PDF of the provided invoiceId
   * Returns and downloads .PDF invoice by provided invoiceId. &lt;b&gt;InvoiceId&lt;/b&gt; is determined by concatenating the AccountId and 2-Digit date, representing year and 2-Digit month. E.G. For the December 2023 Invoice the invoiceId would be: AB2C2312
   * @param id Concatenation of AccountID and Date as YYMM (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  * Content-Disposition -  <br>  * Content-Type -  <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - Authentication failed </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - Insufficient permissions </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found - Invoice ID does not exist </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error - An unexpected error occurred on the server. </td><td>  -  </td></tr>
     </table>
   */
  public File downloadInvoice(String id) throws ApiException {
    return downloadInvoiceWithHttpInfo(id).getData();
  }

  /**
   * Get a PDF of the provided invoiceId
   * Returns and downloads .PDF invoice by provided invoiceId. &lt;b&gt;InvoiceId&lt;/b&gt; is determined by concatenating the AccountId and 2-Digit date, representing year and 2-Digit month. E.G. For the December 2023 Invoice the invoiceId would be: AB2C2312
   * @param id Concatenation of AccountID and Date as YYMM (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  * Content-Disposition -  <br>  * Content-Type -  <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - Authentication failed </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - Insufficient permissions </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found - Invoice ID does not exist </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error - An unexpected error occurred on the server. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> downloadInvoiceWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling downloadInvoice");
    }
    
    // create path and map variables
    String localVarPath = "/invoices/{id}/download"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/pdf", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        File
      
    > apiResponse = apiClient.invokeAPI("InvoiceAndBillingApi.downloadInvoice", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, downloadInvoiceResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get FITS report
   * Returns machine readable FITS report by provided fitsId. &lt;b&gt;fitsId&lt;/b&gt; is determined by concatenating the AccountId and 2-Digit date, representing year and 2-Digit month. E.G. For the December 2023 Invoice the fitsId would be: AB2C2312.         All prices in the report are provided without currency information. For currency details, please refer to the &#39;/invoices/{id}&#39; endpoint.
   * @param id Concatenation of AccountID and Date as YYMM (required)
   * @return ProductGroups
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - Authentication failed </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - Insufficient permissions </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found - fits ID does not exist </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error - An unexpected error occurred on the server. </td><td>  -  </td></tr>
     </table>
   */
  public ProductGroups fitsReport(String id) throws ApiException {
    return fitsReportWithHttpInfo(id).getData();
  }

  /**
   * Get FITS report
   * Returns machine readable FITS report by provided fitsId. &lt;b&gt;fitsId&lt;/b&gt; is determined by concatenating the AccountId and 2-Digit date, representing year and 2-Digit month. E.G. For the December 2023 Invoice the fitsId would be: AB2C2312.         All prices in the report are provided without currency information. For currency details, please refer to the &#39;/invoices/{id}&#39; endpoint.
   * @param id Concatenation of AccountID and Date as YYMM (required)
   * @return ApiResponse&lt;ProductGroups&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - Authentication failed </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - Insufficient permissions </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found - fits ID does not exist </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error - An unexpected error occurred on the server. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProductGroups> fitsReportWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling fitsReport");
    }
    
    // create path and map variables
    String localVarPath = "/invoices/{id}/fits-report"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        ProductGroups
      
    > apiResponse = apiClient.invokeAPI("InvoiceAndBillingApi.fitsReport", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, fitsReportResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get invoice details
   * Returns a machine readable invoice report by provided invoiceId. &lt;b&gt;InvoiceId&lt;/b&gt; is determined by concatenating the AccountId and  2-Digit date, representing year and 2-Digit month. E.G. For the December 2023 Invoice the invoiceId would be: AB2C2312
   * @param id Concatenation of AccountID and Date as YYMM (required)
   * @return Invoice
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - Authentication failed </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - Insufficient permissions </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found - Invoice ID does not exist </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error - An unexpected error occurred on the server. </td><td>  -  </td></tr>
     </table>
   */
  public Invoice invoiceDetails(String id) throws ApiException {
    return invoiceDetailsWithHttpInfo(id).getData();
  }

  /**
   * Get invoice details
   * Returns a machine readable invoice report by provided invoiceId. &lt;b&gt;InvoiceId&lt;/b&gt; is determined by concatenating the AccountId and  2-Digit date, representing year and 2-Digit month. E.G. For the December 2023 Invoice the invoiceId would be: AB2C2312
   * @param id Concatenation of AccountID and Date as YYMM (required)
   * @return ApiResponse&lt;Invoice&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - Authentication failed </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - Insufficient permissions </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found - Invoice ID does not exist </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error - An unexpected error occurred on the server. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Invoice> invoiceDetailsWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling invoiceDetails");
    }
    
    // create path and map variables
    String localVarPath = "/invoices/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        Invoice
      
    > apiResponse = apiClient.invokeAPI("InvoiceAndBillingApi.invoiceDetails", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, invoiceDetailsResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns a list of available accounts
   * Returns a list of accounts containing information such as AccountName and AccountId.
   * @return Accounts
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - Authentication failed </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - Insufficient permissions </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found - Accounts does not exist </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error - An unexpected error occurred on the server. </td><td>  -  </td></tr>
     </table>
   */
  public Accounts listAccounts() throws ApiException {
    return listAccountsWithHttpInfo().getData();
  }

  /**
   * Returns a list of available accounts
   * Returns a list of accounts containing information such as AccountName and AccountId.
   * @return ApiResponse&lt;Accounts&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized - Authentication failed </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden - Insufficient permissions </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found - Accounts does not exist </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error - An unexpected error occurred on the server. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Accounts> listAccountsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/accounts";

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        Accounts
      
    > apiResponse = apiClient.invokeAPI("InvoiceAndBillingApi.listAccounts", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, listAccountsResponseTypeMap, false);

    return apiResponse;

  }
}
