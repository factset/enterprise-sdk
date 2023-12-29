# IdentifierResolutionHistoricalRequestBody

Request object for Historical Identifier Resolution endpoint.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**GetIdsResolution**](GetIdsResolution.md) |  | 
**input_symbol_type** | [**GetHistoricalInputSymbolType**](GetHistoricalInputSymbolType.md) |  | 
**output_symbol_types** | [**GetHistoricalOutputSymbolTypes**](GetHistoricalOutputSymbolTypes.md) |  | 
**as_of_date** | **date** | As of date for historical symbol request in YYYY-MM-DD format. If no &#x60;asOfDate&#x60; is requested, the response will include the full history of the identifier.  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


