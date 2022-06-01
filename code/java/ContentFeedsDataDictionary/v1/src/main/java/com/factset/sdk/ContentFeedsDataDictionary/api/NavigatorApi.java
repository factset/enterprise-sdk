package com.factset.sdk.ContentFeedsDataDictionary.api;

import com.factset.sdk.ContentFeedsDataDictionary.ApiException;
import com.factset.sdk.ContentFeedsDataDictionary.ApiClient;
import com.factset.sdk.ContentFeedsDataDictionary.ApiResponse;
import com.factset.sdk.ContentFeedsDataDictionary.Configuration;
import com.factset.sdk.ContentFeedsDataDictionary.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.ContentFeedsDataDictionary.models.BasicSearchRequest;
import com.factset.sdk.ContentFeedsDataDictionary.models.BasicSearchResponse;
import com.factset.sdk.ContentFeedsDataDictionary.models.DataItem;
import com.factset.sdk.ContentFeedsDataDictionary.models.NavigatorSourcesResponse;
import com.factset.sdk.ContentFeedsDataDictionary.models.Product;
import com.factset.sdk.ContentFeedsDataDictionary.models.TableCodeFieldInfoResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NavigatorApi {
  private ApiClient apiClient;

  public NavigatorApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NavigatorApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> navigatorBasicSearchPostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    navigatorBasicSearchPostResponseTypeMap.put(200, new GenericType<BasicSearchResponse>(){});
  }
  private static final Map<Integer, GenericType> navigatorDataItemsProductIdGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    navigatorDataItemsProductIdGetResponseTypeMap.put(200, new GenericType<java.util.List<DataItem>>(){});
  }
  private static final Map<Integer, GenericType> navigatorProductsGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    navigatorProductsGetResponseTypeMap.put(200, new GenericType<java.util.List<Product>>(){});
  }
  private static final Map<Integer, GenericType> navigatorSourcesDataItemIdGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    navigatorSourcesDataItemIdGetResponseTypeMap.put(200, new GenericType<NavigatorSourcesResponse>(){});
  }
  private static final Map<Integer, GenericType> navigatorSourcesGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    navigatorSourcesGetResponseTypeMap.put(200, new GenericType<NavigatorSourcesResponse>(){});
  }
  private static final Map<Integer, GenericType> navigatorTableFieldsTableIdGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    navigatorTableFieldsTableIdGetResponseTypeMap.put(200, new GenericType<TableCodeFieldInfoResponse>(){});
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
   * Returns the data items (along with the products they belong to) that contain at least one of the search terms as a substring of either their name or description.
   * 
   * @param basicSearchRequest A list of search terms (each term must be at least two characters). (required)
   * @return BasicSearchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The request body was not formatted properly. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> You are not authorized to view this page. </td><td>  -  </td></tr>
     </table>
   */
  public BasicSearchResponse navigatorBasicSearchPost(BasicSearchRequest basicSearchRequest) throws ApiException {
    return navigatorBasicSearchPostWithHttpInfo(basicSearchRequest).getData();
  }

  /**
   * Returns the data items (along with the products they belong to) that contain at least one of the search terms as a substring of either their name or description.
   * 
   * @param basicSearchRequest A list of search terms (each term must be at least two characters). (required)
   * @return ApiResponse&lt;BasicSearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The request body was not formatted properly. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> You are not authorized to view this page. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BasicSearchResponse> navigatorBasicSearchPostWithHttpInfo(BasicSearchRequest basicSearchRequest) throws ApiException {
    Object localVarPostBody = basicSearchRequest;
    
    // verify the required parameter 'basicSearchRequest' is set
    if (basicSearchRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'basicSearchRequest' when calling navigatorBasicSearchPost");
    }
    
    // create path and map variables
    String localVarPath = "/navigator/basic_search";

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
        
        BasicSearchResponse
      
    > apiResponse = apiClient.invokeAPI("NavigatorApi.navigatorBasicSearchPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, navigatorBasicSearchPostResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get the list of data items associated with a product for Navigator.
   * 
   * @param productId The id for the Product to fetch the list of data items for. (required)
   * @return java.util.List<DataItem>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> You are not authorized to view this page. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified Product_id was not found. </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<DataItem> navigatorDataItemsProductIdGet(String productId) throws ApiException {
    return navigatorDataItemsProductIdGetWithHttpInfo(productId).getData();
  }

  /**
   * Get the list of data items associated with a product for Navigator.
   * 
   * @param productId The id for the Product to fetch the list of data items for. (required)
   * @return ApiResponse&lt;java.util.List<DataItem>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> You are not authorized to view this page. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified Product_id was not found. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<DataItem>> navigatorDataItemsProductIdGetWithHttpInfo(String productId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'productId' is set
    if (productId == null) {
      throw new ApiException(400, "Missing the required parameter 'productId' when calling navigatorDataItemsProductIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/navigator/data_items/{Product_id}"
      .replaceAll("\\{" + "Product_id" + "\\}", apiClient.escapeString(productId.toString()));

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
        
        java.util.List<DataItem>
      
    > apiResponse = apiClient.invokeAPI("NavigatorApi.navigatorDataItemsProductIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, navigatorDataItemsProductIdGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get the list of products for Navigator.
   * 
   * @return java.util.List<Product>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> You are not authorized to view this page. </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<Product> navigatorProductsGet() throws ApiException {
    return navigatorProductsGetWithHttpInfo().getData();
  }

  /**
   * Get the list of products for Navigator.
   * 
   * @return ApiResponse&lt;java.util.List<Product>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> You are not authorized to view this page. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<Product>> navigatorProductsGetWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/navigator/products";

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
        
        java.util.List<Product>
      
    > apiResponse = apiClient.invokeAPI("NavigatorApi.navigatorProductsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, navigatorProductsGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get a list of sources where the specified data item can be found, for each delivery method, filtered to the appearances of the given data item within the specified product.
   * 
   * @param dataItemId The id for the DataItem to fetch the sources for. (required)
   * @param productId The id for the Product to filter down the sources returned on. (required)
   * @return NavigatorSourcesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> You are not authorized to view this page. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified DataItem_id was not found. </td><td>  -  </td></tr>
     </table>
   */
  public NavigatorSourcesResponse navigatorSourcesDataItemIdGet(String dataItemId, String productId) throws ApiException {
    return navigatorSourcesDataItemIdGetWithHttpInfo(dataItemId, productId).getData();
  }

  /**
   * Get a list of sources where the specified data item can be found, for each delivery method, filtered to the appearances of the given data item within the specified product.
   * 
   * @param dataItemId The id for the DataItem to fetch the sources for. (required)
   * @param productId The id for the Product to filter down the sources returned on. (required)
   * @return ApiResponse&lt;NavigatorSourcesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> You are not authorized to view this page. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified DataItem_id was not found. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NavigatorSourcesResponse> navigatorSourcesDataItemIdGetWithHttpInfo(String dataItemId, String productId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dataItemId' is set
    if (dataItemId == null) {
      throw new ApiException(400, "Missing the required parameter 'dataItemId' when calling navigatorSourcesDataItemIdGet");
    }
    
    // verify the required parameter 'productId' is set
    if (productId == null) {
      throw new ApiException(400, "Missing the required parameter 'productId' when calling navigatorSourcesDataItemIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/navigator/sources/{DataItem_id}"
      .replaceAll("\\{" + "DataItem_id" + "\\}", apiClient.escapeString(dataItemId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Product_id", productId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        NavigatorSourcesResponse
      
    > apiResponse = apiClient.invokeAPI("NavigatorApi.navigatorSourcesDataItemIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, navigatorSourcesDataItemIdGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get a list of sources by delivery method for the given product_id
   * 
   * @param productId The id for the Product to filter down the sources returned on. (required)
   * @return NavigatorSourcesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> You are not authorized to view this page. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified DataItem_id was not found. </td><td>  -  </td></tr>
     </table>
   */
  public NavigatorSourcesResponse navigatorSourcesGet(String productId) throws ApiException {
    return navigatorSourcesGetWithHttpInfo(productId).getData();
  }

  /**
   * Get a list of sources by delivery method for the given product_id
   * 
   * @param productId The id for the Product to filter down the sources returned on. (required)
   * @return ApiResponse&lt;NavigatorSourcesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> You are not authorized to view this page. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified DataItem_id was not found. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NavigatorSourcesResponse> navigatorSourcesGetWithHttpInfo(String productId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'productId' is set
    if (productId == null) {
      throw new ApiException(400, "Missing the required parameter 'productId' when calling navigatorSourcesGet");
    }
    
    // create path and map variables
    String localVarPath = "/navigator/sources";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Product_id", productId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        NavigatorSourcesResponse
      
    > apiResponse = apiClient.invokeAPI("NavigatorApi.navigatorSourcesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, navigatorSourcesGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get the list of fields associated with a table for Navigator, and the code information for the specified data item, if applicable.
   * 
   * @param tableId The id for the Table to fetch the fields for. (required)
   * @param dataItemId The id for the DataItem. This is required in case the data item is represented as a code in Standard DataFeeds. (optional)
   * @return TableCodeFieldInfoResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> You are not authorized to view this page. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified Table_id was not found. </td><td>  -  </td></tr>
     </table>
   */
  public TableCodeFieldInfoResponse navigatorTableFieldsTableIdGet(String tableId, String dataItemId) throws ApiException {
    return navigatorTableFieldsTableIdGetWithHttpInfo(tableId, dataItemId).getData();
  }

  /**
   * Get the list of fields associated with a table for Navigator, and the code information for the specified data item, if applicable.
   * 
   * @param tableId The id for the Table to fetch the fields for. (required)
   * @param dataItemId The id for the DataItem. This is required in case the data item is represented as a code in Standard DataFeeds. (optional)
   * @return ApiResponse&lt;TableCodeFieldInfoResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> You are not authorized to view this page. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified Table_id was not found. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TableCodeFieldInfoResponse> navigatorTableFieldsTableIdGetWithHttpInfo(String tableId, String dataItemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tableId' is set
    if (tableId == null) {
      throw new ApiException(400, "Missing the required parameter 'tableId' when calling navigatorTableFieldsTableIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/navigator/table_fields/{Table_id}"
      .replaceAll("\\{" + "Table_id" + "\\}", apiClient.escapeString(tableId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "DataItem_id", dataItemId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        TableCodeFieldInfoResponse
      
    > apiResponse = apiClient.invokeAPI("NavigatorApi.navigatorTableFieldsTableIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, navigatorTableFieldsTableIdGetResponseTypeMap, false);

    return apiResponse;

  }
}
