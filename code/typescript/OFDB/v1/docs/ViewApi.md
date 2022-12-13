# ofdb.ViewApi

All URIs are relative to *https://api.factset.com/analytics/ofdb*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDatabase**](ViewApi.md#getDatabase) | **GET** /v1/database/{path} | 
[**getDates**](ViewApi.md#getDates) | **GET** /v1/database/{path}/dates | 
[**getFields**](ViewApi.md#getFields) | **GET** /v1/database/{path}/fields | 
[**getSymbols**](ViewApi.md#getSymbols) | **GET** /v1/database/{path}/symbols | 



## getDatabase

> getDatabase(path, opts)



Returns the data in the database(OFDB, OMS_OFDB, ECONOFDB) for the mentioned Symbol or Date. Atleast one parameter(Symbol/Date) is required. For a range of dates symbol parameter is mandatory.

### Example

```javascript
const { ApiClient, ViewApi } = require('@factset/sdk-ofdb');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new ViewApi();
const path = "path_example"; // String | Encode database path
const opts = {
  'symbol': "symbol_example", // String | Returns data for the symbol mentioned. e.g:sym1
  'date': "date_example", // String | Return data for the specific date or range of dates mentioned.e.g:[date1,date2]
  'filterFields': "filterFields_example", // String | Can specify the fields on which you want to perform field filter operations e.g: [\"PRICE\",\"SECTOR\"]  Note:  The request will respond with 400 1. If fields which are not present on OFDB are given. 2. If filterOps or filterValues query parameters are missing    when filterFields is present. 3. If number of values given for filterOps,      filterFields, filterValues are different 4. If exactly one of symbol or date query parameter is not provided. 
  'filterOps': "filterOps_example", // String | Can specify the field filter operations which you want to perform e.g: [\"LT\", \"GTEQ\", \"CT\"] in respective order of values in filterFields query parameter.  The available field filter operations are :  For CHAR type fields:  \"CT\" : contains  \"SW\" : starts-with  \"EW\" : ends-with   \"EQ\" : equals  For NUMERIC type fields:  \"GT\" : greater than  \"GTEQ\" : greater than or equals  \"LT\" : lesser than  \"LTEQ\" : lesser than or equals  \"EQ\" : equals  Note:  The request will respond with 400  1. If operations other than the above mentioned are provided. 2. If numeric operations are given to char type fields instead of char operations. 3. If char operations are given to numeric type fields instead of numeric operations. 4. If filterFields or filterValues query parameters are missing    when filterOps is present. 5. If number of values given for filterOps,      filterFields, filterValues are different 6. If exactly one of symbol or date query parameter is not provided. 
  'filterValues': "filterValues_example", // String | Can specify the field filter values of the field filter operations e.g: [100, 20, \"AB\"] in respective order of values in filterFields and filterOps query parameters .  Note:   The request will respond with 400 1. If char values are given to numeric type fields. 2. If filterFields or filterOps query parameters are missing    when filterValues is present. 3. If number of values given for filterOps,      filterFields, filterValues are different 4. If exactly one of symbol or date query parameter is not provided. 
  'filterDatesOps': "filterDatesOps_example", // String | Can specify the date filter operations which you want to perform e.g: [\"LT\", \"GTEQ\"].  The available date filter operations are :  \"GT\" : after  \"GTEQ\" : after or equals  \"LT\" : before  \"LTEQ\" : before or equals  \"EQ\" : equals\"  Note:  The request will respond with 400  1. If operations other than the above mentioned are given. 2. If filterDatesValues query parameter is missing when filterDatesOps is present. 3. If number of values given for filterDatesOps and filterDatesValues differ. 4. If symbol query parameter is not provided. 
  'filterDatesValues': "filterDatesValues_example", // String | Can specify the date filter values of the date filter operations e.g: [20200505, 20200303] in respective order of values in filterDatesOps query parameter.  Note:  The request will respond with 400 1. If invalid date values are given 2. If filterDatesOps query parameter is missing when filterDatesValues is present. 3. If number of values given for filterDatesOps and filterDatesValues differ. 4. If symbol query parameter is not provided. 
  'filterSymbolsOps': "filterSymbolsOps_example", // String | Can specify the symbol filter operations which you want to perform e.g: [\"CT\", \"SW\"].  The available symbol filter operations are:  \"SW\" : starts-with  \"EW\" : ends-with  \"CT\" : contains  \"EQ\" : equals  Note:  The request will respond with 400 1. If operations other than the above mentioned are given. 2. If filterSymbolsValues query parameter is missing when filterSymbolsOps is present. 3. If number of values given for filterSymbolsOps and filterSymbolsValues differ. 4. If date query parameter is not provided. 
  'filterSymbolsValues': "filterSymbolsValues_example", // String | Can specify the symbol filter values of the date filter operations e.g: [\"ab\", \"xy\"] in respective order of values in filterSymbolsOps query parameter.  Note: The request will respond with 400 1. If filterSymbolsOps query parameter is missing when filterSymbolsValues is present. 2. If number of values given for filterSymbolsOps and filterSymbolsValues differ. 3. If date query parameter is not provided. 
  'sortFieldName': "sortFieldName_example", // String | Can specify the name of field with respect to which user wants to sort data   Note: The request will respond with 400, If a field which doesn't exist in the OFDB is requested
  'sortFieldOrder': "sortFieldOrder_example" // String | Can specify the order in which user wants to sort data with respect to sortFieldName query parameter   Note: The request will respond with 400, If value other than asc or desc is requested
};

// Call api endpoint
apiInstance.getDatabase(path, opts).then(
  () => {
    console.log('API called successfully.');
  },
  error => {
    console.error(error);
  },
);

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
 **sortFieldOrder** | **String**| Can specify the order in which user wants to sort data with respect to sortFieldName query parameter   Note: The request will respond with 400, If value other than asc or desc is requested | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getDates

> [Number] getDates(path, opts)



Returns all the dates in the database(OFDB, OMS_OFDB, ECONOFDB)

### Example

```javascript
const { ApiClient, ViewApi } = require('@factset/sdk-ofdb');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new ViewApi();
const path = "path_example"; // String | Encode database path
const opts = {
  'between': "between_example", // String | Returns list of dates which are between [start,end], dates should be in the respective order of start and end
  'equals': "equals_example", // String | Returns the date which matches given date
  'before': "before_example", // String | Returns list of dates which are before mentioned date
  'after': "after_example", // String | Returns list of dates which are after mentioned date
  'orderBy': "orderBy_example" // String | Returns dates in the mentioned sorted order, should provide asc or desc
};

// Call api endpoint
apiInstance.getDates(path, opts).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Encode database path | 
 **between** | **String**| Returns list of dates which are between [start,end], dates should be in the respective order of start and end | [optional] 
 **equals** | **String**| Returns the date which matches given date | [optional] 
 **before** | **String**| Returns list of dates which are before mentioned date | [optional] 
 **after** | **String**| Returns list of dates which are after mentioned date | [optional] 
 **orderBy** | **String**| Returns dates in the mentioned sorted order, should provide asc or desc | [optional] 

### Return type

**[Number]**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFields

> [Object] getFields(path)



Returns all the fields in the database(OFDB, OMS_OFDB, ECONOFDB)

### Example

```javascript
const { ApiClient, ViewApi } = require('@factset/sdk-ofdb');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new ViewApi();
const path = "path_example"; // String | Encode database path

// Call api endpoint
apiInstance.getFields(path).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Encode database path | 

### Return type

**[Object]**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSymbols

> [String] getSymbols(path, opts)



Returns all the symbols in the database(OFDB, OMS_OFDB, ECONOFDB)

### Example

```javascript
const { ApiClient, ViewApi } = require('@factset/sdk-ofdb');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new ViewApi();
const path = "path_example"; // String | Encode database path
const opts = {
  'startsWith': "startsWith_example", // String | Returns list of symbols which starts with mentioned string
  'endsWith': "endsWith_example", // String | Returns list of symbols which ends with mentioned string
  'contains': "contains_example", // String | Returns list of symbols which contains mentioned string
  'equals': "equals_example", // String | Returns symbol which matches mentioned string
  'orderBy': "orderBy_example" // String | Returns symbols in the mentioned sorted order, should provide asc or desc
};

// Call api endpoint
apiInstance.getSymbols(path, opts).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Encode database path | 
 **startsWith** | **String**| Returns list of symbols which starts with mentioned string | [optional] 
 **endsWith** | **String**| Returns list of symbols which ends with mentioned string | [optional] 
 **contains** | **String**| Returns list of symbols which contains mentioned string | [optional] 
 **equals** | **String**| Returns symbol which matches mentioned string | [optional] 
 **orderBy** | **String**| Returns symbols in the mentioned sorted order, should provide asc or desc | [optional] 

### Return type

**[String]**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

