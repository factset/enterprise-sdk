# UploadStatusResponseParameters

Uploaded status response parameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acfp_status** | **str** | The ACFP status of the uploaded file, can be one of the following: - &#x60;pending&#x60;: File validation is pending. - &#x60;validating&#x60;:File is being validated. - &#x60;error&#x60;: File failed validation.  - &#x60;replicating&#x60;: File is being copied. - &#x60;good&#x60;: File is successfully validated. - &#x60;preparing&#x60;: File is being parsed.  - &#x60;uninitiated&#x60;: File upload is not initiated. | [optional] 
**as_of_date** | **date** | Scenario As of Date | [optional] 
**file_name** | **str** | Actuarial Scenario file name | [optional] 
**number_of_scenarios** | **float** | Number of scenarios that are within a scenario file | [optional] 
**status** | **str** | The status of the uploaded file, can be one of the following: | [optional] 
**type** | **str** | Actuarial Scenario File Type | [optional] 
**upload_date_time** | **datetime** | The time stamp when the file is uploaded | [optional] 
**upload_id** | **str** | Unique Identifier for the file | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


