# FactSet.SDK.FactSetFunds.Model.SegmentsAndStructureItem
Response item that can be one of: Classifications, SimilarFunds, BenchmarkDetails, or FundStructure. The actual schema depends on the `structureType` parameter. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**StructureType** | **FundStructureType** |  | 
**AssetClass** | **string** | Returns the asset class description from FactSet&#39;s fund classification system. Asset class designates the fund&#39;s underlying holding type, e.g. equity, fixed-income, etc. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**CategoryClass** | **string** | Returns the asset class category description from FactSet&#39;s fund classification system. The asset class category is the first-tier subcategory within the fund&#39;s asset class, e.g. size &amp; style, sector, precious metals, etc. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**EconomicDevelopmentClass** | **string** | Returns the fund&#39;s economic development description from FactSet&#39;s fund classification system. This description refers to the development level for the fund&#39;s geographic region of focus, e.g. developed, emerging, etc. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**FocusClass** | **string** | Returns the fund&#39;s focus description from FactSet&#39;s fund classification system. The fund&#39;s focus is the second-tier subcategory within the fund&#39;s asset class, e.g. small cap, energy, etc. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**GeographicClass** | **string** | Returns the fund&#39;s specific geography description from FactSet&#39;s fund classification system. Specific geography refers to the fund&#39;s particular geographic focus within the region, e.g. Chile, BRICs, etc. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**NicheClass** | **string** | Returns the fund&#39;s niche description from FactSet&#39;s fund classification system. The fund&#39;s niche is the third-tier subcategory with the fund&#39;s asset class, e.g. growth, coal, etc. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**RegionClass** | **string** | Returns the fund&#39;s region description from FactSet&#39;s fund classification system. Refers to the broad regional exposure of the fund&#39;s holdings, e.g. Latin America, Asia-Pacific, etc. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**SelectionCriteria** | **string** | Returns ETF selection criteria. Data available only for ETFs. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**WeightingScheme** | **string** | Returns weighting scheme data. Data available only for ETFs. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**Strategy** | **string** | Returns ETF Strategy. Data available only for ETFs. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**SimilarFundIds** | **List&lt;string&gt;** | Array of similar funds to the requestedId, each returned as a FactSet Permanent Security Identifier (XXXXXX-S). Data is returned for mutual funds only. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**BenchmarkId** | **string** | The Fund&#39;s primary Benchmark Identifier. | [optional] 
**BenchmarkName** | **string** | The proper name of the Benchmark Id. | [optional] 
**IsCompositeBenchmark** | **bool?** | Binary flag to indicate whether the fund has a composite benchmark. | [optional] 
**BenchmarkChangeDate** | **DateTime?** | The date in which the benchmark changed for the requested fund in YYYY-MM-DD. If no benchmark changes occurred, the response value will be null. | [optional] 
**Segment** | **string** | The segment of the respective segment benchmark ID. | [optional] 
**SegmentBenchmarkId** | **string** | Segment Benchmark Identifier. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. | [optional] 
**SegmentBenchmarkName** | **string** | The segment benchmark&#39;s name in proper format. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. | [optional] 
**SegmentBenchmarkCurrency** | **string** | The Segment Benchmark&#39;s currency in ISO3. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system.For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)&#39; | [optional] 
**SegmentBenchmarkReturnType** | **string** | The Segment benchmarks return type. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. | [optional] 
**FundType** | **string** | Returns the type of the fund, e.g. Mutual Fund, Unit Investment Trust, ETF, etc. | [optional] 
**FundOfFunds** | **string** | The fund of fund&#39;s ID if applicable. Will provide plain Fund of Funds text. | [optional] 
**PortfolioDisclosureFrequency** | **string** | Returns the disclosure frequency | [optional] 
**HoldsDerivatives** | **bool?** | Flag to check if the funds holds derivatives | [optional] 
**SecuritiesLendingActive** | **bool?** | Indicates whether the fund has an active securities lending program. | [optional] 
**EtnCounterparty** | **string** | Returns ETF counterparty information | [optional] 
**PrimaryAdvisor** | **string** | The name of the fund&#39;s primary advisor. | [optional] 
**SubAdvisor** | **string** | The name of the fund&#39;s sub-advisor. | [optional] 
**Custodian** | **string** | Returns custodian data who is a third-party entity that holds and safeguards the securities that are mutually owned by the fund&#39;s investors. They can also perform accounting, administration and provide legal, compliance, and tax services. | [optional] 
**ConvertedFundFlag** | **bool?** | Returns conversion data for funds. Conversion Flag indicates if the ETF is a converted Mutual Fund. Data is returned for both Mutual Funds and ETFs. | [optional] 
**ConversionDisclaimer** | **string** | Disclaimer returns information regarding the fund conversion. conversion date and the converted fund’s name and ticker. Data is returned for both Mutual Funds and ETFs. | [optional] 
**ConversionTimeseriesStitchedFlag** | **bool?** | TimeSeries Stitched indicates if the performance of the current active ETF is a continuation of the converted fund. Data is returned for both Mutual Funds and ETFs. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

