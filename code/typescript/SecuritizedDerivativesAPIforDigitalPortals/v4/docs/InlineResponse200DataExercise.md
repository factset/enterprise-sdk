# securitizedderivativesapifordigitalportals.InlineResponse200DataExercise

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**right** | **String** | Code of the exercise right. | Value | Description | | --- | --- | | put | A put option gives buyer the right, but not the obligation, to sell an asset at a specified price within a specific time period. | | call | A call option gives buyer the right, but not the obligation, to buy an asset at a specified price within a specific time period. |   | [optional] 
**style** | **String** | Code of the exercise style. | Value | Description | | --- | --- | | american | An American style option can be exercised anytime during its life. | | european | A European style option can be exercised at the end of its life. | | bermudan | A Bermudan style option can only be exercised on predetermined dates. |   | [optional] 



## Enum: RightEnum


* `put` (value: `"put"`)

* `call` (value: `"call"`)





## Enum: StyleEnum


* `american` (value: `"american"`)

* `european` (value: `"european"`)

* `bermudan` (value: `"bermudan"`)




