# factsetownership.ShortInterest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier of Security. Identifies the security level id requested. Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. | [optional] 
**requestId** | **String** | Security Identifier that was used in the request. | [optional] 
**shortInterestShares** | **Number** | The total number of shares of a stock that have been sold short and not yet covered. A large increase or decrease in a stock&#39;s short interest from the previous month is often considered a good indicator of investor sentiment. | [optional] 
**daysToCover** | **Number** | Defines how many days, given the stock&#39;s average trading volume, that it would take short sellers to cover their positions. The higher the ratio, the longer it would take to buy back the borrowed shares. | [optional] 
**shortInterestPct** | **Number** | The number of shares currently outstanding for the stock. | [optional] 
**shortInterestFloatPct** | **Number** | Number of shares outstanding (See Shares O/S) less closely held shares, which are those positions held by Insider/Stake Holders | [optional] 
**asOfDate** | **Date** | Date on which the specified data or information is accurate or relevant. | [optional] 


