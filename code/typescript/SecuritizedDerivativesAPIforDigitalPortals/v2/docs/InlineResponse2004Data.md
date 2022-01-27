# securitizedderivativesapifordigitalportals.InlineResponse2004Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of a notation. | [optional] 
**symbol** | **String** | The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market. | [optional] 
**market** | [**InlineResponse2004Market**](InlineResponse2004Market.md) |  | [optional] 
**valueUnit** | [**InlineResponse2004ValueUnit**](InlineResponse2004ValueUnit.md) |  | [optional] 
**trade** | [**InlineResponse2004Trade**](InlineResponse2004Trade.md) |  | [optional] 
**quality** | **String** | Quality of the trade-related attributes, see attributes &#x60;trade&#x60; and &#x60;accumulated&#x60;. | [optional] 
**accumulated** | [**InlineResponse2004Accumulated**](InlineResponse2004Accumulated.md) |  | [optional] 
**instrument** | [**InlineResponse2004Instrument**](InlineResponse2004Instrument.md) |  | [optional] 
**categorization** | [**InlineResponse2004Categorization**](InlineResponse2004Categorization.md) |  | [optional] 
**lifeCycle** | [**InlineResponse2004LifeCycle**](InlineResponse2004LifeCycle.md) |  | [optional] 
**issuer** | [**InlineResponse2004Issuer**](InlineResponse2004Issuer.md) |  | [optional] 
**exercise** | [**InlineResponse2004Exercise**](InlineResponse2004Exercise.md) |  | [optional] 
**participation** | **String** | Participation direction of a factor certificate at the level movement of its effective underlying. | [optional] 
**underlying** | [**InlineResponse2004Underlying**](InlineResponse2004Underlying.md) |  | [optional] 
**knockedOut** | **Boolean** | Indicates whether the securitized derivative is knocked-out (&#x60;true&#x60;) or not (&#x60;false&#x60;). Particularly relevant for knock-out certificates. | [optional] 
**knockedIn** | **Boolean** | Indicates whether the securitized derivative is knocked-in (&#x60;true&#x60;) or not (&#x60;false&#x60;). Particularly relevant for bonus certificates but also for securitized derivatives that might have additional protection such as reverse convertible bonds, discount certificates, and capital-protection certificates. | [optional] 



## Enum: QualityEnum


* `RLT` (value: `"RLT"`)

* `DLY` (value: `"DLY"`)





## Enum: ParticipationEnum


* `long` (value: `"long"`)

* `short` (value: `"short"`)




