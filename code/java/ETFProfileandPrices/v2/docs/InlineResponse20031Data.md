

# InlineResponse20031Data

Structure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isEtn** | **Boolean** | Flags exchange-traded notes. This data is available for all the regions. |  [optional]
**type** | **String** | Describes the legal structure of the ETP, text and standardized value available. This data is available for all the regions. |  [optional]
**isActivelyManaged** | **Boolean** | Flags ETPs that are actively managed as per SEC guidelines. This data is available for all the regions. |  [optional]
**backing** | **String** | Describes whether the ETP holds underlying securities or uses derivatives to gain its desired exposure, text and standardized value available. This data is available for all the regions. |  [optional]
**syntheticType** | **String** | Indicates whether the synthetic ETP is “unfunded” (collateral or substitute basket of securities for the swap agreement is owned by ETP), or “funded” (collateral for swap agreement is held by a custodian in the name of the ETP or in the name of the counterparty, pledged to the ETP issuer), text and standardized value available. This data is available for Europe only. |  [optional]
**legalStructure** | **String** | The organizational structure of the ETP, text and standardized value available. This data is available for all the regions. |  [optional]
**isUcitsCompliant** | **Boolean** | The counterparty for derivative exposure for synthetic ETPs. This data is available for all the regions. |  [optional]
**isHoldingsTransparent** | **Boolean** | States whether or not the ETP&#39;s issuer discloses its positions on its website daily. This data is available for all the regions. |  [optional]
**portfolioDisclosure** | **String** | The frequency of an issuer&#39;s disclosure of all ETP holdings on its website, text and standardized value available. This data is available for all the regions. |  [optional]
**cashFlowFrequency** | **String** | States how often the ETP makes regular distributions, text and standardized value available. This data is available only for US and Europe. |  [optional]
**isEligibleForRegisteredAccounts** | **Boolean** | Product can be held in tax-advantaged investment accounts. This data is available for Canada only. |  [optional]
**isDripEligible** | **Boolean** | Ability to have dividends reinvested. This data is available for Canada only. |  [optional]


## Implemented Interfaces

* Serializable


