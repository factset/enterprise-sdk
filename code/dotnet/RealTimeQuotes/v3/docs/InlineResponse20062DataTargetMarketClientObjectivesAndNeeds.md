# FactSet.SDK.RealTimeQuotes.Model.InlineResponse20062DataTargetMarketClientObjectivesAndNeeds
Characterizes the investment product regarding its ability to serve specific investment objectives.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReturnProfile** | [**InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile**](InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile.md) |  | [optional] 
**MaturityDate** | **DateTime?** | Maturity date of the investment product. | [optional] 
**MayBeTerminatedEarly** | **string** | Indicates whether the investment product is unsuitable for investors not accepting financial products with potential termination prior to maturity. (That means, a \&quot;yes\&quot; value indicates that the product may not last until maturity and thus conflicts with an investor profile rejecting premature redemption.) The termination could be initiated by the issuer (callable), by the investor (puttable) or automatically due to an event, e.g. barrier breach (auto-callable). | [optional] 
**SpecificInvestmentNeed** | **List&lt;string&gt;** | Indicates whether the investment product is suitable for investors with a specific investment need. This attribute provides either a general statement (yes or no) or a set of needs (green investment, ethical investment, islamic banking, Environmental, social and governance (ESG), other) covered by the product. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

