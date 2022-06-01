

# OptionsPrices

The Options prices response object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**askTime** | **Double** | Returns the Bid time |  [optional]
**bidTime** | **Double** | Returns the Last Trade time |  [optional]
**date** | **LocalDate** | The date of data in YYYY-MM-DD format |  [optional]
**fsymId** | **String** | FactSet&#39;s Option Symbol. For more detail, visit [OA 12636](https://my.apps.factset.com/oa/pages/12636#options) |  [optional]
**price52WeekHigh** | **Double** | 52-Week High Price |  [optional]
**price52WeekLow** | **Double** | 52-Week Low Price |  [optional]
**priceAsk** | **Double** | Ask price of the option |  [optional]
**priceBid** | **Double** | Bid price of the option |  [optional]
**priceMidBidAsk** | **Double** | Mid/Bid/Ask price of the option |  [optional]
**priceOpen** | **Double** | Open price of the option |  [optional]
**priceHigh** | **Double** | High price of the option |  [optional]
**priceLow** | **Double** | Low price of the option |  [optional]
**priceSettlement** | **BigDecimal** | Settlement price of the option |  [optional]
**priceStrike** | **Double** | The stated price per share for which underlying stock may be purchased (for a call) or sold (for a put) by the option holder upon exercise of the option contract. |  [optional]
**priceUnderlying** | **Double** | The price of the security that must be delivered when a derivative contract, such as a put or call option, is exercised. |  [optional]
**price** | **Double** | The price of the option based on the &#x60;quoteType&#x60; calculation. For US Options - Returns \&quot;Ask Price\&quot; if calc status&#x3D;&#x3D;20, otherwise returns \&quot;Mid Bid/Ask Price\&quot;. For International Options - Returns \&quot;Settlement Price\&quot;.  |  [optional]
**quoteType** | **String** | The calculated quote type, based on the calculated status. This represents the type for &#x60;price&#x60; field. For US Options - Returns \&quot;Ask Price\&quot; if calc status&#x3D;&#x3D;20, otherwise returns \&quot;Mid Bid/Ask Price\&quot;. For International Options - Returns \&quot;Settlement Price\&quot;.  |  [optional]
**requestId** | **String** | The requested identifier submitted in the query. |  [optional]


## Implemented Interfaces

* Serializable


