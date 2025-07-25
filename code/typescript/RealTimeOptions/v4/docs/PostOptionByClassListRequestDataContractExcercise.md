# realtimeoptions.PostOptionByClassListRequestDataContractExcercise

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**right** | **String** | Restricts the exercise right of the option. | Value | Description | | --- | --- | | put | A put option gives the owner the right, but not the obligation, to sell an asset at a specified price within a specific time period. | | call | A call option gives the owner the right, but not the obligation, to buy an asset at a specified price within a specific time period. |   | [optional] 
**style** | **String** | Restricts the exercise style of the option. | Value | Description | | --- | --- | | american | An American-style option can be exercised anytime during its life. | | european | A European-style option can be exercised at the end of its life. |   | [optional] 



## Enum: RightEnum


* `put` (value: `"put"`)

* `call` (value: `"call"`)





## Enum: StyleEnum


* `american` (value: `"american"`)

* `european` (value: `"european"`)




