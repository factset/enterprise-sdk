

# InlineResponse2006DataGearing

Gearing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isInverseFund** | **Boolean** | Flags ETPs that deliver short exposure to an index, including leveraged short exposure. This data is available for all the regions. |  [optional]
**leverage** | [**InlineResponse2006DataGearingLeverage**](InlineResponse2006DataGearingLeverage.md) |  |  [optional]
**exposureResetPeriod** | [**ExposureResetPeriodEnum**](#ExposureResetPeriodEnum) | Exposure reset frequency of leveraged and inverse ETPs, text and standardized value available. This data is available for all the regions. |  [optional]



## Enum: ExposureResetPeriodEnum

Name | Value
---- | -----
DAILY | &quot;Daily&quot;
VARIABLE | &quot;Variable&quot;
NONE | &quot;None&quot;
MONTHLY | &quot;Monthly&quot;
QUARTERLY | &quot;Quarterly&quot;


## Implemented Interfaces

* Serializable


