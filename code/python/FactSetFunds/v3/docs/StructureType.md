# StructureType

Returns the type of data items requested, such as classification details, similar funds, segment (benchmark) details, or structure information (funds structure and advisor details). * **CLASSIFICATION**: Categorizes funds using a rules-based system that is derived from seven core classifications. This system evaluates the asset class, economic development level, and geographical region as described in each fund's prospectus and marketing materials. Fund exposure details are presented on successively granular levels- category, then focus, and then niche * **SIMILAR_FUNDS**: Returns the similar fund share classes * **SEGMENTS**: Returns the Fund's Benchmark and Segment Benchmark information. * **FUND_STRUCTURE**: Returns fund structure and advisor information 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** | Returns the type of data items requested, such as classification details, similar funds, segment (benchmark) details, or structure information (funds structure and advisor details). * **CLASSIFICATION**: Categorizes funds using a rules-based system that is derived from seven core classifications. This system evaluates the asset class, economic development level, and geographical region as described in each fund&#39;s prospectus and marketing materials. Fund exposure details are presented on successively granular levels- category, then focus, and then niche * **SIMILAR_FUNDS**: Returns the similar fund share classes * **SEGMENTS**: Returns the Fund&#39;s Benchmark and Segment Benchmark information. * **FUND_STRUCTURE**: Returns fund structure and advisor information  | defaults to "CLASSIFICATION",  must be one of ["CLASSIFICATION", "SIMILAR_FUNDS", "SEGMENTS", "FUND_STRUCTURE", ]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


