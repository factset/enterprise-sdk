# FactSet.SDK.FactSetFunds.Model.ReturnsRange

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested. | [optional] 
**Return** | **double** | The Return calculated between two dates. The return type is determined by including or excluding dividends through the dividendAdjust parameter. | [optional] 
**ReturnStartDate** | **string** | The start date of the return in YYYY-MM-DD format. *NOTE - the startDate cannot be less than the &#x60;priceFirstDate&#x60; which can be accessed in the /summary endpoint. | [optional] 
**ReturnEndDate** | **string** | The end date of the return in YYYY-MM-DD format. The start date of the return in YYYY-MM-DD format. *NOTE - the startDate cannot be less than the &#x60;priceFirstDate&#x60; which can be accessed in the /summary endpoint. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

