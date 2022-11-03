# factsetconcordance.EntityMatchRequestInput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The Name of the entity to match. | 
**clientId** | **String** | A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe.  | [optional] 
**country** | **String** | ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754).  | [optional] 
**state** | **String** | Two-character state code corresponding to the entity name that is used when evaluating candidates for a match. Currently, only US state codes are supported.Two character state or province code to filter on.  | [optional] 
**url** | **String** | URL corresponding to the entity name that is used when evaluating candidates for a match.  | [optional] 
**priority** | **String** | Priority associated to the id. | [optional] 
**bic** | **String** | Name for type BICCode, bank indentification code | [optional] 
**bbgTicker** | **String** | Name for the type Bloomberg Listing and Regional Ticker. | [optional] 
**cik** | **String** | Name for the type CIK, Edgar Central Index Keys | [optional] 
**crd** | **String** | Name for the type CRD, Central Registration Depository | [optional] 
**cusip** | **String** | Name for the type CUSIP. | [optional] 
**duns** | **String** | Name for the type DUNS, Dun&amp;Bradstreet. | [optional] 
**ein** | **String** | Name for the type EmployerIdentificationNumber, EIN. | [optional] 
**rssd** | **String** | Name for the type FederalReserveRSSDIdentifier, RSSD. | [optional] 
**fitch** | **String** | Name for the type FitchCreditRating, Fitch Ratings Identifier. | [optional] 
**isin** | **String** | Name for the type ISIN. | [optional] 
**lei** | **String** | Name for the type LegalEntityIdentifier, LEI. | [optional] 
**bbgFigi** | **String** | Name for the type Bloomberg Listing/Regional/Security ID. | [optional] 
**md** | **String** | Name for the type MoodysIssuer, Moody&#39;s Ratings Identifier. | [optional] 
**ticker** | **String** | Name for the type PriceTicker. | [optional] 
**spr** | **String** | Name for the type S&amp;PRating, S&amp;P Ratings Identifier. | [optional] 
**sedol** | **String** | Name for the type SEDOL. | [optional] 
**tickerExchange** | **String** | Name for the type TickerExch. | [optional] 
**tickerRegion** | **String** | Name for the type TickerRegion | [optional] 
**ukch** | **String** | Name for the type UKCompanyHouse | [optional] 
**valoren** | **String** | Name for the type VALOR, Valoren (\&quot;Valor\&quot;) Identification. | [optional] 
**wkn** | **String** | Name for the type WKN, German Securities Identification. | [optional] 



## Enum: PriorityEnum


* `CRITICAL` (value: `"CRITICAL"`)

* `HIGH` (value: `"HIGH"`)

* `MEDIUM` (value: `"MEDIUM"`)

* `LOW` (value: `"LOW"`)




