# factsetfunds.Prices

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested. | [optional] 
**price** | **Number** | The NAV for the requested share class. NOTE - FactSet Mutual Funds does not use seven-day yields to price money market funds. | [optional] 
**date** | **Date** | The date of the NAV in YYYY-MM-DD format. | [optional] 
**requestId** | **String** | The requested Id sent as input. | [optional] 
**currency** | **String** | ISO3 Currency | [optional] 


