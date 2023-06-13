# InlineResponse20089DataAsks


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str, none_type** | Unique identifier of the order. Possible values depend on the values delivered by the supplier of the price information. | [optional] 
**time** | **str, none_type** | Date and time of the latest change. | [optional] 
**type** | **float, none_type** | Order type. | [optional] 
**price** | **float, none_type** | Price value. The value is 0 if the attribute &#x60;type&#x60; is 1 (market order). See attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for the unit of the price value\&quot;. | [optional] 
**quote_condition** | **str, none_type** | Quote condition. Possible values depend on the values delivered by the supplier of the price information. | [optional] 
**volume** | **float, none_type** | Volume of the order. | [optional] 
**market_maker** | **str, none_type** | Code of the market maker. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


