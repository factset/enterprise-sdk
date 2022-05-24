# InlineResponse2004Data


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Identifier of a notation. | [optional] 
**symbol** | **str** | The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market. | [optional] 
**fsym** | [**InlineResponse2004Fsym**](InlineResponse2004Fsym.md) |  | [optional] 
**market** | [**InlineResponse2004Market**](InlineResponse2004Market.md) |  | [optional] 
**value_unit** | [**InlineResponse2004ValueUnit**](InlineResponse2004ValueUnit.md) |  | [optional] 
**trade** | [**InlineResponse2004Trade**](InlineResponse2004Trade.md) |  | [optional] 
**quality** | **str** | Quality of the trade-related attributes, see attributes &#x60;trade&#x60; and &#x60;accumulated&#x60;. | [optional] 
**accumulated** | [**InlineResponse2004Accumulated**](InlineResponse2004Accumulated.md) |  | [optional] 
**instrument** | [**InlineResponse2004Instrument**](InlineResponse2004Instrument.md) |  | [optional] 
**categorization** | [**InlineResponse2004Categorization**](InlineResponse2004Categorization.md) |  | [optional] 
**life_cycle** | [**InlineResponse2004LifeCycle**](InlineResponse2004LifeCycle.md) |  | [optional] 
**issuer** | [**InlineResponse2004Issuer**](InlineResponse2004Issuer.md) |  | [optional] 
**exercise** | [**InlineResponse2004Exercise**](InlineResponse2004Exercise.md) |  | [optional] 
**participation** | **str** | Participation direction of a factor certificate at the level movement of its effective underlying. | [optional] 
**underlying** | [**InlineResponse2004Underlying**](InlineResponse2004Underlying.md) |  | [optional] 
**knocked_out** | **bool** | Indicates whether the securitized derivative is knocked-out (&#x60;true&#x60;) or not (&#x60;false&#x60;). Particularly relevant for knock-out certificates. | [optional] 
**knocked_in** | **bool** | Indicates whether the securitized derivative is knocked-in (&#x60;true&#x60;) or not (&#x60;false&#x60;). Particularly relevant for bonus certificates but also for securitized derivatives that might have additional protection such as reverse convertible bonds, discount certificates, and capital-protection certificates. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


