# factsetglobalprices.CorporateActionsForCalendarApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCorporateActions**](CorporateActionsForCalendarApi.md#getCorporateActions) | **GET** /factset-global-prices/v1/calendar/corporate-actions | Retrieve Event Calendar information for Corporate Actions
[**getDividends**](CorporateActionsForCalendarApi.md#getDividends) | **GET** /factset-global-prices/v1/calendar/dividends | Retrieve Dividend information
[**getEventCount**](CorporateActionsForCalendarApi.md#getEventCount) | **GET** /factset-global-prices/v1/calendar/event-count | Retrieve daily event count for a given date range
[**getExchanges**](CorporateActionsForCalendarApi.md#getExchanges) | **GET** /factset-global-prices/v1/calendar/meta/exchanges | Returns a list of exchanges for which event/action data is available.
[**getRightsIssues**](CorporateActionsForCalendarApi.md#getRightsIssues) | **GET** /factset-global-prices/v1/calendar/rights-issues | Retrieve Rights Issue information
[**getSpinOffs**](CorporateActionsForCalendarApi.md#getSpinOffs) | **GET** /factset-global-prices/v1/calendar/spin-offs | Retrieve Spin Off information
[**getSplits**](CorporateActionsForCalendarApi.md#getSplits) | **GET** /factset-global-prices/v1/calendar/splits | Retrieve Split information
[**getStockDistributions**](CorporateActionsForCalendarApi.md#getStockDistributions) | **GET** /factset-global-prices/v1/calendar/stock-distributions | Retrieve Stock Distribution information



## getCorporateActions

> CorporateActionsResponseCalendar getCorporateActions(opts)

Retrieve Event Calendar information for Corporate Actions

Gives an overview of all available Corporate Actions over a specified date range. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CorporateActionsForCalendarApi } = require('@factset/sdk-factsetglobalprices');
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

const apiInstance = new CorporateActionsForCalendarApi();
const opts = {
  'ids': ["IBM-US"], // [String] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned.
  'startDate': Mon Dec 31 00:00:00 UTC 2018, // Date | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday.
  'endDate': Tue Dec 31 00:00:00 UTC 2019, // Date | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days.
  'eventCategories': ["null"], // [String] | Select one or more Event Categories from the dropdown:   - **CASH_DIVS:** Includes Dividends(DVC), Dividend with DRP Option(DVCD), Dividend Reinvestment(DRP)   - **STOCK_DIST:** Includes Stock Dividend(DVS), Stock Dividend - Special(DVSS), Bonus(BNS), Bonus - Special(BNSS)   - **SPINOFFS:** Includes Spin Off(SPO)   - **RIGHTS:** Includes Rights Issue(DSR)   - **SPLITS:** Includes Forward Split(FSP), Reverse Split(RSP), Split(SPL), Exchange Of Securities(EXOS)  If omitted, the data is returned for all the available eventCategories. 
  'exchanges': ["NYS","NAS"], // [String] | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values.
  'sort': ["null"], // [String] | Sorts the field in ascending or descending order of `eventDate`.
  'paginationLimit': 50, // Number | Specifies the number of results to return per page. The maximum limit is 500.
  'paginationOffset': 0 // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
};

// Call api endpoint
apiInstance.getCorporateActions(opts).then(
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
 **ids** | [**[String]**](String.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional] 
 **startDate** | **Date**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional] 
 **endDate** | **Date**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional] 
 **eventCategories** | [**[String]**](String.md)| Select one or more Event Categories from the dropdown:   - **CASH_DIVS:** Includes Dividends(DVC), Dividend with DRP Option(DVCD), Dividend Reinvestment(DRP)   - **STOCK_DIST:** Includes Stock Dividend(DVS), Stock Dividend - Special(DVSS), Bonus(BNS), Bonus - Special(BNSS)   - **SPINOFFS:** Includes Spin Off(SPO)   - **RIGHTS:** Includes Rights Issue(DSR)   - **SPLITS:** Includes Forward Split(FSP), Reverse Split(RSP), Split(SPL), Exchange Of Securities(EXOS)  If omitted, the data is returned for all the available eventCategories.  | [optional] 
 **exchanges** | [**[String]**](String.md)| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional] 
 **sort** | [**[String]**](String.md)| Sorts the field in ascending or descending order of &#x60;eventDate&#x60;. | [optional] 
 **paginationLimit** | **Number**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] [default to 50]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

### Return type

[**CorporateActionsResponseCalendar**](CorporateActionsResponseCalendar.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getDividends

> DividendsResponse getDividends(opts)

Retrieve Dividend information

Retrieves detailed dividend information including amounts, relevant dates, and other specifics for Dividends, Dividends with DRP Option, and Dividend Reinvestment events within the specified date range.   To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (&#x60;eventId&#x60; + &#x60;ids&#x60;) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (&#x60;ids&#x60;, &#x60;startDate&#x60;, &#x60;endDate&#x60; and &#x60;exchanges&#x60;) will lead to an AND operation for all the parameters passed. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CorporateActionsForCalendarApi } = require('@factset/sdk-factsetglobalprices');
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

const apiInstance = new CorporateActionsForCalendarApi();
const opts = {
  'eventIds': ["WF7WM3-A"], // [String] | FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event.
  'ids': ["XSLCX-US"], // [String] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned.
  'startDate': Mon Dec 31 00:00:00 UTC 2018, // Date | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday.
  'endDate': Tue Dec 31 00:00:00 UTC 2019, // Date | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days.
  'exchanges': ["NYS","NAS"], // [String] | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values.
  'sort': ["null"], // [String] | Sorts the field in ascending or descending order of `effectiveDate`.
  'paginationLimit': 50, // Number | Specifies the number of results to return per page. The maximum limit is 500.
  'paginationOffset': 0 // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
};

// Call api endpoint
apiInstance.getDividends(opts).then(
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
 **eventIds** | [**[String]**](String.md)| FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. | [optional] 
 **ids** | [**[String]**](String.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional] 
 **startDate** | **Date**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional] 
 **endDate** | **Date**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional] 
 **exchanges** | [**[String]**](String.md)| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional] 
 **sort** | [**[String]**](String.md)| Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. | [optional] 
 **paginationLimit** | **Number**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] [default to 50]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

### Return type

[**DividendsResponse**](DividendsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEventCount

> EventCountResponse getEventCount(opts)

Retrieve daily event count for a given date range

Returns the overall count of various events for each day within the specified date range. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CorporateActionsForCalendarApi } = require('@factset/sdk-factsetglobalprices');
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

const apiInstance = new CorporateActionsForCalendarApi();
const opts = {
  'ids': ["IBM-US"], // [String] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned.
  'startDate': Mon Dec 31 00:00:00 UTC 2018, // Date | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday.
  'endDate': Tue Dec 31 00:00:00 UTC 2019, // Date | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days.
  'exchanges': ["NYS","NAS"], // [String] | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values.
  'sort': ["null"] // [String] | Sorts the field in ascending or descending order of `eventDate`.
};

// Call api endpoint
apiInstance.getEventCount(opts).then(
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
 **ids** | [**[String]**](String.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional] 
 **startDate** | **Date**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional] 
 **endDate** | **Date**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional] 
 **exchanges** | [**[String]**](String.md)| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional] 
 **sort** | [**[String]**](String.md)| Sorts the field in ascending or descending order of &#x60;eventDate&#x60;. | [optional] 

