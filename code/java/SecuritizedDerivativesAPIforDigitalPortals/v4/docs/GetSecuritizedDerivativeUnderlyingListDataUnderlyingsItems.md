

# GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItems

A list of objects. For semantical context see the description of the parent array.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the underlying, provided also if there is no notation for the underlying. |  [optional]
**valueUnit** | [**GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsValueUnit**](GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsValueUnit.md) |  |  [optional]
**operatingMIC** | [**GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsOperatingMIC**](GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsOperatingMIC.md) |  |  [optional]
**notation** | [**GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsNotation**](GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsNotation.md) |  |  [optional]
**coverRatio** | **BigDecimal** | Cover ratio. It indicates the number of units of the underlying to which the securitized derivative refers. If the underlying is a bond the cover ratio represents the value of one percentage point.  |  [optional]
**referenceLevel** | **BigDecimal** | Level of the underlying on the issue date of the securitized derivative. |  [optional]
**constantLeverage** | **BigDecimal** | Constant leverage of the underlying for securitized derivatives with constant leverage that do not have a factor index as underlying (i.e. the attribute &#x60;typeComposite&#x60; of the underlying instrument is not set or is different from factorIndex). |  [optional]
**calculationLevel** | [**GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsCalculationLevel**](GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsCalculationLevel.md) |  |  [optional]


## Implemented Interfaces

* Serializable


