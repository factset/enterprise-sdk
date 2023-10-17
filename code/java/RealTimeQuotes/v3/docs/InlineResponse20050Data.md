

# InlineResponse20050Data

Composite instrument and its components.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idInstrument** | **String** | MDG identifier of the instrument. |  [optional]
**sourceIdentifier** | **String** | Identifier used in the request. |  [optional]
**typeComposite** | [**TypeCompositeEnum**](#TypeCompositeEnum) | Type of the composite instrument. |  [optional]
**activeManagement** | **Boolean** | If set to true, the composite instrument is actively managed. |  [optional]
**managementFee** | **BigDecimal** | Management fee p.a. of the composite instrument. |  [optional]
**components** | [**java.util.List&lt;InlineResponse20050DataComponents&gt;**](InlineResponse20050DataComponents.md) | Information regarding the components of the composite instrument. |  [optional]



## Enum: TypeCompositeEnum

Name | Value
---- | -----
BASKET | &quot;basket&quot;
ALPHASTRUCTURE | &quot;alphaStructure&quot;
FUTURESSPREAD | &quot;futuresSpread&quot;
FACTORINDEX | &quot;factorIndex&quot;


## Implemented Interfaces

* Serializable


