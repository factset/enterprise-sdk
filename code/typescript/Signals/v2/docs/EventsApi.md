# signals.EventsApi

All URIs are relative to *https://api.factset.com/signals/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEventAdaptiveCardById**](EventsApi.md#getEventAdaptiveCardById) | **GET** /events/adaptive-cards/{eventId} | 
[**getEventDetailById**](EventsApi.md#getEventDetailById) | **GET** /events/details/{eventId} | 
[**postEventAdaptiveCards**](EventsApi.md#postEventAdaptiveCards) | **POST** /events/adaptive-cards | 
[**postEventDetails**](EventsApi.md#postEventDetails) | **POST** /events/details | 
[**postEventEntities**](EventsApi.md#postEventEntities) | **POST** /events/entities | 
[**postEventHeadlines**](EventsApi.md#postEventHeadlines) | **POST** /events/headlines | 



## getEventAdaptiveCardById

> EventAdaptiveCard getEventAdaptiveCardById(eventId)



Fetch Microsoft&#39;s Adaptive Cards, which includes headlines and event details data plus hyperlinks to FactSet reports, for a single requested Signal event

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**| The UUID of the event to return. | 

### Return type

[**EventAdaptiveCard**](EventAdaptiveCard.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEventDetailById

> EventDetail getEventDetailById(eventId)



Fetch Signals event headlines plus all additional event details for a single requested Signal event

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
apiInstance.getEventDetailById(eventId).then(
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
 **eventId** | **String**| The UUID of the event to return. | 

### Return type

[**EventDetail**](EventDetail.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postEventAdaptiveCards

> EventAdaptiveCards postEventAdaptiveCards(eventRequestBody)



Fetch Microsoft&#39;s Adaptive Cards, which includes headlines and event details data plus hyperlinks to FactSet reports, based on at least one of the following filtering parameters: &#x60;ids&#x60;, &#x60;portfolios&#x60;

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
const eventRequestBody = {"created":{"gt":"2021-01-01T00:00:00Z","gte":"2021-01-01T00:00:00Z","lt":"2021-01-01T00:00:00Z","lte":"2021-01-01T00:00:00Z"},"updated":{"gt":"2021-01-01T00:00:00Z","gte":"2021-01-01T00:00:00Z","lt":"2021-01-01T00:00:00Z","lte":"2021-01-01T00:00:00Z"},"signalIds":"dilutionTrigger,freeCashFlow","ids":"FDS-US,AMZN-US","portfolios":"testPortfolio.ofdb","themes":"testTheme","categories":"testCategory","userRelevanceScore":{"gt":0,"gte":0,"lt":0,"lte":0},"sort":"-userRelevanceScore","resolveIdentifiers":true,"propertyFilter":{"portfolioUniqueId":"abc-xyz-def"}}; // EventRequestBody | 

// Call api endpoint
apiInstance.postEventAdaptiveCards(eventRequestBody).then(
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
 **eventRequestBody** | [**EventRequestBody**](EventRequestBody.md)|  | 

### Return type

[**EventAdaptiveCards**](EventAdaptiveCards.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postEventDetails

> EventDetails postEventDetails(eventRequestBody)



Fetch Signals event headlines plus all additional event details for up to 1000 identifiers and at least one of the following filtering parameters: &#x60;ids&#x60;, &#x60;portfolios&#x60;

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
const eventRequestBody = {"created":{"gt":"2021-01-01T00:00:00Z","gte":"2021-01-01T00:00:00Z","lt":"2021-01-01T00:00:00Z","lte":"2021-01-01T00:00:00Z"},"updated":{"gt":"2021-01-01T00:00:00Z","gte":"2021-01-01T00:00:00Z","lt":"2021-01-01T00:00:00Z","lte":"2021-01-01T00:00:00Z"},"signalIds":"dilutionTrigger,freeCashFlow","ids":"FDS-US,AMZN-US","portfolios":"testPortfolio.ofdb","themes":"testTheme","categories":"testCategory","userRelevanceScore":{"gt":0,"gte":0,"lt":0,"lte":0},"sort":"-userRelevanceScore","resolveIdentifiers":true,"propertyFilter":{"portfolioUniqueId":"abc-xyz-def"}}; // EventRequestBody | 

// Call api endpoint
apiInstance.postEventDetails(eventRequestBody).then(
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
 **eventRequestBody** | [**EventRequestBody**](EventRequestBody.md)|  | 

### Return type

[**EventDetails**](EventDetails.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postEventEntities

> EventsEntities postEventEntities(eventsEntitiesPost)



Fetch FactSet entity IDs for events that match the filtering criteria

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
const eventsEntitiesPost = {"created":{"gt":"2021-01-01T00:00:00Z","gte":"2021-01-01T00:00:00Z","lt":"2021-01-01T00:00:00Z","lte":"2021-01-01T00:00:00Z"},"updated":{"gt":"2021-01-01T00:00:00Z","gte":"2021-01-01T00:00:00Z","lt":"2021-01-01T00:00:00Z","lte":"2021-01-01T00:00:00Z"},"signalIds":"dilutionTrigger,freeCashFlow","themes":"testTheme","categories":"testCategory","userRelevanceScore":{"gt":0,"gte":0,"lt":0,"lte":0}}; // EventsEntitiesPost | 

// Call api endpoint
apiInstance.postEventEntities(eventsEntitiesPost).then(
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
 **eventsEntitiesPost** | [**EventsEntitiesPost**](EventsEntitiesPost.md)|  | 

### Return type

[**EventsEntities**](EventsEntities.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postEventHeadlines

> EventHeadlines postEventHeadlines(eventRequestBody)



Fetch Signals event headlines based on the filtering criteria for up to 1000 identifiers and at least one of the following filtering parameters: &#x60;ids&#x60;, &#x60;portfolios&#x60;

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
const eventRequestBody = {"created":{"gt":"2021-01-01T00:00:00Z","gte":"2021-01-01T00:00:00Z","lt":"2021-01-01T00:00:00Z","lte":"2021-01-01T00:00:00Z"},"updated":{"gt":"2021-01-01T00:00:00Z","gte":"2021-01-01T00:00:00Z","lt":"2021-01-01T00:00:00Z","lte":"2021-01-01T00:00:00Z"},"signalIds":"dilutionTrigger,freeCashFlow","ids":"FDS-US,AMZN-US","portfolios":"testPortfolio.ofdb","themes":"testTheme","categories":"testCategory","userRelevanceScore":{"gt":0,"gte":0,"lt":0,"lte":0},"sort":"-userRelevanceScore","resolveIdentifiers":true,"propertyFilter":{"portfolioUniqueId":"abc-xyz-def"}}; // EventRequestBody | 

// Call api endpoint
apiInstance.postEventHeadlines(eventRequestBody).then(
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
 **eventRequestBody** | [**EventRequestBody**](EventRequestBody.md)|  | 

### Return type

[**EventHeadlines**](EventHeadlines.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

