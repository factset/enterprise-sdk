# FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model.Table
`Value` field contains tabular FactSet data surfaced from FactSet content sets.   The Conversational API uses Factset's STACH V3 format to represent tabular data in JSON. Please refer to the [STACH V3 documentation](https://factset.github.io/stachschema/#/v3/README) on column organized data for more information on how to process STACH-organized data.  Data represented as a STACH table may also be available for download as an Excel file; the `fileId` will be located in the `NextStep` array, as an `Download` action with the name `InteractiveTable`.  Please see an example response containing a STACH Table in the example section labeled as `TableResponseExample`.  

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Datatype contained in this data object | 
**Value** | **Object** | Data table represented in [FactSet STACH V3](https://factset.github.io/stachschema/#/v3/README) format | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

