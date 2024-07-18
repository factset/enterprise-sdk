# vermilion.EntityApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEntityValuesByCode**](EntityApi.md#getEntityValuesByCode) | **GET** /v1/{tenant}/entities/{entityCode}/values | Gets the entity values



## getEntityValuesByCode

> EntityFieldValueDTO getEntityValuesByCode(tenant, entityCode, opts)

Gets the entity values

Gets the entity values for the specified entity

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, EntityApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new EntityApi();
const tenant = TENANT; // String | The code of the tenancy
const entityCode = ENTCODE; // String | The code of the entity
const opts = {
  'sort': ["entity key field"], // [String] | The entity field to sort on. Can only be sorted on entity key, description or secondary key fields. Append \"-\" to sort in descending order. If no parameter given, it will be sorted by key field in ascending order by default
  'paginationLimit': 10, // Number | Non-negative maximum number of entries to return. Default is 25
  'paginationOffset': 0, // Number | Non-negative number of entries to skip. Default is 0
  'showAll': 1 // Number | Whether to show all field values for each entity row. Value should either be 1 or 0. Default is 0 (false). Otherwise, show all field values in a JSON array named \"fieldsWithValues\", with each array value being a string in the format of \"**<FIELD_NAME> : <FIELD_VALUE>**\". Both key and description field values will be included in this JSON array too.
};

// Call api endpoint
apiInstance.getEntityValuesByCode(tenant, entityCode, opts).then(
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
 **sort** | [**[String]**](String.md)| The entity field to sort on. Can only be sorted on entity key, description or secondary key fields. Append \&quot;-\&quot; to sort in descending order. If no parameter given, it will be sorted by key field in ascending order by default | [optional] 
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return. Default is 25 | [optional] [default to 25]
 **paginationOffset** | **Number**| Non-negative number of entries to skip. Default is 0 | [optional] [default to 0]
 **showAll** | **Number**| Whether to show all field values for each entity row. Value should either be 1 or 0. Default is 0 (false). Otherwise, show all field values in a JSON array named \&quot;fieldsWithValues\&quot;, with each array value being a string in the format of \&quot;**&lt;FIELD_NAME&gt; : &lt;FIELD_VALUE&gt;**\&quot;. Both key and description field values will be included in this JSON array too. | [optional] [default to 0]

### Return type

[**EntityFieldValueDTO**](EntityFieldValueDTO.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

