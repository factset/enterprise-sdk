# FactSet.SDK.FundsAPIforDigitalPortals.Model.InlineResponse2005DataFund
Values and value ranges of the parameters related to funds.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Etf** | [**List&lt;InlineResponse2005DataFundEtf&gt;**](InlineResponse2005DataFundEtf.md) | Indicates whether ETFs (&#x60;true&#x60;) and mutual funds (&#x60;false&#x60;) are among the results. | [optional] 
**Currency** | [**List&lt;InlineResponse2005DataFundCurrency&gt;**](InlineResponse2005DataFundCurrency.md) | List of main currency identifiers. See endpoint &#x60;/basic/valueUnit/currency/main/list&#x60; for possible values. | [optional] 
**Domicile** | [**List&lt;InlineResponse2005DataFundDomicile&gt;**](InlineResponse2005DataFundDomicile.md) | List of countries representing domiciles of funds. See endpoint &#x60;/basic/region/country/list&#x60; for possible values. | [optional] 
**HoldingType** | [**List&lt;InlineResponse2005DataFundHoldingType&gt;**](InlineResponse2005DataFundHoldingType.md) | Lists of categories of the holdings&#39; asset type classification. Asset type of the holdings is a category from any level of category system \&quot;Asset class classification system for mutual funds, defined by FactSet Research Systems Inc.\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;288&#x60; for possible values. | [optional] 
**CountryDevelopment** | [**List&lt;InlineResponse2005DataFundHoldingType&gt;**](InlineResponse2005DataFundHoldingType.md) | Lists of categories of the holdings&#39; country development level classification. Country development level of the holdings is a category from any level of category system \&quot;Country development level classification system for mutual funds, defined by FactSet Research Systems Inc.\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;289&#x60; for possible values. | [optional] 
**RegionalExposure** | [**InlineResponse2005DataFundRegionalExposure**](InlineResponse2005DataFundRegionalExposure.md) |  | [optional] 
**Strategy** | [**List&lt;InlineResponse2005DataFundHoldingType&gt;**](InlineResponse2005DataFundHoldingType.md) | Lists of categories of the strategy classification. Strategy is a category from any level of category system \&quot;Three-tier strategy classification system for funds defined by FactSet Research Systems Inc.\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;292&#x60; for possible values. | [optional] 
**Industry** | [**List&lt;InlineResponse2005DataFundHoldingType&gt;**](InlineResponse2005DataFundHoldingType.md) | Lists of categories of the industry classification. Industry is a category from any level of category system \&quot;Funds classification defined by FactSet Digital Solutions\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;27&#x60; for possible values. | [optional] 
**Srri** | [**List&lt;InlineResponse2005DataFundSrri&gt;**](InlineResponse2005DataFundSrri.md) | List of values for the synthetic risk and reward indicator (SRRI). | [optional] 
**Issuer** | [**InlineResponse2005DataFundIssuer**](InlineResponse2005DataFundIssuer.md) |  | [optional] 
**AssetsUnderManagement** | [**InlineResponse2005DataFundAssetsUnderManagement**](InlineResponse2005DataFundAssetsUnderManagement.md) |  | [optional] 
**Compliance** | [**List&lt;InlineResponse2005DataFundCompliance&gt;**](InlineResponse2005DataFundCompliance.md) | List of compliance properties for funds. A given compliance property may appear in combination with other compliance properties. The attribute count represents the number of all occurences of a compliance property, that is in all existing combinations, whereby the latter are not listed separately. See endpoint &#x60;/legalEntity/complianceProperty/list&#x60; for the full list of compliance properties associated with legal entities (across all roles).  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

