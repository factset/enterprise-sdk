

# UnitsUnits

Represents the scale for the data, expresses the quantity.  Exception: units = A (Actual) in combination with metric = RAT (Ratio) should be treated similarly as units = RATIO; the value is returned in the same format. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | [**ValueEnum**](#ValueEnum) |  |  [optional]



## Enum: ValueEnum

Name | Value
---- | -----
A_ACTUAL_ | &quot;A (Actual)&quot;
B_BILLIONS_ | &quot;B (Billions)&quot;
M_MILLIONS_ | &quot;M (Millions)&quot;
PCT_PERCENT_ | &quot;PCT (Percent)&quot;
RATIO_RATIO_ | &quot;RATIO (Ratio)&quot;
T_THOUSANDS_ | &quot;T (Thousands)&quot;


## Implemented Interfaces

* Serializable


