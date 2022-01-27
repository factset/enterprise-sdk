# irnmeetings.CommentsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createComment**](CommentsApi.md#createComment) | **POST** /v1/meetings/{meetingId}/comments | Create a comment to a Meeting
[**createCommentAttachment**](CommentsApi.md#createCommentAttachment) | **POST** /v1/meetings/{meetingId}/comments/{commentId}/attachments | Create a comment attachment to a Meeting
[**deleteComment**](CommentsApi.md#deleteComment) | **DELETE** /v1/meetings/{meetingId}/comments/{commentId} | Delete a Comment from a Meeting
[**downloadCommentAttachmentForComment**](CommentsApi.md#downloadCommentAttachmentForComment) | **GET** /v1/meetings/{meetingId}/comments/{commentId}/attachments/{attachmentId}/download | Download single attachment detail of a comment belonging to a meeting
[**getComment**](CommentsApi.md#getComment) | **GET** /v1/meetings/{meetingId}/comments/{commentId} | Get details of a comment belonging to a meeting
[**getCommentAttachments**](CommentsApi.md#getCommentAttachments) | **GET** /v1/meetings/{meetingId}/comments/{commentId}/attachments | Get attachments summary of a comment belonging to a meeting
[**getComments**](CommentsApi.md#getComments) | **GET** /v1/meetings/{meetingId}/comments | Get all comments for a meeting
[**patchComment**](CommentsApi.md#patchComment) | **PATCH** /v1/meetings/{meetingId}/comments/{commentId} | Edit a comment for a meeting



## createComment

> NewItemDto createComment(meetingId, opts)

Create a comment to a Meeting

### Example

```javascript
const { ApiClient, CommentsApi } = require('@factset/sdk-irnmeetings');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new CommentsApi();
const meetingId = "meetingId_example"; // String | 
const opts = {
  'createCommentDto': new irnmeetings.CreateCommentDto() // CreateCommentDto | 
};

// Call api endpoint
apiInstance.createComment(meetingId, opts).then(
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
 **meetingId** | **String**|  | 
 **createCommentDto** | [**CreateCommentDto**](CreateCommentDto.md)|  | [optional] 

### Return type

[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json


## createCommentAttachment

> NewItemDto createCommentAttachment(meetingId, commentId, file)

Create a comment attachment to a Meeting

### Example

```javascript
const { ApiClient, CommentsApi } = require('@factset/sdk-irnmeetings');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new CommentsApi();
const meetingId = "meetingId_example"; // String | 
const commentId = "commentId_example"; // String | 
const file = "/path/to/file"; // File | 

// Call api endpoint
apiInstance.createCommentAttachment(meetingId, commentId, file).then(
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
 **meetingId** | **String**|  | 
 **commentId** | **String**|  | 
 **file** | **File**|  | 

### Return type

[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## deleteComment

> deleteComment(meetingId, commentId)

Delete a Comment from a Meeting

### Example

```javascript
const { ApiClient, CommentsApi } = require('@factset/sdk-irnmeetings');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new CommentsApi();
const meetingId = "meetingId_example"; // String | 
const commentId = "commentId_example"; // String | 

// Call api endpoint
apiInstance.deleteComment(meetingId, commentId).then(
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
 **meetingId** | **String**|  | 
 **commentId** | **String**|  | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## downloadCommentAttachmentForComment

> downloadCommentAttachmentForComment(meetingId, commentId, attachmentId)

Download single attachment detail of a comment belonging to a meeting

### Example

```javascript
const { ApiClient, CommentsApi } = require('@factset/sdk-irnmeetings');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new CommentsApi();
const meetingId = "meetingId_example"; // String | 
const commentId = "commentId_example"; // String | 
const attachmentId = "attachmentId_example"; // String | 

// Call api endpoint
apiInstance.downloadCommentAttachmentForComment(meetingId, commentId, attachmentId).then(
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
 **meetingId** | **String**|  | 
 **commentId** | **String**|  | 
 **attachmentId** | **String**|  | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getComment

> CommentDto getComment(meetingId, commentId)

Get details of a comment belonging to a meeting

### Example

```javascript
const { ApiClient, CommentsApi } = require('@factset/sdk-irnmeetings');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new CommentsApi();
const meetingId = "meetingId_example"; // String | 
const commentId = "commentId_example"; // String | 

// Call api endpoint
apiInstance.getComment(meetingId, commentId).then(
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
 **meetingId** | **String**|  | 
 **commentId** | **String**|  | 

### Return type

[**CommentDto**](CommentDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCommentAttachments

> [AttachmentSummaryDto] getCommentAttachments(meetingId, commentId)

Get attachments summary of a comment belonging to a meeting

### Example

```javascript
const { ApiClient, CommentsApi } = require('@factset/sdk-irnmeetings');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new CommentsApi();
const meetingId = "meetingId_example"; // String | 
const commentId = "commentId_example"; // String | 

// Call api endpoint
apiInstance.getCommentAttachments(meetingId, commentId).then(
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
 **meetingId** | **String**|  | 
 **commentId** | **String**|  | 

### Return type

[**[AttachmentSummaryDto]**](AttachmentSummaryDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getComments

> [CommentSummaryDto] getComments(meetingId)

Get all comments for a meeting

### Example

```javascript
const { ApiClient, CommentsApi } = require('@factset/sdk-irnmeetings');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new CommentsApi();
const meetingId = "meetingId_example"; // String | 

// Call api endpoint
apiInstance.getComments(meetingId).then(
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
 **meetingId** | **String**|  | 

### Return type

[**[CommentSummaryDto]**](CommentSummaryDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## patchComment

> patchComment(meetingId, commentId, opts)

Edit a comment for a meeting

### Example

```javascript
const { ApiClient, CommentsApi } = require('@factset/sdk-irnmeetings');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new CommentsApi();
const meetingId = "meetingId_example"; // String | 
const commentId = "commentId_example"; // String | 
const opts = {
  'operation': [new irnmeetings.Operation()] // [Operation] | 
};

// Call api endpoint
apiInstance.patchComment(meetingId, commentId, opts).then(
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
 **meetingId** | **String**|  | 
 **commentId** | **String**|  | 
 **operation** | [**[Operation]**](Operation.md)|  | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json

