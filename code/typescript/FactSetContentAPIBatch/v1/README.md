[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# FactSet Content API Batch client library for JavaScript

[![API Version](https://img.shields.io/badge/api-v1.0.0-blue)]()
[![npm](https://img.shields.io/badge/npm-v0.22.1-orange)](https://www.npmjs.com/package/@factset/sdk-factsetcontentapibatch/v/0.22.1)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

FactSet Content APIs - Batching Endpoint

This TypeScript/JavaScript package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- SDK version: 0.22.1
- Build package: com.factset.sdk.codegen.FactSetJavascriptClientCodegen

For more information, please visit [http://www.factset.com/api](http://www.factset.com/api)

## Requirements

* Node.js >= 18

## Installation

### npm

```shell
npm install @factset/sdk-utils @factset/sdk-factsetcontentapibatch@0.22.1
```

### yarn

```shell
yarn add @factset/sdk-utils @factset/sdk-factsetcontentapibatch@0.22.1
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
const { ApiClient, BatchProcessingApi } = require('@factset/sdk-factsetcontentapibatch');
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

const apiInstance = new BatchProcessingApi();
const id = "id_example"; // String | Batch Request identifier.

// Call api endpoint
apiInstance.getBatchData(id).then(
  data => {

      // data is a responsewrapper: GetBatchDataResponseWrapper
      switch (data.statusCode) {

          case 200:
             // BatchDataResponse
             console.log(data.getResponse200());
             break;

          case 202:
             // BatchStatusResponse
             console.log(data.getResponse202());
             break;

      }

  },
  error => {
    console.error(error);
  },
);

```


## Using a Proxy

To add a HTTP proxy for the API client, you can set the proxyUrl for the ApiClient instance:

```javascript
const { ApiClient } = require('@factset/sdk-factsetcontentapibatch');

const apiClient = ApiClient.instance;
apiClient.setProxyUrl('http://username:password@proxy.example.com:8080');
```

## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/content*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*factsetcontentapibatch.BatchProcessingApi* | [**getBatchData**](docs/BatchProcessingApi.md#getBatchData) | **GET** /batch/v1/result | Returns the response for a Batch Request
*factsetcontentapibatch.BatchProcessingApi* | [**getBatchDataWithPost**](docs/BatchProcessingApi.md#getBatchDataWithPost) | **POST** /batch/v1/result | Returns the response for a Batch Request
*factsetcontentapibatch.BatchProcessingApi* | [**getBatchStatus**](docs/BatchProcessingApi.md#getBatchStatus) | **GET** /batch/v1/status | Returns the status for a Batch Request
*factsetcontentapibatch.BatchProcessingApi* | [**getBatchStatusWithPost**](docs/BatchProcessingApi.md#getBatchStatusWithPost) | **POST** /batch/v1/status | Returns the status for a Batch Request


## Documentation for Models

 - [factsetcontentapibatch.BatchDataRequest](docs/BatchDataRequest.md)
 - [factsetcontentapibatch.BatchDataResponse](docs/BatchDataResponse.md)
 - [factsetcontentapibatch.BatchStatus](docs/BatchStatus.md)
 - [factsetcontentapibatch.BatchStatusRequest](docs/BatchStatusRequest.md)
 - [factsetcontentapibatch.BatchStatusResponse](docs/BatchStatusResponse.md)
 - [factsetcontentapibatch.ErrorResponse](docs/ErrorResponse.md)
 - [factsetcontentapibatch.ErrorResponseSubErrors](docs/ErrorResponseSubErrors.md)


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
