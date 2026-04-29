# FactSet.SDK.FactSetFunds.Model.ReturnsRangeAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**Return** | **double?** | The Return calculated between two dates. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**ReturnStartDate** | **DateTime?** | The start date of the return in YYYY-MM-DD format. *NOTE - the &#x60;startDate&#x60; cannot be less than the &#x60;priceFirstDate&#x60; which can be accessed in the /summary endpoint. | [optional] 
**ReturnEndDate** | **DateTime?** | The end date of the return in YYYY-MM-DD format. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

