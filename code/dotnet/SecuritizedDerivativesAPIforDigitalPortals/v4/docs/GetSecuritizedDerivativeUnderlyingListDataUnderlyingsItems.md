# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItems
A list of objects. For semantical context see the description of the parent array.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Name of the underlying, provided also if there is no notation for the underlying. | [optional] 
**ValueUnit** | [**GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsValueUnit**](GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsValueUnit.md) |  | [optional] 
**OperatingMIC** | [**GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsOperatingMIC**](GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsOperatingMIC.md) |  | [optional] 
**Notation** | [**GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsNotation**](GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsNotation.md) |  | [optional] 
**CoverRatio** | **decimal?** | Cover ratio. It indicates the number of units of the underlying to which the securitized derivative refers. If the underlying is a bond the cover ratio represents the value of one percentage point.  | [optional] 
**ReferenceLevel** | **decimal?** | Level of the underlying on the issue date of the securitized derivative. | [optional] 
**ConstantLeverage** | **decimal?** | Constant leverage of the underlying for securitized derivatives with constant leverage that do not have a factor index as underlying (i.e. the attribute &#x60;typeComposite&#x60; of the underlying instrument is not set or is different from factorIndex). | [optional] 
**CalculationLevel** | [**GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsCalculationLevel**](GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsCalculationLevel.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

