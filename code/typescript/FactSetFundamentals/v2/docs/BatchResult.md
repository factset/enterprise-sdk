# factsetfundamentals.BatchResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Identifier that was used for the request. | [optional] 
**fsymId** | **String** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**metric** | **String** | The requested &#x60;metric&#x60; input, representing the Fundamental Data Item. For a definition of the item please use the /fundamentals/v#/metrics endpoint. | [optional] 
**periodicity** | **String** | Periodicity or frequency of the fiscal periods, where ANN &#x3D; Annual Original, ANN_R &#x3D; Annual Latest, QTR &#x3D; Quarterly Original, QTR_R &#x3D; Quarterly Latest, SEMI &#x3D; Semi-Annual Original, SEMI_R &#x3D; Semi-Annual Latest, LTM &#x3D; Last Twelve Months Original, LTM_R &#x3D; Last Twelve Months Latest, LTMSG &#x3D; Last Twelve Months Global, [OA17959](https://my.apps.factset.com/oa/pages/17959), LTM_SEMI &#x3D; Last Twelve Months - Semi-Annual Data, LTM_SEMI_R &#x3D; Last Twelve Months - Semi-Annual Latest Data and YTD &#x3D; Year-to-date. Please note that the coverage for SEMI_R and LTM_R may be limited as fewer companies report with these periodicities. | [optional] 
**fiscalPeriod** | **Number** | Fiscal Period indicator. Returns an integer representing the fiscal period for the requested item and periodicity. QUARTERLY CODE: 1-Fist Quarter; 2-Second Quarter; 3-Third Quarter; 4-Fourth Quarter. SEMI-CODE: 1-First Semi-annual Period; 2-Second Semi-annual Period. | 
**fiscalYear** | **Number** | Fiscal year of the reported period in YYYY format. | [optional] 
**fiscalPeriodLength** | **Number** | Length of the fiscal period in days. | [optional] 
**fiscalEndDate** | **Date** | The normalized data the fiscal period ended. | [optional] 
**reportDate** | **Date** | The date the reported fiscal period ended. | [optional] 
**epsReportDate** | **Date** | The date the EPS was reported for the requested periodicity. In YYYY-MM-DD format. Unavailable data returned as 0001-01-01. | [optional] 
**updateType** | **String** | Update Type: Preliminary - The period is updated from a report that usually contains limited or only key information., Final - The period is updated from a report where detailed information is available in financial statements including the notes to the line items. | [optional] 
**currency** | **String** | Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**value** | [**SegmentValue**](SegmentValue.md) |  | [optional] 
**label** | **String** | Report labels of the segment type requested. | 
**date** | **Date** | Date for the period requested expressed in YYYY-MM-DD format | [optional] 



## Enum: PeriodicityEnum


* `ANN` (value: `"ANN"`)

* `ANN_R` (value: `"ANN_R"`)

* `QTR` (value: `"QTR"`)

* `QTR_R` (value: `"QTR_R"`)

* `SEMI` (value: `"SEMI"`)

* `SEMI_R` (value: `"SEMI_R"`)

* `CAL` (value: `"CAL"`)

* `LTM` (value: `"LTM"`)

* `LTM_R` (value: `"LTM_R"`)

* `LTMSG` (value: `"LTMSG"`)

* `LTM_SEMI` (value: `"LTM_SEMI"`)

* `LTM_SEMI_R` (value: `"LTM_SEMI_R"`)

* `YTD` (value: `"YTD"`)





## Enum: UpdateTypeEnum


* `Preliminary` (value: `"Preliminary"`)

* `Final` (value: `"Final"`)




