

# IssueRequestData

create issue request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subject** | **String** | subject for new Issue Tracker issue | 
**description** | **String** | Comprehensive description of the issue, including any problems you&#39;ve observed or any specific changes you&#39;d like to request. | 
**productId** | **String** | Issue Tracker product  | 
**categoryId** | **String** | category of Factset Product.  |  [optional]
**severity** | **String** | severity of issue tracker ticket. Mainly it accepting three severities.  Critical, High and Medium. |  [optional]
**attachments** | [**java.util.List&lt;Attachment&gt;**](Attachment.md) |  |  [optional]
**connectorId** | **String** | Id / GUID of the external system where Factset needs to sync back the data. Product should have the settings configured- Please reach out to factset product support team. |  [optional]
**connectorDisplayId** | **String** | User friendly Display ID of the external System |  [optional]


## Implemented Interfaces

* Serializable


