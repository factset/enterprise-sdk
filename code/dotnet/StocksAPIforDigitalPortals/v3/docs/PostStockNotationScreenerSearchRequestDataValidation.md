# FactSet.SDK.StocksAPIforDigitalPortals.Model.PostStockNotationScreenerSearchRequestDataValidation
Validation parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OnlyActive** | **bool** | If &#x60;true&#x60;, only active notations will be returned. The term \&quot;active\&quot; reflects the fact that notations and related data are not being deleted immediately after becoming irrelevant (e.g. because the source does not provide a price anymore), but remains in general retrievable for up to 6 months. | [optional] [default to true]
**OnlyNotSuspended** | **bool** | If &#x60;true&#x60;, only notations not suspended from trading will be returned. | [optional] [default to false]
**Prices** | [**PostStockNotationScreenerSearchRequestDataValidationPrices**](PostStockNotationScreenerSearchRequestDataValidationPrices.md) |  | [optional] 
**ValueUnit** | [**PostStockNotationScreenerSearchRequestDataValidationValueUnit**](PostStockNotationScreenerSearchRequestDataValidationValueUnit.md) |  | [optional] 
**Market** | [**PostStockNotationScreenerSearchRequestDataValidationMarket**](PostStockNotationScreenerSearchRequestDataValidationMarket.md) |  | [optional] 
**InstrumentSelectionList** | [**PostStockNotationScreenerSearchRequestDataValidationInstrumentSelectionList**](PostStockNotationScreenerSearchRequestDataValidationInstrumentSelectionList.md) |  | [optional] 
**NotationSelectionList** | [**PostStockNotationScreenerSearchRequestDataValidationNotationSelectionList**](PostStockNotationScreenerSearchRequestDataValidationNotationSelectionList.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

