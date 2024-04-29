# DealPublic


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deal_id** | **str** | Identifier for the deal. | [optional] 
**target** | [**Target**](Target.md) |  | [optional] 
**buyers** | [**[Participant]**](Participant.md) | Array of participants in the deal who are buyers. | [optional] 
**sellers** | [**[Participant], none_type**](Participant.md) | Array of participants in the deal who are sellers. | [optional] 
**deal_type** | **str** | Type of deal. | [optional] 
**announce_date** | **date** | Date the deal was announced. | [optional] 
**close_date** | **date, none_type** | Date the deal was closed. | [optional] 
**transaction_value** | **float, none_type** | Base Equity Value plus the value of the target’s outstanding net debt (where applicable). The target&#39;s outstanding net debt is defined as the total amount of short and long term interest-bearing debt less any cash and cash equivalents. The target&#39;s outstanding net debt will only be included in the Transaction Value calculation if a.) the acquirer is seeking to own 100% of the target, b.) the target is a non-financial company; and c.) the target&#39;s outstanding net debt is publicly disclosed (or the acquirer publicly states it is assuming a specific amount of liabilities). Otherwise, Transaction Value will be equal to the amount paid for the portion of the target acquired (Base Equity Value) and will exclude the target&#39;s outstanding net debt. Amounts returned are in USD. | [optional] 
**status** | **str** | Status of the deal  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


