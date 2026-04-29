# PerShare

Per-share financial metrics including EPS, sales per share, dividends per share, and cash flow per share

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key_items_type** | [**PerShareType**](PerShareType.md) |  | 
**fsym_id** | **str, none_type** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**date** | **date, none_type** | The date in YYYY-MM-DD format. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**eps_recurrent_earnings** | **float, none_type** | EPS Recurrent Earnings | [optional] 
**sales_per_share** | **float, none_type** | Sales Per Share | [optional] 
**dividends_per_share** | **float, none_type** | Dividends Per Share | [optional] 
**free_cash_flow_per_share** | **float, none_type** | Free CashFlow Per Share | [optional] 
**book_value_per_share** | **float, none_type** | Book Value Per Share | [optional] 
**cash_flow_per_share** | **float, none_type** | Cash Flow Per Share | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


