# factsetconcordance.PeopleMatchApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPeopleMatch**](PeopleMatchApi.md#getPeopleMatch) | **GET** /factset-concordance/v2/people-match | Find potential people matches given a person&#39;s name.People matches can be retrieved using person&#39;s name and other attributes like firstname, middlename and lastname.
[**getPeopleMatchForList**](PeopleMatchApi.md#getPeopleMatchForList) | **POST** /factset-concordance/v2/people-match | Find potential people matches given a person&#39;s name.



## getPeopleMatch

> PeopleMatchesResponse getPeopleMatch(entity, opts)

Find potential people matches given a person&#39;s name.People matches can be retrieved using person&#39;s name and other attributes like firstname, middlename and lastname.

Finds the best people candidates matching the given name. &lt;p&gt;**Max of 1 Name permitted in a single GET request.** Use the POST method for /people-match to fetch up to 25 names. Otherwise, use the \&quot;People Match - Bulk\&quot; workflow to submit larger universes of names to be concorded via a file.&lt;/p&gt;&lt;p&gt; 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PeopleMatchApi } = require('@factset/sdk-factsetconcordance');
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

const apiInstance = new PeopleMatchApi();
const entity = Microsoft; // String | Entity the person is associated with. It is used to filter the candidates before taking a match decision. Can be entity ID or name. The supported entity types match the what is supported via the /company match.
const opts = {
  'personName': Bill Gates, // String | Name of Person to match.
  'salutation': Mr, // String | Title in person's name. This parameter should not be provided when the person name is provided as the input.
  'firstName': Bill, // String | First name of person. This parameter should not be provided when the person name is provided as the input.
  'middleName': Henry, // String | Middle name of person.This parameter should not be provided when the person name is provided as the input.
  'lastName': Gates, // String | Last name of person. This parameter should not be provided when the person name is provided as the input.
  'suffix': III // String | Suffix in person's name. This parameter should not be provided when the person name is provided as the input.
};

// Call api endpoint
apiInstance.getPeopleMatch(entity, opts).then(
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
 **entity** | **String**| Entity the person is associated with. It is used to filter the candidates before taking a match decision. Can be entity ID or name. The supported entity types match the what is supported via the /company match. | 
 **personName** | **String**| Name of Person to match. | [optional] 
 **salutation** | **String**| Title in person&#39;s name. This parameter should not be provided when the person name is provided as the input. | [optional] 
 **firstName** | **String**| First name of person. This parameter should not be provided when the person name is provided as the input. | [optional] 
 **middleName** | **String**| Middle name of person.This parameter should not be provided when the person name is provided as the input. | [optional] 
 **lastName** | **String**| Last name of person. This parameter should not be provided when the person name is provided as the input. | [optional] 
 **suffix** | **String**| Suffix in person&#39;s name. This parameter should not be provided when the person name is provided as the input. | [optional] 

### Return type

[**PeopleMatchesResponse**](PeopleMatchesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8, application/json


## getPeopleMatchForList

> PeopleMatchesResponse getPeopleMatchForList(peopleMatchRequest)

Find potential people matches given a person&#39;s name.

Finds the best candidate people matching the given people names. Additional attributes can be supplied to narrow the search. If a &#x60;universeId&#x60; is provided, any match for an input including a &#x60;clientId&#x60; will be saved to that universe. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PeopleMatchApi } = require('@factset/sdk-factsetconcordance');
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

const apiInstance = new PeopleMatchApi();
const peopleMatchRequest = new factsetconcordance.PeopleMatchRequest(); // PeopleMatchRequest | A request to People match.

// Call api endpoint
apiInstance.getPeopleMatchForList(peopleMatchRequest).then(
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
 **peopleMatchRequest** | [**PeopleMatchRequest**](PeopleMatchRequest.md)| A request to People match. | 

### Return type

[**PeopleMatchesResponse**](PeopleMatchesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8, application/json

