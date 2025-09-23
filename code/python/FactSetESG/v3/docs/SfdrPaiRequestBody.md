# SfdrPaiRequestBody

SFDR PAI Indicators Request Body

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**PaiIds**](PaiIds.md) |  | 
**fiscal_period_start** | **date** | Fiscal period start is expressed in YYYY-MM-DD formats. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint.  | 
**fiscal_period_end** | **date** | Fiscal period end is expressed in YYYY-MM-DD formats. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint.  | 
**feelback** | **bool** | This parameter would return the latest PAI data/s based on the indicators, date range and/or subtopics requested.  | [optional]  if omitted the server will use the default value of False
**indicators** | [**Indicators**](Indicators.md) |  | [optional] 
**currency** | [**Currency**](Currency.md) |  | [optional] 
**calculation** | **bool** | This parameter would return the PAI data based on the input provided. All the data for indicators or subtopics requested are returned when the input is &#x60;true&#x60; and the SFDR required metrics are only returned when the input is&#x60;false&#x60;  | [optional]  if omitted the server will use the default value of True
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


