

# InlineResponse20062DataTargetMarketRecommendedHoldingPeriod

States the recommended holding period of the product.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**holdingPeriod** | [**java.util.List&lt;HoldingPeriodEnum&gt;**](#java.util.List&lt;HoldingPeriodEnum&gt;) | Indicates the recommended holding period (RHP) of the investment product whereby more than one RHP per product may exist. |  [optional]
**holdingPeriodYears** | **BigDecimal** | Indicates the length of the recommended holding period (RHP) of the investment product in years, not available if the attribute &#x60;holdingPeriod&#x60; is set. |  [optional]



## Enum: java.util.List&lt;HoldingPeriodEnum&gt;

Name | Value
---- | -----
VERYSHORT | &quot;veryShort&quot;
SHORT | &quot;short&quot;
MEDIUM | &quot;medium&quot;
LONG | &quot;long&quot;
NEUTRAL | &quot;neutral&quot;


## Implemented Interfaces

* Serializable


