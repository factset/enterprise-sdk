# FactSet.SDK.ETFProfileandPrices.Model.InlineResponse20011Data
Portfolio statistics.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AsOfDate** | **DateTime** | Date the analytics data was published. Available for the regions: US, Europe, and Canada. | [optional] 
**NumberHoldings** | **decimal** | A measure of portfolio diversification, calculated by summing the squared weights of each fund constituent. Low concentration implies high diversification, and vice versa. Outputs are Low, Medium or High. Available for regions: US. | [optional] 
**Concentration** | **string** | A measure of portfolio diversification, calculated by summing the squared weights of each fund constituent. Low concentration implies high diversification, and vice versa. Possible values are Low, Medium or High. Available for regions: US. | [optional] 
**DividendYield** | **decimal** | The annualized weighted average of the current dividend yield of the portfolio&#39;s holdings, gross of fees. Available for the regions: US. | [optional] 
**PriceEarningsRatio** | **decimal** | Weighted average ratio of prices of a fund’s stocks values to their trailing earnings of underlying stocks. Aggregate prices are scaled by the sum of individual earnings, including negative earnings. Available for the regions: US. | [optional] 
**PriceBookRatio** | **decimal** | Weighted average ratio of prices of a fund’s stocks to the book value of underlying stocks. Aggregate prices are scaled by the sum of individual book values. Available for the regions: US. | [optional] 
**MarketCapitalization** | **decimal** | The weighted average market capitalization of the stocks in the fund&#39;s portfolio (USD). Available for regions: US. | [optional] 
**TimeToMaturity** | **decimal** | The weighted average of remaining time until maturity for all bonds in the portfolio, measured in (possibly fractional) years. Available for the regions: US. | [optional] 
**CreditRating** | **string** | Average credit rating for the portfolio, determined by mapping ratings from credit agencies (Fitch, Moody&#39;s and Standard &amp; Poor&#39;s) to numerical likelihood of default for each bond in the portfolio and then finding the weighted average default probability, then mapping back to an agency credit rating. Accounts for the nonlinear probability of default when aggregating agency ratings. FactSet has developed a numeric equivalent system that allows math functions such as averaging and comparisons across sources (using greater than, equal to, or less than operators), to facilitate easier evaluation. Available for the regions: US. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

