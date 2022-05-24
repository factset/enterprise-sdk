# vermilion.EntityApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1TenantEntitiesEntityCodeValuesGet**](EntityApi.md#v1TenantEntitiesEntityCodeValuesGet) | **GET** /v1/{tenant}/entities/{entityCode}/values | Gets the entity values



## v1TenantEntitiesEntityCodeValuesGet

> EntityFieldValueDTO v1TenantEntitiesEntityCodeValuesGet(tenant, entityCode, opts)

Gets the entity values

Gets the entity values for the specified entity

### Example

```javascript
const { ApiClient, EntityApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new EntityApi();
const tenant = "tenant_example"; // String | The code of the tenancy
const entityCode = "entityCode_example"; // String | The code of the entity
const opts = {
  'sort': _sort=entity key field, // String | The entity field to sort on. Can only be sorted on entity key, description or secondary key fields. Append \"-\" to sort in descending order. If no parameter given, it will be sorted by key field in ascending order by default
  'paginationLimit': 25, // Number | Non-negative maximum number of entries to return. Default is 25
  'paginationOffset': 0 // Number | Non-negative number of entries to skip. Default is 0
};

// Call api endpoint
apiInstance.v1TenantEntitiesEntityCodeValuesGet(tenant, entityCode, opts).then(
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
 **tenant** | **String**| The code of the tenancy | 
 **entityCode** | **String**| The code of the entity | 
 **sort** | **String**| The entity field to sort on. Can only be sorted on entity key, description or secondary key fields. Append \&quot;-\&quot; to sort in descending order. If no parameter given, it will be sorted by key field in ascending order by default | [optional] 
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return. Default is 25 | [optional] 
 **paginationOffset** | **Number**| Non-negative number of entries to skip. Default is 0 | [optional] 

### Return type

[**EntityFieldValueDTO**](EntityFieldValueDTO.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

