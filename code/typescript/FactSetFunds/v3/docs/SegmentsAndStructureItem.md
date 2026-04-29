# factsetfunds.SegmentsAndStructureItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**requestId** | **String** | The requested Id sent as input. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**structureType** | [**FundStructureType**](FundStructureType.md) |  | 
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
**similarFundIds** | **[String]** | Array of similar funds to the requestedId, each returned as a FactSet Permanent Security Identifier (XXXXXX-S). Data is returned for mutual funds only. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**benchmarkId** | **String** | The Fund&#39;s primary Benchmark Identifier. | [optional] 
**benchmarkName** | **String** | The proper name of the Benchmark Id. | [optional] 
**isCompositeBenchmark** | **Boolean** | Binary flag to indicate whether the fund has a composite benchmark. | [optional] 
**benchmarkChangeDate** | **Date** | The date in which the benchmark changed for the requested fund in YYYY-MM-DD. If no benchmark changes occurred, the response value will be null. | [optional] 
**segment** | **String** | The segment of the respective segment benchmark ID. | [optional] 
**segmentBenchmarkId** | **String** | Segment Benchmark Identifier. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. | [optional] 
**segmentBenchmarkName** | **String** | The segment benchmark&#39;s name in proper format. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. | [optional] 
**segmentBenchmarkCurrency** | **String** | The Segment Benchmark&#39;s currency in ISO3. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system.For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)&#39; | [optional] 
**segmentBenchmarkReturnType** | **String** | The Segment benchmarks return type. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. | [optional] 
**fundType** | **String** | Returns the type of the fund, e.g. Mutual Fund, Unit Investment Trust, ETF, etc. | [optional] 
**fundOfFunds** | **String** | The fund of fund&#39;s ID if applicable. Will provide plain Fund of Funds text. | [optional] 
**portfolioDisclosureFrequency** | **String** | Returns the disclosure frequency | [optional] 
**holdsDerivatives** | **Boolean** | Flag to check if the funds holds derivatives | [optional] 
**securitiesLendingActive** | **Boolean** | Indicates whether the fund has an active securities lending program. | [optional] 
**etnCounterparty** | **String** | Returns ETF counterparty information | [optional] 
**primaryAdvisor** | **String** | The name of the fund&#39;s primary advisor. | [optional] 
**subAdvisor** | **String** | The name of the fund&#39;s sub-advisor. | [optional] 
**custodian** | **String** | Returns custodian data who is a third-party entity that holds and safeguards the securities that are mutually owned by the fund&#39;s investors. They can also perform accounting, administration and provide legal, compliance, and tax services. | [optional] 
**convertedFundFlag** | **Boolean** | Returns conversion data for funds. Conversion Flag indicates if the ETF is a converted Mutual Fund. Data is returned for both Mutual Funds and ETFs. | [optional] 
**conversionDisclaimer** | **String** | Disclaimer returns information regarding the fund conversion. conversion date and the converted fund’s name and ticker. Data is returned for both Mutual Funds and ETFs. | [optional] 
**conversionTimeseriesStitchedFlag** | **Boolean** | TimeSeries Stitched indicates if the performance of the current active ETF is a continuation of the converted fund. Data is returned for both Mutual Funds and ETFs. | [optional] 


