# FactSet.SDK.FundsAPIforDigitalPortals.Model.InlineResponse2004Fund
Attributes related to the fund.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **decimal** | Identifier of the fund. | [optional] 
**Name** | **string** | Name of the fund. | [optional] 
**Etf** | **bool** | If &#x60;true&#x60;, the fund is an ETF. | [optional] 
**Currency** | [**InlineResponse2004FundCurrency**](InlineResponse2004FundCurrency.md) |  | [optional] 
**Domicile** | [**InlineResponse2004FundDomicile**](InlineResponse2004FundDomicile.md) |  | [optional] 
**HoldingType** | [**InlineResponse2004FundHoldingType**](InlineResponse2004FundHoldingType.md) |  | [optional] 
**CountryDevelopment** | [**InlineResponse2004FundCountryDevelopment**](InlineResponse2004FundCountryDevelopment.md) |  | [optional] 
**RegionalExposure** | [**InlineResponse2004FundRegionalExposure**](InlineResponse2004FundRegionalExposure.md) |  | [optional] 
**Strategy** | [**InlineResponse2004FundStrategy**](InlineResponse2004FundStrategy.md) |  | [optional] 
**Industry** | [**InlineResponse2004FundIndustry**](InlineResponse2004FundIndustry.md) |  | [optional] 
**Srri** | [**InlineResponse2004FundSrri**](InlineResponse2004FundSrri.md) |  | [optional] 
**Issuer** | [**InlineResponse2004FundIssuer**](InlineResponse2004FundIssuer.md) |  | [optional] 
**AssetsUnderManagement** | **decimal** | Assets under management (AUM). | [optional] 
**Compliance** | [**List&lt;InlineResponse2004FundCompliance&gt;**](InlineResponse2004FundCompliance.md) | List of compliance properties to which the fund is compliant. See endpoint &#x60;/legalEntity/complianceProperty/list&#x60; for possible values. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

