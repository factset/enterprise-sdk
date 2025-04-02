# FactSet.SDK.FactSetOwnership.Model.InsiderTransactions
insiderTransactions response object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Identifier that was used in the request. | [optional] 
**FsymId** | **string** | FactSet Security Identifier of Fund. Identifies the security level id of the Fund requested (not-representing the underlying holding). Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. | [optional] 
**Currency** | **string** | Currency code. The service will default to the funds local currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**HolderName** | **string** | Returns the names of the insiders involved in the transactions that occurred between the specified start and end dates. | [optional] 
**HolderTitle** | **string** | Returns the titles of the insiders involved in the transactions that occurred between the specified start and end dates. | [optional] 
**HolderId** | **string** | Returns the holder IDs for the insiders involved in the transactions that occurred between the specified start and end dates. | [optional] 
**Shares** | **decimal?** | Returns the transaction shares for the transactions that occurred between the specified start and end dates. | [optional] 
**Price** | **double?** | Returns the transaction prices for the transactions that occurred between the specified start and end dates. | [optional] 
**NetValueChange** | **double?** | Returns the transaction values for the transactions that occurred between the specified start and end dates. | [optional] 
**FilingDate** | **string** | Returns the dates on which the transactions that occurred between the specified start and end dates were processed. | [optional] 
**IsDerivative** | **bool?** | Returns a Derivative/Non-Derivative flag for the transactions that occurred between the specified start and end dates. Returns true for Derivative and false for Non-Derivative. | [optional] 
**IsDirect** | **bool?** | Returns a direct/indirect flag for the transactions that occurred between the specified start and end dates. | [optional] 
**TradeType** | **string** | Returns an acquisition/disposition flag for the transactions that occurred between the specified start and end dates. | [optional] 
**FormType** | **string** | Returns the form types for the transactions that occurred between the specified start and end dates. | [optional] 
**TransactionDate** | **string** | Returns the transaction dates for the transactions that occurred between the specified start and end dates. | [optional] 
**SharesOwned** | **decimal?** | Returns the shares owned data for the transactions that occurred between the specified start and end dates. | [optional] 
**SecRule10b51** | **bool?** | Returns rule 10b5-1 flags for the insiders involved in the transactions that occurred between the specified start and end dates. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

