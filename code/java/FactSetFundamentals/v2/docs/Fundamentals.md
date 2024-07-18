

# Fundamentals

Factset Fundamental Response item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Identifier that was used for the request. |  [optional]
**error** | [**CompanyReportErrorObject**](CompanyReportErrorObject.md) |  |  [optional]
**fsymId** | **String** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. |  [optional]
**asOfDate** | **LocalDate** | Date on which the specified fundamentals data or information is accurate or relevant. |  [optional]
**currency** | **String** | Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). |  [optional]
**assetTurnoverRatio** | **Double** | The asset turnover ratio measures the value of a company&#39;s sales or revenues relative to the value of its assets |  [optional]
**bookValuePerShare** | **Double** | Book value per common share is a formula used to calculate the per share value of a company based on common shareholders&#39; equity in the company |  [optional]
**cashFlowPerShare** | **Double** | Cash flow per share is calculated as a ratio, indicating the amount of cash a business generates based on a company&#39;s net income with the costs of depreciation and amortization added back |  [optional]
**cashPerShare** | **Double** | Cash Per Share of Security |  [optional]
**currentRatio** | **Double** | The current ratio is a liquidity ratio that measures a company&#39;s ability to pay short-term and long-term obligations. The ratio is calculated by comparing current assets to current liabilities |  [optional]
**dividend** | [**Dividend**](Dividend.md) |  |  [optional]
**earningsPerShare** | **Double** | Earnings per share (EPS) is the portion of a company&#39;s profit allocated to each share of common stock |  [optional]
**ebitMargin** | **Double** | EBIT margin is an assessment of a firm&#39;s operating profitability as a percentage of its total revenue. It is equal to earnings before interest and tax (EBIT) divided by total revenue |  [optional]
**ebitdaMargin** | **Double** | EBITDA margin is an assessment of a firm&#39;s operating profitability as a percentage of its total revenue. It is equal to earnings before interest, tax, depreciation and amortization (EBITDA) divided by total revenue |  [optional]
**enterpriseValue** | **Double** | Enterprise Value (EV) is the measure of a company&#39;s total value for the period and date(s) requested in local currency by default |  [optional]
**fiveYearAverageYield** | **Double** | Average of the dividend yield with yield calculated for each of the past five years |  [optional]
**fiveYearDividendGrowthRate** | **Double** | The dividend growth rate is the annualized percentage rate of growth that a particular stock&#39;s dividend undergoes over five years of time |  [optional]
**floatingSharesOutstanding** | **Double** | Represents the number of shares outstanding less closely held shares for the period and date(s) requested |  [optional]
**grossMargin** | **Double** | Gross profit margin is the proportion of money left over from revenues after accounting for the cost of goods sold, calculated by dividing gross profit by revenues. |  [optional]
**inventoryTurnover** | **Double** | Inventory turnover is a ratio showing how many times a company has sold and replaced inventory during a given period |  [optional]
**longTermDebtToEquity** | **Double** | Long-term debt consists of loans and financial obligations lasting over one year. The Debt/Equity (D/E) Ratio is calculated by dividing a company&#39;s total liabilities lasting over one year by its shareholder equity |  [optional]
**netIncome** | **Double** | This equals to net earnings (profit) calculated as sales less cost of goods sold, selling, general and administrative expenses, operating expenses, depreciation, interest, taxes and other expenses |  [optional]
**numberOfEmployees** | **Integer** | Represents the number of employees under the company&#39;s payroll as reported by the management to the shareholders within 90 days of the fiscal year-end. |  [optional]
**payoutRatio** | **Double** | The dividend payout ratio is the ratio of the total amount of dividends paid out to shareholders relative to the net income of the company |  [optional]
**pretaxMargin** | **Double** | The pretax margin is the ratio of a company&#39;s pre-tax earnings to its total sales |  [optional]
**priceToBookRatio** | **Double** | Companies use the price-to-book ratio to compare a firm&#39;s market to book value by dividing price per share by book value per share (BVPS) . |  [optional]
**priceToCashFlowRatio** | **Double** | The price-to-cash flow ratio is a stock valuation indicator or multiple that measures the value of a stock&#39;s price relative to its operating cash flow per share. |  [optional]
**priceToEarningsRatio** | **Double** | The price-to-earnings ratio (P/E ratio) is the ratio for valuing a company that measures its current share price relative to its per-share earnings |  [optional]
**priceToSalesRatio** | **Double** | The price-to-sales ratio (P/S ratio) is a valuation ratio that compares a company&#39;s stock price to its revenues |  [optional]
**quickRatio** | **Double** | The quick ratio measures the dollar amount of liquid assets available with the company against the dollar amount of its current liabilities |  [optional]
**returnOnAssets** | **Double** | Return on net assets (RONA) is a measure of financial performance calculated as net income divided by the sum of fixed assets and net working capital |  [optional]
**returnOnEquity** | **Double** | Return on equity (ROE) is a measure of financial performance calculated as net income divided by shareholders&#39; equity |  [optional]
**returnOnInvestedCapital** | **Double** | Return on Investment (ROI) measures how well an investment is performing |  [optional]
**revenuePerShare** | **Double** | The portion of a company&#39;s revenue that is allocated to each share of common stock. |  [optional]
**salesPerEmployee** | **Double** | Revenue per employee is a ratio that is calculated as a company&#39;s total revenue divided by its current number of employees |  [optional]
**salesPerShare** | **Double** | Sales per share is a ratio that computes the total revenue earned per share over a designated period |  [optional]
**shareHolderEquity** | **Double** | Shareholder equity represents the amount of financing the company experiences through common and preferred shares |  [optional]
**threeYearAverageYield** | **Double** | Average of the dividend yield with yield calculated for each of the past three years |  [optional]
**threeYearDividendGrowthRate** | **Double** | The dividend growth rate is the annualized percentage rate of growth that a particular stock&#39;s dividend undergoes over three years of time |  [optional]
**totalAssets** | **Double** | Total amount of assets owned by entity. |  [optional]
**totalDebtToEquity** | **Double** | The Debt/Equity (D/E) Ratio is calculated by dividing a company&#39;s total liabilities by its shareholder equity |  [optional]
**totalRevenue** | **Double** | Revenue is the amount of money (in Million) that a company actually receives during a specific period, including discounts and deductions for returned merchandise. |  [optional]
**trailingTwelveMonthEarningsPerShare** | **Double** | Earnings per share over the last 12 months. |  [optional]


## Implemented Interfaces

* Serializable


