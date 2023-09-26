# FactSet.SDK.OFDB.Api.GetApi

All URIs are relative to *https://api.factset.com/analytics/ofdb/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAudit**](GetApi.md#getaudit) | **GET** /database/{path}/audit | 
[**GetData**](GetApi.md#getdata) | **GET** /database/{path} | 
[**GetDates**](GetApi.md#getdates) | **GET** /database/{path}/dates | 
[**GetFields**](GetApi.md#getfields) | **GET** /database/{path}/fields | 
[**GetStats**](GetApi.md#getstats) | **GET** /database/{path}/stats | 
[**GetSymbols**](GetApi.md#getsymbols) | **GET** /database/{path}/symbols | 



<a name="getaudit"></a>
# **GetAudit**
> InlineResponse202 GetAudit (string path)



Returns a list of the most recent \"modificationTimes\" in long datetime format

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OFDB.Api;
using FactSet.SDK.OFDB.Client;
using FactSet.SDK.OFDB.Model;

namespace Example
{
    public class GetAuditExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OFDB.Client.Configuration();

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

            var apiInstance = new GetApi(config);

            var path = "path_example";  // string | Encode database path

            try
            {
                InlineResponse202 result = apiInstance.GetAudit(path);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling GetApi.GetAudit: " + e.Message );
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
 **path** | **string**| Encode database path | 

### Return type
[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Returns when the request is moved to long running mode. The next pickup URL is provided by the Location header. |  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **400** | Invalid query parameter or value provided |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **406** | Unsupported Accept header. Header needs to be set to application/json |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getdata"></a>
# **GetData**
> InlineResponse202 GetData (string path, string symbol = null, string date = null, string filterFields = null, string filterOps = null, string filterValues = null, string filterDatesOps = null, string filterDatesValues = null, string filterSymbolsOps = null, string filterSymbolsValues = null, string sortFieldName = null, string sortFieldOrder = null)



Returns the data in the database(OFDB, OMS_OFDB, ECONOFDB) for the mentioned Symbol or Date. Atleast one parameter(Symbol/Date) is required. For a range of dates symbol parameter is mandatory.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OFDB.Api;
using FactSet.SDK.OFDB.Client;
using FactSet.SDK.OFDB.Model;

namespace Example
{
    public class GetDataExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OFDB.Client.Configuration();

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

            var apiInstance = new GetApi(config);

            var path = "path_example";  // string | Encode database path
            var symbol = "symbol_example";  // string | Returns data for the symbol mentioned. e.g:sym1 (optional) 
            var date = "date_example";  // string | Return data for the specific date or range of dates mentioned.e.g:[date1,date2] (optional) 
            var filterFields = "filterFields_example";  // string | Can specify the fields on which you want to perform field filter operations e.g: [\"PRICE\",\"SECTOR\"]  Note:  The request will respond with 400 1. If fields which are not present on OFDB are given. 2. If filterOps or filterValues query parameters are missing    when filterFields is present. 3. If number of values given for filterOps,      filterFields, filterValues are different 4. If exactly one of symbol or date query parameter is not provided.  (optional) 
            var filterOps = "filterOps_example";  // string | Can specify the field filter operations which you want to perform e.g: [\"LT\", \"GTEQ\", \"CT\"] in respective order of values in filterFields query parameter.  The available field filter operations are :  For CHAR type fields:  \"CT\" : contains  \"SW\" : starts-with  \"EW\" : ends-with   \"EQ\" : equals  For NUMERIC type fields:  \"GT\" : greater than  \"GTEQ\" : greater than or equals  \"LT\" : lesser than  \"LTEQ\" : lesser than or equals  \"EQ\" : equals  Note:  The request will respond with 400  1. If operations other than the above mentioned are provided. 2. If numeric operations are given to char type fields instead of char operations. 3. If char operations are given to numeric type fields instead of numeric operations. 4. If filterFields or filterValues query parameters are missing    when filterOps is present. 5. If number of values given for filterOps,      filterFields, filterValues are different 6. If exactly one of symbol or date query parameter is not provided.  (optional) 
            var filterValues = "filterValues_example";  // string | Can specify the field filter values of the field filter operations e.g: [100, 20, \"AB\"] in respective order of values in filterFields and filterOps query parameters .  Note:   The request will respond with 400 1. If char values are given to numeric type fields. 2. If filterFields or filterOps query parameters are missing    when filterValues is present. 3. If number of values given for filterOps,      filterFields, filterValues are different 4. If exactly one of symbol or date query parameter is not provided.  (optional) 
            var filterDatesOps = "filterDatesOps_example";  // string | Can specify the date filter operations which you want to perform e.g: [\"LT\", \"GTEQ\"].  The available date filter operations are :  \"GT\" : after  \"GTEQ\" : after or equals  \"LT\" : before  \"LTEQ\" : before or equals  \"EQ\" : equals\"  Note:  The request will respond with 400  1. If operations other than the above mentioned are given. 2. If filterDatesValues query parameter is missing when filterDatesOps is present. 3. If number of values given for filterDatesOps and filterDatesValues differ. 4. If symbol query parameter is not provided.  (optional) 
            var filterDatesValues = "filterDatesValues_example";  // string | Can specify the date filter values of the date filter operations e.g: [20200505, 20200303] in respective order of values in filterDatesOps query parameter.  Note:  The request will respond with 400 1. If invalid date values are given 2. If filterDatesOps query parameter is missing when filterDatesValues is present. 3. If number of values given for filterDatesOps and filterDatesValues differ. 4. If symbol query parameter is not provided.  (optional) 
            var filterSymbolsOps = "filterSymbolsOps_example";  // string | Can specify the symbol filter operations which you want to perform e.g: [\"CT\", \"SW\"].  The available symbol filter operations are:  \"SW\" : starts-with  \"EW\" : ends-with  \"CT\" : contains  \"EQ\" : equals  Note:  The request will respond with 400 1. If operations other than the above mentioned are given. 2. If filterSymbolsValues query parameter is missing when filterSymbolsOps is present. 3. If number of values given for filterSymbolsOps and filterSymbolsValues differ. 4. If date query parameter is not provided.  (optional) 
            var filterSymbolsValues = "filterSymbolsValues_example";  // string | Can specify the symbol filter values of the date filter operations e.g: [\"ab\", \"xy\"] in respective order of values in filterSymbolsOps query parameter.  Note: The request will respond with 400 1. If filterSymbolsOps query parameter is missing when filterSymbolsValues is present. 2. If number of values given for filterSymbolsOps and filterSymbolsValues differ. 3. If date query parameter is not provided.  (optional) 
            var sortFieldName = "sortFieldName_example";  // string | Can specify the name of field with respect to which user wants to sort data   Note: The request will respond with 400, If a field which doesn't exist in the OFDB is requested (optional) 
            var sortFieldOrder = "ASC";  // string | Can specify the order in which user wants to sort data with respect to sortFieldName query parameter   Note: The request will respond with 400, If value other than asc or desc is requested (optional) 

            try
            {
                InlineResponse202 result = apiInstance.GetData(path, symbol, date, filterFields, filterOps, filterValues, filterDatesOps, filterDatesValues, filterSymbolsOps, filterSymbolsValues, sortFieldName, sortFieldOrder);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling GetApi.GetData: " + e.Message );
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
 **path** | **string**| Encode database path | 
 **symbol** | **string**| Returns data for the symbol mentioned. e.g:sym1 | [optional] 
 **date** | **string**| Return data for the specific date or range of dates mentioned.e.g:[date1,date2] | [optional] 
 **filterFields** | **string**| Can specify the fields on which you want to perform field filter operations e.g: [\&quot;PRICE\&quot;,\&quot;SECTOR\&quot;]  Note:  The request will respond with 400 1. If fields which are not present on OFDB are given. 2. If filterOps or filterValues query parameters are missing    when filterFields is present. 3. If number of values given for filterOps,      filterFields, filterValues are different 4. If exactly one of symbol or date query parameter is not provided.  | [optional] 
 **filterOps** | **string**| Can specify the field filter operations which you want to perform e.g: [\&quot;LT\&quot;, \&quot;GTEQ\&quot;, \&quot;CT\&quot;] in respective order of values in filterFields query parameter.  The available field filter operations are :  For CHAR type fields:  \&quot;CT\&quot; : contains  \&quot;SW\&quot; : starts-with  \&quot;EW\&quot; : ends-with   \&quot;EQ\&quot; : equals  For NUMERIC type fields:  \&quot;GT\&quot; : greater than  \&quot;GTEQ\&quot; : greater than or equals  \&quot;LT\&quot; : lesser than  \&quot;LTEQ\&quot; : lesser than or equals  \&quot;EQ\&quot; : equals  Note:  The request will respond with 400  1. If operations other than the above mentioned are provided. 2. If numeric operations are given to char type fields instead of char operations. 3. If char operations are given to numeric type fields instead of numeric operations. 4. If filterFields or filterValues query parameters are missing    when filterOps is present. 5. If number of values given for filterOps,      filterFields, filterValues are different 6. If exactly one of symbol or date query parameter is not provided.  | [optional] 
 **filterValues** | **string**| Can specify the field filter values of the field filter operations e.g: [100, 20, \&quot;AB\&quot;] in respective order of values in filterFields and filterOps query parameters .  Note:   The request will respond with 400 1. If char values are given to numeric type fields. 2. If filterFields or filterOps query parameters are missing    when filterValues is present. 3. If number of values given for filterOps,      filterFields, filterValues are different 4. If exactly one of symbol or date query parameter is not provided.  | [optional] 
 **filterDatesOps** | **string**| Can specify the date filter operations which you want to perform e.g: [\&quot;LT\&quot;, \&quot;GTEQ\&quot;].  The available date filter operations are :  \&quot;GT\&quot; : after  \&quot;GTEQ\&quot; : after or equals  \&quot;LT\&quot; : before  \&quot;LTEQ\&quot; : before or equals  \&quot;EQ\&quot; : equals\&quot;  Note:  The request will respond with 400  1. If operations other than the above mentioned are given. 2. If filterDatesValues query parameter is missing when filterDatesOps is present. 3. If number of values given for filterDatesOps and filterDatesValues differ. 4. If symbol query parameter is not provided.  | [optional] 
 **filterDatesValues** | **string**| Can specify the date filter values of the date filter operations e.g: [20200505, 20200303] in respective order of values in filterDatesOps query parameter.  Note:  The request will respond with 400 1. If invalid date values are given 2. If filterDatesOps query parameter is missing when filterDatesValues is present. 3. If number of values given for filterDatesOps and filterDatesValues differ. 4. If symbol query parameter is not provided.  | [optional] 
 **filterSymbolsOps** | **string**| Can specify the symbol filter operations which you want to perform e.g: [\&quot;CT\&quot;, \&quot;SW\&quot;].  The available symbol filter operations are:  \&quot;SW\&quot; : starts-with  \&quot;EW\&quot; : ends-with  \&quot;CT\&quot; : contains  \&quot;EQ\&quot; : equals  Note:  The request will respond with 400 1. If operations other than the above mentioned are given. 2. If filterSymbolsValues query parameter is missing when filterSymbolsOps is present. 3. If number of values given for filterSymbolsOps and filterSymbolsValues differ. 4. If date query parameter is not provided.  | [optional] 
 **filterSymbolsValues** | **string**| Can specify the symbol filter values of the date filter operations e.g: [\&quot;ab\&quot;, \&quot;xy\&quot;] in respective order of values in filterSymbolsOps query parameter.  Note: The request will respond with 400 1. If filterSymbolsOps query parameter is missing when filterSymbolsValues is present. 2. If number of values given for filterSymbolsOps and filterSymbolsValues differ. 3. If date query parameter is not provided.  | [optional] 
 **sortFieldName** | **string**| Can specify the name of field with respect to which user wants to sort data   Note: The request will respond with 400, If a field which doesn&#39;t exist in the OFDB is requested | [optional] 
 **sortFieldOrder** | **string**| Can specify the order in which user wants to sort data with respect to sortFieldName query parameter   Note: The request will respond with 400, If value other than asc or desc is requested | [optional] 

### Return type
[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Returns when the request is moved to long running mode. The next pickup URL is provided by the Location header. |  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **400** | Invalid query parameter or value provided |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **406** | Unsupported Accept header. Header needs to be set to application/json |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getdates"></a>
# **GetDates**
> InlineResponse202 GetDates (string path, string between = null, string equals = null, string before = null, string after = null, string orderBy = null)



Returns all the dates in the database(OFDB, OMS_OFDB, ECONOFDB)

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OFDB.Api;
using FactSet.SDK.OFDB.Client;
using FactSet.SDK.OFDB.Model;

namespace Example
{
    public class GetDatesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OFDB.Client.Configuration();

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

            var apiInstance = new GetApi(config);

            var path = "path_example";  // string | Encode database path
            var between = "between_example";  // string | Returns list of dates which are between [start,end], dates should be in the respective order of start and end (optional) 
            var equals = "equals_example";  // string | Returns the date which matches given date (optional) 
            var before = "before_example";  // string | Returns list of dates which are before mentioned date (optional) 
            var after = "after_example";  // string | Returns list of dates which are after mentioned date (optional) 
            var orderBy = "asc";  // string | Returns dates in the mentioned sorted order, should provide asc or desc (optional) 

            try
            {
                InlineResponse202 result = apiInstance.GetDates(path, between, equals, before, after, orderBy);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling GetApi.GetDates: " + e.Message );
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
 **path** | **string**| Encode database path | 
 **between** | **string**| Returns list of dates which are between [start,end], dates should be in the respective order of start and end | [optional] 
 **equals** | **string**| Returns the date which matches given date | [optional] 
 **before** | **string**| Returns list of dates which are before mentioned date | [optional] 
 **after** | **string**| Returns list of dates which are after mentioned date | [optional] 
 **orderBy** | **string**| Returns dates in the mentioned sorted order, should provide asc or desc | [optional] 

### Return type
[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Returns when the request is moved to long running mode. The next pickup URL is provided by the Location header. |  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **400** | Invalid query parameter or value provided |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **406** | Unsupported Accept header. Header needs to be set to application/json |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getfields"></a>
# **GetFields**
> InlineResponse202 GetFields (string path)



Returns all the fields in the database(OFDB, OMS_OFDB, ECONOFDB)

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OFDB.Api;
using FactSet.SDK.OFDB.Client;
using FactSet.SDK.OFDB.Model;

namespace Example
{
    public class GetFieldsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OFDB.Client.Configuration();

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

            var apiInstance = new GetApi(config);

            var path = "path_example";  // string | Encode database path

            try
            {
                InlineResponse202 result = apiInstance.GetFields(path);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling GetApi.GetFields: " + e.Message );
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
 **path** | **string**| Encode database path | 

### Return type
[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Returns when the request is moved to long running mode. The next pickup URL is provided by the Location header. |  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **400** | Invalid query parameter or value provided |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **406** | Unsupported Accept header. Header needs to be set to application/json |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getstats"></a>
# **GetStats**
> InlineResponse202 GetStats (string path)



Returns a summary of OFDB metadata and data points

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OFDB.Api;
using FactSet.SDK.OFDB.Client;
using FactSet.SDK.OFDB.Model;

namespace Example
{
    public class GetStatsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OFDB.Client.Configuration();

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

            var apiInstance = new GetApi(config);

            var path = "path_example";  // string | Encode database path

            try
            {
                InlineResponse202 result = apiInstance.GetStats(path);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling GetApi.GetStats: " + e.Message );
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
 **path** | **string**| Encode database path | 

### Return type
[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Returns when the request is moved to long running mode. The next pickup URL is provided by the Location header. |  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **400** | Invalid query parameter or value provided |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **406** | Unsupported Accept header. Header needs to be set to application/json |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getsymbols"></a>
# **GetSymbols**
> InlineResponse202 GetSymbols (string path, string startsWith = null, string endsWith = null, string contains = null, string equals = null, string orderBy = null)



Returns all the symbols in the database(OFDB, OMS_OFDB, ECONOFDB)

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OFDB.Api;
using FactSet.SDK.OFDB.Client;
using FactSet.SDK.OFDB.Model;

namespace Example
{
    public class GetSymbolsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OFDB.Client.Configuration();

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

            var apiInstance = new GetApi(config);

            var path = "path_example";  // string | Encode database path
            var startsWith = "startsWith_example";  // string | Returns list of symbols which starts with mentioned string (optional) 
            var endsWith = "endsWith_example";  // string | Returns list of symbols which ends with mentioned string (optional) 
            var contains = "contains_example";  // string | Returns list of symbols which contains mentioned string (optional) 
            var equals = "equals_example";  // string | Returns symbol which matches mentioned string (optional) 
            var orderBy = "asc";  // string | Returns symbols in the mentioned sorted order, should provide asc or desc (optional) 

            try
            {
                InlineResponse202 result = apiInstance.GetSymbols(path, startsWith, endsWith, contains, equals, orderBy);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling GetApi.GetSymbols: " + e.Message );
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
 **path** | **string**| Encode database path | 
 **startsWith** | **string**| Returns list of symbols which starts with mentioned string | [optional] 
 **endsWith** | **string**| Returns list of symbols which ends with mentioned string | [optional] 
 **contains** | **string**| Returns list of symbols which contains mentioned string | [optional] 
 **equals** | **string**| Returns symbol which matches mentioned string | [optional] 
 **orderBy** | **string**| Returns symbols in the mentioned sorted order, should provide asc or desc | [optional] 

### Return type
[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Returns when the request is moved to long running mode. The next pickup URL is provided by the Location header. |  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **400** | Invalid query parameter or value provided |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **406** | Unsupported Accept header. Header needs to be set to application/json |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


