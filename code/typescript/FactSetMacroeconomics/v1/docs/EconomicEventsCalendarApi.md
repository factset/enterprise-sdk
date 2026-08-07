# factsetmacroeconomics.EconomicEventsCalendarApi

All URIs are relative to *https://api.factset.com/content/economics/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEconomicEvents**](EconomicEventsCalendarApi.md#getEconomicEvents) | **GET** /economic-events | Retrieve economic calendar events
[**getEconomicEventsCount**](EconomicEventsCalendarApi.md#getEconomicEventsCount) | **GET** /event-count | Retrieve economic events count



## getEconomicEvents

> EventResponse getEconomicEvents(opts)

Retrieve economic calendar events

Returns economic calendar events for a specified date range, with optional filtering by country, indicator, and FDS code. Use &#x60;/meta/events&#x60; to discover available filter values (indicators, countries, FDS codes).

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, EconomicEventsCalendarApi } = require('@factset/sdk-factsetmacroeconomics');
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

const apiInstance = new EconomicEventsCalendarApi();
const opts = {
  'fdsCode': CPIMOM@US, // String | FDS code to filter events by a specific economic indicator. Use the `/meta/events?type=fds-codes` endpoint to retrieve all available codes.  - **Required:** startDate and endDate parameters must be provided when using this filter 
  'indicator': PRCPI, // String | Economic indicator name for filtering events. Use the `/meta/events?type=indicators` endpoint to retrieve available indicators.  - **Required:** startDate and endDate parameters must be provided when using this filter 
  'countryCode': US, // String | ISO country code for filtering events by country. Use the `/meta/events?type=countries` endpoint to retrieve available country codes. 
  'timeZone': GMT+05:00, // String | Time zone for event dates and times in GMT offset format (e.g., GMT-5, GMT, GMT+9). Use the `/meta/events?type=TIMEZONES` endpoint to retrieve available time zone values. If left blank, the default time zone is GMT. 
  'startDate': Mon Jan 01 00:00:00 UTC 2024, // Date | Start date for the query range.  - **Required:** when `fdsCode` or `indicator` is specified - **Default:** If both `startDate` and `endDate` are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between `startDate` and `endDate` is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error. 
  'endDate': Thu Mar 28 00:00:00 UTC 2024, // Date | End date for the query range.  - **Required:** when `fdsCode` or `indicator` is specified - **Default:** If both `startDate` and `endDate` are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between `startDate` and `endDate` is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error. 
  'fields': ["eventDateTime","actual","consensus"], // [String] | Comma-separated list of fields to include in the `items` array for each event. Common event fields (`requestedFdsCode`, `eventName`, `countryCode`, `indicator`) are always returned. When omitted, all available fields in the items array are returned.  **Available fields (for items array):** | Field | Description | |---|---| | `eventDateTime` | Scheduled release date and time (UTC) | | `period` | Reference period covered by the data | | `actual` | Released actual value | | `prior` | Value from the prior period | | `consensus` | Consensus market estimate | | `surprise` | Difference between actual and consensus | 
  'paginationLimit': 25, // Number | Maximum number of results to return per page. If not specified, the default page size is applied. 
  'paginationOffset': 0 // Number | Number of results to skip before returning the first result. Used for pagination in combination with `_paginationLimit`. 
};

