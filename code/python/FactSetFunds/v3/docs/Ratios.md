# Ratios

Financial ratio metrics including P/E, P/S, P/B, P/CF, enterprise value ratios, ROE, and dividend yield

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key_items_type** | [**RatiosType**](RatiosType.md) |  | 
**fsym_id** | **str, none_type** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**date** | **date, none_type** | The date in YYYY-MM-DD format. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**price_to_earnings** | **float, none_type** | Price to Earnings Ratio | [optional] 
**price_to_earnings_excl_negatives** | **float, none_type** | Price to Earnings Excl Negatives Ratio | [optional] 
**price_to_sales** | **float, none_type** | Price to Sales Ratio | [optional] 
**price_to_book_value** | **float, none_type** | Price to Book Value Ratio | [optional] 
**price_to_cash_flow** | **float, none_type** | Price to Cash Flow Ratio | [optional] 
**price_to_cash_flow_excl_negatives** | **float, none_type** | Price to Cash Flow Excl Negatives | [optional] 
**price_to_free_cash_flow** | **float, none_type** | Price to Free Cash Flow Ratio | [optional] 
**enterprise_value_ebit** | **float, none_type** | Enterprise Value EBIT | [optional] 
**enterprise_value_ebitda** | **float, none_type** | Enterprise Value EBITDA | [optional] 
**enterprise_value_sales** | **float, none_type** | Enterprise Value Sales | [optional] 
**return_on_equity** | **float, none_type** | Return on Equity | [optional] 
**dividend_yield** | **float, none_type** | Dividend Yield | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


