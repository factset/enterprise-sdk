# FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model.MarkdownTable
`Value` field contains tabular FactSet data surfaced from FactSet content sets in markdown format. The data is exactly the same as that found in the `Table`, except that this table will not contain links to source data to the FactSet workstation, with the exception of links to news and documents. Users can decide which of the tables, either `Table` or `MarkdownTable`, to parse, with `MarkdownTable` being recommended as the easier, more universal option. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Datatype contained in this data object | 
**Value** | **string** | Markdown formatted table data | 
**Metadata** | [**MarkdownTableMetadata**](MarkdownTableMetadata.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

