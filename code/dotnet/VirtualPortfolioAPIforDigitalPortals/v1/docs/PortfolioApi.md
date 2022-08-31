# FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Api.PortfolioApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetPortfolioGet**](PortfolioApi.md#getportfolioget) | **GET** /portfolio/get | Details of a portfolio.
[**GetPortfolioList**](PortfolioApi.md#getportfoliolist) | **GET** /portfolio/list | List of portfolios with keyfigures.
[**GetPortfolioNameList**](PortfolioApi.md#getportfolionamelist) | **GET** /portfolio/name/list | List of portfolios.
[**GetPortfolioPositionList**](PortfolioApi.md#getportfoliopositionlist) | **GET** /portfolio/position/list | List all open positions of a portfolio.
[**GetPortfolioTransactionList**](PortfolioApi.md#getportfoliotransactionlist) | **GET** /portfolio/transaction/list | List of transactions in a portfolio.
[**PostPortfolioCreate**](PortfolioApi.md#postportfoliocreate) | **POST** /portfolio/create | Create a portfolio.
[**PostPortfolioDelete**](PortfolioApi.md#postportfoliodelete) | **POST** /portfolio/delete | Delete a portfolio.
[**PostPortfolioEvaluationList**](PortfolioApi.md#postportfolioevaluationlist) | **POST** /portfolio/evaluation/list | Evaluate a portfolio.
[**PostPortfolioModify**](PortfolioApi.md#postportfoliomodify) | **POST** /portfolio/modify | Modify a portfolio.
[**PostPortfolioPayoutCreate**](PortfolioApi.md#postportfoliopayoutcreate) | **POST** /portfolio/payout/create | Add a payout to a portfolio.
[**PostPortfolioPayoutDelete**](PortfolioApi.md#postportfoliopayoutdelete) | **POST** /portfolio/payout/delete | Delete a payout of a portfolio.
[**PostPortfolioPayoutList**](PortfolioApi.md#postportfoliopayoutlist) | **POST** /portfolio/payout/list | List of payouts in a portfolio.
[**PostPortfolioPayoutModify**](PortfolioApi.md#postportfoliopayoutmodify) | **POST** /portfolio/payout/modify | Modify a payout in a portfolio.
[**PostPortfolioPositionClosedList**](PortfolioApi.md#postportfoliopositionclosedlist) | **POST** /portfolio/position/closed/list | List all closed positions of a portfolio.
[**PostPortfolioTransactionCashCreate**](PortfolioApi.md#postportfoliotransactioncashcreate) | **POST** /portfolio/transaction/cash/create | Add a cash transaction to a portfolio.
[**PostPortfolioTransactionCashDelete**](PortfolioApi.md#postportfoliotransactioncashdelete) | **POST** /portfolio/transaction/cash/delete | Delete a cash transaction.
[**PostPortfolioTransactionCreate**](PortfolioApi.md#postportfoliotransactioncreate) | **POST** /portfolio/transaction/create | Add a transaction to a portfolio.
[**PostPortfolioTransactionDelete**](PortfolioApi.md#postportfoliotransactiondelete) | **POST** /portfolio/transaction/delete | Delete a transaction of a portfolio.
[**PostPortfolioTransactionModify**](PortfolioApi.md#postportfoliotransactionmodify) | **POST** /portfolio/transaction/modify | Modify a transaction in a portfolio.


<a name="getportfolioget"></a>
# **GetPortfolioGet**
> InlineResponse2001 GetPortfolioGet (string id, List<string> attributes = null)

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
    public class GetPortfolioGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var id = "id_example";  // string | 
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Details of a portfolio.
                InlineResponse2001 result = apiInstance.GetPortfolioGet(id, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.GetPortfolioGet: " + e.Message );
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
 **id** | **string**|  | 
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

<a name="getportfoliolist"></a>
# **GetPortfolioList**
> InlineResponse2002 GetPortfolioList (List<string> attributes = null, List<string> sort = null)

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
    public class GetPortfolioListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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
                InlineResponse2002 result = apiInstance.GetPortfolioList(attributes, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.GetPortfolioList: " + e.Message );
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

<a name="getportfolionamelist"></a>
# **GetPortfolioNameList**
> InlineResponse2005 GetPortfolioNameList (List<string> attributes = null, List<string> sort = null)

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
    public class GetPortfolioNameListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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
                InlineResponse2005 result = apiInstance.GetPortfolioNameList(attributes, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.GetPortfolioNameList: " + e.Message );
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

<a name="getportfoliopositionlist"></a>
# **GetPortfolioPositionList**
> InlineResponse2009 GetPortfolioPositionList (string id, List<string> attributes = null, string language = null, List<string> sort = null, decimal? paginationOffset = null, decimal? paginationLimit = null)

List all open positions of a portfolio.

List all open positions of a portfolio.

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
    public class GetPortfolioPositionListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var id = "id_example";  // string | 
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string |  (optional) 
            var sort = new List<string>(); // List<string> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed. (optional) 
            var paginationOffset = 0MD;  // decimal? | Non-negative number of entries to skip, or 0 (default). (optional)  (default to 0M)
            var paginationLimit = 20MD;  // decimal? | Non-negative maximum number of entries to return. (optional)  (default to 20M)

            try
            {
                // List all open positions of a portfolio.
                InlineResponse2009 result = apiInstance.GetPortfolioPositionList(id, attributes, language, sort, paginationOffset, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.GetPortfolioPositionList: " + e.Message );
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
 **id** | **string**|  | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**|  | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed. | [optional] 
 **paginationOffset** | **decimal?**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0M]
 **paginationLimit** | **decimal?**| Non-negative maximum number of entries to return. | [optional] [default to 20M]

### Return type
[**InlineResponse2009**](InlineResponse2009.md)

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

<a name="getportfoliotransactionlist"></a>
# **GetPortfolioTransactionList**
> InlineResponse20011 GetPortfolioTransactionList (string id, List<string> attributes = null, string language = null, List<string> sort = null, decimal? paginationOffset = null, decimal? paginationLimit = null)

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
    public class GetPortfolioTransactionListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var id = "id_example";  // string | 
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string |  (optional) 
            var sort = new List<string>(); // List<string> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 7 (possibly prefixed) attribute name(s) is allowed. (optional) 
            var paginationOffset = 0MD;  // decimal? | Non-negative number of entries to skip, or 0 (default). (optional)  (default to 0M)
            var paginationLimit = 20MD;  // decimal? | Non-negative maximum number of entries to return. (optional)  (default to 20M)

            try
            {
                // List of transactions in a portfolio.
                InlineResponse20011 result = apiInstance.GetPortfolioTransactionList(id, attributes, language, sort, paginationOffset, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.GetPortfolioTransactionList: " + e.Message );
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
 **id** | **string**|  | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**|  | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 7 (possibly prefixed) attribute name(s) is allowed. | [optional] 
 **paginationOffset** | **decimal?**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0M]
 **paginationLimit** | **decimal?**| Non-negative maximum number of entries to return. | [optional] [default to 20M]

### Return type
[**InlineResponse20011**](InlineResponse20011.md)

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

<a name="postportfoliocreate"></a>
# **PostPortfolioCreate**
> InlineResponse201 PostPortfolioCreate (InlineObject inlineObject)

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
    public class PostPortfolioCreateExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject = new InlineObject(); // InlineObject | 

            try
            {
                // Create a portfolio.
                InlineResponse201 result = apiInstance.PostPortfolioCreate(inlineObject);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PostPortfolioCreate: " + e.Message );
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
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | 

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

<a name="postportfoliodelete"></a>
# **PostPortfolioDelete**
> InlineResponse200 PostPortfolioDelete (InlineObject1 inlineObject1 = null)

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
    public class PostPortfolioDeleteExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject1 = new InlineObject1(); // InlineObject1 |  (optional) 

            try
            {
                // Delete a portfolio.
                InlineResponse200 result = apiInstance.PostPortfolioDelete(inlineObject1);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PostPortfolioDelete: " + e.Message );
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
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  | [optional] 

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

<a name="postportfolioevaluationlist"></a>
# **PostPortfolioEvaluationList**
> InlineResponse2004 PostPortfolioEvaluationList (InlineObject3 inlineObject3 = null)

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
    public class PostPortfolioEvaluationListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject3 = new InlineObject3(); // InlineObject3 |  (optional) 

            try
            {
                // Evaluate a portfolio.
                InlineResponse2004 result = apiInstance.PostPortfolioEvaluationList(inlineObject3);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PostPortfolioEvaluationList: " + e.Message );
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
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  | [optional] 

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

<a name="postportfoliomodify"></a>
# **PostPortfolioModify**
> InlineResponse2003 PostPortfolioModify (InlineObject2 inlineObject2 = null)

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
    public class PostPortfolioModifyExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject2 = new InlineObject2(); // InlineObject2 |  (optional) 

            try
            {
                // Modify a portfolio.
                InlineResponse2003 result = apiInstance.PostPortfolioModify(inlineObject2);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PostPortfolioModify: " + e.Message );
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
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  | [optional] 

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

<a name="postportfoliopayoutcreate"></a>
# **PostPortfolioPayoutCreate**
> InlineResponse2011 PostPortfolioPayoutCreate (InlineObject4 inlineObject4 = null)

Add a payout to a portfolio.

Add a payout to a portfolio.

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
    public class PostPortfolioPayoutCreateExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject4 = new InlineObject4(); // InlineObject4 |  (optional) 

            try
            {
                // Add a payout to a portfolio.
                InlineResponse2011 result = apiInstance.PostPortfolioPayoutCreate(inlineObject4);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PostPortfolioPayoutCreate: " + e.Message );
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
 **inlineObject4** | [**InlineObject4**](InlineObject4.md)|  | [optional] 

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

<a name="postportfoliopayoutdelete"></a>
# **PostPortfolioPayoutDelete**
> InlineResponse2006 PostPortfolioPayoutDelete (InlineObject5 inlineObject5 = null)

Delete a payout of a portfolio.

Delete a payout of a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |- -- -- --|- -- -- -- -| |Invalid payout identifier.|400 Bad Request|

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
    public class PostPortfolioPayoutDeleteExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject5 = new InlineObject5(); // InlineObject5 |  (optional) 

            try
            {
                // Delete a payout of a portfolio.
                InlineResponse2006 result = apiInstance.PostPortfolioPayoutDelete(inlineObject5);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PostPortfolioPayoutDelete: " + e.Message );
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
 **inlineObject5** | [**InlineObject5**](InlineObject5.md)|  | [optional] 

### Return type
[**InlineResponse2006**](InlineResponse2006.md)

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

<a name="postportfoliopayoutlist"></a>
# **PostPortfolioPayoutList**
> InlineResponse2007 PostPortfolioPayoutList (InlineObject6 inlineObject6)

List of payouts in a portfolio.

List of payouts in a portfolio.

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
    public class PostPortfolioPayoutListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject6 = new InlineObject6(); // InlineObject6 | 

            try
            {
                // List of payouts in a portfolio.
                InlineResponse2007 result = apiInstance.PostPortfolioPayoutList(inlineObject6);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PostPortfolioPayoutList: " + e.Message );
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
 **inlineObject6** | [**InlineObject6**](InlineObject6.md)|  | 

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

<a name="postportfoliopayoutmodify"></a>
# **PostPortfolioPayoutModify**
> InlineResponse2008 PostPortfolioPayoutModify (InlineObject7 inlineObject7 = null)

Modify a payout in a portfolio.

Modify a payout in a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |- -- -- --|- -- -- -- -| |At least one of the parameters `notation`, `type`, `amount`, `transaction` or `time` must be set.|400 Bad Request| |Invalid payout identifier.|400 Bad Request|

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
    public class PostPortfolioPayoutModifyExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject7 = new InlineObject7(); // InlineObject7 |  (optional) 

            try
            {
                // Modify a payout in a portfolio.
                InlineResponse2008 result = apiInstance.PostPortfolioPayoutModify(inlineObject7);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PostPortfolioPayoutModify: " + e.Message );
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
 **inlineObject7** | [**InlineObject7**](InlineObject7.md)|  | [optional] 

### Return type
[**InlineResponse2008**](InlineResponse2008.md)

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

<a name="postportfoliopositionclosedlist"></a>
# **PostPortfolioPositionClosedList**
> InlineResponse20010 PostPortfolioPositionClosedList (InlineObject8 inlineObject8 = null)

List all closed positions of a portfolio.

List all closed positions of a portfolio.

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
    public class PostPortfolioPositionClosedListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject8 = new InlineObject8(); // InlineObject8 |  (optional) 

            try
            {
                // List all closed positions of a portfolio.
                InlineResponse20010 result = apiInstance.PostPortfolioPositionClosedList(inlineObject8);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PostPortfolioPositionClosedList: " + e.Message );
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
 **inlineObject8** | [**InlineObject8**](InlineObject8.md)|  | [optional] 

### Return type
[**InlineResponse20010**](InlineResponse20010.md)

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

<a name="postportfoliotransactioncashcreate"></a>
# **PostPortfolioTransactionCashCreate**
> InlineResponse2012 PostPortfolioTransactionCashCreate (InlineObject12 inlineObject12 = null)

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
    public class PostPortfolioTransactionCashCreateExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject12 = new InlineObject12(); // InlineObject12 |  (optional) 

            try
            {
                // Add a cash transaction to a portfolio.
                InlineResponse2012 result = apiInstance.PostPortfolioTransactionCashCreate(inlineObject12);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PostPortfolioTransactionCashCreate: " + e.Message );
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
 **inlineObject12** | [**InlineObject12**](InlineObject12.md)|  | [optional] 

### Return type
[**InlineResponse2012**](InlineResponse2012.md)

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

<a name="postportfoliotransactioncashdelete"></a>
# **PostPortfolioTransactionCashDelete**
> InlineResponse2006 PostPortfolioTransactionCashDelete (InlineObject13 inlineObject13 = null)

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
    public class PostPortfolioTransactionCashDeleteExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject13 = new InlineObject13(); // InlineObject13 |  (optional) 

            try
            {
                // Delete a cash transaction.
                InlineResponse2006 result = apiInstance.PostPortfolioTransactionCashDelete(inlineObject13);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PostPortfolioTransactionCashDelete: " + e.Message );
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
 **inlineObject13** | [**InlineObject13**](InlineObject13.md)|  | [optional] 

### Return type
[**InlineResponse2006**](InlineResponse2006.md)

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

<a name="postportfoliotransactioncreate"></a>
# **PostPortfolioTransactionCreate**
> InlineResponse2012 PostPortfolioTransactionCreate (InlineObject9 inlineObject9 = null)

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
    public class PostPortfolioTransactionCreateExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject9 = new InlineObject9(); // InlineObject9 |  (optional) 

            try
            {
                // Add a transaction to a portfolio.
                InlineResponse2012 result = apiInstance.PostPortfolioTransactionCreate(inlineObject9);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PostPortfolioTransactionCreate: " + e.Message );
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
 **inlineObject9** | [**InlineObject9**](InlineObject9.md)|  | [optional] 

### Return type
[**InlineResponse2012**](InlineResponse2012.md)

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

<a name="postportfoliotransactiondelete"></a>
# **PostPortfolioTransactionDelete**
> InlineResponse2006 PostPortfolioTransactionDelete (InlineObject10 inlineObject10 = null)

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
    public class PostPortfolioTransactionDeleteExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject10 = new InlineObject10(); // InlineObject10 |  (optional) 

            try
            {
                // Delete a transaction of a portfolio.
                InlineResponse2006 result = apiInstance.PostPortfolioTransactionDelete(inlineObject10);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PostPortfolioTransactionDelete: " + e.Message );
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
 **inlineObject10** | [**InlineObject10**](InlineObject10.md)|  | [optional] 

### Return type
[**InlineResponse2006**](InlineResponse2006.md)

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

<a name="postportfoliotransactionmodify"></a>
# **PostPortfolioTransactionModify**
> InlineResponse2008 PostPortfolioTransactionModify (InlineObject11 inlineObject11 = null)

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
    public class PostPortfolioTransactionModifyExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.Configuration();

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

            var inlineObject11 = new InlineObject11(); // InlineObject11 |  (optional) 

            try
            {
                // Modify a transaction in a portfolio.
                InlineResponse2008 result = apiInstance.PostPortfolioTransactionModify(inlineObject11);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PortfolioApi.PostPortfolioTransactionModify: " + e.Message );
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
 **inlineObject11** | [**InlineObject11**](InlineObject11.md)|  | [optional] 

### Return type
[**InlineResponse2008**](InlineResponse2008.md)

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

