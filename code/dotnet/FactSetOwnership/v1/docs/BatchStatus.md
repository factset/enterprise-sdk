# FactSet.SDK.FactSetOwnership.Model.BatchStatus
Details the current status of a given batch request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Guid** | the id of batch request. | [optional] 
**StartTime** | **DateTime** | The time when the batch request was initiated. This is in Eastern Time Zone. The date-time format is expressed as [YYYY-MM-DD]T[HH:MM:SSS], following ISO 8601. | [optional] 
**EndTime** | **DateTime?** | The time when the batch request was completed. This is in Eastern Time Zone. The date-time format is expressed as [YYYY-MM-DD]T[HH:MM:SSS], following ISO 8601. | [optional] 
**Status** | **string** | The status signifies the current state of the batch request that can be &#39;queued&#39;, &#39;executing&#39;, &#39;created&#39;, or &#39;failed&#39;. | [optional] 
**Error** | [**BatchErrorObject**](BatchErrorObject.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

