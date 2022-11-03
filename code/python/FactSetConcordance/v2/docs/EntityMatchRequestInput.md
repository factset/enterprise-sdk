# EntityMatchRequestInput


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The Name of the entity to match. | 
**client_id** | **str** | A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe.  | [optional] 
**country** | **str** | ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754).  | [optional] 
**state** | **str** | Two-character state code corresponding to the entity name that is used when evaluating candidates for a match. Currently, only US state codes are supported.Two character state or province code to filter on.  | [optional] 
**url** | **str** | URL corresponding to the entity name that is used when evaluating candidates for a match.  | [optional] 
**priority** | **str** | Priority associated to the id. | [optional] 
**bic** | **str** | Name for type BICCode, bank indentification code | [optional] 
**bbg_ticker** | **str** | Name for the type Bloomberg Listing and Regional Ticker. | [optional] 
**cik** | **str** | Name for the type CIK, Edgar Central Index Keys | [optional] 
**crd** | **str** | Name for the type CRD, Central Registration Depository | [optional] 
**cusip** | **str** | Name for the type CUSIP. | [optional] 
**duns** | **str** | Name for the type DUNS, Dun&amp;Bradstreet. | [optional] 
**ein** | **str** | Name for the type EmployerIdentificationNumber, EIN. | [optional] 
**rssd** | **str** | Name for the type FederalReserveRSSDIdentifier, RSSD. | [optional] 
**fitch** | **str** | Name for the type FitchCreditRating, Fitch Ratings Identifier. | [optional] 
**isin** | **str** | Name for the type ISIN. | [optional] 
**lei** | **str** | Name for the type LegalEntityIdentifier, LEI. | [optional] 
**bbg_figi** | **str** | Name for the type Bloomberg Listing/Regional/Security ID. | [optional] 
**md** | **str** | Name for the type MoodysIssuer, Moody&#39;s Ratings Identifier. | [optional] 
**ticker** | **str** | Name for the type PriceTicker. | [optional] 
**spr** | **str** | Name for the type S&amp;PRating, S&amp;P Ratings Identifier. | [optional] 
**sedol** | **str** | Name for the type SEDOL. | [optional] 
**ticker_exchange** | **str** | Name for the type TickerExch. | [optional] 
**ticker_region** | **str** | Name for the type TickerRegion | [optional] 
**ukch** | **str** | Name for the type UKCompanyHouse | [optional] 
**valoren** | **str** | Name for the type VALOR, Valoren (\&quot;Valor\&quot;) Identification. | [optional] 
**wkn** | **str** | Name for the type WKN, German Securities Identification. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


