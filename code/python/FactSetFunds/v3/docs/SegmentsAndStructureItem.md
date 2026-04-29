# SegmentsAndStructureItem

Response item that can be one of: Classifications, SimilarFunds, BenchmarkDetails, or FundStructure. The actual schema depends on the `structureType` parameter. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**structure_type** | [**FundStructureType**](FundStructureType.md) |  | 
**fsym_id** | **str, none_type** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**asset_class** | **str, none_type** | Returns the asset class description from FactSet&#39;s fund classification system. Asset class designates the fund&#39;s underlying holding type, e.g. equity, fixed-income, etc. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**category_class** | **str, none_type** | Returns the asset class category description from FactSet&#39;s fund classification system. The asset class category is the first-tier subcategory within the fund&#39;s asset class, e.g. size &amp; style, sector, precious metals, etc. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**economic_development_class** | **str, none_type** | Returns the fund&#39;s economic development description from FactSet&#39;s fund classification system. This description refers to the development level for the fund&#39;s geographic region of focus, e.g. developed, emerging, etc. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**focus_class** | **str, none_type** | Returns the fund&#39;s focus description from FactSet&#39;s fund classification system. The fund&#39;s focus is the second-tier subcategory within the fund&#39;s asset class, e.g. small cap, energy, etc. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**geographic_class** | **str, none_type** | Returns the fund&#39;s specific geography description from FactSet&#39;s fund classification system. Specific geography refers to the fund&#39;s particular geographic focus within the region, e.g. Chile, BRICs, etc. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**niche_class** | **str, none_type** | Returns the fund&#39;s niche description from FactSet&#39;s fund classification system. The fund&#39;s niche is the third-tier subcategory with the fund&#39;s asset class, e.g. growth, coal, etc. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**region_class** | **str, none_type** | Returns the fund&#39;s region description from FactSet&#39;s fund classification system. Refers to the broad regional exposure of the fund&#39;s holdings, e.g. Latin America, Asia-Pacific, etc. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**selection_criteria** | **str, none_type** | Returns ETF selection criteria. Data available only for ETFs. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**weighting_scheme** | **str, none_type** | Returns weighting scheme data. Data available only for ETFs. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**strategy** | **str, none_type** | Returns ETF Strategy. Data available only for ETFs. For more information, see [FactSet Fund Classification System](https://my.apps.factset.com/oa/pages/23362). | [optional] 
**similar_fund_ids** | **[str], none_type** | Array of similar funds to the requestedId, each returned as a FactSet Permanent Security Identifier (XXXXXX-S). Data is returned for mutual funds only. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**benchmark_id** | **str, none_type** | The Fund&#39;s primary Benchmark Identifier. | [optional] 
**benchmark_name** | **str, none_type** | The proper name of the Benchmark Id. | [optional] 
**is_composite_benchmark** | **bool, none_type** | Binary flag to indicate whether the fund has a composite benchmark. | [optional] 
**benchmark_change_date** | **date, none_type** | The date in which the benchmark changed for the requested fund in YYYY-MM-DD. If no benchmark changes occurred, the response value will be null. | [optional] 
**segment** | **str, none_type** | The segment of the respective segment benchmark ID. | [optional] 
**segment_benchmark_id** | **str, none_type** | Segment Benchmark Identifier. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. | [optional] 
**segment_benchmark_name** | **str, none_type** | The segment benchmark&#39;s name in proper format. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. | [optional] 
**segment_benchmark_currency** | **str, none_type** | The Segment Benchmark&#39;s currency in ISO3. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system.For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)&#39; | [optional] 
**segment_benchmark_return_type** | **str, none_type** | The Segment benchmarks return type. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. | [optional] 
**fund_type** | **str, none_type** | Returns the type of the fund, e.g. Mutual Fund, Unit Investment Trust, ETF, etc. | [optional] 
**fund_of_funds** | **str, none_type** | The fund of fund&#39;s ID if applicable. Will provide plain Fund of Funds text. | [optional] 
**portfolio_disclosure_frequency** | **str, none_type** | Returns the disclosure frequency | [optional] 
**holds_derivatives** | **bool, none_type** | Flag to check if the funds holds derivatives | [optional] 
**securities_lending_active** | **bool, none_type** | Indicates whether the fund has an active securities lending program. | [optional] 
**etn_counterparty** | **str, none_type** | Returns ETF counterparty information | [optional] 
**primary_advisor** | **str, none_type** | The name of the fund&#39;s primary advisor. | [optional] 
**sub_advisor** | **str, none_type** | The name of the fund&#39;s sub-advisor. | [optional] 
**custodian** | **str, none_type** | Returns custodian data who is a third-party entity that holds and safeguards the securities that are mutually owned by the fund&#39;s investors. They can also perform accounting, administration and provide legal, compliance, and tax services. | [optional] 
**converted_fund_flag** | **bool, none_type** | Returns conversion data for funds. Conversion Flag indicates if the ETF is a converted Mutual Fund. Data is returned for both Mutual Funds and ETFs. | [optional] 
**conversion_disclaimer** | **str, none_type** | Disclaimer returns information regarding the fund conversion. conversion date and the converted fund’s name and ticker. Data is returned for both Mutual Funds and ETFs. | [optional] 
**conversion_timeseries_stitched_flag** | **bool, none_type** | TimeSeries Stitched indicates if the performance of the current active ETF is a continuation of the converted fund. Data is returned for both Mutual Funds and ETFs. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


