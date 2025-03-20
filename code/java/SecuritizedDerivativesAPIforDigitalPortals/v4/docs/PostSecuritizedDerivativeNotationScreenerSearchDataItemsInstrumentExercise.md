

# PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentExercise

Exercise data of the securitized derivative.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**right** | [**RightEnum**](#RightEnum) | Exercise right. | Value | Description | | --- | --- | | put | A put option gives buyer the right, but not the obligation, to sell an asset at a specified price within a specific time period. Put is synonymous to short or bear and is used in a broader sense for products that make profits from falling underlying levels. | | call | A call option gives buyer the right, but not the obligation, to buy an asset at a specified price within a specific time period. Call is synonymous to long or bull and is used in a broader sense for products that make profits from rising underlying levels. |   |  [optional]
**style** | [**StyleEnum**](#StyleEnum) | Exercise style. | Value | Description | | --- | --- | | american | An American-style securitized derivative can be exercised anytime during its life. | | european | An European-style securitized derivative can be exercised at maturity only. | | bermudan | A Bermudan-style securitized derivative can be exercised only on predetermined dates . |   |  [optional]



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
BERMUDAN | &quot;bermudan&quot;


## Implemented Interfaces

* Serializable


