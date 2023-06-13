# SegmentRequestBody

Segments request body elements

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**IdsBatchMax30000**](IdsBatchMax30000.md) |  | 
**metrics** | **str** | Metrics are the data items available for business and geographic segments, where   * **SALES**  &#x3D; Sales/Revenue - Total revenues from the business line/geographic region,   * **OPINC** &#x3D; Operating Income/Loss - Operating income generated from the business line/geographic region,   * **ASSETS** &#x3D; Total Assets - Total assets from the business line/geographic region,   * **DEP** &#x3D; Depreciation Exp - Depreciation expense resulting from the business line/geographic segment,   * **CAPEX** &#x3D; Capital Expenditures - Capital expenditures resulting from the business line/geographic region  | 
**periodicity** | [**SegmentsPeriodicity**](SegmentsPeriodicity.md) |  | [optional] 
**fiscal_period** | [**FiscalPeriod**](FiscalPeriod.md) |  | [optional] 
**segment_type** | [**SegmentType**](SegmentType.md) |  | [optional] 
**batch** | [**Batch**](Batch.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


