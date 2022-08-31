# FactSet.SDK.OpenRisk.Model.SupportedStatsData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CorrelatedSpecificRisk** | **bool** |  | 
**CovarianceTimesTwo** | **bool** |  | 
**RequiresCorrelatedSpecificRisk** | **bool** |  | 
**RequiresCovarianceTimesTwo** | **bool** |  | 
**Derived** | **List&lt;string&gt;** | A list of the base stat and all possible derived stats which are currently supported by the service. | 
**Levels** | [**SupportedStatsLevels**](SupportedStatsLevels.md) |  | 
**SecurityGroupMethod** | [**SupportedStatsSecurityGroupMethod**](SupportedStatsSecurityGroupMethod.md) |  | [optional] 
**SecurityLotAllocation** | **string** | Indicates the weights according to which securities with multiple lots have their risk statistic values allocated. &#39;FillAll&#39; indicates the computed statistic value of a particular security is allocated to each of its lots equally. This is common for risk statistics such as marginal statistics or beta. If security group calculations are available, these weights will be used along with &#39;weighting&#39; method specified in &#39;securityGroupMethod&#39;. For example, if this is &#39;ActiveWeights&#39; and &#39;weighting&#39; is &#39;AbsoluteValue&#39;, a net position value is allocated to multiple lots based off of absolute active weights distribution. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

