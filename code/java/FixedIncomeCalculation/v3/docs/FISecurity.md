

# FISecurity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settlement** | **String** | Settlement date |  [optional]
**callMethod** | [**CallMethodEnum**](#CallMethodEnum) | Call Method |  [optional]
**referenceSecurity** | [**FIReferenceSecurity**](FIReferenceSecurity.md) |  |  [optional]
**bankLoans** | [**FIBankLoans**](FIBankLoans.md) |  |  [optional]
**municipalBonds** | [**FIMunicipalBonds**](FIMunicipalBonds.md) |  |  [optional]
**loss** | [**FILoss**](FILoss.md) |  |  [optional]
**prepay** | [**FIPrepay**](FIPrepay.md) |  |  [optional]
**matrixSpreadAdjustment** | **Double** | Matrix Spread Adjustment |  [optional]
**matrixMultiplier** | **Double** | Matrix Multiplier |  [optional]
**structuredProducts** | [**FIStructuredProductsForSecurities**](FIStructuredProductsForSecurities.md) |  |  [optional]
**calcFromMethod** | **String** | Calculation Method.  Methods : Active Spread, Actual Spread, Actual Spread To Worst Call, OAS, Price, Yield, Yield To No Call, Act/Act Yield To No Call, Bond Equivalent Yield,  Yield To Worst Call, Discount Yield, Discount Margin, Implied Volatility, Bullet Spread, Bullet Spread To Worst Call, Pricing Matrix |  [optional]
**calcFromValue** | **Double** | Calculation from value | 
**face** | **Double** | Face |  [optional]
**faceType** | [**FaceTypeEnum**](#FaceTypeEnum) | Face type |  [optional]
**symbol** | **String** | Symbol | 
**discountCurve** | **String** | Discount curve |  [optional]



## Enum: CallMethodEnum

Name | Value
---- | -----
NO_CALL | &quot;No Call&quot;
INTRINSIC_VALUE | &quot;Intrinsic Value&quot;
FIRST_CALL | &quot;First Call&quot;
FIRST_PAR | &quot;First Par&quot;



## Enum: FaceTypeEnum

Name | Value
---- | -----
CURRENT | &quot;Current&quot;
ORIGINAL | &quot;Original&quot;


## Implemented Interfaces

* Serializable


