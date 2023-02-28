

# SMRetrieveResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**securityName** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**location** | **String** |  |  [optional]
**asofdate** | **String** |  |  [optional]
**fields** | [**OneOfFieldsFields**](OneOfFieldsFields.md) |  |  [optional]
**errors** | [**java.util.List&lt;SMError&gt;**](SMError.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
SUCCESS | &quot;success&quot;
FAILURE | &quot;failure&quot;


## Implemented Interfaces

* Serializable


