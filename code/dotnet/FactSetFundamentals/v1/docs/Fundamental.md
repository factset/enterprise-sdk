# FactSet.SDK.FactSetFundamentals.Model.Fundamental

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Identifier that was used for the request. | [optional] 
**FsymId** | **string** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**Metric** | **string** | The requested &#x60;metric&#x60; input, representing the Fundamental Data Item. For a definition of the item please use the /fundamentals/v#/metrics endpoint. | [optional] 
**Periodicity** | **string** | Periodicity or frequency of the fiscal periods, where ANN &#x3D; Annual Original, ANN_R &#x3D; Annual Latest, QTR &#x3D; Quarterly Original, QTR_R &#x3D; Quarterly Latest, SEMI &#x3D; Semi-Annual, LTM &#x3D; Last Twelve Months, LTMSG &#x3D; Last Twelve Months Global [OA17959](https://my.apps.factset.com/oa/pages/17959) and YTD &#x3D; Year-to-date. | [optional] 
**FiscalPeriod** | **int?** | Fiscal Period indicator. Returns an integer representing the fiscal period for the requested item and periodicity. QUARTERLY CODE: 1-Fist Quarter; 2-Second Quarter; 3-Third Quarter; 4-Fourth Quarter. SEMI-CODE: 1-First Semi-annual Period; 2-Second Semi-annual Period. | [optional] 
**FiscalYear** | **int?** | Fiscal year of the reported period in YYYY format. | [optional] 
**FiscalPeriodLength** | **int?** | Length of fiscal period in days. | [optional] 
**FiscalEndDate** | **DateTime?** | The normalized data the fiscal period ended. | [optional] 
**ReportDate** | **DateTime?** | The date the reported fiscal period actually ended. | [optional] 
**EpsReportDate** | **DateTime?** | The date the EPS was reported for the requested periodicity. In YYYY-MM-DD format. Unavailable data returned as 0001-01-01. | [optional] 
**UpdateType** | **int?** | The update type, where: 1 &#x3D; Preliminary; 2 &#x3D; FAST; 3 &#x3D; Final. For more details, visit [Online Assistant Page #D13094](https://oa.apps.factset.com/pages/D13094). | [optional] 
**UpdateStatus** | **string** | Update Status Flag: P &#x3D; Preliminary - The period is updated from a report that usually contains limited or only key information., F &#x3D; Final - The period is updated from a report where detailed information are available in financial statements including the notes to the line items. | [optional] 
**Currency** | **string** | Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**Value** | **Object** | Value of the data metric requested. Note that the type of value is &#39;object&#39;, and depending on the data metric requested, the value could be an object representation of a string or double.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

