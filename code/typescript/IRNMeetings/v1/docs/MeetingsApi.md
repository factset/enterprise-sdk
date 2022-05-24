# irnmeetings.MeetingsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMeeting**](MeetingsApi.md#createMeeting) | **POST** /v1/meetings | Create a meeting
[**deleteMeeting**](MeetingsApi.md#deleteMeeting) | **DELETE** /v1/meetings/{meetingId} | Delete a Meeting
[**getMeeting**](MeetingsApi.md#getMeeting) | **GET** /v1/meetings/{meetingId} | Get details of a meeting
[**getMeetings**](MeetingsApi.md#getMeetings) | **GET** /v1/meetings | Get all the meetings in the specified date range filtered on the given identifiers
[**updateMeeting**](MeetingsApi.md#updateMeeting) | **PUT** /v1/meetings/{meetingId} | Update meeting



## createMeeting

> NewItemDto createMeeting(opts)

Create a meeting

### Example

```javascript
const { ApiClient, MeetingsApi } = require('@factset/sdk-irnmeetings');
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

const apiInstance = new MeetingsApi();
const opts = {
  'createMeetingDto': new irnmeetings.CreateMeetingDto() // CreateMeetingDto | Note: The organizer property is deprecated in favor of organizerId
};

// Call api endpoint
apiInstance.createMeeting(opts).then(
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
 **createMeetingDto** | [**CreateMeetingDto**](CreateMeetingDto.md)| Note: The organizer property is deprecated in favor of organizerId | [optional] 

### Return type

[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json


## deleteMeeting

> deleteMeeting(meetingId)

Delete a Meeting

### Example

```javascript
const { ApiClient, MeetingsApi } = require('@factset/sdk-irnmeetings');
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

const apiInstance = new MeetingsApi();
const meetingId = "meetingId_example"; // String | 

// Call api endpoint
apiInstance.deleteMeeting(meetingId).then(
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

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getMeeting

> MeetingDto getMeeting(meetingId)

Get details of a meeting

### Example

```javascript
const { ApiClient, MeetingsApi } = require('@factset/sdk-irnmeetings');
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

const apiInstance = new MeetingsApi();
const meetingId = "meetingId_example"; // String | Meeting Id

// Call api endpoint
apiInstance.getMeeting(meetingId).then(
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
 **meetingId** | **String**| Meeting Id | 

### Return type

[**MeetingDto**](MeetingDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getMeetings

> [MeetingSummaryDto] getMeetings(opts)

Get all the meetings in the specified date range filtered on the given identifiers

### Example

```javascript
const { ApiClient, MeetingsApi } = require('@factset/sdk-irnmeetings');
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

const apiInstance = new MeetingsApi();
const opts = {
  'start': "start_example", // String | StartDate
  'end': "end_example", // String | EndDate
  'identifiers': ["null"], // [String] | Set of identifiers to filter on
  'limit': 56, // Number | Limit on the number of meetings retrieved
  'modifiedSince': "modifiedSince_example", // String | Only return meetings which have been modified or created since a particular time
  'xIRNIncludeDeleted': false // Boolean | Includes deleted meetings in results when set to true
};

// Call api endpoint
apiInstance.getMeetings(opts).then(
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
 **start** | **String**| StartDate | [optional] 
 **end** | **String**| EndDate | [optional] 
 **identifiers** | [**[String]**](String.md)| Set of identifiers to filter on | [optional] 
 **limit** | **Number**| Limit on the number of meetings retrieved | [optional] 
 **modifiedSince** | **String**| Only return meetings which have been modified or created since a particular time | [optional] 
 **xIRNIncludeDeleted** | **Boolean**| Includes deleted meetings in results when set to true | [optional] [default to false]

### Return type

[**[MeetingSummaryDto]**](MeetingSummaryDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateMeeting

> updateMeeting(meetingId, opts)

Update meeting

### Example

```javascript
const { ApiClient, MeetingsApi } = require('@factset/sdk-irnmeetings');
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

const apiInstance = new MeetingsApi();
const meetingId = "meetingId_example"; // String | Meeting Id
const opts = {
  'updateMeetingDto': new irnmeetings.UpdateMeetingDto() // UpdateMeetingDto | Meeting details to update. Note: The organizer property is deprecated in favor of organizerId
};

// Call api endpoint
apiInstance.updateMeeting(meetingId, opts).then(
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
 **meetingId** | **String**| Meeting Id | 
 **updateMeetingDto** | [**UpdateMeetingDto**](UpdateMeetingDto.md)| Meeting details to update. Note: The organizer property is deprecated in favor of organizerId | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json

