# FactSet.SDK.FactSetFundamentals.Model.SegmentRequestBody
Segments request body elements

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  &lt;p&gt;ids limit &#x3D;  1000 per non-batch request / 30000 per batch request&lt;/p&gt;  | 
**Periodicity** | [**SegmentsPeriodicity**](SegmentsPeriodicity.md) |  | [optional] 
**FiscalPeriod** | [**FiscalPeriod**](FiscalPeriod.md) |  | [optional] 
**Metrics** | **string** | Metrics are the data items available for business and geographic segments, where   * **SALES**  &#x3D; Sales/Revenue - Total revenues from the business line/geographic region,   * **OPINC** &#x3D; Operating Income/Loss - Operating income generated from the business line/geographic region,   * **ASSETS** &#x3D; Total Assets - Total assets from the business line/geographic region,   * **DEP** &#x3D; Depreciation Exp - Depreciation expense resulting from the business line/geographic segment,   * **CAPEX** &#x3D; Capital Expenditures - Capital expenditures resulting from the business line/geographic region  | 
**SegmentType** | [**SegmentType**](SegmentType.md) |  | [optional] 
**Batch** | [**Batch**](Batch.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

