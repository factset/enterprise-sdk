# FISecurity


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calc_from_value** | **float** | Calculation from value | 
**symbol** | **str** | Symbol | 
**settlement** | **str, none_type** | Settlement date | [optional] 
**call_method** | **str, none_type** | Call Method | [optional] 
**reference_security** | [**FIReferenceSecurity**](FIReferenceSecurity.md) |  | [optional] 
**bank_loans** | [**FIBankLoans**](FIBankLoans.md) |  | [optional] 
**municipal_bonds** | [**FIMunicipalBonds**](FIMunicipalBonds.md) |  | [optional] 
**loss** | [**FILoss**](FILoss.md) |  | [optional] 
**prepay** | [**FIPrepay**](FIPrepay.md) |  | [optional] 
**matrix_spread_adjustment** | **float, none_type** | Matrix Spread Adjustment | [optional] 
**matrix_multiplier** | **float, none_type** | Matrix Multiplier | [optional] 
**structured_products** | [**FIStructuredProductsForSecurities**](FIStructuredProductsForSecurities.md) |  | [optional] 
**attribution** | [**FIAttributionForSecurities**](FIAttributionForSecurities.md) |  | [optional] 
**convertible** | [**FIConvertibleSettings**](FIConvertibleSettings.md) |  | [optional] 
**calc_from_method** | **str, none_type** | Calculation Method.  Methods : Active Spread, Actual Spread, Actual Spread To Worst Call, OAS, Price, Yield, Yield To No Call, Act/Act Yield To No Call, Bond Equivalent Yield,  Yield To Worst Call, Discount Yield, Discount Margin, Implied Volatility, Bullet Spread, Bullet Spread To Worst Call, Pricing Matrix | [optional] 
**face** | **float, none_type** | Face | [optional]  if omitted the server will use the default value of 1.1
**face_type** | **str, none_type** | Face type | [optional]  if omitted the server will use the default value of "Current"
**discount_curve** | **str, none_type** | Discount curve | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


