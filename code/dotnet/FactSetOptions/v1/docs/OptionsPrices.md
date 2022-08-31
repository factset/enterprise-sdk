# FactSet.SDK.FactSetOptions.Model.OptionsPrices
The Options prices response object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AskTime** | **double?** | Returns the Bid time | [optional] 
**BidTime** | **double?** | Returns the Last Trade time | [optional] 
**Date** | **DateTime?** | The date of data in YYYY-MM-DD format | [optional] 
**FsymId** | **string** | FactSet&#39;s Option Symbol. For more detail, visit [OA 12636](https://my.apps.factset.com/oa/pages/12636#options) | [optional] 
**Price52WeekHigh** | **double?** | 52-Week High Price | [optional] 
**Price52WeekLow** | **double?** | 52-Week Low Price | [optional] 
**PriceAsk** | **double?** | Ask price of the option | [optional] 
**PriceBid** | **double?** | Bid price of the option | [optional] 
**PriceMidBidAsk** | **double?** | Mid/Bid/Ask price of the option | [optional] 
**PriceOpen** | **double?** | Open price of the option | [optional] 
**PriceHigh** | **double?** | High price of the option | [optional] 
**PriceLow** | **double?** | Low price of the option | [optional] 
**PriceSettlement** | **decimal?** | Settlement price of the option | [optional] 
**PriceStrike** | **double?** | The stated price per share for which underlying stock may be purchased (for a call) or sold (for a put) by the option holder upon exercise of the option contract. | [optional] 
**PriceUnderlying** | **double?** | The price of the security that must be delivered when a derivative contract, such as a put or call option, is exercised. | [optional] 
**Price** | **double?** | The price of the option based on the &#x60;quoteType&#x60; calculation. For US Options - Returns \&quot;Ask Price\&quot; if calc status&#x3D;&#x3D;20, otherwise returns \&quot;Mid Bid/Ask Price\&quot;. For International Options - Returns \&quot;Settlement Price\&quot;.  | [optional] 
**QuoteType** | **string** | The calculated quote type, based on the calculated status. This represents the type for &#x60;price&#x60; field. For US Options - Returns \&quot;Ask Price\&quot; if calc status&#x3D;&#x3D;20, otherwise returns \&quot;Mid Bid/Ask Price\&quot;. For International Options - Returns \&quot;Settlement Price\&quot;.  | [optional] 
**RequestId** | **string** | The requested identifier submitted in the query. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

