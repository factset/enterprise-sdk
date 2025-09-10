

# ReturnsSnapshot


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested. |  [optional]
**oneWeek** | **Double** | The one-week return for the requested id and date. The return type is determined by including or excluding dividends through the dividendAdjust parameter. |  [optional]
**oneMonth** | **Double** | The one-month return for the requested id and date. The return type is determined by including or excluding dividends through the dividendAdjust parameter. |  [optional]
**threeMonth** | **Double** | The three-month return for the requested id and date. The return type is determined by including or excluding dividends through the dividendAdjust parameter. |  [optional]
**yearToDate** | **Double** | The year-to-date return for the requested id and date. The return type is determined by including or excluding dividends through the dividendAdjust parameter. |  [optional]
**oneYear** | **Double** | The one-year return for the requested id and date. The return type is determined by including or excluding dividends through the dividendAdjust parameter. |  [optional]
**threeYear** | **Double** | The three-year return for the requested id and date. The return type is determined by including or excluding dividends through the dividendAdjust parameter. |  [optional]
**threeYearAnnualized** | **Double** | The three-year annualized return for the requested id and date. The return type is determined by including or excluding dividends through the dividendAdjust parameter. |  [optional]
**fiveYear** | **Double** | The five-year return for the requested id and date. The return type is determined by including or excluding dividends through the dividendAdjust parameter. |  [optional]
**fiveYearAnnualized** | **Double** | The five year annualized return for the requested id and date. The return type is determined by including or excluding dividends through the dividendAdjust parameter. |  [optional]
**tenYear** | **Double** | The ten-year return for the requested id and date. The return type is determined by including or excluding dividends through the dividendAdjust parameter. |  [optional]
**tenYearAnnualized** | **Double** | The ten year annualized return for the requested id and date. The return type is determined by including or excluding dividends through the dividendAdjust parameter. |  [optional]
**date** | **LocalDate** | The date of the return in YYYY-MM-DD format. |  [optional]
**requestId** | **String** | The requested Id sent as input. |  [optional]
**sinceInceptionAnnualized** | **Double** | The average annual rate of return since the fund&#39;s inception date, calculated using compounding. This is always a total return (dividends are included) and is not affected by the dividendAdjust parameter. |  [optional]


## Implemented Interfaces

* Serializable


