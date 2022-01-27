# factsetprices.ReturnsSnapshot

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**date** | **Date** | Specific reference date for the period expressed in YYYY-MM-DD format. | [optional] 
**currency** | **String** | Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**requestId** | **String** | Identifier that was used for the request. | [optional] 
**oneDay** | **Number** | Returns the price performance of the security for the previous one day from the given date. | [optional] 
**oneMonth** | **Number** | Returns the price performance of the security for the past one month. | [optional] 
**threeMonth** | **Number** | Returns the price performance of the security for the past three months. | [optional] 
**sixMonth** | **Number** | Returns the price performance of the security for the past six months. | [optional] 
**nineMonth** | **Number** | Returns the price performance of the security for the past nine months. | [optional] 
**oneYear** | **Number** | Returns the price performance of the security for the past one year. | [optional] 
**quarterToDate** | **Number** | Returns the price performance of the security from the previous calendar quarter end to the given date. | [optional] 
**weekToDate** | **Number** | Returns the price performance of the security from the previous week (usually Friday) to the given date. | [optional] 
**monthToDate** | **Number** | Returns the price performance of the security from the previous month-end to the given date. | [optional] 
**yearToDate** | **Number** | Returns the price performance of the security from the previous calendar year-end to the given date. | [optional] 
**twoYearAnnualized** | **Number** | Returns the annualized compound total return for two years. | [optional] 
**threeYearAnnualized** | **Number** | Returns the annualized compound total return for three years. | [optional] 
**fiveYearAnnualized** | **Number** | Returns the annualized compound total return for five years. | [optional] 
**tenYearAnnualized** | **Number** | Returns the annualized compound total return for ten years. | [optional] 
**twentyYearAnnualized** | **Number** | Returns the annualized compound total return for twenty years. | [optional] 
**thirtyYearAnnualized** | **Number** | Returns the annualized compound total return for thirty years. | [optional] 
**ipoToDateAnnualized** | **Number** | Returns the annualized compound total return from the ipo date. The calculation uses the closing price as of the IPO date, and not the IPO price itself. | [optional] 
**dividendAdjust** | **String** | Controls the dividend reinvestment for the returns calculation. Dividends will be reinvested on the date the dividends go ex (when the dividends belong to the seller rather than the buyer). Visit [OA 8748](https://my.apps.factset.com/oa/pages/8748) for calculation methodology.   * **PRICE** &#x3D; Price Change - Dividends Excluded.   * **EXDATE** &#x3D; Simple Return - Dividends Received on exdate but not reinvested. Dividends accumulated throughout the specified period are added to the price at the end of the period.   * **EXDATE_C** &#x3D; Compound Return - Dividends reinvested on exdate. Dividends accumulated throughout the specified period are used to buy more shares of stock in the company.  | [optional] 


