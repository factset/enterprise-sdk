

# EntityMappingRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**universeId** | **Integer** | The universe to save this mapping to. | 
**clientId** | **String** | A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe. | 
**entityId** | **String** | FactSet Entity Identifier mapped to the submitted entity. |  [optional]
**clientName** | **String** | Name of entity to match. | 
**clientCountry** | **String** | ISO2 country code corresponding to the Entity name. |  [optional]
**clientState** | **String** | ISO Code of State or Province location to map Entity. |  [optional]
**clientUrl** | **String** | URL corresponding to the entity name. |  [optional]
**clientBbgFigi** | **String** | User provided input for Bloomberg Listing/Regional/Security ID symbol type. |  [optional]
**clientBbgTicker** | **String** | User provided input for Bloomberg Listing and Regional Ticker symbol type. |  [optional]
**clientBic** | **String** | User provided input for BICCode, bank indentification code symbol type. |  [optional]
**clientCik** | **String** | User provided input for CIK, Edgar Central Index Keys symbol type. |  [optional]
**clientCrd** | **String** | User provided input for CRD, Central Registration Depository symbol type. |  [optional]
**clientCusip** | **String** | User provided input for CUSIP symbol type. |  [optional]
**clientDuns** | **String** | User provided input for DUNS, Dun&amp;Bradstreet symbol type. |  [optional]
**clientEin** | **String** | User provided input for EmployerIdentificationNumber, EIN symbol type. |  [optional]
**clientFactsetId** | **String** | User provided input for FactSet Identifier, FactSet -E,-S,-R, -L Permanent Identifier symbol type. |  [optional]
**clientFitch** | **String** | User provided input for FitchCreditRating, Fitch Ratings Identifier symbol type. |  [optional]
**clientGvkeyIid** | **String** | User provided input for GVKEY+IID, Compustat Global Company Key and Issue Identifier symbol type. |  [optional]
**clientGvkey** | **String** | User provided input for GVKEY, Compustat Global Company Key symbol type. |  [optional]
**clientIsin** | **String** | User provided input for ISIN symbol type. |  [optional]
**clientJcn** | **String** | User provided input for JCN , Japanese Corporate Number symbol type. |  [optional]
**clientLei** | **String** | User provided input for LegalEntityIdentifier, LEI symbol type. |  [optional]
**clientLxid** | **String** | User provided input for LXID, Markit Syndicated Loan Identifier symbol type. |  [optional]
**clientMd** | **String** | User provided input for MoodysIssuer, Moody&#39;s Ratings Identifier symbol type. |  [optional]
**clientTicker** | **String** | User provided input for PriceTicker symbol type. |  [optional]
**clientPriority** | **String** | Name of the priority column as provided by the user. |  [optional]
**clientRedCode** | **String** | User provided input for RedCode, Markit Reference Entity Identifier symbol type. |  [optional]
**clientRssd** | **String** | User provided input for FederalReserveRSSDIdentifier, RSSD symbol type. |  [optional]
**clientSedol** | **String** | User provided input for SEDOL symbol type. |  [optional]
**clientSpr** | **String** | User provided input for S&amp;PRating, S&amp;P Ratings Identifier. |  [optional]
**clientTickerExchange** | **String** | User provided input for TickerExch symbol type. |  [optional]
**clientTickerRegion** | **String** | User provided input for TickerRegion symbol type |  [optional]
**clientUkch** | **String** | User provided input for UKCompanyHouse symbol type |  [optional]
**clientValoren** | **String** | User provided input for VALOR, Valoren (\&quot;Valor\&quot;) Identification symbol type. |  [optional]
**clientWkn** | **String** | User provided input for WKN, German Securities Identification symbol type. |  [optional]
**clientAdditionalContext** | **Map&lt;String, String&gt;** | Any additional context information that can be saved along with other input values for mapping. To be used by Managed Service for mapping any unmapped records.   |  [optional]


## Implemented Interfaces

* Serializable


