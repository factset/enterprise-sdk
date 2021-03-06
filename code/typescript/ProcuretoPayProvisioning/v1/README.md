<img alt="FactSet" src="https://www.factset.com/hubfs/Assets/images/factset-logo.svg" height="56" width="290">

# Procure to Pay: Provisioning client library for JavaScript

[![npm](https://img.shields.io/npm/v/@factset/sdk-procuretopayprovisioning)](https://www.npmjs.com/package/@factset/sdk-procuretopayprovisioning)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Allows for Provisioning and Entitlement of FactSet accounts. 
 
 Authentication is provided via FactSet's [API Key System](https://developer.factset.com/authentication)
 
 Please note that the on-page \"Try it out\" features do not function. You must authorize against our API and make requests directly againt the endpoints.
 
 

This TypeScript/JavaScript package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1S
- Package version: 0.9.1
- Build package: org.openapitools.codegen.languages.JavascriptClientCodegen

## Requirements

* Node.js >= 12

## Installation

### npm

```shell
npm install @factset/sdk-utils @factset/sdk-procuretopayprovisioning
```

### yarn

```shell
yarn add @factset/sdk-utils @factset/sdk-procuretopayprovisioning
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
const { ApiClient, EntitlementManagementApi } = require('@factset/sdk-procuretopayprovisioning');
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

const apiInstance = new EntitlementManagementApi();
const opts = {
  'manageProductIds': new procuretopayprovisioning.ManageProductIds() // ManageProductIds | 
};

// Call api endpoint
apiInstance.addProductsPost(opts).then(
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

All URIs are relative to *https://api.factset.com/procuretopay/provisioning*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*procuretopayprovisioning.EntitlementManagementApi* | [**addProductsPost**](docs/EntitlementManagementApi.md#addProductsPost) | **POST** /addProducts | Adds listed productIds to an individual
*procuretopayprovisioning.EntitlementManagementApi* | [**removeProductsPost**](docs/EntitlementManagementApi.md#removeProductsPost) | **POST** /removeProducts | Removes listed productIds from an individual
*procuretopayprovisioning.OrderStatusApi* | [**transactionStatusGet**](docs/OrderStatusApi.md#transactionStatusGet) | **GET** /transactionStatus | Check status of order by transactionCode
*procuretopayprovisioning.UserManagementApi* | [**cancelIndividualPost**](docs/UserManagementApi.md#cancelIndividualPost) | **POST** /cancelIndividual | Cancels an individual&#39;s serial and all productIds
*procuretopayprovisioning.UserManagementApi* | [**createIndividualPost**](docs/UserManagementApi.md#createIndividualPost) | **POST** /createIndividual | Provisions an individual for FactSet
*procuretopayprovisioning.UserManagementApi* | [**getIndividualGet**](docs/UserManagementApi.md#getIndividualGet) | **GET** /getIndividual | Returns an individual&#39;s details by uniqueId
*procuretopayprovisioning.UserManagementApi* | [**listIndividualsGet**](docs/UserManagementApi.md#listIndividualsGet) | **GET** /listIndividuals | Lists all individuals with details at all locations.
*procuretopayprovisioning.UserManagementApi* | [**modifyIndividualPost**](docs/UserManagementApi.md#modifyIndividualPost) | **POST** /modifyIndividual | Modifies an individual&#39;s attributes as determined by the uniqueId in the body of the request. Please note that the uniqueId may not be changed. Fields not changing may be passed as NULL but never empty.


## Documentation for Models

 - [procuretopayprovisioning.CancelIndividual](docs/CancelIndividual.md)
 - [procuretopayprovisioning.CreateIndividual](docs/CreateIndividual.md)
 - [procuretopayprovisioning.GetIndividual](docs/GetIndividual.md)
 - [procuretopayprovisioning.InlineResponse202](docs/InlineResponse202.md)
 - [procuretopayprovisioning.ManageProductIds](docs/ManageProductIds.md)
 - [procuretopayprovisioning.ModifyIndividual](docs/ModifyIndividual.md)
 - [procuretopayprovisioning.TransactionStatus](docs/TransactionStatus.md)


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
