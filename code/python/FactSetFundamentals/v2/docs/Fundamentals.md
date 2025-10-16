# Fundamentals

Factset Fundamentals Response item

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**error** | [**CompanyReportErrorObject**](CompanyReportErrorObject.md) |  | [optional] 
**fsym_id** | **str, none_type** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**as_of_date** | **date, none_type** | Date on which the specified fundamentals data or information is accurate or relevant. | [optional] 
**currency** | **str, none_type** | Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**periodicity** | **str, none_type** | Periodicity or frequency of the fiscal periods. | [optional] 
**per_share** | [**PerShare**](PerShare.md) |  | [optional] 
**ratios** | [**Ratios**](Ratios.md) |  | [optional] 
**dividend** | [**Dividend**](Dividend.md) |  | [optional] 
**enterprise_value** | **float, none_type** | Enterprise Value (EV) is the measure of a company&#39;s total value for the period and date(s) requested in local currency by default | [optional] 
**five_year_average_yield** | **float, none_type** | Average of the dividend yield with yield calculated for each of the past five years | [optional] 
**five_year_dividend_growth_rate** | **float, none_type** | The dividend growth rate is the annualized percentage rate of growth that a particular stock&#39;s dividend undergoes over five years of time | [optional] 
**floating_shares_outstanding** | **float, none_type** | Represents the number of shares outstanding less closely held shares for the period and date(s) requested | [optional] 
**net_income** | **float, none_type** | This equals to net earnings (profit) calculated as sales less cost of goods sold, selling, general and administrative expenses, operating expenses, depreciation, interest, taxes and other expenses | [optional] 
**number_of_employees** | **int, none_type** |  Represents the number of employees under the company&#39;s payroll as reported by the management to the shareholders within 90 days of the fiscal year-end. | [optional] 
**sales_per_employee** | **float, none_type** | Revenue per employee is a ratio that is calculated as a company&#39;s total revenue divided by its current number of employees | [optional] 
**share_holder_equity** | **float, none_type** | Shareholder equity represents the amount of financing the company experiences through common and preferred shares | [optional] 
**three_year_average_yield** | **float, none_type** | Average of the dividend yield with yield calculated for each of the past three years | [optional] 
**three_year_dividend_growth_rate** | **float, none_type** | The dividend growth rate is the annualized percentage rate of growth that a particular stock&#39;s dividend undergoes over three years of time | [optional] 
**total_assets** | **float, none_type** | Total amount of assets owned by entity. | [optional] 
**total_revenue** | **float, none_type** | Revenue is the amount of money (in Million) that a company actually receives during a specific period, including discounts and deductions for returned merchandise. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


