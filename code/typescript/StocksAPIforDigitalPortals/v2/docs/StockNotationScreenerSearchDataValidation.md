# stocksapifordigitalportals.StockNotationScreenerSearchDataValidation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**onlyActive** | **Boolean** | If &#x60;true&#x60;, only active notations will be returned. The term \&quot;active\&quot; reflects the fact that notations and related data are not being deleted immediately after becoming irrelevant (e.g. because the source does not provide a price anymore), but remains in general retrievable for up to 6 months. | [optional] [default to true]
**onlyNotSuspended** | **Boolean** | If &#x60;true&#x60;, only notations not suspended from trading will be returned. | [optional] [default to false]
**prices** | [**StockNotationScreenerSearchDataValidationPrices**](StockNotationScreenerSearchDataValidationPrices.md) |  | [optional] 
**valueUnit** | [**StockNotationScreenerSearchDataValidationValueUnit**](StockNotationScreenerSearchDataValidationValueUnit.md) |  | [optional] 
**market** | [**StockNotationScreenerSearchDataValidationMarket**](StockNotationScreenerSearchDataValidationMarket.md) |  | [optional] 
**instrumentSelectionList** | [**StockNotationScreenerSearchDataValidationInstrumentSelectionList**](StockNotationScreenerSearchDataValidationInstrumentSelectionList.md) |  | [optional] 
**notationSelectionList** | [**StockNotationScreenerSearchDataValidationNotationSelectionList**](StockNotationScreenerSearchDataValidationNotationSelectionList.md) |  | [optional] 


