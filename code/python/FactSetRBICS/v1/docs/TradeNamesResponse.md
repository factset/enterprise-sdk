# TradeNamesResponse

TradeNames Response. Always includes a top-level `metadata` object with request-level aggregate counts. The contents of each `data` item depend on the `responseFormat` chosen in the request. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**meta** | [**TradeNamesMetadata**](TradeNamesMetadata.md) |  | [optional] 
**data** | [**[TradeName]**](TradeName.md) | Array of TradeName objects, one per requested identifier. The presence of &#x60;summary&#x60; and &#x60;tradeNames&#x60; on each item is controlled by the request &#x60;responseFormat&#x60;.  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


