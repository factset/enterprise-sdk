# FactSet.SDK.ETFProfileandPrices.Model.InlineResponse20010DataRisk
Risk.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsCorporateActionPending** | **bool** | Indicates a fund whose issuer has any corporate actions pending (e.g. merger, purchase, and closing). Available for the regions: US. | [optional] 
**CounterParty** | **string** | Score predicting the likelihood that an ETN counterparty will default, as measured by 1-year credit default swap rates. Possible values are Low, Medium, or High. Empty for non-ETNs. Available for the regions: US. | [optional] 
**FundClosure** | **string** | Score estimating the likelihood that a fund will close. Based on a quantitative model. Outputs are Low, Medium, or High. Available for the regions: US. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

