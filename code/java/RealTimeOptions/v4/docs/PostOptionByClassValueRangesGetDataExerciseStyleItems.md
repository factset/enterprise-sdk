

# PostOptionByClassValueRangesGetDataExerciseStyleItems

A list of objects. For semantical context see the description of the parent array.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | [**ValueEnum**](#ValueEnum) | undefined | Value | Description | | --- | --- | | american | An American-style option can be exercised anytime during its life. | | european | A European-style option can be exercised at the end of its life. |   |  [optional]
**count** | **BigDecimal** | Number of notations. |  [optional]



## Enum: ValueEnum

Name | Value
---- | -----
AMERICAN | &quot;american&quot;
EUROPEAN | &quot;european&quot;


## Implemented Interfaces

* Serializable


