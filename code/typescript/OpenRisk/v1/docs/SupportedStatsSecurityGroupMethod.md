# openrisk.SupportedStatsSecurityGroupMethod

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Indicates the algorithm used to compute each security group&#39;s value from the  risk statistic values of its member securities. &#39;Sum&#39; takes the sum of all members&#39; values. The weighted average methods indicate &#39;weights&#39; and &#39;weighting&#39;. &#39;WeightedAverage&#39; weights each group&#39;s members&#39; statistic values and takes their average. &#39;WeightedNormalizedAverage&#39; normalizes the corresponding weights belonging within each group, weights each group&#39;s members&#39; statistic values, then takes the average. &#39;WeightedNormalizedAverageFill&#39; normalizes the corresponding weights belonging within each group or applies equal weighting for groups with zero net weight, weights each group&#39;s members&#39; statistic values, then takes the average. &#39;StatSpecific&#39; indicates unique calculations for the supported security group levels (inquire for more information). | 
**weights** | **String** | Indicates the weights stat used to weight the security groups, applicable to weighted average group methods only. | [optional] 
**weighting** | **String** | Indicates the weighting method used when allocating a net-weight position of risk statistics to multiple lots. This is relevant when a portfolio contains multiple lots with different signs such as long/short. For example, the case where a net-weight position is a positive risk contributor and a portfolio contains long and short positions. If this is &#39;AbsoluteValue&#39;, both long/short positions will have positive risk contribution, while &#39;ActualValue&#39; assigns positive risk contribution to a long position and negative risk contribution to a short position. Applicable to weighted average group methods only. | [optional] 
**sqrt** | **Boolean** | Indicates whether the square root of each security group&#39;s value is taken (or not) as the final step of the calculation after the indicated algorithm to produce the result. | 



## Enum: NameEnum


* `StatSpecific` (value: `"StatSpecific"`)

* `Sum` (value: `"Sum"`)

* `WeightedAverage` (value: `"WeightedAverage"`)

* `WeightedNormalizedAverage` (value: `"WeightedNormalizedAverage"`)

* `WeightedNormalizedAverageFill` (value: `"WeightedNormalizedAverageFill"`)





## Enum: WeightsEnum


* `PortfolioWeights` (value: `"PortfolioWeights"`)

* `BenchmarkWeights` (value: `"BenchmarkWeights"`)

* `ActiveWeights` (value: `"ActiveWeights"`)

* `MarketWeights` (value: `"MarketWeights"`)





## Enum: WeightingEnum


* `AbsoluteValue` (value: `"AbsoluteValue"`)

* `ActualValue` (value: `"ActualValue"`)




