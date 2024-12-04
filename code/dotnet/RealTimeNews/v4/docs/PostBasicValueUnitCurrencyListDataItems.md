# FactSet.SDK.RealTimeNews.Model.PostBasicValueUnitCurrencyListDataItems
A list of objects. For semantical context see the description of the parent array.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **decimal?** | Identifier of a currency. | [optional] 
**Code** | **string** | Code of the currency: If assigned, a code according to ISO 4217, otherwise a local code, for a main currency; a code such as GBp (for British pence) for a fractional currency. | [optional] 
**IsoCode** | **string** | ISO 4217 code of the value unit. Empty if the ISO 4217 standard does not define a code for the currency. | [optional] 
**Name** | **string** | Name of the currency. | [optional] 
**Type** | **string** | Type of the currency. | Value | Description | | - -- | - -- | | main | Currency that is a main currency. | | fractional | Currency that is a fractional currency. |   | [optional] 
**Active** | **bool?** | Indicates whether the currency is active. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

