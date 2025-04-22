# EntityMatchRequestInput


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The Name of the entity to match. | 
**client_id** | **str** | A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe.  | [optional] 
**country** | **str** | ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754#country).  | [optional] 
**state** | **str** | Two-character state code corresponding to the entity name that is used when evaluating candidates for a match. Currently, only US state codes are supported.Two character state or province code to filter on.  | [optional] 
**url** | **str** | URL corresponding to the entity name that is used when evaluating candidates for a match.  | [optional] 
**priority** | **str** | Priority associated to the id. | [optional] 
**bbg_figi** | **str** | Name for the type Bloomberg Listing/Regional/Security ID. | [optional] 
**bbg_ticker** | **str** | Name for the type Bloomberg Listing and Regional Ticker. | [optional] 
**bic** | **str** | Name for type BICCode, bank indentification code | [optional] 
**cik** | **str** | Name for the type CIK, Edgar Central Index Keys | [optional] 
**crd** | **str** | Name for the type CRD, Central Registration Depository | [optional] 
**cusip** | **str** | Name for the type CUSIP. | [optional] 
**ein** | **str** | Name for the type EmployerIdentificationNumber, EIN. | [optional] 
**factset_id** | **str** | Name for the type FactSet Identifier, FactSet -E,-S,-R, -L Permanent Identifier. | [optional] 
**fitch** | **str** | Name for the type FitchCreditRating, Fitch Ratings Identifier. | [optional] 
**gvkey** | **str** | Name for the type GVKEY, Compustat Global Company Key. | [optional] 
**gvkey_iid** | **str** | Name for the type GVKEY+IID, Compustat Global Company Key and Issue Identifier. | [optional] 
**isin** | **str** | Name for the type ISIN. | [optional] 
**jcn** | **str** | Name for the type JCN , Japanese Corporate Number. | [optional] 
**lei** | **str** | Name for the type LegalEntityIdentifier, LEI. | [optional] 
**lxid** | **str** | Name for the type LXID, Markit Syndicated Loan Identifier. | [optional] 
**md** | **str** | Name for the type MoodysIssuer, Moody&#39;s Ratings Identifier. | [optional] 
**red_code** | **str** | Name for the type RedCode, Markit Reference Entity Identifier. | [optional] 
**rssd** | **str** | Name for the type FederalReserveRSSDIdentifier, RSSD. | [optional] 
**sedol** | **str** | Name for the type SEDOL. | [optional] 
**spr** | **str** | Name for the type S&amp;PRating, S&amp;P Ratings Identifier. | [optional] 
**ticker** | **str** | Name for the type PriceTicker. | [optional] 
**ticker_exchange** | **str** | Name for the type TickerExch. | [optional] 
**ticker_region** | **str** | Name for the type TickerRegion | [optional] 
**ukch** | **str** | Name for the type UKCompanyHouse | [optional] 
**valoren** | **str** | Name for the type VALOR, Valoren (\&quot;Valor\&quot;) Identification. | [optional] 
**wkn** | **str** | Name for the type WKN, German Securities Identification. | [optional] 
**additional_context** | **{str: (str,)}** | Any additional context information along with other input values that need to be saved for an entity during search.  To be used by Managed Service for any unmapped records.  This is applicable when saving the records with clientId and universeId specified.  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


