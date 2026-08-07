# factsetmacroeconomics.AsReportedEconomicsApi

All URIs are relative to *https://api.factset.com/content/economics/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAsReportedEconomics**](AsReportedEconomicsApi.md#getAsReportedEconomics) | **GET** /as-reported-economics | Retrieve as-reported economic time series data



## getAsReportedEconomics

> AsReportedEconomicsResponse getAsReportedEconomics(seriesId, opts)

Retrieve as-reported economic time series data

Returns as-reported economic time series data for a given series ID, with optional frequency conversion and data transformation. Use &#x60;/meta/series&#x60; to discover available series IDs.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, AsReportedEconomicsApi } = require('@factset/sdk-factsetmacroeconomics');
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

const apiInstance = new AsReportedEconomicsApi();
const seriesId = FRBRIFSPPCD90@US; // String | The Series ID identifying the economic series to retrieve. Use the `/meta/series` endpoint to get a list of available series IDs. 
const opts = {
  'startDate': Thu Jan 01 00:00:00 UTC 2026, // Date | Start date for the query range.  - **Default:** If both `startDate` and `endDate` are omitted, the API defaults to the most recent available calendar day 
  'endDate': Wed Jul 01 00:00:00 UTC 2026, // Date | End date for the query range.  - **Default:** If both `startDate` and `endDate` are omitted, the API defaults to the most recent available calendar day 
  'countryCode': US, // String | ISO country code for filtering events by country. Use the `/meta/events?type=countries` endpoint to retrieve available country codes. 
  'frequency': D, // String | Controls the output frequency of the data returned. The supported frequencies are:  - **D**: Daily. - **W**: Weekly. - **M**: Monthly. - **Q**: Quarterly. - **Y**: Yearly.  When `frequency` is not specified: If multiple frequencies are available for the seriesId, data is returned at the highest frequency (e.g., monthly over quarterly). If only one frequency is available, data is returned at that frequency. 
  'paginationLimit': 25, // Number | Maximum number of results to return per page. If not specified, the default page size is applied. 
  'paginationOffset': 0 // Number | Number of results to skip before returning the first result. Used for pagination in combination with `_paginationLimit`. 
};

// Call api endpoint
apiInstance.getAsReportedEconomics(seriesId, opts).then(
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
 **seriesId** | **String**| The Series ID identifying the economic series to retrieve. Use the &#x60;/meta/series&#x60; endpoint to get a list of available series IDs.  | 
 **startDate** | **Date**| Start date for the query range.  - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day  | [optional] 
 **endDate** | **Date**| End date for the query range.  - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day  | [optional] 
 **countryCode** | **String**| ISO country code for filtering events by country. Use the &#x60;/meta/events?type&#x3D;countries&#x60; endpoint to retrieve available country codes.  | [optional] 
 **frequency** | **String**| Controls the output frequency of the data returned. The supported frequencies are:  - **D**: Daily. - **W**: Weekly. - **M**: Monthly. - **Q**: Quarterly. - **Y**: Yearly.  When &#x60;frequency&#x60; is not specified: If multiple frequencies are available for the seriesId, data is returned at the highest frequency (e.g., monthly over quarterly). If only one frequency is available, data is returned at that frequency.  | [optional] 
 **paginationLimit** | **Number**| Maximum number of results to return per page. If not specified, the default page size is applied.  | [optional] [default to 25]
 **paginationOffset** | **Number**| Number of results to skip before returning the first result. Used for pagination in combination with &#x60;_paginationLimit&#x60;.  | [optional] [default to 0]

### Return type

[**AsReportedEconomicsResponse**](AsReportedEconomicsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

