# issuetracker.IssueApi

All URIs are relative to *https://api.factset.com/issue-tracker/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIssue**](IssueApi.md#getIssue) | **GET** /issues/{id} | Get the matched issue details
[**patchIssue**](IssueApi.md#patchIssue) | **PATCH** /issues/{id} | Update severity and subject of issue or productId and categoryId of issue
[**postIssue**](IssueApi.md#postIssue) | **POST** /issues | Creates a Issue Tracker issue
[**postReply**](IssueApi.md#postReply) | **POST** /issues/{id}/comments | post comment to Issue Tracker issue



## getIssue

> Issue getIssue(id)

Get the matched issue details

This endpoint allows retrieval of client information associated with a specific issue ID. When an issue contains file attachments, the Issue Tracker will return relative paths for these files. You can refer to the sample responses given in the examples and API Overview.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
 **id** | **String**| ID of Issue Tracker issue | 

### Return type

[**Issue**](Issue.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


## patchIssue

> IdResponse patchIssue(id, opts)

Update severity and subject of issue or productId and categoryId of issue

User can update either &#x60;severity&#x60; with &#x60;subject&#x60; or &#x60;productId&#x60; with &#x60;categoryId&#x60;.    **Note:** Users are not allowed to update &#x60;severity&#x60; with &#x60;productId&#x60; or &#x60;subject&#x60; with &#x60;productId&#x60;

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
  'updateIssueRequest': {"data":{"subject":"replace Title of ticket","severity":"Medium"}} // UpdateIssueRequest | 
};

// Call api endpoint
apiInstance.patchIssue(id, opts).then(
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
 **updateIssueRequest** | [**UpdateIssueRequest**](UpdateIssueRequest.md)|  | [optional] 

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, text/plain


## postIssue

> IdResponse postIssue(opts)

Creates a Issue Tracker issue

Creates a new issue in Issue Tracker

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
  'issueRequest': {"data":{"subject":"This is sample subject of issue tracker issue","description":"<p>Here we can provide a complete description of why we are creating issue.</p>","productId":"13273","categoryId":"20589","severity":"Medium"}} // IssueRequest | 
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
- **Accept**: application/json, text/plain


## postReply

> IdResponse postReply(id, opts)

post comment to Issue Tracker issue

Reply to the existing matched issue 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
- **Accept**: application/json, text/plain

