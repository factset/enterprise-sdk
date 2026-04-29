# FundStructureAllOf


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**structure_type** | [**FundStructureType**](FundStructureType.md) |  | 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
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


