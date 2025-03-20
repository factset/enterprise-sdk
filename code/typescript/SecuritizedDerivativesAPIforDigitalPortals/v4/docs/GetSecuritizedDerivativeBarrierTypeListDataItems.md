# securitizedderivativesapifordigitalportals.GetSecuritizedDerivativeBarrierTypeListDataItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** | Identifier of the barrier type. | [optional] 
**name** | **String** | English name of the barrier type. | [optional] 
**description** | **String** | English description of the barrier type. | [optional] 
**kind** | **String** | Kind of the barrier type. | Value | Description | | --- | --- | | single | Barrier types of this kind represent either a lower or an upper bound derived from the exercise right of the securitized derivative, see attribute &#x60;exercise.right&#x60; in endpoint &#x60;/securitized-derivative/get&#x60;. | | range | Barrier types of this kind represent a range with a lower and an upper bound. |   | [optional] 



## Enum: KindEnum


* `single` (value: `"single"`)

* `range` (value: `"range"`)




