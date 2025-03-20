# PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationPrices

Price-related parameters.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quality** | **str** | Quality of the price. | Value | Description | | --- | --- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. |   | [optional]  if omitted the server will use the default value of "DLY"
**latest** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationPricesLatest**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationPricesLatest.md) |  | [optional] 
**previous** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidationPricesPrevious**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidationPricesPrevious.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


