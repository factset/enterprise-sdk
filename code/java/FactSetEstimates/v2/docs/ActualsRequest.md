

# ActualsRequest

Request object for requesting actual estimates.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. &lt;p&gt;&lt;b&gt;Performance Note:&lt;/b&gt; Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.&lt;/p&gt; &lt;p&gt;If requesting long historical data, limit the history to &lt;b&gt;10 years per metric per ID&lt;/b&gt;.&lt;/p&gt;  | 
**metrics** | **java.util.List&lt;String&gt;** | Requested metrics. Use the &#x60;/metrics&#x60; endpoint for a list of estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). | 
**relativeFiscalStart** | **Integer** | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. FactSet Estimates Actuals provides data for past periods. Therefore, the input for &#x60;relativeFiscalStart&#x60; must be an integer that is zero or less. For example, set to 0 and periodicity to ANN to ask for the current reported year (FY0). |  [optional]
**relativeFiscalEnd** | **Integer** | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period.Therefore, the input for &#x60;relativeFiscalEnd&#x60; must be an integer that is zero or less. For example, set to -2 and periodicity to ANN to ask for two fiscal years before the latest (FY-2). |  [optional]
**periodicity** | **Periodicity** |  |  [optional]
**currency** | **String** | Currency code for adjusting the data. Use input as &#39;ESTIMATE&#39; for values in Estimate currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). |  [optional]


## Implemented Interfaces

* Serializable


