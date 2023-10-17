# InlineResponse20062DataTargetMarketClientObjectivesAndNeeds

Characterizes the investment product regarding its ability to serve specific investment objectives.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**return_profile** | [**InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile**](InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile.md) |  | [optional] 
**maturity_date** | **date, none_type** | Maturity date of the investment product. | [optional] 
**may_be_terminated_early** | **str, none_type** | Indicates whether the investment product is unsuitable for investors not accepting financial products with potential termination prior to maturity. (That means, a \&quot;yes\&quot; value indicates that the product may not last until maturity and thus conflicts with an investor profile rejecting premature redemption.) The termination could be initiated by the issuer (callable), by the investor (puttable) or automatically due to an event, e.g. barrier breach (auto-callable). | [optional] 
**specific_investment_need** | **[str]** | Indicates whether the investment product is suitable for investors with a specific investment need. This attribute provides either a general statement (yes or no) or a set of needs (green investment, ethical investment, islamic banking, Environmental, social and governance (ESG), other) covered by the product. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


