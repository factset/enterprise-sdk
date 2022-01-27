# InlineResponse2006InstrumentUnderlying

Underlying data of the securitized derivative.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Name of the underlying, provided also if there is no notation for the underlying. | [optional] 
**value_unit** | [**InlineResponse2006InstrumentUnderlyingValueUnit**](InlineResponse2006InstrumentUnderlyingValueUnit.md) |  | [optional] 
**cover_ratio** | **float** | Cover ratio. It indicates the number of units of the underlying to which the securitized derivative refers. If the underlying is a bond the cover ratio represents the value of one percentage point.  | [optional] 
**notation** | [**InlineResponse2006InstrumentUnderlyingNotation**](InlineResponse2006InstrumentUnderlyingNotation.md) |  | [optional] 
**effective_underlying** | [**InlineResponse2004UnderlyingEffectiveUnderlying**](InlineResponse2004UnderlyingEffectiveUnderlying.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


