

# InlineResponse20062DataDistributionChannel

MiFID distribution channel provides information on the different services a firm might employ in order to deliver an investment product to its customers and on the client type the particular service is appropriate for.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**executionOnly** | [**ExecutionOnlyEnum**](#ExecutionOnlyEnum) | Indicates the client type(s) for which the investment product is suitable through the distribution channel \&quot;execution only / reception and transmission of orders (RTO) without appropriateness assessment\&quot;. |  [optional]
**executionAppropriateness** | [**ExecutionAppropriatenessEnum**](#ExecutionAppropriatenessEnum) | Indicates the client type(s) for which the investment product is suitable through the distribution channel \&quot;execution only / reception and transmission of orders (RTO) with appropriateness assessment\&quot;. |  [optional]
**investmentAdvice** | [**InvestmentAdviceEnum**](#InvestmentAdviceEnum) | Indicates the client type(s) for which the investment product is suitable through the distribution channel \&quot;investment advice with suitability assessment\&quot;. |  [optional]
**portfolioManagement** | [**PortfolioManagementEnum**](#PortfolioManagementEnum) | Indicates the client type for which the investment product is suitable through the distribution channel \&quot;discretionary/portfolio management with suitability assessment\&quot;. |  [optional]



## Enum: ExecutionOnlyEnum

Name | Value
---- | -----
RETAIL | &quot;retail&quot;
PROFESSIONAL | &quot;professional&quot;
BOTH | &quot;both&quot;
NONE | &quot;none&quot;



## Enum: ExecutionAppropriatenessEnum

Name | Value
---- | -----
RETAIL | &quot;retail&quot;
PROFESSIONAL | &quot;professional&quot;
BOTH | &quot;both&quot;
NONE | &quot;none&quot;



## Enum: InvestmentAdviceEnum

Name | Value
---- | -----
RETAIL | &quot;retail&quot;
PROFESSIONAL | &quot;professional&quot;
BOTH | &quot;both&quot;
NONE | &quot;none&quot;



## Enum: PortfolioManagementEnum

Name | Value
---- | -----
RETAIL | &quot;retail&quot;
PROFESSIONAL | &quot;professional&quot;
BOTH | &quot;both&quot;
NONE | &quot;none&quot;


## Implemented Interfaces

* Serializable


