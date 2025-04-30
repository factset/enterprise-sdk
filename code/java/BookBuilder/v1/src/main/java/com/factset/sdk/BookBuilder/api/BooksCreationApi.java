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

import com.factset.sdk.BookBuilder.models.AvailableReportsList;
import com.factset.sdk.BookBuilder.models.CreateBookFromTemplatePostRequest;
import com.factset.sdk.BookBuilder.models.CreateBookPostRequest;
import com.factset.sdk.BookBuilder.models.EnableBookInfo;
import com.factset.sdk.BookBuilder.models.EnableBookInfoFromTemplate;
import com.factset.sdk.BookBuilder.models.InvalidAvailableReportRequest;
import com.factset.sdk.BookBuilder.models.InvalidCreateBookFromTemplateRequest;
import com.factset.sdk.BookBuilder.models.InvalidCreateBookRequest;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class BooksCreationApi {
  private ApiClient apiClient;

  public BooksCreationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BooksCreationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> createBookResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createBookResponseTypeMap.put(200, new GenericType<EnableBookInfo>(){});
    createBookResponseTypeMap.put(400, new GenericType<InvalidCreateBookRequest>(){});
    createBookResponseTypeMap.put(401, new GenericType<String>(){});
  }

  private static final Map<Integer, GenericType> createBookFromTemplateResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createBookFromTemplateResponseTypeMap.put(200, new GenericType<EnableBookInfoFromTemplate>(){});
    createBookFromTemplateResponseTypeMap.put(400, new GenericType<InvalidCreateBookFromTemplateRequest>(){});
    createBookFromTemplateResponseTypeMap.put(401, new GenericType<String>(){});
  }

  private static final Map<Integer, GenericType> getAvailableReportsResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getAvailableReportsResponseTypeMap.put(200, new GenericType<AvailableReportsList>(){});
    getAvailableReportsResponseTypeMap.put(400, new GenericType<InvalidAvailableReportRequest>(){});
    getAvailableReportsResponseTypeMap.put(401, new GenericType<String>(){});
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
   * Kicks off request to create a book with reports of your choice
   * This end point retrieves book name and book_id for the PDF book you create. All the book options such as name of the book, ticker, pagination options, and reports can be specified in the request body. Please refer to the documentation for valid section ids and report ids.
   * @param createBookPostRequest  (required)
   * @return EnableBookInfo
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response contains book name and book ID </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid ticker/section_id/report_id </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
     </table>
   */
  public EnableBookInfo createBook(CreateBookPostRequest createBookPostRequest) throws ApiException {
    return createBookWithHttpInfo(createBookPostRequest).getData();
  }

  /**
   * Kicks off request to create a book with reports of your choice
   * This end point retrieves book name and book_id for the PDF book you create. All the book options such as name of the book, ticker, pagination options, and reports can be specified in the request body. Please refer to the documentation for valid section ids and report ids.
   * @param createBookPostRequest  (required)
   * @return ApiResponse&lt;EnableBookInfo&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response contains book name and book ID </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid ticker/section_id/report_id </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EnableBookInfo> createBookWithHttpInfo(CreateBookPostRequest createBookPostRequest) throws ApiException {
    Object localVarPostBody = createBookPostRequest;
    
    // verify the required parameter 'createBookPostRequest' is set
    if (createBookPostRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createBookPostRequest' when calling createBook");
    }
    
    // create path and map variables
    String localVarPath = "/create-book";

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
        
        EnableBookInfo
      
    > apiResponse = apiClient.invokeAPI("BooksCreationApi.createBook", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createBookResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Kicks off request to create a book with template
   * This endpoint retrieves book status, book name, and book ID for ticker requested in JSON format. This end-point excepts ticker and template_id as inputs. If the template_id input is not used, a book will be created with FactSet&#39;s default template.&lt;/br&gt;&lt;/br&gt;Please try out the below template ids to quickly get the FactSet curated books&lt;/br&gt;&lt;/br&gt;Company Quick Book - &lt;b&gt;g_20210415065838185&lt;/b&gt;&lt;/br&gt;Post-Earnings Call - &lt;b&gt;g_20210415070044785&lt;/b&gt; &lt;/br&gt;Public Information Book(PIB) - &lt;b&gt;g_20210415070353151&lt;/b&gt;&lt;/br&gt;&lt;/br&gt; Take a look at the example books attached under API documentation below.&lt;/br&gt;&lt;/br&gt;If you are scheduling Post Earnings Call curated book, please note that in contains Corrected Transcript that takes a little while to be available.&lt;/br&gt; &lt;/br&gt;Once a Raw Transcript is published, FactSet&#39;s editors review the call to produce a Corrected Transcript. They listen to the entire audio file again to confirm that all of the terms and numbers are correctly transcribed. FactSet aims to publish a Corrected Transcript within six times the length of the event, measured from the beginning of the event. That means for a typical one-hour call, FactSet will produce a Corrected Transcript within approximately five hours of the call&#39;s completion. Visit [OA 13208](https://my.apps.factset.com/oa/pages/13208)
   * @param createBookFromTemplatePostRequest  (required)
   * @return EnableBookInfoFromTemplate
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response contains request status, book name, and book ID </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid ticker or Unknown error </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
     </table>
   */
  public EnableBookInfoFromTemplate createBookFromTemplate(CreateBookFromTemplatePostRequest createBookFromTemplatePostRequest) throws ApiException {
    return createBookFromTemplateWithHttpInfo(createBookFromTemplatePostRequest).getData();
  }

  /**
   * Kicks off request to create a book with template
   * This endpoint retrieves book status, book name, and book ID for ticker requested in JSON format. This end-point excepts ticker and template_id as inputs. If the template_id input is not used, a book will be created with FactSet&#39;s default template.&lt;/br&gt;&lt;/br&gt;Please try out the below template ids to quickly get the FactSet curated books&lt;/br&gt;&lt;/br&gt;Company Quick Book - &lt;b&gt;g_20210415065838185&lt;/b&gt;&lt;/br&gt;Post-Earnings Call - &lt;b&gt;g_20210415070044785&lt;/b&gt; &lt;/br&gt;Public Information Book(PIB) - &lt;b&gt;g_20210415070353151&lt;/b&gt;&lt;/br&gt;&lt;/br&gt; Take a look at the example books attached under API documentation below.&lt;/br&gt;&lt;/br&gt;If you are scheduling Post Earnings Call curated book, please note that in contains Corrected Transcript that takes a little while to be available.&lt;/br&gt; &lt;/br&gt;Once a Raw Transcript is published, FactSet&#39;s editors review the call to produce a Corrected Transcript. They listen to the entire audio file again to confirm that all of the terms and numbers are correctly transcribed. FactSet aims to publish a Corrected Transcript within six times the length of the event, measured from the beginning of the event. That means for a typical one-hour call, FactSet will produce a Corrected Transcript within approximately five hours of the call&#39;s completion. Visit [OA 13208](https://my.apps.factset.com/oa/pages/13208)
   * @param createBookFromTemplatePostRequest  (required)
   * @return ApiResponse&lt;EnableBookInfoFromTemplate&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response contains request status, book name, and book ID </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid ticker or Unknown error </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EnableBookInfoFromTemplate> createBookFromTemplateWithHttpInfo(CreateBookFromTemplatePostRequest createBookFromTemplatePostRequest) throws ApiException {
    Object localVarPostBody = createBookFromTemplatePostRequest;
    
    // verify the required parameter 'createBookFromTemplatePostRequest' is set
    if (createBookFromTemplatePostRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createBookFromTemplatePostRequest' when calling createBookFromTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/create-book-from-template";

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
        
        EnableBookInfoFromTemplate
      
    > apiResponse = apiClient.invokeAPI("BooksCreationApi.createBookFromTemplate", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createBookFromTemplateResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * This endpoint retrieves all available sections and reports based on a ticker.
   * This endpoint retrieves all available sections and reports for a specified ticker. The only parameter required is the ticker.
   * @param ticker A string representing a specific ticker of Public, Private companies and Mutual Funds. This ticker must be provided in the URL path. (required)
   * @return AvailableReportsList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response contains all available sections and reports for the ticker. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid Ticker </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
     </table>
   */
  public AvailableReportsList getAvailableReports(String ticker) throws ApiException {
    return getAvailableReportsWithHttpInfo(ticker).getData();
  }

  /**
   * This endpoint retrieves all available sections and reports based on a ticker.
   * This endpoint retrieves all available sections and reports for a specified ticker. The only parameter required is the ticker.
   * @param ticker A string representing a specific ticker of Public, Private companies and Mutual Funds. This ticker must be provided in the URL path. (required)
   * @return ApiResponse&lt;AvailableReportsList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response contains all available sections and reports for the ticker. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid Ticker </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AvailableReportsList> getAvailableReportsWithHttpInfo(String ticker) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ticker' is set
    if (ticker == null) {
      throw new ApiException(400, "Missing the required parameter 'ticker' when calling getAvailableReports");
    }
    
    // create path and map variables
    String localVarPath = "/available-report/{ticker}"
      .replaceAll("\\{" + "ticker" + "\\}", apiClient.escapeString(ticker.toString()));

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
        
        AvailableReportsList
      
    > apiResponse = apiClient.invokeAPI("BooksCreationApi.getAvailableReports", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getAvailableReportsResponseTypeMap, false);

    return apiResponse;

  }
}
