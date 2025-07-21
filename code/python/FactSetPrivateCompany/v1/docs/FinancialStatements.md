# FinancialStatements

Financial statement object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**fsym_id** | **str, none_type** | Unique FactSet-generated identifier representing an entity for the current entity identifier (-E) | [optional] 
**report_date** | **[date, none_type]** | The date the reported fiscal period ended | [optional] 
**fiscal_year** | **[str, none_type]** | Fiscal year of the reported period in YYYY format | [optional] 
**items** | [**[StatementItem]**](StatementItem.md) | Array of financial statement items | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


