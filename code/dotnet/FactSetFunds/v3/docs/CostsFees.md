# FactSet.SDK.FactSetFunds.Model.CostsFees
Detailed fund costs and fees including management expenses, entry/exit fees, expense ratios, and investment minimums

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 
**Date** | **DateTime?** | The date in YYYY-MM-DD format. | [optional] 
**Currency** | **string** | ISO3 Currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)&#39; | [optional] 
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**ManagementFee** | **double?** | The management fee, or maintenance fee, is charged by the fund manager. This cost is usually between 0.5% and 2% of assets on average and is a periodic fee. | [optional] 
**EntryFee** | **double?** | The transaction entry fee or purchase fee collected from investors when they join or leave a scheme. The fee is paid to the fund | [optional] 
**ExitFee** | **double?** | The transaction exit fee is charged to investors when they redeem shares from a fund. | [optional] 
**MaxFrontLoadFee** | **double?** | The Maximum sales load or initial Sales Fee is a reduction made from each investment in the fund, the maximum paid is dependent on the size of the purchase, it decreases as the investment increases. Often associated with class &#39;A&#39; shares of a mutual fund it is also known as Sales Charge, this is a fee paid when shares are purchased. Also known as a \&quot;front-end load\&quot;, this fee typically goes to the brokers that sell the fund&#39;s shares.  (Under the Investment Company Act of 1940 is 9%. The maximum sales load under NASD Rules is 81⁄2%).\&quot; | [optional] 
**Max12B1Fee** | **double?** | The Back Expense Maximum | [optional] 
**BackendLoad** | **double?** | Backend load is one of the fee and expense types reported for the specified share class, expressed as a percentage of assets under management.  | [optional] 
**ExpenseRatio** | **double?** | The Expense Ratio | [optional] 
**ExpenseRatioGross** | **double?** | The Gross Expense Ratio | [optional] 
**InitialInvestmentMinimum** | **double?** | The Initial Investment Minimum | [optional] 
**InitialInvestmentIRA** | **double?** | The Initial Investment Individual Retirement Accounts | [optional] 
**SwingPrice** | **double?** | Swing Price. Swing pricing occurs when a fund provider adjusts the net asset value (NAV) of a fund in order to pass on trading costs to purchasing or redeeming shareholders. This anti-dilution technique is used to protect long-term shareholder&#39;s interests. | [optional] 
**SwingPriceDate** | **DateTime?** | Swing Price Date. Swing pricing occurs when a fund provider adjusts the net asset value (NAV) of a fund in order to pass on trading costs to purchasing or redeeming shareholders. This anti-dilution technique is used to protect long-term shareholder&#39;s interests. | [optional] 
**PerformanceFee** | **double?** | Represents fees made to an investment manager as a percentage of investment profits for generating positive returns. | [optional] 
**TradingExpenseRatio** | **double?** | Represents the amount of trading commissions incurred to manage the portfolio as a percentage of the total assets of the fund. | [optional] 
**MedianTrackingDifferencePercent** | **double?** | Returns median tracking difference. Median, upside, and downside are calculated by a rolling 12-month difference between NAV and index returns. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**MaxUpsideDeviationPercent** | **double?** | Returns Maximum Upside Deviation. Median, upside, and downside are calculated by a rolling 12-month difference between NAV and index returns. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**MaxDownSideDeviationPercent** | **double?** | Returns Maximum Down Side Deviation. Median, upside, and downside are calculated by a rolling 12-month difference between NAV and index returns. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**FundClosureRisk** | **string** | Returns the fund closure risk. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**EtnCounterpartyRisk** | **string** | Returns the ETN CounterParty Risk. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