### Return type

[**EventCountResponse**](EventCountResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getExchanges

> ExchangesResponse getExchanges()

Returns a list of exchanges for which event/action data is available.

Returns a list of available values for the exchanges parameter. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CorporateActionsForCalendarApi } = require('@factset/sdk-factsetglobalprices');
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

const apiInstance = new CorporateActionsForCalendarApi();

// Call api endpoint
apiInstance.getExchanges().then(
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

[**ExchangesResponse**](ExchangesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getRightsIssues

> RightsIssuesResponse getRightsIssues(opts)

Retrieve Rights Issue information

Retrieves the prices, relevant dates, and other specifics over a specified date range for Rights Issue events.  To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (&#x60;eventId&#x60; + &#x60;ids&#x60;) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (&#x60;ids&#x60;, &#x60;startDate&#x60;, &#x60;endDate&#x60; and &#x60;exchanges&#x60;) will lead to an AND operation for all the parameters passed. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CorporateActionsForCalendarApi } = require('@factset/sdk-factsetglobalprices');
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

const apiInstance = new CorporateActionsForCalendarApi();
const opts = {
  'eventIds': ["JZ6938-A"], // [String] | FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event.
  'ids': ["XOMA-US"], // [String] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned.
  'startDate': Mon Dec 31 00:00:00 UTC 2018, // Date | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday.
  'endDate': Tue Dec 31 00:00:00 UTC 2019, // Date | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days.
  'exchanges': ["NYS","NAS"], // [String] | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values.
  'sort': ["null"], // [String] | Sorts the field in ascending or descending order of `effectiveDate`.
  'paginationLimit': 50, // Number | Specifies the number of results to return per page. The maximum limit is 500.
  'paginationOffset': 0 // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
};

// Call api endpoint
apiInstance.getRightsIssues(opts).then(
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
 **eventIds** | [**[String]**](String.md)| FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. | [optional] 
 **ids** | [**[String]**](String.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional] 
 **startDate** | **Date**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional] 
 **endDate** | **Date**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional] 
 **exchanges** | [**[String]**](String.md)| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional] 
 **sort** | [**[String]**](String.md)| Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. | [optional] 
 **paginationLimit** | **Number**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] [default to 50]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

### Return type

