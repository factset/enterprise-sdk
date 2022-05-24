

# FIJobSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asOfDate** | **String** | As of date | 
**partialDurationMonths** | **java.util.List&lt;Integer&gt;** | Partial duration months |  [optional]
**callMethod** | [**CallMethodEnum**](#CallMethodEnum) | Call Method |  [optional]
**settlement** | **String** | Settlement Date |  [optional]
**calcFromMethod** | **String** | Calculation Method.  Methods : Active Spread, Actual Spread, Actual Spread To Worst Call, OAS, Price, Yield, Yield To No Call, Act/Act Yield To No Call, Bond Equivalent Yield,  Yield To Worst Call, Discount Yield, Discount Margin, Implied Volatility, Bullet Spread, Bullet Spread To Worst Call, Pricing Matrix |  [optional]
**marketEnvironment** | [**FIMarketEnvironment**](FIMarketEnvironment.md) |  |  [optional]



## Enum: CallMethodEnum

Name | Value
---- | -----
NO_CALL | &quot;No Call&quot;
INTRINSIC_VALUE | &quot;Intrinsic Value&quot;
FIRST_CALL | &quot;First Call&quot;
FIRST_PAR | &quot;First Par&quot;


## Implemented Interfaces

* Serializable


