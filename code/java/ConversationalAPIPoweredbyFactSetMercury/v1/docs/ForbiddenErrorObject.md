

# ForbiddenErrorObject

Single error object returned in response to a user without entitlements to a specific resource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **java.util.UUID** | Id of error | 
**title** | [**TitleEnum**](#TitleEnum) | Title of error | 
**code** | [**CodeEnum**](#CodeEnum) | Code of error | 
**detail** | **String** | Details of error | 



## Enum: TitleEnum

Name | Value
---- | -----
NOT_AUTHORIZED | &quot;Not Authorized&quot;



## Enum: CodeEnum

Name | Value
---- | -----
FORBIDDEN | &quot;forbidden&quot;


## Implemented Interfaces

* Serializable


