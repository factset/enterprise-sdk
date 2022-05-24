

# InlineResponse20062DataTargetMarketClientObjectivesAndNeeds

Characterizes the investment product regarding its ability to serve specific investment objectives.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**returnProfile** | [**InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile**](InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile.md) |  |  [optional]
**maturityDate** | **LocalDate** | Maturity date of the investment product. |  [optional]
**mayBeTerminatedEarly** | [**MayBeTerminatedEarlyEnum**](#MayBeTerminatedEarlyEnum) | Indicates whether the investment product is unsuitable for investors not accepting financial products with potential termination prior to maturity. (That means, a \&quot;yes\&quot; value indicates that the product may not last until maturity and thus conflicts with an investor profile rejecting premature redemption.) The termination could be initiated by the issuer (callable), by the investor (puttable) or automatically due to an event, e.g. barrier breach (auto-callable). |  [optional]
**specificInvestmentNeed** | [**java.util.List&lt;SpecificInvestmentNeedEnum&gt;**](#java.util.List&lt;SpecificInvestmentNeedEnum&gt;) | Indicates whether the investment product is suitable for investors with a specific investment need. This attribute provides either a general statement (yes or no) or a set of needs (green investment, ethical investment, islamic banking, Environmental, social and governance (ESG), other) covered by the product. |  [optional]



## Enum: MayBeTerminatedEarlyEnum

Name | Value
---- | -----
YES | &quot;yes&quot;
NO | &quot;no&quot;
NEUTRAL | &quot;neutral&quot;
FEEDBACK | &quot;feedback&quot;



## Enum: java.util.List&lt;SpecificInvestmentNeedEnum&gt;

Name | Value
---- | -----
YES | &quot;yes&quot;
NO | &quot;no&quot;
GREEN | &quot;green&quot;
ETHICAL | &quot;ethical&quot;
ISLAMIC | &quot;islamic&quot;
ESG | &quot;esg&quot;
OTHER | &quot;other&quot;


## Implemented Interfaces

* Serializable


