# ResultsModelAnalyticsStatistics


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**drawdown** | **float** | Drawdown quantifies the portfolio’s maximum peak to trough decline experienced over the time period under consideration. It is expressed as the total percent drop between the peak portfolio value and the subsequent deepest trough. | [optional] 
**modigliani_return** | **float** | Also known as M2, this is a measure of the risk adjusted returns of an investment portfolio. It measures the returns of the portfolio, adjusted for the risk of the portfolio relative to that of some benchmark. Derived from the Sharpe ratio, Modigliani return has the advantage of being represented in units of percent return, making the measure more intuitive to interpret. | [optional] 
**standard_deviation** | **float** | Standard deviation expresses the historical volatility of portfolio monthly returns, over the specified time period. | [optional] 
**tracking_error** | **float** | Also referred to as active risk, this value provides a measure of the deviation between portfolio returns and the returns of the benchmark resulting from portfolio systematic risk and active share. In general, the higher the active share the greater will be the tracking error. Tracking error is calculated as the standard deviation of the difference between the portfolio and benchmark returns and is displayed as a percentage. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


