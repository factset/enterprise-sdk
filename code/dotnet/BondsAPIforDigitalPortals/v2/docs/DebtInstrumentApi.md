# FactSet.SDK.BondsAPIforDigitalPortals.Api.DebtInstrumentApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDebtInstrumentGet**](DebtInstrumentApi.md#getdebtinstrumentget) | **GET** /debtInstrument/get | Fundamental data for a debt instrument.
[**GetDebtInstrumentKeyFiguresNotationGet**](DebtInstrumentApi.md#getdebtinstrumentkeyfiguresnotationget) | **GET** /debtInstrument/keyFigures/notation/get | Key figures of a debt instrument.
[**PostDebtInstrumentIssuerSearch**](DebtInstrumentApi.md#postdebtinstrumentissuersearch) | **POST** /debtInstrument/issuer/search | Search for issuers of debt instruments.
[**PostDebtInstrumentNotationScreenerSearch**](DebtInstrumentApi.md#postdebtinstrumentnotationscreenersearch) | **POST** /debtInstrument/notation/screener/search | Screener for debt instruments&#39; notations based on debt instrument-specific parameters.
[**PostDebtInstrumentNotationScreenerValueRangesGet**](DebtInstrumentApi.md#postdebtinstrumentnotationscreenervaluerangesget) | **POST** /debtInstrument/notation/screener/valueRanges/get | Possible values and value ranges for the parameters used in the endpoint &#x60;/debtInstrument/notation/screener/search.&#x60;


<a name="getdebtinstrumentget"></a>
# **GetDebtInstrumentGet**
> InlineResponse200 GetDebtInstrumentGet (string id, List<string> attributes = null, string language = null)

Fundamental data for a debt instrument.

Fundamental data for a debt instrument; any other instrument yields empty values for debt-instrument-specific attributes. Dates are interpreted in the timezone of the issuer.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.BondsAPIforDigitalPortals.Api;
using FactSet.SDK.BondsAPIforDigitalPortals.Client;
using FactSet.SDK.BondsAPIforDigitalPortals.Model;

namespace Example
{
    public class GetDebtInstrumentGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new DebtInstrumentApi(config);
            var id = id_example;  // string | Identifier of the instrument.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = language_example;  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // Fundamental data for a debt instrument.
                InlineResponse200 result = apiInstance.GetDebtInstrumentGet(id, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DebtInstrumentApi.GetDebtInstrumentGet: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| Identifier of the instrument. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdebtinstrumentkeyfiguresnotationget"></a>
# **GetDebtInstrumentKeyFiguresNotationGet**
> InlineResponse2002 GetDebtInstrumentKeyFiguresNotationGet (string id, List<string> attributes = null)

Key figures of a debt instrument.

Key figures of a debt instrument. The key figures are calculated using delayed prices with an additional delay of 10 minutes after an  update of the debt instrument's price. Special product features such as the right to a maturity extension, an attached option, or convertibility are not considered for the key figure calculation. Further, a calculation is not performed for perpetual products and for products with variable interest rate.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.BondsAPIforDigitalPortals.Api;
using FactSet.SDK.BondsAPIforDigitalPortals.Client;
using FactSet.SDK.BondsAPIforDigitalPortals.Model;

namespace Example
{
    public class GetDebtInstrumentKeyFiguresNotationGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new DebtInstrumentApi(config);
            var id = id_example;  // string | Identifier of a notation.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Key figures of a debt instrument.
                InlineResponse2002 result = apiInstance.GetDebtInstrumentKeyFiguresNotationGet(id, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DebtInstrumentApi.GetDebtInstrumentKeyFiguresNotationGet: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| Identifier of a notation. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postdebtinstrumentissuersearch"></a>
# **PostDebtInstrumentIssuerSearch**
> InlineResponse2001 PostDebtInstrumentIssuerSearch (InlineObject body = null)

Search for issuers of debt instruments.

Search for issuers of debt instruments. FactSet does not consolidate the data provided by different suppliers, therefore the result may contain more than one identifier for a given issuer. The response is limited to 100 results.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.BondsAPIforDigitalPortals.Api;
using FactSet.SDK.BondsAPIforDigitalPortals.Client;
using FactSet.SDK.BondsAPIforDigitalPortals.Model;

namespace Example
{
    public class PostDebtInstrumentIssuerSearchExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new DebtInstrumentApi(config);
            var body = new InlineObject(); // InlineObject |  (optional) 

            try
            {
                // Search for issuers of debt instruments.
                InlineResponse2001 result = apiInstance.PostDebtInstrumentIssuerSearch(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DebtInstrumentApi.PostDebtInstrumentIssuerSearch: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject**](InlineObject.md)|  | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postdebtinstrumentnotationscreenersearch"></a>
# **PostDebtInstrumentNotationScreenerSearch**
> InlineResponse2003 PostDebtInstrumentNotationScreenerSearch (InlineObject1 body = null)

Screener for debt instruments' notations based on debt instrument-specific parameters.

Screener for debt instruments' notations based on debt instrument-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.BondsAPIforDigitalPortals.Api;
using FactSet.SDK.BondsAPIforDigitalPortals.Client;
using FactSet.SDK.BondsAPIforDigitalPortals.Model;

namespace Example
{
    public class PostDebtInstrumentNotationScreenerSearchExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new DebtInstrumentApi(config);
            var body = new InlineObject1(); // InlineObject1 |  (optional) 

            try
            {
                // Screener for debt instruments' notations based on debt instrument-specific parameters.
                InlineResponse2003 result = apiInstance.PostDebtInstrumentNotationScreenerSearch(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DebtInstrumentApi.PostDebtInstrumentNotationScreenerSearch: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject1**](InlineObject1.md)|  | [optional] 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postdebtinstrumentnotationscreenervaluerangesget"></a>
# **PostDebtInstrumentNotationScreenerValueRangesGet**
> InlineResponse2004 PostDebtInstrumentNotationScreenerValueRangesGet (InlineObject2 body = null)

Possible values and value ranges for the parameters used in the endpoint `/debtInstrument/notation/screener/search.`

The endpoint returns the possible values and value ranges for the parameters used in the endpoint `/debtInstrument/notation/screener/search`. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. The functionality may be used to pre-fill the values and value ranges of the parameters of the `/debtInstrument/notation/screener/search` endpoint so that performing a search always leads to a non-empty set of notations. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.BondsAPIforDigitalPortals.Api;
using FactSet.SDK.BondsAPIforDigitalPortals.Client;
using FactSet.SDK.BondsAPIforDigitalPortals.Model;

namespace Example
{
    public class PostDebtInstrumentNotationScreenerValueRangesGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new DebtInstrumentApi(config);
            var body = new InlineObject2(); // InlineObject2 |  (optional) 

            try
            {
                // Possible values and value ranges for the parameters used in the endpoint `/debtInstrument/notation/screener/search.`
                InlineResponse2004 result = apiInstance.PostDebtInstrumentNotationScreenerValueRangesGet(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DebtInstrumentApi.PostDebtInstrumentNotationScreenerValueRangesGet: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject2**](InlineObject2.md)|  | [optional] 

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

