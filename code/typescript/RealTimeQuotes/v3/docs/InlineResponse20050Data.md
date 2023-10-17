# realtimequotes.InlineResponse20050Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idInstrument** | **String** | MDG identifier of the instrument. | [optional] 
**sourceIdentifier** | **String** | Identifier used in the request. | [optional] 
**typeComposite** | **String** | Type of the composite instrument. | [optional] 
**activeManagement** | **Boolean** | If set to true, the composite instrument is actively managed. | [optional] 
**managementFee** | **Number** | Management fee p.a. of the composite instrument. | [optional] 
**components** | [**[InlineResponse20050DataComponents]**](InlineResponse20050DataComponents.md) | Information regarding the components of the composite instrument. | [optional] 



## Enum: TypeCompositeEnum


* `basket` (value: `"basket"`)

* `alphaStructure` (value: `"alphaStructure"`)

* `futuresSpread` (value: `"futuresSpread"`)

* `factorIndex` (value: `"factorIndex"`)




