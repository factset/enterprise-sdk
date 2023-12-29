# factsetconcordance.EntityMapping

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityId** | **String** | FactSet Entity Identifier of the entity matched to the submitted entity | [optional] 
**entityName** | **String** | Full name corresponding to the matched entity. | [optional] 
**clientId** | **String** | User-defined unique identifier provided by the user in the request | [optional] 
**clientName** | **String** | Name of the entity to match as specified in the request. | [optional] 
**clientCountry** | **String** | ISO2 country code specified in the request | [optional] 
**clientState** | **String** | State code specified in the request | [optional] 
**clientPriority** | **String** | Priority associated to the id. | [optional] 
**clientBbgFigi** | **String** | Name as provided by the user for the type Bloomberg listing/regional/security id. | [optional] 
**clientBbgTicker** | **String** | Name as provided by the user for the type Bloomberg listing and regional ticker. | [optional] 
**clientBic** | **String** | Name as provided by the user for the type BIC - Bank Indentification Code. | [optional] 
**clientCik** | **String** | Name as provided by the user for the type CIK - Edgar Central Index Keys. | [optional] 
**clientCrd** | **String** | Name as provided by the user for the type CRD - Central Registration Depository. | [optional] 
**clientCusip** | **String** | Name as provided by the user for the type CUSIP. | [optional] 
**clientDuns** | **String** | Name as provided by the user for the type DUNS - Dun &amp; Bradstreet Data Universal Numbering System. | [optional] 
**clientEin** | **String** | Name as provided by the user for the type EIN - Employer Identification Number. | [optional] 
**clientFactsetId** | **String** | Name as provided by the user for the type FactSet Identifier, FactSet -E,-S,-R, -L Permanent Identifier. | [optional] 
**clientFitch** | **String** | Name as provided by the user for the type Fitch - Fitch Ratings Identifier. | [optional] 
**clientGvkey** | **String** | Name as provided by the user for the type GVKEY, Compustat Global Company Key. | [optional] 
**clientGvkeyIid** | **String** | Name as provided by the user for the type GVKEY+IID, Compustat Global Company Key and Issue Identifier. | [optional] 
**clientIsin** | **String** | Name as provided by the user for the type ISIN - International Securities Identification Number. | [optional] 
**clientJcn** | **String** | Name as provided by the user for the type JCN , Japanese Corporate Number. | [optional] 
**clientLei** | **String** | Name as provided by the user for the type LEI - Legal Entity Identifier. | [optional] 
**clientLxid** | **String** | Name as provided by the user for the type LXID, Markit Syndicated Loan Identifier. | [optional] 
**clientMd** | **String** | Name as provided by the user for the type Moody&#39;s ratings identifier. | [optional] 
**clientRedCode** | **String** | Name as provided by the user for the type RedCode, Markit Reference Entity Identifier. | [optional] 
**clientRssd** | **String** | Name as provided by the user for the type RSSD - Federal Reserve RSSD Identifier. | [optional] 
**clientSedol** | **String** | Name as provided by the user for the type SEDOL. | [optional] 
**clientSpr** | **String** | Name as provided by the user for the type S&amp;P ratings identifier. | [optional] 
**clientTicker** | **String** | Name as provided by the user for the type price ticker. | [optional] 
**clientTickerExchange** | **String** | Name as provided by the user for the type ticker exchange. | [optional] 
**clientTickerRegion** | **String** | Name as provided by the user for the type ticker region. | [optional] 
**clientUkch** | **String** | Name as provided by the user for the type UK company house identifier. | [optional] 
**clientValoren** | **String** | Name as provided by the user for the type Valoren - Valor Identification. | [optional] 
**clientWkn** | **String** | Name as provided by the user for the type WKN - German Securities Identification. | [optional] 
**clientAdditionalContext** | **{String: String}** | Any additional context column along with their values in the input file or single search.  To be used by Managed Service for any unmapped records.  | [optional] 
**clientUrl** | **String** | URL specified in the request | [optional] 
**createdTime** | **Date** | Time when entity was created in UTC. | [optional] 
**updatedTime** | **Date** | Time when the submitted entity was last updated in UTC. | [optional] 
**mapStatus** | **String** | Current status of the entity mapping. | [optional] 
**universeId** | **Number** | The universe this mapping belongs to. Only set in v2 endpoints  | [optional] 



## Enum: MapStatusEnum


* `MAPPED` (value: `"MAPPED"`)

* `UNMAPPED` (value: `"UNMAPPED"`)

* `INDETERMINATE` (value: `"INDETERMINATE"`)




