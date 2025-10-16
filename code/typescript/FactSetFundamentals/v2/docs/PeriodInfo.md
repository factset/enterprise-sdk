# factsetfundamentals.PeriodInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier provided in the input request that corresponds to this period information. | [optional] 
**fsymId** | **String** | FactSet Regional Security Identifier representing the specific data series for the requested &#x60;requestId&#x60;. | [optional] 
**fiscalInterimNumber** | **Number** | The sequential number of the interim period within the fiscal year (e.g., 1 for Q1, 2 for Q2). | [optional] 
**periodicity** | **String** | Periodicity code for this fiscal period (e.g., &#x60;QTR&#x60;, &#x60;ANN&#x60;). | [optional] 
**fiscalDate** | **Date** | The specific date used for reporting the period end, which may occasionally differ slightly from the period&#39;s actual calendar end date (YYYY-MM-DD). | [optional] 
**fyeChange** | **Boolean** | Flag indicating if a Fiscal Year End (FYE) change occurred during or impacted this specific period (&#x60;true&#x60; if changed, &#x60;false&#x60; otherwise). | [optional] 
**pitStart** | **Date** | The UTC timestamp for when the fiscal period information was first published and became available. | [optional] 
**pitEnd** | **Date** | The UTC timestamp for when this version of the fiscal period information was superseded by a newer version. A &#x60;null&#x60; value indicates that this is the latest available version. | [optional] 


