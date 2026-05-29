# factsetprivateequityandventurecapital.FundCashflowsRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | List of fund entity identifiers, which can be retrieved from the /universe endpoint | 
**startDate** | **Date** | Specifies the start date for the requested date range, formatted as YYYY-MM-DD. Future dates (T+1) are not accepted in this endpoint. | [optional] 
**endDate** | **Date** | Specifies the end date for the requested date range, formatted as YYYY-MM-DD. Future dates (T+1) are not accepted in this endpoint. | [optional] 
**cfType** | **String** | Cash flow type filter | [optional] 



## Enum: CfTypeEnum


* `CONTRIBUTION` (value: `"CONTRIBUTION"`)

* `DISTRIBUTION` (value: `"DISTRIBUTION"`)

* `NAV` (value: `"NAV"`)




