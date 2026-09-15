# FactSet.SDK.FactSetPowerUtilities.Model.PowerPriceRecord
Spot power price record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The identifier as submitted in the request. Duplicates &#x60;locationId&#x60;. | 
**LocationId** | **string** | Location identifier, as submitted in the request. | 
**LocationName** | **string** | Full location name. | [optional] 
**IsoCode** | **string** | ISO/TSO market code. | [optional] 
**Category** | **CategoryPower** |  | 
**PriceDate** | **DateTime?** | Trade or settlement date (YYYY-MM-DD). | [optional] 
**OnPeakPriceMwh** | **double?** | On-peak spot power price in $/MWh. | [optional] 
**OffPeakPriceMwh** | **double?** | Off-peak spot power price in $/MWh. | [optional] 
**AroundTheClockPriceMwh** | **double?** | Around-the-clock (flat) spot power price in $/MWh. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

