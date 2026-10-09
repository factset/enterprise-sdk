# TradeName

Trade Names response object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**as_of_date** | **date, none_type** | Date of the tradeName data snapshot (YYYY-MM-DD) | [optional] 
**factset_entity_id** | **str, none_type** | FactSet Entity Identifier | [optional] 
**request_id** | **str, none_type** | Original identifier from request (ticker, CUSIP, entity ID, etc.) | [optional] 
**summary** | [**TradeNameSummary**](TradeNameSummary.md) |  | [optional] 
**trade_names** | [**[TradeNames], none_type**](TradeNames.md) | List of tradeNames for the entity on this date. Omitted when the request &#x60;responseFormat&#x60; is &#x60;SUMMARY_ONLY&#x60;.  | [optional] 
**error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


