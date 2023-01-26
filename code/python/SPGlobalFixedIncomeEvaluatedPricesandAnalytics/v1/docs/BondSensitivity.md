# BondSensitivity


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**fsym_id** | **str, none_type** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**date** | **date, none_type** | The date on which the price is calculated. | [optional] 
**bid_convexity** | **float, none_type** | Measures the change of Duration with the change in yield,based on the bid price .Available only  for &#x60;corporate bonds&#x60; and &#x60;municipal bonds&#x60;. | [optional] 
**mid_convexity** | **float, none_type** | Measures the change of duration with the change in yield,based on the mid price .Available only  for &#x60;corporate bonds&#x60; | [optional] 
**ask_convexity** | **float, none_type** | Measures the change of duration with the change in yield,based on the ask price .Available only  for &#x60;corporate bonds&#x60; | [optional] 
**bid_effective_convexity** | **float, none_type** | The effective convexity based on the bid price .Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**mid_effective_convexity** | **float, none_type** | The effective convexity based on the mid price .Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**ask_effective_convexity** | **float, none_type** |  The effective convexity based on the ask price. Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**bid_effective_duration** | **float, none_type** | A duration calculation for bonds with embedded options,based on the bid price. Effective duration takes into account that expected cash flows fluctuate as interest rates change. Available only  for &#x60;corporate bonds&#x60; | [optional] 
**mid_effective_duration** | **float, none_type** | A duration calculation for bonds with embedded options,based on the mid price. Effective duration takes into account that expected cash flows fluctuate as interest rates change .Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**ask_effective_duration** | **float, none_type** | A duration calculation for bonds with embedded options,based on the ask price. Effective duration takes into account that expected cash flows fluctuate as interest rates change. Available only  for &#x60;corporate bonds&#x60; | [optional] 
**bid_macaulay_duration** | **float, none_type** | The weighted average maturity of bond, where the weights are relative discounted cash flows in each period,based on the bid price .Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**mid_macaulay_duration** | **float, none_type** | The weighted average maturity of bond, where the weights are relative discounted cash flows in each period,based on the mid price .Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**ask_macaulay_duration** | **float, none_type** | The weighted average maturity of bond, where the weights are relative discounted cash flows in each period,based on the ask price .Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**bid_modified_duration** | **float, none_type** | The first derivative of the bond price, with respect to yield,based on the bid price. | [optional] 
**mid_modified_duration** | **float, none_type** | The first derivative of the bond price, with respect to yield,based on the mid price. Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**ask_modified_duration** | **float, none_type** | The first derivative of the bond price, with respect to yield,based on the ask price. Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


