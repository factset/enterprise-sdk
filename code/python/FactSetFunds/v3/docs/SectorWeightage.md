# SectorWeightage

Sector allocation percentages based on FactSet RBICS classification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**analytics_type** | [**SectorWeightageType**](SectorWeightageType.md) |  | 
**fsym_id** | **str, none_type** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**date** | **date, none_type** | The date in YYYY-MM-DD format. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**sector** | **str, none_type** | Sector data based on FactSet RBICS classification. | [optional] 
**sector_weightage_percentage** | **float, none_type** | The percentage weight of the sector in the fund&#39;s portfolio, based on FactSet RBICS classification. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


