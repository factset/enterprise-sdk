# CheckstatusResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job_id** | **str** | Unique id to get the xml files for the requested date | [optional] 
**status** | **str** | Returns any of the 2 results Submitted -&gt;Running-&gt;Completed and Failed | [optional] 
**percent_done** | **int** | Returns how much percentage of  task is completed for the requested jobID | [optional] 
**start_date** | **date** | The date from which the data is required in YYYY-MM-DDTHH:MM:SSZ format | [optional] 
**end_date** | **date** | The date until which the data is fetched in YYYY-MM-DDTHH:MM:SSZ format | [optional] 
**part** | **int** | Returns the part number of the jobID | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


