# FactSet.SDK.FactSetFunds.Model.Prices
Fund pricing data including NAV for the requested share class

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 
**Date** | **DateTime?** | The date in YYYY-MM-DD format. | [optional] 
**Currency** | **string** | ISO3 Currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)&#39; | [optional] 
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**Price** | **double?** | The NAV for the requested share class. NOTE - FactSet Mutual Funds does not use seven-day yields to price money market funds. | [optional] 
**FirstNAVDate** | **DateTime?** | Returns the earliest date on which a price was available for the specified share class.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

