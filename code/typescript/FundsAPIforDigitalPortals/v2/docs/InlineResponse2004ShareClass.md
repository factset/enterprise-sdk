# fundsapifordigitalportals.InlineResponse2004ShareClass

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | [**InlineResponse2004ShareClassCurrency**](InlineResponse2004ShareClassCurrency.md) |  | [optional] 
**distributing** | **Boolean** | If &#x60;true&#x60;, the share class distributes the earnings to the investors. | [optional] 
**registrationCountry** | [**[InlineResponse2004ShareClassRegistrationCountry]**](InlineResponse2004ShareClassRegistrationCountry.md) | Country of trading registration of the share class. See endpoint &#x60;/basic/region/country/list&#x60; for possible values. | [optional] 
**lifeCycle** | [**InlineResponse2004ShareClassLifeCycle**](InlineResponse2004ShareClassLifeCycle.md) |  | [optional] 
**minimumInvestment** | [**InlineResponse2004ShareClassMinimumInvestment**](InlineResponse2004ShareClassMinimumInvestment.md) |  | [optional] 
**assetsUnderManagement** | **Number** | Assets under management (AUM) which is the sum of the market values of the holdings of the share class including cash. The AUM is expressed in the currency of the share class, see attribute &#x60;shareClass.currency&#x60;. | [optional] 
**compliance** | [**[InlineResponse2004FundCompliance]**](InlineResponse2004FundCompliance.md) | List of compliance properties to which the share class is compliant. See endpoint &#x60;/instrument/complianceProperty/list&#x60; for possible values. | [optional] 
**fee** | [**InlineResponse2004ShareClassFee**](InlineResponse2004ShareClassFee.md) |  | [optional] 


