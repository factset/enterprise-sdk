# etfprofileandprices.InlineResponse20021Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxCapitalGainsRate** | [**InlineResponse20021DataMaxCapitalGainsRate**](InlineResponse20021DataMaxCapitalGainsRate.md) |  | [optional] 
**dividendTreatment** | **String** | Describes whether dividend income received by the ETP is distributed to ETP shareholders or capitalised (reinvested) into the ETP, text and standardized value available. This data is available for all the Canada and Europe regions. | [optional] 
**distributeK1** | **String** | Flags ETPs that distribute K-1 tax forms. This data is available for the US regions. | [optional] 
**taxType** | **String** | Type of the tax applicable on the distribution. This data is available for the US regions. | [optional] 
**taxOnDistributions** | **String** | Tax treatment of the ETP&#39;s regular distributions. This data is available for the US regions. | [optional] 
**expenseRatio** | [**InlineResponse20021DataExpenseRatio**](InlineResponse20021DataExpenseRatio.md) |  | [optional] 
**potentialCostIncreaseDate** | **Date** | Expiration date of any fee waivers. This data is available for the US and Canada regions. | [optional] 
**contractAdvisoryFee** | **Number** | The advisors fee excluding any additional costs or fees; A subset of the total expense ratio. This data is available for the Canada regions. | [optional] 
**capitalGains** | **Number** | Realized capital gains or losses reported on the ETP&#39;s most recent annual or semi-annual report. Gains must generally be paid out as a distribution at year-end, while losses can be banked to offset future gains. This data is available only for the US regions. | [optional] 
**capitalGainsDistirbutions3Y** | **Number** | The average annual capital gains paid out to shareholders over the past 3 calendar years, measured as a percent of net asset value (NAV) on the final trading day of each previous year. This data is available for the US region only. | [optional] 
**managementExpenseRatio** | **Number** | Total net annual cost associated with holding the ETP, expressed as a percentage.  This data is available for the Canada regions. | [optional] 
**managementFee** | **Number** | Annual fee collected by fund manager, expressed as a percentage. This data is available for the Canada region. | [optional] 
**tradingExpenseRatio** | **Number** | Estimated annual costs associated with trading the underlying holdings. This data is available for the Canada region. | [optional] 
**feeWaiver** | **String** | A reduction in annual ETP expenses, expressed as a percentage. This data is available for the Canada region. | [optional] 


