# FactSet.SDK.FundsAPIforDigitalPortals.Model.InlineResponse2004ShareClass
Attributes related to the share class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Currency** | [**InlineResponse2004ShareClassCurrency**](InlineResponse2004ShareClassCurrency.md) |  | [optional] 
**Distributing** | **bool** | If &#x60;true&#x60;, the share class distributes the earnings to the investors. | [optional] 
**RegistrationCountry** | [**List&lt;InlineResponse2004ShareClassRegistrationCountry&gt;**](InlineResponse2004ShareClassRegistrationCountry.md) | Country of trading registration of the share class. See endpoint &#x60;/basic/region/country/list&#x60; for possible values. | [optional] 
**LifeCycle** | [**InlineResponse2004ShareClassLifeCycle**](InlineResponse2004ShareClassLifeCycle.md) |  | [optional] 
**MinimumInvestment** | [**InlineResponse2004ShareClassMinimumInvestment**](InlineResponse2004ShareClassMinimumInvestment.md) |  | [optional] 
**AssetsUnderManagement** | **decimal** | Assets under management (AUM) which is the sum of the market values of the holdings of the share class including cash. The AUM is expressed in the currency of the share class, see attribute &#x60;shareClass.currency&#x60;. | [optional] 
**Compliance** | [**List&lt;InlineResponse2004FundCompliance&gt;**](InlineResponse2004FundCompliance.md) | List of compliance properties to which the share class is compliant. See endpoint &#x60;/instrument/complianceProperty/list&#x60; for possible values. | [optional] 
**Fee** | [**InlineResponse2004ShareClassFee**](InlineResponse2004ShareClassFee.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

