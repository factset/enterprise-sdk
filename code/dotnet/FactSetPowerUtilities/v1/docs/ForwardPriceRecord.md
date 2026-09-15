# FactSet.SDK.FactSetPowerUtilities.Model.ForwardPriceRecord
Forward power price curve record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The identifier as submitted in the request. Duplicates &#x60;locationId&#x60;. | 
**LocationId** | **string** | Location identifier, as submitted in the request. | 
**LocationName** | **string** | Full location name. | [optional] 
**IsoCode** | **string** | ISO/TSO market code. | [optional] 
**Category** | **CategoryForward** |  | 
**PriceDate** | **DateTime?** | Trade or settlement date (YYYY-MM-DD). | [optional] 
**DeliveryYear** | **int?** | Delivery year, derived from the delivery start date. | [optional] 
**DeliveryMonth** | **int?** | Delivery month (1–12), derived from the delivery start date. | [optional] 
**Interconnection** | **string** | Higher-level US power market region the location belongs to. | [optional] 
**PeriodType** | **string** | Term type of the forward delivery period. | [optional] 
**PriceType** | **string** | Forward price type. | [optional] 
**AvgForwardPriceMwh** | **double?** | Forward price in $/MWh, reported as a rolling 3-day average. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

