<img alt="FactSet" src="https://www.factset.com/hubfs/Assets/images/factset-logo.svg" height="56" width="290">

# FactSet Entity Report Builder client library for JavaScript

[![npm](https://img.shields.io/npm/v/@factset/sdk-factsetentityreportbuilder)](https://www.npmjs.com/package/@factset/sdk-factsetentityreportbuilder)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

This TypeScript/JavaScript package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- Package version: 0.20.0
- Build package: org.openapitools.codegen.languages.JavascriptClientCodegen

## Requirements

* Node.js >= 12

## Installation

### npm

```shell
npm install @factset/sdk-utils @factset/sdk-factsetentityreportbuilder
```

### yarn

```shell
yarn add @factset/sdk-utils @factset/sdk-factsetentityreportbuilder
```

## Usage

1. [Generate authentication credentials](../../../../README.md#authentication).
2. Setup Node.js environment
   1. Install and activate Node.js >=12. If you're using [nvm](https://github.com/nvm-sh/nvm):

      ```sh
      nvm install 16
      nvm use 16
      ```

   2. (optional) [Install yarn](https://yarnpkg.com/getting-started/install).
3. [Install dependencies](#installation).
4. Run the following:

```javascript
const { ApiClient, EntityStructureApi } = require('@factset/sdk-factsetentityreportbuilder');
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

const apiInstance = new EntityStructureApi();
const id = FDS; // String | Company ticker
const opts = {
  'schema': "'table_parent_child_columns'" // String | The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns - tree - Entities are represented as tree nodes returned in a flat structure, where each parent node contains a children attribute pointing to its child nodes 
};

// Call api endpoint
apiInstance.getEntityStructureStructure(id, opts).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

```


## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/report/entity/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*factsetentityreportbuilder.EntityStructureApi* | [**getEntityStructureStructure**](docs/EntityStructureApi.md#getEntityStructureStructure) | **GET** /structure | Entity structure


## Documentation for Models

 - [factsetentityreportbuilder.Category](docs/Category.md)
 - [factsetentityreportbuilder.CategoryCategory](docs/CategoryCategory.md)
 - [factsetentityreportbuilder.CurrencyCode](docs/CurrencyCode.md)
 - [factsetentityreportbuilder.CurrencyCodeCurrencyCode](docs/CurrencyCodeCurrencyCode.md)
 - [factsetentityreportbuilder.CurrencySymbol](docs/CurrencySymbol.md)
 - [factsetentityreportbuilder.CurrencySymbolCurrencySymbol](docs/CurrencySymbolCurrencySymbol.md)
 - [factsetentityreportbuilder.Description](docs/Description.md)
 - [factsetentityreportbuilder.DescriptionDescription](docs/DescriptionDescription.md)
 - [factsetentityreportbuilder.ErrorObject](docs/ErrorObject.md)
 - [factsetentityreportbuilder.ErrorObjectLinks](docs/ErrorObjectLinks.md)
 - [factsetentityreportbuilder.ErrorObjectSource](docs/ErrorObjectSource.md)
 - [factsetentityreportbuilder.ErrorResponse](docs/ErrorResponse.md)
 - [factsetentityreportbuilder.Frequency](docs/Frequency.md)
 - [factsetentityreportbuilder.FrequencyFrequency](docs/FrequencyFrequency.md)
 - [factsetentityreportbuilder.MetadataEntry](docs/MetadataEntry.md)
 - [factsetentityreportbuilder.Response](docs/Response.md)
 - [factsetentityreportbuilder.Scale](docs/Scale.md)
 - [factsetentityreportbuilder.ScaleScale](docs/ScaleScale.md)
 - [factsetentityreportbuilder.ValueType](docs/ValueType.md)
 - [factsetentityreportbuilder.ValueTypeValueType](docs/ValueTypeValueType.md)


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

Copyright 2022 FactSet Research Systems Inc

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.