# ReturnsSnapshot


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**date** | **date, none_type** | Specific reference date for the period expressed in YYYY-MM-DD format. | [optional] 
**currency** | **str, none_type** | Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**one_day** | **float, none_type** | Returns the price performance of the security for the previous one day from the given date. | [optional] 
**one_month** | **float, none_type** | Returns the price performance of the security for the past one month. | [optional] 
**three_month** | **float, none_type** | Returns the price performance of the security for the past three months. | [optional] 
**six_month** | **float, none_type** | Returns the price performance of the security for the past six months. | [optional] 
**nine_month** | **float, none_type** | Returns the price performance of the security for the past nine months. | [optional] 
**one_year** | **float, none_type** | Returns the price performance of the security for the past one year. | [optional] 
**quarter_to_date** | **float, none_type** | Returns the price performance of the security from the previous calendar quarter end to the given date. | [optional] 
**week_to_date** | **float, none_type** | Returns the price performance of the security from the previous week (usually Friday) to the given date. | [optional] 
**month_to_date** | **float, none_type** | Returns the price performance of the security from the previous month-end to the given date. | [optional] 
**year_to_date** | **float, none_type** | Returns the price performance of the security from the previous calendar year-end to the given date. | [optional] 
**two_year_annualized** | **float, none_type** | Returns the annualized compound total return for two years. | [optional] 
**three_year_annualized** | **float, none_type** | Returns the annualized compound total return for three years. | [optional] 
**five_year_annualized** | **float, none_type** | Returns the annualized compound total return for five years. | [optional] 
**ten_year_annualized** | **float, none_type** | Returns the annualized compound total return for ten years. | [optional] 
**twenty_year_annualized** | **float, none_type** | Returns the annualized compound total return for twenty years. | [optional] 
**thirty_year_annualized** | **float, none_type** | Returns the annualized compound total return for thirty years. | [optional] 
**ipo_to_date_annualized** | **float, none_type** | Returns the annualized compound total return from the ipo date. The calculation uses the closing price as of the IPO date, and not the IPO price itself. | [optional] 
**dividend_adjust** | **str, none_type** | Controls the dividend reinvestment for the returns calculation. Dividends will be reinvested on the date the dividends go ex (when the dividends belong to the seller rather than the buyer). Visit [OA 8748](https://my.apps.factset.com/oa/pages/8748) for calculation methodology.   * **PRICE** &#x3D; Price Change - Dividends Excluded.   * **EXDATE** &#x3D; Simple Return - Dividends Received on exdate but not reinvested. Dividends accumulated throughout the specified period are added to the price at the end of the period.   * **EXDATE_C** &#x3D; Compound Return - Dividends reinvested on exdate. Dividends accumulated throughout the specified period are used to buy more shares of stock in the company.  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


