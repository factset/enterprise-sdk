# ExpressInput

Input configuration for Express endpoint batch processing.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input** | **[str]** | Array of text strings to be processed for entity extraction. Maximum 10 inputs per request. | 
**entities** | [**[StandardEntityType]**](StandardEntityType.md) | Array of entity types to extract from the input text. If &#x60;product&#x60; is included, &#x60;organization&#x60; must also be included.  | Entity Type | Description | |---|---| | person | Individual names and references to people | | organization | Company names, institutions, and organizational entities | | location | Geographic locations including cities, countries, regions | | product | Commercial products and services | | datetime | Specific dates, times, and temporal expressions | | period | Time periods and durations | | numerical | Numbers, quantities, and numerical expressions |  | 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


