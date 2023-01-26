# FactSet.SDK.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.Model.AbsDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Identifier that was used for the request. | [optional] 
**FsymId** | **string** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**Date** | **DateTime?** | The date on which the price is calculated. | [optional] 
**Cdr** | **string** | A vector of conditional default rate assumption used in the evaluated price of the instrument. CDR represents the percentage of outstanding principal balances in the pool that are in default. | [optional] 
**Cpr** | **double?** | Returns the flat CPR that would equate to the same weighted average life (WAL) projection for Agency CMOs as the base case CPR vector | [optional] 
**Factor** | **double?** | The representation of the amount of the principal of an amortizing bond that has been paid out or written down since issuance, expressed as a percentage of the original total principal | [optional] 
**EstimatedFactor** | **double?** | The projected agency pool factor between factor date and the day the actual factor is reported to investors (only applicable for agency passthrough securities). | [optional] 
**BidPricePreFactor** | **double?** | Returns the agency pool bid price that is adjusted to account for prepayment expectations during the first five business days of the month before the factors are reported. | [optional] 
**MidPricePreFactor** | **double?** | Returns the agency pool mid price that is adjusted to account for prepayment expectations during the first five business days of the month before the factors are reported. | [optional] 
**AskPricePreFactor** | **double?** | Returns the agency pool ask price that is adjusted to account for prepayment expectations during the first five business days of the month before the factors are reported. | [optional] 
**CPREstimatePreFactor** | **double?** | Returns the agency pool CPR estimate that is adjusted to account for prepayment expectations during the first five business days of the month before the factors are reported. | [optional] 
**Liquidity** | **double?** | Returns the market liquidity score. | [optional] 
**PayUp** | **double?** | Returns the number of ticks, in 32nds format, above the TBA price. | [optional] 
**PayUpDescription** | **string** | Returns the specified pool characteristics being used to drive the pay-up. | [optional] 
**PrePayRate** | **double?** | &#39;Returns a vector of values of speed used in the evaluated price of the instrument. It is the estimated rate at which borrowers pays off the obligations that underlies an instrument. | [optional] 
**PrePayType** | **string** | Returns the type of prepayment speed used in the evaluated price of the instrument. | [optional] 
**Severity** | **double?** | Returns a vector of Loss Severity assumption used in evaluated price of the instrument. It is the percentage of the principal applied to the defaulted loan balance. | [optional] 
**Wal** | **double?** | Returns the Weighted Average Life of the instrument. | [optional] 
**WALPrincipal** | **double?** | Returns the Weighted Average Life of the instrument. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

