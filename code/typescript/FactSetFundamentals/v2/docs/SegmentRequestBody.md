# factsetfundamentals.SegmentRequestBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  &lt;p&gt;ids limit &#x3D;  250 per non-batch request (1 metric per ID, for 1 day) and 5000 per batch request (1 metric per ID, for 1 day).&lt;/p&gt;  | 
**periodicity** | [**SegmentsPeriodicity**](SegmentsPeriodicity.md) |  | [optional] 
**fiscalPeriod** | [**FiscalPeriod**](FiscalPeriod.md) |  | [optional] 
**metrics** | **String** | Metrics are the data items available for business and geographic segments, where   * **SALES**  &#x3D; Sales/Revenue - Total revenues from the business line/geographic region,   * **OPINC** &#x3D; Operating Income/Loss - Operating income generated from the business line/geographic region,   * **ASSETS** &#x3D; Total Assets - Total assets from the business line/geographic region,   * **DEP** &#x3D; Depreciation Exp - Depreciation expense resulting from the business line/geographic segment,   * **CAPEX** &#x3D; Capital Expenditures - Capital expenditures resulting from the business line/geographic region  | 
**segmentType** | [**SegmentType**](SegmentType.md) |  | [optional] 
**batch** | [**Batch**](Batch.md) |  | [optional] 


