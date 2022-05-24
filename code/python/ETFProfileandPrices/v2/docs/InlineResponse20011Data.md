# InlineResponse20011Data

Portfolio statistics.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**as_of_date** | **date** | Date the analytics data was published. Available for the regions: US, Europe, and Canada. | [optional] 
**number_holdings** | **float** | A measure of portfolio diversification, calculated by summing the squared weights of each fund constituent. Low concentration implies high diversification, and vice versa. Outputs are Low, Medium or High. Available for regions: US. | [optional] 
**concentration** | **str** | A measure of portfolio diversification, calculated by summing the squared weights of each fund constituent. Low concentration implies high diversification, and vice versa. Possible values are Low, Medium or High. Available for regions: US. | [optional] 
**dividend_yield** | **float** | The annualized weighted average of the current dividend yield of the portfolio&#39;s holdings, gross of fees. Available for the regions: US. | [optional] 
**price_earnings_ratio** | **float** | Weighted average ratio of prices of a fund’s stocks values to their trailing earnings of underlying stocks. Aggregate prices are scaled by the sum of individual earnings, including negative earnings. Available for the regions: US. | [optional] 
**price_book_ratio** | **float** | Weighted average ratio of prices of a fund’s stocks to the book value of underlying stocks. Aggregate prices are scaled by the sum of individual book values. Available for the regions: US. | [optional] 
**market_capitalization** | **float** | The weighted average market capitalization of the stocks in the fund&#39;s portfolio (USD). Available for regions: US. | [optional] 
**time_to_maturity** | **float** | The weighted average of remaining time until maturity for all bonds in the portfolio, measured in (possibly fractional) years. Available for the regions: US. | [optional] 
**credit_rating** | **str** | Average credit rating for the portfolio, determined by mapping ratings from credit agencies (Fitch, Moody&#39;s and Standard &amp; Poor&#39;s) to numerical likelihood of default for each bond in the portfolio and then finding the weighted average default probability, then mapping back to an agency credit rating. Accounts for the nonlinear probability of default when aggregating agency ratings. FactSet has developed a numeric equivalent system that allows math functions such as averaging and comparisons across sources (using greater than, equal to, or less than operators), to facilitate easier evaluation. Available for the regions: US. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


