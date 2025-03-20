# securitizedderivativesapifordigitalportals.PostSecuritizedDerivativeNotationScreenerSearchRequestDataExercise

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**right** | **String** | Code of the exercise right. | Value | Description | | --- | --- | | put | A put option gives buyer the right, but not the obligation, to sell an asset at a specified price within a specific time period. Put is synonymous to short or bear and is used in a broader sense for products that make profits from falling underlying levels. | | call | A call option gives buyer the right, but not the obligation, to buy an asset at a specified price within a specific time period. Call is synonymous to long or bull and is used in a broader sense for products that make profits from rising underlying levels. |   | [optional] 
**style** | **String** | Code of the exercise style. | Value | Description | | --- | --- | | american | An American-style securitized derivative can be exercised anytime during its life. | | european | An European-style securitized derivative can be exercised at maturity only. | | bermudan | A Bermudan-style securitized derivative can be exercised only on predetermined dates. |   | [optional] 



## Enum: RightEnum


* `put` (value: `"put"`)

* `call` (value: `"call"`)





## Enum: StyleEnum


* `american` (value: `"american"`)

* `european` (value: `"european"`)

* `bermudan` (value: `"bermudan"`)




