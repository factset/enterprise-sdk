# FactSet.SDK.FactSetFunds.Model.Returns

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested. | [optional] 
**Return** | **double?** | The Return for the requested id and date. Adjusting the frequency of the time-series does not adjust the return calculation, and simply controls the display frequency. The return type is determined by including or excluding dividends through the dividendAdjust parameter. | [optional] 
**Date** | **DateTime?** | The date of the return in YYYY-MM-DD format. | [optional] 
**Currency** | **string** | ISO3 Currency | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

