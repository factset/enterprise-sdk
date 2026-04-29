# factsetfunds.ReturnsSnapshot

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**requestId** | **String** | The requested Id sent as input. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**date** | **Date** | The date of the return in YYYY-MM-DD format. | [optional] 
**oneWeek** | **Number** | The one-week return for the requested ID and date. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**oneMonth** | **Number** | The one-month return for the requested ID and date. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**threeMonth** | **Number** | The three-month return for the requested ID and date. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**yearToDate** | **Number** | The year-to-date return for the requested ID and date. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**oneYear** | **Number** | The one-year return for the requested ID and date. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**threeYear** | **Number** | The three-year return for the requested ID and date. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**threeYearAnnualized** | **Number** | The three-year annualized return for the requested ID and date. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**fiveYear** | **Number** | The five-year return for the requested ID and date. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**fiveYearAnnualized** | **Number** | The five year annualized return for the requested ID and date. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**tenYear** | **Number** | The ten-year return for the requested ID and date. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**tenYearAnnualized** | **Number** | The ten year annualized return for the requested ID and date. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**sinceInceptionAnnualized** | **Number** | The average annual rate of return since the fund&#39;s inception date, calculated using compounding. This is always a total return (dividends are included) and is not affected by the &#x60;dividendAdjust&#x60; parameter. | [optional] 


