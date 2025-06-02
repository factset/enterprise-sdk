# factsetestimates.SegmentActualsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. &lt;p&gt;&lt;b&gt;Performance Note:&lt;/b&gt; Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.&lt;/p&gt; &lt;p&gt;If requesting long historical data, limit the history to &lt;b&gt;10 years per metric per ID&lt;/b&gt;.&lt;/p&gt;  | 
**metrics** | **[String]** | Requested metrics for segment actuals. An asterisk denotes metric items included for geographic segments. Note, the number of metrics you   are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).  &lt;h3&gt;Financial Metrics&lt;/h3&gt; |field|description| |---|---| |ASP|Average Selling Price| |ARR|Annual Recurring Revenue| |CAPEX|Capital Expenditures| |CCUR_GRTH*|Constant Currency Revenue Growth*| |COS*|Cost of Sales*| |CFO_GAAP|Chief Financial Officer (GAAP)| |DELIVERIES_UNITS|Deliveries Units| |EPS|Earnings Per Share| |EBIT*|Earnings Before Interest and Taxes*| |EBIT_REP|Earnings Before Interest and Taxes - Reported| |EBITDA*|Earnings Before Interest, Taxes, Depreciation, and Amortization*| |EBITDA_REP|Earnings Before Interest, Taxes, Depreciation, and Amortization - Reported| |G_A_EXP|General &amp; Admin Expense| |GROSS_INC*|Gross Income*| |GMV*|Gross Merchandise Volume*| |LCUR_GRTH*|Local Currency Revenue Growth*| |NET_ADDS|Net Adds| |NET_INC*|Net Profit*| |NET_SALES*|Net Sales*| |SUBSCRIBERS_NB*|Number of Subscribers*| |ORGANICGROWTH*|Organic Growth*| |PTX_INC|Pre-Tax Income| |RATEBASE*|Ratebase*| |AVGRATEBASE|Avg. Ratebase| |SALES*|Sales*| |SAMESTORESALES|Same Store Sales| |SGA|Selling, General &amp; Administrative Expenses| |S_M_EXP|Selling &amp; Marketing Expenses| |REV_TOT*|Total Revenues*|  &lt;h3&gt;Industry Metrics&lt;/h3&gt; |field|description| |---|---| |UNITS|Units| |NEW_ORDERS_VALUE*|Home Builders - New Orders Value*| |BACKLOG_VALUE|Home Builders - Backlog Value| |MCR|Hospitals - Medical Cost Ratio (%)| |CASH_COST|Mining - Cash Cost| |REAL_PRICE|Mining - Real Price| |DAU*|Social Media/Games - Daily Active Users*| |ARPU|Telecoms - Average Revenue Per User (ARPU)| |CONTR_PROF|Telecoms - Contribution Profit| |PAIDNADDS|Telecoms - Paid Net Adds|  | 
**segmentType** | [**SegmentType**](SegmentType.md) |  | [optional] 
**relativeFiscalStart** | **Number** | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. FactSet Estimates Actuals provides data for past periods. Therefore, the input for &#x60;relativeFiscalStart&#x60; must be an integer that is zero or less. For example, set to 0 and periodicity to ANN to ask for the current reported year (FY0). | [optional] 
**relativeFiscalEnd** | **Number** | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period.Therefore, the input for &#x60;relativeFiscalEnd&#x60; must be an integer that is zero or less. For example, set to -2 and periodicity to ANN to ask for two fiscal years before the latest (FY-2). | [optional] 
**periodicity** | [**Periodicity**](Periodicity.md) |  | [optional] 
**currency** | **String** | Currency code for adjusting the data. Use input as &#39;ESTIMATE&#39; for values in Estimate currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 



## Enum: [MetricsEnum]


* `ASP` (value: `"ASP"`)

* `ARR` (value: `"ARR"`)

* `CAPEX` (value: `"CAPEX"`)

* `CCUR_GRTH` (value: `"CCUR_GRTH"`)

* `COS` (value: `"COS"`)

* `CFO_GAAP` (value: `"CFO_GAAP"`)

* `DELIVERIES_UNITS` (value: `"DELIVERIES_UNITS"`)

* `EPS` (value: `"EPS"`)

* `EBIT` (value: `"EBIT"`)

* `EBIT_REP` (value: `"EBIT_REP"`)

* `EBITDA` (value: `"EBITDA"`)

* `EBITDA_REP` (value: `"EBITDA_REP"`)

* `G_A_EXP` (value: `"G_A_EXP"`)

* `GROSS_INC` (value: `"GROSS_INC"`)

* `GMV` (value: `"GMV"`)

* `LCUR_GRTH` (value: `"LCUR_GRTH"`)

* `NET_ADDS` (value: `"NET_ADDS"`)

* `NET_INC` (value: `"NET_INC"`)

* `NET_SALES` (value: `"NET_SALES"`)

* `SUBSCRIBERS_NB` (value: `"SUBSCRIBERS_NB"`)

* `ORGANICGROWTH` (value: `"ORGANICGROWTH"`)

* `PTX_INC` (value: `"PTX_INC"`)

* `RATEBASE` (value: `"RATEBASE"`)

* `AVGRATEBASE` (value: `"AVGRATEBASE"`)

* `SALES` (value: `"SALES"`)

* `SAMESTORESALES` (value: `"SAMESTORESALES"`)

* `SGA` (value: `"SGA"`)

* `S_M_EXP` (value: `"S_M_EXP"`)

* `REV_TOT` (value: `"REV_TOT"`)

* `UNITS` (value: `"UNITS"`)

* `NEW_ORDERS_VALUE` (value: `"NEW_ORDERS_VALUE"`)

* `BACKLOG_VALUE` (value: `"BACKLOG_VALUE"`)

* `MCR` (value: `"MCR"`)

* `CASH_COST` (value: `"CASH_COST"`)

* `REAL_PRICE` (value: `"REAL_PRICE"`)

* `DAU` (value: `"DAU"`)

* `ARPU` (value: `"ARPU"`)

* `CONTR_PROF` (value: `"CONTR_PROF"`)

* `PAIDNADDS` (value: `"PAIDNADDS"`)




