

# PostStockNotationScreenerSearchRequestDataValidation

Validation parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**onlyActive** | **Boolean** | If &#x60;true&#x60;, only active notations will be returned. The term \&quot;active\&quot; reflects the fact that notations and related data are not being deleted immediately after becoming irrelevant (e.g. because the source does not provide a price anymore), but remains in general retrievable for up to 6 months. |  [optional]
**onlyNotSuspended** | **Boolean** | If &#x60;true&#x60;, only notations not suspended from trading will be returned. |  [optional]
**prices** | [**PostStockNotationScreenerSearchRequestDataValidationPrices**](PostStockNotationScreenerSearchRequestDataValidationPrices.md) |  |  [optional]
**valueUnit** | [**PostStockNotationScreenerSearchRequestDataValidationValueUnit**](PostStockNotationScreenerSearchRequestDataValidationValueUnit.md) |  |  [optional]
**market** | [**PostStockNotationScreenerSearchRequestDataValidationMarket**](PostStockNotationScreenerSearchRequestDataValidationMarket.md) |  |  [optional]
**instrumentSelectionList** | [**PostStockNotationScreenerSearchRequestDataValidationInstrumentSelectionList**](PostStockNotationScreenerSearchRequestDataValidationInstrumentSelectionList.md) |  |  [optional]
**notationSelectionList** | [**PostStockNotationScreenerSearchRequestDataValidationNotationSelectionList**](PostStockNotationScreenerSearchRequestDataValidationNotationSelectionList.md) |  |  [optional]


## Implemented Interfaces

* Serializable


