# procuretopayapiscim.UsersApi

All URIs are relative to *https://api.factset.com/scim/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UsersApi.md#createUser) | **POST** /Users | Create a user.
[**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /Users/{id} | Delete a user.
[**getUser**](UsersApi.md#getUser) | **GET** /Users/{id} | Get a user.
[**getUsers**](UsersApi.md#getUsers) | **GET** /Users | Get a list of users.
[**modifyUser**](UsersApi.md#modifyUser) | **PATCH** /Users/{id} | Patch a user.
[**replaceUser**](UsersApi.md#replaceUser) | **PUT** /Users/{id} | Replace a user.



## createUser

> UserResource createUser(userResource)

Create a user.

Create a user resource.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, UsersApi } = require('@factset/sdk-procuretopayapiscim');
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

const apiInstance = new UsersApi();
const userResource = {"schemas":["urn:ietf:params:scim:schemas:core:2.0:User","urn:scim:schemas:extension:FactSet:Core:1.0:User"],"name":{"familyName":"Doe","givenName":"John"},"email":"jdoe@factset.com","urn:scim:schemas:extension:FactSet:Core:1.0:User":{"username":"FIN_WEALTH","location":{"value":"1598276"}}}; // UserResource | User resource.

// Call api endpoint
apiInstance.createUser(userResource).then(
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
 **userResource** | [**UserResource**](UserResource.md)| User resource. | 

### Return type

[**UserResource**](UserResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/scim+json
- **Accept**: application/scim+json, application/json


## deleteUser

> deleteUser(id)

Delete a user.

Delete a specific user resource.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, UsersApi } = require('@factset/sdk-procuretopayapiscim');
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

const apiInstance = new UsersApi();
const id = "id_example"; // String | ID of resource.

// Call api endpoint
apiInstance.deleteUser(id).then(
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
 **id** | **String**| ID of resource. | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/scim+json, application/json


## getUser

> UserResource getUser(id)

Get a user.

Get a specific user resource.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, UsersApi } = require('@factset/sdk-procuretopayapiscim');
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

const apiInstance = new UsersApi();
const id = "id_example"; // String | ID of resource.

// Call api endpoint
apiInstance.getUser(id).then(
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
 **id** | **String**| ID of resource. | 

### Return type

[**UserResource**](UserResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/scim+json, application/json


## getUsers

> UserResourceList getUsers(opts)

Get a list of users.

Get a list of user resources.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, UsersApi } = require('@factset/sdk-procuretopayapiscim');
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

const apiInstance = new UsersApi();
const opts = {
  'filter': "filter_example", // String | Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \"re\" operator for regular expression matching against string attributes. When using the \"re\" operator, do not include slash characters as delimiters (e.g. use \"foo\" instead of \"/foo/\".) Also note the case-sensitivity of the regular expression corresponds to the \"caseExact\" characteristic of the target attribute.
  'sortBy': "sortBy_example", // String | Attribute to be used for sorting resources. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). The attribute name must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) Use the *sortOrder* parameter to specify whether resources should be sorted in ascending or descending order.
  'sortOrder': "sortOrder_example", // String | The order by which resources are to be sorted. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). Valid values are ''ascending'' (the default value) or ''descending''. This parameter may not be used unless the *sortBy* parameter is also specified.
  'startIndex': 56, // Number | Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument.
  'count': 56, // Number | Maximum resource count. The server will not return more resources than this value, although it may return fewer.
  'attributes': "attributes_example", // String | Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter.
  'excludedAttributes': "excludedAttributes_example" // String | Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter.
};

// Call api endpoint
apiInstance.getUsers(opts).then(
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
 **filter** | **String**| Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \&quot;re\&quot; operator for regular expression matching against string attributes. When using the \&quot;re\&quot; operator, do not include slash characters as delimiters (e.g. use \&quot;foo\&quot; instead of \&quot;/foo/\&quot;.) Also note the case-sensitivity of the regular expression corresponds to the \&quot;caseExact\&quot; characteristic of the target attribute. | [optional] 
 **sortBy** | **String**| Attribute to be used for sorting resources. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). The attribute name must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) Use the *sortOrder* parameter to specify whether resources should be sorted in ascending or descending order. | [optional] 
 **sortOrder** | **String**| The order by which resources are to be sorted. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). Valid values are &#39;&#39;ascending&#39;&#39; (the default value) or &#39;&#39;descending&#39;&#39;. This parameter may not be used unless the *sortBy* parameter is also specified. | [optional] 
 **startIndex** | **Number**| Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. | [optional] 
 **count** | **Number**| Maximum resource count. The server will not return more resources than this value, although it may return fewer. | [optional] 
 **attributes** | **String**| Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter. | [optional] 
 **excludedAttributes** | **String**| Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter. | [optional] 

### Return type

[**UserResourceList**](UserResourceList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/scim+json, application/json


## modifyUser

> UserResource modifyUser(id, opts)

Patch a user.

Modify a specific user resource (i.e. add, replace, or remove attributes of a user resource.)

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, UsersApi } = require('@factset/sdk-procuretopayapiscim');
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

const apiInstance = new UsersApi();
const id = "id_example"; // String | ID of resource.
const opts = {
  'patch': {"schemas":["urn:ietf:params:scim:api:messages:2.0:PatchOp"],"Operations":[{"op":"replace","path":"urn:scim:schemas:extension:FactSet:Core:1.0:User:roleName","value":"Wealth Manager"}]} // Patch | 
};

// Call api endpoint
apiInstance.modifyUser(id, opts).then(
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
 **id** | **String**| ID of resource. | 
 **patch** | [**Patch**](Patch.md)|  | [optional] 

### Return type

[**UserResource**](UserResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/scim+json
- **Accept**: application/scim+json, application/json


## replaceUser

> UserResource replaceUser(id, userResource)

Replace a user.

Replace a specific user resource with another provided user resource.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, UsersApi } = require('@factset/sdk-procuretopayapiscim');
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

const apiInstance = new UsersApi();
const id = "id_example"; // String | ID of resource.
const userResource = {"schemas":["urn:ietf:params:scim:schemas:core:2.0:User","urn:scim:schemas:extension:FactSet:Core:1.0:User"],"name":{"familyName":"Doe","givenName":"John"},"email":"jdoe@factset.com","urn:scim:schemas:extension:FactSet:Core:1.0:User":{"username":"FIN_WEALTH","location":{"value":"1598276"}}}; // UserResource | User resource.

// Call api endpoint
apiInstance.replaceUser(id, userResource).then(
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
 **id** | **String**| ID of resource. | 
 **userResource** | [**UserResource**](UserResource.md)| User resource. | 

### Return type

[**UserResource**](UserResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/scim+json
- **Accept**: application/scim+json, application/json

