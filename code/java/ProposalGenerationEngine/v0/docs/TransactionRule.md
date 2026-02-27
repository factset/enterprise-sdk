

# TransactionRule


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**amount** | **BigDecimal** | absolute value in case the type is cash or percentage in the other 2 cases |  [optional]
**amountType** | [**AmountTypeEnum**](#AmountTypeEnum) |  |  [optional]
**amountGrowth** | **BigDecimal** | apply growth rate to the amount for each period expressed in percentage |  [optional]
**amountGrowthType** | [**AmountGrowthTypeEnum**](#AmountGrowthTypeEnum) |  |  [optional]
**amountGrowthFrequency** | [**AmountGrowthFrequencyEnum**](#AmountGrowthFrequencyEnum) |  |  [optional]
**allowPartialAmount** | **Boolean** |  |  [optional]
**startDate** | **LocalDate** | initial date when the rule is applied |  [optional]
**endDate** | **LocalDate** | last date when the rule is applied |  [optional]
**frequency** | **BigDecimal** | monthly - 12, yearly - 1, quarterly - 4; only once &#x3D; endPeriod should be equal to startPeriod |  [optional]
**frequencyAlignment** | [**FrequencyAlignmentEnum**](#FrequencyAlignmentEnum) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
FEE | &quot;fee&quot;
CONTRIBUTION | &quot;contribution&quot;
WITHRAWAL | &quot;withrawal&quot;



## Enum: AmountTypeEnum

Name | Value
---- | -----
CASH | &quot;cash&quot;
PERCENTAGEPV | &quot;percentagePV&quot;
PERCENTAGEPVGROWTH | &quot;percentagePVGrowth&quot;



## Enum: AmountGrowthTypeEnum

Name | Value
---- | -----
ABSOLUTE | &quot;absolute&quot;
PERCENTAGE | &quot;percentage&quot;



## Enum: AmountGrowthFrequencyEnum

Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_4 | 4
NUMBER_6 | 6
NUMBER_12 | 12



## Enum: FrequencyAlignmentEnum

Name | Value
---- | -----
NUMBER_1 | new BigDecimal(&quot;1&quot;)
NUMBER_2 | new BigDecimal(&quot;2&quot;)
NUMBER_4 | new BigDecimal(&quot;4&quot;)
NUMBER_6 | new BigDecimal(&quot;6&quot;)
NUMBER_12 | new BigDecimal(&quot;12&quot;)


## Implemented Interfaces

* Serializable


