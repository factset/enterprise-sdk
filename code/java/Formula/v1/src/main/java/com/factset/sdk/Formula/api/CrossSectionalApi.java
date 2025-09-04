package com.factset.sdk.Formula.api;

import com.factset.sdk.Formula.ApiException;
import com.factset.sdk.Formula.ApiClient;
import com.factset.sdk.Formula.ApiResponse;
import com.factset.sdk.Formula.Configuration;
import com.factset.sdk.Formula.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.Formula.models.BatchStatusResponse;
import com.factset.sdk.Formula.models.CrossSectionalRequest;
import com.factset.sdk.Formula.models.CrossSectionalResponse;
import com.factset.sdk.Formula.models.ErrorDetail;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CrossSectionalApi {
  private ApiClient apiClient;

  public CrossSectionalApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CrossSectionalApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getCrossSectionalDataForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getCrossSectionalDataForListResponseTypeMap.put(200, new GenericType<CrossSectionalResponse>(){});
    getCrossSectionalDataForListResponseTypeMap.put(202, new GenericType<BatchStatusResponse>(){});
    getCrossSectionalDataForListResponseTypeMap.put(400, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataForListResponseTypeMap.put(401, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataForListResponseTypeMap.put(403, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataForListResponseTypeMap.put(404, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataForListResponseTypeMap.put(405, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataForListResponseTypeMap.put(406, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataForListResponseTypeMap.put(408, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataForListResponseTypeMap.put(413, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataForListResponseTypeMap.put(415, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataForListResponseTypeMap.put(429, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataForListResponseTypeMap.put(500, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataForListResponseTypeMap.put(501, new GenericType<ErrorDetail>(){});
    getCrossSectionalDataForListResponseTypeMap.put(503, new GenericType<ErrorDetail>(){});
  }

  
 /**
   * Wrapper to support POST /cross-sectional returning different types
   * per status code.
   *
   * <p>
   * Responses:
   * <ul>
   *   <li>200 : {@code CrossSectionalResponse }<br>Gets an array of &#x60;Response Objects&#x60; for a list of IDs and Screening formulas.</li>
   * 
   *   <li>202 : {@code BatchStatusResponse }<br>Batch request has been accepted.</li>
   * </ul>
   *
   * <p>
   * Example:
   * <pre>{@code
   * GetCrossSectionalDataForListResponseWrapper response = ...;
   * switch (response.statusCode) {
   *   case 200:
   *     CrossSectionalResponse data200 = response.getResponse200();
   *     break;
   *   case 202:
   *     BatchStatusResponse data202 = response.getResponse202();
   *     break;
   *  }
   * }</pre>
   */
  public static class GetCrossSectionalDataForListResponseWrapper {
    public final int statusCode;
    public final Object response;

    public GetCrossSectionalDataForListResponseWrapper(int statusCode, Object response) {
      this.statusCode = statusCode;
      this.response = response;
    }

    public int getStatusCode() { return statusCode; }
    public Object getResponse() { return response; }
    
    public CrossSectionalResponse getResponse200() throws ApiException {
      if (this.statusCode != 200) {
        throw new ApiException(500, "Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
      }
      return (CrossSectionalResponse) this.response;
    }
    
    public BatchStatusResponse getResponse202() throws ApiException {
      if (this.statusCode != 202) {
        throw new ApiException(500, "Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
      }
      return (BatchStatusResponse) this.response;
    }
    

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      GetCrossSectionalDataForListResponseWrapper other = (GetCrossSectionalDataForListResponseWrapper) o;
      return this.statusCode == other.statusCode &&
        Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
      return Objects.hash(statusCode, response);
    }

    @Override
    public String toString() {
      return "class GetCrossSectionalDataForListResponseWrapper {\n"
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
   * Retrieve data items (Screening formulas) for a list of identifiers or defined universe.
   * The &#x60;/cross-sectional&#x60; endpoint is closely aligned with FactSet&#39;s powerful data retrieval **Screening language** which is optimized for analysis of data items at single point in time for different entities and is extremely efficient for large universes.   The &#x60;/cross-sectional&#x60; endpoint supports Long Running asynchronous requests up to **30 minutes** via the &#x60;batch&#x60; parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.*  ***  ### Iterated Cross-Sectional Functionality   This endpoint supports the ability to automatically iterate through different cross sections over time. The **Iterated Cross-Sectional Functionality (ICSF)** expands the Cross-Sectional endpoint to support retrieving data items for *multiple dates*, allowing users to take advantage of the Screening engine&#39;s efficiency even when history is required.    Use the parameters &#x60;startDate&#x60;, &#x60;endDate&#x60;, and &#x60;frequency&#x60; in the Cross-Sectional endpoint to provide your desired dates. Specify \&quot;0\&quot; in date argument of the Screening formulas provided in the formulas parameter and/or the universe parameter. Lastly, the Iterated Cross-Sectional Functionality is required to run as a &#x60;batch&#x60; request. Therefore, the batch parameter must be set to \&quot;Y\&quot;.    Access to backtesting and batch functionality is required to leverage the Iterated Cross-Sectional Functionality.   **When to use ICSF:**  The ICSF can offer better performance than Time-Series requests when the date range is relatively small, and so it is recommended to use ICSF if the number of IDs requested is greater than the number of dates. If the number of dates is greater than the number of IDs in the request, it is recommended to use Time-Series.   *Note: This is a general rule of thumb and performance may vary depending on the formulas in use.* 
   * @param crossSectionalRequest  (required)
   * @return GetCrossSectionalDataForListResponseWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Gets an array of &#x60;Response Objects&#x60; for a list of IDs and Screening formulas. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - URL to poll for status of batch request. <br>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 403 </td><td> Not Authorized. This error will will occur if the user lacks the required permissions or if the API request is made from an IP address not specified in the API Key configuration. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 404 </td><td> Endpoint Not Found </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Bad Accept Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 408 </td><td> Request Timeout. This error may be returned if it takes more than 29 seconds for the request to process or if a batch request takes more than 30 minutes to process. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 413 </td><td> Content Too Large. This error may be returned if the request payload size is too large to be processed in the alloted amount of time. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 415 </td><td> Bad Content-Type Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate Limits Exceeded </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Generic Server Error </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service Temporarily Unavailable </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
     </table>
   */
  public GetCrossSectionalDataForListResponseWrapper getCrossSectionalDataForList(CrossSectionalRequest crossSectionalRequest) throws ApiException {
    return getCrossSectionalDataForListWithHttpInfo(crossSectionalRequest).getData();
  }

  /**
   * Retrieve data items (Screening formulas) for a list of identifiers or defined universe.
   * The &#x60;/cross-sectional&#x60; endpoint is closely aligned with FactSet&#39;s powerful data retrieval **Screening language** which is optimized for analysis of data items at single point in time for different entities and is extremely efficient for large universes.   The &#x60;/cross-sectional&#x60; endpoint supports Long Running asynchronous requests up to **30 minutes** via the &#x60;batch&#x60; parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.*  ***  ### Iterated Cross-Sectional Functionality   This endpoint supports the ability to automatically iterate through different cross sections over time. The **Iterated Cross-Sectional Functionality (ICSF)** expands the Cross-Sectional endpoint to support retrieving data items for *multiple dates*, allowing users to take advantage of the Screening engine&#39;s efficiency even when history is required.    Use the parameters &#x60;startDate&#x60;, &#x60;endDate&#x60;, and &#x60;frequency&#x60; in the Cross-Sectional endpoint to provide your desired dates. Specify \&quot;0\&quot; in date argument of the Screening formulas provided in the formulas parameter and/or the universe parameter. Lastly, the Iterated Cross-Sectional Functionality is required to run as a &#x60;batch&#x60; request. Therefore, the batch parameter must be set to \&quot;Y\&quot;.    Access to backtesting and batch functionality is required to leverage the Iterated Cross-Sectional Functionality.   **When to use ICSF:**  The ICSF can offer better performance than Time-Series requests when the date range is relatively small, and so it is recommended to use ICSF if the number of IDs requested is greater than the number of dates. If the number of dates is greater than the number of IDs in the request, it is recommended to use Time-Series.   *Note: This is a general rule of thumb and performance may vary depending on the formulas in use.* 
   * @param crossSectionalRequest  (required)
   * @return ApiResponse&lt;GetCrossSectionalDataForListResponseWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Gets an array of &#x60;Response Objects&#x60; for a list of IDs and Screening formulas. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  </td></tr>
       <tr><td> 202 </td><td> Batch request has been accepted. </td><td>  * Location - URL to poll for status of batch request. <br>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 403 </td><td> Not Authorized. This error will will occur if the user lacks the required permissions or if the API request is made from an IP address not specified in the API Key configuration. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 404 </td><td> Endpoint Not Found </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
       <tr><td> 406 </td><td> Bad Accept Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 408 </td><td> Request Timeout. This error may be returned if it takes more than 29 seconds for the request to process or if a batch request takes more than 30 minutes to process. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 413 </td><td> Content Too Large. This error may be returned if the request payload size is too large to be processed in the alloted amount of time. </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 415 </td><td> Bad Content-Type Header </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 429 </td><td> Rate Limits Exceeded </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  * Retry-After -  <br>  </td></tr>
       <tr><td> 500 </td><td> Generic Server Error </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
       <tr><td> 503 </td><td> Service Temporarily Unavailable </td><td>  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<GetCrossSectionalDataForListResponseWrapper> getCrossSectionalDataForListWithHttpInfo(CrossSectionalRequest crossSectionalRequest) throws ApiException {
    Object localVarPostBody = crossSectionalRequest;
    
    // verify the required parameter 'crossSectionalRequest' is set
    if (crossSectionalRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'crossSectionalRequest' when calling getCrossSectionalDataForList");
    }
    
    // create path and map variables
    String localVarPath = "/cross-sectional";

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
        
      
    > apiResponse = apiClient.invokeAPI("CrossSectionalApi.getCrossSectionalDataForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getCrossSectionalDataForListResponseTypeMap, false);

    int statusCode = apiResponse.getStatusCode();
    GetCrossSectionalDataForListResponseWrapper responseWrapper = new GetCrossSectionalDataForListResponseWrapper(
      statusCode,
      apiResponse.getData()
    );

    return new ApiResponse<GetCrossSectionalDataForListResponseWrapper>(statusCode, apiResponse.getHeaders(), responseWrapper);


  }
}
