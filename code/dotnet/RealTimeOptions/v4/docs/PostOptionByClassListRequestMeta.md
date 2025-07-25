# FactSet.SDK.RealTimeOptions.Model.PostOptionByClassListRequestMeta
The meta member contains the meta information of the request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attributes** | **List&lt;string&gt;** | Limit the attributes returned in the response to the specified set. | [optional] 
**Language** | **string** | ISO 639-1 code of the language. | [optional] 
**Sort** | **List&lt;string&gt;** | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed. | Value | | - -- | | instrument.normalizedSymbol | | -instrument.normalizedSymbol | | instrument.name | | -instrument.name | | instrument.exercise.right | | -instrument.exercise.right | | instrument.exercise.style | | -instrument.exercise.style | | instrument.strikePrice.level | | -instrument.strikePrice.level | | instrument.lifeCycle.maturity.date | | -instrument.lifeCycle.maturity.date | | instrument.lifeCycle.maturity.interval | | -instrument.lifeCycle.maturity.interval | | instrument.lifeCycle.expiration.month | | -instrument.lifeCycle.expiration.month | | instrument.lifeCycle.expiration.year | | -instrument.lifeCycle.expiration.year | | instrument.contractSize | | -instrument.contractSize | | openInterest | | -openInterest | | keyFigures.moneyness | | -keyFigures.moneyness | | keyFigures.impliedVolatility | | -keyFigures.impliedVolatility | | keyFigures.omega | | -keyFigures.omega | | keyFigures.leverage | | -keyFigures.leverage | | keyFigures.delta | | -keyFigures.delta | | keyFigures.thetaOneWeek | | -keyFigures.thetaOneWeek | | keyFigures.vega | | -keyFigures.vega | | keyFigures.gamma | | -keyFigures.gamma | | keyFigures.rho | | -keyFigures.rho |   | [optional] 
**Pagination** | [**PostOptionByClassListRequestMetaPagination**](PostOptionByClassListRequestMetaPagination.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

