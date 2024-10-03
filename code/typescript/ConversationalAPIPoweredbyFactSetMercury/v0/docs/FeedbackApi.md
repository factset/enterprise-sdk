# conversationalapipoweredbyfactsetmercury.FeedbackApi

All URIs are relative to *https://api.factset.com/conversational/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendFeedback**](FeedbackApi.md#sendFeedback) | **POST** /feedback | Send feedback on the response to a query.



## sendFeedback

> sendFeedback(feedbackRequest)

Send feedback on the response to a query.

Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FeedbackApi } = require('@factset/sdk-conversationalapipoweredbyfactsetmercury');
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

const apiInstance = new FeedbackApi();
const feedbackRequest = new conversationalapipoweredbyfactsetmercury.FeedbackRequest(); // FeedbackRequest | ID represents the response ID received from the `/result` endpoint. Send this along with a boolean representing whether the response was helpful or not.  If you would like to provide additional natural language feedback, you can also include a string with your comments. Feedback will be accepted for 24 hours after the initial response.  **Note:** Feedback is optional, but we appreciate any input you can provide. 

// Call api endpoint
apiInstance.sendFeedback(feedbackRequest).then(
  () => {
    console.log('API called successfully.');
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedbackRequest** | [**FeedbackRequest**](FeedbackRequest.md)| ID represents the response ID received from the &#x60;/result&#x60; endpoint. Send this along with a boolean representing whether the response was helpful or not.  If you would like to provide additional natural language feedback, you can also include a string with your comments. Feedback will be accepted for 24 hours after the initial response.  **Note:** Feedback is optional, but we appreciate any input you can provide.  | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, text/plain

