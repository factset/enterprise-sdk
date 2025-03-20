# PostSecuritizedDerivativeNotationRankingIntradayListDataItems

A list of objects. For semantical context see the description of the parent array.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str, none_type** | Identifier of a notation. | [optional] 
**symbol** | **str, none_type** | The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market. | [optional] 
**fsym** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsFsym**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsFsym.md) |  | [optional] 
**market** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsMarket**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsMarket.md) |  | [optional] 
**value_unit** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsValueUnit**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsValueUnit.md) |  | [optional] 
**trade** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsTrade**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsTrade.md) |  | [optional] 
**quality** | **str, none_type** | Quality of the trade-related attributes, see attributes &#x60;trade&#x60; and &#x60;accumulated&#x60;. | Value | Description | | --- | --- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. |   | [optional] 
**accumulated** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulated**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulated.md) |  | [optional] 
**instrument** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsInstrument**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsInstrument.md) |  | [optional] 
**categorization** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsCategorization**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsCategorization.md) |  | [optional] 
**life_cycle** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsLifeCycle**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsLifeCycle.md) |  | [optional] 
**issuer** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsIssuer**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsIssuer.md) |  | [optional] 
**exercise** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsExercise**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsExercise.md) |  | [optional] 
**participation** | **str, none_type** | Participation direction of a factor certificate at the level movement of its effective underlying. | Value | Description | | --- | --- | | long | The factor certificate participates positively with rising levels of its effective underlying. | | short | The factor certificate participates negatively with rising levels of its effective underlying. |   | [optional] 
**underlying** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsUnderlying**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsUnderlying.md) |  | [optional] 
**knocked_out** | **bool, none_type** | Indicates whether the securitized derivative is knocked-out (&#x60;true&#x60;) or not (&#x60;false&#x60;). Particularly relevant for knock-out certificates. | [optional] 
**knocked_in** | **bool, none_type** | Indicates whether the securitized derivative is knocked-in (&#x60;true&#x60;) or not (&#x60;false&#x60;). Particularly relevant for bonus certificates but also for securitized derivatives that might have additional protection such as reverse convertible bonds, discount certificates, and capital-protection certificates. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


