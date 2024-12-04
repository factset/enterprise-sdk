

# PostNewsArticleListByInstrumentDataIdentifiersItemsStatus

Error status for the requested identifier.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**CodeEnum**](#CodeEnum) | Code of the error condition. | Value | Description | | --- | --- | | none | No error. | | parameter | The provided identifier does not refer to a valid instrument level identifier. | | entitlement | Not entitled to see data for the identifier. | | identifierMapping | Unable to resolve the provided identifier. |   |  [optional]
**identifier** | **String** | Provided identifier. |  [optional]
**details** | **String** | A human-readable, unstructured explanation specific to this occurrence of the problem. |  [optional]
**encryptedDetails** | **String** | Base64-encoded internal details about the error. |  [optional]



## Enum: CodeEnum

Name | Value
---- | -----
NONE | &quot;none&quot;
PARAMETER | &quot;parameter&quot;
ENTITLEMENT | &quot;entitlement&quot;
IDENTIFIERMAPPING | &quot;identifierMapping&quot;


## Implemented Interfaces

* Serializable


