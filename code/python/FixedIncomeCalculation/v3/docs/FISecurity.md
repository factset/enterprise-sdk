# FISecurity


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calc_from_value** | **float** | Calculation from value | 
**symbol** | **str** | Symbol | 
**settlement** | **str** | Settlement date | [optional] 
**call_method** | **str** | Call Method | [optional] 
**reference_security** | [**FIReferenceSecurity**](FIReferenceSecurity.md) |  | [optional] 
**loss** | [**FILoss**](FILoss.md) |  | [optional] 
**prepay** | [**FIPrepay**](FIPrepay.md) |  | [optional] 
**matrix_spread_adjustment** | **float** | Matrix Spread Adjustment | [optional] 
**matrix_multiplier** | **float** | Matrix Multiplier | [optional] 
**calc_from_method** | **str** | Calculation Method.  Methods : Active Spread, Actual Spread, Actual Spread To Worst Call, OAS, Price, Yield, Yield To No Call, Act/Act Yield To No Call, Bond Equivalent Yield,  Yield To Worst Call, Discount Yield, Discount Margin, Implied Volatility, Bullet Spread, Bullet Spread To Worst Call, Pricing Matrix | [optional] 
**face** | **float** | Face | [optional]  if omitted the server will use the default value of 1
**face_type** | **str** | Face type | [optional]  if omitted the server will use the default value of "Current"
**discount_curve** | **str** | Discount curve | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


