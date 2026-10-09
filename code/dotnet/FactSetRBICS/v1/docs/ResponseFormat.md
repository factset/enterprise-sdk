# FactSet.SDK.FactSetRBICS.Model.ResponseFormat
Controls the shape of the response payload. The top-level `metadata` object (request-level aggregate counts) is always returned regardless of the value selected here.  - `DETAILS_ONLY` — Each entity in `data` includes the full `tradeNames`   array. The per-entity `summary` object is omitted. Use when you need   the raw product mappings only.  - `SUMMARY_ONLY` — Each entity in `data` includes only the per-entity   `summary` object (counts scoped to that entity). The `tradeNames`   array is omitted. Use for a lightweight overview when the individual   product rows are not needed.  - `DETAILS_WITH_SUMMARY` *(default)* — Each entity in `data` includes   both the `summary` object and the `tradeNames` array. Use when you   want both an at-a-glance roll-up and the underlying product   mappings in a single call. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

