# FactSet.SDK.DocumentsDistributorDocuments.Model.Checkstatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**JobID** | **string** | Unique id to get the xml files for the requested date | [optional] 
**Status** | **string** | Returns any of the 2 results Submitted -&gt;Running-&gt;Completed and Failed | [optional] 
**PercentDone** | **int** | Returns how much percentage of  task is completed for the requested jobID | [optional] 
**StartDate** | **DateTime** | The date from which the data is required in YYYY-MM-DDTHH:MM:SSZ format | [optional] 
**EndDate** | **DateTime** | The date until which the data is fetched in YYYY-MM-DDTHH:MM:SSZ format | [optional] 
**Part** | **int** | Returns the part number of the jobID | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

