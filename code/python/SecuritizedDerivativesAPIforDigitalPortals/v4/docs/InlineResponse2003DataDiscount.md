# InlineResponse2003DataDiscount

Discount based on the ask price. It represents the difference between the ask price of the securitized derivative and the underlying level, adjusted for the cover ratio and the currency cross rate. This key figure is calculated only for discount certificates. This key figure is not calculated for securitized derivatives with multiple underlyings. For the value unit, see attribute `underlyings.valueUnit`.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**absolute** | **float, none_type** | Discount in absolute terms. | [optional] 
**relative** | **float, none_type** | Discount relative to the underlying level. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


