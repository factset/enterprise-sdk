# factsetmacroeconomics.ReferenceDataApi

All URIs are relative to *https://api.factset.com/content/economics/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEconomicEventReferenceData**](ReferenceDataApi.md#getEconomicEventReferenceData) | **GET** /meta/events | Retrieve reference data for events
[**getFdsCodeMapping**](ReferenceDataApi.md#getFdsCodeMapping) | **GET** /meta/series | Retrieve reference data for series



## getEconomicEventReferenceData

> MetaEventsResponse getEconomicEventReferenceData(type)

Retrieve reference data for events

Returns reference values for filtering and discovery. Use this endpoint to discover available indicators, countries, and FDS codes.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ReferenceDataApi } = require('@factset/sdk-factsetmacroeconomics');
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

const apiInstance = new ReferenceDataApi();
const type = INDICATORS; // String | Specifies the type of reference data to return. The supported values are:  - `INDICATORS`: Returns available economic indicator codes for use with the `indicator` filter. - `COUNTRIES`: Returns supported country codes for use with the `countryCode` filter. - `FDS_CODES`: Returns available FDS codes. - `TIMEZONES`: Returns supported timezone values for use with the `timeZone` filter. 

// Call api endpoint
apiInstance.getEconomicEventReferenceData(type).then(
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
 **type** | **String**| Specifies the type of reference data to return. The supported values are:  - &#x60;INDICATORS&#x60;: Returns available economic indicator codes for use with the &#x60;indicator&#x60; filter. - &#x60;COUNTRIES&#x60;: Returns supported country codes for use with the &#x60;countryCode&#x60; filter. - &#x60;FDS_CODES&#x60;: Returns available FDS codes. - &#x60;TIMEZONES&#x60;: Returns supported timezone values for use with the &#x60;timeZone&#x60; filter.  | 

### Return type

[**MetaEventsResponse**](MetaEventsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFdsCodeMapping

> MetaSeriesResponse getFdsCodeMapping(opts)

Retrieve reference data for series

Returns series metadata with FDS code mappings. Use this endpoint to discover available series, categories, and FDS code associations.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ReferenceDataApi } = require('@factset/sdk-factsetmacroeconomics');
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

const apiInstance = new ReferenceDataApi();
const opts = {
  'searchText': GDP, // String | Text to search for within series names. Restricts results to only series that match the provided search text.
  'category': ["ECONOMICS"], // [String] | Filter series by major category. The supported categories are:  - `ECONOMICS`: Economic indicators and metrics. - `INTEREST_RATES`: Interest rate data and related metrics.  Multiple categories can be provided as comma-separated values. 
  'countryCode': US, // String | ISO country code for filtering events by country. Use the `/meta/events?type=countries` endpoint to retrieve available country codes. 
  'paginationLimit': 25, // Number | Maximum number of results to return per page. If not specified, the default page size is applied. 
  'paginationOffset': 0 // Number | Number of results to skip before returning the first result. Used for pagination in combination with `_paginationLimit`. 
};

// Call api endpoint
apiInstance.getFdsCodeMapping(opts).then(
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
 **searchText** | **String**| Text to search for within series names. Restricts results to only series that match the provided search text. | [optional] 
 **category** | [**[String]**](String.md)| Filter series by major category. The supported categories are:  - &#x60;ECONOMICS&#x60;: Economic indicators and metrics. - &#x60;INTEREST_RATES&#x60;: Interest rate data and related metrics.  Multiple categories can be provided as comma-separated values.  | [optional] 
 **countryCode** | **String**| ISO country code for filtering events by country. Use the &#x60;/meta/events?type&#x3D;countries&#x60; endpoint to retrieve available country codes.  | [optional] 
 **paginationLimit** | **Number**| Maximum number of results to return per page. If not specified, the default page size is applied.  | [optional] [default to 25]
 **paginationOffset** | **Number**| Number of results to skip before returning the first result. Used for pagination in combination with &#x60;_paginationLimit&#x60;.  | [optional] [default to 0]

### Return type

[**MetaSeriesResponse**](MetaSeriesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

