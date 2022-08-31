# RiskModelAppendData

**(since 1.17.0)** Inline append data. This field can be used mainly for two purpose: 1) to supplement the risk model coverage when assets are not natively covered by a model, and 2) to intentionally override asset exposures and/or specific risk whenever there is misaligned view of an asset's risk profile between a model and a user.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**[{str: (RiskModelAppendDataValue,)}]**](RiskModelAppendDataValue.md) | List of all rows of the append data. | 
**fields** | **[str]** | List of fields in append data. Must contain &#39;SYMBOL&#39;. Index location will be used in &#39;data&#39; elements as keys. The entire set of factor IDs and specific risk are not required. If any inputs of exposures or specific risk are missing, 0 will be inserted for those field. | 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


