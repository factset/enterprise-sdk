# FactSet.SDK.FactSetConcordance.Model.EntityMatchRequestInput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | The Name of the entity to match. | 
**ClientId** | **string** | A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe.  | [optional] 
**Country** | **string** | ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754).  | [optional] 
**State** | **string** | Two-character state code corresponding to the entity name that is used when evaluating candidates for a match. Currently, only US state codes are supported.Two character state or province code to filter on.  | [optional] 
**Url** | **string** | URL corresponding to the entity name that is used when evaluating candidates for a match.  | [optional] 
**Priority** | **string** | Priority associated to the id. | [optional] 
**BbgFigi** | **string** | Name for the type Bloomberg Listing/Regional/Security ID. | [optional] 
**BbgTicker** | **string** | Name for the type Bloomberg Listing and Regional Ticker. | [optional] 
**Bic** | **string** | Name for type BICCode, bank indentification code | [optional] 
**Cik** | **string** | Name for the type CIK, Edgar Central Index Keys | [optional] 
**Crd** | **string** | Name for the type CRD, Central Registration Depository | [optional] 
**Cusip** | **string** | Name for the type CUSIP. | [optional] 
**Duns** | **string** | Name for the type DUNS, Dun&amp;Bradstreet. | [optional] 
**Ein** | **string** | Name for the type EmployerIdentificationNumber, EIN. | [optional] 
**FactsetId** | **string** | Name for the type FactSet Identifier, FactSet -E,-S,-R, -L Permanent Identifier. | [optional] 
**Fitch** | **string** | Name for the type FitchCreditRating, Fitch Ratings Identifier. | [optional] 
**Gvkey** | **string** | Name for the type GVKEY, Compustat Global Company Key. | [optional] 
**GvkeyIid** | **string** | Name for the type GVKEY+IID, Compustat Global Company Key and Issue Identifier. | [optional] 
**Isin** | **string** | Name for the type ISIN. | [optional] 
**Jcn** | **string** | Name for the type JCN , Japanese Corporate Number. | [optional] 
**Lei** | **string** | Name for the type LegalEntityIdentifier, LEI. | [optional] 
**Lxid** | **string** | Name for the type LXID, Markit Syndicated Loan Identifier. | [optional] 
**Md** | **string** | Name for the type MoodysIssuer, Moody&#39;s Ratings Identifier. | [optional] 
**RedCode** | **string** | Name for the type RedCode, Markit Reference Entity Identifier. | [optional] 
**Rssd** | **string** | Name for the type FederalReserveRSSDIdentifier, RSSD. | [optional] 
**Sedol** | **string** | Name for the type SEDOL. | [optional] 
**Spr** | **string** | Name for the type S&amp;PRating, S&amp;P Ratings Identifier. | [optional] 
**Ticker** | **string** | Name for the type PriceTicker. | [optional] 
**TickerExchange** | **string** | Name for the type TickerExch. | [optional] 
**TickerRegion** | **string** | Name for the type TickerRegion | [optional] 
**Ukch** | **string** | Name for the type UKCompanyHouse | [optional] 
**Valoren** | **string** | Name for the type VALOR, Valoren (\&quot;Valor\&quot;) Identification. | [optional] 
**Wkn** | **string** | Name for the type WKN, German Securities Identification. | [optional] 
**AdditionalContext** | **Dictionary&lt;string, string&gt;** | Any additional context information along with other input values that need to be saved for an entity during search.  To be used by Managed Service for any unmapped records.  This is applicable when saving the records with clientId and universeId specified.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

