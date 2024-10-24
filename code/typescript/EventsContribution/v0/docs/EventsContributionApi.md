# eventscontribution.EventsContributionApi

All URIs are relative to *https://api.factset.com/events-contribution/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteEvent**](EventsContributionApi.md#deleteEvent) | **DELETE** /events/{eventId} | Delete Event data
[**getEvent**](EventsContributionApi.md#getEvent) | **GET** /events/{eventId} | Get Event Data
[**insertEvent**](EventsContributionApi.md#insertEvent) | **POST** /events | Insert Event data
[**updateEvent**](EventsContributionApi.md#updateEvent) | **PUT** /events/{eventId} | Update Event data



## deleteEvent

> DeleteResponse deleteEvent(eventId)

Delete Event data

This endpoint allows you to delete a previously inserted event with the corresponding event id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, EventsContributionApi } = require('@factset/sdk-eventscontribution');
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

const apiInstance = new EventsContributionApi();
const eventId = 1234; // String | ID of event to be deleted. This ID is vendor generated and should be unique in each vendor's content set.

// Call api endpoint
apiInstance.deleteEvent(eventId).then(
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
 **eventId** | **String**| ID of event to be deleted. This ID is vendor generated and should be unique in each vendor&#39;s content set. | 

### Return type

[**DeleteResponse**](DeleteResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEvent

> GetResponse getEvent(eventId)

Get Event Data

This endpoint retrieves previously submitted events by event ID.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, EventsContributionApi } = require('@factset/sdk-eventscontribution');
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

const apiInstance = new EventsContributionApi();
const eventId = "eventId_example"; // String | ID for event retrieval. This ID is vendor generated and should be unique in each vendor's content set.

// Call api endpoint
apiInstance.getEvent(eventId).then(
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
 **eventId** | **String**| ID for event retrieval. This ID is vendor generated and should be unique in each vendor&#39;s content set. | 

### Return type

[**GetResponse**](GetResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## insertEvent

> InsertResponse insertEvent(insertRequest)

Insert Event data

This endpoint inserts an event. Once the event is inserted, it will show up immediately among FactSet’s own event calendar apps, for display within FactSet’s applications.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, EventsContributionApi } = require('@factset/sdk-eventscontribution');
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

const apiInstance = new EventsContributionApi();
const insertRequest = new eventscontribution.InsertRequest(); // InsertRequest | INSERT request body which needs to be sent with request

// Call api endpoint
apiInstance.insertEvent(insertRequest).then(
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
 **insertRequest** | [**InsertRequest**](InsertRequest.md)| INSERT request body which needs to be sent with request | 

### Return type

[**InsertResponse**](InsertResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## updateEvent

> UpdateResponse updateEvent(eventId, updateRequest)

Update Event data

This endpoint allows you to update a previously inserted event. Existing event will be replaced with the event data provided in the request body.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, EventsContributionApi } = require('@factset/sdk-eventscontribution');
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

const apiInstance = new EventsContributionApi();
const eventId = 1234; // String | ID of event to be updated. This ID is vendor generated and should be unique in each vendor's content set.
const updateRequest = new eventscontribution.UpdateRequest(); // UpdateRequest | UPDATE request body which needs to be sent with request

// Call api endpoint
apiInstance.updateEvent(eventId, updateRequest).then(
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
 **eventId** | **String**| ID of event to be updated. This ID is vendor generated and should be unique in each vendor&#39;s content set. | 
 **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| UPDATE request body which needs to be sent with request | 

### Return type

[**UpdateResponse**](UpdateResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

