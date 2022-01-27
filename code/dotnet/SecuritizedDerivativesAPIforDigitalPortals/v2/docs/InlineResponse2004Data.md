# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.InlineResponse2004Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifier of a notation. | [optional] 
**Symbol** | **string** | The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market. | [optional] 
**Market** | [**InlineResponse2004Market**](InlineResponse2004Market.md) |  | [optional] 
**ValueUnit** | [**InlineResponse2004ValueUnit**](InlineResponse2004ValueUnit.md) |  | [optional] 
**Trade** | [**InlineResponse2004Trade**](InlineResponse2004Trade.md) |  | [optional] 
**Quality** | **string** | Quality of the trade-related attributes, see attributes &#x60;trade&#x60; and &#x60;accumulated&#x60;. | [optional] 
**Accumulated** | [**InlineResponse2004Accumulated**](InlineResponse2004Accumulated.md) |  | [optional] 
**Instrument** | [**InlineResponse2004Instrument**](InlineResponse2004Instrument.md) |  | [optional] 
**Categorization** | [**InlineResponse2004Categorization**](InlineResponse2004Categorization.md) |  | [optional] 
**LifeCycle** | [**InlineResponse2004LifeCycle**](InlineResponse2004LifeCycle.md) |  | [optional] 
**Issuer** | [**InlineResponse2004Issuer**](InlineResponse2004Issuer.md) |  | [optional] 
**Exercise** | [**InlineResponse2004Exercise**](InlineResponse2004Exercise.md) |  | [optional] 
**Participation** | **string** | Participation direction of a factor certificate at the level movement of its effective underlying. | [optional] 
**Underlying** | [**InlineResponse2004Underlying**](InlineResponse2004Underlying.md) |  | [optional] 
**KnockedOut** | **bool** | Indicates whether the securitized derivative is knocked-out (&#x60;true&#x60;) or not (&#x60;false&#x60;). Particularly relevant for knock-out certificates. | [optional] 
**KnockedIn** | **bool** | Indicates whether the securitized derivative is knocked-in (&#x60;true&#x60;) or not (&#x60;false&#x60;). Particularly relevant for bonus certificates but also for securitized derivatives that might have additional protection such as reverse convertible bonds, discount certificates, and capital-protection certificates. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

