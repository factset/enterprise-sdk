# Growth

Financial growth metrics including sales, revenue, income, cash flow, and dividend growth rates

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key_items_type** | [**GrowthType**](GrowthType.md) |  | 
**fsym_id** | **str, none_type** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**date** | **date, none_type** | The date in YYYY-MM-DD format. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**sales_and_revenue_growth** | **float, none_type** | 1-year (YoY) percentage change in aggregated sales and revenue across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**cogs_growth** | **float, none_type** | 1-year (YoY) percentage change in aggregated cost of goods sold (COGS) across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**gross_income_growth** | **float, none_type** | 1-year (YoY) percentage change in aggregated gross income across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**sga_growth** | **float, none_type** | 1-year (YoY) percentage change in aggregated SG&amp;A across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**ebit_growth** | **float, none_type** | 1-year (YoY) percentage change in aggregated earnings before interest and taxes (EBIT) across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**ebitda_growth** | **float, none_type** | 1-year (YoY) percentage change in aggregated earnings before interest, taxes, depreciation, and amortization (EBITDA) across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**pre_tax_income_growth** | **float, none_type** | 1-year (YoY) percentage change in aggregated pre-tax income across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


