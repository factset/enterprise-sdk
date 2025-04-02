# factsetownership.InsiderTransactions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Identifier that was used in the request. | [optional] 
**fsymId** | **String** | FactSet Security Identifier of Fund. Identifies the security level id of the Fund requested (not-representing the underlying holding). Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. | [optional] 
**currency** | **String** | Currency code. The service will default to the funds local currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**holderName** | **String** | Returns the names of the insiders involved in the transactions that occurred between the specified start and end dates. | [optional] 
**holderTitle** | **String** | Returns the titles of the insiders involved in the transactions that occurred between the specified start and end dates. | [optional] 
**holderId** | **String** | Returns the holder IDs for the insiders involved in the transactions that occurred between the specified start and end dates. | [optional] 
**shares** | **Number** | Returns the transaction shares for the transactions that occurred between the specified start and end dates. | [optional] 
**price** | **Number** | Returns the transaction prices for the transactions that occurred between the specified start and end dates. | [optional] 
**netValueChange** | **Number** | Returns the transaction values for the transactions that occurred between the specified start and end dates. | [optional] 
**filingDate** | **String** | Returns the dates on which the transactions that occurred between the specified start and end dates were processed. | [optional] 
**isDerivative** | **Boolean** | Returns a Derivative/Non-Derivative flag for the transactions that occurred between the specified start and end dates. Returns true for Derivative and false for Non-Derivative. | [optional] 
**isDirect** | **Boolean** | Returns a direct/indirect flag for the transactions that occurred between the specified start and end dates. | [optional] 
**tradeType** | **String** | Returns an acquisition/disposition flag for the transactions that occurred between the specified start and end dates. | [optional] 
**formType** | **String** | Returns the form types for the transactions that occurred between the specified start and end dates. | [optional] 
**transactionDate** | **String** | Returns the transaction dates for the transactions that occurred between the specified start and end dates. | [optional] 
**sharesOwned** | **Number** | Returns the shares owned data for the transactions that occurred between the specified start and end dates. | [optional] 
**secRule10b51** | **Boolean** | Returns rule 10b5-1 flags for the insiders involved in the transactions that occurred between the specified start and end dates. | [optional] 


