# standarddatafeed.SchemasBundlesApi

All URIs are relative to *https://api.factset.com/bulk-documents/sdf*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getV1ListFiles**](SchemasBundlesApi.md#getV1ListFiles) | **GET** /v1/list-files | 



## getV1ListFiles

> ListFiles200Response getV1ListFiles(opts)



&lt;a href&#x3D;https://api.factset.com/bulk-documents/sdf/v1/list-files&gt;List-Files&lt;/a&gt; end point provides the delta &amp; full files in a reverse chronological order for all the schemas &amp; bundles subscribed by the client 

### Example

```javascript
const { ApiClient, SchemasBundlesApi } = require('@factset/sdk-standarddatafeed');
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

const apiInstance = new SchemasBundlesApi();
const opts = {
  'schema': "schema_example", // String | schema name</p> Default is all schemas & bundles subscribed by the client</p> **Example: acta_v1, fgp_v1, yn_v1**
  'bundle': "bundle_example", // String | bundle name</p> Default is all the bundles client is subscribed to</p> **Do not use \"schema\" parameter** when searching for a specific bundle
  'type': "type_example", // String | file type = Full or Delta</p> Full files are weekly files generated every weekend (Saturday). **The date range should include weekend dates if requesting for \"Full\" files**
  'startDate': "startDate_example", // String | The earliest date of the feed file the API should fetch for based on the fileTimestamp.</p> Data requested should be in batches of 10days **(Date range should be less than or equal to 10)**</p>**Date format -  YYYY-MM-DD**
  'endDate': "endDate_example", // String | The latest date of the feed file the API should fetch for based on the fileTimestamp</p>**Date format -  YYYY-MM-DD**
  'paginationLimit': 20, // Number | Specifies the number of results to return per page. Default is 20 & Maximum is 500 results per page
  'paginationOffset': 56, // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
  'sort': "sort_example" // String | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used
};

// Call api endpoint
apiInstance.getV1ListFiles(opts).then(
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
 **schema** | **String**| schema name&lt;/p&gt; Default is all schemas &amp; bundles subscribed by the client&lt;/p&gt; **Example: acta_v1, fgp_v1, yn_v1** | [optional] 
 **bundle** | **String**| bundle name&lt;/p&gt; Default is all the bundles client is subscribed to&lt;/p&gt; **Do not use \&quot;schema\&quot; parameter** when searching for a specific bundle | [optional] 
 **type** | **String**| file type &#x3D; Full or Delta&lt;/p&gt; Full files are weekly files generated every weekend (Saturday). **The date range should include weekend dates if requesting for \&quot;Full\&quot; files** | [optional] 
 **startDate** | **String**| The earliest date of the feed file the API should fetch for based on the fileTimestamp.&lt;/p&gt; Data requested should be in batches of 10days **(Date range should be less than or equal to 10)**&lt;/p&gt;**Date format -  YYYY-MM-DD** | [optional] 
 **endDate** | **String**| The latest date of the feed file the API should fetch for based on the fileTimestamp&lt;/p&gt;**Date format -  YYYY-MM-DD** | [optional] 
 **paginationLimit** | **Number**| Specifies the number of results to return per page. Default is 20 &amp; Maximum is 500 results per page | [optional] [default to 20]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional] 
 **sort** | **String**| Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used | [optional] 

### Return type

[**ListFiles200Response**](ListFiles200Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

