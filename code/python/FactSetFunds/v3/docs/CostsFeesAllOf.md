# CostsFeesAllOf


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**management_fee** | **float, none_type** | The management fee, or maintenance fee, is charged by the fund manager. This cost is usually between 0.5% and 2% of assets on average and is a periodic fee. | [optional] 
**entry_fee** | **float, none_type** | The transaction entry fee or purchase fee collected from investors when they join or leave a scheme. The fee is paid to the fund | [optional] 
**exit_fee** | **float, none_type** | The transaction exit fee is charged to investors when they redeem shares from a fund. | [optional] 
**max_front_load_fee** | **float, none_type** | The Maximum sales load or initial Sales Fee is a reduction made from each investment in the fund, the maximum paid is dependent on the size of the purchase, it decreases as the investment increases. Often associated with class &#39;A&#39; shares of a mutual fund it is also known as Sales Charge, this is a fee paid when shares are purchased. Also known as a \&quot;front-end load\&quot;, this fee typically goes to the brokers that sell the fund&#39;s shares.  (Under the Investment Company Act of 1940 is 9%. The maximum sales load under NASD Rules is 81⁄2%).\&quot; | [optional] 
**max12_b1_fee** | **float, none_type** | The Back Expense Maximum | [optional] 
**backend_load** | **float, none_type** | Backend load is one of the fee and expense types reported for the specified share class, expressed as a percentage of assets under management.  | [optional] 
**expense_ratio** | **float, none_type** | The Expense Ratio | [optional] 
**expense_ratio_gross** | **float, none_type** | The Gross Expense Ratio | [optional] 
**initial_investment_minimum** | **float, none_type** | The Initial Investment Minimum | [optional] 
**initial_investment_ira** | **float, none_type** | The Initial Investment Individual Retirement Accounts | [optional] 
**swing_price** | **float, none_type** | Swing Price. Swing pricing occurs when a fund provider adjusts the net asset value (NAV) of a fund in order to pass on trading costs to purchasing or redeeming shareholders. This anti-dilution technique is used to protect long-term shareholder&#39;s interests. | [optional] 
**swing_price_date** | **date, none_type** | Swing Price Date. Swing pricing occurs when a fund provider adjusts the net asset value (NAV) of a fund in order to pass on trading costs to purchasing or redeeming shareholders. This anti-dilution technique is used to protect long-term shareholder&#39;s interests. | [optional] 
**performance_fee** | **float, none_type** | Represents fees made to an investment manager as a percentage of investment profits for generating positive returns. | [optional] 
**trading_expense_ratio** | **float, none_type** | Represents the amount of trading commissions incurred to manage the portfolio as a percentage of the total assets of the fund. | [optional] 
**median_tracking_difference_percent** | **float, none_type** | Returns median tracking difference. Median, upside, and downside are calculated by a rolling 12-month difference between NAV and index returns. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**max_upside_deviation_percent** | **float, none_type** | Returns Maximum Upside Deviation. Median, upside, and downside are calculated by a rolling 12-month difference between NAV and index returns. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**max_down_side_deviation_percent** | **float, none_type** | Returns Maximum Down Side Deviation. Median, upside, and downside are calculated by a rolling 12-month difference between NAV and index returns. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**fund_closure_risk** | **str, none_type** | Returns the fund closure risk. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**etn_counterparty_risk** | **str, none_type** | Returns the ETN CounterParty Risk. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


