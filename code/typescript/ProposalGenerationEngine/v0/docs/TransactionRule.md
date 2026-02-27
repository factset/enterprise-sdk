# proposalgenerationengine.TransactionRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | [optional] 
**amount** | **Number** | absolute value in case the type is cash or percentage in the other 2 cases | [optional] 
**amountType** | **String** |  | [optional] 
**amountGrowth** | **Number** | apply growth rate to the amount for each period expressed in percentage | [optional] 
**amountGrowthType** | **String** |  | [optional] 
**amountGrowthFrequency** | **Number** |  | [optional] 
**allowPartialAmount** | **Boolean** |  | [optional] [default to false]
**startDate** | **Date** | initial date when the rule is applied | [optional] 
**endDate** | **Date** | last date when the rule is applied | [optional] 
**frequency** | **Number** | monthly - 12, yearly - 1, quarterly - 4; only once &#x3D; endPeriod should be equal to startPeriod | [optional] 
**frequencyAlignment** | **Number** |  | [optional] 



## Enum: TypeEnum


* `fee` (value: `"fee"`)

* `contribution` (value: `"contribution"`)

* `withrawal` (value: `"withrawal"`)





## Enum: AmountTypeEnum


* `cash` (value: `"cash"`)

* `percentagePV` (value: `"percentagePV"`)

* `percentagePVGrowth` (value: `"percentagePVGrowth"`)





## Enum: AmountGrowthTypeEnum


* `absolute` (value: `"absolute"`)

* `percentage` (value: `"percentage"`)





## Enum: AmountGrowthFrequencyEnum


* `1` (value: `1`)

* `2` (value: `2`)

* `4` (value: `4`)

* `6` (value: `6`)

* `12` (value: `12`)





## Enum: FrequencyAlignmentEnum


* `1` (value: `1`)

* `2` (value: `2`)

* `4` (value: `4`)

* `6` (value: `6`)

* `12` (value: `12`)




