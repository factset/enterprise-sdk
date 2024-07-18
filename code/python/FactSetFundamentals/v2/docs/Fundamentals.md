# Fundamentals

Factset Fundamental Response item

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**error** | [**CompanyReportErrorObject**](CompanyReportErrorObject.md) |  | [optional] 
**fsym_id** | **str, none_type** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**as_of_date** | **date, none_type** | Date on which the specified fundamentals data or information is accurate or relevant. | [optional] 
**currency** | **str, none_type** | Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**asset_turnover_ratio** | **float, none_type** | The asset turnover ratio measures the value of a company&#39;s sales or revenues relative to the value of its assets | [optional] 
**book_value_per_share** | **float, none_type** | Book value per common share is a formula used to calculate the per share value of a company based on common shareholders&#39; equity in the company | [optional] 
**cash_flow_per_share** | **float, none_type** | Cash flow per share is calculated as a ratio, indicating the amount of cash a business generates based on a company&#39;s net income with the costs of depreciation and amortization added back | [optional] 
**cash_per_share** | **float, none_type** | Cash Per Share of Security | [optional] 
**current_ratio** | **float, none_type** | The current ratio is a liquidity ratio that measures a company&#39;s ability to pay short-term and long-term obligations. The ratio is calculated by comparing current assets to current liabilities | [optional] 
**dividend** | [**Dividend**](Dividend.md) |  | [optional] 
**earnings_per_share** | **float, none_type** | Earnings per share (EPS) is the portion of a company&#39;s profit allocated to each share of common stock | [optional] 
**ebit_margin** | **float, none_type** | EBIT margin is an assessment of a firm&#39;s operating profitability as a percentage of its total revenue. It is equal to earnings before interest and tax (EBIT) divided by total revenue | [optional] 
**ebitda_margin** | **float, none_type** | EBITDA margin is an assessment of a firm&#39;s operating profitability as a percentage of its total revenue. It is equal to earnings before interest, tax, depreciation and amortization (EBITDA) divided by total revenue | [optional] 
**enterprise_value** | **float, none_type** | Enterprise Value (EV) is the measure of a company&#39;s total value for the period and date(s) requested in local currency by default | [optional] 
**five_year_average_yield** | **float, none_type** | Average of the dividend yield with yield calculated for each of the past five years | [optional] 
**five_year_dividend_growth_rate** | **float, none_type** | The dividend growth rate is the annualized percentage rate of growth that a particular stock&#39;s dividend undergoes over five years of time | [optional] 
**floating_shares_outstanding** | **float, none_type** | Represents the number of shares outstanding less closely held shares for the period and date(s) requested | [optional] 
**gross_margin** | **float, none_type** | Gross profit margin is the proportion of money left over from revenues after accounting for the cost of goods sold, calculated by dividing gross profit by revenues. | [optional] 
**inventory_turnover** | **float, none_type** | Inventory turnover is a ratio showing how many times a company has sold and replaced inventory during a given period | [optional] 
**long_term_debt_to_equity** | **float, none_type** | Long-term debt consists of loans and financial obligations lasting over one year. The Debt/Equity (D/E) Ratio is calculated by dividing a company&#39;s total liabilities lasting over one year by its shareholder equity | [optional] 
**net_income** | **float, none_type** | This equals to net earnings (profit) calculated as sales less cost of goods sold, selling, general and administrative expenses, operating expenses, depreciation, interest, taxes and other expenses | [optional] 
**number_of_employees** | **int, none_type** | Represents the number of employees under the company&#39;s payroll as reported by the management to the shareholders within 90 days of the fiscal year-end. | [optional] 
**payout_ratio** | **float, none_type** | The dividend payout ratio is the ratio of the total amount of dividends paid out to shareholders relative to the net income of the company | [optional] 
**pretax_margin** | **float, none_type** | The pretax margin is the ratio of a company&#39;s pre-tax earnings to its total sales | [optional] 
**price_to_book_ratio** | **float, none_type** | Companies use the price-to-book ratio to compare a firm&#39;s market to book value by dividing price per share by book value per share (BVPS) . | [optional] 
**price_to_cash_flow_ratio** | **float, none_type** | The price-to-cash flow ratio is a stock valuation indicator or multiple that measures the value of a stock&#39;s price relative to its operating cash flow per share. | [optional] 
**price_to_earnings_ratio** | **float, none_type** | The price-to-earnings ratio (P/E ratio) is the ratio for valuing a company that measures its current share price relative to its per-share earnings | [optional] 
**price_to_sales_ratio** | **float, none_type** | The price-to-sales ratio (P/S ratio) is a valuation ratio that compares a company&#39;s stock price to its revenues | [optional] 
**quick_ratio** | **float, none_type** | The quick ratio measures the dollar amount of liquid assets available with the company against the dollar amount of its current liabilities | [optional] 
**return_on_assets** | **float, none_type** | Return on net assets (RONA) is a measure of financial performance calculated as net income divided by the sum of fixed assets and net working capital | [optional] 
**return_on_equity** | **float, none_type** | Return on equity (ROE) is a measure of financial performance calculated as net income divided by shareholders&#39; equity | [optional] 
**return_on_invested_capital** | **float, none_type** | Return on Investment (ROI) measures how well an investment is performing | [optional] 
**revenue_per_share** | **float, none_type** | The portion of a company&#39;s revenue that is allocated to each share of common stock. | [optional] 
**sales_per_employee** | **float, none_type** | Revenue per employee is a ratio that is calculated as a company&#39;s total revenue divided by its current number of employees | [optional] 
**sales_per_share** | **float, none_type** | Sales per share is a ratio that computes the total revenue earned per share over a designated period | [optional] 
**share_holder_equity** | **float, none_type** | Shareholder equity represents the amount of financing the company experiences through common and preferred shares | [optional] 
**three_year_average_yield** | **float, none_type** | Average of the dividend yield with yield calculated for each of the past three years | [optional] 
**three_year_dividend_growth_rate** | **float, none_type** | The dividend growth rate is the annualized percentage rate of growth that a particular stock&#39;s dividend undergoes over three years of time | [optional] 
**total_assets** | **float, none_type** | Total amount of assets owned by entity. | [optional] 
**total_debt_to_equity** | **float, none_type** | The Debt/Equity (D/E) Ratio is calculated by dividing a company&#39;s total liabilities by its shareholder equity | [optional] 
**total_revenue** | **float, none_type** | Revenue is the amount of money (in Million) that a company actually receives during a specific period, including discounts and deductions for returned merchandise. | [optional] 
**trailing_twelve_month_earnings_per_share** | **float, none_type** | Earnings per share over the last 12 months. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


