

# PostNotationSearchByTextRequestDataValidation

Validation parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**onlyActive** | **Boolean** | If &#x60;true&#x60;, only active notations will be returned. The term \&quot;active\&quot; reflects the fact that notations and related data is not being deleted immediately after becoming irrelevant (e.g. because the source does not provide a price anymore), but remains in general retrievable for up to 6 months. |  [optional]
**prices** | [**PostNotationSearchByTextRequestDataValidationPrices**](PostNotationSearchByTextRequestDataValidationPrices.md) |  |  [optional]
**valueUnit** | [**PostNotationSelectionListMembersListRequestDataFilterValueUnit**](PostNotationSelectionListMembersListRequestDataFilterValueUnit.md) |  |  [optional]
**market** | [**PostNotationSearchByTextRequestDataValidationMarket**](PostNotationSearchByTextRequestDataValidationMarket.md) |  |  [optional]
**instrumentSelectionList** | [**PostNotationSearchByTextRequestDataValidationInstrumentSelectionList**](PostNotationSearchByTextRequestDataValidationInstrumentSelectionList.md) |  |  [optional]
**notationSelectionList** | [**PostNotationSearchByTextRequestDataValidationNotationSelectionList**](PostNotationSearchByTextRequestDataValidationNotationSelectionList.md) |  |  [optional]


## Implemented Interfaces

* Serializable


