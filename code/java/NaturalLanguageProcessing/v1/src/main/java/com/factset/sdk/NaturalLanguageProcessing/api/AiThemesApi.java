package com.factset.sdk.NaturalLanguageProcessing.api;

import com.factset.sdk.NaturalLanguageProcessing.ApiException;
import com.factset.sdk.NaturalLanguageProcessing.ApiClient;
import com.factset.sdk.NaturalLanguageProcessing.ApiResponse;
import com.factset.sdk.NaturalLanguageProcessing.Configuration;
import com.factset.sdk.NaturalLanguageProcessing.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.NaturalLanguageProcessing.models.ErrorsRoot;
import com.factset.sdk.NaturalLanguageProcessing.models.ThemeParametersRoot;
import com.factset.sdk.NaturalLanguageProcessing.models.ThemesRoot;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AiThemesApi {
  private ApiClient apiClient;

  public AiThemesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AiThemesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> themesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    themesResponseTypeMap.put(200, new GenericType<ThemesRoot>(){});
    themesResponseTypeMap.put(400, new GenericType<ErrorsRoot>(){});
    themesResponseTypeMap.put(404, new GenericType<ErrorsRoot>(){});
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
   * Endpoint to extract themes from text
   * This endpoint extracts themes from unstructured text. Each theme (&#x60;themeText&#x60;) is also given a score (&#x60;themeScore&#x60;). This score shows the relevancy of the theme within the text. Example Output: &#x60;&#x60;&#x60;json {   \&quot;data\&quot;: [   {     \&quot;themeText\&quot;: \&quot;home entertainment results\&quot;,     \&quot;themeScore\&quot;: 0.92   },   {     \&quot;themeText\&quot;: \&quot;.....\&quot;,     \&quot;themeScore\&quot;: .....   }] } &#x60;&#x60;&#x60; 
   * @param themeParametersRoot  (required)
   * @return ThemesRoot
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, generated themes </td><td>  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  </td></tr>
       <tr><td> 400 </td><td> The browser (or proxy) sent a request that this server could not understand. </td><td>  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  </td></tr>
       <tr><td> 401 </td><td> The server could not verify that you are authorized to access the URL requested. You either supplied the wrong credentials (e.g. a bad password), or your browser doesn&#39;t understand how to supply the credentials required. </td><td>  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  </td></tr>
       <tr><td> 403 </td><td> You don&#39;t have the permission to access the requested resource. It is either read-protected or not readable by the server. </td><td>  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  </td></tr>
       <tr><td> 404 </td><td> The requested URL was not found on the server. If you entered the URL manually please check your spelling and try again. </td><td>  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  </td></tr>
       <tr><td> 500 </td><td> The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. </td><td>  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  </td></tr>
       <tr><td> 503 </td><td> The server is temporarily unable to service your request due to maintenance downtime or capacity problems. Please try again later. </td><td>  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  </td></tr>
     </table>
   */
  public ThemesRoot themes(ThemeParametersRoot themeParametersRoot) throws ApiException {
    return themesWithHttpInfo(themeParametersRoot).getData();
  }

  /**
   * Endpoint to extract themes from text
   * This endpoint extracts themes from unstructured text. Each theme (&#x60;themeText&#x60;) is also given a score (&#x60;themeScore&#x60;). This score shows the relevancy of the theme within the text. Example Output: &#x60;&#x60;&#x60;json {   \&quot;data\&quot;: [   {     \&quot;themeText\&quot;: \&quot;home entertainment results\&quot;,     \&quot;themeScore\&quot;: 0.92   },   {     \&quot;themeText\&quot;: \&quot;.....\&quot;,     \&quot;themeScore\&quot;: .....   }] } &#x60;&#x60;&#x60; 
   * @param themeParametersRoot  (required)
   * @return ApiResponse&lt;ThemesRoot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response, generated themes </td><td>  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  </td></tr>
       <tr><td> 400 </td><td> The browser (or proxy) sent a request that this server could not understand. </td><td>  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  </td></tr>
       <tr><td> 401 </td><td> The server could not verify that you are authorized to access the URL requested. You either supplied the wrong credentials (e.g. a bad password), or your browser doesn&#39;t understand how to supply the credentials required. </td><td>  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  </td></tr>
       <tr><td> 403 </td><td> You don&#39;t have the permission to access the requested resource. It is either read-protected or not readable by the server. </td><td>  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  </td></tr>
       <tr><td> 404 </td><td> The requested URL was not found on the server. If you entered the URL manually please check your spelling and try again. </td><td>  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  </td></tr>
       <tr><td> 500 </td><td> The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. </td><td>  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  </td></tr>
       <tr><td> 503 </td><td> The server is temporarily unable to service your request due to maintenance downtime or capacity problems. Please try again later. </td><td>  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  </td></tr>
     </table>
   */
  public ApiResponse<ThemesRoot> themesWithHttpInfo(ThemeParametersRoot themeParametersRoot) throws ApiException {
    Object localVarPostBody = themeParametersRoot;
    
    // verify the required parameter 'themeParametersRoot' is set
    if (themeParametersRoot == null) {
      throw new ApiException(400, "Missing the required parameter 'themeParametersRoot' when calling themes");
    }
    
    // create path and map variables
    String localVarPath = "/themes";

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
        
        ThemesRoot
      
    > apiResponse = apiClient.invokeAPI("AiThemesApi.themes", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, themesResponseTypeMap, false);

    return apiResponse;

  }
}
