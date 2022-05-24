<img alt="FactSet" src="https://www.factset.com/hubfs/Assets/images/factset-logo.svg" height="56" width="290">

# Market Intelligence client library for JavaScript

[![npm](https://img.shields.io/npm/v/@factset/sdk-marketintelligence)](https://www.npmjs.com/package/@factset/sdk-marketintelligence)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Through the Market Intelligence API, stay up to date on the companies and sectors you care most about with ease. Request the templates you have made in Market Intelligence to receive news and data on your portfolio.

This TypeScript/JavaScript package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0
- Package version: 0.20.0
- Build package: org.openapitools.codegen.languages.JavascriptClientCodegen

## Requirements

* Node.js >= 12

## Installation

### npm

```shell
npm install @factset/sdk-utils @factset/sdk-marketintelligence
```

### yarn

```shell
yarn add @factset/sdk-utils @factset/sdk-marketintelligence
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
const { ApiClient, CreateReportApi } = require('@factset/sdk-marketintelligence');
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

const apiInstance = new CreateReportApi();
const mIAPIPostRequest = new marketintelligence.MIAPIPostRequest(); // MIAPIPostRequest | 

// Call api endpoint
apiInstance.createPost(mIAPIPostRequest).then(
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

All URIs are relative to *https://api.factset.com/market-intelligence*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*marketintelligence.CreateReportApi* | [**createPost**](docs/CreateReportApi.md#createPost) | **POST** /create | Create new report templates including portfolio or market news and data.
*marketintelligence.RetrieveRefreshedDataApi* | [**getDataPollIdResultGet**](docs/RetrieveRefreshedDataApi.md#getDataPollIdResultGet) | **GET** /get-data/{poll_id}/result | Retrieve data for desired report.
*marketintelligence.RetrieveRefreshedReportApi* | [**getDataReportIdGet**](docs/RetrieveRefreshedReportApi.md#getDataReportIdGet) | **GET** /get-data/{report_id} | Retrieve data for desired report.
*marketintelligence.RetrieveReportListApi* | [**getReportsGet**](docs/RetrieveReportListApi.md#getReportsGet) | **GET** /get-reports | Retrieve a list of previously created reports and associated report metadata.


## Documentation for Models

 - [marketintelligence.FetchReportPollID](docs/FetchReportPollID.md)
 - [marketintelligence.GetReportInfo](docs/GetReportInfo.md)
 - [marketintelligence.MIAPIPostRequest](docs/MIAPIPostRequest.md)
 - [marketintelligence.PostRequestExample](docs/PostRequestExample.md)
 - [marketintelligence.PostResponseInfo](docs/PostResponseInfo.md)
 - [marketintelligence.ReportContent](docs/ReportContent.md)
 - [marketintelligence.ReportDataHeader](docs/ReportDataHeader.md)


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