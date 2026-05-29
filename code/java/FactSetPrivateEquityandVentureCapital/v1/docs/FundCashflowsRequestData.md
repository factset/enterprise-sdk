

# FundCashflowsRequestData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | List of fund entity identifiers, which can be retrieved from the /universe endpoint | 
**startDate** | **LocalDate** | Specifies the start date for the requested date range, formatted as YYYY-MM-DD. Future dates (T+1) are not accepted in this endpoint. |  [optional]
**endDate** | **LocalDate** | Specifies the end date for the requested date range, formatted as YYYY-MM-DD. Future dates (T+1) are not accepted in this endpoint. |  [optional]
**cfType** | [**CfTypeEnum**](#CfTypeEnum) | Cash flow type filter |  [optional]



## Enum: CfTypeEnum

Name | Value
---- | -----
CONTRIBUTION | &quot;CONTRIBUTION&quot;
DISTRIBUTION | &quot;DISTRIBUTION&quot;
NAV | &quot;NAV&quot;


## Implemented Interfaces

* Serializable


