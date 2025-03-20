# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.PostSecuritizedDerivativeNotationRankingIntradayListDataItems
A list of objects. For semantical context see the description of the parent array.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifier of a notation. | [optional] 
**Symbol** | **string** | The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market. | [optional] 
**Fsym** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsFsym**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsFsym.md) |  | [optional] 
**Market** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsMarket**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsMarket.md) |  | [optional] 
**ValueUnit** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsValueUnit**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsValueUnit.md) |  | [optional] 
**Trade** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsTrade**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsTrade.md) |  | [optional] 
**Quality** | **string** | Quality of the trade-related attributes, see attributes &#x60;trade&#x60; and &#x60;accumulated&#x60;. | Value | Description | | - -- | - -- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. |   | [optional] 
**Accumulated** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulated**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulated.md) |  | [optional] 
**Instrument** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsInstrument**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsInstrument.md) |  | [optional] 
**Categorization** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsCategorization**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsCategorization.md) |  | [optional] 
**LifeCycle** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsLifeCycle**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsLifeCycle.md) |  | [optional] 
**Issuer** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsIssuer**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsIssuer.md) |  | [optional] 
**Exercise** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsExercise**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsExercise.md) |  | [optional] 
**Participation** | **string** | Participation direction of a factor certificate at the level movement of its effective underlying. | Value | Description | | - -- | - -- | | long | The factor certificate participates positively with rising levels of its effective underlying. | | short | The factor certificate participates negatively with rising levels of its effective underlying. |   | [optional] 
**Underlying** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsUnderlying**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsUnderlying.md) |  | [optional] 
**KnockedOut** | **bool?** | Indicates whether the securitized derivative is knocked-out (&#x60;true&#x60;) or not (&#x60;false&#x60;). Particularly relevant for knock-out certificates. | [optional] 
**KnockedIn** | **bool?** | Indicates whether the securitized derivative is knocked-in (&#x60;true&#x60;) or not (&#x60;false&#x60;). Particularly relevant for bonus certificates but also for securitized derivatives that might have additional protection such as reverse convertible bonds, discount certificates, and capital-protection certificates. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

