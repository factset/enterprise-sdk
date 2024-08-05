

# SupportedStatDetails

Details on support and/or requirement for certain name-settings statistics options (such as: correlated specific risk, covariance isolation method, etc.), derived stats, available levels, security group calculation methodology, and multi-lot security allocation. When 'securityGroupMethod' is 'statSpecific', please refer to the risk statistics documentation service or inquire for more information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**correlatedSpecificRisk** | **Boolean** | Indicates support for correlated specific risk (CSR) calculation setting if true, and false if the setting is prohibited. | 
**covarianceTimesTwo** | **Boolean** | Indicates support for covariance times two (Cov*2) calculation setting if true, and false if the setting is prohibited. | 
**requiresCorrelatedSpecificRisk** | **Boolean** | Indicates correlated specific risk (CSR) calculation setting is mandatory for the stat, if true. | 
**requiresCovarianceTimesTwo** | **Boolean** | Indicates covariance times two (Cov*2) calculation setting is mandatory for the stat, if true. | 
**derived** | **java.util.List&lt;String&gt;** | A list of the base stat and all possible derived stats which are currently supported by the service. | 
**supportedLevels** | **java.util.List&lt;StatCalculationLevel&gt;** | Indicates the calculation levels that are supported by the base stat and all derived stats. Unless it is present, a given calculation level is not supported. | 
**securityGroupMethod** | [**SupportedStatDetailsSecurityGroupMethod**](SupportedStatDetailsSecurityGroupMethod.md) |  |  [optional]
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


