# FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model.Table
FactSet Table data surfaced from FactSet content sets. `Value` property of parent FederationData contains a JSON formatted [FactSet STACH V3 table](https://factset.github.io/stachschema/#/v3/README). Beta feature: Data represented as a STACH table will also be available for download as an Excel file; the `fileId` will be located in the `NextStep` array, as an `Download` action with the name `InteractiveTable`. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Datatype contained in this data object | [optional] 
**Value** | [**TableData**](TableData.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

