

# AtmImpliedVolatilityRequest

At-the-Money Implied Volatility Request Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | Underlying Security Identifier of which can be used to return respective options chain. Only **one** security id is permitted per request.   | 
**startDate** | **String** | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. |  [optional]
**endDate** | **String** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. |  [optional]
**frequency** | **Frequency** |  |  [optional]
**exchange** | **Exchange** |  |  [optional]
**period** | **Integer** | The period for the options to calculate at the money volatility. Below are the available periods -  * No Limit - (0) * One Month - (1) * Two Months - (2) * Three Months - (3) * Four Months - (4) * Five Months - (5) * Six Months - (6) |  [optional]


## Implemented Interfaces

* Serializable


