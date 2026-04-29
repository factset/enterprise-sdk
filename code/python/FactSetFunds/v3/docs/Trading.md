# Trading

Fund trading metrics including trading volumes, spreads, premium/discount data, and impediments to creation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**date** | **date** | The date of the trading data in YYYY-MM-DD format | [optional] 
**daily_dollar_trading_volume** | **float** | Daily $ Trading Volume | [optional] 
**daily_share_trading_volume** | **float** | Daily Share Trading Volume | [optional] 
**average_spread_percent** | **float** | Average bid-ask spread (%). This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**average_spread_dollar** | **float** | Average bid-ask spread ($)This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**block_liquidity_score** | **int** | Block liquidity score (0–5 scale).This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**underlying_volume_per1_m** | **float** | Underlying volume per $1M. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**market_hours_overlap_percent** | **float** | Market hours overlap (%). This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**creation_fee** | **float** | ETF creation fee ($) | [optional] 
**creation_unit_size** | **int** | Creation unit size (shares) | [optional] 
**impediments_to_creation** | **str** | Impediments to ETF creation/redemption process | [optional] 
**median_premium_discount12_m** | **float** | Median premium/discount over the last 12 months.This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**min_premium_discount12_m** | **float** | Minimum premium/discount over the last 12 months.This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**max_premium_discount12_m** | **float** | Maximum premium/discount over the last 12 months.This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


