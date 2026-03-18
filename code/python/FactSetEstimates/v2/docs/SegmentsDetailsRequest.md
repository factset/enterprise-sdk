# SegmentsDetailsRequest

Request object for requesting segments details estimates.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[str]** |  | 
**metrics** | [**SegmentsMetrics**](SegmentsMetrics.md) |  | 
**segment_ids** | [**SegmentId**](SegmentId.md) |  | 
**start_date** | **date** | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint. To determine the earliest available historical data, refer to the History section in the Online Assistant: &lt;a href&#x3D;\&quot;https://my.apps.factset.com/oa/pages/20121\&quot; target&#x3D;\&quot;_blank\&quot;&gt; Online Assistant – History Section&lt;/a&gt;.  | [optional] 
**end_date** | **date** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.To determine the earliest available historical data, refer to the History section in the Online Assistant: &lt;a href&#x3D;\&quot;https://my.apps.factset.com/oa/pages/20121\&quot; target&#x3D;\&quot;_blank\&quot;&gt; Online Assistant – History Section&lt;/a&gt;.  | [optional] 
**relative_fiscal_start** | [**RelativeFiscalStart**](RelativeFiscalStart.md) |  | [optional] 
**relative_fiscal_end** | [**RelativeFiscalEnd**](RelativeFiscalEnd.md) |  | [optional] 
**periodicity** | [**PeriodicityDetail**](PeriodicityDetail.md) |  | [optional] 
**frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**segment_type** | [**SegmentType**](SegmentType.md) |  | [optional] 
**currency** | **str** | Currency code for adjusting the data. Use input as &#x60;ESTIMATE&#x60; for values in Estimate currency. For a list of currency ISO codes, visit &lt;a href&#x3D;\&quot;https://oa.apps.factset.com/pages/1470\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Online Assistant Page | [optional] 
**broker_names** | [**BrokerNames**](BrokerNames.md) |  | [optional] 
**updates_only** | **bool** | Controls whether the response includes only broker updates within the requested period or all reported data points. By default, the service returns data for every date in the requested range at the selected frequency. * &#x60;TRUE&#x60; &#x3D; Returns the first reported estimates within the period plus any subsequent broker updates. * &#x60;FALSE&#x60; &#x3D; Returns data for every date in the requested range at the selected frequency.  | [optional]  if omitted the server will use the default value of False
**include_all** | **bool** | Include All filter is used to identify included and excluded broker details from the consensus. By default, the service would return only the brokers included in the consensus.   * &#x60;TRUE&#x60; &#x3D; Returns all the brokers included and excluded in the consensus   * &#x60;FALSE&#x60; &#x3D; Returns only the broker details included in the consensus  | [optional]  if omitted the server will use the default value of False
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


