# FactSet.SDK.OFDB.Model.BulkDeleteData
Users may provide any combination of a symbol, date, and/or field to perform a bulk delete operation. For example, if a user provides both a symbol and a date within the same data point {} then the endpoint will delete the symbol for just that date. If they provide a symbol, date, and field then the endpoint will delete just that singular field entry point for that date for the given symbol. Providing singular entities within a {} will delete the complete data for that given value.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Symbol** | **string** |  | [optional] 
**Date** | **int** |  | [optional] 
**Field** | **string** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

