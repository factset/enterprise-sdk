

# InlineResponse20062DataTargetMarketInvestorType

Describes the intended type of investors for an investment product.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**retail** | [**RetailEnum**](#RetailEnum) | Indicates whether the investment product is suitable for retail clients. |  [optional]
**professional** | [**ProfessionalEnum**](#ProfessionalEnum) | Indicates whether the investment product is suitable for professional clients. |  [optional]
**eligibleCounterParty** | [**EligibleCounterPartyEnum**](#EligibleCounterPartyEnum) | Indicates whether the investment product is suitable for clients of type eligible counterparty. |  [optional]



## Enum: RetailEnum

Name | Value
---- | -----
YES | &quot;yes&quot;
NO | &quot;no&quot;
NEUTRAL | &quot;neutral&quot;



## Enum: ProfessionalEnum

Name | Value
---- | -----
YES | &quot;yes&quot;
NO | &quot;no&quot;
NEUTRAL | &quot;neutral&quot;
PERSE | &quot;perSe&quot;
ELECTIVE | &quot;elective&quot;
BOTH | &quot;both&quot;



## Enum: EligibleCounterPartyEnum

Name | Value
---- | -----
YES | &quot;yes&quot;
NO | &quot;no&quot;
NEUTRAL | &quot;neutral&quot;


## Implemented Interfaces

* Serializable


