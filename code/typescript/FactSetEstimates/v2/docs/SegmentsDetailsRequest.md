# factsetestimates.SegmentsDetailsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** |  | 
**startDate** | **Date** | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint. To determine the earliest available historical data, refer to the History section in the Online Assistant: &lt;a href&#x3D;\&quot;https://my.apps.factset.com/oa/pages/20121\&quot; target&#x3D;\&quot;_blank\&quot;&gt; Online Assistant – History Section&lt;/a&gt;.  | [optional] 
**endDate** | **Date** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.To determine the earliest available historical data, refer to the History section in the Online Assistant: &lt;a href&#x3D;\&quot;https://my.apps.factset.com/oa/pages/20121\&quot; target&#x3D;\&quot;_blank\&quot;&gt; Online Assistant – History Section&lt;/a&gt;.  | [optional] 
**relativeFiscalStart** | **Number** | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 1 and periodicity to ANN to ask for relative Fiscal Year 1 (FY1). | [optional] [default to 1]
**relativeFiscalEnd** | **Number** | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 2 and periodicity to ANN to ask for relative Fiscal Year 1 (FY2). | [optional] [default to 1]
**periodicity** | [**PeriodicityDetail**](PeriodicityDetail.md) |  | [optional] 
**frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**metrics** | **[String]** | Requested metric. Use the &#x60;/metrics&#x60; endpoint for a list of estimate items. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). | 
**segmentType** | [**SegmentType**](SegmentType.md) |  | [optional] 
**segmentIds** | **[String]** | Requested segmentId. Use the &#x60;/segments-metrics&#x60; endpoint for a list of segment_ids. | 
**currency** | **String** | Currency code for adjusting the data. Use input as &#x60;ESTIMATE&#x60; for values in Estimate currency. For a list of currency ISO codes, visit &lt;a href&#x3D;\&quot;https://oa.apps.factset.com/pages/1470\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Online Assistant Page | [optional] 
**brokerNames** | **[String]** | Filter to return estimate data from specific brokers only. Accepts broker names as input.  The endpoint returns data from all available brokers if this parameter is not specified. For a list of available brokers, visit [Online Assistant Page #14706](https://oa.apps.factset.com/pages/14706). | [optional] 
**updatesOnly** | **Boolean** | Controls whether the response includes only broker updates within the requested period or all reported data points. By default, the service returns data for every date in the requested range at the selected frequency. * &#x60;TRUE&#x60; &#x3D; Returns the first reported estimates within the period plus any subsequent broker updates. * &#x60;FALSE&#x60; &#x3D; Returns data for every date in the requested range at the selected frequency. | [optional] [default to false]
**includeAll** | **Boolean** | Include All filter is used to identify included and excluded broker details from the consensus. By default, the service would return only the brokers included in the consensus.   * &#x60;TRUE&#x60; &#x3D; Returns all the brokers included and excluded in the consensus   * &#x60;FALSE&#x60; &#x3D; Returns only the broker details included in the consensus  | [optional] [default to false]
**sortByInputDateTime** | **Boolean** | When set to true, results will be sorted by &#x60;inputDateTime&#x60; in descending order (latest records first). This ensures the most recent estimate revisions are returned first in the response.  | [optional] [default to false]


