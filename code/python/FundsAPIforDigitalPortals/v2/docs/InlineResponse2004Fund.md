# InlineResponse2004Fund

Attributes related to the fund.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **float** | Identifier of the fund. | [optional] 
**name** | **str** | Name of the fund. | [optional] 
**etf** | **bool** | If &#x60;true&#x60;, the fund is an ETF. | [optional] 
**currency** | [**InlineResponse2004FundCurrency**](InlineResponse2004FundCurrency.md) |  | [optional] 
**domicile** | [**InlineResponse2004FundDomicile**](InlineResponse2004FundDomicile.md) |  | [optional] 
**holding_type** | [**InlineResponse2004FundHoldingType**](InlineResponse2004FundHoldingType.md) |  | [optional] 
**country_development** | [**InlineResponse2004FundCountryDevelopment**](InlineResponse2004FundCountryDevelopment.md) |  | [optional] 
**regional_exposure** | [**InlineResponse2004FundRegionalExposure**](InlineResponse2004FundRegionalExposure.md) |  | [optional] 
**strategy** | [**InlineResponse2004FundStrategy**](InlineResponse2004FundStrategy.md) |  | [optional] 
**industry** | [**InlineResponse2004FundIndustry**](InlineResponse2004FundIndustry.md) |  | [optional] 
**srri** | [**InlineResponse2004FundSrri**](InlineResponse2004FundSrri.md) |  | [optional] 
**issuer** | [**InlineResponse2004FundIssuer**](InlineResponse2004FundIssuer.md) |  | [optional] 
**assets_under_management** | **float** | Assets under management (AUM). | [optional] 
**compliance** | [**[InlineResponse2004FundCompliance]**](InlineResponse2004FundCompliance.md) | List of compliance properties to which the fund is compliant. See endpoint &#x60;/legalEntity/complianceProperty/list&#x60; for possible values. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


