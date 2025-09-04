# formula.CrossSectionalApi

All URIs are relative to *https://api.factset.com/formula-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCrossSectionalDataForList**](CrossSectionalApi.md#getCrossSectionalDataForList) | **POST** /cross-sectional | Retrieve data items (Screening formulas) for a list of identifiers or defined universe.



## getCrossSectionalDataForList

> CrossSectionalResponse getCrossSectionalDataForList(crossSectionalRequest)

Retrieve data items (Screening formulas) for a list of identifiers or defined universe.

The &#x60;/cross-sectional&#x60; endpoint is closely aligned with FactSet&#39;s powerful data retrieval **Screening language** which is optimized for analysis of data items at single point in time for different entities and is extremely efficient for large universes.   The &#x60;/cross-sectional&#x60; endpoint supports Long Running asynchronous requests up to **30 minutes** via the &#x60;batch&#x60; parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.*  ***  ### Iterated Cross-Sectional Functionality   This endpoint supports the ability to automatically iterate through different cross sections over time. The **Iterated Cross-Sectional Functionality (ICSF)** expands the Cross-Sectional endpoint to support retrieving data items for *multiple dates*, allowing users to take advantage of the Screening engine&#39;s efficiency even when history is required.    Use the parameters &#x60;startDate&#x60;, &#x60;endDate&#x60;, and &#x60;frequency&#x60; in the Cross-Sectional endpoint to provide your desired dates. Specify \&quot;0\&quot; in date argument of the Screening formulas provided in the formulas parameter and/or the universe parameter. Lastly, the Iterated Cross-Sectional Functionality is required to run as a &#x60;batch&#x60; request. Therefore, the batch parameter must be set to \&quot;Y\&quot;.    Access to backtesting and batch functionality is required to leverage the Iterated Cross-Sectional Functionality.   **When to use ICSF:**  The ICSF can offer better performance than Time-Series requests when the date range is relatively small, and so it is recommended to use ICSF if the number of IDs requested is greater than the number of dates. If the number of dates is greater than the number of IDs in the request, it is recommended to use Time-Series.   *Note: This is a general rule of thumb and performance may vary depending on the formulas in use.* 

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

