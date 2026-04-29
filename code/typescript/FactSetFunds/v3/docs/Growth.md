# factsetfunds.Growth

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**requestId** | **String** | The requested Id sent as input. | [optional] 
**date** | **Date** | The date in YYYY-MM-DD format. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**keyItemsType** | [**GrowthType**](GrowthType.md) |  | 
**salesAndRevenueGrowth** | **Number** | 1-year (YoY) percentage change in aggregated sales and revenue across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**cogsGrowth** | **Number** | 1-year (YoY) percentage change in aggregated cost of goods sold (COGS) across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**grossIncomeGrowth** | **Number** | 1-year (YoY) percentage change in aggregated gross income across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**sgaGrowth** | **Number** | 1-year (YoY) percentage change in aggregated SG&amp;A across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**ebitGrowth** | **Number** | 1-year (YoY) percentage change in aggregated earnings before interest and taxes (EBIT) across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**ebitdaGrowth** | **Number** | 1-year (YoY) percentage change in aggregated earnings before interest, taxes, depreciation, and amortization (EBITDA) across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**preTaxIncomeGrowth** | **Number** | 1-year (YoY) percentage change in aggregated pre-tax income across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 


