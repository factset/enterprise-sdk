# FactSet.SDK.FactSetTickHistory.Model.DateTimePeriod
 NOTE:       - Using start and end parameters within dateTimeRange will fetch the data on particular days in between the timestamps given.      - The start and end times are processed as the local time of the factsetExchangeCode provided. Please refer to the **Data Model User Guide** for time zone to exchange mappings. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Start** | **DateTime** | The date for (or from which) the data is required. Supports in YYYY-MM-DDTHH:MM:SSZ format.   | [optional] 
**End** | **DateTime** | The date to which data is required. Supports in YYYY-MM-DDTHH:MM:SSZ format.   | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