// Call api endpoint
apiInstance.getEconomicEvents(opts).then(
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
 **fdsCode** | **String**| FDS code to filter events by a specific economic indicator. Use the &#x60;/meta/events?type&#x3D;fds-codes&#x60; endpoint to retrieve all available codes.  - **Required:** startDate and endDate parameters must be provided when using this filter  | [optional] 
 **indicator** | **String**| Economic indicator name for filtering events. Use the &#x60;/meta/events?type&#x3D;indicators&#x60; endpoint to retrieve available indicators.  - **Required:** startDate and endDate parameters must be provided when using this filter  | [optional] 
 **countryCode** | **String**| ISO country code for filtering events by country. Use the &#x60;/meta/events?type&#x3D;countries&#x60; endpoint to retrieve available country codes.  | [optional] 
 **timeZone** | **String**| Time zone for event dates and times in GMT offset format (e.g., GMT-5, GMT, GMT+9). Use the &#x60;/meta/events?type&#x3D;TIMEZONES&#x60; endpoint to retrieve available time zone values. If left blank, the default time zone is GMT.  | [optional] [default to &#39;GMT&#39;]
 **startDate** | **Date**| Start date for the query range.  - **Required:** when &#x60;fdsCode&#x60; or &#x60;indicator&#x60; is specified - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between &#x60;startDate&#x60; and &#x60;endDate&#x60; is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  | [optional] 
 **endDate** | **Date**| End date for the query range.  - **Required:** when &#x60;fdsCode&#x60; or &#x60;indicator&#x60; is specified - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between &#x60;startDate&#x60; and &#x60;endDate&#x60; is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  | [optional] 
 **fields** | [**[String]**](String.md)| Comma-separated list of fields to include in the &#x60;items&#x60; array for each event. Common event fields (&#x60;requestedFdsCode&#x60;, &#x60;eventName&#x60;, &#x60;countryCode&#x60;, &#x60;indicator&#x60;) are always returned. When omitted, all available fields in the items array are returned.  **Available fields (for items array):** | Field | Description | |---|---| | &#x60;eventDateTime&#x60; | Scheduled release date and time (UTC) | | &#x60;period&#x60; | Reference period covered by the data | | &#x60;actual&#x60; | Released actual value | | &#x60;prior&#x60; | Value from the prior period | | &#x60;consensus&#x60; | Consensus market estimate | | &#x60;surprise&#x60; | Difference between actual and consensus |  | [optional] 
 **paginationLimit** | **Number**| Maximum number of results to return per page. If not specified, the default page size is applied.  | [optional] [default to 25]
 **paginationOffset** | **Number**| Number of results to skip before returning the first result. Used for pagination in combination with &#x60;_paginationLimit&#x60;.  | [optional] [default to 0]

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEconomicEventsCount

> EventCountResponse getEconomicEventsCount(opts)

Retrieve economic events count

Returns the number of economic events per calendar day for a specified date range. Weekends can be included or excluded via the &#x60;includeWeekends&#x60; parameter.  Note: The response includes only dates with one or more events. Dates with no events are omitted from the response. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, EconomicEventsCalendarApi } = require('@factset/sdk-factsetmacroeconomics');
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

const apiInstance = new EconomicEventsCalendarApi();
const opts = {
  'startDate': Mon Jan 01 00:00:00 UTC 2024, // Date | Start date for the query range.  - **Default:** If both `startDate` and `endDate` are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between `startDate` and `endDate` is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error. 
  'endDate': Fri Mar 01 00:00:00 UTC 2024, // Date | End date for the query range.  - **Default:** If both `startDate` and `endDate` are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between `startDate` and `endDate` is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error. 
  'includeWeekends': true, // Boolean | Returned daily counts include weekends by default. Set this to `false` to exclude weekends.
  'paginationLimit': 25, // Number | Maximum number of results to return per page. If not specified, the default page size is applied. 
  'paginationOffset': 0 // Number | Number of results to skip before returning the first result. Used for pagination in combination with `_paginationLimit`. 
};

// Call api endpoint
apiInstance.getEconomicEventsCount(opts).then(
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
 **startDate** | **Date**| Start date for the query range.  - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between &#x60;startDate&#x60; and &#x60;endDate&#x60; is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  | [optional] 
 **endDate** | **Date**| End date for the query range.  - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day - **Maximum date range limit:** The maximum date range limit between &#x60;startDate&#x60; and &#x60;endDate&#x60; is up to 90 days. Requests with date ranges exceeding 90 days will result in a validation error.  | [optional] 
 **includeWeekends** | **Boolean**| Returned daily counts include weekends by default. Set this to &#x60;false&#x60; to exclude weekends. | [optional] [default to true]
 **paginationLimit** | **Number**| Maximum number of results to return per page. If not specified, the default page size is applied.  | [optional] [default to 25]
 **paginationOffset** | **Number**| Number of results to skip before returning the first result. Used for pagination in combination with &#x60;_paginationLimit&#x60;.  | [optional] [default to 0]

### Return type

[**EventCountResponse**](EventCountResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

