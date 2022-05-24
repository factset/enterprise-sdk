# standarddatafeed.SchemaApi

All URIs are relative to *https://api.factset.com/bulk-documents/sdf*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getV1ListSchemas**](SchemaApi.md#getV1ListSchemas) | **GET** /v1/list-schemas | schemas



## getV1ListSchemas

> ListSchema200Response getV1ListSchemas(opts)

schemas

&lt;a href&#x3D;https://api.factset.com/bulk-documents/sdf/v1/list-schemas&gt;List-Schemas&lt;/a&gt; helper end point provides the list of schemas subscribed by the client  This API provides a downloadable file for the schema &amp; sequence number (version number of schema) specified

### Example

```javascript
const { ApiClient, SchemaApi } = require('@factset/sdk-standarddatafeed');
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

const apiInstance = new SchemaApi();
const opts = {
  'schema': "schema_example", // String | schema name</p> Default is all schemas & bundles subscribed by the client</p> **Example: acta_v1, fgp_v1, yn_v1**
  'sequence': 56 // Number | Enter the sequence number associated with a schema</p> Provides a pre-signed url to download the respective schema file</p> \"**Example: \"8\" from acta_v1: [8],**
};

// Call api endpoint
apiInstance.getV1ListSchemas(opts).then(
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
 **sequence** | **Number**| Enter the sequence number associated with a schema&lt;/p&gt; Provides a pre-signed url to download the respective schema file&lt;/p&gt; \&quot;**Example: \&quot;8\&quot; from acta_v1: [8],** | [optional] 

### Return type

[**ListSchema200Response**](ListSchema200Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

