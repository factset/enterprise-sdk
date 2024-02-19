# contentfeedsdatadictionary.NavigatorApi

All URIs are relative to *https://api.factset.com/data-dictionary*

Method | HTTP request | Description
------------- | ------------- | -------------
[**navigatorBasicSearchPost**](NavigatorApi.md#navigatorBasicSearchPost) | **POST** /navigator/basic_search | Returns the data items (along with the products they belong to) that contain at least one of the search terms as a substring of either their name or description.
[**navigatorDataItemsProductIdGet**](NavigatorApi.md#navigatorDataItemsProductIdGet) | **GET** /navigator/data_items/{Product_id} | Get the list of data items associated with a product for Navigator.
[**navigatorProductsGet**](NavigatorApi.md#navigatorProductsGet) | **GET** /navigator/products | Get the list of products for Navigator.
[**navigatorSourcesDataItemIdGet**](NavigatorApi.md#navigatorSourcesDataItemIdGet) | **GET** /navigator/sources/{DataItem_id} | Get a list of sources where the specified data item can be found, for each delivery method, filtered to the appearances of the given data item within the specified product.
[**navigatorSourcesGet**](NavigatorApi.md#navigatorSourcesGet) | **GET** /navigator/sources | Get a list of sources by delivery method for the given product_id
[**navigatorTableFieldsTableIdGet**](NavigatorApi.md#navigatorTableFieldsTableIdGet) | **GET** /navigator/table_fields/{Table_id} | Get the list of fields associated with a table for Navigator, and the code information for the specified data item, if applicable.



## navigatorBasicSearchPost

> BasicSearchResponse navigatorBasicSearchPost(basicSearchRequest)

Returns the data items (along with the products they belong to) that contain at least one of the search terms as a substring of either their name or description.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NavigatorApi } = require('@factset/sdk-contentfeedsdatadictionary');
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

const apiInstance = new NavigatorApi();
const basicSearchRequest = new contentfeedsdatadictionary.BasicSearchRequest(); // BasicSearchRequest | A list of search terms (each term must be at least two characters).

// Call api endpoint
apiInstance.navigatorBasicSearchPost(basicSearchRequest).then(
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
 **basicSearchRequest** | [**BasicSearchRequest**](BasicSearchRequest.md)| A list of search terms (each term must be at least two characters). | 

### Return type

[**BasicSearchResponse**](BasicSearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## navigatorDataItemsProductIdGet

> [DataItem] navigatorDataItemsProductIdGet(productId)

Get the list of data items associated with a product for Navigator.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NavigatorApi } = require('@factset/sdk-contentfeedsdatadictionary');
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

const apiInstance = new NavigatorApi();
const productId = "productId_example"; // String | The id for the Product to fetch the list of data items for.

// Call api endpoint
apiInstance.navigatorDataItemsProductIdGet(productId).then(
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
 **productId** | **String**| The id for the Product to fetch the list of data items for. | 

### Return type

[**[DataItem]**](DataItem.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## navigatorProductsGet

> [Product] navigatorProductsGet()

Get the list of products for Navigator.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NavigatorApi } = require('@factset/sdk-contentfeedsdatadictionary');
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

const apiInstance = new NavigatorApi();

// Call api endpoint
apiInstance.navigatorProductsGet().then(
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

This endpoint does not need any parameter.

### Return type

[**[Product]**](Product.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## navigatorSourcesDataItemIdGet

> NavigatorSourcesResponse navigatorSourcesDataItemIdGet(dataItemId, productId)

Get a list of sources where the specified data item can be found, for each delivery method, filtered to the appearances of the given data item within the specified product.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NavigatorApi } = require('@factset/sdk-contentfeedsdatadictionary');
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

const apiInstance = new NavigatorApi();
const dataItemId = "dataItemId_example"; // String | The id for the DataItem to fetch the sources for.
const productId = "productId_example"; // String | The id for the Product to filter down the sources returned on.

// Call api endpoint
apiInstance.navigatorSourcesDataItemIdGet(dataItemId, productId).then(
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
 **dataItemId** | **String**| The id for the DataItem to fetch the sources for. | 
 **productId** | **String**| The id for the Product to filter down the sources returned on. | 

### Return type

[**NavigatorSourcesResponse**](NavigatorSourcesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## navigatorSourcesGet

> NavigatorSourcesResponse navigatorSourcesGet(productId)

Get a list of sources by delivery method for the given product_id

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NavigatorApi } = require('@factset/sdk-contentfeedsdatadictionary');
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

const apiInstance = new NavigatorApi();
const productId = "productId_example"; // String | The id for the Product to filter down the sources returned on.

// Call api endpoint
apiInstance.navigatorSourcesGet(productId).then(
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
 **productId** | **String**| The id for the Product to filter down the sources returned on. | 

### Return type

[**NavigatorSourcesResponse**](NavigatorSourcesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## navigatorTableFieldsTableIdGet

> TableCodeFieldInfoResponse navigatorTableFieldsTableIdGet(tableId, opts)

Get the list of fields associated with a table for Navigator, and the code information for the specified data item, if applicable.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NavigatorApi } = require('@factset/sdk-contentfeedsdatadictionary');
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

const apiInstance = new NavigatorApi();
const tableId = "tableId_example"; // String | The id for the Table to fetch the fields for.
const opts = {
  'dataItemId': "dataItemId_example" // String | The id for the DataItem. This is required in case the data item is represented as a code in Standard DataFeeds.
};

// Call api endpoint
apiInstance.navigatorTableFieldsTableIdGet(tableId, opts).then(
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
 **tableId** | **String**| The id for the Table to fetch the fields for. | 
 **dataItemId** | **String**| The id for the DataItem. This is required in case the data item is represented as a code in Standard DataFeeds. | [optional] 

### Return type

[**TableCodeFieldInfoResponse**](TableCodeFieldInfoResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

