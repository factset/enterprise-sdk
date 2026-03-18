# factsetestimates.SurpriseRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. &lt;p&gt;&lt;b&gt;Performance Note:&lt;/b&gt; Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.&lt;/p&gt; &lt;p&gt;If requesting long historical data, limit the history to &lt;b&gt;10 years per metric per ID&lt;/b&gt;.&lt;/p&gt;  | 
**metrics** | **[String]** | Requested metrics. Use the &#x60;/metrics&#x60; endpoint for a list of estimate items.For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). | 
**startDate** | **Date** | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint. To determine the earliest available historical data, refer to the History section in the Online Assistant: &lt;a href&#x3D;\&quot;https://my.apps.factset.com/oa/pages/20121\&quot; target&#x3D;\&quot;_blank\&quot;&gt; Online Assistant – History Section&lt;/a&gt;.  | [optional] 
**endDate** | **Date** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.To determine the earliest available historical data, refer to the History section in the Online Assistant: &lt;a href&#x3D;\&quot;https://my.apps.factset.com/oa/pages/20121\&quot; target&#x3D;\&quot;_blank\&quot;&gt; Online Assistant – History Section&lt;/a&gt;.  | [optional] 
**frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**periodicity** | [**PeriodicitySurprise**](PeriodicitySurprise.md) |  | [optional] 
**currency** | **String** | Currency code for adjusting the data. Use input as &#x60;ESTIMATE&#x60; for values in Estimate currency. For a list of currency ISO codes, visit &lt;a href&#x3D;\&quot;https://oa.apps.factset.com/pages/1470\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Online Assistant Page | [optional] 
**statistic** | [**Statistic**](Statistic.md) |  | [optional] 


