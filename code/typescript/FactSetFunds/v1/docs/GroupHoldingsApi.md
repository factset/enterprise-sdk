# factsetfunds.GroupHoldingsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGroupHoldings**](GroupHoldingsApi.md#getGroupHoldings) | **GET** /factset-funds/v1/holdings/group | Get group holdings for a specific date and group.
[**getGroupHoldingsForList**](GroupHoldingsApi.md#getGroupHoldingsForList) | **POST** /factset-funds/v1/holdings/group | Get group holdings for a specific date and group.



## getGroupHoldings

> GroupHoldingsResponse getGroupHoldings(ids, opts)

Get group holdings for a specific date and group.

Retrieves the holding percentages for the group and funds specified. Available groups are:   * **ASSET** &#x3D; Asset Class   * **ASSETISTYP** &#x3D; Issue Type with Asset Class   * **CAPGRP** &#x3D; Cap Group   * **CNTRY** &#x3D; Country   * **EXCHANGE** &#x3D; Exchange   * **INDUSTRY** &#x3D; Industry   * **ISSUE_TYPE** &#x3D; Issue Type   * **REGION** &#x3D; Region   * **SECTOR** &#x3D; Sector   * **ULTPARENT** &#x3D; Ultimate Parent 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, GroupHoldingsApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new GroupHoldingsApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
const opts = {
  'asOfDate': 2024-02-20, // String | As of date for historical group holdings in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
  'group': "'CNTRY'" // String | Controls the group of the data returned.   * **ASSET** = Asset Class   * **ASSETISTYP** = Issue Type with Asset Class   * **CAPGRP** = Cap Group   * **CNTRY** = Country   * **EXCHANGE** = Exchange   * **INDUSTRY** = Industry   * **ISSUE_TYPE** = Issue Type   * **REGION** = Region   * **SECTOR** = Sector   * **ULTPARENT** = Ultimate Parent       
};

// Call api endpoint
apiInstance.getGroupHoldings(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **asOfDate** | **String**| As of date for historical group holdings in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional] 
 **group** | **String**| Controls the group of the data returned.   * **ASSET** &#x3D; Asset Class   * **ASSETISTYP** &#x3D; Issue Type with Asset Class   * **CAPGRP** &#x3D; Cap Group   * **CNTRY** &#x3D; Country   * **EXCHANGE** &#x3D; Exchange   * **INDUSTRY** &#x3D; Industry   * **ISSUE_TYPE** &#x3D; Issue Type   * **REGION** &#x3D; Region   * **SECTOR** &#x3D; Sector   * **ULTPARENT** &#x3D; Ultimate Parent        | [optional] [default to &#39;CNTRY&#39;]

### Return type

[**GroupHoldingsResponse**](GroupHoldingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getGroupHoldingsForList

> GroupHoldingsResponse getGroupHoldingsForList(groupHoldingsRequest)

Get group holdings for a specific date and group.

Retrieves the holding percentages for the group and funds specified. Available groups are:   * **ASSET** &#x3D; Asset Class   * **ASSETISTYP** &#x3D; Issue Type with Asset Class   * **CAPGRP** &#x3D; Cap Group   * **CNTRY** &#x3D; Country   * **EXCHANGE** &#x3D; Exchange   * **INDUSTRY** &#x3D; Industry   * **ISSUE_TYPE** &#x3D; Issue Type   * **REGION** &#x3D; Region   * **SECTOR** &#x3D; Sector   * **ULTPARENT** &#x3D; Ultimate Parent 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, GroupHoldingsApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new GroupHoldingsApi();
const groupHoldingsRequest = new factsetfunds.GroupHoldingsRequest(); // GroupHoldingsRequest | The Group Holdings request body, allowing the user to specify a list of ids, date, and group.

// Call api endpoint
apiInstance.getGroupHoldingsForList(groupHoldingsRequest).then(
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
 **groupHoldingsRequest** | [**GroupHoldingsRequest**](GroupHoldingsRequest.md)| The Group Holdings request body, allowing the user to specify a list of ids, date, and group. | 

### Return type

[**GroupHoldingsResponse**](GroupHoldingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

