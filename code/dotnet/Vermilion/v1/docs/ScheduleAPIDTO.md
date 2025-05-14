# FactSet.SDK.Vermilion.Model.ScheduleAPIDTO
Schedule along with an extra property to indicate the task generation log warning(s)/error(s)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ScheduleId** | **int** | Unique identifier of the Schedule. | [optional] 
**Name** | **string** | Name of the Schedule. | [optional] 
**DefinitionName** | **string** | Name of Schedule Definition from which the Schedule has been generated. | [optional] 
**Status** | **string** | Status of the Schedule. | [optional] 
**ScheduleGroup** | **string** | Group of the Schedule. | [optional] 
**ReportDate** | **string** | The timestamp of the report date in epoch format for a specific Schedule | [optional] 
**NoOfTasks** | **int** | No of tasks generated for the Schedule | [optional] 
**BusinessCalendar** | **string** | Name of Business Calender used in the Schedule | [optional] 
**Owner** | **string** | Owner role used in the Schedule | [optional] 
**Notes** | **string** | Notes of the Schedule | [optional] 
**FinishDate** | **string** | The timestamp of the Finish Date in epoch format of the Schedule | [optional] 
**StartDate** | **string** | The timestamp of the Start Date in epoch format of the Schedule | [optional] 
**LastUpdatedBy** | **string** | Indicates the username of the person who last updated Schedule | [optional] 
**LastUpdated** | **string** | The timestamp of the most recent update in epoch format for a specific Schedule | [optional] 
**HasTaskGenIssues** | **bool** | A flag that specifies if task generation has warning or error logs. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