[**RightsIssuesResponse**](RightsIssuesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSpinOffs

> SpinOffsResponse getSpinOffs(opts)

Retrieve Spin Off information

Retrieves the price adjustment factors, dates, and other specifics over a specified date range for Spin Off events.  To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (&#x60;eventId&#x60; + &#x60;ids&#x60;) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (&#x60;ids&#x60;, &#x60;startDate&#x60;, &#x60;endDate&#x60; and &#x60;exchanges&#x60;) will lead to an AND operation for all the parameters passed. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CorporateActionsForCalendarApi } = require('@factset/sdk-factsetglobalprices');
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

const apiInstance = new CorporateActionsForCalendarApi();
const opts = {
  'eventIds': ["DB9782-A"], // [String] | FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event.
  'ids': ["STNG-US"], // [String] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned.
  'startDate': Mon Dec 31 00:00:00 UTC 2018, // Date | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday.
  'endDate': Tue Dec 31 00:00:00 UTC 2019, // Date | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days.
  'exchanges': ["NYS","NAS"], // [String] | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values.
  'sort': ["null"], // [String] | Sorts the field in ascending or descending order of `effectiveDate`.
  'paginationLimit': 50, // Number | Specifies the number of results to return per page. The maximum limit is 500.
  'paginationOffset': 0 // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
};

// Call api endpoint
apiInstance.getSpinOffs(opts).then(
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
 **eventIds** | [**[String]**](String.md)| FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. | [optional] 
 **ids** | [**[String]**](String.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional] 
 **startDate** | **Date**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional] 
 **endDate** | **Date**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional] 
 **exchanges** | [**[String]**](String.md)| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional] 
 **sort** | [**[String]**](String.md)| Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. | [optional] 
 **paginationLimit** | **Number**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] [default to 50]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

### Return type

[**SpinOffsResponse**](SpinOffsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSplits

> SplitsResponseCalendar getSplits(opts)

Retrieve Split information

Retrieves the split factors, dates, and other specifics over a specified date range for Forward Split,  Reverse Split, Split and Exchange of Securities event types.  To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (&#x60;eventId&#x60; + &#x60;ids&#x60;) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (&#x60;ids&#x60;, &#x60;startDate&#x60;, &#x60;endDate&#x60; and &#x60;exchanges&#x60;) will lead to an AND operation for all the parameters passed. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CorporateActionsForCalendarApi } = require('@factset/sdk-factsetglobalprices');
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

const apiInstance = new CorporateActionsForCalendarApi();
const opts = {
  'eventIds': ["B5QRB4-A"], // [String] | FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event.
  'ids': ["MTVA-US"], // [String] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned.
  'startDate': Mon Dec 31 00:00:00 UTC 2018, // Date | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday.
  'endDate': Tue Dec 31 00:00:00 UTC 2019, // Date | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days.
  'exchanges': ["NYS","NAS"], // [String] | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values.
  'sort': ["null"], // [String] | Sorts the field in ascending or descending order of `effectiveDate`.
  'paginationLimit': 50, // Number | Specifies the number of results to return per page. The maximum limit is 500.
  'paginationOffset': 0 // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
};

// Call api endpoint
apiInstance.getSplits(opts).then(
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
 **eventIds** | [**[String]**](String.md)| FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. | [optional] 
 **ids** | [**[String]**](String.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional] 
 **startDate** | **Date**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional] 
 **endDate** | **Date**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional] 
 **exchanges** | [**[String]**](String.md)| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional] 
 **sort** | [**[String]**](String.md)| Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. | [optional] 
 **paginationLimit** | **Number**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] [default to 50]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

### Return type

[**SplitsResponseCalendar**](SplitsResponseCalendar.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStockDistributions

> StockDistributionsResponseCalendar getStockDistributions(opts)

Retrieve Stock Distribution information

Retrieves detailed stock distribution information including price adjustment factors, relevant dates, and other  specifics for Stock Dividends, Stock Dividends(Special), Bonus Issues, and Bonus Issues(Special) events within  the specified date range.  To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (&#x60;eventId&#x60; + &#x60;ids&#x60;) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (&#x60;ids&#x60;, &#x60;startDate&#x60;, &#x60;endDate&#x60; and &#x60;exchanges&#x60;) will lead to an AND operation for all the parameters passed. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CorporateActionsForCalendarApi } = require('@factset/sdk-factsetglobalprices');
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

const apiInstance = new CorporateActionsForCalendarApi();
const opts = {
  'eventIds': ["WGLQ32-A"], // [String] | FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event.
  'ids': ["FGBI-US"], // [String] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned.
  'startDate': Mon Dec 31 00:00:00 UTC 2018, // Date | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday.
  'endDate': Tue Dec 31 00:00:00 UTC 2019, // Date | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days.
  'exchanges': ["NYS","NAS"], // [String] | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values.
  'sort': ["null"], // [String] | Sorts the field in ascending or descending order of `effectiveDate`.
  'paginationLimit': 50, // Number | Specifies the number of results to return per page. The maximum limit is 500.
  'paginationOffset': 0 // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
};

// Call api endpoint
apiInstance.getStockDistributions(opts).then(
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
 **eventIds** | [**[String]**](String.md)| FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. | [optional] 
 **ids** | [**[String]**](String.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional] 
 **startDate** | **Date**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional] 
 **endDate** | **Date**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional] 
 **exchanges** | [**[String]**](String.md)| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional] 
 **sort** | [**[String]**](String.md)| Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. | [optional] 
 **paginationLimit** | **Number**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] [default to 50]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

### Return type

[**StockDistributionsResponseCalendar**](StockDistributionsResponseCalendar.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

