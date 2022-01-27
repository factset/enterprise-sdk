# InlineResponse2004Data

Possible values and value ranges of the parameters.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total_count** | **float** | Number of notations that satisfy the request parameters, hence have been used to retrieve the possible values and value ranges. | [optional] 
**value_unit** | [**[InlineResponse2004DataValueUnit]**](InlineResponse2004DataValueUnit.md) | List of value unit identifiers. See endpoint &#x60;/basic/valueUnit/list&#x60; for possible values. | [optional] 
**market** | [**[InlineResponse2004DataMarket]**](InlineResponse2004DataMarket.md) | List of market identifiers. See endpoint &#x60;/basic/market/list&#x60; for possible values. | [optional] 
**categorization** | [**[InlineResponse2004DataCategorization]**](InlineResponse2004DataCategorization.md) | Lists of categories of the debt instruments&#39; categorization. Starting with the most coarse level (one), for each level of the category system, the list of categories of the debt instruments, matching the parameters, is returned. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;18&#x60; for possible values. | [optional] 
**life_cycle** | [**InlineResponse2004DataLifeCycle**](InlineResponse2004DataLifeCycle.md) |  | [optional] 
**subordinated** | [**[InlineResponse2004DataLifeCycleMaturityPerpetual]**](InlineResponse2004DataLifeCycleMaturityPerpetual.md) | Indicates whether subordinated and non-subordinated are among the results. In case of default, subordinated debt instruments are redeemed with a lower priority than non-subordinated. | [optional] 
**rating_system1** | [**InlineResponse2004DataRatingSystem1**](InlineResponse2004DataRatingSystem1.md) |  | [optional] 
**rating_system2** | [**InlineResponse2004DataRatingSystem2**](InlineResponse2004DataRatingSystem2.md) |  | [optional] 
**issuer** | [**InlineResponse2004DataIssuer**](InlineResponse2004DataIssuer.md) |  | [optional] 
**issue** | [**InlineResponse2004DataIssue**](InlineResponse2004DataIssue.md) |  | [optional] 
**trading_volume** | [**InlineResponse2004DataTradingVolume**](InlineResponse2004DataTradingVolume.md) |  | [optional] 
**compliance** | [**InlineResponse2004DataCompliance**](InlineResponse2004DataCompliance.md) |  | [optional] 
**coupon** | [**InlineResponse2004DataCoupon**](InlineResponse2004DataCoupon.md) |  | [optional] 
**_yield** | [**InlineResponse2004DataYield**](InlineResponse2004DataYield.md) |  | [optional] 
**macaulay_duration** | [**InlineResponse2004DataMacaulayDuration**](InlineResponse2004DataMacaulayDuration.md) |  | [optional] 
**sensitivities** | [**InlineResponse2004DataSensitivities**](InlineResponse2004DataSensitivities.md) |  | [optional] 
**traded_value** | [**InlineResponse2004DataTradedValue**](InlineResponse2004DataTradedValue.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


