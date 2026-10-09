# FactSet.SDK.FactSetNER.Model.ExpressInput
Input configuration for Express endpoint batch processing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Input** | **List&lt;string&gt;** | Array of text strings to be processed for entity extraction. Maximum 10 inputs per request. | 
**Entities** | [**List&lt;StandardEntityType&gt;**](StandardEntityType.md) | Array of entity types to extract from the input text. If &#x60;product&#x60; is included, &#x60;organization&#x60; must also be included.  | Entity Type | Description | |- --|- --| | person | Individual names and references to people | | organization | Company names, institutions, and organizational entities | | location | Geographic locations including cities, countries, regions | | product | Commercial products and services | | datetime | Specific dates, times, and temporal expressions | | period | Time periods and durations | | numerical | Numbers, quantities, and numerical expressions |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

