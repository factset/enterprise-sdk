# Margins

Financial margin metrics including gross, EBIT, EBITDA, pretax, net, and free cash flow margins

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key_items_type** | [**MarginsType**](MarginsType.md) |  | 
**fsym_id** | **str, none_type** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**date** | **date, none_type** | The date in YYYY-MM-DD format. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**gross_margin** | **float, none_type** | Gross Margin | [optional] 
**ebit_margin** | **float, none_type** | EBIT Margin | [optional] 
**ebitda_margin** | **float, none_type** | EBITDA Margin | [optional] 
**pretax_margin** | **float, none_type** | Pre Tax Margin | [optional] 
**net_margin** | **float, none_type** | Net Margin | [optional] 
**free_cash_flow_margin** | **float, none_type** | Free Cash Flow Margin | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


