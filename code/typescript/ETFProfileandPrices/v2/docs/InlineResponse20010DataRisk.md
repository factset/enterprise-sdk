# etfprofileandprices.InlineResponse20010DataRisk

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isCorporateActionPending** | **Boolean** | Indicates a fund whose issuer has any corporate actions pending (e.g. merger, purchase, and closing). Available for the regions: US. | [optional] 
**counterParty** | **String** | Score predicting the likelihood that an ETN counterparty will default, as measured by 1-year credit default swap rates. Possible values are Low, Medium, or High. Empty for non-ETNs. Available for the regions: US. | [optional] 
**fundClosure** | **String** | Score estimating the likelihood that a fund will close. Based on a quantitative model. Outputs are Low, Medium, or High. Available for the regions: US. | [optional] 


