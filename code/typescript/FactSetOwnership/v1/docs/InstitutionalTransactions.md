# factsetownership.InstitutionalTransactions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Identifier that was used in the request. | [optional] 
**fsymId** | **String** | FactSet Security Identifier of Fund. Identifies the security level id of the Fund requested (not-representing the underlying holding). Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. | [optional] 
**currency** | **String** | Currency code. The service will default to the funds local currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**holderName** | **String** | Returns the names of the institutions involved in the transactions that occurred between the specified start and end dates. | [optional] 
**pctOS** | **Number** | Returns position held as a percentage of total outstanding data for the holders of the security whose ownership activity matches the specified change type. | [optional] 
**pctChange** | **Number** | Returns change in position held as a percentage of total outstanding data for the holders of the security whose ownership activity matches the specified change type. | [optional] 
**posChange** | **Number** | Returns position change data for the holders of the security whose ownership activity matches the specified change type. | [optional] 
**marketVal** | **Number** | Returns market value data for the holders of the security whose ownership activity matches the specified change type. | [optional] 
**reportDate** | **String** | Returns the report date for the transactions that occurred between the specified start and end dates. | [optional] 


