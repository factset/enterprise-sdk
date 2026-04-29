# FactSet.SDK.FactSetFunds.Model.RiskMeasures
Risk measurement indicators including fund vs benchmark comparison, SRI PRIIPS, and SRRI UCITS ratings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 
**Date** | **DateTime?** | The date in YYYY-MM-DD format. | [optional] 
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**TaxItemsType** | **RiskMeasuresType** |  | 
**FundVsSegmentBenchmark** | [**FundVsSegmentBenchmark**](FundVsSegmentBenchmark.md) |  | [optional] 
**Fund** | [**Fund**](Fund.md) |  | [optional] 
**SriPriips** | **int?** | The SRI (Summary Risk Indicator) illustrates PRIIPs&#39; risk and reward profile by measuring the market and credit risk level. Returns 1 for low risk up to 7 for higher risk. | [optional] 
**SrriUcits** | **int?** | Synthetic Risk and Reward Indicator illustrates a UCITS or NURS (Non-UCITS Retail Scheme) fund&#39;s risk and reward profile by measuring the market risk level. Returns 1 for low risk up to 7 for high risk. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

