

# InlineResponse2005DataShareClass

Values and value ranges of the parameters related to share classes.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | [**java.util.List&lt;InlineResponse2005DataFundCurrency&gt;**](InlineResponse2005DataFundCurrency.md) | List of main currency identifiers. See endpoint &#x60;/basic/valueUnit/currency/main/list&#x60; for possible values. |  [optional]
**distributing** | [**java.util.List&lt;InlineResponse2005DataShareClassDistributing&gt;**](InlineResponse2005DataShareClassDistributing.md) | Indicates whether distributing (&#x60;true&#x60;) and non-distributing share classes (&#x60;false&#x60;) are among the results. |  [optional]
**registrationCountry** | [**java.util.List&lt;InlineResponse2005DataFundDomicile&gt;**](InlineResponse2005DataFundDomicile.md) | List of countries where the share classes have a trading registration. See endpoint &#x60;/basic/region/country/list&#x60; for possible values. |  [optional]
**lifeCycle** | [**InlineResponse2005DataShareClassLifeCycle**](InlineResponse2005DataShareClassLifeCycle.md) |  |  [optional]
**minimumInvestment** | [**InlineResponse2005DataShareClassMinimumInvestment**](InlineResponse2005DataShareClassMinimumInvestment.md) |  |  [optional]
**assetsUnderManagement** | [**InlineResponse2005DataShareClassAssetsUnderManagement**](InlineResponse2005DataShareClassAssetsUnderManagement.md) |  |  [optional]
**compliance** | [**java.util.List&lt;InlineResponse2005DataFundCompliance&gt;**](InlineResponse2005DataFundCompliance.md) | List of compliance properties for share classes. A given compliance property may appear in combination with other compliance properties. The attribute count represents the number of all occurences of a compliance property, that is in all existing combinations, whereby the latter are not listed separately. See endpoint &#x60;/instrument/complianceProperty/list&#x60; for the full list of compliance properties associated with instruments (across all asset classes). |  [optional]
**fee** | [**InlineResponse2005DataShareClassFee**](InlineResponse2005DataShareClassFee.md) |  |  [optional]


## Implemented Interfaces

* Serializable


