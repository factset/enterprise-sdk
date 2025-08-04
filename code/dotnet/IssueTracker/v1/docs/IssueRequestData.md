# FactSet.SDK.IssueTracker.Model.IssueRequestData
create issue request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Subject** | **string** | subject for new Issue Tracker issue | 
**Description** | **string** | Comprehensive description of the issue, including any problems you&#39;ve observed or any specific changes you&#39;d like to request. | 
**ProductId** | **string** | Issue Tracker product  | 
**CategoryId** | **string** | category of Factset Product.  | [optional] 
**Severity** | **string** | severity of issue tracker ticket. Mainly it accepting three severities.  Critical, High and Medium. | [optional] 
**Attachments** | [**List&lt;Attachment&gt;**](Attachment.md) |  | [optional] 
**ConnectorId** | **string** | Id / GUID of the external system where Factset needs to sync back the data. Product should have the settings configured- Please reach out to factset product support team. | [optional] 
**ConnectorDisplayId** | **string** | User friendly Display ID of the external System | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

