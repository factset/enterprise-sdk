# PostCompanyEstimatesListByInstrumentRequestDataFiscalYears

The response includes data items from the fiscal year specified as start (inclusive) up to the fiscal year specified as end (inclusive). The attribute `start` must be less than or equal to the attribute `end`.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | **float** | Only include data items for a fiscal year greater than or equal to the one specified. Must be greater than or equal to one year in the past. If omitted, the response includes data from one year in the past up to the year specified as &#x60;end&#x60;. | [optional] 
**end** | **float** | Only include data items for a fiscal year earlier than or equal to the one specified. Must be less than or equal to three years in the future. If omitted, the response includes data from the year specified as &#x60;start&#x60; up to three years in the future. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


