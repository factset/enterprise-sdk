# FactSet.SDK.ETFProfileandPrices.Model.InlineResponse20013DataBlockTrade
Properties of the ETP with respect to large trades.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OverlapHours** | **decimal** | A measurement of the overlap between the hours of trading for the ETF and that of its underlying portfolio. Available for the regions: US. | [optional] 
**UnderlyingVolumePerUnit** | **decimal** | Weighted average of the ratios of each underlying&#39;s number of shares, represented in one creation unit of the ETP, relative to the median daily trading volume of the underlying over 45 trading days, expressed as a percentage. This is a measure of the liquidity available in the underlying portfolio of the ETP, whereby larger numbers indicate greater likelihood of adverse price impact on underlying securities from ETF creations/redemptions. Only applicable for ETF. Available for the regions: US. | [optional] 
**Liquidity** | **decimal** | A measurement of the liquidity available in an ETF for a hypothetical 1,000,000 USD trade. Measured on a scale of 0 to 5 - - 5 being very liquid and easy to execute, 1 being expensive and difficult to execute, and 0 indicating a closed or restricted creation window. Available for the regions: US. | [optional] 
**CreationUnitPerDay** | **decimal** | The median 45 day share volume divided by the creation unit size of the fund. The higher the number, the more likely that liquidity providers will trade the fund in size, or in odd lots. Available for the regions: US. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

