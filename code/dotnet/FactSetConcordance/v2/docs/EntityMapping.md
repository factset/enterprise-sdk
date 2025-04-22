# FactSet.SDK.FactSetConcordance.Model.EntityMapping
Concordance Company Entity Mapping object. Shows the mapping detail related to user's universe. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntityId** | **string** | FactSet Entity Identifier of the entity matched to the submitted entity | [optional] 
**EntityName** | **string** | Full name corresponding to the matched entity. | [optional] 
**ClientId** | **string** | User-defined unique identifier provided by the user in the request | [optional] 
**ClientName** | **string** | Name of the entity to match as specified in the request. | [optional] 
**ClientCountry** | **string** | ISO2 country code specified in the request | [optional] 
**ClientState** | **string** | State code specified in the request | [optional] 
**ClientPriority** | **string** | Priority associated to the id. | [optional] 
**ClientBbgFigi** | **string** | Name as provided by the user for the type Bloomberg listing/regional/security id. | [optional] 
**ClientBbgTicker** | **string** | Name as provided by the user for the type Bloomberg listing and regional ticker. | [optional] 
**ClientBic** | **string** | Name as provided by the user for the type BIC - Bank Indentification Code. | [optional] 
**ClientCik** | **string** | Name as provided by the user for the type CIK - Edgar Central Index Keys. | [optional] 
**ClientCrd** | **string** | Name as provided by the user for the type CRD - Central Registration Depository. | [optional] 
**ClientCusip** | **string** | Name as provided by the user for the type CUSIP. | [optional] 
**ClientEin** | **string** | Name as provided by the user for the type EIN - Employer Identification Number. | [optional] 
**ClientFactsetId** | **string** | Name as provided by the user for the type FactSet Identifier, FactSet -E,-S,-R, -L Permanent Identifier. | [optional] 
**ClientFitch** | **string** | Name as provided by the user for the type Fitch - Fitch Ratings Identifier. | [optional] 
**ClientGvkey** | **string** | Name as provided by the user for the type GVKEY, Compustat Global Company Key. | [optional] 
**ClientGvkeyIid** | **string** | Name as provided by the user for the type GVKEY+IID, Compustat Global Company Key and Issue Identifier. | [optional] 
**ClientIsin** | **string** | Name as provided by the user for the type ISIN - International Securities Identification Number. | [optional] 
**ClientJcn** | **string** | Name as provided by the user for the type JCN , Japanese Corporate Number. | [optional] 
**ClientLei** | **string** | Name as provided by the user for the type LEI - Legal Entity Identifier. | [optional] 
**ClientLxid** | **string** | Name as provided by the user for the type LXID, Markit Syndicated Loan Identifier. | [optional] 
**ClientMd** | **string** | Name as provided by the user for the type Moody&#39;s ratings identifier. | [optional] 
**ClientRedCode** | **string** | Name as provided by the user for the type RedCode, Markit Reference Entity Identifier. | [optional] 
**ClientRssd** | **string** | Name as provided by the user for the type RSSD - Federal Reserve RSSD Identifier. | [optional] 
**ClientSedol** | **string** | Name as provided by the user for the type SEDOL. | [optional] 
**ClientSpr** | **string** | Name as provided by the user for the type S&amp;P ratings identifier. | [optional] 
**ClientTicker** | **string** | Name as provided by the user for the type price ticker. | [optional] 
**ClientTickerExchange** | **string** | Name as provided by the user for the type ticker exchange. | [optional] 
**ClientTickerRegion** | **string** | Name as provided by the user for the type ticker region. | [optional] 
**ClientUkch** | **string** | Name as provided by the user for the type UK company house identifier. | [optional] 
**ClientValoren** | **string** | Name as provided by the user for the type Valoren - Valor Identification. | [optional] 
**ClientWkn** | **string** | Name as provided by the user for the type WKN - German Securities Identification. | [optional] 
**ClientAdditionalContext** | **Dictionary&lt;string, string&gt;** | Any additional context column along with their values in the input file or single search.  To be used by Managed Service for any unmapped records.  | [optional] 
**ClientUrl** | **string** | URL specified in the request | [optional] 
**CreatedTime** | **DateTime?** | Time when entity was created in UTC. | [optional] 
**UpdatedTime** | **DateTime?** | Time when the submitted entity was last updated in UTC. | [optional] 
**MapStatus** | **string** | Current status of the entity mapping. | [optional] 
**UniverseId** | **int?** | The universe this mapping belongs to. Only set in v2 endpoints  | [optional] 
**ClientExcludeEntityType** | **List&lt;string&gt;** | Entity types excluded by the user. If provided, entities with the specified entity types will not be considered.  | [optional] 
**ClientExcludeEntitySubType** | **List&lt;string&gt;** | Entity sub-types excluded by the user. If provided, entities with the specified entity sub-types will not be considered.  | [optional] 
**ClientIncludeEntityType** | **List&lt;string&gt;** | Entity types included by the user. If provided, only entities with the specified entity types will be considered.  | [optional] 
**ClientIncludeEntitySubType** | **List&lt;string&gt;** | Entity sub-types included by the user. If provided, only entities with the specified entity sub-types will be considered.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

