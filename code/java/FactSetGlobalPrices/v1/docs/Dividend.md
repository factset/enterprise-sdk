

# Dividend


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. |  [optional]
**eventId** | **String** | FactSet identifier that uniquely identifies the Event. |  [optional]
**eventTypeCode** | [**EventTypeCodeEnum**](#EventTypeCodeEnum) | Corporate Actions Event type code. |  [optional]
**eventTypeDesc** | **String** | Corporate Actions Event type description. |  [optional]
**divTypeCode** | **String** | Dividend Type Code. For code descriptions, visit [Online Assistant Page #8764] (https://oa.apps.factset.com/pages/8764).  |  [optional]
**announcementDate** | **String** | Date Event was announced in YYYY-MM-DD format. |  [optional]
**recordDate** | **String** | Date of Record for distribution in YYYY-MM-DD format. |  [optional]
**payDate** | **String** | Date of Payment for distribution in YYYY-MM-DD format. |  [optional]
**effectiveDate** | **String** | Effective Date or Ex-Date of distribution in YYYY-MM-DD format. |  [optional]
**currency** | **String** | Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). |  [optional]
**amtDefNetGrossIndicator** | [**AmtDefNetGrossIndicatorEnum**](#AmtDefNetGrossIndicatorEnum) | Net/Gross Marker Code. For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512). |  [optional]
**amtDefTradingAdj** | **Double** | Default Amount - Trading Currency, Split Adjusted |  [optional]
**amtDefTradingUnadj** | **Double** | Default Amount - Trading Currency, Unadjusted |  [optional]
**amtGrossTradingAdj** | **Double** | Gross Amount - Trading Currency, Split Adjusted  |  [optional]
**amtGrossTradingUnadj** | **Double** | Gross Amount - Trading Currency, Unadjusted  |  [optional]
**amtNetTradingAdj** | **Double** | Net Amount - Trading Currency, Split Adjusted |  [optional]
**amtNetTradingUnadj** | **Double** | Net Amount - Trading Currency, Unadjusted |  [optional]
**declaredCurrency** | **String** | Currency code for declared dividend. |  [optional]
**amtDefDecAdj** | **Double** | Default Amount - Declared Currency, Split Adjusted |  [optional]
**amtDefDecUnadj** | **Double** | Default Amount - Declared Currency, Unadjusted |  [optional]
**amtGrossDecAdj** | **Double** | Gross Amount - Declared Currency, Split Adjusted  |  [optional]
**amtGrossDecUnadj** | **Double** | Gross Amount - Declared Currency, Unadjusted  |  [optional]
**amtNetDecAdj** | **Double** | Net Amount - Declared Currency, Split Adjusted  |  [optional]
**amtNetDecUnadj** | **Double** | Net Amount - Declared Currency, Unadjusted  |  [optional]
**dividendsSpecFlag** | **Integer** | Special Dividend Flag - 1&#x3D;Yes, 0&#x3D;No |  [optional]
**taxRate** | **Double** | Tax Rate for on gross dividend for net dividend. |  [optional]
**requestId** | **String** | Identifier that was used for the request. |  [optional]



## Enum: EventTypeCodeEnum

Name | Value
---- | -----
DVC | &quot;DVC&quot;
DVCD | &quot;DVCD&quot;
DRP | &quot;DRP&quot;



## Enum: AmtDefNetGrossIndicatorEnum

Name | Value
---- | -----
N | &quot;N&quot;
G | &quot;G&quot;


## Implemented Interfaces

* Serializable


