package com.factset.sdk.FactSetOptions.api;

import com.factset.sdk.FactSetOptions.ApiException;
import com.factset.sdk.FactSetOptions.ApiClient;
import com.factset.sdk.FactSetOptions.ApiResponse;
import com.factset.sdk.FactSetOptions.Configuration;
import com.factset.sdk.FactSetOptions.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetOptions.models.AtmImpliedVolatilityRequest;
import com.factset.sdk.FactSetOptions.models.AtmImpliedVolatilityResponse;
import com.factset.sdk.FactSetOptions.models.ErrorResponse;
import com.factset.sdk.FactSetOptions.models.GreeksRequest;
import com.factset.sdk.FactSetOptions.models.GreeksResponse;
import com.factset.sdk.FactSetOptions.models.ImpliedVolatilityRequest;
import com.factset.sdk.FactSetOptions.models.ImpliedVolatilityResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RiskMeasuresApi {
  private ApiClient apiClient;

  public RiskMeasuresApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RiskMeasuresApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getOptionsATMImpliedVolatilityForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOptionsATMImpliedVolatilityForListResponseTypeMap.put(200, new GenericType<AtmImpliedVolatilityResponse>(){});
    getOptionsATMImpliedVolatilityForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getOptionsATMImpliedVolatilityForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getOptionsATMImpliedVolatilityForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getOptionsATMImpliedVolatilityForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getOptionsATMImpliedVolatilityForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getOptionsGreeksForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOptionsGreeksForListResponseTypeMap.put(200, new GenericType<GreeksResponse>(){});
    getOptionsGreeksForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getOptionsGreeksForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getOptionsGreeksForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getOptionsGreeksForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getOptionsGreeksForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getOptionsVolatilityForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getOptionsVolatilityForListResponseTypeMap.put(200, new GenericType<ImpliedVolatilityResponse>(){});
    getOptionsVolatilityForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getOptionsVolatilityForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getOptionsVolatilityForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getOptionsVolatilityForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getOptionsVolatilityForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
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
   * Returns the at-the-money (ATM) implied volatility details for the specified underlying security identifier
   * Returns weighted average of the implied volatilities from the options listed for a specified security identifier.   There are three different methods available for calculating at-the-money implied volatility (ATM IV), which gives a weighted average of the implied volatilities from the options listed on a given stock. They are ATM IV (Filtered), ATM IV (Filtered with Smoothing), and ATM IV (Market). Each of these ATM IV calculations is available for just the calls on a given stock, just the puts, or the composite of both the calls and puts. This at-the-money implied volatility market can calculated for different periods - * One Month * Two Months * Three Months * Four Months * Five Months * Six Months  *For more details regarding ATM Volatility calculations, visit [OA 16276](https://my.apps.factset.com/oa/pages/16276)*    *Currently only OPRA Exchange traded options are supported* 
   * @param atmImpliedVolatilityRequest  (required)
   * @return AtmImpliedVolatilityResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ATM Implied Volatility Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public AtmImpliedVolatilityResponse getOptionsATMImpliedVolatilityForList(AtmImpliedVolatilityRequest atmImpliedVolatilityRequest) throws ApiException {
    return getOptionsATMImpliedVolatilityForListWithHttpInfo(atmImpliedVolatilityRequest).getData();
  }

  /**
   * Returns the at-the-money (ATM) implied volatility details for the specified underlying security identifier
   * Returns weighted average of the implied volatilities from the options listed for a specified security identifier.   There are three different methods available for calculating at-the-money implied volatility (ATM IV), which gives a weighted average of the implied volatilities from the options listed on a given stock. They are ATM IV (Filtered), ATM IV (Filtered with Smoothing), and ATM IV (Market). Each of these ATM IV calculations is available for just the calls on a given stock, just the puts, or the composite of both the calls and puts. This at-the-money implied volatility market can calculated for different periods - * One Month * Two Months * Three Months * Four Months * Five Months * Six Months  *For more details regarding ATM Volatility calculations, visit [OA 16276](https://my.apps.factset.com/oa/pages/16276)*    *Currently only OPRA Exchange traded options are supported* 
   * @param atmImpliedVolatilityRequest  (required)
   * @return ApiResponse&lt;AtmImpliedVolatilityResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ATM Implied Volatility Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AtmImpliedVolatilityResponse> getOptionsATMImpliedVolatilityForListWithHttpInfo(AtmImpliedVolatilityRequest atmImpliedVolatilityRequest) throws ApiException {
    Object localVarPostBody = atmImpliedVolatilityRequest;
    
    // verify the required parameter 'atmImpliedVolatilityRequest' is set
    if (atmImpliedVolatilityRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'atmImpliedVolatilityRequest' when calling getOptionsATMImpliedVolatilityForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-options/v1/atm-implied-volatility";

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
        
        AtmImpliedVolatilityResponse
      
    > apiResponse = apiClient.invokeAPI("RiskMeasuresApi.getOptionsATMImpliedVolatilityForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOptionsATMImpliedVolatilityForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns all the Greeks details for the specified option identifier
   * Returns all the greeks details for the specified option identifier. Greeks provide quantifiable factors for measuring the option&#39;s price sensativity. Greeks include -  |Greek|Description| |---|---| |Delta| The ratio comparing the change in the price of the underlying asset to the corresponding change in the price of a derivative. Sometimes referred to as the \&quot;hedge ratio\&quot;. For example, with respect to call options, a delta of 0.7 means that for every $1 the underlying stock increases, the call option will increase by $0.70. Put option deltas, on the other hand, will be negative, because as the underlying security increases, the value of the option will decrease. So a put option with a delta of -0.7 will decrease by $0.70 for every $1 the underlying increases in price. As an in-the-money call option nears expiration, it will approach a delta of 1.00, and as an in-the-money put option nears expiration, it will approach a delta of -1.00.| |Gamma| The rate of change for delta with respect to the underlying asset&#39;s price. Mathematically, gamma is the first derivative of delta and is used when trying to gauge the price of an option relative to the amount it is in or out of the money. When the option being measured is deep in or out of the money, gamma is small. When the option is near the money, gamma is largest.| |Rho|The rate at which the price of a derivative changes relative to a change in the risk-free rate of interest. Rho measures the sensitivity of an option or options portfolio to a change in interest rate.| |Theta|A measure of the rate of decline in the value of an option due to the passage of time. Theta can also be referred to as the time decay on the value of an option. If everything is held constant, then the option will lose value as time moves closer to the maturity of the option. For example, if the strike price of an option is $1,150 and theta is 53.80, then in theory the value of the option will drop $53.80 per day. The measure of theta quantifies the risk that time imposes on options as options are only exercisable for a certain period of time.| |Vega|The amount that the price of an option changes compared to a 1% change in volatility. Vega changes when there are large price movements in the underlying asset and vega falls as the option gets closer to maturity. Vega can change even if there is no change in the price of the underlying asset, this would happen if there is a change in expected volatility. For example, if the vega of an option is -96.94 and if implied volatility were to rise by 1% then the option value would fall by $96.94.|  Note   * Each step in the binomial model represents a change in time, therefore, point estimates of the Greeks can be calculated for American options. The following can be used to calculate the Greeks for the Binomial Option Pricing Model (BOPM) pricing model, using the notation fstep,node so f1,1 represents the option price at the first step, top node (nodes are counted at each step starting with 0 at the bottom. See [Constructing the Tree](https://my.apps.factset.com/oa/pages/17735#tree) for more information).    For more detials on calculation methodologies, visit [OA 14933](https://my.apps.factset.com/oa/pages/14933).     *Currently only OPRA Exchange is supported with exchange ISO \&quot;USA\&quot;* 
   * @param greeksRequest Greeks Request Object (required)
   * @return GreeksResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Options Greeks Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public GreeksResponse getOptionsGreeksForList(GreeksRequest greeksRequest) throws ApiException {
    return getOptionsGreeksForListWithHttpInfo(greeksRequest).getData();
  }

  /**
   * Returns all the Greeks details for the specified option identifier
   * Returns all the greeks details for the specified option identifier. Greeks provide quantifiable factors for measuring the option&#39;s price sensativity. Greeks include -  |Greek|Description| |---|---| |Delta| The ratio comparing the change in the price of the underlying asset to the corresponding change in the price of a derivative. Sometimes referred to as the \&quot;hedge ratio\&quot;. For example, with respect to call options, a delta of 0.7 means that for every $1 the underlying stock increases, the call option will increase by $0.70. Put option deltas, on the other hand, will be negative, because as the underlying security increases, the value of the option will decrease. So a put option with a delta of -0.7 will decrease by $0.70 for every $1 the underlying increases in price. As an in-the-money call option nears expiration, it will approach a delta of 1.00, and as an in-the-money put option nears expiration, it will approach a delta of -1.00.| |Gamma| The rate of change for delta with respect to the underlying asset&#39;s price. Mathematically, gamma is the first derivative of delta and is used when trying to gauge the price of an option relative to the amount it is in or out of the money. When the option being measured is deep in or out of the money, gamma is small. When the option is near the money, gamma is largest.| |Rho|The rate at which the price of a derivative changes relative to a change in the risk-free rate of interest. Rho measures the sensitivity of an option or options portfolio to a change in interest rate.| |Theta|A measure of the rate of decline in the value of an option due to the passage of time. Theta can also be referred to as the time decay on the value of an option. If everything is held constant, then the option will lose value as time moves closer to the maturity of the option. For example, if the strike price of an option is $1,150 and theta is 53.80, then in theory the value of the option will drop $53.80 per day. The measure of theta quantifies the risk that time imposes on options as options are only exercisable for a certain period of time.| |Vega|The amount that the price of an option changes compared to a 1% change in volatility. Vega changes when there are large price movements in the underlying asset and vega falls as the option gets closer to maturity. Vega can change even if there is no change in the price of the underlying asset, this would happen if there is a change in expected volatility. For example, if the vega of an option is -96.94 and if implied volatility were to rise by 1% then the option value would fall by $96.94.|  Note   * Each step in the binomial model represents a change in time, therefore, point estimates of the Greeks can be calculated for American options. The following can be used to calculate the Greeks for the Binomial Option Pricing Model (BOPM) pricing model, using the notation fstep,node so f1,1 represents the option price at the first step, top node (nodes are counted at each step starting with 0 at the bottom. See [Constructing the Tree](https://my.apps.factset.com/oa/pages/17735#tree) for more information).    For more detials on calculation methodologies, visit [OA 14933](https://my.apps.factset.com/oa/pages/14933).     *Currently only OPRA Exchange is supported with exchange ISO \&quot;USA\&quot;* 
   * @param greeksRequest Greeks Request Object (required)
   * @return ApiResponse&lt;GreeksResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Options Greeks Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GreeksResponse> getOptionsGreeksForListWithHttpInfo(GreeksRequest greeksRequest) throws ApiException {
    Object localVarPostBody = greeksRequest;
    
    // verify the required parameter 'greeksRequest' is set
    if (greeksRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'greeksRequest' when calling getOptionsGreeksForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-options/v1/greeks";

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
        
        GreeksResponse
      
    > apiResponse = apiClient.invokeAPI("RiskMeasuresApi.getOptionsGreeksForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOptionsGreeksForListResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Returns the implied volatility information for the specified option identifier
   * Returns the Implied Volatility for the specified option across European and American contracts. For more details regarding Implied Volatility calculations visit - [OA 14932](https://my.apps.factset.com/oa/pages/14932)  *Currently the following exchanges are not supported for API use cases - CME, CMEE, CBT, CBTE, NYM, NYME* 
   * @param impliedVolatilityRequest Volatility Request Object (required)
   * @return ImpliedVolatilityResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Volatility Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ImpliedVolatilityResponse getOptionsVolatilityForList(ImpliedVolatilityRequest impliedVolatilityRequest) throws ApiException {
    return getOptionsVolatilityForListWithHttpInfo(impliedVolatilityRequest).getData();
  }

  /**
   * Returns the implied volatility information for the specified option identifier
   * Returns the Implied Volatility for the specified option across European and American contracts. For more details regarding Implied Volatility calculations visit - [OA 14932](https://my.apps.factset.com/oa/pages/14932)  *Currently the following exchanges are not supported for API use cases - CME, CMEE, CBT, CBTE, NYM, NYME* 
   * @param impliedVolatilityRequest Volatility Request Object (required)
   * @return ApiResponse&lt;ImpliedVolatilityResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Volatility Response Object </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ImpliedVolatilityResponse> getOptionsVolatilityForListWithHttpInfo(ImpliedVolatilityRequest impliedVolatilityRequest) throws ApiException {
    Object localVarPostBody = impliedVolatilityRequest;
    
    // verify the required parameter 'impliedVolatilityRequest' is set
    if (impliedVolatilityRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'impliedVolatilityRequest' when calling getOptionsVolatilityForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-options/v1/implied-volatility";

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
        
        ImpliedVolatilityResponse
      
    > apiResponse = apiClient.invokeAPI("RiskMeasuresApi.getOptionsVolatilityForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getOptionsVolatilityForListResponseTypeMap, false);

    return apiResponse;

  }
}
