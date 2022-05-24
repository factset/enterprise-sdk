# FactSet.SDK.FactSetGlobalPrices.Model.Dividend

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**EventId** | **string** | FactSet identifier that uniquely identifies the Event. | [optional] 
**EventTypeCode** | **string** | Corporate Actions Event type code. | [optional] 
**EventTypeDesc** | **string** | Corporate Actions Event type description. | [optional] 
**DivTypeCode** | **string** | Dividend Type Code. For code descriptions, visit [Online Assistant Page #8764] (https://oa.apps.factset.com/pages/8764).  | [optional] 
**AnnouncementDate** | **string** | Date Event was announced in YYYY-MM-DD format. | [optional] 
**RecordDate** | **string** | Date of Record for distribution in YYYY-MM-DD format. | [optional] 
**PayDate** | **string** | Date of Payment for distribution in YYYY-MM-DD format. | [optional] 
**EffectiveDate** | **string** | Effective Date or Ex-Date of distribution in YYYY-MM-DD format. | [optional] 
**Currency** | **string** | Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**AmtDefNetGrossIndicator** | **string** | Net/Gross Marker Code. For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512). | [optional] 
**AmtDefTradingAdj** | **double** | Default Amount - Trading Currency, Split Adjusted | [optional] 
**AmtDefTradingUnadj** | **double** | Default Amount - Trading Currency, Unadjusted | [optional] 
**AmtGrossTradingAdj** | **double** | Gross Amount - Trading Currency, Split Adjusted  | [optional] 
**AmtGrossTradingUnadj** | **double** | Gross Amount - Trading Currency, Unadjusted  | [optional] 
**AmtNetTradingAdj** | **double** | Net Amount - Trading Currency, Split Adjusted | [optional] 
**AmtNetTradingUnadj** | **double** | Net Amount - Trading Currency, Unadjusted | [optional] 
**DeclaredCurrency** | **string** | Currency code for declared dividend. | [optional] 
**AmtDefDecAdj** | **double** | Default Amount - Declared Currency, Split Adjusted | [optional] 
**AmtDefDecUnadj** | **double** | Default Amount - Declared Currency, Unadjusted | [optional] 
**AmtGrossDecAdj** | **double** | Gross Amount - Declared Currency, Split Adjusted  | [optional] 
**AmtGrossDecUnadj** | **double** | Gross Amount - Declared Currency, Unadjusted  | [optional] 
**AmtNetDecAdj** | **double** | Net Amount - Declared Currency, Split Adjusted  | [optional] 
**AmtNetDecUnadj** | **double** | Net Amount - Declared Currency, Unadjusted  | [optional] 
**DividendStatus** | **int** | Dividend Status Flag - 1&#x3D;Yes, 0&#x3D;No | [optional] 
**DividendActiveFlag** | **int** | Dividend active Flag - 1&#x3D;Yes, 0&#x3D;No | [optional] 
**DividendsSpecFlag** | **int** | Special Dividend Flag - 1&#x3D;Yes, 0&#x3D;No | [optional] 
**FrankDefTradingAdj** | **double** | Default Frank - Trading Currency, Split Adjusted | [optional] 
**FrankDefTradingUnadj** | **double** | Default Frank - Trading Currency, Unadjusted | [optional] 
**FrankDefDecAdj** | **double** | Default Frank - Declared Currency, Split Adjusted | [optional] 
**FrankDefDecUnadj** | **double** | Default Frank - Declared Currency, Unadjusted | [optional] 
**FrankPct** | **double** | Default Amount - Declared Currency, Unadjusted | [optional] 
**TaxRate** | **double** | Tax Rate for on gross dividend for net dividend. | [optional] 
**RequestId** | **string** | Identifier that was used for the request. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

