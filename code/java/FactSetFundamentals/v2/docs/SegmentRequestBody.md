

# SegmentRequestBody

Segments request body elements

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  &lt;p&gt;ids limit &#x3D;  1000 per non-batch request / 30000 per batch request&lt;/p&gt;  | 
**periodicity** | **SegmentsPeriodicity** |  |  [optional]
**fiscalPeriod** | [**FiscalPeriod**](FiscalPeriod.md) |  |  [optional]
**metrics** | **String** | Metrics are the data items available for business and geographic segments, where   * **SALES**  &#x3D; Sales/Revenue - Total revenues from the business line/geographic region,   * **OPINC** &#x3D; Operating Income/Loss - Operating income generated from the business line/geographic region,   * **ASSETS** &#x3D; Total Assets - Total assets from the business line/geographic region,   * **DEP** &#x3D; Depreciation Exp - Depreciation expense resulting from the business line/geographic segment,   * **CAPEX** &#x3D; Capital Expenditures - Capital expenditures resulting from the business line/geographic region  | 
**segmentType** | **SegmentType** |  |  [optional]
**batch** | **Batch** |  |  [optional]


## Implemented Interfaces

* Serializable


