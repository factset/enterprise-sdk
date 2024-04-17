package com.factset.sdk.IRNConfiguration.api;

import com.factset.sdk.IRNConfiguration.ApiException;
import com.factset.sdk.IRNConfiguration.ApiClient;
import com.factset.sdk.IRNConfiguration.ApiResponse;
import com.factset.sdk.IRNConfiguration.Configuration;
import com.factset.sdk.IRNConfiguration.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.IRNConfiguration.models.NewItemDto;
import com.factset.sdk.IRNConfiguration.models.PhoneNumberTypeDto;
import com.factset.sdk.IRNConfiguration.models.ProblemDetails;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ContactsPhoneNumberTypesApi {
  private ApiClient apiClient;

  public ContactsPhoneNumberTypesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ContactsPhoneNumberTypesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> createPhoneNumberTypeResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    createPhoneNumberTypeResponseTypeMap.put(201, new GenericType<NewItemDto>(){});
    createPhoneNumberTypeResponseTypeMap.put(400, new GenericType<ProblemDetails>(){});
    createPhoneNumberTypeResponseTypeMap.put(0, new GenericType<ProblemDetails>(){});
  }

  private static final Map<Integer, GenericType> deletePhoneNumberTypeResponseTypeMap = new HashMap<Integer, GenericType>();

  private static final Map<Integer, GenericType> getPhoneNumberTypesResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getPhoneNumberTypesResponseTypeMap.put(200, new GenericType<java.util.List<PhoneNumberTypeDto>>(){});
  }

  private static final Map<Integer, GenericType> updatePhoneNumberTypeResponseTypeMap = new HashMap<Integer, GenericType>();

  


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
   * Create a phone type
   * 
   * @param body To add phoneNumberType (required)
   * @return NewItemDto
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public NewItemDto createPhoneNumberType(String body) throws ApiException {
    return createPhoneNumberTypeWithHttpInfo(body).getData();
  }

  /**
   * Create a phone type
   * 
   * @param body To add phoneNumberType (required)
   * @return ApiResponse&lt;NewItemDto&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NewItemDto> createPhoneNumberTypeWithHttpInfo(String body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createPhoneNumberType");
    }
    
    // create path and map variables
    String localVarPath = "/v1/phone-number-types";

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
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        NewItemDto
      
    > apiResponse = apiClient.invokeAPI("ContactsPhoneNumberTypesApi.createPhoneNumberType", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, createPhoneNumberTypeResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Delete a phone type
   * 
   * @param phoneNumberTypeId phoneNumberTypeId for deleting associated record (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public void deletePhoneNumberType(java.util.UUID phoneNumberTypeId) throws ApiException {
    deletePhoneNumberTypeWithHttpInfo(phoneNumberTypeId);
  }

  /**
   * Delete a phone type
   * 
   * @param phoneNumberTypeId phoneNumberTypeId for deleting associated record (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deletePhoneNumberTypeWithHttpInfo(java.util.UUID phoneNumberTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'phoneNumberTypeId' is set
    if (phoneNumberTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumberTypeId' when calling deletePhoneNumberType");
    }
    
    // create path and map variables
    String localVarPath = "/v1/phone-number-types/{phoneNumberTypeId}"
      .replaceAll("\\{" + "phoneNumberTypeId" + "\\}", apiClient.escapeString(phoneNumberTypeId.toString()));

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
      Void
    > apiResponse = apiClient.invokeAPI("ContactsPhoneNumberTypesApi.deletePhoneNumberType", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, deletePhoneNumberTypeResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get list of the phone types configured in your group
   * 
   * @return java.util.List<PhoneNumberTypeDto>
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<PhoneNumberTypeDto> getPhoneNumberTypes() throws ApiException {
    return getPhoneNumberTypesWithHttpInfo().getData();
  }

  /**
   * Get list of the phone types configured in your group
   * 
   * @return ApiResponse&lt;java.util.List<PhoneNumberTypeDto>&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<PhoneNumberTypeDto>> getPhoneNumberTypesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/phone-number-types";

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
        
        java.util.List<PhoneNumberTypeDto>
      
    > apiResponse = apiClient.invokeAPI("ContactsPhoneNumberTypesApi.getPhoneNumberTypes", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getPhoneNumberTypesResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Edit a phone type
   * 
   * @param phoneNumberTypeId phoneNumberTypeId to update associated record (required)
   * @param body Update with phoneNumberType (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public void updatePhoneNumberType(java.util.UUID phoneNumberTypeId, String body) throws ApiException {
    updatePhoneNumberTypeWithHttpInfo(phoneNumberTypeId, body);
  }

  /**
   * Edit a phone type
   * 
   * @param phoneNumberTypeId phoneNumberTypeId to update associated record (required)
   * @param body Update with phoneNumberType (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updatePhoneNumberTypeWithHttpInfo(java.util.UUID phoneNumberTypeId, String body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'phoneNumberTypeId' is set
    if (phoneNumberTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumberTypeId' when calling updatePhoneNumberType");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updatePhoneNumberType");
    }
    
    // create path and map variables
    String localVarPath = "/v1/phone-number-types/{phoneNumberTypeId}"
      .replaceAll("\\{" + "phoneNumberTypeId" + "\\}", apiClient.escapeString(phoneNumberTypeId.toString()));

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
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
      Void
    > apiResponse = apiClient.invokeAPI("ContactsPhoneNumberTypesApi.updatePhoneNumberType", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, updatePhoneNumberTypeResponseTypeMap, false);

    return apiResponse;

  }
}
