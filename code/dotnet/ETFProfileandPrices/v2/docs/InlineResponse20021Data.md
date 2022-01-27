# FactSet.SDK.ETFProfileandPrices.Model.InlineResponse20021Data
Taxes and fees.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MaxCapitalGainsRate** | [**InlineResponse20021DataMaxCapitalGainsRate**](InlineResponse20021DataMaxCapitalGainsRate.md) |  | [optional] 
**DividendTreatment** | **string** | Describes whether dividend income received by the ETP is distributed to ETP shareholders or capitalised (reinvested) into the ETP, text and standardized value available. This data is available for all the Canada and Europe regions. | [optional] 
**DistributeK1** | **string** | Flags ETPs that distribute K-1 tax forms. This data is available for the US regions. | [optional] 
**TaxType** | **string** | Type of the tax applicable on the distribution. This data is available for the US regions. | [optional] 
**TaxOnDistributions** | **string** | Tax treatment of the ETP&#39;s regular distributions. This data is available for the US regions. | [optional] 
**ExpenseRatio** | [**InlineResponse20021DataExpenseRatio**](InlineResponse20021DataExpenseRatio.md) |  | [optional] 
**PotentialCostIncreaseDate** | **DateTime** | Expiration date of any fee waivers. This data is available for the US and Canada regions. | [optional] 
**ContractAdvisoryFee** | **decimal** | The advisors fee excluding any additional costs or fees; A subset of the total expense ratio. This data is available for the Canada regions. | [optional] 
**CapitalGains** | **decimal** | Realized capital gains or losses reported on the ETP&#39;s most recent annual or semi-annual report. Gains must generally be paid out as a distribution at year-end, while losses can be banked to offset future gains. This data is available only for the US regions. | [optional] 
**CapitalGainsDistirbutions3Y** | **decimal** | The average annual capital gains paid out to shareholders over the past 3 calendar years, measured as a percent of net asset value (NAV) on the final trading day of each previous year. This data is available for the US region only. | [optional] 
**ManagementExpenseRatio** | **decimal** | Total net annual cost associated with holding the ETP, expressed as a percentage.  This data is available for the Canada regions. | [optional] 
**ManagementFee** | **decimal** | Annual fee collected by fund manager, expressed as a percentage. This data is available for the Canada region. | [optional] 
**TradingExpenseRatio** | **decimal** | Estimated annual costs associated with trading the underlying holdings. This data is available for the Canada region. | [optional] 
**FeeWaiver** | **string** | A reduction in annual ETP expenses, expressed as a percentage. This data is available for the Canada region. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

