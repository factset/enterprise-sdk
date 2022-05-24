# SasbSpotlightsRequest

SASB Spotlights Request Body

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**PaiIds**](PaiIds.md) |  | 
**categories** | [**SasbSpotlightsCategories**](SasbSpotlightsCategories.md) |  | [optional] 
**fields** | [**FieldsSasbSpotlights**](FieldsSasbSpotlights.md) |  | [optional] 
**start_date** | **str** | The start date requested for a given date range in YYYY-MM-DD format. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**end_date** | **str** | The end date requested for a given date range in YYYY-MM-DD format. The input end date must be after the input start date. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**primary_only** | **bool** | Return only primary spotlights when set to true  | [optional]  if omitted the server will use the default value of True
**is_removed** | **bool** | This parameter would return the spotlights removed in the response(i.e. Spotlight is marked as Rejected but has a firstApprovedOnDate))when set to &#x60;true&#x60; Only Spotlights that are marked as approved will be returned when set to &#x60;false&#x60;  | [optional]  if omitted the server will use the default value of False
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


