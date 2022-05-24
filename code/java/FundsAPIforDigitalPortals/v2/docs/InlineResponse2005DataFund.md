

# InlineResponse2005DataFund

Values and value ranges of the parameters related to funds.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**etf** | [**java.util.List&lt;InlineResponse2005DataFundEtf&gt;**](InlineResponse2005DataFundEtf.md) | Indicates whether ETFs (&#x60;true&#x60;) and mutual funds (&#x60;false&#x60;) are among the results. |  [optional]
**currency** | [**java.util.List&lt;InlineResponse2005DataFundCurrency&gt;**](InlineResponse2005DataFundCurrency.md) | List of main currency identifiers. See endpoint &#x60;/basic/valueUnit/currency/main/list&#x60; for possible values. |  [optional]
**domicile** | [**java.util.List&lt;InlineResponse2005DataFundDomicile&gt;**](InlineResponse2005DataFundDomicile.md) | List of countries representing domiciles of funds. See endpoint &#x60;/basic/region/country/list&#x60; for possible values. |  [optional]
**holdingType** | [**java.util.List&lt;InlineResponse2005DataFundHoldingType&gt;**](InlineResponse2005DataFundHoldingType.md) | Lists of categories of the holdings&#39; asset type classification. Asset type of the holdings is a category from any level of category system \&quot;Asset class classification system for mutual funds, defined by FactSet Research Systems Inc.\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;288&#x60; for possible values. |  [optional]
**countryDevelopment** | [**java.util.List&lt;InlineResponse2005DataFundHoldingType&gt;**](InlineResponse2005DataFundHoldingType.md) | Lists of categories of the holdings&#39; country development level classification. Country development level of the holdings is a category from any level of category system \&quot;Country development level classification system for mutual funds, defined by FactSet Research Systems Inc.\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;289&#x60; for possible values. |  [optional]
**regionalExposure** | [**InlineResponse2005DataFundRegionalExposure**](InlineResponse2005DataFundRegionalExposure.md) |  |  [optional]
**strategy** | [**java.util.List&lt;InlineResponse2005DataFundHoldingType&gt;**](InlineResponse2005DataFundHoldingType.md) | Lists of categories of the strategy classification. Strategy is a category from any level of category system \&quot;Three-tier strategy classification system for funds defined by FactSet Research Systems Inc.\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;292&#x60; for possible values. |  [optional]
**industry** | [**java.util.List&lt;InlineResponse2005DataFundHoldingType&gt;**](InlineResponse2005DataFundHoldingType.md) | Lists of categories of the industry classification. Industry is a category from any level of category system \&quot;Funds classification defined by FactSet Digital Solutions\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;27&#x60; for possible values. |  [optional]
**srri** | [**java.util.List&lt;InlineResponse2005DataFundSrri&gt;**](InlineResponse2005DataFundSrri.md) | List of values for the synthetic risk and reward indicator (SRRI). |  [optional]
**issuer** | [**InlineResponse2005DataFundIssuer**](InlineResponse2005DataFundIssuer.md) |  |  [optional]
**assetsUnderManagement** | [**InlineResponse2005DataFundAssetsUnderManagement**](InlineResponse2005DataFundAssetsUnderManagement.md) |  |  [optional]
**compliance** | [**java.util.List&lt;InlineResponse2005DataFundCompliance&gt;**](InlineResponse2005DataFundCompliance.md) | List of compliance properties for funds. A given compliance property may appear in combination with other compliance properties. The attribute count represents the number of all occurences of a compliance property, that is in all existing combinations, whereby the latter are not listed separately. See endpoint &#x60;/legalEntity/complianceProperty/list&#x60; for the full list of compliance properties associated with legal entities (across all roles).  |  [optional]


## Implemented Interfaces

* Serializable


