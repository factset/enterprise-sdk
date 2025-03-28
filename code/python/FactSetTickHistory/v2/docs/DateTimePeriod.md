# DateTimePeriod

 NOTE:       - Using start and end parameters within dateTimeRange will fetch the data on particular days in between the timestamps given.      - The start and end times are processed as the local time of the factsetExchangeCode provided. Please refer to the **Data Model User Guide** for time zone to exchange mappings.      - Supports milliseconds, YYYY-MM-DDTHH:MM:SS.SSSZ where .SSS represents the milliseconds which is optional. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | **datetime** | The date for (or from which) the data is required. Supports in YYYY-MM-DDTHH:MM:SSZ format.   | [optional] 
**end** | **datetime** | The date to which data is required. Supports in YYYY-MM-DDTHH:MM:SSZ format.   | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


