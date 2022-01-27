# FactSet.SDK.ETFProfileandPrices.Model.InlineResponse200Data
Profile.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AsOfDate** | **DateTime** | Date data was published. This data is available only for US region. | [optional] 
**HoldingsDate** | **DateTime** | The as of data for holdings statistics. This data available only for US region | [optional] 
**Symbol** | **string** | Ticker of the ETP. This data is available for all region. | [optional] 
**Exchange** | [**InlineResponse200DataExchange**](InlineResponse200DataExchange.md) |  | [optional] 
**Name** | **string** | Name of the ETP. This data is available for all the regions. | [optional] 
**Issuer** | [**InlineResponse200DataIssuer**](InlineResponse200DataIssuer.md) |  | [optional] 
**Brand** | [**InlineResponse200DataBrand**](InlineResponse200DataBrand.md) |  | [optional] 
**LaunchDate** | **DateTime** | Launch date of the ETP. This data is available for all the regions. | [optional] 
**Description** | **string** | A brief description of the ETP. This data is available for all the regions. | [optional] 
**Website** | **string** | Link to the ETP&#39;s homepage. This data is available for the US and Canada region. | [optional] 
**Domicile** | **string** | ETP country of domicile. This data is available for all the regions and country code is in format ISO 3166-1 alpha-2. | [optional] 
**Status** | **string** | Staus of the ETP. This data is available for all the regions. | [optional] 
**Currency** | [**InlineResponse200DataCurrency**](InlineResponse200DataCurrency.md) |  | [optional] 
**Index** | [**InlineResponse200DataIndex**](InlineResponse200DataIndex.md) |  | [optional] 
**FinancialReport** | [**InlineResponse200DataFinancialReport**](InlineResponse200DataFinancialReport.md) |  | [optional] 
**CreateRedeem** | [**InlineResponse200DataCreateRedeem**](InlineResponse200DataCreateRedeem.md) |  | [optional] 
**Aum** | **decimal** | The market value of the total assets that a individual ETP manages on behalf of it&#39;s investors. This data is available for all the regions. | [optional] 
**Trading** | [**InlineResponse200DataTrading**](InlineResponse200DataTrading.md) |  | [optional] 
**Documentation** | [**InlineResponse200DataDocumentation**](InlineResponse200DataDocumentation.md) |  | [optional] 
**Insight** | [**InlineResponse200DataInsight**](InlineResponse200DataInsight.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

