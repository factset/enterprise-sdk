# FactSet.SDK.BondsAPIforDigitalPortals.Model.InlineResponse200Data
Fundamental data for a debt instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Isin** | **string** | The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument. | [optional] 
**Nsin** | [**InlineResponse200DataNsin**](InlineResponse200DataNsin.md) |  | [optional] 
**Name** | **string** | Name of the instrument. | [optional] 
**ShortName** | **string** | Short name of the instrument. | [optional] 
**Type** | [**List&lt;InlineResponse200DataType&gt;**](InlineResponse200DataType.md) | Instrument type as defined by FactSet Digital Solutions. Instrument types are arranged in a hierarchy, with the first level representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18). See endpoint &#x60;/category/get&#x60; for possible values. | [optional] 
**LifeCycle** | [**InlineResponse200DataLifeCycle**](InlineResponse200DataLifeCycle.md) |  | [optional] 
**Issuer** | [**InlineResponse200DataIssuer**](InlineResponse200DataIssuer.md) |  | [optional] 
**Issue** | [**InlineResponse200DataIssue**](InlineResponse200DataIssue.md) |  | [optional] 
**TradingVolume** | [**InlineResponse200DataTradingVolume**](InlineResponse200DataTradingVolume.md) |  | [optional] 
**Redemption** | [**InlineResponse200DataRedemption**](InlineResponse200DataRedemption.md) |  | [optional] 
**NominalValue** | **decimal** | Nominal value for per-unit quoted debt instruments. Debt instruments quoted in percent do not have a nominal value per se. | [optional] 
**DebtRanking** | [**InlineResponse200DataDebtRanking**](InlineResponse200DataDebtRanking.md) |  | [optional] 
**Germany** | [**InlineResponse200DataGermany**](InlineResponse200DataGermany.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

