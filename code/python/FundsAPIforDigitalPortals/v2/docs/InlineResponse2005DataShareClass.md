# InlineResponse2005DataShareClass

Values and value ranges of the parameters related to share classes.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | [**[InlineResponse2005DataFundCurrency]**](InlineResponse2005DataFundCurrency.md) | List of main currency identifiers. See endpoint &#x60;/basic/valueUnit/currency/main/list&#x60; for possible values. | [optional] 
**distributing** | [**[InlineResponse2005DataShareClassDistributing]**](InlineResponse2005DataShareClassDistributing.md) | Indicates whether distributing (&#x60;true&#x60;) and non-distributing share classes (&#x60;false&#x60;) are among the results. | [optional] 
**registration_country** | [**[InlineResponse2005DataFundDomicile]**](InlineResponse2005DataFundDomicile.md) | List of countries where the share classes have a trading registration. See endpoint &#x60;/basic/region/country/list&#x60; for possible values. | [optional] 
**life_cycle** | [**InlineResponse2005DataShareClassLifeCycle**](InlineResponse2005DataShareClassLifeCycle.md) |  | [optional] 
**minimum_investment** | [**InlineResponse2005DataShareClassMinimumInvestment**](InlineResponse2005DataShareClassMinimumInvestment.md) |  | [optional] 
**assets_under_management** | [**InlineResponse2005DataShareClassAssetsUnderManagement**](InlineResponse2005DataShareClassAssetsUnderManagement.md) |  | [optional] 
**compliance** | [**[InlineResponse2005DataFundCompliance]**](InlineResponse2005DataFundCompliance.md) | List of compliance properties for share classes. A given compliance property may appear in combination with other compliance properties. The attribute count represents the number of all occurences of a compliance property, that is in all existing combinations, whereby the latter are not listed separately. See endpoint &#x60;/instrument/complianceProperty/list&#x60; for the full list of compliance properties associated with instruments (across all asset classes). | [optional] 
**fee** | [**InlineResponse2005DataShareClassFee**](InlineResponse2005DataShareClassFee.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


