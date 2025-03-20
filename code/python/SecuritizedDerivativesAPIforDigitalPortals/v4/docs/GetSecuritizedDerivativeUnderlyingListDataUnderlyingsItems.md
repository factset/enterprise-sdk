# GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItems

A list of objects. For semantical context see the description of the parent array.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str, none_type** | Name of the underlying, provided also if there is no notation for the underlying. | [optional] 
**value_unit** | [**GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsValueUnit**](GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsValueUnit.md) |  | [optional] 
**operating_mic** | [**GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsOperatingMIC**](GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsOperatingMIC.md) |  | [optional] 
**notation** | [**GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsNotation**](GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsNotation.md) |  | [optional] 
**cover_ratio** | **float, none_type** | Cover ratio. It indicates the number of units of the underlying to which the securitized derivative refers. If the underlying is a bond the cover ratio represents the value of one percentage point.  | [optional] 
**reference_level** | **float, none_type** | Level of the underlying on the issue date of the securitized derivative. | [optional] 
**constant_leverage** | **float, none_type** | Constant leverage of the underlying for securitized derivatives with constant leverage that do not have a factor index as underlying (i.e. the attribute &#x60;typeComposite&#x60; of the underlying instrument is not set or is different from factorIndex). | [optional] 
**calculation_level** | [**GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsCalculationLevel**](GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsCalculationLevel.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


