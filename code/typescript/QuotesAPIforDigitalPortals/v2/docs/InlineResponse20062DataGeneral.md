# quotesapifordigitalportals.InlineResponse20062DataGeneral

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isin** | **String** | International Securities Identification Number (ISIN). | [optional] 
**name** | **String** | Name of the investment product. | [optional] 
**currency** | [**InlineResponse20062DataGeneralCurrency**](InlineResponse20062DataGeneralCurrency.md) |  | [optional] 
**reportingDate** | **Date** | The date to which the MiFID II data refers. | [optional] 
**legalStructure** | [**InlineResponse20062DataGeneralLegalStructure**](InlineResponse20062DataGeneralLegalStructure.md) |  | [optional] 
**fund** | [**InlineResponse20062DataGeneralFund**](InlineResponse20062DataGeneralFund.md) |  | [optional] 
**issuer** | [**InlineResponse20062DataGeneralIssuer**](InlineResponse20062DataGeneralIssuer.md) |  | [optional] 
**guarantor** | [**InlineResponse20062DataGeneralGuarantor**](InlineResponse20062DataGeneralGuarantor.md) |  | [optional] 
**type** | [**InlineResponse20062DataGeneralType**](InlineResponse20062DataGeneralType.md) |  | [optional] 
**leveragedOrContingent** | **Boolean** | Indicates whether the investment product has leverage or implies a contingent liability. | [optional] 
**manufacturer** | [**InlineResponse20062DataGeneralManufacturer**](InlineResponse20062DataGeneralManufacturer.md) |  | [optional] 
**approvalProcedure** | **String** | Information on the approval procedure undergone by the investment product. | [optional] 
**complexProduct** | **String** | Indicates whether the investment product is considered a complex one. | [optional] 



## Enum: ApprovalProcedureEnum


* `pursuant` (value: `"pursuant"`)

* `comparable` (value: `"comparable"`)

* `notInAccordance` (value: `"notInAccordance"`)

* `notRequired` (value: `"notRequired"`)

* `notRelevant` (value: `"notRelevant"`)





## Enum: ComplexProductEnum


* `yes` (value: `"yes"`)

* `no` (value: `"no"`)

* `situational` (value: `"situational"`)

* `notRelevant` (value: `"notRelevant"`)




