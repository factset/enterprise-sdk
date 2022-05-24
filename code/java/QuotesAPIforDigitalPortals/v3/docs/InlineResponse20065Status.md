

# InlineResponse20065Status

Error status for the requested identifier

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**CodeEnum**](#CodeEnum) | Code of the error condition. |  [optional]
**identifier** | **String** | Provided identifier. |  [optional]
**encryptedDetails** | **String** | Base64-encoded internal details about the error. |  [optional]



## Enum: CodeEnum

Name | Value
---- | -----
NONE | &quot;none&quot;
PARAMETER | &quot;parameter&quot;
ENTITLEMENT | &quot;entitlement&quot;


## Implemented Interfaces

* Serializable


