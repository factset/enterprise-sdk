# InlineResponse2002DataSensitivities

Price sensitivities of the debt instrument with respect to the prevailing market interest rate.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**base_point_value** | **float** | Base point value, which is the change of the debt instrument&#39;s price for a one base point change (nominally, not relatively) of the prevailing market interest rate. One base point is equivalent to 0,01 percent (1/100 of a percent). See attribute &#x60;price/valueUnit&#x60; for its value unit. | [optional] 
**modified_duration** | **float** | Modified duration, which is the percentage change of the debt instrument&#39;s price for a one percent change (nominally, not relatively) of the prevailing market interest rate. | [optional] 
**elasticity** | **float** | Yield elasticity, which is the ratio of the percentage change of the debt instrument&#39;s price for a one percent change (relatively, not nominally) of the prevailing market interest rate. | [optional] 
**convexity** | **float** | Convexity, which is a measure for the change of the modified duration as the prevailing market interest rate changes. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


