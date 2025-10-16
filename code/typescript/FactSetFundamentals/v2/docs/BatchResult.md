# factsetfundamentals.BatchResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier provided in the input request that corresponds to this period information. | [optional] 
**fsymId** | **String** | FactSet Regional Security Identifier representing the specific data series for the requested &#x60;requestId&#x60;. | [optional] 
**metric** | **String** | The identifier of the fundamental metric being reported (e.g., &#x60;FF_SALES&#x60;). | [optional] 
**periodicity** | **String** | Periodicity code for this fiscal period (e.g., &#x60;QTR&#x60;, &#x60;ANN&#x60;). | [optional] 
**fiscalPeriod** | **Number** | Integer representing the fiscal period. For &#x60;QTR&#x60; periodicity, possible values are 1, 2, 3, or 4. For &#x60;SEMI&#x60; periodicity, possible values are 1 or 2. | 
**fiscalYear** | **Number** | Fiscal year of the reported period, expressed in a YYYY format. | [optional] 
**fiscalPeriodLength** | **Number** | Length of the fiscal period in days. | [optional] 
**fiscalEndDate** | **Date** | The official ending date of the fiscal period (YYYY-MM-DD). | [optional] 
**reportDate** | **Date** | The date the reported fiscal period ended. | [optional] 
**epsReportDate** | **Date** | The date the EPS was reported for the requested periodicity. In YYYY-MM-DD format. | [optional] 
**updateType** | **String** | Indicates the status of the source filing when this data point was recorded (&#x60;Preliminary&#x60; or &#x60;Final&#x60;). | [optional] 
**currency** | **String** | Currency of the reported &#x60;value&#x60;, expressed as a 3-character ISO 4217 code. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**value** | [**FundamentalValue**](FundamentalValue.md) |  | [optional] 
**label** | **String** | Report labels of the segment type requested. | 
**date** | **Date** | Date for the period requested expressed in YYYY-MM-DD format | [optional] 
**pitStart** | **Date** | The UTC timestamp for when the fiscal period information was first published and became available. | [optional] 
**pitEnd** | **Date** | The UTC timestamp for when this version of the fiscal period information was superseded by a newer version. A &#x60;null&#x60; value indicates that this is the latest available version. | [optional] 
**fiscalInterimNumber** | **Number** | The sequential number of the interim period within the fiscal year (e.g., 1 for Q1, 2 for Q2). | [optional] 
**fiscalDate** | **Date** | The specific date used for reporting the period end, which may occasionally differ slightly from the period&#39;s actual calendar end date (YYYY-MM-DD). | [optional] 
**fyeChange** | **Boolean** | Flag indicating if a Fiscal Year End (FYE) change occurred during or impacted this specific period (&#x60;true&#x60; if changed, &#x60;false&#x60; otherwise). | [optional] 



## Enum: UpdateTypeEnum


* `Preliminary` (value: `"Preliminary"`)

* `Final` (value: `"Final"`)




