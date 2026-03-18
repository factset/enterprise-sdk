

# ConsensusRatingsRequest

Request object for requesting consensus ratings estimates.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. &lt;p&gt;&lt;b&gt;Performance Note:&lt;/b&gt; Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.&lt;/p&gt; &lt;p&gt;If requesting long historical data, limit the history to &lt;b&gt;10 years per metric per ID&lt;/b&gt;.&lt;/p&gt;  | 
**startDate** | **LocalDate** | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint. To determine the earliest available historical data, refer to the History section in the Online Assistant: &lt;a href&#x3D;\&quot;https://my.apps.factset.com/oa/pages/20121\&quot; target&#x3D;\&quot;_blank\&quot;&gt; Online Assistant – History Section&lt;/a&gt;.  |  [optional]
**endDate** | **LocalDate** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.To determine the earliest available historical data, refer to the History section in the Online Assistant: &lt;a href&#x3D;\&quot;https://my.apps.factset.com/oa/pages/20121\&quot; target&#x3D;\&quot;_blank\&quot;&gt; Online Assistant – History Section&lt;/a&gt;.  |  [optional]
**frequency** | **Frequency** |  |  [optional]


## Implemented Interfaces

* Serializable


