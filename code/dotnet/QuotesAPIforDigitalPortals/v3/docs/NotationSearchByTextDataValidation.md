# FactSet.SDK.QuotesAPIforDigitalPortals.Model.NotationSearchByTextDataValidation
Validation parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OnlyActive** | **bool** | If &#x60;true&#x60;, only active notations will be returned. The term \&quot;active\&quot; reflects the fact that notations and related data is not being deleted immediately after becoming irrelevant (e.g. because the source does not provide a price anymore), but remains in general retrievable for up to 6 months. | [optional] [default to true]
**Prices** | [**NotationSearchByTextDataValidationPrices**](NotationSearchByTextDataValidationPrices.md) |  | [optional] 
**ValueUnit** | [**NotationSearchByTextDataValidationValueUnit**](NotationSearchByTextDataValidationValueUnit.md) |  | [optional] 
**Market** | [**NotationSearchByTextDataValidationMarket**](NotationSearchByTextDataValidationMarket.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

