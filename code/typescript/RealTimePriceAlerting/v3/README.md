[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Real-Time Price Alerting client library for JavaScript

[![npm](https://img.shields.io/npm/v/@factset/sdk-realtimepricealerting)](https://www.npmjs.com/package/@factset/sdk-realtimepricealerting)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

The Price Alerting API is designed to inform the users of an application directly about important changes in the data on the platform. The endpoint group *basic price alerting* deals with generation of alerts based on current price data. For notations, users can define an upper or lower limit and choose on which price type those limit conditions apply.

Alerting uses the concepts of triggers and alerts.

A trigger is an entity that is set up by an application to watch a certain condition in the market data around a financial instrument. The standard conditions that can be applied are lower limit and upper limit for the value of the price for a given financial instrument.

When the condition of a trigger is met, an alert is created. Each alert thus represents one event where a trigger condition was met.

An application can learn about the creation of alerts in two ways: The application can actively request the list of alerts (pull approach) or it can subscribe to the list of existing alerts. If a new alert is created, that list changes and the application is notified about the new alert with an update that contains the details on the new alert (push approach).

The API supports both approaches. The push approach is realized most easily by using the subscription support that the client libraries provide.

See the [Quotes API for Digital Portals](https://developer.factset.com/api-catalog/quotes-api-digital-portals) for access to detailed price information.

Note: As part of the general trial access, endpoints to write data are excluded. For a description of the full alerting API, please work with a
FactSet consultant and see https://endpointreference.factset.com.


This TypeScript/JavaScript package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 3.0.0
- Package version: 0.11.1
- Build package: com.factset.sdk.codegen.FactSetJavascriptClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* Node.js >= 14

## Installation

### npm

```shell
npm install @factset/sdk-utils @factset/sdk-realtimepricealerting@0.11.1
```

### yarn

```shell
yarn add @factset/sdk-utils @factset/sdk-realtimepricealerting@0.11.1
```

## Usage

1. [Generate authentication credentials](../../../../README.md#authentication).
2. Setup Node.js environment
   1. Install and activate Node.js >=14. If you're using [nvm](https://github.com/nvm-sh/nvm):

      ```sh
      nvm install 16
      nvm use 16
      ```

   2. (optional) [Install yarn](https://yarnpkg.com/getting-started/install).
3. [Install dependencies](#installation).
4. Run the following:


```javascript
const { ApiClient, AlertingApi } = require('@factset/sdk-realtimepricealerting');
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

const apiInstance = new AlertingApi();
const id = "id_example"; // String | 
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getAlertingPricesBasicAlertGet(id, opts).then(
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

All URIs are relative to *https://api.factset.com/wealth/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*realtimepricealerting.AlertingApi* | [**getAlertingPricesBasicAlertGet**](docs/AlertingApi.md#getAlertingPricesBasicAlertGet) | **GET** /alerting/prices/basic/alert/get | Details of an alert.
*realtimepricealerting.AlertingApi* | [**getAlertingPricesBasicAlertList**](docs/AlertingApi.md#getAlertingPricesBasicAlertList) | **GET** /alerting/prices/basic/alert/list | List of alerts.
*realtimepricealerting.AlertingApi* | [**getAlertingPricesBasicTriggerGet**](docs/AlertingApi.md#getAlertingPricesBasicTriggerGet) | **GET** /alerting/prices/basic/trigger/get | Details of a trigger.
*realtimepricealerting.AlertingApi* | [**postAlertingPricesBasicTriggerList**](docs/AlertingApi.md#postAlertingPricesBasicTriggerList) | **POST** /alerting/prices/basic/trigger/list | List of triggers.


## Documentation for Models

 - [realtimepricealerting.CursorBasedPaginationOutputObject](docs/CursorBasedPaginationOutputObject.md)
 - [realtimepricealerting.CursorBasedPaginationOutputObjectWithoutTotal](docs/CursorBasedPaginationOutputObjectWithoutTotal.md)
 - [realtimepricealerting.ErrorMetaObject](docs/ErrorMetaObject.md)
 - [realtimepricealerting.InlineResponse200](docs/InlineResponse200.md)
 - [realtimepricealerting.InlineResponse2001](docs/InlineResponse2001.md)
 - [realtimepricealerting.InlineResponse2001Data](docs/InlineResponse2001Data.md)
 - [realtimepricealerting.InlineResponse2001Meta](docs/InlineResponse2001Meta.md)
 - [realtimepricealerting.InlineResponse2001Trigger](docs/InlineResponse2001Trigger.md)
 - [realtimepricealerting.InlineResponse2001TriggerPrice](docs/InlineResponse2001TriggerPrice.md)
 - [realtimepricealerting.InlineResponse2001TriggerStatus](docs/InlineResponse2001TriggerStatus.md)
 - [realtimepricealerting.InlineResponse2002](docs/InlineResponse2002.md)
 - [realtimepricealerting.InlineResponse2002Data](docs/InlineResponse2002Data.md)
 - [realtimepricealerting.InlineResponse2002DataNotification](docs/InlineResponse2002DataNotification.md)
 - [realtimepricealerting.InlineResponse2002DataNotificationChannel](docs/InlineResponse2002DataNotificationChannel.md)
 - [realtimepricealerting.InlineResponse2003](docs/InlineResponse2003.md)
 - [realtimepricealerting.InlineResponse2003Data](docs/InlineResponse2003Data.md)
 - [realtimepricealerting.InlineResponse200Data](docs/InlineResponse200Data.md)
 - [realtimepricealerting.InlineResponse200DataNotification](docs/InlineResponse200DataNotification.md)
 - [realtimepricealerting.InlineResponse200DataNotificationChannel](docs/InlineResponse200DataNotificationChannel.md)
 - [realtimepricealerting.InlineResponse200DataNotificationStatus](docs/InlineResponse200DataNotificationStatus.md)
 - [realtimepricealerting.InlineResponse200DataPrice](docs/InlineResponse200DataPrice.md)
 - [realtimepricealerting.InlineResponse200DataTrigger](docs/InlineResponse200DataTrigger.md)
 - [realtimepricealerting.InlineResponse200DataTriggerNotation](docs/InlineResponse200DataTriggerNotation.md)
 - [realtimepricealerting.InlineResponse200DataTriggerNotification](docs/InlineResponse200DataTriggerNotification.md)
 - [realtimepricealerting.InlineResponse200DataTriggerNotificationChannel](docs/InlineResponse200DataTriggerNotificationChannel.md)
 - [realtimepricealerting.InlineResponse200DataTriggerPrice](docs/InlineResponse200DataTriggerPrice.md)
 - [realtimepricealerting.InlineResponse200DataTriggerRange](docs/InlineResponse200DataTriggerRange.md)
 - [realtimepricealerting.InlineResponse200DataTriggerStatus](docs/InlineResponse200DataTriggerStatus.md)
 - [realtimepricealerting.InlineResponse200Meta](docs/InlineResponse200Meta.md)
 - [realtimepricealerting.OffsetBasedPaginationOutputObject](docs/OffsetBasedPaginationOutputObject.md)
 - [realtimepricealerting.OffsetBasedPaginationOutputObjectWithoutTotal](docs/OffsetBasedPaginationOutputObjectWithoutTotal.md)
 - [realtimepricealerting.PartialOutputObject](docs/PartialOutputObject.md)
 - [realtimepricealerting.PostAlertingPricesBasicTriggerListRequest](docs/PostAlertingPricesBasicTriggerListRequest.md)
 - [realtimepricealerting.PostAlertingPricesBasicTriggerListRequestData](docs/PostAlertingPricesBasicTriggerListRequestData.md)
 - [realtimepricealerting.PostAlertingPricesBasicTriggerListRequestDataFilter](docs/PostAlertingPricesBasicTriggerListRequestDataFilter.md)
 - [realtimepricealerting.PostAlertingPricesBasicTriggerListRequestDataFilterStatus](docs/PostAlertingPricesBasicTriggerListRequestDataFilterStatus.md)
 - [realtimepricealerting.PostAlertingPricesBasicTriggerListRequestMeta](docs/PostAlertingPricesBasicTriggerListRequestMeta.md)
 - [realtimepricealerting.PostAlertingPricesBasicTriggerListRequestMetaPagination](docs/PostAlertingPricesBasicTriggerListRequestMetaPagination.md)
 - [realtimepricealerting.StatusObject](docs/StatusObject.md)


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