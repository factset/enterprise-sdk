# fixedincomecalculation.FIJobSettings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asOfDate** | **String** | As of date | 
**partialDurationMonths** | **[Number]** | Partial duration months | [optional] 
**callMethod** | **String** | Call Method | [optional] 
**settlement** | **String** | Settlement Date | [optional] 
**calcFromMethod** | **String** | Calculation Method.  Methods : Active Spread, Actual Spread, Actual Spread To Worst Call, OAS, Price, Yield, Yield To No Call, Act/Act Yield To No Call, Bond Equivalent Yield,  Yield To Worst Call, Discount Yield, Discount Margin, Implied Volatility, Bullet Spread, Bullet Spread To Worst Call, Pricing Matrix | [optional] 
**bankLoans** | [**FIBankLoans**](FIBankLoans.md) |  | [optional] 
**municipalBonds** | [**FIMunicipalBondsForJobSettings**](FIMunicipalBondsForJobSettings.md) |  | [optional] 
**marketEnvironment** | [**FIMarketEnvironment**](FIMarketEnvironment.md) |  | [optional] 
**structuredProducts** | [**FIStructuredProductsForJobSettings**](FIStructuredProductsForJobSettings.md) |  | [optional] 
**attribution** | [**FIAttributionForJobSettings**](FIAttributionForJobSettings.md) |  | [optional] 



## Enum: CallMethodEnum


* `No Call` (value: `"No Call"`)

* `Intrinsic Value` (value: `"Intrinsic Value"`)

* `First Call` (value: `"First Call"`)

* `First Par` (value: `"First Par"`)




