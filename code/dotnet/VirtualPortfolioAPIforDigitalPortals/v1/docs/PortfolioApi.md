# FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api.PortfolioApi

All URIs are relative to *http://api-sandbox.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PortfolioCreatePost**](PortfolioApi.md#portfoliocreatepost) | **POST** /portfolio/create | Create a portfolio.
[**PortfolioDeletePost**](PortfolioApi.md#portfoliodeletepost) | **POST** /portfolio/delete | Delete a portfolio.
[**PortfolioEvaluationListPost**](PortfolioApi.md#portfolioevaluationlistpost) | **POST** /portfolio/evaluation/list | Evaluate a portfolio.
[**PortfolioGetGet**](PortfolioApi.md#portfoliogetget) | **GET** /portfolio/get | Details of a portfolio.
[**PortfolioListGet**](PortfolioApi.md#portfoliolistget) | **GET** /portfolio/list | List of portfolios with keyfigures.
[**PortfolioModifyPost**](PortfolioApi.md#portfoliomodifypost) | **POST** /portfolio/modify | Modify a portfolio.
[**PortfolioNameListGet**](PortfolioApi.md#portfolionamelistget) | **GET** /portfolio/name/list | List of portfolios.
[**PortfolioPositionListGet**](PortfolioApi.md#portfoliopositionlistget) | **GET** /portfolio/position/list | List all positions of a portfolio.
[**PortfolioTransactionCashCreatePost**](PortfolioApi.md#portfoliotransactioncashcreatepost) | **POST** /portfolio/transaction/cash/create | Add a cash transaction to a portfolio.
[**PortfolioTransactionCashDeletePost**](PortfolioApi.md#portfoliotransactioncashdeletepost) | **POST** /portfolio/transaction/cash/delete | Delete a cash transaction.
[**PortfolioTransactionCreatePost**](PortfolioApi.md#portfoliotransactioncreatepost) | **POST** /portfolio/transaction/create | Add a transaction to a portfolio.
[**PortfolioTransactionDeletePost**](PortfolioApi.md#portfoliotransactiondeletepost) | **POST** /portfolio/transaction/delete | Delete a transaction of a portfolio.
[**PortfolioTransactionListGet**](PortfolioApi.md#portfoliotransactionlistget) | **GET** /portfolio/transaction/list | List of transactions in a portfolio.
[**PortfolioTransactionModifyPost**](PortfolioApi.md#portfoliotransactionmodifypost) | **POST** /portfolio/transaction/modify | Modify a transaction in a portfolio.


<a name="portfoliocreatepost"></a>
# **PortfolioCreatePost**
> InlineResponse201 PortfolioCreatePost (InlineObject body)

Create a portfolio.

Create a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |- -- -- --|- -- -- -- -| |The number of portfolios would exceed 100.|400 Bad Request|

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class PortfolioCreatePostExample
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

            var apiInstance = new PortfolioApi(config);
            var body = new InlineObject(); // InlineObject | 

            try
            {
                // Create a portfolio.
                InlineResponse201 result = apiInstance.PortfolioCreatePost(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PortfolioCreatePost: " + e.Message );
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
 **body** | [**InlineObject**](InlineObject.md)|  | 

### Return type
[**InlineResponse201**](InlineResponse201.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="portfoliodeletepost"></a>
# **PortfolioDeletePost**
> InlineResponse200 PortfolioDeletePost (InlineObject1 body = null)

Delete a portfolio.

Delete a portfolio.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class PortfolioDeletePostExample
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

            var apiInstance = new PortfolioApi(config);
            var body = new InlineObject1(); // InlineObject1 |  (optional) 

            try
            {
                // Delete a portfolio.
                InlineResponse200 result = apiInstance.PortfolioDeletePost(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PortfolioDeletePost: " + e.Message );
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
[**InlineResponse200**](InlineResponse200.md)

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

<a name="portfolioevaluationlistpost"></a>
# **PortfolioEvaluationListPost**
> InlineResponse2004 PortfolioEvaluationListPost (InlineObject3 body = null)

Evaluate a portfolio.

Performs an evaluation over a period of time and returns portfolio key figures for each day, week, or month.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class PortfolioEvaluationListPostExample
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

            var apiInstance = new PortfolioApi(config);
            var body = new InlineObject3(); // InlineObject3 |  (optional) 

            try
            {
                // Evaluate a portfolio.
                InlineResponse2004 result = apiInstance.PortfolioEvaluationListPost(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PortfolioEvaluationListPost: " + e.Message );
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
 **body** | [**InlineObject3**](InlineObject3.md)|  | [optional] 

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

<a name="portfoliogetget"></a>
# **PortfolioGetGet**
> InlineResponse2001 PortfolioGetGet (string id, List<string> attributes = null)

Details of a portfolio.

Details of a portfolio.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class PortfolioGetGetExample
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

            var apiInstance = new PortfolioApi(config);
            var id = "id_example";  // string | Identifier of the portfolio.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Details of a portfolio.
                InlineResponse2001 result = apiInstance.PortfolioGetGet(id, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PortfolioGetGet: " + e.Message );
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
 **id** | **string**| Identifier of the portfolio. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse2001**](InlineResponse2001.md)

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

<a name="portfoliolistget"></a>
# **PortfolioListGet**
> InlineResponse2002 PortfolioListGet (List<string> attributes = null, List<string> sort = null)

List of portfolios with keyfigures.

List of portfolios with keyfigures.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class PortfolioListGetExample
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

            var apiInstance = new PortfolioApi(config);
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var sort = new List<string>(); // List<string> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional) 

            try
            {
                // List of portfolios with keyfigures.
                InlineResponse2002 result = apiInstance.PortfolioListGet(attributes, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PortfolioListGet: " + e.Message );
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
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] 

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

<a name="portfoliomodifypost"></a>
# **PortfolioModifyPost**
> InlineResponse2003 PortfolioModifyPost (InlineObject2 body = null)

Modify a portfolio.

Modify a portfolio.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class PortfolioModifyPostExample
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

            var apiInstance = new PortfolioApi(config);
            var body = new InlineObject2(); // InlineObject2 |  (optional) 

            try
            {
                // Modify a portfolio.
                InlineResponse2003 result = apiInstance.PortfolioModifyPost(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PortfolioModifyPost: " + e.Message );
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

<a name="portfolionamelistget"></a>
# **PortfolioNameListGet**
> InlineResponse2005 PortfolioNameListGet (List<string> attributes = null, List<string> sort = null)

List of portfolios.

List of portfolios.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class PortfolioNameListGetExample
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

            var apiInstance = new PortfolioApi(config);
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var sort = new List<string>(); // List<string> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional) 

            try
            {
                // List of portfolios.
                InlineResponse2005 result = apiInstance.PortfolioNameListGet(attributes, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PortfolioNameListGet: " + e.Message );
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
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] 

### Return type
[**InlineResponse2005**](InlineResponse2005.md)

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

<a name="portfoliopositionlistget"></a>
# **PortfolioPositionListGet**
> InlineResponse2006 PortfolioPositionListGet (string id, List<string> attributes = null)

List all positions of a portfolio.

List all positions of a portfolio.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class PortfolioPositionListGetExample
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

            var apiInstance = new PortfolioApi(config);
            var id = "id_example";  // string | Identifier of the portfolio.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // List all positions of a portfolio.
                InlineResponse2006 result = apiInstance.PortfolioPositionListGet(id, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PortfolioPositionListGet: " + e.Message );
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
 **id** | **string**| Identifier of the portfolio. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse2006**](InlineResponse2006.md)

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

<a name="portfoliotransactioncashcreatepost"></a>
# **PortfolioTransactionCashCreatePost**
> InlineResponse2011 PortfolioTransactionCashCreatePost (InlineObject7 body = null)

Add a cash transaction to a portfolio.

Add a cash transaction to a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |- -- -- --|- -- -- -- -| |The number of transactions would exceed 1000.|400 Bad Request|

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class PortfolioTransactionCashCreatePostExample
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

            var apiInstance = new PortfolioApi(config);
            var body = new InlineObject7(); // InlineObject7 |  (optional) 

            try
            {
                // Add a cash transaction to a portfolio.
                InlineResponse2011 result = apiInstance.PortfolioTransactionCashCreatePost(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PortfolioTransactionCashCreatePost: " + e.Message );
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
 **body** | [**InlineObject7**](InlineObject7.md)|  | [optional] 

### Return type
[**InlineResponse2011**](InlineResponse2011.md)

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

<a name="portfoliotransactioncashdeletepost"></a>
# **PortfolioTransactionCashDeletePost**
> InlineResponse2007 PortfolioTransactionCashDeletePost (InlineObject8 body = null)

Delete a cash transaction.

Delete a cash transaction.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class PortfolioTransactionCashDeletePostExample
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

            var apiInstance = new PortfolioApi(config);
            var body = new InlineObject8(); // InlineObject8 |  (optional) 

            try
            {
                // Delete a cash transaction.
                InlineResponse2007 result = apiInstance.PortfolioTransactionCashDeletePost(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PortfolioTransactionCashDeletePost: " + e.Message );
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
 **body** | [**InlineObject8**](InlineObject8.md)|  | [optional] 

### Return type
[**InlineResponse2007**](InlineResponse2007.md)

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

<a name="portfoliotransactioncreatepost"></a>
# **PortfolioTransactionCreatePost**
> InlineResponse2011 PortfolioTransactionCreatePost (InlineObject4 body = null)

Add a transaction to a portfolio.

Add a transaction to a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |- -- -- --|- -- -- -- -| |The number of transactions would exceed 1000.|400 Bad Request|

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class PortfolioTransactionCreatePostExample
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

            var apiInstance = new PortfolioApi(config);
            var body = new InlineObject4(); // InlineObject4 |  (optional) 

            try
            {
                // Add a transaction to a portfolio.
                InlineResponse2011 result = apiInstance.PortfolioTransactionCreatePost(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PortfolioTransactionCreatePost: " + e.Message );
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
 **body** | [**InlineObject4**](InlineObject4.md)|  | [optional] 

### Return type
[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="portfoliotransactiondeletepost"></a>
# **PortfolioTransactionDeletePost**
> InlineResponse2007 PortfolioTransactionDeletePost (InlineObject5 body = null)

Delete a transaction of a portfolio.

Delete a transaction of a portfolio.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class PortfolioTransactionDeletePostExample
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

            var apiInstance = new PortfolioApi(config);
            var body = new InlineObject5(); // InlineObject5 |  (optional) 

            try
            {
                // Delete a transaction of a portfolio.
                InlineResponse2007 result = apiInstance.PortfolioTransactionDeletePost(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PortfolioTransactionDeletePost: " + e.Message );
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
 **body** | [**InlineObject5**](InlineObject5.md)|  | [optional] 

### Return type
[**InlineResponse2007**](InlineResponse2007.md)

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

<a name="portfoliotransactionlistget"></a>
# **PortfolioTransactionListGet**
> InlineResponse2008 PortfolioTransactionListGet (string id, List<string> attributes = null)

List of transactions in a portfolio.

List of transactions in a portfolio.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class PortfolioTransactionListGetExample
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

            var apiInstance = new PortfolioApi(config);
            var id = "id_example";  // string | Identifier of the portfolio.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // List of transactions in a portfolio.
                InlineResponse2008 result = apiInstance.PortfolioTransactionListGet(id, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PortfolioTransactionListGet: " + e.Message );
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
 **id** | **string**| Identifier of the portfolio. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse2008**](InlineResponse2008.md)

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

<a name="portfoliotransactionmodifypost"></a>
# **PortfolioTransactionModifyPost**
> InlineResponse2009 PortfolioTransactionModifyPost (InlineObject6 body = null)

Modify a transaction in a portfolio.

Modify a transaction in a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |- -- -- --|- -- -- -- -| |At least one of the parameters `numberShares`, `price`, `charges`, `exchangeRate` or `time` must be set.|400 Bad Request|

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client;
using FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model;

namespace Example
{
    public class PortfolioTransactionModifyPostExample
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

            var apiInstance = new PortfolioApi(config);
            var body = new InlineObject6(); // InlineObject6 |  (optional) 

            try
            {
                // Modify a transaction in a portfolio.
                InlineResponse2009 result = apiInstance.PortfolioTransactionModifyPost(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PortfolioTransactionModifyPost: " + e.Message );
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
 **body** | [**InlineObject6**](InlineObject6.md)|  | [optional] 

### Return type
[**InlineResponse2009**](InlineResponse2009.md)

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

