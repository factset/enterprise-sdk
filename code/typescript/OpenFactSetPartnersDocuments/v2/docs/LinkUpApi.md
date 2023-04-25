# openfactsetpartnersdocuments.LinkUpApi

All URIs are relative to *https://api.factset.com/bulk-documents/ofm/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLinkUpJobListings**](LinkUpApi.md#getLinkUpJobListings) | **GET** /linkup/job-listings | Returns the  daily files from Open:FactSet Partner - LinkUp. The LinkUp API provides access to job listings dataset that is sourced directly from employer webistes globally delivered daily.



## getLinkUpJobListings

> LinkUpResponse getLinkUpJobListings(opts)

Returns the  daily files from Open:FactSet Partner - LinkUp. The LinkUp API provides access to job listings dataset that is sourced directly from employer webistes globally delivered daily.

Returns the  daily files from Open:FactSet Partner - LinkUp. The LinkUp API provides access to job listings dataset that is sourced directly from employer webistes globally delivered daily. **This API is no longer being sold for new clients.**

### Example

```javascript
const { ApiClient, LinkUpApi } = require('@factset/sdk-openfactsetpartnersdocuments');
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

const apiInstance = new LinkUpApi();
const opts = {
  'sort': "'-startDate'", // String | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used.
  'paginationLimit': 20, // Number | Specifies the maximum number of results to return per result.
  'paginationOffset': 0, // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
  'startDate': 2020-01-01, // Date | The earliest date of the LinkUp file the API should fetching for based on fileTimestamp.
  'endDate': 2021-08-01, // Date | The latest date of the LinkUp file the API should fetching for based on fileTimestamp.
  'type': "'delta'" // String | Used to provide the full job descriptions when value \"full\" is used for this parameter.
};

// Call api endpoint
apiInstance.getLinkUpJobListings(opts).then(
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
 **sort** | **String**| Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. | [optional] [default to &#39;-startDate&#39;]
 **paginationLimit** | **Number**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **startDate** | **Date**| The earliest date of the LinkUp file the API should fetching for based on fileTimestamp. | [optional] 
 **endDate** | **Date**| The latest date of the LinkUp file the API should fetching for based on fileTimestamp. | [optional] 
 **type** | **String**| Used to provide the full job descriptions when value \&quot;full\&quot; is used for this parameter. | [optional] [default to &#39;delta&#39;]

### Return type

[**LinkUpResponse**](LinkUpResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

