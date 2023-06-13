# fixedincomecalculation.FISecurity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settlement** | **String** | Settlement date | [optional] 
**callMethod** | **String** | Call Method | [optional] 
**referenceSecurity** | [**FIReferenceSecurity**](FIReferenceSecurity.md) |  | [optional] 
**bankLoans** | [**FIBankLoans**](FIBankLoans.md) |  | [optional] 
**municipalBonds** | [**FIMunicipalBonds**](FIMunicipalBonds.md) |  | [optional] 
**loss** | [**FILoss**](FILoss.md) |  | [optional] 
**prepay** | [**FIPrepay**](FIPrepay.md) |  | [optional] 
**matrixSpreadAdjustment** | **Number** | Matrix Spread Adjustment | [optional] 
**matrixMultiplier** | **Number** | Matrix Multiplier | [optional] 
**structuredProducts** | [**FIStructuredProductsForSecurities**](FIStructuredProductsForSecurities.md) |  | [optional] 
**attribution** | [**FIAttributionForSecurities**](FIAttributionForSecurities.md) |  | [optional] 
**calcFromMethod** | **String** | Calculation Method.  Methods : Active Spread, Actual Spread, Actual Spread To Worst Call, OAS, Price, Yield, Yield To No Call, Act/Act Yield To No Call, Bond Equivalent Yield,  Yield To Worst Call, Discount Yield, Discount Margin, Implied Volatility, Bullet Spread, Bullet Spread To Worst Call, Pricing Matrix | [optional] 
**calcFromValue** | **Number** | Calculation from value | 
**face** | **Number** | Face | [optional] [default to 1]
**faceType** | **String** | Face type | [optional] [default to &#39;Current&#39;]
**symbol** | **String** | Symbol | 
**discountCurve** | **String** | Discount curve | [optional] 



## Enum: CallMethodEnum


* `No Call` (value: `"No Call"`)

* `Intrinsic Value` (value: `"Intrinsic Value"`)

* `First Call` (value: `"First Call"`)

* `First Par` (value: `"First Par"`)





## Enum: FaceTypeEnum


* `Current` (value: `"Current"`)

* `Original` (value: `"Original"`)




