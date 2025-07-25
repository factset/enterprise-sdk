[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# OFDB client library for JavaScript

[![API Version](https://img.shields.io/badge/api-v2.1.0-blue)](https://developer.factset.com/api-catalog/ofdb-api)
[![npm](https://img.shields.io/badge/npm-v0.33.1-orange)](https://www.npmjs.com/package/@factset/sdk-ofdb/v/0.33.1)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

OFDB API

This TypeScript/JavaScript package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 2.1.0
- SDK version: 0.33.1
- Build package: com.factset.sdk.codegen.FactSetJavascriptClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* Node.js >= 18

## Installation

### npm

```shell
npm install @factset/sdk-utils @factset/sdk-ofdb@0.33.1
```

### yarn

```shell
yarn add @factset/sdk-utils @factset/sdk-ofdb@0.33.1
```

## Usage

1. [Generate authentication credentials](../../../../README.md#authentication).
2. Setup Node.js environment
   1. Install and activate Node.js >=18. If you're using [nvm](https://github.com/nvm-sh/nvm):

      ```sh
      nvm install 18
      nvm use 18
      ```

   2. (optional) [Install yarn](https://yarnpkg.com/getting-started/install).
3. [Install dependencies](#installation).
4. Run the following:

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

### Example Code


```javascript
const { ApiClient, AddApi } = require('@factset/sdk-ofdb');
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

const apiInstance = new AddApi();
const path = "path_example"; // String | Encode database path
const addDates = {"data":[{"date":20220107,"content":[{"symbol":"FDS","price":444}]}]}; // AddDates | Required data for creating date in the database. At least one iterative field is required otherwise it will throw 400.

// Call api endpoint
apiInstance.addDates(path, addDates).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

```


## Using a Proxy

To add a HTTP proxy for the API client, you can set the proxyUrl for the ApiClient instance:

```javascript
const { ApiClient } = require('@factset/sdk-ofdb');

const apiClient = ApiClient.instance;
apiClient.setProxyUrl('http://username:password@proxy.example.com:8080');
```

## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/analytics/ofdb/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ofdb.AddApi* | [**addDates**](docs/AddApi.md#addDates) | **POST** /database/{path}/dates | 
*ofdb.AddApi* | [**addFields**](docs/AddApi.md#addFields) | **POST** /database/{path}/fields | 
*ofdb.AddApi* | [**addSymbols**](docs/AddApi.md#addSymbols) | **POST** /database/{path}/symbols | 
*ofdb.CreateApi* | [**createDatabase**](docs/CreateApi.md#createDatabase) | **POST** /database | 
*ofdb.DeleteApi* | [**deleteBulkItems**](docs/DeleteApi.md#deleteBulkItems) | **POST** /database/{path}/delete | 
*ofdb.DeleteApi* | [**deleteDate**](docs/DeleteApi.md#deleteDate) | **DELETE** /database/{path}/dates/{date} | 
*ofdb.DeleteApi* | [**deleteDateFromSymbol**](docs/DeleteApi.md#deleteDateFromSymbol) | **DELETE** /database/{path}/dates/{date}/symbols/{symbol} | 
*ofdb.DeleteApi* | [**deleteSymbol**](docs/DeleteApi.md#deleteSymbol) | **DELETE** /database/{path}/symbols/{symbol} | 
*ofdb.DeleteApi* | [**getResourceDateFromSymbol**](docs/DeleteApi.md#getResourceDateFromSymbol) | **DELETE** /database/{path}/dates/{date}/symbols/{symbol}/{id} | 
*ofdb.GetApi* | [**getAudit**](docs/GetApi.md#getAudit) | **GET** /database/{path}/audit | 
*ofdb.GetApi* | [**getData**](docs/GetApi.md#getData) | **GET** /database/{path} | 
*ofdb.GetApi* | [**getDates**](docs/GetApi.md#getDates) | **GET** /database/{path}/dates | 
*ofdb.GetApi* | [**getFields**](docs/GetApi.md#getFields) | **GET** /database/{path}/fields | 
*ofdb.GetApi* | [**getStats**](docs/GetApi.md#getStats) | **GET** /database/{path}/stats | 
*ofdb.GetApi* | [**getSymbols**](docs/GetApi.md#getSymbols) | **GET** /database/{path}/symbols | 
*ofdb.LongRunningApi* | [**getResourceAudit**](docs/LongRunningApi.md#getResourceAudit) | **GET** /database/{path}/audit/{id} | 
*ofdb.LongRunningApi* | [**getResourceBulkDelete**](docs/LongRunningApi.md#getResourceBulkDelete) | **GET** /database/{path}/delete/{id} | 
*ofdb.LongRunningApi* | [**getResourceData**](docs/LongRunningApi.md#getResourceData) | **GET** /database/{path}/{id} | 
*ofdb.LongRunningApi* | [**getResourceDatabase**](docs/LongRunningApi.md#getResourceDatabase) | **GET** /database/{id} | 
*ofdb.LongRunningApi* | [**getResourceDate**](docs/LongRunningApi.md#getResourceDate) | **GET** /database/{path}/dates/{date}/{id} | 
*ofdb.LongRunningApi* | [**getResourceDates**](docs/LongRunningApi.md#getResourceDates) | **GET** /database/{path}/dates/{id} | 
*ofdb.LongRunningApi* | [**getResourceFields**](docs/LongRunningApi.md#getResourceFields) | **GET** /database/{path}/fields/{id} | 
*ofdb.LongRunningApi* | [**getResourceStats**](docs/LongRunningApi.md#getResourceStats) | **GET** /database/{path}/stats/{id} | 
*ofdb.LongRunningApi* | [**getResourceSymbol**](docs/LongRunningApi.md#getResourceSymbol) | **GET** /database/{path}/symbols/{symbol}/{id} | 
*ofdb.LongRunningApi* | [**getResourceSymbols**](docs/LongRunningApi.md#getResourceSymbols) | **GET** /database/{path}/symbols/{id} | 
*ofdb.LongRunningApi* | [**getStatus**](docs/LongRunningApi.md#getStatus) | **GET** /database/jobs/{id}/status | 
*ofdb.UpdateApi* | [**updateDate**](docs/UpdateApi.md#updateDate) | **PUT** /database/{path}/dates/{date} | 
*ofdb.UpdateApi* | [**updateDates**](docs/UpdateApi.md#updateDates) | **PUT** /database/{path}/dates | 
*ofdb.UpdateApi* | [**updateSymbol**](docs/UpdateApi.md#updateSymbol) | **PUT** /database/{path}/symbols/{symbol} | 
*ofdb.UpdateApi* | [**updateSymbols**](docs/UpdateApi.md#updateSymbols) | **PUT** /database/{path}/symbols | 


## Documentation for Models

 - [ofdb.AddDates](docs/AddDates.md)
 - [ofdb.AddFields](docs/AddFields.md)
 - [ofdb.AddSymbols](docs/AddSymbols.md)
 - [ofdb.BulkDelete](docs/BulkDelete.md)
 - [ofdb.BulkDeleteArrayItem](docs/BulkDeleteArrayItem.md)
 - [ofdb.BulkDeleteArrayItemNested](docs/BulkDeleteArrayItemNested.md)
 - [ofdb.BulkDeleteItem](docs/BulkDeleteItem.md)
 - [ofdb.ContentWithDate](docs/ContentWithDate.md)
 - [ofdb.ContentWithSymbol](docs/ContentWithSymbol.md)
 - [ofdb.CreateDatabase](docs/CreateDatabase.md)
 - [ofdb.CreateDatabaseData](docs/CreateDatabaseData.md)
 - [ofdb.DataValue](docs/DataValue.md)
 - [ofdb.DatabaseSchema](docs/DatabaseSchema.md)
 - [ofdb.DatabaseSchemaData](docs/DatabaseSchemaData.md)
 - [ofdb.DateAndContent](docs/DateAndContent.md)
 - [ofdb.DateAndFields](docs/DateAndFields.md)
 - [ofdb.DatesWithId](docs/DatesWithId.md)
 - [ofdb.ErrorObject](docs/ErrorObject.md)
 - [ofdb.ErrorObjectWithSource](docs/ErrorObjectWithSource.md)
 - [ofdb.ErrorObjectWithSourceSource](docs/ErrorObjectWithSourceSource.md)
 - [ofdb.FieldProperties](docs/FieldProperties.md)
 - [ofdb.InlineResponse200](docs/InlineResponse200.md)
 - [ofdb.InlineResponse2001](docs/InlineResponse2001.md)
 - [ofdb.InlineResponse2001Data](docs/InlineResponse2001Data.md)
 - [ofdb.InlineResponse2002](docs/InlineResponse2002.md)
 - [ofdb.InlineResponse2003](docs/InlineResponse2003.md)
 - [ofdb.InlineResponse2004](docs/InlineResponse2004.md)
 - [ofdb.InlineResponse2005](docs/InlineResponse2005.md)
 - [ofdb.InlineResponse2006](docs/InlineResponse2006.md)
 - [ofdb.InlineResponse200Data](docs/InlineResponse200Data.md)
 - [ofdb.InlineResponse201](docs/InlineResponse201.md)
 - [ofdb.InlineResponse201Data](docs/InlineResponse201Data.md)
 - [ofdb.InlineResponse202](docs/InlineResponse202.md)
 - [ofdb.InlineResponse202Data](docs/InlineResponse202Data.md)
 - [ofdb.InlineResponse400](docs/InlineResponse400.md)
 - [ofdb.InlineResponse403](docs/InlineResponse403.md)
 - [ofdb.SuccessPostResponse](docs/SuccessPostResponse.md)
 - [ofdb.SuccessPostResponseData](docs/SuccessPostResponseData.md)
 - [ofdb.SymbolAndContent](docs/SymbolAndContent.md)
 - [ofdb.SymbolAndFields](docs/SymbolAndFields.md)
 - [ofdb.SymbolsWithId](docs/SymbolsWithId.md)
 - [ofdb.UpdateDate](docs/UpdateDate.md)
 - [ofdb.UpdateDates](docs/UpdateDates.md)
 - [ofdb.UpdateSymbol](docs/UpdateSymbol.md)
 - [ofdb.UpdateSymbols](docs/UpdateSymbols.md)


## Documentation for Authorization



### FactSetApiKey

- **Type**: HTTP basic authentication



### FactSetOAuth2


- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


# Contributing

Please refer to the [contributing guide](../../../../CONTRIBUTING.md).

# Copyright

Copyright 2025 FactSet Research Systems Inc

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
