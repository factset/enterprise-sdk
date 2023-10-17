# FactSet.SDK.RealTimeQuotes.Model.PostNotationCrossReferenceListByInstrumentRequestDataFilter
Criteria that filter the items in the response list; only items that match all of the criteria are returned.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Markets** | [**PostNotationCrossReferenceListByInstrumentRequestDataFilterMarkets**](PostNotationCrossReferenceListByInstrumentRequestDataFilterMarkets.md) |  | [optional] 
**ValueUnits** | [**PostNotationCrossReferenceListByInstrumentRequestDataFilterValueUnits**](PostNotationCrossReferenceListByInstrumentRequestDataFilterValueUnits.md) |  | [optional] 
**OnlyActive** | **bool** | If true, only active notations will be returned. The term \&quot;active\&quot; reflects the fact that notations and related data is not being deleted immediately after becoming irrelevant (e.g. because the source does not provide a price anymore), but remains in general retrievable for up to 6 months. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

