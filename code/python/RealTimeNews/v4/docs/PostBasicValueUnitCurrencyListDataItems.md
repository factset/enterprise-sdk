# PostBasicValueUnitCurrencyListDataItems

A list of objects. For semantical context see the description of the parent array.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **float, none_type** | Identifier of a currency. | [optional] 
**code** | **str, none_type** | Code of the currency: If assigned, a code according to ISO 4217, otherwise a local code, for a main currency; a code such as GBp (for British pence) for a fractional currency. | [optional] 
**iso_code** | **str, none_type** | ISO 4217 code of the value unit. Empty if the ISO 4217 standard does not define a code for the currency. | [optional] 
**name** | **str, none_type** | Name of the currency. | [optional] 
**type** | **str, none_type** | Type of the currency. | Value | Description | | --- | --- | | main | Currency that is a main currency. | | fractional | Currency that is a fractional currency. |   | [optional] 
**active** | **bool, none_type** | Indicates whether the currency is active. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


