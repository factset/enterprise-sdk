# factsetprices.DatabaseRolloverApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDatabaseRollover**](DatabaseRolloverApi.md#getDatabaseRollover) | **GET** /factset-prices/v1/database-rollover | Gets the latest relative rollover date for the database.
[**getDatabaseRolloverForList**](DatabaseRolloverApi.md#getDatabaseRolloverForList) | **POST** /factset-prices/v1/database-rollover | Gets the latest relative rollover date for the database.



## getDatabaseRollover

> RolloverResponse getDatabaseRollover()

Gets the latest relative rollover date for the database.

Gets zero relative date and last update time for FactSet databases. The dates represent the date that the rollover event happened; the date and time is in **eastern time zone**.  &lt;p&gt;Depending on the ids requested and their respective regions, a requested startDate or endDate used in the various Prices API may reflect different previous close dates. This relative \&quot;zero\&quot; date, meaning - as of yesterday&#39;s close - will vary across global regions. This API is designed to help production systems account for regional rollover dates to know when to trigger their processes for different regions to reflect the latest close. The response gives context for AMERICAS, ASIA PACIFIC, and EUROPE. &lt;/p&gt; 

### Example

```javascript
const { ApiClient, DatabaseRolloverApi } = require('@factset/sdk-factsetprices');
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

const apiInstance = new DatabaseRolloverApi();

// Call api endpoint
apiInstance.getDatabaseRollover().then(
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

This endpoint does not need any parameter.

### Return type

[**RolloverResponse**](RolloverResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getDatabaseRolloverForList

> RolloverResponse getDatabaseRolloverForList()

Gets the latest relative rollover date for the database.

Gets zero relative date and last update time for FactSet databases. The dates represent the date that the rollover event happened; the date and time is in **eastern time zone**.  &lt;p&gt;Depending on the ids requested and their respective regions, a requested startDate or endDate used in the various Prices API may reflect different previous close dates. This relative \&quot;zero\&quot; date, meaning - as of yesterday&#39;s close - will vary across global regions. This API is designed to help production systems account for regional rollover dates to know when to trigger their processes for different regions to reflect the latest close. The response gives context for AMERICAS, ASIA PACIFIC, and EUROPE. &lt;/p&gt; 

### Example

```javascript
const { ApiClient, DatabaseRolloverApi } = require('@factset/sdk-factsetprices');
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

const apiInstance = new DatabaseRolloverApi();

// Call api endpoint
apiInstance.getDatabaseRolloverForList().then(
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

This endpoint does not need any parameter.

### Return type

[**RolloverResponse**](RolloverResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

