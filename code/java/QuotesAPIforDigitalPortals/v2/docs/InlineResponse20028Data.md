

# InlineResponse20028Data

Details of a fractional currency.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Code of the fractional currency such as GBp (for British pence), USc (for U.S. cents), EUc for (Euro cent). |  [optional]
**name** | **String** | Name of the fractional currency. |  [optional]
**factor** | **BigDecimal** | Conversion factor between the fractional and its main currency. For example, the value 100 indicates that 100 US cents are equivalent to one US dollar. |  [optional]
**mainCurrency** | [**InlineResponse20028DataMainCurrency**](InlineResponse20028DataMainCurrency.md) |  |  [optional]


## Implemented Interfaces

* Serializable


