# formula.TimeSeriesApi

All URIs are relative to *https://api.factset.com/formula-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTimeSeriesDataForList**](TimeSeriesApi.md#getTimeSeriesDataForList) | **POST** /time-series | Retrieve data items (FQL formulas) for a list of identifiers or defined universe.



## getTimeSeriesDataForList

> TimeSeriesResponse getTimeSeriesDataForList(timeSeriesRequest)

Retrieve data items (FQL formulas) for a list of identifiers or defined universe.

The &#x60;/time-series&#x60; endpoint is closely aligned with FactSet&#39;s powerful data retrieval language **FactSet Query Language (FQL)** which is optimized for time-series analysis. FQL can also perform sophisticated statistical, mathematical, logical, and other complex operations on the data.    This endpoint has a unique **TIMESERIES** data object that pairs the requested data with FactSet provided dates. This helps reduce the need for additional data requests and reduces the work required by users.  The &#x60;/time-series&#x60; endpoint supports Long Running asynchronous requests up to **30 minutes** via the &#x60;batch&#x60; parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TimeSeriesApi } = require('@factset/sdk-formula');
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

const apiInstance = new TimeSeriesApi();
const timeSeriesRequest = {"data":{"ids":["IBM"],"formulas":["P_PRICE(0)"]}}; // TimeSeriesRequest | 

// Call api endpoint
apiInstance.getTimeSeriesDataForList(timeSeriesRequest).then(
  data => {

      // data is a responsewrapper: GetTimeSeriesDataForListResponseWrapper
      switch (data.statusCode) {

          case 200:
             // TimeSeriesResponse
             console.log(data.getResponse200());
             break;

          case 202:
             // BatchStatusResponse
             console.log(data.getResponse202());
             break;

      }

  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timeSeriesRequest** | [**TimeSeriesRequest**](TimeSeriesRequest.md)|  | 

### Return type

[**TimeSeriesResponse**](TimeSeriesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

