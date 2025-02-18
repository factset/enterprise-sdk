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

import com.factset.sdk.BookBuilder.models.BookInfo;
import com.factset.sdk.BookBuilder.models.BookProcessingResponseItem;
import com.factset.sdk.BookBuilder.models.EnableBookDownload;
import com.factset.sdk.BookBuilder.models.InvalidDownloadBookAwsRequest;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class BooksFetchApi {
  private ApiClient apiClient;

  public BooksFetchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BooksFetchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> downloadBookResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    downloadBookResponseTypeMap.put(200, new GenericType<EnableBookDownload>(){});
    downloadBookResponseTypeMap.put(202, new GenericType<java.util.List<BookProcessingResponseItem>>(){});
    downloadBookResponseTypeMap.put(400, new GenericType<InvalidDownloadBookAwsRequest>(){});
    downloadBookResponseTypeMap.put(401, new GenericType<String>(){});
    downloadBookResponseTypeMap.put(503, new GenericType<InvalidDownloadBookAwsRequest>(){});
  }

  private static final Map<Integer, GenericType> getBookListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getBookListResponseTypeMap.put(200, new GenericType<java.util.List<BookInfo>>(){});
    getBookListResponseTypeMap.put(401, new GenericType<String>(){});
  }

  
 /**
   * Wrapper to support GET /download-api-book-aws/{book_id} returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code EnableBookDownload }<br>Successful response contains URL to load the book for the BookID requested</li>
   * 
   *   <li>202 : {@code java.util.List<BookProcessingResponseItem> }<br>Book is processing. Please check back later.</li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * DownloadBookResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     EnableBookDownload data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     java.util.List<BookProcessingResponseItem> data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class DownloadBookResponseWrapper {
    public final int statusCode;
    public final Object response;

    public DownloadBookResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public EnableBookDownload getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (EnableBookDownload) this.response;
    }
    
    public java.util.List<BookProcessingResponseItem> getResponse202() throws ApiException {
      if (this.statusCode != 202) {
        throw new ApiException(500, "Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
      }
      return (java.util.List<BookProcessingResponseItem>) this.response;
    }
    

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      DownloadBookResponseWrapper other = (DownloadBookResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class DownloadBookResponseWrapper {\n"
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
   * Retrieves book in PDF format
   * This endpoint uses the BookId returned from any of the request above. Returns the URL to load the book for the book ID requested. The URL will be in JSON format, the final book will be in PDF format. &lt;br&gt;&lt;br&gt; NOTE -- The execution of this endpoint requires an extra step within the developer portal due to authentication limitations. When using the actual API, a successful response for this endpoint will be the PDF book rather than the URL to the PDF. &lt;br&gt;&lt;br&gt;&lt;b&gt;&lt;i&gt;The actual endpoint is &lt;/b&gt;&lt;font color&#x3D;blue&gt;https://api.factset.com/book-builder-api/v1/download-api-book/{book_id}&lt;/font&gt;&lt;/i&gt;
   * @param bookId A string representing the unique ID for a specific book. This ID must be provided in the URL path. (required)
   * @return DownloadBookResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response contains URL to load the book for the BookID requested </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Book is processing. Please check back later. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Something went wrong. Please create a new request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Unrecognized BookId </td><td>  -  </td></tr>
     </table>
   */
  public DownloadBookResponseWrapper downloadBook(String bookId) throws ApiException {
    return downloadBookWithHttpInfo(bookId).getData();
  }

  /**
   * Retrieves book in PDF format
   * This endpoint uses the BookId returned from any of the request above. Returns the URL to load the book for the book ID requested. The URL will be in JSON format, the final book will be in PDF format. &lt;br&gt;&lt;br&gt; NOTE -- The execution of this endpoint requires an extra step within the developer portal due to authentication limitations. When using the actual API, a successful response for this endpoint will be the PDF book rather than the URL to the PDF. &lt;br&gt;&lt;br&gt;&lt;b&gt;&lt;i&gt;The actual endpoint is &lt;/b&gt;&lt;font color&#x3D;blue&gt;https://api.factset.com/book-builder-api/v1/download-api-book/{book_id}&lt;/font&gt;&lt;/i&gt;
   * @param bookId A string representing the unique ID for a specific book. This ID must be provided in the URL path. (required)
   * @return ApiResponse&lt;DownloadBookResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response contains URL to load the book for the BookID requested </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Book is processing. Please check back later. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Something went wrong. Please create a new request. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication </td><td>  -  </td></tr>
       <tr><td> 503 </td><td> Unrecognized BookId </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DownloadBookResponseWrapper> downloadBookWithHttpInfo(String bookId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bookId' is set
    if (bookId == null) {
      throw new ApiException(400, "Missing the required parameter 'bookId' when calling downloadBook");
    }
    
    // create path and map variables
    String localVarPath = "/download-api-book-aws/{book_id}"
      .replaceAll("\\{" + "book_id" + "\\}", apiClient.escapeString(bookId.toString()));

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
        Object
        
      
    > apiResponse = apiClient.invokeAPI("BooksFetchApi.downloadBook", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, downloadBookResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    DownloadBookResponseWrapper responseWrapper = new DownloadBookResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<DownloadBookResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
  /**
   * Check out the books that are in the book library
   * Retrieves the list of books that were previously created and are available in the client&#39;s book library
   * @return java.util.List<BookInfo>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response contains book name, book ID, created date, shared status of the book and book type </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or Invalid authentication </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<BookInfo> getBookList() throws ApiException {
    return getBookListWithHttpInfo().getData();
  }

  /**
   * Check out the books that are in the book library
   * Retrieves the list of books that were previously created and are available in the client&#39;s book library
   * @return ApiResponse&lt;java.util.List<BookInfo>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response contains book name, book ID, created date, shared status of the book and book type </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Missing or Invalid authentication </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<BookInfo>> getBookListWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/book-list";

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
        
        java.util.List<BookInfo>
      
    > apiResponse = apiClient.invokeAPI("BooksFetchApi.getBookList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getBookListResponseTypeMap, false);

    return apiResponse;

  }
}
