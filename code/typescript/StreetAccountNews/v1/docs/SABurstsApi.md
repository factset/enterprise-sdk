# streetaccountnews.SABurstsApi

All URIs are relative to *https://api.factset.com/streetaccount/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLatestBurstFile**](SABurstsApi.md#getLatestBurstFile) | **GET** /sa-bursts/latest-file | Retrieve the latest burst file metadata and download URL



## getLatestBurstFile

> BurstFileResponse getLatestBurstFile()

Retrieve the latest burst file metadata and download URL

Returns JSON containing the timestamp and a download URL for the most recent StreetAccount burst ZIP file. Use the &#x60;downloadUrl&#x60; in the response to download the file.  **Response fields**  - **&#x60;burstDateTime&#x60;** — Timestamp of the latest burst file in ISO 8601 UTC format (YYYY-MM-DDTHH:mm:ssZ).  - **&#x60;downloadUrl&#x60;** — Opaque URL to download the burst file. Issue   a &#x60;GET&#x60; request to this URL to receive an HTTP 302 redirect to the file.   The URL contains a short-lived token unique to this burst and   is valid for **5 minutes**. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SABurstsApi } = require('@factset/sdk-streetaccountnews');
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

const apiInstance = new SABurstsApi();

// Call api endpoint
apiInstance.getLatestBurstFile().then(
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

[**BurstFileResponse**](BurstFileResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

