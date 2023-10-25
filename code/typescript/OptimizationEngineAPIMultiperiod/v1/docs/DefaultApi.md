# optimizationengineapimultiperiod.DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mpoV1OptimizeFPOPost**](DefaultApi.md#mpoV1OptimizeFPOPost) | **POST** /mpo/v1/optimizeFPO | 



## mpoV1OptimizeFPOPost

> OptimizerOutputsMultiPeriodOutput mpoV1OptimizeFPOPost(opts)



### Example

```javascript
const { ApiClient, DefaultApi } = require('@factset/sdk-optimizationengineapimultiperiod');
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

const apiInstance = new DefaultApi();
const opts = {
  'multiPeriodInput': new optimizationengineapimultiperiod.OptimizerInputsMultiPeriodInput() // OptimizerInputsMultiPeriodInput | Multiperiod protobuf input
};

// Call api endpoint
apiInstance.mpoV1OptimizeFPOPost(opts).then(
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
 **multiPeriodInput** | [**OptimizerInputsMultiPeriodInput**](OptimizerInputsMultiPeriodInput.md)| Multiperiod protobuf input | [optional] 

### Return type

[**OptimizerOutputsMultiPeriodOutput**](OptimizerOutputsMultiPeriodOutput.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/x-protobuf
- **Accept**: application/x-protobuf

