# factsetbanks.SearchEntityAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request (e.g., ticker or entity ID). Null when the entity was matched via &#x60;searchText&#x60; without a submitted id. | [optional] 
**tickerRegion** | **String** | Regional ticker for the matching entity. Null when the entity has no public ticker. | [optional] 
**fsymRegionalId** | **String** | FactSet Symbology regional identifier. Null when the entity has no public ticker. | [optional] 
**startDate** | **Date** | Date the relationship to the ultimate parent began, in YYYY-MM-DD format. | [optional] 
**endDate** | **Date** | Date the relationship to the ultimate parent ended, in YYYY-MM-DD format. Null indicates the relationship is currently active. | [optional] 
**factsetUltParentEntityId** | **String** | FactSet entity identifier of the ultimate parent | [optional] 
**factsetUltParentProperName** | **String** | Legal name of the ultimate parent | [optional] 
**reportType** | **String** | Echoes the requested &#x60;reportType&#x60; this entity was resolved for. | [optional] 
**isoCountry** | **String** | ISO country code | [optional] 
**entityType** | **String** | Three-character FactSet entity type code.   |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---|   |ABS|Asset-Backed Security|MUC|Municipal (City)|   |AIR|Aircraft|MUE|Municipal Entity|   |BAS|Basket|MUT|Mutual Fund|   |BRA|Branch|NPO|Non-Profit Organization|   |CAC|Commodity Asset Class|OPD|Operating Division|   |CMD|Commodity|PEF|Private Equity Fund|   |COL|College/University|PRO|Professional Organization|   |COR|Corporate (public company)|PRT|Partnership|   |CUR|Currency|PUB|Public (government-owned entity)|   |ESP|Employee Stock Plan|PVF|Private Fund|   |EXT|Extinct/Inactive entity|PVT|Private Company|   |FAF|Family of Funds|SHP|Ship|   |FND|Foundation|SOV|Sovereign|   |FNS|Financial Subsidiary|SUB|Subsidiary|   |FRX|Forex|TRU|Trust|   |GOV|Government (Agency)|UIT|Unit Investment Trust|   |HED|Hedge Fund|UMB|Umbrella Fund|   |HOL|Holding Company|VEN|Venture Capital|   |IDX|Index| | |   |IND|Industry| | |   |JVT|Joint Venture| | |   |MED|Media| | |  | [optional] 



## Enum: ReportTypeEnum


* `UBPR` (value: `"UBPR"`)

* `TEN_D` (value: `"TEN_D"`)

* `UCC1` (value: `"UCC1"`)

* `DEPOSIT_RATES` (value: `"DEPOSIT_RATES"`)

* `AUM_RIA` (value: `"AUM_RIA"`)

* `FOCUS` (value: `"FOCUS"`)

* `FINANCIALS` (value: `"FINANCIALS"`)

* `BRANCHES` (value: `"BRANCHES"`)

* `COUNTRY_EXPOSURE` (value: `"COUNTRY_EXPOSURE"`)




