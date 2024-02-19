# GetApi

All URIs are relative to *https://api.factset.com/analytics/ofdb/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAudit**](GetApi.md#getAudit) | **GET** /database/{path}/audit | 
[**getData**](GetApi.md#getData) | **GET** /database/{path} | 
[**getDates**](GetApi.md#getDates) | **GET** /database/{path}/dates | 
[**getFields**](GetApi.md#getFields) | **GET** /database/{path}/fields | 
[**getStats**](GetApi.md#getStats) | **GET** /database/{path}/stats | 
[**getSymbols**](GetApi.md#getSymbols) | **GET** /database/{path}/symbols | 



## getAudit

> InlineResponse202 getAudit(path)



Returns a list of the most recent "modificationTimes" in long datetime format

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.OFDB.ApiClient;
import com.factset.sdk.OFDB.ApiException;
import com.factset.sdk.OFDB.Configuration;
import com.factset.sdk.OFDB.auth.*;
import com.factset.sdk.OFDB.models.*;
import com.factset.sdk.OFDB.api.GetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        GetApi apiInstance = new GetApi(defaultClient);
        String path = "path_example"; // String | Encode database path
        try {
            InlineResponse202 result = apiInstance.getAudit(path);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling GetApi#getAudit");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Encode database path |

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


## getData

> InlineResponse202 getData(path, symbol, date, filterFields, filterOps, filterValues, filterDatesOps, filterDatesValues, filterSymbolsOps, filterSymbolsValues, sortFieldName, sortFieldOrder)



Returns the data in the database(OFDB, OMS_OFDB, ECONOFDB) for the mentioned Symbol or Date. Atleast one parameter(Symbol/Date) is required. For a range of dates symbol parameter is mandatory.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.OFDB.ApiClient;
import com.factset.sdk.OFDB.ApiException;
import com.factset.sdk.OFDB.Configuration;
import com.factset.sdk.OFDB.auth.*;
import com.factset.sdk.OFDB.models.*;
import com.factset.sdk.OFDB.api.GetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        GetApi apiInstance = new GetApi(defaultClient);
        String path = "path_example"; // String | Encode database path
        String symbol = "symbol_example"; // String | Returns data for the symbol mentioned. e.g:sym1
        String date = "date_example"; // String | Return data for the specific date or range of dates mentioned.e.g:[date1,date2]
        String filterFields = "filterFields_example"; // String | Can specify the fields on which you want to perform field filter operations e.g: [\"PRICE\",\"SECTOR\"]  Note:  The request will respond with 400 1. If fields which are not present on OFDB are given. 2. If filterOps or filterValues query parameters are missing    when filterFields is present. 3. If number of values given for filterOps,      filterFields, filterValues are different 4. If exactly one of symbol or date query parameter is not provided. 
        String filterOps = "filterOps_example"; // String | Can specify the field filter operations which you want to perform e.g: [\"LT\", \"GTEQ\", \"CT\"] in respective order of values in filterFields query parameter.  The available field filter operations are :  For CHAR type fields:  \"CT\" : contains  \"SW\" : starts-with  \"EW\" : ends-with   \"EQ\" : equals  For NUMERIC type fields:  \"GT\" : greater than  \"GTEQ\" : greater than or equals  \"LT\" : lesser than  \"LTEQ\" : lesser than or equals  \"EQ\" : equals  Note:  The request will respond with 400  1. If operations other than the above mentioned are provided. 2. If numeric operations are given to char type fields instead of char operations. 3. If char operations are given to numeric type fields instead of numeric operations. 4. If filterFields or filterValues query parameters are missing    when filterOps is present. 5. If number of values given for filterOps,      filterFields, filterValues are different 6. If exactly one of symbol or date query parameter is not provided. 
        String filterValues = "filterValues_example"; // String | Can specify the field filter values of the field filter operations e.g: [100, 20, \"AB\"] in respective order of values in filterFields and filterOps query parameters .  Note:   The request will respond with 400 1. If char values are given to numeric type fields. 2. If filterFields or filterOps query parameters are missing    when filterValues is present. 3. If number of values given for filterOps,      filterFields, filterValues are different 4. If exactly one of symbol or date query parameter is not provided. 
        String filterDatesOps = "filterDatesOps_example"; // String | Can specify the date filter operations which you want to perform e.g: [\"LT\", \"GTEQ\"].  The available date filter operations are :  \"GT\" : after  \"GTEQ\" : after or equals  \"LT\" : before  \"LTEQ\" : before or equals  \"EQ\" : equals\"  Note:  The request will respond with 400  1. If operations other than the above mentioned are given. 2. If filterDatesValues query parameter is missing when filterDatesOps is present. 3. If number of values given for filterDatesOps and filterDatesValues differ. 4. If symbol query parameter is not provided. 
        String filterDatesValues = "filterDatesValues_example"; // String | Can specify the date filter values of the date filter operations e.g: [20200505, 20200303] in respective order of values in filterDatesOps query parameter.  Note:  The request will respond with 400 1. If invalid date values are given 2. If filterDatesOps query parameter is missing when filterDatesValues is present. 3. If number of values given for filterDatesOps and filterDatesValues differ. 4. If symbol query parameter is not provided. 
        String filterSymbolsOps = "filterSymbolsOps_example"; // String | Can specify the symbol filter operations which you want to perform e.g: [\"CT\", \"SW\"].  The available symbol filter operations are:  \"SW\" : starts-with  \"EW\" : ends-with  \"CT\" : contains  \"EQ\" : equals  Note:  The request will respond with 400 1. If operations other than the above mentioned are given. 2. If filterSymbolsValues query parameter is missing when filterSymbolsOps is present. 3. If number of values given for filterSymbolsOps and filterSymbolsValues differ. 4. If date query parameter is not provided. 
        String filterSymbolsValues = "filterSymbolsValues_example"; // String | Can specify the symbol filter values of the date filter operations e.g: [\"ab\", \"xy\"] in respective order of values in filterSymbolsOps query parameter.  Note: The request will respond with 400 1. If filterSymbolsOps query parameter is missing when filterSymbolsValues is present. 2. If number of values given for filterSymbolsOps and filterSymbolsValues differ. 3. If date query parameter is not provided. 
        String sortFieldName = "sortFieldName_example"; // String | Can specify the name of field with respect to which user wants to sort data   Note: The request will respond with 400, If a field which doesn't exist in the OFDB is requested
        String sortFieldOrder = "ASC"; // String | Can specify the order in which user wants to sort data with respect to sortFieldName query parameter   Note: The request will respond with 400, If value other than asc or desc is requested
        try {
            InlineResponse202 result = apiInstance.getData(path, symbol, date, filterFields, filterOps, filterValues, filterDatesOps, filterDatesValues, filterSymbolsOps, filterSymbolsValues, sortFieldName, sortFieldOrder);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling GetApi#getData");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Encode database path |
 **symbol** | **String**| Returns data for the symbol mentioned. e.g:sym1 | [optional]
 **date** | **String**| Return data for the specific date or range of dates mentioned.e.g:[date1,date2] | [optional]
 **filterFields** | **String**| Can specify the fields on which you want to perform field filter operations e.g: [\&quot;PRICE\&quot;,\&quot;SECTOR\&quot;]  Note:  The request will respond with 400 1. If fields which are not present on OFDB are given. 2. If filterOps or filterValues query parameters are missing    when filterFields is present. 3. If number of values given for filterOps,      filterFields, filterValues are different 4. If exactly one of symbol or date query parameter is not provided.  | [optional]
 **filterOps** | **String**| Can specify the field filter operations which you want to perform e.g: [\&quot;LT\&quot;, \&quot;GTEQ\&quot;, \&quot;CT\&quot;] in respective order of values in filterFields query parameter.  The available field filter operations are :  For CHAR type fields:  \&quot;CT\&quot; : contains  \&quot;SW\&quot; : starts-with  \&quot;EW\&quot; : ends-with   \&quot;EQ\&quot; : equals  For NUMERIC type fields:  \&quot;GT\&quot; : greater than  \&quot;GTEQ\&quot; : greater than or equals  \&quot;LT\&quot; : lesser than  \&quot;LTEQ\&quot; : lesser than or equals  \&quot;EQ\&quot; : equals  Note:  The request will respond with 400  1. If operations other than the above mentioned are provided. 2. If numeric operations are given to char type fields instead of char operations. 3. If char operations are given to numeric type fields instead of numeric operations. 4. If filterFields or filterValues query parameters are missing    when filterOps is present. 5. If number of values given for filterOps,      filterFields, filterValues are different 6. If exactly one of symbol or date query parameter is not provided.  | [optional]
 **filterValues** | **String**| Can specify the field filter values of the field filter operations e.g: [100, 20, \&quot;AB\&quot;] in respective order of values in filterFields and filterOps query parameters .  Note:   The request will respond with 400 1. If char values are given to numeric type fields. 2. If filterFields or filterOps query parameters are missing    when filterValues is present. 3. If number of values given for filterOps,      filterFields, filterValues are different 4. If exactly one of symbol or date query parameter is not provided.  | [optional]
 **filterDatesOps** | **String**| Can specify the date filter operations which you want to perform e.g: [\&quot;LT\&quot;, \&quot;GTEQ\&quot;].  The available date filter operations are :  \&quot;GT\&quot; : after  \&quot;GTEQ\&quot; : after or equals  \&quot;LT\&quot; : before  \&quot;LTEQ\&quot; : before or equals  \&quot;EQ\&quot; : equals\&quot;  Note:  The request will respond with 400  1. If operations other than the above mentioned are given. 2. If filterDatesValues query parameter is missing when filterDatesOps is present. 3. If number of values given for filterDatesOps and filterDatesValues differ. 4. If symbol query parameter is not provided.  | [optional]
 **filterDatesValues** | **String**| Can specify the date filter values of the date filter operations e.g: [20200505, 20200303] in respective order of values in filterDatesOps query parameter.  Note:  The request will respond with 400 1. If invalid date values are given 2. If filterDatesOps query parameter is missing when filterDatesValues is present. 3. If number of values given for filterDatesOps and filterDatesValues differ. 4. If symbol query parameter is not provided.  | [optional]
 **filterSymbolsOps** | **String**| Can specify the symbol filter operations which you want to perform e.g: [\&quot;CT\&quot;, \&quot;SW\&quot;].  The available symbol filter operations are:  \&quot;SW\&quot; : starts-with  \&quot;EW\&quot; : ends-with  \&quot;CT\&quot; : contains  \&quot;EQ\&quot; : equals  Note:  The request will respond with 400 1. If operations other than the above mentioned are given. 2. If filterSymbolsValues query parameter is missing when filterSymbolsOps is present. 3. If number of values given for filterSymbolsOps and filterSymbolsValues differ. 4. If date query parameter is not provided.  | [optional]
 **filterSymbolsValues** | **String**| Can specify the symbol filter values of the date filter operations e.g: [\&quot;ab\&quot;, \&quot;xy\&quot;] in respective order of values in filterSymbolsOps query parameter.  Note: The request will respond with 400 1. If filterSymbolsOps query parameter is missing when filterSymbolsValues is present. 2. If number of values given for filterSymbolsOps and filterSymbolsValues differ. 3. If date query parameter is not provided.  | [optional]
 **sortFieldName** | **String**| Can specify the name of field with respect to which user wants to sort data   Note: The request will respond with 400, If a field which doesn&#39;t exist in the OFDB is requested | [optional]
 **sortFieldOrder** | **String**| Can specify the order in which user wants to sort data with respect to sortFieldName query parameter   Note: The request will respond with 400, If value other than asc or desc is requested | [optional] [enum: ASC, DESC]

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


## getDates

> InlineResponse202 getDates(path, between, equals, before, after, orderBy)



Returns all the dates in the database(OFDB, OMS_OFDB, ECONOFDB)

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.OFDB.ApiClient;
import com.factset.sdk.OFDB.ApiException;
import com.factset.sdk.OFDB.Configuration;
import com.factset.sdk.OFDB.auth.*;
import com.factset.sdk.OFDB.models.*;
import com.factset.sdk.OFDB.api.GetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        GetApi apiInstance = new GetApi(defaultClient);
        String path = "path_example"; // String | Encode database path
        String between = "between_example"; // String | Returns list of dates which are between [start,end], dates should be in the respective order of start and end
        String equals = "equals_example"; // String | Returns the date which matches given date
        String before = "before_example"; // String | Returns list of dates which are before mentioned date
        String after = "after_example"; // String | Returns list of dates which are after mentioned date
        String orderBy = "asc"; // String | Returns dates in the mentioned sorted order, should provide asc or desc
        try {
            InlineResponse202 result = apiInstance.getDates(path, between, equals, before, after, orderBy);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling GetApi#getDates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Encode database path |
 **between** | **String**| Returns list of dates which are between [start,end], dates should be in the respective order of start and end | [optional]
 **equals** | **String**| Returns the date which matches given date | [optional]
 **before** | **String**| Returns list of dates which are before mentioned date | [optional]
 **after** | **String**| Returns list of dates which are after mentioned date | [optional]
 **orderBy** | **String**| Returns dates in the mentioned sorted order, should provide asc or desc | [optional] [enum: asc, desc]

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


## getFields

> InlineResponse202 getFields(path)



Returns all the fields in the database(OFDB, OMS_OFDB, ECONOFDB)

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.OFDB.ApiClient;
import com.factset.sdk.OFDB.ApiException;
import com.factset.sdk.OFDB.Configuration;
import com.factset.sdk.OFDB.auth.*;
import com.factset.sdk.OFDB.models.*;
import com.factset.sdk.OFDB.api.GetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        GetApi apiInstance = new GetApi(defaultClient);
        String path = "path_example"; // String | Encode database path
        try {
            InlineResponse202 result = apiInstance.getFields(path);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling GetApi#getFields");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Encode database path |

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


## getStats

> InlineResponse202 getStats(path)



Returns a summary of OFDB metadata and data points

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.OFDB.ApiClient;
import com.factset.sdk.OFDB.ApiException;
import com.factset.sdk.OFDB.Configuration;
import com.factset.sdk.OFDB.auth.*;
import com.factset.sdk.OFDB.models.*;
import com.factset.sdk.OFDB.api.GetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        GetApi apiInstance = new GetApi(defaultClient);
        String path = "path_example"; // String | Encode database path
        try {
            InlineResponse202 result = apiInstance.getStats(path);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling GetApi#getStats");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Encode database path |

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


## getSymbols

> InlineResponse202 getSymbols(path, startsWith, endsWith, contains, equals, orderBy)



Returns all the symbols in the database(OFDB, OMS_OFDB, ECONOFDB)

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.OFDB.ApiClient;
import com.factset.sdk.OFDB.ApiException;
import com.factset.sdk.OFDB.Configuration;
import com.factset.sdk.OFDB.auth.*;
import com.factset.sdk.OFDB.models.*;
import com.factset.sdk.OFDB.api.GetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        GetApi apiInstance = new GetApi(defaultClient);
        String path = "path_example"; // String | Encode database path
        String startsWith = "startsWith_example"; // String | Returns list of symbols which starts with mentioned string
        String endsWith = "endsWith_example"; // String | Returns list of symbols which ends with mentioned string
        String contains = "contains_example"; // String | Returns list of symbols which contains mentioned string
        String equals = "equals_example"; // String | Returns symbol which matches mentioned string
        String orderBy = "asc"; // String | Returns symbols in the mentioned sorted order, should provide asc or desc
        try {
            InlineResponse202 result = apiInstance.getSymbols(path, startsWith, endsWith, contains, equals, orderBy);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling GetApi#getSymbols");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Encode database path |
 **startsWith** | **String**| Returns list of symbols which starts with mentioned string | [optional]
 **endsWith** | **String**| Returns list of symbols which ends with mentioned string | [optional]
 **contains** | **String**| Returns list of symbols which contains mentioned string | [optional]
 **equals** | **String**| Returns symbol which matches mentioned string | [optional]
 **orderBy** | **String**| Returns symbols in the mentioned sorted order, should provide asc or desc | [optional] [enum: asc, desc]

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

