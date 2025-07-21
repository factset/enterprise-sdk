

# FinancialsRequestBody

Financials request body elements

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | Security or Entity identifiers.  | 
**metrics** | **java.util.List&lt;String&gt;** | Private Company Financials Metrics.  | 
**startDate** | **LocalDate** | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**endDate** | **LocalDate** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  |  [optional]


## Implemented Interfaces

* Serializable


