

# SMRetrieveResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**securityName** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**location** | **String** |  |  [optional]
**asofdate** | **String** |  |  [optional]
**fields** | **Map&lt;String, Object&gt;** | A map of dynamic key-value pairs representing security fields. | 
**error** | [**Error**](Error.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
CREATED | &quot;Created&quot;
FAILED | &quot;Failed&quot;


## Implemented Interfaces

* Serializable


