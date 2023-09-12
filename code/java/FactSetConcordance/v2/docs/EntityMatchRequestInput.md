

# EntityMatchRequestInput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The Name of the entity to match. | 
**clientId** | **String** | A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe.  |  [optional]
**country** | **String** | ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754).  |  [optional]
**state** | **String** | Two-character state code corresponding to the entity name that is used when evaluating candidates for a match. Currently, only US state codes are supported.Two character state or province code to filter on.  |  [optional]
**url** | **String** | URL corresponding to the entity name that is used when evaluating candidates for a match.  |  [optional]
**priority** | [**PriorityEnum**](#PriorityEnum) | Priority associated to the id. |  [optional]
**bbgFigi** | **String** | Name for the type Bloomberg Listing/Regional/Security ID. |  [optional]
**bbgTicker** | **String** | Name for the type Bloomberg Listing and Regional Ticker. |  [optional]
**bic** | **String** | Name for type BICCode, bank indentification code |  [optional]
**cik** | **String** | Name for the type CIK, Edgar Central Index Keys |  [optional]
**crd** | **String** | Name for the type CRD, Central Registration Depository |  [optional]
**cusip** | **String** | Name for the type CUSIP. |  [optional]
**duns** | **String** | Name for the type DUNS, Dun&amp;Bradstreet. |  [optional]
**ein** | **String** | Name for the type EmployerIdentificationNumber, EIN. |  [optional]
**factsetId** | **String** | Name for the type FactSet Identifier, FactSet -E,-S,-R, -L Permanent Identifier. |  [optional]
**fitch** | **String** | Name for the type FitchCreditRating, Fitch Ratings Identifier. |  [optional]
**gvkey** | **String** | Name for the type GVKEY, Compustat Global Company Key. |  [optional]
**gvkeyIid** | **String** | Name for the type GVKEY+IID, Compustat Global Company Key and Issue Identifier. |  [optional]
**isin** | **String** | Name for the type ISIN. |  [optional]
**jcn** | **String** | Name for the type JCN , Japanese Corporate Number. |  [optional]
**lei** | **String** | Name for the type LegalEntityIdentifier, LEI. |  [optional]
**lxid** | **String** | Name for the type LXID, Markit Syndicated Loan Identifier. |  [optional]
**md** | **String** | Name for the type MoodysIssuer, Moody&#39;s Ratings Identifier. |  [optional]
**redCode** | **String** | Name for the type RedCode, Markit Reference Entity Identifier. |  [optional]
**rssd** | **String** | Name for the type FederalReserveRSSDIdentifier, RSSD. |  [optional]
**sedol** | **String** | Name for the type SEDOL. |  [optional]
**spr** | **String** | Name for the type S&amp;PRating, S&amp;P Ratings Identifier. |  [optional]
**ticker** | **String** | Name for the type PriceTicker. |  [optional]
**tickerExchange** | **String** | Name for the type TickerExch. |  [optional]
**tickerRegion** | **String** | Name for the type TickerRegion |  [optional]
**ukch** | **String** | Name for the type UKCompanyHouse |  [optional]
**valoren** | **String** | Name for the type VALOR, Valoren (\&quot;Valor\&quot;) Identification. |  [optional]
**wkn** | **String** | Name for the type WKN, German Securities Identification. |  [optional]



## Enum: PriorityEnum

Name | Value
---- | -----
CRITICAL | &quot;CRITICAL&quot;
HIGH | &quot;HIGH&quot;
MEDIUM | &quot;MEDIUM&quot;
LOW | &quot;LOW&quot;


## Implemented Interfaces

* Serializable


