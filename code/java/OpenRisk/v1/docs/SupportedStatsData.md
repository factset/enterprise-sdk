

# SupportedStatsData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**correlatedSpecificRisk** | **Boolean** |  | 
**covarianceTimesTwo** | **Boolean** |  | 
**requiresCorrelatedSpecificRisk** | **Boolean** |  | 
**requiresCovarianceTimesTwo** | **Boolean** |  | 
**derived** | **java.util.List&lt;String&gt;** | A list of the base stat and all possible derived stats which are currently supported by the service. | 
**levels** | [**SupportedStatsLevels**](SupportedStatsLevels.md) |  | 
**securityGroupMethod** | [**SupportedStatsSecurityGroupMethod**](SupportedStatsSecurityGroupMethod.md) |  |  [optional]
**securityLotAllocation** | [**SecurityLotAllocationEnum**](#SecurityLotAllocationEnum) | Indicates the weights according to which securities with multiple lots have their risk statistic values allocated. &#39;FillAll&#39; indicates the computed statistic value of a particular security is allocated to each of its lots equally. This is common for risk statistics such as marginal statistics or beta. If security group calculations are available, these weights will be used along with &#39;weighting&#39; method specified in &#39;securityGroupMethod&#39;. For example, if this is &#39;ActiveWeights&#39; and &#39;weighting&#39; is &#39;AbsoluteValue&#39;, a net position value is allocated to multiple lots based off of absolute active weights distribution. |  [optional]



## Enum: SecurityLotAllocationEnum

Name | Value
---- | -----
PORTFOLIOWEIGHTS | &quot;PortfolioWeights&quot;
BENCHMARKWEIGHTS | &quot;BenchmarkWeights&quot;
ACTIVEWEIGHTS | &quot;ActiveWeights&quot;
MARKETWEIGHTS | &quot;MarketWeights&quot;
FILLALL | &quot;FillAll&quot;


## Implemented Interfaces

* Serializable


