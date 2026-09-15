# factsetpowerutilities.ForwardPriceRecordAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | [**CategoryForward**](CategoryForward.md) |  | 
**priceDate** | **Date** | Trade or settlement date (YYYY-MM-DD). | [optional] 
**deliveryYear** | **Number** | Delivery year, derived from the delivery start date. | [optional] 
**deliveryMonth** | **Number** | Delivery month (1–12), derived from the delivery start date. | [optional] 
**interconnection** | **String** | Higher-level US power market region the location belongs to. | [optional] 
**periodType** | **String** | Term type of the forward delivery period. | [optional] 
**priceType** | **String** | Forward price type. | [optional] 
**avgForwardPriceMwh** | **Number** | Forward price in $/MWh, reported as a rolling 3-day average. | [optional] 



## Enum: PriceTypeEnum


* `OnPeak` (value: `"OnPeak"`)

* `OffPeak` (value: `"OffPeak"`)

* `AroundTheClock` (value: `"AroundTheClock"`)




