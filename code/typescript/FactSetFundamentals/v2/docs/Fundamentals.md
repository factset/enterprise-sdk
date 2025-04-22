# factsetfundamentals.Fundamentals

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Identifier that was used for the request. | [optional] 
**error** | [**CompanyReportErrorObject**](CompanyReportErrorObject.md) |  | [optional] 
**fsymId** | **String** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**asOfDate** | **Date** | Date on which the specified fundamentals data or information is accurate or relevant. | [optional] 
**currency** | **String** | Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**periodicity** | **String** | Periodicity or frequency of the fiscal periods. | [optional] 
**perShare** | [**PerShare**](PerShare.md) |  | [optional] 
**ratios** | [**Ratios**](Ratios.md) |  | [optional] 
**dividend** | [**Dividend**](Dividend.md) |  | [optional] 
**enterpriseValue** | **Number** | Enterprise Value (EV) is the measure of a company&#39;s total value for the period and date(s) requested in local currency by default | [optional] 
**fiveYearAverageYield** | **Number** | Average of the dividend yield with yield calculated for each of the past five years | [optional] 
**fiveYearDividendGrowthRate** | **Number** | The dividend growth rate is the annualized percentage rate of growth that a particular stock&#39;s dividend undergoes over five years of time | [optional] 
**floatingSharesOutstanding** | **Number** | Represents the number of shares outstanding less closely held shares for the period and date(s) requested | [optional] 
**netIncome** | **Number** | This equals to net earnings (profit) calculated as sales less cost of goods sold, selling, general and administrative expenses, operating expenses, depreciation, interest, taxes and other expenses | [optional] 
**numberOfEmployees** | **Number** | Represents the number of employees under the company&#39;s payroll as reported by the management to the shareholders within 90 days of the fiscal year-end. | [optional] 
**salesPerEmployee** | **Number** | Revenue per employee is a ratio that is calculated as a company&#39;s total revenue divided by its current number of employees | [optional] 
**shareHolderEquity** | **Number** | Shareholder equity represents the amount of financing the company experiences through common and preferred shares | [optional] 
**threeYearAverageYield** | **Number** | Average of the dividend yield with yield calculated for each of the past three years | [optional] 
**threeYearDividendGrowthRate** | **Number** | The dividend growth rate is the annualized percentage rate of growth that a particular stock&#39;s dividend undergoes over three years of time | [optional] 
**totalAssets** | **Number** | Total amount of assets owned by entity. | [optional] 
**totalRevenue** | **Number** | Revenue is the amount of money (in Million) that a company actually receives during a specific period, including discounts and deductions for returned merchandise. | [optional] 


