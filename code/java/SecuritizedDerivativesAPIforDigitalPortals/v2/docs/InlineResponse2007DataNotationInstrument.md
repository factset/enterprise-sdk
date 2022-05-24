

# InlineResponse2007DataNotationInstrument

Instrument of the underlying.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the instrument. |  [optional]
**fsym** | [**InlineResponse2004InstrumentFsym**](InlineResponse2004InstrumentFsym.md) |  |  [optional]
**typeComposite** | [**TypeCompositeEnum**](#TypeCompositeEnum) | Type of composite instrument, in case the underlying is a composite instrument. |  [optional]



## Enum: TypeCompositeEnum

Name | Value
---- | -----
BASKET | &quot;basket&quot;
ALPHASTRUCTURE | &quot;alphaStructure&quot;
FUTURESSPREAD | &quot;futuresSpread&quot;
FACTORINDEX | &quot;factorIndex&quot;


## Implemented Interfaces

* Serializable


