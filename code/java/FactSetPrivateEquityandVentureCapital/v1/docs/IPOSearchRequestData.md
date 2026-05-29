

# IPOSearchRequestData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | IPO transaction status filter |  [optional]
**startDate** | **LocalDate** | Start date for announcement date filter |  [optional]
**endDate** | **LocalDate** | End date for announcement date filter |  [optional]
**minSizeUsd** | **BigDecimal** | Minimum IPO size in USD |  [optional]
**maxSizeUsd** | **BigDecimal** | Maximum IPO size in USD |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
CLOSED | &quot;Closed&quot;
ANNOUNCED | &quot;Announced&quot;
POSTPONED | &quot;Postponed&quot;
CANCELLED | &quot;Cancelled&quot;
PRICED | &quot;Priced&quot;
WITHDRAWN | &quot;Withdrawn&quot;
IN_REGISTRATION | &quot;In Registration&quot;


## Implemented Interfaces

* Serializable


