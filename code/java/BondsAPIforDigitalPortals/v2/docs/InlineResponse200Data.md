

# InlineResponse200Data

Fundamental data for a debt instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isin** | **String** | The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument. |  [optional]
**nsin** | [**InlineResponse200DataNsin**](InlineResponse200DataNsin.md) |  |  [optional]
**name** | **String** | Name of the instrument. |  [optional]
**shortName** | **String** | Short name of the instrument. |  [optional]
**type** | [**java.util.List&lt;InlineResponse200DataType&gt;**](InlineResponse200DataType.md) | Instrument type as defined by FactSet Digital Solutions. Instrument types are arranged in a hierarchy, with the first level representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18). See endpoint &#x60;/category/get&#x60; for possible values. |  [optional]
**lifeCycle** | [**InlineResponse200DataLifeCycle**](InlineResponse200DataLifeCycle.md) |  |  [optional]
**issuer** | [**InlineResponse200DataIssuer**](InlineResponse200DataIssuer.md) |  |  [optional]
**issue** | [**InlineResponse200DataIssue**](InlineResponse200DataIssue.md) |  |  [optional]
**tradingVolume** | [**InlineResponse200DataTradingVolume**](InlineResponse200DataTradingVolume.md) |  |  [optional]
**redemption** | [**InlineResponse200DataRedemption**](InlineResponse200DataRedemption.md) |  |  [optional]
**nominalValue** | **BigDecimal** | Nominal value for per-unit quoted debt instruments. Debt instruments quoted in percent do not have a nominal value per se. |  [optional]
**debtRanking** | [**InlineResponse200DataDebtRanking**](InlineResponse200DataDebtRanking.md) |  |  [optional]
**germany** | [**InlineResponse200DataGermany**](InlineResponse200DataGermany.md) |  |  [optional]


## Implemented Interfaces

* Serializable


