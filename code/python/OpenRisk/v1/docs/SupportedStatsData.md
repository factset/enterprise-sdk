# SupportedStatsData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**correlated_specific_risk** | **bool** |  | 
**covariance_times_two** | **bool** |  | 
**requires_correlated_specific_risk** | **bool** |  | 
**requires_covariance_times_two** | **bool** |  | 
**derived** | **[str]** | A list of the base stat and all possible derived stats which are currently supported by the service. | 
**levels** | [**SupportedStatsLevels**](SupportedStatsLevels.md) |  | 
**security_group_method** | [**SupportedStatsSecurityGroupMethod**](SupportedStatsSecurityGroupMethod.md) |  | [optional] 
**security_lot_allocation** | **str** | Indicates the weights according to which securities with multiple lots have their risk statistic values allocated. &#39;FillAll&#39; indicates the computed statistic value of a particular security is allocated to each of its lots equally. This is common for risk statistics such as marginal statistics or beta. If security group calculations are available, these weights will be used along with &#39;weighting&#39; method specified in &#39;securityGroupMethod&#39;. For example, if this is &#39;ActiveWeights&#39; and &#39;weighting&#39; is &#39;AbsoluteValue&#39;, a net position value is allocated to multiple lots based off of absolute active weights distribution. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


