# PostCompanyLogoRequestDataIdentifier

Set of identifiers and their type.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | **[str]** | Set of identifiers to resolve. ***values*** limit &#x3D; 100 per request.  | 
**type** | **str** | Type of the identifier. Accepted values types include:  * **idInstrument** - MDG identifier of an instrument.  * **idNotation** - MDG identifier of a listing.  * **fdsPermanentIdentifierSecurity** - FactSet Permanent Identifier on security level.  * **fdsPermanentIdentifierListing** - FactSet Permanent Identifier on listing level.  * **fdsPermanentIdentifierRegional** - Regional FactSet Permanent Identifier.  * **tickerExchange** - FactSet market symbol of a listing.  * **tickerRegion** - Regional FactSet ticker symbol.  * **sedol** - SEDOL or IDII of a listing.  * **isin** - ISIN of an instrument.  * **wkn** - WKN of an instrument.  * **valor** - Valor number of an instrument.  * **cusip** - CUSIP or CINS identifier of an instrument  * **symbol** - Symbol of a listing  | 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


