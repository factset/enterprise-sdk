

# PostOptionByClassListDataItemsInstrumentExercise

Exercise data of the instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**right** | [**RightEnum**](#RightEnum) | Exercise right of the option. | Value | Description | | --- | --- | | put | A put option gives the owner the right, but not the obligation, to sell an asset at a specified price within a specific time period. | | call | A call option gives the owner the right, but not the obligation, to buy an asset at a specified price within a specific time period. |   |  [optional]
**style** | [**StyleEnum**](#StyleEnum) | Exercise style of the option. | Value | Description | | --- | --- | | american | An American-style option can be exercised anytime during its life. | | european | A European-style option can be exercised at the end of its life. |   |  [optional]



## Enum: RightEnum

Name | Value
---- | -----
PUT | &quot;put&quot;
CALL | &quot;call&quot;



## Enum: StyleEnum

Name | Value
---- | -----
AMERICAN | &quot;american&quot;
EUROPEAN | &quot;european&quot;


## Implemented Interfaces

* Serializable


