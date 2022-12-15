# signals.EventsApi

All URIs are relative to *https://api.factset.com/signals/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEventAdaptiveCardById**](EventsApi.md#getEventAdaptiveCardById) | **GET** /events/adaptive-cards/{eventId} | 
[**getEventAdaptiveCards**](EventsApi.md#getEventAdaptiveCards) | **GET** /events/adaptive-cards | 
[**getEventDetailById**](EventsApi.md#getEventDetailById) | **GET** /events/details/{eventId} | 
[**getEventDetails**](EventsApi.md#getEventDetails) | **GET** /events/details | 
[**getEventEntities**](EventsApi.md#getEventEntities) | **GET** /events/entities | 
[**getEventHeadlines**](EventsApi.md#getEventHeadlines) | **GET** /events/headlines | 
[**postEventAdaptiveCards**](EventsApi.md#postEventAdaptiveCards) | **POST** /events/adaptive-cards | 
[**postEventDetails**](EventsApi.md#postEventDetails) | **POST** /events/details | 
[**postEventEntities**](EventsApi.md#postEventEntities) | **POST** /events/entities | 
[**postEventHeadlines**](EventsApi.md#postEventHeadlines) | **POST** /events/headlines | 



## getEventAdaptiveCardById

> EventAdaptiveCard getEventAdaptiveCardById(eventId)



Fetch Microsoft&#39;s Adaptive Cards, which includes headlines and event details data plus hyperlinks to FactSet reports, for a single requested Signal event

### Example

```javascript
const { ApiClient, EventsApi } = require('@factset/sdk-signals');
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


## getEventAdaptiveCards

> EventAdaptiveCards getEventAdaptiveCards(opts)



Fetch Microsoft&#39;s Adaptive Cards, which includes headlines and event details data plus hyperlinks to FactSet reports, based on the filtering criteria

### Example

```javascript
const { ApiClient, EventsApi } = require('@factset/sdk-signals');
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

const apiInstance = new EventsApi();
const opts = {
  'created': {}, // DateTimeInterval | A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted.
  'updated': {}, // DateTimeInterval | A date/time (UTC) interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted.
  'signalIds': dilutionTrigger,freeCashFlow, // String | 
  'ids': FDS-US,AMZN-US, // String | Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used.
  'portfolios': "portfolios_example", // String | Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb
  'themes': "themes_example", // String | Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes.
  'categories': "categories_example", // String | Comma delimited string of category ids. Full list of signal categories can be viewed at /categories.
  'userRelevanceScore': {"gte":0}, // RelevanceScoreRange | A range for filtering signal events based on their relevancy score.
  'sort': -userRelevanceScore,-eventDate, // String | Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order).
  'resolveIdentifiers': true // Boolean | The api will return resolved identifiers in the meta section of the response by default (true). If the parameter is false, the api will not attempt to resolve the identifiers.
};

// Call api endpoint
apiInstance.getEventAdaptiveCards(opts).then(
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
 **created** | [**DateTimeInterval**](.md)| A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. | [optional] 
 **updated** | [**DateTimeInterval**](.md)| A date/time (UTC) interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. | [optional] 
 **signalIds** | **String**|  | [optional] 
 **ids** | **String**| Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. | [optional] 
 **portfolios** | **String**| Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb | [optional] 
 **themes** | **String**| Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. | [optional] 
 **categories** | **String**| Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. | [optional] 
 **userRelevanceScore** | [**RelevanceScoreRange**](.md)| A range for filtering signal events based on their relevancy score. | [optional] 
 **sort** | **String**| Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). | [optional] 
 **resolveIdentifiers** | **Boolean**| The api will return resolved identifiers in the meta section of the response by default (true). If the parameter is false, the api will not attempt to resolve the identifiers. | [optional] 

### Return type

[**EventAdaptiveCards**](EventAdaptiveCards.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEventDetailById

> EventDetail getEventDetailById(eventId)



Fetch Signals event headlines plus all additional event details for a single requested Signal event

### Example

```javascript
const { ApiClient, EventsApi } = require('@factset/sdk-signals');
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


## getEventDetails

> EventDetails getEventDetails(opts)



Fetch Signals event headlines plus all additional event details based on the filtering criteria

### Example

```javascript
const { ApiClient, EventsApi } = require('@factset/sdk-signals');
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

const apiInstance = new EventsApi();
const opts = {
  'created': {}, // DateTimeInterval | A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted.
  'updated': {}, // DateTimeInterval | A date/time (UTC) interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted.
  'signalIds': dilutionTrigger,freeCashFlow, // String | 
  'ids': FDS-US,AMZN-US, // String | Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used.
  'portfolios': "portfolios_example", // String | Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb
  'themes': "themes_example", // String | Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes.
  'categories': "categories_example", // String | Comma delimited string of category ids. Full list of signal categories can be viewed at /categories.
  'userRelevanceScore': {"gte":0}, // RelevanceScoreRange | A range for filtering signal events based on their relevancy score.
  'sort': -userRelevanceScore,-eventDate, // String | Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order).
  'resolveIdentifiers': true // Boolean | The api will return resolved identifiers in the meta section of the response by default (true). If the parameter is false, the api will not attempt to resolve the identifiers.
};

// Call api endpoint
apiInstance.getEventDetails(opts).then(
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
 **created** | [**DateTimeInterval**](.md)| A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. | [optional] 
 **updated** | [**DateTimeInterval**](.md)| A date/time (UTC) interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. | [optional] 
 **signalIds** | **String**|  | [optional] 
 **ids** | **String**| Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. | [optional] 
 **portfolios** | **String**| Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb | [optional] 
 **themes** | **String**| Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. | [optional] 
 **categories** | **String**| Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. | [optional] 
 **userRelevanceScore** | [**RelevanceScoreRange**](.md)| A range for filtering signal events based on their relevancy score. | [optional] 
 **sort** | **String**| Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). | [optional] 
 **resolveIdentifiers** | **Boolean**| The api will return resolved identifiers in the meta section of the response by default (true). If the parameter is false, the api will not attempt to resolve the identifiers. | [optional] 

### Return type

[**EventDetails**](EventDetails.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEventEntities

> EventsEntities getEventEntities(opts)



Fetch FactSet entity IDs for events that match the filtering criteria

### Example

```javascript
const { ApiClient, EventsApi } = require('@factset/sdk-signals');
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

const apiInstance = new EventsApi();
const opts = {
  'created': {}, // DateTimeInterval | A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted.
  'updated': {}, // DateTimeInterval | A date/time (UTC) interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted.
  'signalIds': dilutionTrigger,freeCashFlow, // String | 
  'themes': "themes_example", // String | Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes.
  'categories': "categories_example", // String | Comma delimited string of category ids. Full list of signal categories can be viewed at /categories.
  'userRelevanceScore': {"gte":0} // RelevanceScoreRange | A range for filtering signal events based on their relevancy score.
};

// Call api endpoint
apiInstance.getEventEntities(opts).then(
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
 **created** | [**DateTimeInterval**](.md)| A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. | [optional] 
 **updated** | [**DateTimeInterval**](.md)| A date/time (UTC) interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. | [optional] 
 **signalIds** | **String**|  | [optional] 
 **themes** | **String**| Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. | [optional] 
 **categories** | **String**| Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. | [optional] 
 **userRelevanceScore** | [**RelevanceScoreRange**](.md)| A range for filtering signal events based on their relevancy score. | [optional] 

### Return type

[**EventsEntities**](EventsEntities.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEventHeadlines

> EventHeadlines getEventHeadlines(opts)



Fetch Signals event headlines based on the filtering criteria

### Example

```javascript
const { ApiClient, EventsApi } = require('@factset/sdk-signals');
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

const apiInstance = new EventsApi();
const opts = {
  'created': {}, // DateTimeInterval | A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted.
  'updated': {}, // DateTimeInterval | A date/time (UTC) interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted.
  'signalIds': dilutionTrigger,freeCashFlow, // String | 
  'ids': FDS-US,AMZN-US, // String | Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used.
  'portfolios': "portfolios_example", // String | Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb
  'themes': "themes_example", // String | Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes.
  'categories': "categories_example", // String | Comma delimited string of category ids. Full list of signal categories can be viewed at /categories.
  'userRelevanceScore': {"gte":0}, // RelevanceScoreRange | A range for filtering signal events based on their relevancy score.
  'sort': -userRelevanceScore,-eventDate, // String | Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order).
  'resolveIdentifiers': true // Boolean | The api will return resolved identifiers in the meta section of the response by default (true). If the parameter is false, the api will not attempt to resolve the identifiers.
};

// Call api endpoint
apiInstance.getEventHeadlines(opts).then(
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
 **created** | [**DateTimeInterval**](.md)| A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. | [optional] 
 **updated** | [**DateTimeInterval**](.md)| A date/time (UTC) interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. | [optional] 
 **signalIds** | **String**|  | [optional] 
 **ids** | **String**| Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. | [optional] 
 **portfolios** | **String**| Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb | [optional] 
 **themes** | **String**| Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. | [optional] 
 **categories** | **String**| Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. | [optional] 
 **userRelevanceScore** | [**RelevanceScoreRange**](.md)| A range for filtering signal events based on their relevancy score. | [optional] 
 **sort** | **String**| Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). | [optional] 
 **resolveIdentifiers** | **Boolean**| The api will return resolved identifiers in the meta section of the response by default (true). If the parameter is false, the api will not attempt to resolve the identifiers. | [optional] 

### Return type

[**EventHeadlines**](EventHeadlines.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postEventAdaptiveCards

> EventAdaptiveCards postEventAdaptiveCards(eventRequestBody)



Fetch Microsoft&#39;s Adaptive Cards, which includes headlines and event details data plus hyperlinks to FactSet reports, based on the filtering criteria

### Example

```javascript
const { ApiClient, EventsApi } = require('@factset/sdk-signals');
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

const apiInstance = new EventsApi();
const eventRequestBody = new signals.EventRequestBody(); // EventRequestBody | 

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



Fetch Signals event headlines plus all additional event details for up to 1000 identifiers

### Example

```javascript
const { ApiClient, EventsApi } = require('@factset/sdk-signals');
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

const apiInstance = new EventsApi();
const eventRequestBody = new signals.EventRequestBody(); // EventRequestBody | 

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

```javascript
const { ApiClient, EventsApi } = require('@factset/sdk-signals');
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

const apiInstance = new EventsApi();
const eventsEntitiesPost = new signals.EventsEntitiesPost(); // EventsEntitiesPost | 

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



Fetch Signals event headlines based on the filtering criteria for up to 1000 identifiers

### Example

```javascript
const { ApiClient, EventsApi } = require('@factset/sdk-signals');
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

const apiInstance = new EventsApi();
const eventRequestBody = new signals.EventRequestBody(); // EventRequestBody | 

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

