# realtimenews.PostBasicValueUnitCurrencyListDataItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** | Identifier of a currency. | [optional] 
**code** | **String** | Code of the currency: If assigned, a code according to ISO 4217, otherwise a local code, for a main currency; a code such as GBp (for British pence) for a fractional currency. | [optional] 
**isoCode** | **String** | ISO 4217 code of the value unit. Empty if the ISO 4217 standard does not define a code for the currency. | [optional] 
**name** | **String** | Name of the currency. | [optional] 
**type** | **String** | Type of the currency. | Value | Description | | --- | --- | | main | Currency that is a main currency. | | fractional | Currency that is a fractional currency. |   | [optional] 
**active** | **Boolean** | Indicates whether the currency is active. | [optional] 



## Enum: TypeEnum


* `main` (value: `"main"`)

* `fractional` (value: `"fractional"`)




