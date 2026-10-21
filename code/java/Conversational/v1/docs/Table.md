

# Table

`Value` field contains tabular FactSet data surfaced from FactSet content sets in STACH format. The data is exactly the same as that found in the `MarkdownTable`, except that this table potentially contains links to source data in the FactSet workstation. Users can decide which of the tables, either `Table` or `MarkdownTable`, to parse, with `MarkdownTable` being recommended as the easier, more universal option.  The Conversational API uses Factset's STACH V3 format to represent tabular data in JSON. Please refer to the [STACH V3 documentation](https://factset.github.io/stachschema/#/v3/README) on column organized data for more information on how to process STACH-organized data.  Data represented as a STACH table may also be available for download as an Excel file; the `fileId` will be located in the `NextStep` array, as an `Download` action with the name `InteractiveTable`.  Please see an example response containing a STACH Table in the example section labeled as `TableResponseExample`.  

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Datatype contained in this data object | 
**value** | **Object** | Data table represented in [FactSet STACH V3](https://factset.github.io/stachschema/#/v3/README) format | 



## Enum: TypeEnum

Name | Value
---- | -----
TABLE | &quot;Table&quot;


## Implemented Interfaces

* Serializable


