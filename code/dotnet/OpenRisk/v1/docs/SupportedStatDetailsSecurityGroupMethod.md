# FactSet.SDK.OpenRisk.Model.SupportedStatDetailsSecurityGroupMethod
If present, describes the calculations specified in common by all of the 'derived' stats across all supported 'levels' containing 'SecurityGroup' in the name. If not present, security group calculations are not available for these stats.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Indicates the algorithm used to compute each security group&#39;s value from the  risk statistic values of its member securities. &#39;Sum&#39; takes the sum of all members&#39; values. The weighted average methods indicate &#39;weights&#39; and &#39;weighting&#39;. &#39;WeightedAverage&#39; weights each group&#39;s members&#39; statistic values and takes their average. &#39;WeightedNormalizedAverage&#39; normalizes the corresponding weights belonging within each group, weights each group&#39;s members&#39; statistic values, then takes the average. &#39;WeightedNormalizedAverageFill&#39; normalizes the corresponding weights belonging within each group or applies equal weighting for groups with zero net weight, weights each group&#39;s members&#39; statistic values, then takes the average. &#39;StatSpecific&#39; indicates unique calculations for the supported security group levels (inquire for more information). | 
**Weights** | **string** | Indicates the weights stat used to weight the security groups, applicable to weighted average group methods only. | [optional] 
**Weighting** | **string** | Indicates the weighting method used when allocating a net-weight position of risk statistics to multiple lots. This is relevant when a portfolio contains multiple lots with different signs such as long/short. For example, the case where a net-weight position is a positive risk contributor and a portfolio contains long and short positions. If this is &#39;AbsoluteValue&#39;, both long/short positions will have positive risk contribution, while &#39;ActualValue&#39; assigns positive risk contribution to a long position and negative risk contribution to a short position. Applicable to weighted average group methods only. | [optional] 
**Sqrt** | **bool** | Indicates whether the square root of each security group&#39;s value is taken (or not) as the final step of the calculation after the indicated algorithm to produce the result. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

