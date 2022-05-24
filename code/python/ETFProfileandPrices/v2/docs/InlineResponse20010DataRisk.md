# InlineResponse20010DataRisk

Risk.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_corporate_action_pending** | **bool** | Indicates a fund whose issuer has any corporate actions pending (e.g. merger, purchase, and closing). Available for the regions: US. | [optional] 
**counter_party** | **str** | Score predicting the likelihood that an ETN counterparty will default, as measured by 1-year credit default swap rates. Possible values are Low, Medium, or High. Empty for non-ETNs. Available for the regions: US. | [optional] 
**fund_closure** | **str** | Score estimating the likelihood that a fund will close. Based on a quantitative model. Outputs are Low, Medium, or High. Available for the regions: US. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


