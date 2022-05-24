package com.factset.sdk.ChartGenerationService.api;

import com.factset.sdk.ChartGenerationService.ApiException;
import com.factset.sdk.ChartGenerationService.ApiClient;
import com.factset.sdk.ChartGenerationService.ApiResponse;
import com.factset.sdk.ChartGenerationService.Configuration;
import com.factset.sdk.ChartGenerationService.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import java.math.BigDecimal;
import com.factset.sdk.ChartGenerationService.models.CategoriesErrorResponse;
import com.factset.sdk.ChartGenerationService.models.ChartList;
import com.factset.sdk.ChartGenerationService.models.ChartListErrorResponse;
import com.factset.sdk.ChartGenerationService.models.ErrorResponse;
import java.io.File;
import com.factset.sdk.ChartGenerationService.models.UnauthorizedResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChartTemplatesApi {
  private ApiClient apiClient;

  public ChartTemplatesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ChartTemplatesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> getCategoryListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCategoryListResponseTypeMap.put(200, new GenericType<java.util.List<String>>(){});
    getCategoryListResponseTypeMap.put(400, new GenericType<CategoriesErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> getChartListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getChartListResponseTypeMap.put(200, new GenericType<java.util.List<Object>>(){});
    getChartListResponseTypeMap.put(400, new GenericType<ChartListErrorResponse>(){});
  }
  private static final Map<Integer, GenericType> imagesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    imagesResponseTypeMap.put(200, new GenericType<String>(){});
    imagesResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    imagesResponseTypeMap.put(401, new GenericType<UnauthorizedResponse>(){});
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
   * Get a list of chart categories
   * 
   * @return java.util.List<String>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Input </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<String> getCategoryList() throws ApiException {
    return getCategoryListWithHttpInfo().getData();
  }

  /**
   * Get a list of chart categories
   * 
   * @return ApiResponse&lt;java.util.List<String>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Input </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<String>> getCategoryListWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/catalog/categories";

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
        
        java.util.List<String>
      
    > apiResponse = apiClient.invokeAPI("ChartTemplatesApi.getCategoryList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCategoryListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get a list of chart templates that can be used for getting the image from the service.
   * You can get all the charts present or can just get the information by categories. The response includes the name of the chart, description, tags and any additional input specific to that chart. Use the information from this response to determine what charts you want and get its image from /images endpoint. Additionally you can also get back a auto generated PDF for the categories you requested for.
   * @param categories A comma delimited string of catgory names to limit the response to certain categories. If nothing is provided, all charts under every category would be listed out. (optional)
   * @param type return type of the response (optional)
   * @return java.util.List<Object>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Input </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<Object> getChartList(String categories, String type) throws ApiException {
    return getChartListWithHttpInfo(categories, type).getData();
  }

  /**
   * Get a list of chart templates that can be used for getting the image from the service.
   * You can get all the charts present or can just get the information by categories. The response includes the name of the chart, description, tags and any additional input specific to that chart. Use the information from this response to determine what charts you want and get its image from /images endpoint. Additionally you can also get back a auto generated PDF for the categories you requested for.
   * @param categories A comma delimited string of catgory names to limit the response to certain categories. If nothing is provided, all charts under every category would be listed out. (optional)
   * @param type return type of the response (optional)
   * @return ApiResponse&lt;java.util.List<Object>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Input </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<Object>> getChartListWithHttpInfo(String categories, String type) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/catalog/charts";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories", categories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

    
    
    
    final String[] localVarAccepts = {
      "application/json", "application/pdf"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        java.util.List<Object>
      
    > apiResponse = apiClient.invokeAPI("ChartTemplatesApi.getChartList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getChartListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get chart image back in PNG or JPEG formats
   * 
   * @param chart Path to the saved chart. For any of the default charts, the option should be &#x60;categoryName + &#39;/&#39; + chartName&#x60;. For charts under the Client or Personal directories, the option should be &#x60;directoryName + &#39;:/&#39; + pathTotheChart&#x60;.   (required)
   * @param ids List of identifiers to be charted in a comma(,) separated string. Only the first one would be considered as primary and rest would be added as comps. Check the catalog for more information on which charts require a ticker. (optional)
   * @param sd Option for overriding the startDate of the chart. For absolute dates provide a string in &#x60;YYYYMMDD&#x60; format. We can also specify relative date options (optional)
   * @param ed Option for overriding the endDate of the chart. For absolute dates provide a string in &#x60;YYYYMMDD&#x60; format. We can also specify relative date options (optional)
   * @param width Option for setting the width of the image (optional, default to 1056)
   * @param height Option for setting the height of the image (optional, default to 816)
   * @param freq A shorthand string for the overall frequency of the chart like &#x60;D&#x60; (daily), &#x60;W&#x60; (weekly), &#x60;Y&#x60; (yearly) and &#x60;Q&#x60; (Quarterly). This will default to frequency stored in the document. (optional)
   * @param ccy Currency ISO code for the overall currency of the chart. The API doesn&#39;t allow per series currency at this point in time. (optional)
   * @param split Option to specify the splits adjustment (optional)
   * @param spin Numeric option to specify the spinOffs adjustment. Possible options include &#x60;0&#x60; (When we only want spits adjustment), &#x60;1&#x60; (spinOffs), &#x60;4&#x60; (spinOffs and cash dividends) and &#x60;9&#x60; (No adjustments) (optional)
   * @param cal Option for the calendarType of the chart (optional, default to local)
   * @param title Option to customize the title. If you don&#39;t customize the title, then it displays by default the security name. (optional)
   * @param fontSize Option to adjust chart&#39;s fontSize (optional)
   * @param type The type of image to be generated by the service (optional, default to png)
   * @param gridLines Option to toggle gridLines on/off on the chart (optional, default to true)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Input </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public String images(String chart, String ids, String sd, String ed, Long width, Long height, String freq, String ccy, String split, BigDecimal spin, String cal, String title, BigDecimal fontSize, String type, Boolean gridLines) throws ApiException {
    return imagesWithHttpInfo(chart, ids, sd, ed, width, height, freq, ccy, split, spin, cal, title, fontSize, type, gridLines).getData();
  }

  /**
   * Get chart image back in PNG or JPEG formats
   * 
   * @param chart Path to the saved chart. For any of the default charts, the option should be &#x60;categoryName + &#39;/&#39; + chartName&#x60;. For charts under the Client or Personal directories, the option should be &#x60;directoryName + &#39;:/&#39; + pathTotheChart&#x60;.   (required)
   * @param ids List of identifiers to be charted in a comma(,) separated string. Only the first one would be considered as primary and rest would be added as comps. Check the catalog for more information on which charts require a ticker. (optional)
   * @param sd Option for overriding the startDate of the chart. For absolute dates provide a string in &#x60;YYYYMMDD&#x60; format. We can also specify relative date options (optional)
   * @param ed Option for overriding the endDate of the chart. For absolute dates provide a string in &#x60;YYYYMMDD&#x60; format. We can also specify relative date options (optional)
   * @param width Option for setting the width of the image (optional, default to 1056)
   * @param height Option for setting the height of the image (optional, default to 816)
   * @param freq A shorthand string for the overall frequency of the chart like &#x60;D&#x60; (daily), &#x60;W&#x60; (weekly), &#x60;Y&#x60; (yearly) and &#x60;Q&#x60; (Quarterly). This will default to frequency stored in the document. (optional)
   * @param ccy Currency ISO code for the overall currency of the chart. The API doesn&#39;t allow per series currency at this point in time. (optional)
   * @param split Option to specify the splits adjustment (optional)
   * @param spin Numeric option to specify the spinOffs adjustment. Possible options include &#x60;0&#x60; (When we only want spits adjustment), &#x60;1&#x60; (spinOffs), &#x60;4&#x60; (spinOffs and cash dividends) and &#x60;9&#x60; (No adjustments) (optional)
   * @param cal Option for the calendarType of the chart (optional, default to local)
   * @param title Option to customize the title. If you don&#39;t customize the title, then it displays by default the security name. (optional)
   * @param fontSize Option to adjust chart&#39;s fontSize (optional)
   * @param type The type of image to be generated by the service (optional, default to png)
   * @param gridLines Option to toggle gridLines on/off on the chart (optional, default to true)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Input </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> imagesWithHttpInfo(String chart, String ids, String sd, String ed, Long width, Long height, String freq, String ccy, String split, BigDecimal spin, String cal, String title, BigDecimal fontSize, String type, Boolean gridLines) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'chart' is set
    if (chart == null) {
      throw new ApiException(400, "Missing the required parameter 'chart' when calling images");
    }
    
    // create path and map variables
    String localVarPath = "/v1/image";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "chart", chart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sd", sd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ed", ed));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "width", width));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "height", height));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "freq", freq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ccy", ccy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "split", split));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "spin", spin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cal", cal));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fontSize", fontSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gridLines", gridLines));

    
    
    
    final String[] localVarAccepts = {
      "img/png", "img/jpeg", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        String
      
    > apiResponse = apiClient.invokeAPI("ChartTemplatesApi.images", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, imagesResponseTypeMap, false);

    return apiResponse;

  }
}
