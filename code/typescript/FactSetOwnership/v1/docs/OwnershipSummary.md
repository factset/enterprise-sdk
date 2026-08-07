# factsetownership.OwnershipSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Identifier that was used in the request. | [optional] 
**fsymId** | **String** | FactSet Security Identifier of Fund. Identifies the security level id of the Fund requested (not-representing the underlying holding). Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. | [optional] 
**sharesOutstanding** | **Number** | Number of shares outstanding for the security. | [optional] 
**percentTotalOutstanding** | **Number** | Position held as a percentage of the total outstanding shares of the security. | [optional] 
**percentInstitutionalOutstanding** | **Number** | Position held by institutional holders as a percentage of total outstanding shares. | [optional] 
**percentTopTenInstitutional** | **Number** | Position held by the top 10 institutional holders as a percentage of total outstanding shares. | [optional] 
**percentInsiderOutstanding** | **Number** | Position held by insiders as a percentage of total outstanding shares. | [optional] 
**asOfDate** | **Date** | Date as of which the ownership data is current. | [optional] 


