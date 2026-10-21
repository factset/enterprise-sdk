

# NextStep

A serialized list of 'action' items associated with the query response. The current supported actions are as below: * OpenUrl: Contains a URL to open relevant supporting content in the FactSet Workstation or other FactSet applications * Download: Contains a file ID to download a file associated with the response 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Datatype contained in this data object | 
**value** | [**java.util.List&lt;NextStepItem&gt;**](NextStepItem.md) | List of NextStep action items | 



## Enum: TypeEnum

Name | Value
---- | -----
NEXTSTEP | &quot;NextStep&quot;


## Implemented Interfaces

* Serializable


