package com.factset.sdk.ChartGenerationService.api;

import com.factset.sdk.ChartGenerationService.ApiException;
import com.factset.sdk.ChartGenerationService.ApiClient;
import com.factset.sdk.ChartGenerationService.ApiResponse;
import com.factset.sdk.ChartGenerationService.Configuration;
import com.factset.sdk.ChartGenerationService.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import java.math.BigDecimal;
import com.factset.sdk.ChartGenerationService.models.CategoriesErrorResponse;
import com.factset.sdk.ChartGenerationService.models.CategoryChartListErrorObject;
import com.factset.sdk.ChartGenerationService.models.ChartListErrorResponse;
import com.factset.sdk.ChartGenerationService.models.ErrorResponse;
import java.io.File;
import com.factset.sdk.ChartGenerationService.models.UnauthorizedResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

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
    getChartListResponseTypeMap.put(200, new GenericType<java.util.List<CategoryChartListErrorObject>>(){});
    getChartListResponseTypeMap.put(400, new GenericType<ChartListErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> imagesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    imagesResponseTypeMap.put(200, new GenericType<File>(){});
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
   * Retrieve a list of all chart categories with getCategoryList() API call.
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
   * Retrieve a list of all chart categories with getCategoryList() API call.
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
    String localVarPath = "/catalog/categories";

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
   * @return java.util.List<CategoryChartListErrorObject>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Input </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<CategoryChartListErrorObject> getChartList(String categories) throws ApiException {
    return getChartListWithHttpInfo(categories).getData();
  }

  /**
   * Get a list of chart templates that can be used for getting the image from the service.
   * You can get all the charts present or can just get the information by categories. The response includes the name of the chart, description, tags and any additional input specific to that chart. Use the information from this response to determine what charts you want and get its image from /images endpoint. Additionally you can also get back a auto generated PDF for the categories you requested for.
   * @param categories A comma delimited string of catgory names to limit the response to certain categories. If nothing is provided, all charts under every category would be listed out. (optional)
   * @return ApiResponse&lt;java.util.List<CategoryChartListErrorObject>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Input </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<CategoryChartListErrorObject>> getChartListWithHttpInfo(String categories) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/catalog/charts";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories", categories));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        java.util.List<CategoryChartListErrorObject>
      
    > apiResponse = apiClient.invokeAPI("ChartTemplatesApi.getChartList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getChartListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get chart image back in PNG or JPEG formats
   * Get a chart image in PNG or JPEG formats with the images() API call.
   * @param chart Path to the saved chart. For any of the default charts, the option should be &#x60;categoryName + &#39;/&#39; + chartName&#x60;. For charts under the Client or Personal directories, the option should be &#x60;directoryName + &#39;:/&#39; + pathTotheChart&#x60;.   (required)
   * @param ids List of identifiers to be charted in a comma(,) separated string. Only the first one would be considered as primary and rest would be added as comps. Check the catalog for more information on which charts require a ticker. (optional)
   * @param sd Option for overriding the startDate of the chart.  #### Absolute Dates  For absolute dates, provide a string in &#x60;YYYYMMDD&#x60; format.  #### Relative Dates  Relative dates represent a date relative to the most recently-updated period. For example, 0 (zero) represents the most recently-updated period; -1 represents the time period prior to the most recently updated.\\ \\ The \&quot;zero date\&quot; is determined by the default time period or the natural frequency of the data being requested. Zero (0), when used with monthly data, indicates the most recent month-end. Negative one (-1), when used with annual data, indicates one fiscal year prior to the most recently-updated fiscal year.  #### Relative Date Options  **D:** &#x60;0D&#x60; is the most recent trading day, &#x60;-1D&#x60; is one trading day prior  **M:** &#x60;0M&#x60; is the last trading day of the most recent month, &#x60;-1M&#x60; is the last trading day of the prior month  **AY:** &#x60;0AY&#x60; is the most recent trading day, &#x60;-1AY&#x60; is one actual year (365 days) prior  **Y:** &#x60;0Y&#x60; is the last trading day of the company&#39;s most recent fiscal year, &#x60;-1Y&#x60; is the last trading day of the prior fiscal year\\ \\ For more information and examples, refer to our [date format documentation](https://my.apps.factset.com/oa/pages/1964#date_f). (optional)
   * @param ed Option for overriding the endDate of the chart. For absolute dates provide a string in &#x60;YYYYMMDD&#x60; format. We can also specify relative date options as described in the above &#x60;sd&#x60; option. (optional)
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
   * @param decimalPrecision Option to add custom decimal precision on the chart (optional)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Input </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public File images(String chart, String ids, String sd, String ed, Long width, Long height, String freq, String ccy, String split, BigDecimal spin, String cal, String title, BigDecimal fontSize, String type, Boolean gridLines, BigDecimal decimalPrecision) throws ApiException {
    return imagesWithHttpInfo(chart, ids, sd, ed, width, height, freq, ccy, split, spin, cal, title, fontSize, type, gridLines, decimalPrecision).getData();
  }

  /**
   * Get chart image back in PNG or JPEG formats
   * Get a chart image in PNG or JPEG formats with the images() API call.
   * @param chart Path to the saved chart. For any of the default charts, the option should be &#x60;categoryName + &#39;/&#39; + chartName&#x60;. For charts under the Client or Personal directories, the option should be &#x60;directoryName + &#39;:/&#39; + pathTotheChart&#x60;.   (required)
   * @param ids List of identifiers to be charted in a comma(,) separated string. Only the first one would be considered as primary and rest would be added as comps. Check the catalog for more information on which charts require a ticker. (optional)
   * @param sd Option for overriding the startDate of the chart.  #### Absolute Dates  For absolute dates, provide a string in &#x60;YYYYMMDD&#x60; format.  #### Relative Dates  Relative dates represent a date relative to the most recently-updated period. For example, 0 (zero) represents the most recently-updated period; -1 represents the time period prior to the most recently updated.\\ \\ The \&quot;zero date\&quot; is determined by the default time period or the natural frequency of the data being requested. Zero (0), when used with monthly data, indicates the most recent month-end. Negative one (-1), when used with annual data, indicates one fiscal year prior to the most recently-updated fiscal year.  #### Relative Date Options  **D:** &#x60;0D&#x60; is the most recent trading day, &#x60;-1D&#x60; is one trading day prior  **M:** &#x60;0M&#x60; is the last trading day of the most recent month, &#x60;-1M&#x60; is the last trading day of the prior month  **AY:** &#x60;0AY&#x60; is the most recent trading day, &#x60;-1AY&#x60; is one actual year (365 days) prior  **Y:** &#x60;0Y&#x60; is the last trading day of the company&#39;s most recent fiscal year, &#x60;-1Y&#x60; is the last trading day of the prior fiscal year\\ \\ For more information and examples, refer to our [date format documentation](https://my.apps.factset.com/oa/pages/1964#date_f). (optional)
   * @param ed Option for overriding the endDate of the chart. For absolute dates provide a string in &#x60;YYYYMMDD&#x60; format. We can also specify relative date options as described in the above &#x60;sd&#x60; option. (optional)
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
   * @param decimalPrecision Option to add custom decimal precision on the chart (optional)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Input </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> imagesWithHttpInfo(String chart, String ids, String sd, String ed, Long width, Long height, String freq, String ccy, String split, BigDecimal spin, String cal, String title, BigDecimal fontSize, String type, Boolean gridLines, BigDecimal decimalPrecision) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'chart' is set
    if (chart == null) {
      throw new ApiException(400, "Missing the required parameter 'chart' when calling images");
    }
    
    // create path and map variables
    String localVarPath = "/image";

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "decimalPrecision", decimalPrecision));

    
    
    
    final String[] localVarAccepts = {
      "img/png", "img/jpeg", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        File
      
    > apiResponse = apiClient.invokeAPI("ChartTemplatesApi.images", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, imagesResponseTypeMap, false);

    return apiResponse;

  }
}
