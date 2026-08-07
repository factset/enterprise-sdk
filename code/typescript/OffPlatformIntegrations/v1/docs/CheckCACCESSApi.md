# offplatformintegrations.CheckCACCESSApi

All URIs are relative to *https://api.factset.com/services/off-platform-integrations-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkCACCESS**](CheckCACCESSApi.md#checkCACCESS) | **POST** /check-caccess | Check access for a list of encrypted CACCESS codes



## checkCACCESS

> AccessCheckResponse checkCACCESS(accessCheckRequest)

Check access for a list of encrypted CACCESS codes

Accepts an array of up to 25 encrypted CACCESS codes in &#39;data&#39; and returns an array of result objects. On successful decryption of all codes, returns 200 with each result containing the encrypted code and a boolean &#39;hasAccess&#39;. If decryption fails for any code, returns 400 with an &#39;errors&#39; array containing the decryption errors and, if any codes decrypted successfully, a &#39;data&#39; array with those results. Returns 400 with an &#39;errors&#39; envelope for malformed input or if more than 25 codes are submitted, and 401 if the user is not authenticated.  Each CACCESS code must be encrypted using **AES-256-CBC** before being sent. To obtain the encryption key and integration guidance, contact [research-integrations-dev@factset.com](mailto:research-integrations-dev@factset.com).

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CheckCACCESSApi } = require('@factset/sdk-offplatformintegrations');
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

const apiInstance = new CheckCACCESSApi();
const accessCheckRequest = {"data":["/XxVRQQ+WzvlXOoNtF+0j9qmoMRFR0ox/a9qhoPX0YwP"]}; // AccessCheckRequest | 

// Call api endpoint
apiInstance.checkCACCESS(accessCheckRequest).then(
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
 **accessCheckRequest** | [**AccessCheckRequest**](AccessCheckRequest.md)|  | 

### Return type

[**AccessCheckResponse**](AccessCheckResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

