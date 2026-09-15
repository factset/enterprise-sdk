# FactSet.SDK.FactSetPowerUtilities.Model.PlantPipelineDetail
Plant gas pipeline connection detail record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The identifier as submitted in the request. Duplicates &#x60;factsetPlantUnitId&#x60;. | 
**FactsetPlantUnitId** | **string** | FactSet unique power plant unit identifier, as submitted in the request. | 
**Category** | **CategoryPipeline** |  | 
**PipelineName** | **string** | Name of the connected gas pipeline. | [optional] 
**PipelineSequence** | **int?** | When multiple pipelines supply a unit, indicates whether this is the first, second, or third pipeline. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

