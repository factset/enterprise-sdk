# factsetfundamentals.FactSetFundamentalsApi

All URIs are relative to *https://api.factset.com/content/factset-fundamentals/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFdsFundamentalsForList**](FactSetFundamentalsApi.md#getFdsFundamentalsForList) | **POST** /fundamentals | Returns Company Fundamental Data.



## getFdsFundamentalsForList

> FundamentalsResponse getFdsFundamentalsForList(fundamentalsRequest)

Returns Company Fundamental Data.

Retrieves FactSet Fundamental standardized data for specified securities. Use the &#x60;&#x60;&#x60;/metrics&#x60;&#x60;&#x60; endpoint to retrieve a full list of valid metrics or data items.   The &#x60;&#x60;&#x60;/fundamentals&#x60;&#x60;&#x60; endpoint currently supports Long Running asynchronous requests up to **20 minutes** via batch parameter. Id limit is set to 5000 ids per request when using batch capability and 250 ids per request without batching (1 metric per ID, for 1 day in both the cases). This feature is available for all users. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FactSetFundamentalsApi } = require('@factset/sdk-factsetfundamentals');
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

const apiInstance = new FactSetFundamentalsApi();
const fundamentalsRequest = new factsetfundamentals.FundamentalsRequest(); // FundamentalsRequest | Request object for requesting fundamentals data

// Call api endpoint
apiInstance.getFdsFundamentalsForList(fundamentalsRequest).then(
  data => {

      // data is a responsewrapper: GetFdsFundamentalsForListResponseWrapper
      switch (data.statusCode) {

          case 200:
             // FundamentalsResponse
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
 **fundamentalsRequest** | [**FundamentalsRequest**](FundamentalsRequest.md)| Request object for requesting fundamentals data | 

### Return type

[**FundamentalsResponse**](FundamentalsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

