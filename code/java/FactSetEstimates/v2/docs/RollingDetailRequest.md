

# RollingDetailRequest

Request object for requesting rolling detail estimates.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. &lt;p&gt;&lt;b&gt;Performance Note:&lt;/b&gt; Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.&lt;/p&gt; &lt;p&gt;If requesting long historical data, limit the history to &lt;b&gt;10 years per metric per ID&lt;/b&gt;.&lt;/p&gt;  | 
**startDate** | **LocalDate** | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint. To determine the earliest available historical data, refer to the History section in the Online Assistant: &lt;a href&#x3D;\&quot;https://my.apps.factset.com/oa/pages/20121\&quot; target&#x3D;\&quot;_blank\&quot;&gt; Online Assistant – History Section&lt;/a&gt;.  |  [optional]
**endDate** | **LocalDate** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.To determine the earliest available historical data, refer to the History section in the Online Assistant: &lt;a href&#x3D;\&quot;https://my.apps.factset.com/oa/pages/20121\&quot; target&#x3D;\&quot;_blank\&quot;&gt; Online Assistant – History Section&lt;/a&gt;.  |  [optional]
**frequency** | **Frequency** |  |  [optional]
**includeAll** | **Boolean** | Include All filter is used to identify included and excluded broker details from the consensus. By default, the service would return only the brokers included in the consensus.   * &#x60;TRUE&#x60; &#x3D; Returns all the brokers included and excluded in the consensus   * &#x60;FALSE&#x60; &#x3D; Returns only the broker details included in the consensus  |  [optional]
**relativeFiscalStart** | **Integer** | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 1 and periodicity to ANN to ask for relative Fiscal Year 1 (FY1). |  [optional]
**relativeFiscalEnd** | **Integer** | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 2 and periodicity to ANN to ask for relative Fiscal Year 1 (FY2). |  [optional]
**periodicity** | **PeriodicityDetail** |  |  [optional]
**metrics** | **java.util.List&lt;String&gt;** | Requested metrics. Use the &#x60;/metrics&#x60; endpoint for a list of estimate items.For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). | 
**currency** | **String** | Currency code for adjusting the data. Use input as &#x60;ESTIMATE&#x60; for values in Estimate currency. For a list of currency ISO codes, visit &lt;a href&#x3D;\&quot;https://oa.apps.factset.com/pages/1470\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Online Assistant Page |  [optional]
**brokerNames** | **java.util.List&lt;String&gt;** | Filter to return estimate data from specific brokers only. Accepts broker names as input.  The endpoint returns data from all available brokers if this parameter is not specified. For a list of available brokers, visit [Online Assistant Page #14706](https://oa.apps.factset.com/pages/14706). |  [optional]
**updatesOnly** | **Boolean** | Controls whether the response includes only broker updates within the requested period or all reported data points. By default, the service returns data for every date in the requested range at the selected frequency. * &#x60;TRUE&#x60; &#x3D; Returns the first reported estimates within the period plus any subsequent broker updates. * &#x60;FALSE&#x60; &#x3D; Returns data for every date in the requested range at the selected frequency. |  [optional]
**sortByInputDateTime** | **Boolean** | When set to true, results will be sorted by &#x60;inputDateTime&#x60; in descending order (latest records first). This ensures the most recent estimate revisions are returned first in the response.  |  [optional]


## Implemented Interfaces

* Serializable


