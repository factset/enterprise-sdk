# InlineResponse20021Data

Taxes and fees.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_capital_gains_rate** | [**InlineResponse20021DataMaxCapitalGainsRate**](InlineResponse20021DataMaxCapitalGainsRate.md) |  | [optional] 
**dividend_treatment** | **str** | Describes whether dividend income received by the ETP is distributed to ETP shareholders or capitalised (reinvested) into the ETP, text and standardized value available. This data is available for all the Canada and Europe regions. | [optional] 
**distribute_k1** | **str** | Flags ETPs that distribute K-1 tax forms. This data is available for the US regions. | [optional] 
**tax_type** | **str** | Type of the tax applicable on the distribution. This data is available for the US regions. | [optional] 
**tax_on_distributions** | **str** | Tax treatment of the ETP&#39;s regular distributions. This data is available for the US regions. | [optional] 
**expense_ratio** | [**InlineResponse20021DataExpenseRatio**](InlineResponse20021DataExpenseRatio.md) |  | [optional] 
**potential_cost_increase_date** | **date** | Expiration date of any fee waivers. This data is available for the US and Canada regions. | [optional] 
**contract_advisory_fee** | **float** | The advisors fee excluding any additional costs or fees; A subset of the total expense ratio. This data is available for the Canada regions. | [optional] 
**capital_gains** | **float** | Realized capital gains or losses reported on the ETP&#39;s most recent annual or semi-annual report. Gains must generally be paid out as a distribution at year-end, while losses can be banked to offset future gains. This data is available only for the US regions. | [optional] 
**capital_gains_distirbutions3_y** | **float** | The average annual capital gains paid out to shareholders over the past 3 calendar years, measured as a percent of net asset value (NAV) on the final trading day of each previous year. This data is available for the US region only. | [optional] 
**management_expense_ratio** | **float** | Total net annual cost associated with holding the ETP, expressed as a percentage.  This data is available for the Canada regions. | [optional] 
**management_fee** | **float** | Annual fee collected by fund manager, expressed as a percentage. This data is available for the Canada region. | [optional] 
**trading_expense_ratio** | **float** | Estimated annual costs associated with trading the underlying holdings. This data is available for the Canada region. | [optional] 
**fee_waiver** | **str** | A reduction in annual ETP expenses, expressed as a percentage. This data is available for the Canada region. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


