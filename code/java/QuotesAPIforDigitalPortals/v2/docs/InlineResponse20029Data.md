

# InlineResponse20029Data


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **BigDecimal** | Identifier of the fractional currency, which is a value unit. |  [optional]
**code** | **String** | Code of the fractional currency such as GBp (for British pence), USc (for U.S. cents), EUc for (Euro cent). |  [optional]
**name** | **String** | Name of the fractional currency. |  [optional]
**factor** | **BigDecimal** | Conversion factor between the fractional and its main currency. For example, the value 100 indicates that 100 US cents are equivalent to one US dollar. |  [optional]
**mainCurrency** | [**InlineResponse20029MainCurrency**](InlineResponse20029MainCurrency.md) |  |  [optional]


## Implemented Interfaces

* Serializable


