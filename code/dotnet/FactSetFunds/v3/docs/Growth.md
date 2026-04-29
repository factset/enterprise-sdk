# FactSet.SDK.FactSetFunds.Model.Growth
Financial growth metrics including sales, revenue, income, cash flow, and dividend growth rates

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 
**Date** | **DateTime?** | The date in YYYY-MM-DD format. | [optional] 
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**KeyItemsType** | **GrowthType** |  | 
**SalesAndRevenueGrowth** | **double?** | 1-year (YoY) percentage change in aggregated sales and revenue across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**CogsGrowth** | **double?** | 1-year (YoY) percentage change in aggregated cost of goods sold (COGS) across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**GrossIncomeGrowth** | **double?** | 1-year (YoY) percentage change in aggregated gross income across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**SgaGrowth** | **double?** | 1-year (YoY) percentage change in aggregated SG&amp;A across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**EbitGrowth** | **double?** | 1-year (YoY) percentage change in aggregated earnings before interest and taxes (EBIT) across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**EbitdaGrowth** | **double?** | 1-year (YoY) percentage change in aggregated earnings before interest, taxes, depreciation, and amortization (EBITDA) across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**PreTaxIncomeGrowth** | **double?** | 1-year (YoY) percentage change in aggregated pre-tax income across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

