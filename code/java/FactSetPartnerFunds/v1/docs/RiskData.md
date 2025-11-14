

# RiskData

Risk data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The input identifier. |  [optional]
**error** | [**InvalidIdErrorObject**](InvalidIdErrorObject.md) |  |  [optional]
**asOfDate** | **LocalDate** | Date when fund risk data was reported by vendor. |  [optional]
**riskRating** | **String** | Rating that fund company assesses to their own funds via the prospectus. |  [optional]
**riskProspectus** | **String** | A summary highlighting the key risks and investor suitability for the investment product. |  [optional]
**riskResponseInfo** | [**java.util.List&lt;RiskResponseInfo&gt;**](RiskResponseInfo.md) | Array of risk metrics by year. |  [optional]


## Implemented Interfaces

* Serializable


