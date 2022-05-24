

# InlineResponse20062DataGeneral

General information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isin** | **String** | International Securities Identification Number (ISIN). |  [optional]
**name** | **String** | Name of the investment product. |  [optional]
**currency** | [**InlineResponse20062DataGeneralCurrency**](InlineResponse20062DataGeneralCurrency.md) |  |  [optional]
**reportingDate** | **LocalDate** | The date to which the MiFID II data refers. |  [optional]
**legalStructure** | [**InlineResponse20062DataGeneralLegalStructure**](InlineResponse20062DataGeneralLegalStructure.md) |  |  [optional]
**fund** | [**InlineResponse20062DataGeneralFund**](InlineResponse20062DataGeneralFund.md) |  |  [optional]
**issuer** | [**InlineResponse20062DataGeneralIssuer**](InlineResponse20062DataGeneralIssuer.md) |  |  [optional]
**guarantor** | [**InlineResponse20062DataGeneralGuarantor**](InlineResponse20062DataGeneralGuarantor.md) |  |  [optional]
**type** | [**InlineResponse20062DataGeneralType**](InlineResponse20062DataGeneralType.md) |  |  [optional]
**leveragedOrContingent** | **Boolean** | Indicates whether the investment product has leverage or implies a contingent liability. |  [optional]
**manufacturer** | [**InlineResponse20062DataGeneralManufacturer**](InlineResponse20062DataGeneralManufacturer.md) |  |  [optional]
**approvalProcedure** | [**ApprovalProcedureEnum**](#ApprovalProcedureEnum) | Information on the approval procedure undergone by the investment product. |  [optional]
**complexProduct** | [**ComplexProductEnum**](#ComplexProductEnum) | Indicates whether the investment product is considered a complex one. |  [optional]



## Enum: ApprovalProcedureEnum

Name | Value
---- | -----
PURSUANT | &quot;pursuant&quot;
COMPARABLE | &quot;comparable&quot;
NOTINACCORDANCE | &quot;notInAccordance&quot;
NOTREQUIRED | &quot;notRequired&quot;
NOTRELEVANT | &quot;notRelevant&quot;



## Enum: ComplexProductEnum

Name | Value
---- | -----
YES | &quot;yes&quot;
NO | &quot;no&quot;
SITUATIONAL | &quot;situational&quot;
NOTRELEVANT | &quot;notRelevant&quot;


## Implemented Interfaces

* Serializable


