# FactSet.SDK.FixedIncomeCalculation.Model.FISecurity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Settlement** | **string** | Settlement date | [optional] 
**CallMethod** | **string** | Call Method | [optional] 
**ReferenceSecurity** | [**FIReferenceSecurity**](FIReferenceSecurity.md) |  | [optional] 
**BankLoans** | [**FIBankLoans**](FIBankLoans.md) |  | [optional] 
**MunicipalBonds** | [**FIMunicipalBonds**](FIMunicipalBonds.md) |  | [optional] 
**Loss** | [**FILoss**](FILoss.md) |  | [optional] 
**Prepay** | [**FIPrepay**](FIPrepay.md) |  | [optional] 
**MatrixSpreadAdjustment** | **double?** | Matrix Spread Adjustment | [optional] 
**MatrixMultiplier** | **double?** | Matrix Multiplier | [optional] 
**StructuredProducts** | [**FIStructuredProductsForSecurities**](FIStructuredProductsForSecurities.md) |  | [optional] 
**CalcFromMethod** | **string** | Calculation Method.  Methods : Active Spread, Actual Spread, Actual Spread To Worst Call, OAS, Price, Yield, Yield To No Call, Act/Act Yield To No Call, Bond Equivalent Yield,  Yield To Worst Call, Discount Yield, Discount Margin, Implied Volatility, Bullet Spread, Bullet Spread To Worst Call, Pricing Matrix | [optional] 
**CalcFromValue** | **double** | Calculation from value | 
**Face** | **double?** | Face | [optional] [default to 1D]
**FaceType** | **string** | Face type | [optional] [default to FaceTypeEnum.Current]
**Symbol** | **string** | Symbol | 
**DiscountCurve** | **string** | Discount curve | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

