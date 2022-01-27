# FactSet.SDK.BondsAPIforDigitalPortals.Model.InlineResponse2004Data
Possible values and value ranges of the parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TotalCount** | **decimal** | Number of notations that satisfy the request parameters, hence have been used to retrieve the possible values and value ranges. | [optional] 
**ValueUnit** | [**List&lt;InlineResponse2004DataValueUnit&gt;**](InlineResponse2004DataValueUnit.md) | List of value unit identifiers. See endpoint &#x60;/basic/valueUnit/list&#x60; for possible values. | [optional] 
**Market** | [**List&lt;InlineResponse2004DataMarket&gt;**](InlineResponse2004DataMarket.md) | List of market identifiers. See endpoint &#x60;/basic/market/list&#x60; for possible values. | [optional] 
**Categorization** | [**List&lt;InlineResponse2004DataCategorization&gt;**](InlineResponse2004DataCategorization.md) | Lists of categories of the debt instruments&#39; categorization. Starting with the most coarse level (one), for each level of the category system, the list of categories of the debt instruments, matching the parameters, is returned. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;18&#x60; for possible values. | [optional] 
**LifeCycle** | [**InlineResponse2004DataLifeCycle**](InlineResponse2004DataLifeCycle.md) |  | [optional] 
**Subordinated** | [**List&lt;InlineResponse2004DataLifeCycleMaturityPerpetual&gt;**](InlineResponse2004DataLifeCycleMaturityPerpetual.md) | Indicates whether subordinated and non-subordinated are among the results. In case of default, subordinated debt instruments are redeemed with a lower priority than non-subordinated. | [optional] 
**RatingSystem1** | [**InlineResponse2004DataRatingSystem1**](InlineResponse2004DataRatingSystem1.md) |  | [optional] 
**RatingSystem2** | [**InlineResponse2004DataRatingSystem2**](InlineResponse2004DataRatingSystem2.md) |  | [optional] 
**Issuer** | [**InlineResponse2004DataIssuer**](InlineResponse2004DataIssuer.md) |  | [optional] 
**Issue** | [**InlineResponse2004DataIssue**](InlineResponse2004DataIssue.md) |  | [optional] 
**TradingVolume** | [**InlineResponse2004DataTradingVolume**](InlineResponse2004DataTradingVolume.md) |  | [optional] 
**Compliance** | [**InlineResponse2004DataCompliance**](InlineResponse2004DataCompliance.md) |  | [optional] 
**Coupon** | [**InlineResponse2004DataCoupon**](InlineResponse2004DataCoupon.md) |  | [optional] 
**Yield** | [**InlineResponse2004DataYield**](InlineResponse2004DataYield.md) |  | [optional] 
**MacaulayDuration** | [**InlineResponse2004DataMacaulayDuration**](InlineResponse2004DataMacaulayDuration.md) |  | [optional] 
**Sensitivities** | [**InlineResponse2004DataSensitivities**](InlineResponse2004DataSensitivities.md) |  | [optional] 
**TradedValue** | [**InlineResponse2004DataTradedValue**](InlineResponse2004DataTradedValue.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

