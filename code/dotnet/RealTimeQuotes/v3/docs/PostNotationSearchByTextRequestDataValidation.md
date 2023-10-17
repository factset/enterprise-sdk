# FactSet.SDK.RealTimeQuotes.Model.PostNotationSearchByTextRequestDataValidation
Validation parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OnlyActive** | **bool** | If &#x60;true&#x60;, only active notations will be returned. The term \&quot;active\&quot; reflects the fact that notations and related data is not being deleted immediately after becoming irrelevant (e.g. because the source does not provide a price anymore), but remains in general retrievable for up to 6 months. | [optional] [default to true]
**Prices** | [**PostNotationSearchByTextRequestDataValidationPrices**](PostNotationSearchByTextRequestDataValidationPrices.md) |  | [optional] 
**ValueUnit** | [**PostNotationSelectionListMembersListRequestDataFilterValueUnit**](PostNotationSelectionListMembersListRequestDataFilterValueUnit.md) |  | [optional] 
**Market** | [**PostNotationSearchByTextRequestDataValidationMarket**](PostNotationSearchByTextRequestDataValidationMarket.md) |  | [optional] 
**InstrumentSelectionList** | [**PostNotationSearchByTextRequestDataValidationInstrumentSelectionList**](PostNotationSearchByTextRequestDataValidationInstrumentSelectionList.md) |  | [optional] 
**NotationSelectionList** | [**PostNotationSearchByTextRequestDataValidationNotationSelectionList**](PostNotationSearchByTextRequestDataValidationNotationSelectionList.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

