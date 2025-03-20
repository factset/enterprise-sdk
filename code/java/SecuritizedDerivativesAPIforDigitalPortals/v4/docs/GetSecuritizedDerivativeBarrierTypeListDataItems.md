

# GetSecuritizedDerivativeBarrierTypeListDataItems

A list of objects. For semantical context see the description of the parent array.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **BigDecimal** | Identifier of the barrier type. |  [optional]
**name** | **String** | English name of the barrier type. |  [optional]
**description** | **String** | English description of the barrier type. |  [optional]
**kind** | [**KindEnum**](#KindEnum) | Kind of the barrier type. | Value | Description | | --- | --- | | single | Barrier types of this kind represent either a lower or an upper bound derived from the exercise right of the securitized derivative, see attribute &#x60;exercise.right&#x60; in endpoint &#x60;/securitized-derivative/get&#x60;. | | range | Barrier types of this kind represent a range with a lower and an upper bound. |   |  [optional]



## Enum: KindEnum

Name | Value
---- | -----
SINGLE | &quot;single&quot;
RANGE | &quot;range&quot;


## Implemented Interfaces

* Serializable


