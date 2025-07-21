

# IssueData

issue response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | generated issue id for Issue Tracker |  [optional]
**subject** | **String** | subject of Issue Tracker issue |  [optional]
**comments** | [**java.util.List&lt;Comment&gt;**](Comment.md) | array of comments added to issue |  [optional]
**severity** | **String** | severity of issue tracker ticket |  [optional]
**internalId** | **Integer** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
CLOSED | &quot;Closed&quot;
RECEIVED | &quot;Received&quot;
IN_PROGRESS | &quot;In Progress&quot;


## Implemented Interfaces

* Serializable


