# FactSet.SDK.FactSetEstimates.Model.SegmentsRequest
Request object for requesting segments estimates.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 50 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. *  | 
**StartDate** | **DateTime** | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint. To determine the earliest available historical data, refer to the History section in the Online Assistant: &lt;a href&#x3D;\&quot;https://my.apps.factset.com/oa/pages/20121\&quot; target&#x3D;\&quot;_blank\&quot;&gt; Online Assistant – History Section&lt;/a&gt;.  | [optional] 
**EndDate** | **DateTime** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.To determine the earliest available historical data, refer to the History section in the Online Assistant: &lt;a href&#x3D;\&quot;https://my.apps.factset.com/oa/pages/20121\&quot; target&#x3D;\&quot;_blank\&quot;&gt; Online Assistant – History Section&lt;/a&gt;.  | [optional] 
**RelativeFiscalStart** | **int** | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 1 and periodicity to ANN to ask for relative Fiscal Year 1 (FY1). | [optional] [default to 1]
**RelativeFiscalEnd** | **int** | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 2 and periodicity to ANN to ask for relative Fiscal Year 1 (FY2). | [optional] [default to 1]
**Periodicity** | [**Periodicity**](Periodicity.md) |  | [optional] 
**Frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**SegmentType** | [**SegmentType**](SegmentType.md) |  | [optional] 
**Metrics** | **List&lt;string&gt;** | Requested metrics. Use the &#x60;/metrics&#x60; endpoint for a list of estimate items.For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). | 
**Currency** | **string** | Currency code for adjusting the data. Use input as &#x60;ESTIMATE&#x60; for values in Estimate currency. For a list of currency ISO codes, visit &lt;a href&#x3D;\&quot;https://oa.apps.factset.com/pages/1470\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Online Assistant Page | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

