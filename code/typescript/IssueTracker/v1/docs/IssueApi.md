# issuetracker.IssueApi

All URIs are relative to *https://api.factset.com/issue-tracker/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIssue**](IssueApi.md#getIssue) | **GET** /issues/{id} | Get the matched issue details
[**postIssue**](IssueApi.md#postIssue) | **POST** /issues | Creates a Issue Tracker issue
[**postReply**](IssueApi.md#postReply) | **POST** /issues/{id}/comments | post comment to Issue Tracker issue



## getIssue

> Issue getIssue(id)

Get the matched issue details

Retrieve the information of the client with the matching issue Id.

### Example

```javascript
const { ApiClient, IssueApi } = require('@factset/sdk-issuetracker');
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

const apiInstance = new IssueApi();
const id = "id_example"; // String |   ID of Issue Tracker issue

// Call api endpoint
apiInstance.getIssue(id).then(
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
 **id** | **String**|   ID of Issue Tracker issue | 

### Return type

[**Issue**](Issue.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postIssue

> IdResponse postIssue(opts)

Creates a Issue Tracker issue

Creates a new issue in Issue Tracker

### Example

```javascript
const { ApiClient, IssueApi } = require('@factset/sdk-issuetracker');
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

const apiInstance = new IssueApi();
const opts = {
  'issueRequest': {"data":{"subject":"This is sample subject of issue tracker issue","description":"<p>Here we can provide a complete description of why we are creating issue.</p>","productId":"13273","categoryId":"20589"}} // IssueRequest | 
};

// Call api endpoint
apiInstance.postIssue(opts).then(
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
 **issueRequest** | [**IssueRequest**](IssueRequest.md)|  | [optional] 

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postReply

> IdResponse postReply(id, opts)

post comment to Issue Tracker issue

Reply to the existing matched issue 

### Example

```javascript
const { ApiClient, IssueApi } = require('@factset/sdk-issuetracker');
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

const apiInstance = new IssueApi();
const id = "id_example"; // String | ID of Issue Tracker issue
const opts = {
  'commentRequest': {"data":{"content":"<p>this is a sample comment</p>"}} // CommentRequest | 
};

// Call api endpoint
apiInstance.postReply(id, opts).then(
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
 **id** | **String**| ID of Issue Tracker issue | 
 **commentRequest** | [**CommentRequest**](CommentRequest.md)|  | [optional] 

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

