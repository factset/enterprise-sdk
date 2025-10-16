

# FundamentalsPITData

Represents a single value for a fundamental metric as it was known during a specific Point-in-Time window for a given security and fiscal period.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier provided in the input request that corresponds to this data point. |  [optional]
**fsymId** | **String** | FactSet Regional Security Identifier representing the specific data series for the requested &#x60;requestId&#x60;. |  [optional]
**metric** | **String** | The identifier of the fundamental metric being reported (e.g., &#x60;FF_SALES&#x60;). |  [optional]
**periodicity** | **String** | Periodicity of this data point (e.g., &#x60;QTR&#x60;, &#x60;ANN&#x60;). |  [optional]
**fiscalPeriod** | **Integer** | Integer representing the fiscal period. For &#x60;QTR&#x60; periodicity, possible values are 1, 2, 3, or 4. For &#x60;SEMI&#x60; periodicity, possible values are 1 or 2. |  [optional]
**fiscalYear** | **Integer** | Fiscal year of the reported period, expressed in a YYYY format. |  [optional]
**fiscalEndDate** | **LocalDate** | The official ending date of the fiscal period (YYYY-MM-DD). |  [optional]
**currency** | **String** | Currency of the reported &#x60;value&#x60;, expressed as a 3-character ISO 4217 code. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). |  [optional]
**value** | [**FundamentalValue**](FundamentalValue.md) |  |  [optional]
**updateType** | [**UpdateTypeEnum**](#UpdateTypeEnum) | Indicates the status of the source filing when this data point was recorded (&#x60;Preliminary&#x60; or &#x60;Final&#x60;). |  [optional]
**pitStart** | **OffsetDateTime** | Start of Point-in-Time (inclusive, in UTC) during which this value was current. Format: ISO 8601 &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. If frequency is weekly (w) or monthly (m), this will be null.  |  [optional]
**pitEnd** | **OffsetDateTime** | End of Point-in-Time (inclusive, in UTC). Format: ISO 8601 &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. If value is &#x60;null&#x60; -&gt; this value is current (latest active snapshot). If frequency is weekly or monthly, and this is an end-of-week or end-of-month snapshot -&gt; &#x60;pitStart&#x60; will be null.  |  [optional]



## Enum: UpdateTypeEnum

Name | Value
---- | -----
PRELIMINARY | &quot;Preliminary&quot;
FINAL | &quot;Final&quot;


## Implemented Interfaces

* Serializable


