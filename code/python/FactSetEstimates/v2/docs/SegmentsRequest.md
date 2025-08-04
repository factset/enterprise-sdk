# SegmentsRequest

Request object for requesting segments estimates.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**SegmentIds**](SegmentIds.md) |  | 
**metrics** | [**Metrics**](Metrics.md) |  | 
**start_date** | **date** | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint.  | [optional] 
**end_date** | **date** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**relative_fiscal_start** | [**RelativeFiscalStart**](RelativeFiscalStart.md) |  | [optional] 
**relative_fiscal_end** | [**RelativeFiscalEnd**](RelativeFiscalEnd.md) |  | [optional] 
**periodicity** | [**Periodicity**](Periodicity.md) |  | [optional] 
**frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**segment_type** | [**SegmentType**](SegmentType.md) |  | [optional] 
**currency** | **str** | Currency code for adjusting the data. Use input as &#39;ESTIMATE&#39; for values in Estimate currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


