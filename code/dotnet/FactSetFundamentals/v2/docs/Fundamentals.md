# FactSet.SDK.FactSetFundamentals.Model.Fundamentals
Factset Fundamental Response item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Identifier that was used for the request. | [optional] 
**Error** | [**CompanyReportErrorObject**](CompanyReportErrorObject.md) |  | [optional] 
**FsymId** | **string** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**AsOfDate** | **DateTime?** | Date on which the specified fundamentals data or information is accurate or relevant. | [optional] 
**Currency** | **string** | Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**PerShare** | [**PerShare**](PerShare.md) |  | [optional] 
**Ratios** | [**Ratios**](Ratios.md) |  | [optional] 
**Dividend** | [**Dividend**](Dividend.md) |  | [optional] 
**EnterpriseValue** | **double?** | Enterprise Value (EV) is the measure of a company&#39;s total value for the period and date(s) requested in local currency by default | [optional] 
**FiveYearAverageYield** | **double?** | Average of the dividend yield with yield calculated for each of the past five years | [optional] 
**FiveYearDividendGrowthRate** | **double?** | The dividend growth rate is the annualized percentage rate of growth that a particular stock&#39;s dividend undergoes over five years of time | [optional] 
**FloatingSharesOutstanding** | **double?** | Represents the number of shares outstanding less closely held shares for the period and date(s) requested | [optional] 
**NetIncome** | **double?** | This equals to net earnings (profit) calculated as sales less cost of goods sold, selling, general and administrative expenses, operating expenses, depreciation, interest, taxes and other expenses | [optional] 
**NumberOfEmployees** | **int?** | Represents the number of employees under the company&#39;s payroll as reported by the management to the shareholders within 90 days of the fiscal year-end. | [optional] 
**SalesPerEmployee** | **double?** | Revenue per employee is a ratio that is calculated as a company&#39;s total revenue divided by its current number of employees | [optional] 
**ShareHolderEquity** | **double?** | Shareholder equity represents the amount of financing the company experiences through common and preferred shares | [optional] 
**ThreeYearAverageYield** | **double?** | Average of the dividend yield with yield calculated for each of the past three years | [optional] 
**ThreeYearDividendGrowthRate** | **double?** | The dividend growth rate is the annualized percentage rate of growth that a particular stock&#39;s dividend undergoes over three years of time | [optional] 
**TotalAssets** | **double?** | Total amount of assets owned by entity. | [optional] 
**TotalRevenue** | **double?** | Revenue is the amount of money (in Million) that a company actually receives during a specific period, including discounts and deductions for returned merchandise. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

