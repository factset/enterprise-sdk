# SfdrPaiRequest

SFDR PAI Indicators Request Body

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**PaiIds**](PaiIds.md) |  | 
**feelback** | **bool** | This parameter would return the latest PAI data based on the indicators or subtopics requested. The parameter should not be used in conjuction &#x60;fiscalPeriodStart&#x60; and &#x60;fiscalPeriodEnd&#x60;  | [optional]  if omitted the server will use the default value of False
**fiscal_period_start** | **str** | Fiscal period start is expressed in YYYY formats. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**fiscal_period_end** | **str** | Fiscal period end is expressed in YYYY formats. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**indicators** | [**Indicators**](Indicators.md) |  | [optional] 
**calculation** | **bool** | This parameter would return the PAI data based on the input provided. All the data for indicators or subtopics requested are returned when the input is &#x60;true&#x60; and the SFDR required metrics are only returned when the input is&#x60;false&#x60;  | [optional]  if omitted the server will use the default value of True
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


