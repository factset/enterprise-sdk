# factsetglobalprices.Dividend

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**eventId** | **String** | FactSet identifier that uniquely identifies the Event. | [optional] 
**eventTypeCode** | **String** | Corporate Actions Event type code. | [optional] 
**eventTypeDesc** | **String** | Corporate Actions Event type description. | [optional] 
**divTypeCode** | **String** | Dividend Type Code. For code descriptions, visit [Online Assistant Page #8764] (https://oa.apps.factset.com/pages/8764).  | [optional] 
**announcementDate** | **String** | Date Event was announced in YYYY-MM-DD format. | [optional] 
**recordDate** | **String** | Date of Record for distribution in YYYY-MM-DD format. | [optional] 
**payDate** | **String** | Date of Payment for distribution in YYYY-MM-DD format. | [optional] 
**effectiveDate** | **String** | Effective Date or Ex-Date of distribution in YYYY-MM-DD format. | [optional] 
**currency** | **String** | Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**amtDefNetGrossIndicator** | **String** | Net/Gross Marker Code. For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512). | [optional] 
**amtDefTradingAdj** | **Number** | Default Amount - Trading Currency, Split Adjusted | [optional] 
**amtDefTradingUnadj** | **Number** | Default Amount - Trading Currency, Unadjusted | [optional] 
**amtGrossTradingAdj** | **Number** | Gross Amount - Trading Currency, Split Adjusted  | [optional] 
**amtGrossTradingUnadj** | **Number** | Gross Amount - Trading Currency, Unadjusted  | [optional] 
**amtNetTradingAdj** | **Number** | Net Amount - Trading Currency, Split Adjusted | [optional] 
**amtNetTradingUnadj** | **Number** | Net Amount - Trading Currency, Unadjusted | [optional] 
**declaredCurrency** | **String** | Currency code for declared dividend. | [optional] 
**amtDefDecAdj** | **Number** | Default Amount - Declared Currency, Split Adjusted | [optional] 
**amtDefDecUnadj** | **Number** | Default Amount - Declared Currency, Unadjusted | [optional] 
**amtGrossDecAdj** | **Number** | Gross Amount - Declared Currency, Split Adjusted  | [optional] 
**amtGrossDecUnadj** | **Number** | Gross Amount - Declared Currency, Unadjusted  | [optional] 
**amtNetDecAdj** | **Number** | Net Amount - Declared Currency, Split Adjusted  | [optional] 
**amtNetDecUnadj** | **Number** | Net Amount - Declared Currency, Unadjusted  | [optional] 
**dividendStatus** | **Number** | Dividend Status Flag - 1&#x3D;Yes, 0&#x3D;No | [optional] 
**dividendActiveFlag** | **Number** | Dividend active Flag - 1&#x3D;Yes, 0&#x3D;No | [optional] 
**dividendsSpecFlag** | **Number** | Special Dividend Flag - 1&#x3D;Yes, 0&#x3D;No | [optional] 
**frankDefTradingAdj** | **Number** | Default Frank - Trading Currency, Split Adjusted | [optional] 
**frankDefTradingUnadj** | **Number** | Default Frank - Trading Currency, Unadjusted | [optional] 
**frankDefDecAdj** | **Number** | Default Frank - Declared Currency, Split Adjusted | [optional] 
**frankDefDecUnadj** | **Number** | Default Frank - Declared Currency, Unadjusted | [optional] 
**frankPct** | **Number** | Default Amount - Declared Currency, Unadjusted | [optional] 
**taxRate** | **Number** | Tax Rate for on gross dividend for net dividend. | [optional] 
**requestId** | **String** | Identifier that was used for the request. | [optional] 



## Enum: EventTypeCodeEnum


* `DVC` (value: `"DVC"`)

* `DVCD` (value: `"DVCD"`)

* `DRP` (value: `"DRP"`)





## Enum: AmtDefNetGrossIndicatorEnum


* `N` (value: `"N"`)

* `G` (value: `"G"`)




