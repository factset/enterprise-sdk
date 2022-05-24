# MIAPIPostRequest

Post request allows users to pass the necessary parameters such as the report name, identifier, id type, time zone, and report content.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_name** | **str** | report name | [optional] 
**identifier** | **str** | Index or portfolio for which the report to be created. | [optional] 
**id_type** | **str** | identifier type | [optional] 
**time_zone** | **str** | Time zone for the report (this shall be utilized if a user wants to use the report via API and also from Workstation/web). | [optional] 
**content** | [**[PostRequestExample]**](PostRequestExample.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


