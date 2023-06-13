

# PostNotationCategoryListRequestData

The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **String** | Identifier to resolve. | 
**identifierType** | [**IdentifierTypeEnum**](#IdentifierTypeEnum) | Type of the identifier. | 
**filter** | [**PostNotationCategoryListRequestDataFilter**](PostNotationCategoryListRequestDataFilter.md) |  |  [optional]



## Enum: IdentifierTypeEnum

Name | Value
---- | -----
IDNOTATION | &quot;idNotation&quot;
TICKEREXCHANGE | &quot;tickerExchange&quot;
TICKERREGION | &quot;tickerRegion&quot;
FDSPERMANENTIDENTIFIERLISTING | &quot;fdsPermanentIdentifierListing&quot;
FDSPERMANENTIDENTIFIERREGIONAL | &quot;fdsPermanentIdentifierRegional&quot;


## Implemented Interfaces

* Serializable


