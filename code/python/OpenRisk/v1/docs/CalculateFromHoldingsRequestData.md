# CalculateFromHoldingsRequestData

Input data for requests to calculate from holdings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**InputDate**](InputDate.md) |  | 
**holdings** | [**Holdings**](Holdings.md) |  | 
**risk_model** | [**RiskModelCode**](RiskModelCode.md) |  | 
**stats** | [**Stats**](Stats.md) |  | 
**additional_calc_inputs** | [**AdditionalCalculationInputs**](AdditionalCalculationInputs.md) |  | [optional] 
**allow_forced_riskless_assets** | **bool** | Allow certain assets to be entirely riskless; certain models always override this to be true. Examples of asset types to which this applies includes offset cash. | [optional]  if omitted the server will use the default value of False
**asset_types** | [**AssetTypes**](AssetTypes.md) |  | [optional] 
**calendar** | [**CalendarCode**](CalendarCode.md) |  | [optional] 
**composite_assets** | [**CompositeAssetDefinitions**](CompositeAssetDefinitions.md) |  | [optional] 
**currency** | [**CurrencyIsoCode**](CurrencyIsoCode.md) |  | [optional] 
**factor_grouping** | [**FactorGroup**](FactorGroup.md) |  | [optional] 
**factors_visible** | [**FactorsVisible**](FactorsVisible.md) |  | [optional] 
**index_mapping** | [**SecurityIndexMapping**](SecurityIndexMapping.md) |  | [optional] 
**lagging_dates** | [**LaggingDates**](LaggingDates.md) |  | [optional] 
**remove_currency_risk** | [**RemoveCurrencyRisk**](RemoveCurrencyRisk.md) |  | [optional] 
**requires_factor_returns** | [**RequiresFactorReturns**](RequiresFactorReturns.md) |  | [optional] 
**risk_model_append_data** | [**RiskModelAppendData**](RiskModelAppendData.md) |  | [optional] 
**underlying_ids** | [**UnderlyingIds**](UnderlyingIds.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


