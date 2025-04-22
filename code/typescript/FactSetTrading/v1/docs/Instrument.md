# factsettrading.Instrument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **String** | Ticker symbol | 
**securityType** | **String** | Indicates type of security. | [optional] 
**cfiCode** | **String** | Classification of Financial Instruments. Indicates the type of security using ISO 0962 standard. | [optional] 
**securityExchange** | **String** | Market used to help identify a security. | [optional] 
**issuer** | **String** | Company name of security issuer. | [optional] 
**securityDescription** | **String** | Security Description | [optional] 
**maturityMonthYear** | **String** | Month and Year of the maturity. | [optional] 
**maturityDay** | **String** | Day of month used in conjunction with maturityMonthYear to specify the maturity date | [optional] 
**putOrCall** | **String** | Indicates whether an Option is for a put or call. | [optional] 
**underlyingSecurityType** | **String** | Underlying security’s SecurityType. | [optional] 



## Enum: PutOrCallEnum


* `put` (value: `"put"`)

* `call` (value: `"call"`)




