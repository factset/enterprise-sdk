# standarddatafeed.SchemaApi

All URIs are relative to *https://api.factset.com/bulk-documents/sdf/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getListSchemaswithoutwithooutRequiredParameters**](SchemaApi.md#getListSchemaswithoutwithooutRequiredParameters) | **GET** /list-schemas | List of Standard DataFeed (SDF) schemas.
[**getSchemaDetails**](SchemaApi.md#getSchemaDetails) | **GET** /schema-details | Schema Details.



## getListSchemaswithoutwithooutRequiredParameters

> ListSchema getListSchemaswithoutwithooutRequiredParameters()

List of Standard DataFeed (SDF) schemas.

This helper endpoint provides the list of schemas subscribed by the client and their corresponding versions. 

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

// Call api endpoint
apiInstance.getListSchemaswithoutwithooutRequiredParameters().then(
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

This endpoint does not need any parameter.

### Return type

[**ListSchema**](ListSchema.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSchemaDetails

> SchemaDetail getSchemaDetails(schema, version)

Schema Details.

If the schema and version number are passed in the request, this endpoint provides a pre-signed URL pointing to the location from where the schema details can be downloaded. 

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
const schema = fgp_v1; // String | Name of the schema.
const version = 5; // Number | Version number of the schema.

// Call api endpoint
apiInstance.getSchemaDetails(schema, version).then(
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
 **schema** | **String**| Name of the schema. | 
 **version** | **Number**| Version number of the schema. | 

### Return type

[**SchemaDetail**](SchemaDetail.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

