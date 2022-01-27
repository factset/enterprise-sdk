

# InlineResponse2006InstrumentUnderlying

Underlying data of the securitized derivative.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the underlying, provided also if there is no notation for the underlying. |  [optional]
**valueUnit** | [**InlineResponse2006InstrumentUnderlyingValueUnit**](InlineResponse2006InstrumentUnderlyingValueUnit.md) |  |  [optional]
**coverRatio** | **BigDecimal** | Cover ratio. It indicates the number of units of the underlying to which the securitized derivative refers. If the underlying is a bond the cover ratio represents the value of one percentage point.  |  [optional]
**notation** | [**InlineResponse2006InstrumentUnderlyingNotation**](InlineResponse2006InstrumentUnderlyingNotation.md) |  |  [optional]
**effectiveUnderlying** | [**InlineResponse2004UnderlyingEffectiveUnderlying**](InlineResponse2004UnderlyingEffectiveUnderlying.md) |  |  [optional]


## Implemented Interfaces

* Serializable


