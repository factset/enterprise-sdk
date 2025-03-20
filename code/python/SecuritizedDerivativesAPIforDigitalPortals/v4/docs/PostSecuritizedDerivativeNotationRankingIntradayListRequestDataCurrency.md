# PostSecuritizedDerivativeNotationRankingIntradayListRequestDataCurrency

Main currency of the trading value and volume for securitized derivatives quoted in percent. The parameter ensures the consistency and comparability of the trading value and trading volume for such securitized derivatives. For securitized derivatives not quoted in percent, the currency and the value unit, see parameter `valueUnit`, are identical, thus it is not neccessary to specify the currency if the value unit has been specified.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **float** | Identifier of the main currency. See endpoint &#x60;/basic/value-unit/currency/main/list&#x60; for valid values. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


