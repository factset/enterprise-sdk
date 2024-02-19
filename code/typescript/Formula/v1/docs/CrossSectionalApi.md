# formula.CrossSectionalApi

All URIs are relative to *https://api.factset.com/formula-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCrossSectionalData**](CrossSectionalApi.md#getCrossSectionalData) | **GET** /v1/cross-sectional | Retrieve data items (Screening formulas) for a list of identifiers or defined universe.
[**getCrossSectionalDataForList**](CrossSectionalApi.md#getCrossSectionalDataForList) | **POST** /v1/cross-sectional | Retrieve data items (Screening formulas) for a list of identifiers or defined universe.



## getCrossSectionalData

> CrossSectionalResponse getCrossSectionalData(formulas, opts)

Retrieve data items (Screening formulas) for a list of identifiers or defined universe.

The &#x60;/cross-sectional&#x60; endpoint is closely aligned with FactSet’s powerful data retrieval **Screening language** which is optimized for analysis of data items at single point in time for different entities and is extremely efficient for large universes.   The &#x60;/cross-sectional&#x60; endpoint supports Long Running asynchronous requests up to **10 minutes** via the &#x60;batch&#x60; parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.*  ***  ### Iterated Cross-Sectional Functionality   This endpoint supports the ability to automatically iterate through different cross sections over time. The **Iterated Cross-Sectional Functionality (ICSF)** expands the Cross-Sectional endpoint to support retrieving data items for *multiple dates*, allowing users to take advantage of the Screening engine’s efficiency even when history is required.    Use the parameters &#x60;startDate&#x60;, &#x60;endDate&#x60;, and &#x60;frequency&#x60; in the Cross-Sectional endpoint to provide your desired dates. Specify “0” in date argument of the Screening formulas provided in the formulas parameter and/or the universe parameter. Lastly, the Iterated Cross-Sectional Functionality is required to run as a &#x60;batch&#x60; request. Therefore, the batch parameter must be set to “Y”.    Access to backtesting and batch functionality is required to leverage the Iterated Cross-Sectional Functionality.   **When to use ICSF:**  The ICSF can offer better performance than Time-Series requests when the date range is relatively small, and so it is recommended to use ICSF if the number of IDs requested is greater than the number of dates. If the number of dates is greater than the number of IDs in the request, it is recommended to use Time-Series.  *Note: This is a general rule of thumb and performance may vary depending on the formulas in use.* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CrossSectionalApi } = require('@factset/sdk-formula');
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

const apiInstance = new CrossSectionalApi();
const formulas = ["P_PRICE(0)"]; // [String] | List of Screening formulas
const opts = {
  'ids': ["IBM"], // [String] | List of entity identifiers. This request value is sent back in the response as the field *requestId*. By default, accepted symbol types include Market Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent Ids. Use the `symbolType` parameter to submit other supported third-party identifier types.  The `ids` and `universe` parameters provide two different ways to specify the identifiers for which you want data retrieved. Please enter either the `ids` or `universe` parameter. 
  'symbolType': "'DEFAULT'", // String | Specify the type of symbols submitted in the `ids` parameter. This is only required when submitting ids that are not supported by default.   Available symbol types - * DEFAULT - Accepted symbol types include Market Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent Ids.  * BLOOMBERG - Accepted symbol types include Bloomberg Tickers and Bloomberg FIGIs.    * When submitting Bloomberg symbols, the Bloomberg symbol is translated to a FactSet Permanent Identifier which is then used to retrieve the requested FQL and Screening formulas. The Bloomberg symbol submitted will be returned in the response in the field *requestId*. To see the FactSet Permanent Identifer that the Bloomberg symbol resolved to, use the `fsymId` parameter in addition to the `symbolType` parameter.   * Bloomberg symbols can not be submitted with other symbol types.    * Bloomberg Symbol Resolution is not available via Batch Requests.  Bloomberg Symbol Resolution is included with the Individual User subscription. Users with a Production User subscription require additional access to submit Bloomberg symbols. If you would like to gain access to Bloomberg Symbol Resolution, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist. 
  'universe': , // String | Screening expression to limit the universe  Please enter either the `ids` or `universe` parameter. 
  'universeType': "'EQUITY'", // String | Specify the universe type to calculate the `universe` in.  Find documentation below on how to build a screen for each universe type - * Equity Screen - [Online Assistant Page 20606](https://my.apps.factset.com/oa/pages/20606)  * Debt Screen - [Online Assistant Page 20888](https://my.apps.factset.com/oa/pages/20888)  * Fund Screen - [Online Assistant Page 21384](https://my.apps.factset.com/oa/pages/21384) 
  'backTestDate': "backTestDate_example", // String | Specify the backtest date either in **YYYY-MM-DD**, **YYYYMMDD** or **MM/DD/YYYY** format.  To learn more about backtesting, please visit [Online Assistant Page 20610](https://my.apps.factset.com/oa/pages/20610#backtest). User must have access to backtesting functionality. 
  'calendar': FIVEDAY, // String | Calendar of data returned. The default value is FIVEDAY which displays Monday through Friday, regardless of whether there were trading holidays.
  'fsymId': "'N'", // String | Specify **Y** for `fsymId` to return an additional response object containing the data item **fsymId** which will contain the fsymIds of the requestIds. This is in addition to the response object containing the data item **requestId**. The default value for `fsymId` is **N**.  The **fsymId** field returned is the FactSet Default Permanent Identifier for the `requestId`. For all supported `requestId` symbol types, the `fsymId` parameter will return the Regional Level PermId '-R' which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted `requestId` symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). 
  'displayName': , // [String] | Define display names for the formulas inputted. Enter the list of display names in the same order as the formulas inputted. An additional field **displayName** will be returned in the data object for a formula.  If the number of display names does not match the number of formulas provided, an error will be returned.  To define the display name for a subset of the formulas, leave a blank in the position of the formula that won't be renamed. For example - If three formulas are inputted, to define display names only for the first and third formula, enter *displayName=FORMULA_1,,FORMULA_3*. The **displayName** field will still be included in that formula, but will contain the formula as inputted. 
  'flatten': "'N'", // String | Specify **Y** for `flatten` to return a flat, table-like JSON response model instead of the standard nested JSON response model. This option is provided for easier data processing and visualization. The default value for `flatten` is **N**.  See the **Cross-Sectional Result Object Flattened** schema for more detail on the response structure for flattened output. 
  'batch': "'N'", // String | Enables the ability to asynchronously \"batch\" the request,  supporting a long-running request up to **20 minutes**. Upon requesting batch=Y, the service will respond back with an HTTP Status Code of 202.  Individual users are limited to running 5 Batch Requests in a 5 minute period and are allowed 5 concurrent Batch Requests. Production users are limited to running 10 Batch Requests in a 5 minute period and are allowed 10 concurrent Batch Requests. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.*  Once a batch request is submitted, use `/batch-status` to see if the job has completed. Once completed, retrieve the results of the request via `/batch-result`. See the endpoints listed under *Batch Processing* for more information. 
  'startDate': "startDate_example", // String | Specify the start date for running the Iterated Cross Sectional Functionality request either in **YYYY-MM-DD**, **YYYYMMDD** or **MM/DD/YYYY** format. User must have access to backtesting functionality.
  'endDate': "endDate_example", // String | Specify the end date for running the Iterated Cross Sectional Functionality request either in **YYYY-MM-DD**, **YYYYMMDD** or **MM/DD/YYYY** format. User must have access to backtesting functionality.
  'frequency':  // String | Specify the frequency for running the Iterated Cross Sectional Functionality request. The following frequencies are supported **D**, **W**, **M**, **AM**, **CQ**, **AY**, or **CY**. To learn more about frequency, please visit [Online Assistant Page 1964](https://my.apps.factset.com/oa/pages/1964#frequency). User must have access to backtesting functionality.
};

// Call api endpoint
apiInstance.getCrossSectionalData(formulas, opts).then(
  data => {

      // data is a responsewrapper: GetCrossSectionalDataResponseWrapper
      switch (data.statusCode) {

          case 200:
             // CrossSectionalResponse
             console.log(data.getResponse200());
             break;

          case 202:
             // BatchStatusResponse
             console.log(data.getResponse202());
             break;

      }

  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **formulas** | [**[String]**](String.md)| List of Screening formulas | 
 **ids** | [**[String]**](String.md)| List of entity identifiers. This request value is sent back in the response as the field *requestId*. By default, accepted symbol types include Market Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent Ids. Use the &#x60;symbolType&#x60; parameter to submit other supported third-party identifier types.  The &#x60;ids&#x60; and &#x60;universe&#x60; parameters provide two different ways to specify the identifiers for which you want data retrieved. Please enter either the &#x60;ids&#x60; or &#x60;universe&#x60; parameter.  | [optional] 
 **symbolType** | **String**| Specify the type of symbols submitted in the &#x60;ids&#x60; parameter. This is only required when submitting ids that are not supported by default.   Available symbol types - * DEFAULT - Accepted symbol types include Market Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent Ids.  * BLOOMBERG - Accepted symbol types include Bloomberg Tickers and Bloomberg FIGIs.    * When submitting Bloomberg symbols, the Bloomberg symbol is translated to a FactSet Permanent Identifier which is then used to retrieve the requested FQL and Screening formulas. The Bloomberg symbol submitted will be returned in the response in the field *requestId*. To see the FactSet Permanent Identifer that the Bloomberg symbol resolved to, use the &#x60;fsymId&#x60; parameter in addition to the &#x60;symbolType&#x60; parameter.   * Bloomberg symbols can not be submitted with other symbol types.    * Bloomberg Symbol Resolution is not available via Batch Requests.  Bloomberg Symbol Resolution is included with the Individual User subscription. Users with a Production User subscription require additional access to submit Bloomberg symbols. If you would like to gain access to Bloomberg Symbol Resolution, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.  | [optional] [default to &#39;DEFAULT&#39;]
 **universe** | **String**| Screening expression to limit the universe  Please enter either the &#x60;ids&#x60; or &#x60;universe&#x60; parameter.  | [optional] 
 **universeType** | **String**| Specify the universe type to calculate the &#x60;universe&#x60; in.  Find documentation below on how to build a screen for each universe type - * Equity Screen - [Online Assistant Page 20606](https://my.apps.factset.com/oa/pages/20606)  * Debt Screen - [Online Assistant Page 20888](https://my.apps.factset.com/oa/pages/20888)  * Fund Screen - [Online Assistant Page 21384](https://my.apps.factset.com/oa/pages/21384)  | [optional] [default to &#39;EQUITY&#39;]
 **backTestDate** | **String**| Specify the backtest date either in **YYYY-MM-DD**, **YYYYMMDD** or **MM/DD/YYYY** format.  To learn more about backtesting, please visit [Online Assistant Page 20610](https://my.apps.factset.com/oa/pages/20610#backtest). User must have access to backtesting functionality.  | [optional] 
 **calendar** | **String**| Calendar of data returned. The default value is FIVEDAY which displays Monday through Friday, regardless of whether there were trading holidays. | [optional] 
 **fsymId** | **String**| Specify **Y** for &#x60;fsymId&#x60; to return an additional response object containing the data item **fsymId** which will contain the fsymIds of the requestIds. This is in addition to the response object containing the data item **requestId**. The default value for &#x60;fsymId&#x60; is **N**.  The **fsymId** field returned is the FactSet Default Permanent Identifier for the &#x60;requestId&#x60;. For all supported &#x60;requestId&#x60; symbol types, the &#x60;fsymId&#x60; parameter will return the Regional Level PermId &#39;-R&#39; which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted &#x60;requestId&#x60; symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881).  | [optional] [default to &#39;N&#39;]
 **displayName** | [**[String]**](String.md)| Define display names for the formulas inputted. Enter the list of display names in the same order as the formulas inputted. An additional field **displayName** will be returned in the data object for a formula.  If the number of display names does not match the number of formulas provided, an error will be returned.  To define the display name for a subset of the formulas, leave a blank in the position of the formula that won&#39;t be renamed. For example - If three formulas are inputted, to define display names only for the first and third formula, enter *displayName&#x3D;FORMULA_1,,FORMULA_3*. The **displayName** field will still be included in that formula, but will contain the formula as inputted.  | [optional] 
 **flatten** | **String**| Specify **Y** for &#x60;flatten&#x60; to return a flat, table-like JSON response model instead of the standard nested JSON response model. This option is provided for easier data processing and visualization. The default value for &#x60;flatten&#x60; is **N**.  See the **Cross-Sectional Result Object Flattened** schema for more detail on the response structure for flattened output.  | [optional] [default to &#39;N&#39;]
 **batch** | **String**| Enables the ability to asynchronously \&quot;batch\&quot; the request,  supporting a long-running request up to **20 minutes**. Upon requesting batch&#x3D;Y, the service will respond back with an HTTP Status Code of 202.  Individual users are limited to running 5 Batch Requests in a 5 minute period and are allowed 5 concurrent Batch Requests. Production users are limited to running 10 Batch Requests in a 5 minute period and are allowed 10 concurrent Batch Requests. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.*  Once a batch request is submitted, use &#x60;/batch-status&#x60; to see if the job has completed. Once completed, retrieve the results of the request via &#x60;/batch-result&#x60;. See the endpoints listed under *Batch Processing* for more information.  | [optional] [default to &#39;N&#39;]
 **startDate** | **String**| Specify the start date for running the Iterated Cross Sectional Functionality request either in **YYYY-MM-DD**, **YYYYMMDD** or **MM/DD/YYYY** format. User must have access to backtesting functionality. | [optional] 
 **endDate** | **String**| Specify the end date for running the Iterated Cross Sectional Functionality request either in **YYYY-MM-DD**, **YYYYMMDD** or **MM/DD/YYYY** format. User must have access to backtesting functionality. | [optional] 
 **frequency** | **String**| Specify the frequency for running the Iterated Cross Sectional Functionality request. The following frequencies are supported **D**, **W**, **M**, **AM**, **CQ**, **AY**, or **CY**. To learn more about frequency, please visit [Online Assistant Page 1964](https://my.apps.factset.com/oa/pages/1964#frequency). User must have access to backtesting functionality. | [optional] 

### Return type

[**CrossSectionalResponse**](CrossSectionalResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCrossSectionalDataForList

> CrossSectionalResponse getCrossSectionalDataForList(crossSectionalRequest)

Retrieve data items (Screening formulas) for a list of identifiers or defined universe.

The &#x60;/cross-sectional&#x60; endpoint is closely aligned with FactSet’s powerful data retrieval **Screening language** which is optimized for analysis of data items at single point in time for different entities and is extremely efficient for large universes.   The &#x60;/cross-sectional&#x60; endpoint supports Long Running asynchronous requests up to **10 minutes** via the &#x60;batch&#x60; parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.*  ***  ### Iterated Cross-Sectional Functionality   This endpoint supports the ability to automatically iterate through different cross sections over time. The **Iterated Cross-Sectional Functionality (ICSF)** expands the Cross-Sectional endpoint to support retrieving data items for *multiple dates*, allowing users to take advantage of the Screening engine’s efficiency even when history is required.    Use the parameters &#x60;startDate&#x60;, &#x60;endDate&#x60;, and &#x60;frequency&#x60; in the Cross-Sectional endpoint to provide your desired dates. Specify “0” in date argument of the Screening formulas provided in the formulas parameter and/or the universe parameter. Lastly, the Iterated Cross-Sectional Functionality is required to run as a &#x60;batch&#x60; request. Therefore, the batch parameter must be set to “Y”.    Access to backtesting and batch functionality is required to leverage the Iterated Cross-Sectional Functionality.   **When to use ICSF:**  The ICSF can offer better performance than Time-Series requests when the date range is relatively small, and so it is recommended to use ICSF if the number of IDs requested is greater than the number of dates. If the number of dates is greater than the number of IDs in the request, it is recommended to use Time-Series.   *Note: This is a general rule of thumb and performance may vary depending on the formulas in use.* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CrossSectionalApi } = require('@factset/sdk-formula');
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

const apiInstance = new CrossSectionalApi();
const crossSectionalRequest = {"data":{"ids":["IBM"],"formulas":["P_PRICE(0)"]}}; // CrossSectionalRequest | 

// Call api endpoint
apiInstance.getCrossSectionalDataForList(crossSectionalRequest).then(
  data => {

      // data is a responsewrapper: GetCrossSectionalDataForListResponseWrapper
      switch (data.statusCode) {

          case 200:
             // CrossSectionalResponse
             console.log(data.getResponse200());
             break;

          case 202:
             // BatchStatusResponse
             console.log(data.getResponse202());
             break;

      }

  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crossSectionalRequest** | [**CrossSectionalRequest**](CrossSectionalRequest.md)|  | 

### Return type

[**CrossSectionalResponse**](CrossSectionalResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

