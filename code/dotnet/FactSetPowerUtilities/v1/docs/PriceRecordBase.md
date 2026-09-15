# FactSet.SDK.FactSetPowerUtilities.Model.PriceRecordBase
Fields common to every power market price record. Record shape matches the requested `category` — see `PowerPriceRecord`, `SparkSpreadPriceRecord`, `CapacityPriceRecord`, and `ForwardPriceRecord` for the category-specific fields layered on top via `allOf`. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The identifier as submitted in the request. Duplicates &#x60;locationId&#x60;. | 
**LocationId** | **string** | Location identifier, as submitted in the request. | 
**LocationName** | **string** | Full location name. | [optional] 
**IsoCode** | **string** | ISO/TSO market code. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

