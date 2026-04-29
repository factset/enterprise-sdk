# FactSet.SDK.FactSetFunds.Model.FundStructureAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**StructureType** | **FundStructureType** |  | 
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

