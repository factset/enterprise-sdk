

# RiskResponseInfo

Metrics for a particular year

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**year** | **BigDecimal** | Year |  [optional]
**benchmark** | **String** | Benchmark |  [optional]
**alpha** | **Double** | A measure of the difference between a fund&#39;s actual monthly excess return and its expected monthly excess return, which in turn is based on that fund&#39;s sensitivity (beta) to the excess return for the benchmark index. |  [optional]
**beta** | **Double** | A measure of a fund&#39;s sensitivity to the market movement. The benchmark portfolio has the beta of one. A fund with beta greater than one is riskier than the benchmark and a fund with beta smaller than one is less risky than the benchmark. |  [optional]
**sharpeRatio** | **Double** | A measure of risk adjusted performance with the assumption of a well diversified portfolio, which only contains market risk. It is the ratio of a fund&#39;s excess return to its beta or market risk. |  [optional]
**treynorRatio** | **Double** | A measure of risk adjusted performance. It is the ratio of a fund&#39;s excess return to its standard deviation. A higher Sharpe ratio normally preferred. This indicates a higher return for the amount of risk demonstrated by the fund. |  [optional]
**rSquared** | **Double** | A statistic to measure the percentage of a fund&#39;s movements that are explained by the movements of its benchmark. A R-square with 100 means the portfolio performance is 100 percent explained by its benchmark. A high R-square also means the higher reliability of beta. |  [optional]
**sortino** | **Double** | The Sortino Ratio is similar to the Sharpe Ratio, except instead of using standard deviation as the denominator, it uses downside deviation. |  [optional]
**standardDeviation** | **Double** | Standard deviation is a measure of risk which takes a fund monthly return over a certain period, e.g. 36 months and it calculates the average deviation from the mean. The higher the standard deviation, the riskier the fund is. |  [optional]
**volatility** | **BigDecimal** | Volatility is a measure of risk using a ranking of Standard Deviation in percentiles among its peer group. A scale from 1 to 10 is used to indicate in which decile the fund falls. A fund with 10 volatility is the highest and 1 is the lowest. |  [optional]


## Implemented Interfaces

* Serializable


