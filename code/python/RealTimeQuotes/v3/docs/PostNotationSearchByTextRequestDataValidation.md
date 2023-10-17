# PostNotationSearchByTextRequestDataValidation

Validation parameters.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**only_active** | **bool** | If &#x60;true&#x60;, only active notations will be returned. The term \&quot;active\&quot; reflects the fact that notations and related data is not being deleted immediately after becoming irrelevant (e.g. because the source does not provide a price anymore), but remains in general retrievable for up to 6 months. | [optional]  if omitted the server will use the default value of True
**prices** | [**PostNotationSearchByTextRequestDataValidationPrices**](PostNotationSearchByTextRequestDataValidationPrices.md) |  | [optional] 
**value_unit** | [**PostNotationSelectionListMembersListRequestDataFilterValueUnit**](PostNotationSelectionListMembersListRequestDataFilterValueUnit.md) |  | [optional] 
**market** | [**PostNotationSearchByTextRequestDataValidationMarket**](PostNotationSearchByTextRequestDataValidationMarket.md) |  | [optional] 
**instrument_selection_list** | [**PostNotationSearchByTextRequestDataValidationInstrumentSelectionList**](PostNotationSearchByTextRequestDataValidationInstrumentSelectionList.md) |  | [optional] 
**notation_selection_list** | [**PostNotationSearchByTextRequestDataValidationNotationSelectionList**](PostNotationSearchByTextRequestDataValidationNotationSelectionList.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


