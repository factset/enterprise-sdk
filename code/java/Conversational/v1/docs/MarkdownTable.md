

# MarkdownTable

`Value` field contains tabular FactSet data surfaced from FactSet content sets in markdown format. The data is exactly the same as that found in the `Table`, except that this table will not contain links to source data to the FactSet workstation, with the exception of links to news and documents. Users can decide which of the tables, either `Table` or `MarkdownTable`, to parse, with `MarkdownTable` being recommended as the easier, more universal option. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Datatype contained in this data object | 
**value** | **String** | Markdown formatted table data | 
**metadata** | [**MarkdownTableMetadata**](MarkdownTableMetadata.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
MARKDOWNTABLE | &quot;MarkdownTable&quot;


## Implemented Interfaces

* Serializable


