# factsetfunds.Classifications

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**requestId** | **String** | The requested Id sent as input. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**structureType** | [**ClassificationsType**](ClassificationsType.md) |  | 
**assetClass** | **String** | Returns the asset class description from FactSet&#39;s fund classification system. Asset class designates the fund&#39;s underlying holding type, e.g. equity, fixed-income, etc. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**categoryClass** | **String** | Returns the asset class category description from FactSet&#39;s fund classification system. The asset class category is the first-tier subcategory within the fund&#39;s asset class, e.g. size &amp; style, sector, precious metals, etc. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**economicDevelopmentClass** | **String** | Returns the fund&#39;s economic development description from FactSet&#39;s fund classification system. This description refers to the development level for the fund&#39;s geographic region of focus, e.g. developed, emerging, etc. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**focusClass** | **String** | Returns the fund&#39;s focus description from FactSet&#39;s fund classification system. The fund&#39;s focus is the second-tier subcategory within the fund&#39;s asset class, e.g. small cap, energy, etc. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**geographicClass** | **String** | Returns the fund&#39;s specific geography description from FactSet&#39;s fund classification system. Specific geography refers to the fund&#39;s particular geographic focus within the region, e.g. Chile, BRICs, etc. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**nicheClass** | **String** | Returns the fund&#39;s niche description from FactSet&#39;s fund classification system. The fund&#39;s niche is the third-tier subcategory with the fund&#39;s asset class, e.g. growth, coal, etc. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**regionClass** | **String** | Returns the fund&#39;s region description from FactSet&#39;s fund classification system. Refers to the broad regional exposure of the fund&#39;s holdings, e.g. Latin America, Asia-Pacific, etc. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**selectionCriteria** | **String** | Returns ETF selection criteria. Data available only for ETFs. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**weightingScheme** | **String** | Returns weighting scheme data. Data available only for ETFs. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**strategy** | **String** | Returns ETF Strategy. Data available only for ETFs. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 


