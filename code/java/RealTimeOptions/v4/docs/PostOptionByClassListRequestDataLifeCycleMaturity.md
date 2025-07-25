

# PostOptionByClassListRequestDataLifeCycleMaturity

Parameters related to the maturity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**PostOptionByClassListRequestDataLifeCycleMaturityDate**](PostOptionByClassListRequestDataLifeCycleMaturityDate.md) |  |  [optional]
**interval** | [**java.util.Set&lt;IntervalEnum&gt;**](#java.util.Set&lt;IntervalEnum&gt;) | Restricts the maturity interval of the option. | Value | Description | | --- | --- | | monthly | Monthly | | weekly | Weekly | | daily | Daily | | mixed | Mixed |   |  [optional]



## Enum: java.util.Set&lt;IntervalEnum&gt;

Name | Value
---- | -----
MONTHLY | &quot;monthly&quot;
WEEKLY | &quot;weekly&quot;
DAILY | &quot;daily&quot;
MIXED | &quot;mixed&quot;


## Implemented Interfaces

* Serializable


