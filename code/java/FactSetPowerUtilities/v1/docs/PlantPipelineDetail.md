

# PlantPipelineDetail

Plant gas pipeline connection detail record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request. Duplicates &#x60;factsetPlantUnitId&#x60;. | 
**factsetPlantUnitId** | **String** | FactSet unique power plant unit identifier, as submitted in the request. | 
**category** | **CategoryPipeline** |  | 
**pipelineName** | **String** | Name of the connected gas pipeline. |  [optional]
**pipelineSequence** | **Integer** | When multiple pipelines supply a unit, indicates whether this is the first, second, or third pipeline. |  [optional]


## Implemented Interfaces

* Serializable


