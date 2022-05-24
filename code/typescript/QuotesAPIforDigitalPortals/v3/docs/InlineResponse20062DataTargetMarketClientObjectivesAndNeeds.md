# quotesapifordigitalportals.InlineResponse20062DataTargetMarketClientObjectivesAndNeeds

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**returnProfile** | [**InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile**](InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile.md) |  | [optional] 
**maturityDate** | **Date** | Maturity date of the investment product. | [optional] 
**mayBeTerminatedEarly** | **String** | Indicates whether the investment product is unsuitable for investors not accepting financial products with potential termination prior to maturity. (That means, a \&quot;yes\&quot; value indicates that the product may not last until maturity and thus conflicts with an investor profile rejecting premature redemption.) The termination could be initiated by the issuer (callable), by the investor (puttable) or automatically due to an event, e.g. barrier breach (auto-callable). | [optional] 
**specificInvestmentNeed** | **[String]** | Indicates whether the investment product is suitable for investors with a specific investment need. This attribute provides either a general statement (yes or no) or a set of needs (green investment, ethical investment, islamic banking, Environmental, social and governance (ESG), other) covered by the product. | [optional] 



## Enum: MayBeTerminatedEarlyEnum


* `yes` (value: `"yes"`)

* `no` (value: `"no"`)

* `neutral` (value: `"neutral"`)

* `feedback` (value: `"feedback"`)





## Enum: [SpecificInvestmentNeedEnum]


* `yes` (value: `"yes"`)

* `no` (value: `"no"`)

* `green` (value: `"green"`)

* `ethical` (value: `"ethical"`)

* `islamic` (value: `"islamic"`)

* `esg` (value: `"esg"`)

* `other` (value: `"other"`)




