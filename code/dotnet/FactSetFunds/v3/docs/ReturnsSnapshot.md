# FactSet.SDK.FactSetFunds.Model.ReturnsSnapshot
Snapshot of fund returns across multiple time periods including one week, one month, YTD, and annualized returns

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**Date** | **DateTime?** | The date of the return in YYYY-MM-DD format. | [optional] 
**OneWeek** | **double?** | The one-week return for the requested ID and date. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**OneMonth** | **double?** | The one-month return for the requested ID and date. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**ThreeMonth** | **double?** | The three-month return for the requested ID and date. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**YearToDate** | **double?** | The year-to-date return for the requested ID and date. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**OneYear** | **double?** | The one-year return for the requested ID and date. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**ThreeYear** | **double?** | The three-year return for the requested ID and date. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**ThreeYearAnnualized** | **double?** | The three-year annualized return for the requested ID and date. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**FiveYear** | **double?** | The five-year return for the requested ID and date. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**FiveYearAnnualized** | **double?** | The five year annualized return for the requested ID and date. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**TenYear** | **double?** | The ten-year return for the requested ID and date. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**TenYearAnnualized** | **double?** | The ten year annualized return for the requested ID and date. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**SinceInceptionAnnualized** | **double?** | The average annual rate of return since the fund&#39;s inception date, calculated using compounding. This is always a total return (dividends are included) and is not affected by the &#x60;dividendAdjust&#x60; parameter. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

