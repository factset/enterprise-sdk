# ResponseFormat

Controls the shape of the response payload. The top-level `metadata` object (request-level aggregate counts) is always returned regardless of the value selected here.  - `DETAILS_ONLY` — Each entity in `data` includes the full `tradeNames`   array. The per-entity `summary` object is omitted. Use when you need   the raw product mappings only.  - `SUMMARY_ONLY` — Each entity in `data` includes only the per-entity   `summary` object (counts scoped to that entity). The `tradeNames`   array is omitted. Use for a lightweight overview when the individual   product rows are not needed.  - `DETAILS_WITH_SUMMARY` *(default)* — Each entity in `data` includes   both the `summary` object and the `tradeNames` array. Use when you   want both an at-a-glance roll-up and the underlying product   mappings in a single call. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** | Controls the shape of the response payload. The top-level &#x60;metadata&#x60; object (request-level aggregate counts) is always returned regardless of the value selected here.  - &#x60;DETAILS_ONLY&#x60; — Each entity in &#x60;data&#x60; includes the full &#x60;tradeNames&#x60;   array. The per-entity &#x60;summary&#x60; object is omitted. Use when you need   the raw product mappings only.  - &#x60;SUMMARY_ONLY&#x60; — Each entity in &#x60;data&#x60; includes only the per-entity   &#x60;summary&#x60; object (counts scoped to that entity). The &#x60;tradeNames&#x60;   array is omitted. Use for a lightweight overview when the individual   product rows are not needed.  - &#x60;DETAILS_WITH_SUMMARY&#x60; *(default)* — Each entity in &#x60;data&#x60; includes   both the &#x60;summary&#x60; object and the &#x60;tradeNames&#x60; array. Use when you   want both an at-a-glance roll-up and the underlying product   mappings in a single call.  | defaults to "DETAILS_WITH_SUMMARY",  must be one of ["DETAILS_ONLY", "SUMMARY_ONLY", "DETAILS_WITH_SUMMARY", ]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


