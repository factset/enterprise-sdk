

# CostsFees


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested. |  [optional]
**managementExpenses** | **Double** | The management fee, or maintenance fee, is charged by the fund manager. This cost is usually between 0.5% and 2% of assets on average and is a periodic fee. |  [optional]
**date** | **LocalDate** | The Expense Date expressed in YYYY-MM-DD. |  [optional]
**currency** | **String** | ISO3 Currency |  [optional]
**entryExpenses** | **Double** | The transaction entry fee or purchase fee collected from investors when they join or leave a scheme. The fee is paid to the fund |  [optional]
**exitExpenses** | **Double** | The transaction exit fee is charged to investors when they redeem shares from a fund. |  [optional]
**frontExpensesMax** | **Double** | The Maximum sales load or initial Sales Fee is a reduction made from each investment in the fund, the maximum paid is dependent on the size of the purchase, it decreases as the investment increases. Often associated with class &#39;A&#39; shares of a mutual fund it is also known as Sales Charge, this is a fee paid when shares are purchased. Also known as a \&quot;front-end load\&quot;, this fee typically goes to the brokers that sell the fund&#39;s shares.  (Under the Investment Company Act of 1940 is 9%. The maximum sales load under NASD Rules is 81⁄2%).\&quot;  |  [optional]
**backExpensesMax** | **Double** | The Back Expense Maximum |  [optional]
**expenseRatio** | **Double** | The Expense Ratio |  [optional]
**expenseRatioProspectus** | **Double** | The Expense Ratio Prospectus |  [optional]
**initInvestmentMin** | **Double** | The Initial Investment Minimum |  [optional]
**initInvestmentIra** | **Double** | The Initial Investment Individual Retirement Accounts |  [optional]
**swingPrice** | **Double** | Swing Price. Swing pricing occurs when a fund provider adjusts the net asset value (NAV) of a fund in order to pass on trading costs to purchasing or redeeming shareholders. This anti-dilution technique is used to protect long-term shareholder&#39;s interests. |  [optional]
**swingPriceDate** | **LocalDate** | Swing Price Date. Swing pricing occurs when a fund provider adjusts the net asset value (NAV) of a fund in order to pass on trading costs to purchasing or redeeming shareholders. This anti-dilution technique is used to protect long-term shareholder&#39;s interests. |  [optional]
**sriPriips** | **Integer** | The SRI (Summary Risk Indicator) illustrates PRIIPs&#39; risk and reward profile by measuring the market and credit risk level. Returns 1 for low risk up to 7 for higher risk. |  [optional]
**srriUcits** | **Integer** | Synthetic Risk and Reward Indicator illustrates a UCITS or NURS (Non-UCITS Retail Scheme) fund&#39;s risk and reward profile by measuring the market risk level. Returns 1 for low risk up to 7 for high risk. |  [optional]
**performanceFee** | **Double** | Represents fees made to an investment manager as a percentage of investment profits for generating positive returns. |  [optional]
**tradingExpenseRatio** | **Double** | Represents the amount of trading commissions incurred to manage the portfolio as a percentage of the total assets of the fund. |  [optional]
**requestId** | **String** | The requested Id sent as input. |  [optional]


## Implemented Interfaces

* Serializable


