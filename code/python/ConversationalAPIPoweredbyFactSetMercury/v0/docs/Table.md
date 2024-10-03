# Table

FactSet Table data surfaced from FactSet content sets. `Value` property of parent FederationData contains a JSON formatted [FactSet STACH V3 table](https://factset.github.io/stachschema/#/v3/README). Beta feature: Data represented as a STACH table will also be available for download as an Excel file; the `fileId` will be located in the `NextStep` array, as an `Download` action with the name `InteractiveTable`. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Datatype contained in this data object | [optional]  if omitted the server will use the default value of "Table"
**value** | [**TableData**](TableData.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


