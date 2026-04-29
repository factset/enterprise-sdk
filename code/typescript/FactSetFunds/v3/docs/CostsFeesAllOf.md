# factsetfunds.CostsFeesAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**managementFee** | **Number** | The management fee, or maintenance fee, is charged by the fund manager. This cost is usually between 0.5% and 2% of assets on average and is a periodic fee. | [optional] 
**entryFee** | **Number** | The transaction entry fee or purchase fee collected from investors when they join or leave a scheme. The fee is paid to the fund | [optional] 
**exitFee** | **Number** | The transaction exit fee is charged to investors when they redeem shares from a fund. | [optional] 
**maxFrontLoadFee** | **Number** | The Maximum sales load or initial Sales Fee is a reduction made from each investment in the fund, the maximum paid is dependent on the size of the purchase, it decreases as the investment increases. Often associated with class &#39;A&#39; shares of a mutual fund it is also known as Sales Charge, this is a fee paid when shares are purchased. Also known as a \&quot;front-end load\&quot;, this fee typically goes to the brokers that sell the fund&#39;s shares.  (Under the Investment Company Act of 1940 is 9%. The maximum sales load under NASD Rules is 81⁄2%).\&quot; | [optional] 
**max12B1Fee** | **Number** | The Back Expense Maximum | [optional] 
**backendLoad** | **Number** | Backend load is one of the fee and expense types reported for the specified share class, expressed as a percentage of assets under management.  | [optional] 
**expenseRatio** | **Number** | The Expense Ratio | [optional] 
**expenseRatioGross** | **Number** | The Gross Expense Ratio | [optional] 
**initialInvestmentMinimum** | **Number** | The Initial Investment Minimum | [optional] 
**initialInvestmentIRA** | **Number** | The Initial Investment Individual Retirement Accounts | [optional] 
**swingPrice** | **Number** | Swing Price. Swing pricing occurs when a fund provider adjusts the net asset value (NAV) of a fund in order to pass on trading costs to purchasing or redeeming shareholders. This anti-dilution technique is used to protect long-term shareholder&#39;s interests. | [optional] 
**swingPriceDate** | **Date** | Swing Price Date. Swing pricing occurs when a fund provider adjusts the net asset value (NAV) of a fund in order to pass on trading costs to purchasing or redeeming shareholders. This anti-dilution technique is used to protect long-term shareholder&#39;s interests. | [optional] 
**performanceFee** | **Number** | Represents fees made to an investment manager as a percentage of investment profits for generating positive returns. | [optional] 
**tradingExpenseRatio** | **Number** | Represents the amount of trading commissions incurred to manage the portfolio as a percentage of the total assets of the fund. | [optional] 
**medianTrackingDifferencePercent** | **Number** | Returns median tracking difference. Median, upside, and downside are calculated by a rolling 12-month difference between NAV and index returns. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**maxUpsideDeviationPercent** | **Number** | Returns Maximum Upside Deviation. Median, upside, and downside are calculated by a rolling 12-month difference between NAV and index returns. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**maxDownSideDeviationPercent** | **Number** | Returns Maximum Down Side Deviation. Median, upside, and downside are calculated by a rolling 12-month difference between NAV and index returns. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**fundClosureRisk** | **String** | Returns the fund closure risk. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**etnCounterpartyRisk** | **String** | Returns the ETN CounterParty Risk. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 


