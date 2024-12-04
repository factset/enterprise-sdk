# FactSet.SDK.RealTimeTimeSeries.Model.InlineResponse2006DataSubsample
Single summary record. For the attributes first, last, low, high, see attribute `valueUnit` in endpoint `/prices/get` for their unit, except for price type yield, where the `valueUnit` is always `percent` (id=258).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Date** | **DateTime?** | Date of the start of the subsample. | [optional] 
**First** | **decimal?** | First price of the subsample. | [optional] 
**Last** | **decimal?** | Last price of the subsample. | [optional] 
**Low** | **decimal?** | Lowest price of the subsample. | [optional] 
**High** | **decimal?** | Highest price of the subsample. | [optional] 
**TradingVolume** | **decimal?** | Accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty. | [optional] 
**TradingValue** | **decimal?** | Accumulated monetary equivalent (cash value) of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty. See attribute &#x60;currency&#x60; in endpoint &#x60;/prices/get&#x60; for its unit. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

