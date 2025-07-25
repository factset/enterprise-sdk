[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Signals client library for JavaScript

[![API Version](https://img.shields.io/badge/api-v2.6.0-blue)](https://developer.factset.com/api-catalog/signals-api)
[![npm](https://img.shields.io/badge/npm-v2.0.1-orange)](https://www.npmjs.com/package/@factset/sdk-signals/v/2.0.1)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Collection of endpoints for providing Signal Events, Definitions and Metadata

This TypeScript/JavaScript package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 2.6.0
- SDK version: 2.0.1
- Build package: com.factset.sdk.codegen.FactSetJavascriptClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* Node.js >= 18

## Installation

### npm

```shell
npm install @factset/sdk-utils @factset/sdk-signals@2.0.1
```

### yarn

```shell
yarn add @factset/sdk-utils @factset/sdk-signals@2.0.1
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
const { ApiClient, EventsApi } = require('@factset/sdk-signals');
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

const apiInstance = new EventsApi();
const eventId = "eventId_example"; // String | The UUID of the event to return.

// Call api endpoint
apiInstance.getEventAdaptiveCardById(eventId).then(
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
const { ApiClient } = require('@factset/sdk-signals');

const apiClient = ApiClient.instance;
apiClient.setProxyUrl('http://username:password@proxy.example.com:8080');
```

## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/signals/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*signals.EventsApi* | [**getEventAdaptiveCardById**](docs/EventsApi.md#getEventAdaptiveCardById) | **GET** /events/adaptive-cards/{eventId} | 
*signals.EventsApi* | [**getEventAdaptiveCards**](docs/EventsApi.md#getEventAdaptiveCards) | **GET** /events/adaptive-cards | 
*signals.EventsApi* | [**getEventDetailById**](docs/EventsApi.md#getEventDetailById) | **GET** /events/details/{eventId} | 
*signals.EventsApi* | [**getEventDetails**](docs/EventsApi.md#getEventDetails) | **GET** /events/details | 
*signals.EventsApi* | [**getEventEntities**](docs/EventsApi.md#getEventEntities) | **GET** /events/entities | 
*signals.EventsApi* | [**getEventHeadlines**](docs/EventsApi.md#getEventHeadlines) | **GET** /events/headlines | 
*signals.EventsApi* | [**postEventAdaptiveCards**](docs/EventsApi.md#postEventAdaptiveCards) | **POST** /events/adaptive-cards | 
*signals.EventsApi* | [**postEventDetails**](docs/EventsApi.md#postEventDetails) | **POST** /events/details | 
*signals.EventsApi* | [**postEventEntities**](docs/EventsApi.md#postEventEntities) | **POST** /events/entities | 
*signals.EventsApi* | [**postEventHeadlines**](docs/EventsApi.md#postEventHeadlines) | **POST** /events/headlines | 
*signals.MetadataApi* | [**getCategories**](docs/MetadataApi.md#getCategories) | **GET** /categories | 
*signals.MetadataApi* | [**getDataDictionary**](docs/MetadataApi.md#getDataDictionary) | **GET** /data-dictionary | 
*signals.MetadataApi* | [**getDataDictionaryById**](docs/MetadataApi.md#getDataDictionaryById) | **GET** /data-dictionary/{signalId} | 
*signals.MetadataApi* | [**getThemes**](docs/MetadataApi.md#getThemes) | **GET** /themes | 


## Documentation for Models

 - [signals.Contract](docs/Contract.md)
 - [signals.ContractFields](docs/ContractFields.md)
 - [signals.ContractFieldsEventDate](docs/ContractFieldsEventDate.md)
 - [signals.ContractFieldsSummary](docs/ContractFieldsSummary.md)
 - [signals.ContractProperty](docs/ContractProperty.md)
 - [signals.ContractPropertyItems](docs/ContractPropertyItems.md)
 - [signals.DateTimeInterval](docs/DateTimeInterval.md)
 - [signals.ErrorItem](docs/ErrorItem.md)
 - [signals.ErrorItemSource](docs/ErrorItemSource.md)
 - [signals.ErrorResponse](docs/ErrorResponse.md)
 - [signals.EventAdaptiveCard](docs/EventAdaptiveCard.md)
 - [signals.EventAdaptiveCards](docs/EventAdaptiveCards.md)
 - [signals.EventAdaptiveDataItem](docs/EventAdaptiveDataItem.md)
 - [signals.EventDetail](docs/EventDetail.md)
 - [signals.EventDetailDataItem](docs/EventDetailDataItem.md)
 - [signals.EventDetailDataItemAllOf](docs/EventDetailDataItemAllOf.md)
 - [signals.EventDetails](docs/EventDetails.md)
 - [signals.EventHeadlineDataItem](docs/EventHeadlineDataItem.md)
 - [signals.EventHeadlines](docs/EventHeadlines.md)
 - [signals.EventMeta](docs/EventMeta.md)
 - [signals.EventRequestBody](docs/EventRequestBody.md)
 - [signals.EventsEntities](docs/EventsEntities.md)
 - [signals.EventsEntitiesPost](docs/EventsEntitiesPost.md)
 - [signals.EventsMeta](docs/EventsMeta.md)
 - [signals.EventsMetaDateRange](docs/EventsMetaDateRange.md)
 - [signals.EventsMetaPagination](docs/EventsMetaPagination.md)
 - [signals.IdResolutionsMeta](docs/IdResolutionsMeta.md)
 - [signals.RateLimitResponse](docs/RateLimitResponse.md)
 - [signals.RelevanceScoreRange](docs/RelevanceScoreRange.md)
 - [signals.ScreenMeta](docs/ScreenMeta.md)
 - [signals.ScreenMetaPartial](docs/ScreenMetaPartial.md)
 - [signals.SignalDefinition](docs/SignalDefinition.md)
 - [signals.SignalDefinitionData](docs/SignalDefinitionData.md)
 - [signals.SignalMetaData](docs/SignalMetaData.md)
 - [signals.SignalMetaDataData](docs/SignalMetaDataData.md)


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
