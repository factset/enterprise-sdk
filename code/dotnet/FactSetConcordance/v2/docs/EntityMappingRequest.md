# FactSet.SDK.FactSetConcordance.Model.EntityMappingRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UniverseId** | **int** | The universe to save this mapping to. | 
**ClientId** | **string** | A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe. | 
**EntityId** | **string** | FactSet Entity Identifier mapped to the submitted entity. | [optional] 
**ClientName** | **string** | Name of entity to match. | 
**ClientCountry** | **string** | ISO2 country code corresponding to the Entity name. | [optional] 
**ClientState** | **string** | ISO Code of State or Province location to map Entity. | [optional] 
**ClientUrl** | **string** | URL corresponding to the entity name. | [optional] 
**ClientBbgFigi** | **string** | User provided input for Bloomberg Listing/Regional/Security ID symbol type. | [optional] 
**ClientBbgTicker** | **string** | User provided input for Bloomberg Listing and Regional Ticker symbol type. | [optional] 
**ClientBic** | **string** | User provided input for BICCode, bank indentification code symbol type. | [optional] 
**ClientCik** | **string** | User provided input for CIK, Edgar Central Index Keys symbol type. | [optional] 
**ClientCrd** | **string** | User provided input for CRD, Central Registration Depository symbol type. | [optional] 
**ClientCusip** | **string** | User provided input for CUSIP symbol type. | [optional] 
**ClientEin** | **string** | User provided input for EmployerIdentificationNumber, EIN symbol type. | [optional] 
**ClientFactsetId** | **string** | User provided input for FactSet Identifier, FactSet -E,-S,-R, -L Permanent Identifier symbol type. | [optional] 
**ClientFitch** | **string** | User provided input for FitchCreditRating, Fitch Ratings Identifier symbol type. | [optional] 
**ClientGvkeyIid** | **string** | User provided input for GVKEY+IID, Compustat Global Company Key and Issue Identifier symbol type. | [optional] 
**ClientGvkey** | **string** | User provided input for GVKEY, Compustat Global Company Key symbol type. | [optional] 
**ClientIsin** | **string** | User provided input for ISIN symbol type. | [optional] 
**ClientJcn** | **string** | User provided input for JCN , Japanese Corporate Number symbol type. | [optional] 
**ClientLei** | **string** | User provided input for LegalEntityIdentifier, LEI symbol type. | [optional] 
**ClientLxid** | **string** | User provided input for LXID, Markit Syndicated Loan Identifier symbol type. | [optional] 
**ClientMd** | **string** | User provided input for MoodysIssuer, Moody&#39;s Ratings Identifier symbol type. | [optional] 
**ClientTicker** | **string** | User provided input for PriceTicker symbol type. | [optional] 
**ClientPriority** | **string** | Name of the priority column as provided by the user. | [optional] 
**ClientRedCode** | **string** | User provided input for RedCode, Markit Reference Entity Identifier symbol type. | [optional] 
**ClientRssd** | **string** | User provided input for FederalReserveRSSDIdentifier, RSSD symbol type. | [optional] 
**ClientSedol** | **string** | User provided input for SEDOL symbol type. | [optional] 
**ClientSpr** | **string** | User provided input for S&amp;PRating, S&amp;P Ratings Identifier. | [optional] 
**ClientTickerExchange** | **string** | User provided input for TickerExch symbol type. | [optional] 
**ClientTickerRegion** | **string** | User provided input for TickerRegion symbol type | [optional] 
**ClientUkch** | **string** | User provided input for UKCompanyHouse symbol type | [optional] 
**ClientValoren** | **string** | User provided input for VALOR, Valoren (\&quot;Valor\&quot;) Identification symbol type. | [optional] 
**ClientWkn** | **string** | User provided input for WKN, German Securities Identification symbol type. | [optional] 
**ClientAdditionalContext** | **Dictionary&lt;string, string&gt;** | Any additional context information that can be saved along with other input values for mapping. To be used by Managed Service for mapping any unmapped records.   | [optional] 
**ClientExcludeEntityType** | **List&lt;string&gt;** | Entity types excluded by the user. If the request contains a FactSet identifier, this field is ignored and the provided FactSet identifier is the match.  If the request does not contain a FactSet identifier, it is saved with the submitted metadata and may be used for mapping (self or by FactSet Managed Services).  | [optional] 
**ClientExcludeEntitySubType** | **List&lt;string&gt;** | Entity sub-types excluded by the user. If the request contains a FactSet identifier, this field is ignored and the provided FactSet identifier is the match.  If the request does not contain a FactSet identifier, it is saved with the submitted metadata and may be used for mapping (self or by FactSet Managed Services).  | [optional] 
**ClientIncludeEntityType** | **List&lt;string&gt;** | Entity types included by the user. If the request contains a FactSet identifier, this field is ignored and the provided FactSet identifier is the match.  If the request does not contain a FactSet identifier, it is saved with the submitted metadata and may be used for mapping (self or by FactSet Managed Services).  | [optional] 
**ClientIncludeEntitySubType** | **List&lt;string&gt;** | Entity sub-types included by the user. If the request contains a FactSet identifier, this field is ignored and the provided FactSet identifier is the match.  If the request does not contain a FactSet identifier, it is saved with the submitted metadata and may be used for mapping (self or by FactSet Managed Services).  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

