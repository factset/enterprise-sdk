# FactSet.SDK.StocksAPIforDigitalPortals.Model.PostCompanyKeyItemsFiscalYearListByInstrumentRequestDataFiscalYears
Response will include data items from the fiscal year specified as start (inclusive) up to the fiscal year specified as end (inclusive). If either is omitted the response will include data items from the earliest or up to the most recent fiscal year available respectively. Alternatively, if both are specified start must be less than end. Either must be at most ten years in the past. Note that earliest data availability varies for each stock.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Start** | **decimal** | Only include data items for a fiscal year greater than or equal to the one specified. Must be greater than or equal to ten years in the past. | [optional] 
**End** | **decimal** | Only include data items for a fiscal year earlier than or equal to the one specified. Must be less than or equal to the current year. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

