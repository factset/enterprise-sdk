# realtimequotes.InlineResponse20024Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Code of the value unit: If assigned, a code according to ISO 4217, otherwise a local code, for a main currency; a code such as GBp (for British pence) for a fractional currency; or a code such as PT (points) for non-currency value units. | [optional] 
**isoCode** | **String** | ISO 4217 code of the value unit. Empty if the ISO 4217 standard does not define a code for the currency. | [optional] 
**name** | **String** | Name of the value unit. | [optional] 
**type** | **String** | Type of the value unit. | [optional] 
**active** | **Boolean** | Indicates whether the value unit is active. | [optional] 



## Enum: TypeEnum


* `main` (value: `"main"`)

* `fractional` (value: `"fractional"`)

* `alternative` (value: `"alternative"`)




