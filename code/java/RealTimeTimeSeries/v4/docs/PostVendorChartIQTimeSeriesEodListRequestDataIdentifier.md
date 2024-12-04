

# PostVendorChartIQTimeSeriesEodListRequestDataIdentifier

Identifier and type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | Identifier to resolve. | 
**type** | [**TypeEnum**](#TypeEnum) | Type of the identifier. An instrument level identifier is resolved to a listing level identifier according to the configured listing selection rules. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier, identifying the primary listing in the region. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol, identifying the primary listing in the region. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   | 



## Enum: TypeEnum

Name | Value
---- | -----
IDINSTRUMENT | &quot;idInstrument&quot;
IDNOTATION | &quot;idNotation&quot;
FDSPERMANENTIDENTIFIERSECURITY | &quot;fdsPermanentIdentifierSecurity&quot;
FDSPERMANENTIDENTIFIERLISTING | &quot;fdsPermanentIdentifierListing&quot;
FDSPERMANENTIDENTIFIERREGIONAL | &quot;fdsPermanentIdentifierRegional&quot;
TICKEREXCHANGE | &quot;tickerExchange&quot;
TICKERREGION | &quot;tickerRegion&quot;
SEDOL | &quot;sedol&quot;
ISIN | &quot;isin&quot;
WKN | &quot;wkn&quot;
VALOR | &quot;valor&quot;
CUSIP | &quot;cusip&quot;


## Implemented Interfaces

* Serializable


