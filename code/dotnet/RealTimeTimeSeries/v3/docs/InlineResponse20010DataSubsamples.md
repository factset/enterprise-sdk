# FactSet.SDK.RealTimeTimeSeries.Model.InlineResponse20010DataSubsamples

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Time** | **string** | Date and time of the start of the subsample. | [optional] 
**First** | **decimal?** | First price of the subsample. | [optional] 
**Last** | **decimal?** | Last price of the subsample. | [optional] 
**Low** | **decimal?** | Lowest price of the subsample. | [optional] 
**High** | **decimal?** | Highest price of the subsample. | [optional] 
**TradingVolume** | **decimal?** | Accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty. | [optional] 
**TradingValue** | **decimal?** | Accumulated monetary equivalent (cash value) of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty. See attribute &#x60;currency&#x60; in endpoint &#x60;/prices/get&#x60; for its unit. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

