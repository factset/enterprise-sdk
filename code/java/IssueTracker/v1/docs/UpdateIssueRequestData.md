

# UpdateIssueRequestData

update request infomration for issue

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subject** | **String** | subject of ticket |  [optional]
**severity** | **String** | severity of issue. Accepts Critical, High and Medium for severity. |  [optional]
**productId** | **String** | ProductId that needs to be replaced |  [optional]
**categoryId** | **String** | Category that needs to be replaced |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status that need to be updated |  [optional]
**closeContent** | **String** | Comment for resolving the issue |  [optional]
**readOnly** | **Boolean** | Mark the issue read-only to stop further modifications.can be set only on closed cards and it value should be only true |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
IN_PROGRESS | &quot;In Progress&quot;
CLOSED | &quot;Closed&quot;
RECEIVED | &quot;Received&quot;


## Implemented Interfaces

* Serializable


