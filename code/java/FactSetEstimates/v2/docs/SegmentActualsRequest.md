

# SegmentActualsRequest

Request object for requesting segment actuals.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. &lt;p&gt;&lt;b&gt;Performance Note:&lt;/b&gt; Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.&lt;/p&gt; &lt;p&gt;If requesting long historical data, limit the history to &lt;b&gt;10 years per metric per ID&lt;/b&gt;.&lt;/p&gt;  | 
**metrics** | [**java.util.List&lt;MetricsEnum&gt;**](#java.util.List&lt;MetricsEnum&gt;) | Requested metrics for segment actuals. An asterisk denotes metric items included for geographic segments. Note, the number of metrics you   are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).  &lt;h3&gt;Financial Metrics&lt;/h3&gt; |field|description| |---|---| |ASP|Average Selling Price| |ARR|Annual Recurring Revenue| |CAPEX|Capital Expenditures| |CCUR_GRTH*|Constant Currency Revenue Growth*| |COS*|Cost of Sales*| |CFO_GAAP|Chief Financial Officer (GAAP)| |DELIVERIES_UNITS|Deliveries Units| |EPS|Earnings Per Share| |EBIT*|Earnings Before Interest and Taxes*| |EBIT_REP|Earnings Before Interest and Taxes - Reported| |EBITDA*|Earnings Before Interest, Taxes, Depreciation, and Amortization*| |EBITDA_REP|Earnings Before Interest, Taxes, Depreciation, and Amortization - Reported| |G_A_EXP|General &amp; Admin Expense| |GROSS_INC*|Gross Income*| |GMV*|Gross Merchandise Volume*| |LCUR_GRTH*|Local Currency Revenue Growth*| |NET_ADDS|Net Adds| |NET_INC*|Net Profit*| |NET_SALES*|Net Sales*| |SUBSCRIBERS_NB*|Number of Subscribers*| |ORGANICGROWTH*|Organic Growth*| |PTX_INC|Pre-Tax Income| |RATEBASE*|Ratebase*| |AVGRATEBASE|Avg. Ratebase| |SALES*|Sales*| |SAMESTORESALES|Same Store Sales| |SGA|Selling, General &amp; Administrative Expenses| |S_M_EXP|Selling &amp; Marketing Expenses| |REV_TOT*|Total Revenues*|  &lt;h3&gt;Industry Metrics&lt;/h3&gt; |field|description| |---|---| |UNITS|Units| |NEW_ORDERS_VALUE*|Home Builders - New Orders Value*| |BACKLOG_VALUE|Home Builders - Backlog Value| |MCR|Hospitals - Medical Cost Ratio (%)| |CASH_COST|Mining - Cash Cost| |REAL_PRICE|Mining - Real Price| |DAU*|Social Media/Games - Daily Active Users*| |ARPU|Telecoms - Average Revenue Per User (ARPU)| |CONTR_PROF|Telecoms - Contribution Profit| |PAIDNADDS|Telecoms - Paid Net Adds|  | 
**segmentType** | **SegmentType** |  |  [optional]
**relativeFiscalStart** | **Integer** | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. FactSet Estimates Actuals provides data for past periods. Therefore, the input for &#x60;relativeFiscalStart&#x60; must be an integer that is zero or less. For example, set to 0 and periodicity to ANN to ask for the current reported year (FY0). |  [optional]
**relativeFiscalEnd** | **Integer** | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period.Therefore, the input for &#x60;relativeFiscalEnd&#x60; must be an integer that is zero or less. For example, set to -2 and periodicity to ANN to ask for two fiscal years before the latest (FY-2). |  [optional]
**periodicity** | **Periodicity** |  |  [optional]
**currency** | **String** | Currency code for adjusting the data. Use input as &#39;ESTIMATE&#39; for values in Estimate currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). |  [optional]



## Enum: java.util.List&lt;MetricsEnum&gt;

Name | Value
---- | -----
ASP | &quot;ASP&quot;
ARR | &quot;ARR&quot;
CAPEX | &quot;CAPEX&quot;
CCUR_GRTH | &quot;CCUR_GRTH&quot;
COS | &quot;COS&quot;
CFO_GAAP | &quot;CFO_GAAP&quot;
DELIVERIES_UNITS | &quot;DELIVERIES_UNITS&quot;
EPS | &quot;EPS&quot;
EBIT | &quot;EBIT&quot;
EBIT_REP | &quot;EBIT_REP&quot;
EBITDA | &quot;EBITDA&quot;
EBITDA_REP | &quot;EBITDA_REP&quot;
G_A_EXP | &quot;G_A_EXP&quot;
GROSS_INC | &quot;GROSS_INC&quot;
GMV | &quot;GMV&quot;
LCUR_GRTH | &quot;LCUR_GRTH&quot;
NET_ADDS | &quot;NET_ADDS&quot;
NET_INC | &quot;NET_INC&quot;
NET_SALES | &quot;NET_SALES&quot;
SUBSCRIBERS_NB | &quot;SUBSCRIBERS_NB&quot;
ORGANICGROWTH | &quot;ORGANICGROWTH&quot;
PTX_INC | &quot;PTX_INC&quot;
RATEBASE | &quot;RATEBASE&quot;
AVGRATEBASE | &quot;AVGRATEBASE&quot;
SALES | &quot;SALES&quot;
SAMESTORESALES | &quot;SAMESTORESALES&quot;
SGA | &quot;SGA&quot;
S_M_EXP | &quot;S_M_EXP&quot;
REV_TOT | &quot;REV_TOT&quot;
UNITS | &quot;UNITS&quot;
NEW_ORDERS_VALUE | &quot;NEW_ORDERS_VALUE&quot;
BACKLOG_VALUE | &quot;BACKLOG_VALUE&quot;
MCR | &quot;MCR&quot;
CASH_COST | &quot;CASH_COST&quot;
REAL_PRICE | &quot;REAL_PRICE&quot;
DAU | &quot;DAU&quot;
ARPU | &quot;ARPU&quot;
CONTR_PROF | &quot;CONTR_PROF&quot;
PAIDNADDS | &quot;PAIDNADDS&quot;


## Implemented Interfaces

* Serializable


