

# RiskMeasures

Risk measurement indicators including fund vs benchmark comparison, SRI PRIIPS, and SRRI UCITS ratings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. |  [optional]
**requestId** | **String** | The requested Id sent as input. |  [optional]
**date** | **LocalDate** | The date in YYYY-MM-DD format. |  [optional]
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  |  [optional]
**taxItemsType** | **RiskMeasuresType** |  | 
**fundVsSegmentBenchmark** | [**FundVsSegmentBenchmark**](FundVsSegmentBenchmark.md) |  |  [optional]
**fund** | [**Fund**](Fund.md) |  |  [optional]
**sriPriips** | **Integer** | The SRI (Summary Risk Indicator) illustrates PRIIPs&#39; risk and reward profile by measuring the market and credit risk level. Returns 1 for low risk up to 7 for higher risk. |  [optional]
**srriUcits** | **Integer** | Synthetic Risk and Reward Indicator illustrates a UCITS or NURS (Non-UCITS Retail Scheme) fund&#39;s risk and reward profile by measuring the market risk level. Returns 1 for low risk up to 7 for high risk. |  [optional]


## Implemented Interfaces

* Serializable


