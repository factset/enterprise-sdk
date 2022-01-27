# factsetentity.EntitySecurities

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Ultimate Parent ID of the Requested Security ID | [optional] 
**fsymSecurityId** | **String** | FactSet Security ID (-S). | [optional] 
**fsymListingId** | **String** | FactSet Listing ID (-L). Corresponds to the listing exchange for the requested security. Not applicable for FI instruments. | [optional] 
**securityType** | **String** | The Security Type Code. Security Type Code details and mapping are described on Online Assistant Page 15776 for Equity and Page 16014 for Fixed Income. | [optional] 
**listingExchange** | **String** | The securities primary listing exchange. | [optional] 
**securityName** | **String** | Security name | [optional] 
**fsymEntityId** | **String** | Unique FactSet-generated identifier representing an entity. | [optional] 
**fsymTickerExchange** | **String** | The security&#39;s ticker-exchange, representing the listing exchange symbol. | [optional] 
**fsymTickerRegion** | **String** | The security&#39;s regional ticker. | [optional] 
**activeFlag** | **Number** | Indicates if security is active. 1 &#x3D; Active; 0 &#x3D; Inactive. | [optional] 
**requestId** | **String** | Identifier used in &#x60;ids&#x60; parameter.  When list of identifiers used, they will be parsed and resolved individually. | [optional] 



## Enum: SecurityTypeEnum


* `SHARE` (value: `"SHARE"`)

* `PREFEQ` (value: `"PREFEQ"`)

* `MF_C` (value: `"MF_C"`)

* `MF_O` (value: `"MF_O"`)

* `ETF_ETF` (value: `"ETF_ETF"`)

* `ETF_UVI` (value: `"ETF_UVI"`)

* `ETF_NAV` (value: `"ETF_NAV"`)

* `ADR` (value: `"ADR"`)

* `GDR` (value: `"GDR"`)

* `NVDR` (value: `"NVDR"`)

* `DR` (value: `"DR"`)

* `ALIEN` (value: `"ALIEN"`)

* `PREF` (value: `"PREF"`)

* `WARRANT` (value: `"WARRANT"`)

* `RIGHT` (value: `"RIGHT"`)

* `UNIT` (value: `"UNIT"`)

* `STRUCT` (value: `"STRUCT"`)

* `TEMP` (value: `"TEMP"`)

* `CONV` (value: `"CONV"`)

* `BDNT` (value: `"BDNT"`)

* `PFD` (value: `"PFD"`)

* `PASS` (value: `"PASS"`)

* `MM` (value: `"MM"`)

* `RMBS` (value: `"RMBS"`)

* `ABS` (value: `"ABS"`)

* `COVR` (value: `"COVR"`)

* `LKS` (value: `"LKS"`)

* `LAUTH` (value: `"LAUTH"`)

* `BLDN` (value: `"BLDN"`)

* `CMBS` (value: `"CMBS"`)





## Enum: ActiveFlagEnum


* `0` (value: `0`)

* `1` (value: `1`)




