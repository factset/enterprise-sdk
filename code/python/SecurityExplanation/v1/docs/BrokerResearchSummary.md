# BrokerResearchSummary

Broker research summary configuration object.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**style** | **str** | Include summarized broker research notes on the company, or just the footnote, or none. Only available for Broker Research users | [optional]  if omitted the server will use the default value of "none"
**broker_ids** | **[int]** | List of broker IDs covering the company to receive individual research summaries for each over the specified period.Summaries are presented separately by broker, not combined. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


