# eventcalendar.CompanyApi

All URIs are relative to *https://api.factset.com/event-calendar/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompanyEvent**](CompanyApi.md#getCompanyEvent) | **POST** /company/event/list | Retrieve Company Event data



## getCompanyEvent

> CompanyEventResponse getCompanyEvent(companyEventRequest)

Retrieve Company Event data

This endpoint returns all company events with filters from the request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CompanyApi } = require('@factset/sdk-eventcalendar');
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

const apiInstance = new CompanyApi();
const companyEventRequest = new eventcalendar.CompanyEventRequest(); // CompanyEventRequest | Company Event request body

// Call api endpoint
apiInstance.getCompanyEvent(companyEventRequest).then(
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
 **companyEventRequest** | [**CompanyEventRequest**](CompanyEventRequest.md)| Company Event request body | 

### Return type

[**CompanyEventResponse**](CompanyEventResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

