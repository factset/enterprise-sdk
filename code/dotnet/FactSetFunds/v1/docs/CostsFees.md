# FactSet.SDK.FactSetFunds.Model.CostsFees

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested. | [optional] 
**ManagementExpenses** | **double** | The management fee, or maintenance fee, is charged by the fund manager. This cost is usually between 0.5% and 2% of assets on average and is a periodic fee. | [optional] 
**Date** | **string** | The Expense Date expressed in YYYY-MM-DD. | [optional] 
**Currency** | **string** | ISO3 Currency | [optional] 
**EntryExpense** | **double** | The transaction entry fee or purchase fee collected from investors when they join or leave a scheme. The fee is paid to the fund | [optional] 
**ExitExpense** | **double** | The transaction exit fee is charged to investors when they redeem shares from a fund. | [optional] 
**FrontExpensesMax** | **double** | The Maximum sales load or initial Sales Fee is a reduction made from each investment in the fund, the maximum paid is dependent on the size of the purchase, it decreases as the investment increases. Often associated with class &#39;A&#39; shares of a mutual fund it is also known as Sales Charge, this is a fee paid when shares are purchased. Also known as a \&quot;front-end load\&quot;, this fee typically goes to the brokers that sell the fund&#39;s shares.  (Under the Investment Company Act of 1940 is 9%. The maximum sales load under NASD Rules is 81⁄2%).\&quot;  | [optional] 
**BackExpensesMax** | **double** | The Back Expense Maximum | [optional] 
**ExpenseRatio** | **double** | The Expense Ratio | [optional] 
**ExpenseRatioProspectus** | **double** | The Expense Ratio Prospectus | [optional] 
**InitInvestmentMin** | **double** | The Initial Investment Minimum | [optional] 
**InitInvestmentIra** | **double** | The Initial Investment Individual Retirement Accounts | [optional] 
**SwingPrice** | **double** | Swing Price. Swing pricing occurs when a fund provider adjusts the net asset value (NAV) of a fund in order to pass on trading costs to purchasing or redeeming shareholders. This anti-dilution technique is used to protect long-term shareholder’s interests. | [optional] 
**SwingPriceDate** | **string** | Swing Price Date. Swing pricing occurs when a fund provider adjusts the net asset value (NAV) of a fund in order to pass on trading costs to purchasing or redeeming shareholders. This anti-dilution technique is used to protect long-term shareholder’s interests. | [optional] 
**SriPriips** | **int** | The SRI (Summary Risk Indicator) illustrates PRIIPs’ risk and reward profile by measuring the market and credit risk level. Returns 1 for low risk up to 7 for higher risk. | [optional] 
**SrriUcits** | **int** | Synthetic Risk and Reward Indicator illustrates a UCITS or NURS (Non-UCITS Retail Scheme) fund’s risk and reward profile by measuring the market risk level. Returns 1 for low risk up to 7 for high risk. | [optional] 
**PerformanceFee** | **double** | Represents fees made to an investment manager as a percentage of investment profits for generating positive returns. | [optional] 
**TradingExpenseRatio** | **double** | Represents the amount of trading commissions incurred to manage the portfolio as a percentage of the total assets of the fund. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

