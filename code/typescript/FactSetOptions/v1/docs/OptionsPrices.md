# factsetoptions.OptionsPrices

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**askTime** | **Number** | Returns the Bid time | [optional] 
**bidTime** | **Number** | Returns the Last Trade time | [optional] 
**date** | **Date** | The date of data in YYYY-MM-DD format | [optional] 
**fsymId** | **String** | FactSet&#39;s Option Symbol. For more detail, visit [OA 12636](https://my.apps.factset.com/oa/pages/12636#options) | [optional] 
**price52WeekHigh** | **Number** | 52-Week High Price | [optional] 
**price52WeekLow** | **Number** | 52-Week Low Price | [optional] 
**priceAsk** | **Number** | Ask price of the option | [optional] 
**priceBid** | **Number** | Bid price of the option | [optional] 
**priceMidBidAsk** | **Number** | Mid/Bid/Ask price of the option | [optional] 
**priceOpen** | **Number** | Open price of the option | [optional] 
**priceHigh** | **Number** | High price of the option | [optional] 
**priceLow** | **Number** | Low price of the option | [optional] 
**priceSettlement** | **Number** | Settlement price of the option | [optional] 
**priceStrike** | **Number** | The stated price per share for which underlying stock may be purchased (for a call) or sold (for a put) by the option holder upon exercise of the option contract. | [optional] 
**priceUnderlying** | **Number** | The price of the security that must be delivered when a derivative contract, such as a put or call option, is exercised. | [optional] 
**price** | **Number** | The price of the option based on the &#x60;quoteType&#x60; calculation. For US Options - Returns \&quot;Ask Price\&quot; if calc status&#x3D;&#x3D;20, otherwise returns \&quot;Mid Bid/Ask Price\&quot;. For International Options - Returns \&quot;Settlement Price\&quot;.  | [optional] 
**quoteType** | **String** | The calculated quote type, based on the calculated status. This represents the type for &#x60;price&#x60; field. For US Options - Returns \&quot;Ask Price\&quot; if calc status&#x3D;&#x3D;20, otherwise returns \&quot;Mid Bid/Ask Price\&quot;. For International Options - Returns \&quot;Settlement Price\&quot;.  | [optional] 
**requestId** | **String** | The requested identifier submitted in the query. | [optional] 


