# GetBasicValueUnitCurrencyFractionalListDataItems

A list of objects. For semantical context see the description of the parent array.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **float, none_type** | Identifier of the fractional currency, which is a value unit. | [optional] 
**code** | **str, none_type** | Code of the fractional currency such as GBp (for British pence), USc (for U.S. cents), EUc for (Euro cent). | [optional] 
**name** | **str, none_type** | Name of the fractional currency. | [optional] 
**factor** | **float, none_type** | Conversion factor between the fractional and its main currency. For example, the value 100 indicates that 100 US cents are equivalent to one US dollar. | [optional] 
**main_currency** | [**GetBasicValueUnitCurrencyFractionalListDataItemsMainCurrency**](GetBasicValueUnitCurrencyFractionalListDataItemsMainCurrency.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


