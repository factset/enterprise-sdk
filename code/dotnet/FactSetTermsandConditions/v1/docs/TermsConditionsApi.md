# FactSet.SDK.FactSetTermsandConditions.Api.TermsConditionsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetTermsAndConditions**](TermsConditionsApi.md#gettermsandconditions) | **GET** /factset-terms-and-conditions/v1/terms-and-conditions | Return select Terms and Conditions items for a Fixed Income security.
[**GetTermsAndConditionsFields**](TermsConditionsApi.md#gettermsandconditionsfields) | **GET** /factset-terms-and-conditions/v1/fields | Available fields for /terms-and-conditions endpoint
[**GetTermsAndConditionsForList**](TermsConditionsApi.md#gettermsandconditionsforlist) | **POST** /factset-terms-and-conditions/v1/terms-and-conditions | Return Terms and Conditions for a list of Fixed Income securities.


<a name="gettermsandconditions"></a>
# **GetTermsAndConditions**
> TermsAndConditionsResponse GetTermsAndConditions (List<string> ids, List<string> fields = null, List<string> categories = null)

Return select Terms and Conditions items for a Fixed Income security.

Returns Terms and Conditions data items for the Fixed Income security. Includes items for Conditional Redemptions, Redemption Options, Security Details, and Coupon Details. Use the `fields` parameter to request specific items only or request an entire category of items to fetch all available fields matching that category(s). <p>*For T&C data related to Agency, Coupon History, Issue Size, Negative Covenants, or Redemption Prices, Lead Underwriters, and Use of Proceeds, please use respective endpoints optimized for that content.*</p> 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using FactSet.SDK.Utils.Authentication;
using Microsoft.IdentityModel.Tokens;
using FactSet.SDK.FactSetTermsandConditions.Api;
using FactSet.SDK.FactSetTermsandConditions.Client;
using FactSet.SDK.FactSetTermsandConditions.Model;

namespace Example
{
    public class GetTermsAndConditionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.factset.com/content";
            // Configure HTTP basic authorization: FactSetApiKey
            config.Username = "YOUR_USERNAME";
            config.Password = "YOUR_PASSWORD";
            // Configure OAuth2 access token for authorization: FactSetOAuth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            // Configure FactSet Authentication Client to automatically retrieve token for: FactSetOAuth2

            // using path to configuration:
            String pathToConfig = "";   // String contining absolute path to your configuration
            config.OAuth2Client = new ConfidentialClient(pathToConfig);

            // OR

            // If your configuration information is not within a file, you will provide the following information to create a new configuration.
            //   `name` - "Application Name registered with the FactSet Developer Portal",
            //   `clientId` - "Client ID registered with the FactSet Developer Portal",
            //   `clientAuthType` - For confidential client this will be "Confidential",
            //   `owners` - new List<string>() { "Owner ID(s) of this configuration" },
            //   `jwk` - new JsonWebKey(@"{
            //                     'kty': 'RSA',
            //                     'use': 'sig',
            //                     'alg': 'RS256',
            //                     'kid': 'Key ID',
            //                     'd': 'ECC Private Key',
            //                     'n': 'Modulus',
            //                     'e': 'Exponent',
            //                     'p': 'First Prime Factor',
            //                     'q': 'Second Prime Factor',
            //                     'dp': 'First Factor CRT Exponent',
            //                     'dq': 'Second Factor CRT Exponent',
            //                      'qi': 'First CRT Coefficient',
            //           }");

            // `NB`: Within the JWK parameters kty, alg, use, kid, n, e, d, p, q, dp, dq, qi are required for authorization.
            
            var config = new FactSet.SDK.Utils.Authentication.Configuration(name, clientId, clientAuthType, owners, jwk);
            config.OAuth2Client = new ConfidentialClient(config);

            var apiInstance = new TermsConditionsApi(config);
            var ids = new List<string>(); // List<string> | List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 
            var fields = new List<string>(); // List<string> | List of data items for Terms and Conditions. For a full list of available fields, definitions, and category assignments, use the `/fields` endpoint. (optional) 
            var categories = new List<string>(); // List<string> | Selects the Fixed Income metrics by major category. Use the `/fields` endpoint to get a list of all fields associated with each category.   * **SECURITY_DETAILS** = Detailed information about the security.   * **COUPON_DETAILS** = Coupon details.   * **CONVERTIBLE_FEATURES** = Features of convertible instruments.   * **REDEMPTION_OPTIONS** = Redemption options.  (optional) 

            try
            {
                // Return select Terms and Conditions items for a Fixed Income security.
                TermsAndConditionsResponse result = apiInstance.GetTermsAndConditions(ids, fields, categories);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling TermsConditionsApi.GetTermsAndConditions: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**List&lt;string&gt;**](string.md)| List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  | 
 **fields** | [**List&lt;string&gt;**](string.md)| List of data items for Terms and Conditions. For a full list of available fields, definitions, and category assignments, use the &#x60;/fields&#x60; endpoint. | [optional] 
 **categories** | [**List&lt;string&gt;**](string.md)| Selects the Fixed Income metrics by major category. Use the &#x60;/fields&#x60; endpoint to get a list of all fields associated with each category.   * **SECURITY_DETAILS** &#x3D; Detailed information about the security.   * **COUPON_DETAILS** &#x3D; Coupon details.   * **CONVERTIBLE_FEATURES** &#x3D; Features of convertible instruments.   * **REDEMPTION_OPTIONS** &#x3D; Redemption options.  | [optional] 

### Return type

[**TermsAndConditionsResponse**](TermsAndConditionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Terms And Conditions Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="gettermsandconditionsfields"></a>
# **GetTermsAndConditionsFields**
> FieldsResponse GetTermsAndConditionsFields (string category = null)

Available fields for /terms-and-conditions endpoint

Returns a list of available fields that can be used in the `fields` parameter of the **_/terms-and-conditions** endpoint. Leave _category_ blank to request all available items. Make Note, this does not represent all available fields within the Terms and Conditions API and all other endpoints. 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using FactSet.SDK.Utils.Authentication;
using Microsoft.IdentityModel.Tokens;
using FactSet.SDK.FactSetTermsandConditions.Api;
using FactSet.SDK.FactSetTermsandConditions.Client;
using FactSet.SDK.FactSetTermsandConditions.Model;

namespace Example
{
    public class GetTermsAndConditionsFieldsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.factset.com/content";
            // Configure HTTP basic authorization: FactSetApiKey
            config.Username = "YOUR_USERNAME";
            config.Password = "YOUR_PASSWORD";
            // Configure OAuth2 access token for authorization: FactSetOAuth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            // Configure FactSet Authentication Client to automatically retrieve token for: FactSetOAuth2

            // using path to configuration:
            String pathToConfig = "";   // String contining absolute path to your configuration
            config.OAuth2Client = new ConfidentialClient(pathToConfig);

            // OR

            // If your configuration information is not within a file, you will provide the following information to create a new configuration.
            //   `name` - "Application Name registered with the FactSet Developer Portal",
            //   `clientId` - "Client ID registered with the FactSet Developer Portal",
            //   `clientAuthType` - For confidential client this will be "Confidential",
            //   `owners` - new List<string>() { "Owner ID(s) of this configuration" },
            //   `jwk` - new JsonWebKey(@"{
            //                     'kty': 'RSA',
            //                     'use': 'sig',
            //                     'alg': 'RS256',
            //                     'kid': 'Key ID',
            //                     'd': 'ECC Private Key',
            //                     'n': 'Modulus',
            //                     'e': 'Exponent',
            //                     'p': 'First Prime Factor',
            //                     'q': 'Second Prime Factor',
            //                     'dp': 'First Factor CRT Exponent',
            //                     'dq': 'Second Factor CRT Exponent',
            //                      'qi': 'First CRT Coefficient',
            //           }");

            // `NB`: Within the JWK parameters kty, alg, use, kid, n, e, d, p, q, dp, dq, qi are required for authorization.
            
            var config = new FactSet.SDK.Utils.Authentication.Configuration(name, clientId, clientAuthType, owners, jwk);
            config.OAuth2Client = new ConfidentialClient(config);

            var apiInstance = new TermsConditionsApi(config);
            var category = category_example;  // string | Filters the list of Fixed Income metrics by major category -   * **SECURITY_DETAILS** = Detailed information about the security.   * **COUPON_DETAILS** = Coupon details.   * **CONVERTIBLE_FEATURES** = Features of convertible instruments.   * **REDEMPTION_OPTIONS** = Redemption options.  (optional) 

            try
            {
                // Available fields for /terms-and-conditions endpoint
                FieldsResponse result = apiInstance.GetTermsAndConditionsFields(category);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling TermsConditionsApi.GetTermsAndConditionsFields: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **string**| Filters the list of Fixed Income metrics by major category -   * **SECURITY_DETAILS** &#x3D; Detailed information about the security.   * **COUPON_DETAILS** &#x3D; Coupon details.   * **CONVERTIBLE_FEATURES** &#x3D; Features of convertible instruments.   * **REDEMPTION_OPTIONS** &#x3D; Redemption options.  | [optional] 

### Return type

[**FieldsResponse**](FieldsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Terms And Conditions Fields Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="gettermsandconditionsforlist"></a>
# **GetTermsAndConditionsForList**
> TermsAndConditionsResponse GetTermsAndConditionsForList (TermsAndConditionsRequest termsAndConditionsRequest)

Return Terms and Conditions for a list of Fixed Income securities.

Returns Terms and Conditions data items for the Fixed Income security. Includes reference items for Conditional Redemptions, Redemption Options, Security Details, Convertible Features, and Coupon Details. Use the `fields` parameter to request specific items only or request an entire category of items to fetch all available fields matching that category(s). <p>*For T&C data related to Agency, Coupon History, Issue Size, Negative Covenants, or Redemption Prices, Lead Underwriters, and Use of Proceeds, please use respective endpoints optimized for that content.*</p> 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using FactSet.SDK.Utils.Authentication;
using Microsoft.IdentityModel.Tokens;
using FactSet.SDK.FactSetTermsandConditions.Api;
using FactSet.SDK.FactSetTermsandConditions.Client;
using FactSet.SDK.FactSetTermsandConditions.Model;

namespace Example
{
    public class GetTermsAndConditionsForListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.factset.com/content";
            // Configure HTTP basic authorization: FactSetApiKey
            config.Username = "YOUR_USERNAME";
            config.Password = "YOUR_PASSWORD";
            // Configure OAuth2 access token for authorization: FactSetOAuth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            // Configure FactSet Authentication Client to automatically retrieve token for: FactSetOAuth2

            // using path to configuration:
            String pathToConfig = "";   // String contining absolute path to your configuration
            config.OAuth2Client = new ConfidentialClient(pathToConfig);

            // OR

            // If your configuration information is not within a file, you will provide the following information to create a new configuration.
            //   `name` - "Application Name registered with the FactSet Developer Portal",
            //   `clientId` - "Client ID registered with the FactSet Developer Portal",
            //   `clientAuthType` - For confidential client this will be "Confidential",
            //   `owners` - new List<string>() { "Owner ID(s) of this configuration" },
            //   `jwk` - new JsonWebKey(@"{
            //                     'kty': 'RSA',
            //                     'use': 'sig',
            //                     'alg': 'RS256',
            //                     'kid': 'Key ID',
            //                     'd': 'ECC Private Key',
            //                     'n': 'Modulus',
            //                     'e': 'Exponent',
            //                     'p': 'First Prime Factor',
            //                     'q': 'Second Prime Factor',
            //                     'dp': 'First Factor CRT Exponent',
            //                     'dq': 'Second Factor CRT Exponent',
            //                      'qi': 'First CRT Coefficient',
            //           }");

            // `NB`: Within the JWK parameters kty, alg, use, kid, n, e, d, p, q, dp, dq, qi are required for authorization.
            
            var config = new FactSet.SDK.Utils.Authentication.Configuration(name, clientId, clientAuthType, owners, jwk);
            config.OAuth2Client = new ConfidentialClient(config);

            var apiInstance = new TermsConditionsApi(config);
            var termsAndConditionsRequest = new TermsAndConditionsRequest(); // TermsAndConditionsRequest | Request object for Terms And Conditions

            try
            {
                // Return Terms and Conditions for a list of Fixed Income securities.
                TermsAndConditionsResponse result = apiInstance.GetTermsAndConditionsForList(termsAndConditionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling TermsConditionsApi.GetTermsAndConditionsForList: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **termsAndConditionsRequest** | [**TermsAndConditionsRequest**](TermsAndConditionsRequest.md)| Request object for Terms And Conditions | 

### Return type

[**TermsAndConditionsResponse**](TermsAndConditionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Terms and Conditions Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

