# OptionsPrices

The Options prices response object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ask_time** | **float, none_type** | Returns the Bid time | [optional] 
**bid_time** | **float, none_type** | Returns the Last Trade time | [optional] 
**date** | **date, none_type** | The date of data in YYYY-MM-DD format | [optional] 
**fsym_id** | **str, none_type** | FactSet&#39;s Option Symbol. For more detail, visit [OA 12636](https://my.apps.factset.com/oa/pages/12636#options) | [optional] 
**price52_week_high** | **float, none_type** | 52-Week High Price | [optional] 
**price52_week_low** | **float, none_type** | 52-Week Low Price | [optional] 
**price_ask** | **float, none_type** | Ask price of the option | [optional] 
**price_bid** | **float, none_type** | Bid price of the option | [optional] 
**price_mid_bid_ask** | **float, none_type** | Mid/Bid/Ask price of the option | [optional] 
**price_open** | **float, none_type** | Open price of the option | [optional] 
**price_high** | **float, none_type** | High price of the option | [optional] 
**price_low** | **float, none_type** | Low price of the option | [optional] 
**price_settlement** | **float, none_type** | Settlement price of the option | [optional] 
**price_strike** | **float, none_type** | The stated price per share for which underlying stock may be purchased (for a call) or sold (for a put) by the option holder upon exercise of the option contract. | [optional] 
**price_underlying** | **float, none_type** | The price of the security that must be delivered when a derivative contract, such as a put or call option, is exercised. | [optional] 
**price** | **float, none_type** | The price of the option based on the &#x60;quoteType&#x60; calculation. For US Options - Returns \&quot;Ask Price\&quot; if calc status&#x3D;&#x3D;20, otherwise returns \&quot;Mid Bid/Ask Price\&quot;. For International Options - Returns \&quot;Settlement Price\&quot;.  | [optional] 
**quote_type** | **str, none_type** | The calculated quote type, based on the calculated status. This represents the type for &#x60;price&#x60; field. For US Options - Returns \&quot;Ask Price\&quot; if calc status&#x3D;&#x3D;20, otherwise returns \&quot;Mid Bid/Ask Price\&quot;. For International Options - Returns \&quot;Settlement Price\&quot;.  | [optional] 
**request_id** | **str** | The requested identifier submitted in the query. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


