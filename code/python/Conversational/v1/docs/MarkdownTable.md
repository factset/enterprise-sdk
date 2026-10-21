# MarkdownTable

`Value` field contains tabular FactSet data surfaced from FactSet content sets in markdown format. The data is exactly the same as that found in the `Table`, except that this table will not contain links to source data to the FactSet workstation, with the exception of links to news and documents. Users can decide which of the tables, either `Table` or `MarkdownTable`, to parse, with `MarkdownTable` being recommended as the easier, more universal option. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** | Markdown formatted table data | 
**type** | **str** | Datatype contained in this data object | defaults to "MarkdownTable"
**metadata** | [**MarkdownTableMetadata**](MarkdownTableMetadata.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


