# DistCurrent

Current distribution information including dividends, capital gains, yields, and distribution frequency

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**distribution_type** | [**DistCurrentType**](DistCurrentType.md) |  | 
**fsym_id** | **str, none_type** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**date** | **date, none_type** | The date of the distribution in YYYY-MM-DD format. | [optional] 
**distribution_frequency** | **str, none_type** | Returns the distribution frequency. | [optional] 
**dividend_ex_date** | **date, none_type** | Returns the ex-dividend date of the most recently reported dividend. Data is currently only and available only for ETFs. | [optional] 
**currency** | **str, none_type** | ISO3 Currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)&#39; | [optional] 
**total_distributions** | **float, none_type** | Total Distributions. | [optional] 
**return_of_capital** | **float, none_type** | Return on Capital. | [optional] 
**qualified_dividends** | **float, none_type** | Qualified Dividends. | [optional] 
**non_qualified_dividends** | **float, none_type** | Non-Qualified Dividends. | [optional] 
**daily_accrued_dividends** | **float, none_type** | Daily Accrued Dividends. | [optional] 
**short_term_capital_gains** | **float, none_type** | Short-Term Capital Gains. | [optional] 
**long_term_capital_gains** | **float, none_type** | Long-Term Capital Gains. | [optional] 
**indicated_annual_dividend** | **float, none_type** | Indicated annual dividend. | [optional] 
**last12_month_distribution_yield** | **float, none_type** | Distribution yield for the last twelve months. | [optional] 
**first_distribution_date** | **date, none_type** | The date of the funds first distribution in YYYY-MM-DD format. | [optional] 
**dividend_type** | **str, none_type** | Returns the dividend treatment for the specified share class (distributes/capitalizes). Data is returned for both Mutual Funds and ETFs. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


