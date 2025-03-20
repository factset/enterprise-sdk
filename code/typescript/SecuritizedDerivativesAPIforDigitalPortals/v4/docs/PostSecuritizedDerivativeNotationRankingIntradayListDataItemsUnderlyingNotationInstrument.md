# securitizedderivativesapifordigitalportals.PostSecuritizedDerivativeNotationRankingIntradayListDataItemsUnderlyingNotationInstrument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the instrument. | [optional] 
**typeComposite** | **String** | Type of composite instrument, in case the underlying is a composite instrument. | Value | Description | | --- | --- | | basket | A basket is a composite instrument which consists of several components. Its value is calculated as the weighted combination of the levels of the components. All weights are positive. | | alphaStructure | An alpha structure is a composite instrument which consists of two components. Its value is calculated as the difference of the performances of the components. The performances are measured starting at the date specified in the conditions of the securitized derivative. | | futuresSpread | A futures spread is a composite instrument which is built of two or more different futures contracts as its components. | | factorIndex | A factor index is a composite instrument that reflects the day-to-day performance of its component, multiplied with a constant factor. The related capital costs and fees for calculation and administration are not represented. |   | [optional] 



## Enum: TypeCompositeEnum


* `basket` (value: `"basket"`)

* `alphaStructure` (value: `"alphaStructure"`)

* `futuresSpread` (value: `"futuresSpread"`)

* `factorIndex` (value: `"factorIndex"`)




