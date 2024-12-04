# FactSet.SDK.RealTimeTimeSeries.Model.PostPricesTimeSeriesIntradayListDataPricesItems
A list of objects. For semantical context see the description of the parent array.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Time** | **DateTime?** | Date and time. | [optional] 
**TickId** | **decimal?** | Intraday tick identifier created by a feed handler, unique within a trading day. | [optional] 
**Price** | **decimal?** | Price value. See attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for its unit, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258). | [optional] 
**QuoteCondition** | **string** | Quote condition. Possible values depend on the values delivered by the supplier of the price information. | [optional] 
**TradingVolume** | **decimal?** | Number of units (e.g. shares) traded, offered (price type ask), solicited (price type bid), or empty (price type yield). | [optional] 
**TradingValue** | **decimal?** | Monetary equivalent (cash value) of the trade. See attribute &#x60;currency&#x60; in endpoint &#x60;/prices/get&#x60; for its unit. Empty for price type yield. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

