

# EntitySecurities


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Ultimate Parent ID of the Requested Security ID |  [optional]
**fsymSecurityId** | **String** | FactSet Security ID (-S). |  [optional]
**fsymListingId** | **String** | FactSet Listing ID (-L). Corresponds to the listing exchange for the requested security. Not applicable for FI instruments. |  [optional]
**securityType** | [**SecurityTypeEnum**](#SecurityTypeEnum) | The Security Type Code. Security Type Code details and mapping are described on Online Assistant Page 15776 for Equity and Page 16014 for Fixed Income. |  [optional]
**listingExchange** | **String** | The securities primary listing exchange. |  [optional]
**securityName** | **String** | Security name |  [optional]
**fsymEntityId** | **String** | Unique FactSet-generated identifier representing an entity. |  [optional]
**fsymTickerExchange** | **String** | The security&#39;s ticker-exchange, representing the listing exchange symbol. |  [optional]
**fsymTickerRegion** | **String** | The security&#39;s regional ticker. |  [optional]
**activeFlag** | [**ActiveFlagEnum**](#ActiveFlagEnum) | Indicates if security is active. 1 &#x3D; Active; 0 &#x3D; Inactive. |  [optional]
**requestId** | **String** | Identifier used in &#x60;ids&#x60; parameter.  When list of identifiers used, they will be parsed and resolved individually. |  [optional]



## Enum: SecurityTypeEnum

Name | Value
---- | -----
SHARE | &quot;SHARE&quot;
PREFEQ | &quot;PREFEQ&quot;
MF_C | &quot;MF_C&quot;
MF_O | &quot;MF_O&quot;
ETF_ETF | &quot;ETF_ETF&quot;
ETF_UVI | &quot;ETF_UVI&quot;
ETF_NAV | &quot;ETF_NAV&quot;
ADR | &quot;ADR&quot;
GDR | &quot;GDR&quot;
NVDR | &quot;NVDR&quot;
DR | &quot;DR&quot;
ALIEN | &quot;ALIEN&quot;
PREF | &quot;PREF&quot;
WARRANT | &quot;WARRANT&quot;
RIGHT | &quot;RIGHT&quot;
UNIT | &quot;UNIT&quot;
STRUCT | &quot;STRUCT&quot;
TEMP | &quot;TEMP&quot;
CONV | &quot;CONV&quot;
BDNT | &quot;BDNT&quot;
PFD | &quot;PFD&quot;
PASS | &quot;PASS&quot;
MM | &quot;MM&quot;
RMBS | &quot;RMBS&quot;
ABS | &quot;ABS&quot;
COVR | &quot;COVR&quot;
LKS | &quot;LKS&quot;
LAUTH | &quot;LAUTH&quot;
BLDN | &quot;BLDN&quot;
CMBS | &quot;CMBS&quot;



## Enum: ActiveFlagEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1


## Implemented Interfaces

* Serializable


