# procuretopayapiscim.SchemasApi

All URIs are relative to *https://api.factset.com/scim/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSchema**](SchemasApi.md#getSchema) | **GET** /Schemas/{id} | Get a schema.
[**getSchemas**](SchemasApi.md#getSchemas) | **GET** /Schemas | Get a list of schemas.



## getSchema

> Schema getSchema(id)

Get a schema.

Get a specific schema. See RFC 7643 section 7.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SchemasApi } = require('@factset/sdk-procuretopayapiscim');
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

const apiInstance = new SchemasApi();
const id = "id_example"; // String | ID of resource.

// Call api endpoint
apiInstance.getSchema(id).then(
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
 **id** | **String**| ID of resource. | 

### Return type

[**Schema**](Schema.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/scim+json, application/json


## getSchemas

> SchemaList getSchemas(opts)

Get a list of schemas.

Get a list of supported resource schemas. See RFC 7644 section 4.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SchemasApi } = require('@factset/sdk-procuretopayapiscim');
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

const apiInstance = new SchemasApi();
const opts = {
  'startIndex': 56, // Number | Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument.
  'count': 56 // Number | Maximum resource count. The server will not return more resources than this value, although it may return fewer.
};

// Call api endpoint
apiInstance.getSchemas(opts).then(
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
 **startIndex** | **Number**| Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. | [optional] 
 **count** | **Number**| Maximum resource count. The server will not return more resources than this value, although it may return fewer. | [optional] 

### Return type

[**SchemaList**](SchemaList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/scim+json, application/json

