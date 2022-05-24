# factsetpeople.ProfilesApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPeopleProfiles**](ProfilesApi.md#getPeopleProfiles) | **GET** /factset-people/v1/profiles | Return information about the person with the specified entity ID.
[**getPeopleProfilesForList**](ProfilesApi.md#getPeopleProfilesForList) | **POST** /factset-people/v1/profiles | Returns profile information for a large list of people.



## getPeopleProfiles

> PeopleProfilesResponse getPeopleProfiles(ids)

Return information about the person with the specified entity ID.

Returns a summary of basic information about the person referenced by the entityId specified in the URI. 

### Example

```javascript
const { ApiClient, ProfilesApi } = require('@factset/sdk-factsetpeople');
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

const apiInstance = new ProfilesApi();
const ids = ["0DPHLH-E","07MZV9-E"]; // [String] | List of FactSet Person Entity identifier.

// Call api endpoint
apiInstance.getPeopleProfiles(ids).then(
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
 **ids** | [**[String]**](String.md)| List of FactSet Person Entity identifier. | 

### Return type

[**PeopleProfilesResponse**](PeopleProfilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPeopleProfilesForList

> PeopleProfilesResponse getPeopleProfilesForList(peopleProfilesRequest)

Returns profile information for a large list of people.

### Example

```javascript
const { ApiClient, ProfilesApi } = require('@factset/sdk-factsetpeople');
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

const apiInstance = new ProfilesApi();
const peopleProfilesRequest = new factsetpeople.PeopleProfilesRequest(); // PeopleProfilesRequest | 

// Call api endpoint
apiInstance.getPeopleProfilesForList(peopleProfilesRequest).then(
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
 **peopleProfilesRequest** | [**PeopleProfilesRequest**](PeopleProfilesRequest.md)|  | 

### Return type

[**PeopleProfilesResponse**](PeopleProfilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

