# factsetconcordance.SnowflakeApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSnowflakeEntityMatchForList**](SnowflakeApi.md#getSnowflakeEntityMatchForList) | **POST** /factset-concordance/v2/snowflake-entity-match | Perform an entity search and return a snowflake-friendly response. Up to 25 Names per request.
[**snowflakeEntityMappingPost**](SnowflakeApi.md#snowflakeEntityMappingPost) | **POST** /factset-concordance/v2/snowflake-entity-mapping | Save entity mappings to a universe



## getSnowflakeEntityMatchForList

> SnowflakeEntityMatchResponse getSnowflakeEntityMatchForList(snowflakeEntityMatchRequest)

Perform an entity search and return a snowflake-friendly response. Up to 25 Names per request.

Finds the best candidate entities matching the given company name. Additional attributes can be supplied to narrow the search. *This endpoint is used natively within Snowflake and is not to be consumed directly by users. Reach out to your FactSet Account team to learn more about Concordance in Snowflake.* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SnowflakeApi } = require('@factset/sdk-factsetconcordance');
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

const apiInstance = new SnowflakeApi();
const snowflakeEntityMatchRequest = new factsetconcordance.SnowflakeEntityMatchRequest(); // SnowflakeEntityMatchRequest | A request to match an entity name and its attributes within Snowflake.

// Call api endpoint
apiInstance.getSnowflakeEntityMatchForList(snowflakeEntityMatchRequest).then(
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
 **snowflakeEntityMatchRequest** | [**SnowflakeEntityMatchRequest**](SnowflakeEntityMatchRequest.md)| A request to match an entity name and its attributes within Snowflake. | 

### Return type

[**SnowflakeEntityMatchResponse**](SnowflakeEntityMatchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## snowflakeEntityMappingPost

> SnowflakeEntityMappingResponse snowflakeEntityMappingPost(snowflakeEntityMappingRequest)

Save entity mappings to a universe

Manually save or update entity mappings with metadata

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SnowflakeApi } = require('@factset/sdk-factsetconcordance');
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

const apiInstance = new SnowflakeApi();
const snowflakeEntityMappingRequest = new factsetconcordance.SnowflakeEntityMappingRequest(); // SnowflakeEntityMappingRequest | A request to save entity mappings to a universe

// Call api endpoint
apiInstance.snowflakeEntityMappingPost(snowflakeEntityMappingRequest).then(
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
 **snowflakeEntityMappingRequest** | [**SnowflakeEntityMappingRequest**](SnowflakeEntityMappingRequest.md)| A request to save entity mappings to a universe | 

### Return type

[**SnowflakeEntityMappingResponse**](SnowflakeEntityMappingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

