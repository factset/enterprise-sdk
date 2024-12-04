

# PostBasicValueUnitListDataItems

A list of objects. For semantical context see the description of the parent array.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **BigDecimal** | Identifier of a value unit. |  [optional]
**code** | **String** | Code of the value unit: If assigned, a code according to ISO 4217, otherwise a local code, for a main currency; a code such as GBp (for British pence) for a fractional currency; or a code such as PT (points) for non-currency value units. |  [optional]
**isoCode** | **String** | ISO 4217 code of the value unit. Empty if the ISO 4217 standard does not define a code for the currency. |  [optional]
**name** | **String** | Name of the value unit. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of the value unit. | Value | Description | | --- | --- | | main | Main currency. | | fractional | Fractional currency. | | alternative | Alternative value unit. |   |  [optional]
**active** | **Boolean** | Indicates whether the currency is active. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
MAIN | &quot;main&quot;
FRACTIONAL | &quot;fractional&quot;
ALTERNATIVE | &quot;alternative&quot;


## Implemented Interfaces

* Serializable


