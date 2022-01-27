# CostsFees


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested. | [optional] 
**management_expenses** | **float** | The management fee, or maintenance fee, is charged by the fund manager. This cost is usually between 0.5% and 2% of assets on average and is a periodic fee. | [optional] 
**date** | **str** | The Expense Date expressed in YYYY-MM-DD. | [optional] 
**currency** | **str** | ISO3 Currency | [optional] 
**entry_expense** | **float** | The transaction entry fee or purchase fee collected from investors when they join or leave a scheme. The fee is paid to the fund | [optional] 
**exit_expense** | **float** | The transaction exit fee is charged to investors when they redeem shares from a fund. | [optional] 
**front_expenses_max** | **float** | The Maximum sales load or initial Sales Fee is a reduction made from each investment in the fund, the maximum paid is dependent on the size of the purchase, it decreases as the investment increases. Often associated with class &#39;A&#39; shares of a mutual fund it is also known as Sales Charge, this is a fee paid when shares are purchased. Also known as a \&quot;front-end load\&quot;, this fee typically goes to the brokers that sell the fund&#39;s shares.  (Under the Investment Company Act of 1940 is 9%. The maximum sales load under NASD Rules is 81⁄2%).\&quot;  | [optional] 
**back_expenses_max** | **float** | The Back Expense Maximum | [optional] 
**expense_ratio** | **float** | The Expense Ratio | [optional] 
**expense_ratio_prospectus** | **float** | The Expense Ratio Prospectus | [optional] 
**init_investment_min** | **float** | The Initial Investment Minimum | [optional] 
**init_investment_ira** | **float** | The Initial Investment Individual Retirement Accounts | [optional] 
**swing_price** | **float** | Swing Price. Swing pricing occurs when a fund provider adjusts the net asset value (NAV) of a fund in order to pass on trading costs to purchasing or redeeming shareholders. This anti-dilution technique is used to protect long-term shareholder’s interests. | [optional] 
**swing_price_date** | **str** | Swing Price Date. Swing pricing occurs when a fund provider adjusts the net asset value (NAV) of a fund in order to pass on trading costs to purchasing or redeeming shareholders. This anti-dilution technique is used to protect long-term shareholder’s interests. | [optional] 
**sri_priips** | **int** | The SRI (Summary Risk Indicator) illustrates PRIIPs’ risk and reward profile by measuring the market and credit risk level. Returns 1 for low risk up to 7 for higher risk. | [optional] 
**srri_ucits** | **int** | Synthetic Risk and Reward Indicator illustrates a UCITS or NURS (Non-UCITS Retail Scheme) fund’s risk and reward profile by measuring the market risk level. Returns 1 for low risk up to 7 for high risk. | [optional] 
**performance_fee** | **float** | Represents fees made to an investment manager as a percentage of investment profits for generating positive returns. | [optional] 
**trading_expense_ratio** | **float** | Represents the amount of trading commissions incurred to manage the portfolio as a percentage of the total assets of the fund. | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


