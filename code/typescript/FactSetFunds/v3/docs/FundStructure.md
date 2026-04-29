# factsetfunds.FundStructure

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**requestId** | **String** | The requested Id sent as input. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**structureType** | [**FundStructureType**](FundStructureType.md) |  | 
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


