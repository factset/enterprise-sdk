package com.factset.sdk.NaturalLanguageProcessing.api;

import com.factset.sdk.NaturalLanguageProcessing.ApiException;
import com.factset.sdk.NaturalLanguageProcessing.ApiClient;
import com.factset.sdk.NaturalLanguageProcessing.ApiResponse;
import com.factset.sdk.NaturalLanguageProcessing.Configuration;
import com.factset.sdk.NaturalLanguageProcessing.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.NaturalLanguageProcessing.models.HTTPErrorRoot;
import com.factset.sdk.NaturalLanguageProcessing.models.TaskRoot;
import com.factset.sdk.NaturalLanguageProcessing.models.ThemeSentimentsRoot;
import com.factset.sdk.NaturalLanguageProcessing.models.ThemesParametersRoot;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class AiThemesApi {
  private ApiClient apiClient;

  public AiThemesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AiThemesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> themesExtractThemesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    themesExtractThemesResponseTypeMap.put(202, new GenericType<TaskRoot>(){});
    themesExtractThemesResponseTypeMap.put(400, new GenericType<HTTPErrorRoot>(){});
    themesExtractThemesResponseTypeMap.put(401, new GenericType<HTTPErrorRoot>(){});
    themesExtractThemesResponseTypeMap.put(500, new GenericType<HTTPErrorRoot>(){});
  }

  private static final Map<Integer, GenericType> themesGetStatusResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    themesGetStatusResponseTypeMap.put(201, new GenericType<TaskRoot>(){});
    themesGetStatusResponseTypeMap.put(202, new GenericType<TaskRoot>(){});
    themesGetStatusResponseTypeMap.put(404, new GenericType<HTTPErrorRoot>(){});
    themesGetStatusResponseTypeMap.put(500, new GenericType<HTTPErrorRoot>(){});
  }

  private static final Map<Integer, GenericType> themesGetThemesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    themesGetThemesResponseTypeMap.put(200, new GenericType<ThemeSentimentsRoot>(){});
    themesGetThemesResponseTypeMap.put(202, new GenericType<TaskRoot>(){});
    themesGetThemesResponseTypeMap.put(404, new GenericType<HTTPErrorRoot>(){});
    themesGetThemesResponseTypeMap.put(500, new GenericType<HTTPErrorRoot>(){});
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
   * Endpoint to begin theme extraction job
   * Endpoint to extract themes from provided text. Optionally, can include sentiment for each theme extracted. Please check the schema(s) for each of the status codes for more details.
   * @param themesParametersRoot  (required)
   * @return TaskRoot
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  </td></tr>
       <tr><td> 400 </td><td> The browser (or proxy) sent a request that this server could not understand. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> The server could not verify that you are authorized to access the URL requested. You either supplied the wrong credentials (e.g. a bad password), or your browser doesn&#39;t understand how to supply the credentials required. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. </td><td>  -  </td></tr>
     </table>
   */
  public TaskRoot themesExtractThemes(ThemesParametersRoot themesParametersRoot) throws ApiException {
    return themesExtractThemesWithHttpInfo(themesParametersRoot).getData();
  }

  /**
   * Endpoint to begin theme extraction job
   * Endpoint to extract themes from provided text. Optionally, can include sentiment for each theme extracted. Please check the schema(s) for each of the status codes for more details.
   * @param themesParametersRoot  (required)
   * @return ApiResponse&lt;TaskRoot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  </td></tr>
       <tr><td> 400 </td><td> The browser (or proxy) sent a request that this server could not understand. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> The server could not verify that you are authorized to access the URL requested. You either supplied the wrong credentials (e.g. a bad password), or your browser doesn&#39;t understand how to supply the credentials required. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TaskRoot> themesExtractThemesWithHttpInfo(ThemesParametersRoot themesParametersRoot) throws ApiException {
    Object localVarPostBody = themesParametersRoot;
    
    // verify the required parameter 'themesParametersRoot' is set
    if (themesParametersRoot == null) {
      throw new ApiException(400, "Missing the required parameter 'themesParametersRoot' when calling themesExtractThemes");
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
        
        TaskRoot
      
    > apiResponse = apiClient.invokeAPI("AiThemesApi.themesExtractThemes", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, themesExtractThemesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Endpoint to get the completion status of a themes job
   * Endpoint to obtain the completion status of the themes task request. The &#x60;id&#x60; parameter represents the task.
   * @param id Long running task identifier (required)
   * @return TaskRoot
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  </td></tr>
       <tr><td> 404 </td><td> description: The requested URL was not found on the server. If you entered the URL manually please check your spelling and try again. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. </td><td>  -  </td></tr>
     </table>
   */
  public TaskRoot themesGetStatus(String id) throws ApiException {
    return themesGetStatusWithHttpInfo(id).getData();
  }

  /**
   * Endpoint to get the completion status of a themes job
   * Endpoint to obtain the completion status of the themes task request. The &#x60;id&#x60; parameter represents the task.
   * @param id Long running task identifier (required)
   * @return ApiResponse&lt;TaskRoot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  </td></tr>
       <tr><td> 404 </td><td> description: The requested URL was not found on the server. If you entered the URL manually please check your spelling and try again. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TaskRoot> themesGetStatusWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling themesGetStatus");
    }
    
    // create path and map variables
    String localVarPath = "/themes/{id}/status"
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
        
        TaskRoot
      
    > apiResponse = apiClient.invokeAPI("AiThemesApi.themesGetStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, themesGetStatusResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Endpoint to get a theme (and sentiments if requested) job result
   * Endpoint to obtain the results from the original themes task request. The &#x60;id&#x60; parameter represents the identifier of the task generated from the POST request which created the task. Once the task is complete, the result can be fetched with this endpoint.
   * @param id Long running task identifier (required)
   * @return ThemeSentimentsRoot
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  </td></tr>
       <tr><td> 404 </td><td> description: The requested URL was not found on the server. If you entered the URL manually please check your spelling and try again. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. </td><td>  -  </td></tr>
     </table>
   */
  public ThemeSentimentsRoot themesGetThemes(String id) throws ApiException {
    return themesGetThemesWithHttpInfo(id).getData();
  }

  /**
   * Endpoint to get a theme (and sentiments if requested) job result
   * Endpoint to obtain the results from the original themes task request. The &#x60;id&#x60; parameter represents the identifier of the task generated from the POST request which created the task. Once the task is complete, the result can be fetched with this endpoint.
   * @param id Long running task identifier (required)
   * @return ApiResponse&lt;ThemeSentimentsRoot&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  </td></tr>
       <tr><td> 404 </td><td> description: The requested URL was not found on the server. If you entered the URL manually please check your spelling and try again. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ThemeSentimentsRoot> themesGetThemesWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling themesGetThemes");
    }
    
    // create path and map variables
    String localVarPath = "/themes/{id}"
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
        
        ThemeSentimentsRoot
      
    > apiResponse = apiClient.invokeAPI("AiThemesApi.themesGetThemes", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, themesGetThemesResponseTypeMap, false);

    return apiResponse;

  }
}
