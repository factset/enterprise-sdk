# vermilion.SCIMApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**scimV2GroupsGet**](SCIMApi.md#scimV2GroupsGet) | **GET** /scim/v2/Groups/ | Retrieves a list of VRS role
[**scimV2GroupsGroupIdDelete**](SCIMApi.md#scimV2GroupsGroupIdDelete) | **DELETE** /scim/v2/Groups/{groupId} | Deletes a VRS role
[**scimV2GroupsGroupIdGet**](SCIMApi.md#scimV2GroupsGroupIdGet) | **GET** /scim/v2/Groups/{groupId} | Retrieves a VRS role
[**scimV2GroupsGroupIdPatch**](SCIMApi.md#scimV2GroupsGroupIdPatch) | **PATCH** /scim/v2/Groups/{groupId} | Add or remove a user to/from a group
[**scimV2GroupsGroupIdPut**](SCIMApi.md#scimV2GroupsGroupIdPut) | **PUT** /scim/v2/Groups/{groupId} | Updates a VRS Group
[**scimV2GroupsPost**](SCIMApi.md#scimV2GroupsPost) | **POST** /scim/v2/Groups/ | Creates a role
[**scimV2UsersGet**](SCIMApi.md#scimV2UsersGet) | **GET** /scim/v2/Users/ | Retrieves a list of VRS users
[**scimV2UsersPost**](SCIMApi.md#scimV2UsersPost) | **POST** /scim/v2/Users/ | Creates a user
[**scimV2UsersUserIdDelete**](SCIMApi.md#scimV2UsersUserIdDelete) | **DELETE** /scim/v2/Users/{userId} | Deletes a VRS user
[**scimV2UsersUserIdGet**](SCIMApi.md#scimV2UsersUserIdGet) | **GET** /scim/v2/Users/{userId} | Retrieves a VRS User
[**scimV2UsersUserIdPatch**](SCIMApi.md#scimV2UsersUserIdPatch) | **PATCH** /scim/v2/Users/{userId} | Add or remove VRS user attributes
[**scimV2UsersUserIdPut**](SCIMApi.md#scimV2UsersUserIdPut) | **PUT** /scim/v2/Users/{userId} | Updates a VRS user



## scimV2GroupsGet

> ScimGroupListResponse scimV2GroupsGet(opts)

Retrieves a list of VRS role

Retrieves a VRS roles

### Example

```javascript
const { ApiClient, SCIMApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new SCIMApi();
const opts = {
  'count': 25, // Number | Non-negative maximum number of entries to return
  'startIndex': 1 // Number | The 1-based index of the first query result
};

// Call api endpoint
apiInstance.scimV2GroupsGet(opts).then(
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
 **count** | **Number**| Non-negative maximum number of entries to return | [optional] 
 **startIndex** | **Number**| The 1-based index of the first query result | [optional] 

### Return type

[**ScimGroupListResponse**](ScimGroupListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/scim+json


## scimV2GroupsGroupIdDelete

> scimV2GroupsGroupIdDelete(groupId)

Deletes a VRS role

Deletes a VRS role

### Example

```javascript
const { ApiClient, SCIMApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new SCIMApi();
const groupId = "groupId_example"; // String | The ID of the group

// Call api endpoint
apiInstance.scimV2GroupsGroupIdDelete(groupId).then(
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
 **groupId** | **String**| The ID of the group | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/scim+json


## scimV2GroupsGroupIdGet

> ScimGroup scimV2GroupsGroupIdGet(groupId)

Retrieves a VRS role

Retrieves a VRS role based on the ID

### Example

```javascript
const { ApiClient, SCIMApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new SCIMApi();
const groupId = "groupId_example"; // String | The ID of the role

// Call api endpoint
apiInstance.scimV2GroupsGroupIdGet(groupId).then(
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
 **groupId** | **String**| The ID of the role | 

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/scim+json


## scimV2GroupsGroupIdPatch

> ScimGroup scimV2GroupsGroupIdPatch(groupId, inlineObject2)

Add or remove a user to/from a group

Adds or removes a VRS user to/from a VRS role

### Example

```javascript
const { ApiClient, SCIMApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new SCIMApi();
const groupId = "groupId_example"; // String | The ID of the role
const inlineObject2 = new vermilion.InlineObject2(); // InlineObject2 | 

// Call api endpoint
apiInstance.scimV2GroupsGroupIdPatch(groupId, inlineObject2).then(
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
 **groupId** | **String**| The ID of the role | 
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  | 

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/scim+json
- **Accept**: application/scim+json


## scimV2GroupsGroupIdPut

> ScimGroup scimV2GroupsGroupIdPut(groupId, scimGroup)

Updates a VRS Group

Updates (replaces) a VRS Group with the properties in the JSON

### Example

```javascript
const { ApiClient, SCIMApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new SCIMApi();
const groupId = "groupId_example"; // String | The ID of the group
const scimGroup = new vermilion.ScimGroup(); // ScimGroup | 

// Call api endpoint
apiInstance.scimV2GroupsGroupIdPut(groupId, scimGroup).then(
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
 **groupId** | **String**| The ID of the group | 
 **scimGroup** | [**ScimGroup**](ScimGroup.md)|  | 

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/scim+json
- **Accept**: application/scim+json


## scimV2GroupsPost

> ScimGroup scimV2GroupsPost(scimGroup)

Creates a role

Creates a VRS role

### Example

```javascript
const { ApiClient, SCIMApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new SCIMApi();
const scimGroup = new vermilion.ScimGroup(); // ScimGroup | 

// Call api endpoint
apiInstance.scimV2GroupsPost(scimGroup).then(
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
 **scimGroup** | [**ScimGroup**](ScimGroup.md)|  | 

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/scim+json
- **Accept**: application/scim+json


## scimV2UsersGet

> ScimUserListResponse scimV2UsersGet(opts)

Retrieves a list of VRS users

Retrieves a VRS users

### Example

```javascript
const { ApiClient, SCIMApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new SCIMApi();
const opts = {
  'count': 25, // Number | Non-negative maximum number of entries to return
  'startIndex': 1 // Number | The 1-based index of the first query result
};

// Call api endpoint
apiInstance.scimV2UsersGet(opts).then(
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
 **count** | **Number**| Non-negative maximum number of entries to return | [optional] 
 **startIndex** | **Number**| The 1-based index of the first query result | [optional] 

### Return type

[**ScimUserListResponse**](ScimUserListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/scim+json


## scimV2UsersPost

> CreatedScimUserJSONResponse scimV2UsersPost(createScimUserJSONRequest)

Creates a user

Creates a VRS user

### Example

```javascript
const { ApiClient, SCIMApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new SCIMApi();
const createScimUserJSONRequest = new vermilion.CreateScimUserJSONRequest(); // CreateScimUserJSONRequest | 

// Call api endpoint
apiInstance.scimV2UsersPost(createScimUserJSONRequest).then(
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
 **createScimUserJSONRequest** | [**CreateScimUserJSONRequest**](CreateScimUserJSONRequest.md)|  | 

### Return type

[**CreatedScimUserJSONResponse**](CreatedScimUserJSONResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/scim+json
- **Accept**: application/scim+json


## scimV2UsersUserIdDelete

> scimV2UsersUserIdDelete(userId)

Deletes a VRS user

Deletes a VRS user (this marks them as &#39;Deleted&#39; in the database)

### Example

```javascript
const { ApiClient, SCIMApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new SCIMApi();
const userId = "userId_example"; // String | The ID of the user

// Call api endpoint
apiInstance.scimV2UsersUserIdDelete(userId).then(
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
 **userId** | **String**| The ID of the user | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/scim+json


## scimV2UsersUserIdGet

> ScimUser scimV2UsersUserIdGet(userId)

Retrieves a VRS User

Retrieves a VRS user based on their ID

### Example

```javascript
const { ApiClient, SCIMApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new SCIMApi();
const userId = "userId_example"; // String | The ID of the user

// Call api endpoint
apiInstance.scimV2UsersUserIdGet(userId).then(
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
 **userId** | **String**| The ID of the user | 

### Return type

[**ScimUser**](ScimUser.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/scim+json


## scimV2UsersUserIdPatch

> ScimUser scimV2UsersUserIdPatch(userId, inlineObject1)

Add or remove VRS user attributes

Adds or removes VRS user attributes based on the JSON properties

### Example

```javascript
const { ApiClient, SCIMApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new SCIMApi();
const userId = "userId_example"; // String | The ID of the user
const inlineObject1 = new vermilion.InlineObject1(); // InlineObject1 | 

// Call api endpoint
apiInstance.scimV2UsersUserIdPatch(userId, inlineObject1).then(
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
 **userId** | **String**| The ID of the user | 
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  | 

### Return type

[**ScimUser**](ScimUser.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/scim+json
- **Accept**: application/scim+json


## scimV2UsersUserIdPut

> ScimUser scimV2UsersUserIdPut(userId, scimUser)

Updates a VRS user

Updates (replaces) a VRS user with the properties in the JSON

### Example

```javascript
const { ApiClient, SCIMApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new SCIMApi();
const userId = "userId_example"; // String | The ID of the user
const scimUser = new vermilion.ScimUser(); // ScimUser | 

// Call api endpoint
apiInstance.scimV2UsersUserIdPut(userId, scimUser).then(
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
 **userId** | **String**| The ID of the user | 
 **scimUser** | [**ScimUser**](ScimUser.md)|  | 

### Return type

[**ScimUser**](ScimUser.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/scim+json
- **Accept**: application/scim+json

