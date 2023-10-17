

# InlineResponse20062DataTargetMarketAbilityToBearLosses

Describes the potential loss associated with the investment product an investor shall be willing to accept.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**noCapitalLoss** | [**NoCapitalLossEnum**](#NoCapitalLossEnum) | Indicates whether the investment product is suitable for investors not able to bear capital loss. Minor loss e.g. due to costs is possible. |  [optional]
**limitedCapitalLoss** | [**LimitedCapitalLossEnum**](#LimitedCapitalLossEnum) | Indicates whether the investment product is suitable for investors able to bear limited capital loss. |  [optional]
**noCapitalGuarantee** | [**NoCapitalGuaranteeEnum**](#NoCapitalGuaranteeEnum) | Indicates whether the investment product is suitable for investors able to bear total capital loss. |  [optional]
**lossBeyondCapital** | [**LossBeyondCapitalEnum**](#LossBeyondCapitalEnum) | Indicates whether the investment product is suitable for investors able to bear loss beyond the invested capital. |  [optional]
**maximumCapitalLoss** | **BigDecimal** | Maximum loss of the invested capital assumed the investment product is held until maturity. |  [optional]



## Enum: NoCapitalLossEnum

Name | Value
---- | -----
YES | &quot;yes&quot;
NO | &quot;no&quot;
NEUTRAL | &quot;neutral&quot;
FEEDBACK | &quot;feedback&quot;



## Enum: LimitedCapitalLossEnum

Name | Value
---- | -----
YES | &quot;yes&quot;
NO | &quot;no&quot;
NEUTRAL | &quot;neutral&quot;
FEEDBACK | &quot;feedback&quot;



## Enum: NoCapitalGuaranteeEnum

Name | Value
---- | -----
YES | &quot;yes&quot;
NO | &quot;no&quot;
NEUTRAL | &quot;neutral&quot;
FEEDBACK | &quot;feedback&quot;



## Enum: LossBeyondCapitalEnum

Name | Value
---- | -----
YES | &quot;yes&quot;
NO | &quot;no&quot;
NEUTRAL | &quot;neutral&quot;
FEEDBACK | &quot;feedback&quot;


## Implemented Interfaces

* Serializable


