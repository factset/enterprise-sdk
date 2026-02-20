# factsetestimates.DetailRatingsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. &lt;p&gt;&lt;b&gt;Performance Note:&lt;/b&gt; Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.&lt;/p&gt; &lt;p&gt;If requesting long historical data, limit the history to &lt;b&gt;10 years per metric per ID&lt;/b&gt;.&lt;/p&gt;  | 
**startDate** | **Date** | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint.  | [optional] 
**endDate** | **Date** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**includeAll** | **Boolean** | Include All filter is used to identify included and excluded broker details from the consensus   By default the service would return only the brokers included in the consensus-   * **TRUE** &#x3D; Returns all the brokers included and excluded in the consensus   * **FALSE** &#x3D; Returns only the broker details included in the consensus  | [optional] [default to false]
**brokerNames** | **[String]** | Filter to return estimate data from specific brokers only. Accepts broker names as input.  The endpoint returns data from all available brokers if this parameter is not specified. For a list of available brokers, visit [Online Assistant Page #14706](https://oa.apps.factset.com/pages/14706). | [optional] 
**updatesOnly** | **Boolean** | When set to &#39;true&#39;, the endpoint returns the first reported estimates during this period and any subsequent changes reported by the brokers. When set to &#39;false&#39;, data is returned for all dates in the requested date range based on the selected frequency. If unspecified, it is treated as &#39;false&#39; by default. | [optional] [default to false]


