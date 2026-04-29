# RiskMeasures

Risk measurement indicators including fund vs benchmark comparison, SRI PRIIPS, and SRRI UCITS ratings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tax_items_type** | [**RiskMeasuresType**](RiskMeasuresType.md) |  | 
**fsym_id** | **str, none_type** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**date** | **date, none_type** | The date in YYYY-MM-DD format. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**fund_vs_segment_benchmark** | [**FundVsSegmentBenchmark**](FundVsSegmentBenchmark.md) |  | [optional] 
**fund** | [**Fund**](Fund.md) |  | [optional] 
**sri_priips** | **int, none_type** | The SRI (Summary Risk Indicator) illustrates PRIIPs&#39; risk and reward profile by measuring the market and credit risk level. Returns 1 for low risk up to 7 for higher risk. | [optional] 
**srri_ucits** | **int, none_type** | Synthetic Risk and Reward Indicator illustrates a UCITS or NURS (Non-UCITS Retail Scheme) fund&#39;s risk and reward profile by measuring the market risk level. Returns 1 for low risk up to 7 for high risk. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


