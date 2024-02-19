# standarddatafeed.SchemaApi

All URIs are relative to *https://api.factset.com/bulk-documents/sdf/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getV1ListSchemas**](SchemaApi.md#getV1ListSchemas) | **GET** /list-schemas | schemas



## getV1ListSchemas

> ListSchemas getV1ListSchemas(opts)

schemas

&lt;a href&#x3D;https://api.factset.com/bulk-documents/sdf/v1/list-schemas&gt;List-Schemas&lt;/a&gt; helper end point provides the list of schemas subscribed by the client and their corresponding sequences if no query parameters are passed in the request.   If schema &amp; sequence number (version number of schema) are passed in the request, this endpoint provides a downloadable presigned url containing the schema information.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SchemaApi } = require('@factset/sdk-standarddatafeed');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
//
// The confidential client instance should be reused in production environments.
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
  'schema': "schema_example", // String | schema name</p> </p> **Example: acta_v1, fgp_v1, yn_v1**  QFL:- To query QFL data, please use value:   **qfl_v1** 
  'sequence': 56 // Number | Version number of a schema  Please enter the sequence number associated with the schema passed in the request **Example: \"8\" from acta_v1: [8],**  QFL:- Enter the sequence number associated with the qfl schema   **Note:** Please pass sequence parameter only while passing the schema parameter in the request
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
 **schema** | **String**| schema name&lt;/p&gt; &lt;/p&gt; **Example: acta_v1, fgp_v1, yn_v1**  QFL:- To query QFL data, please use value:   **qfl_v1**  | [optional] 
 **sequence** | **Number**| Version number of a schema  Please enter the sequence number associated with the schema passed in the request **Example: \&quot;8\&quot; from acta_v1: [8],**  QFL:- Enter the sequence number associated with the qfl schema   **Note:** Please pass sequence parameter only while passing the schema parameter in the request | [optional] 

### Return type

[**ListSchemas**](ListSchemas.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

