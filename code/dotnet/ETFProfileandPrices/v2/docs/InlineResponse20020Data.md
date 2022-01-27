# FactSet.SDK.ETFProfileandPrices.Model.InlineResponse20020Data
Structure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsEtn** | **bool** | Flags exchange-traded notes. This data is available for all the regions. | [optional] 
**Type** | **string** | Describes the legal structure of the ETP, text and standardized value available This data is available for all the regions. | [optional] 
**IsActivelyManaged** | **bool** | Flags ETPs that are actively managed as per SEC guidelines. This data is available for all the regions. | [optional] 
**Backing** | **string** | Describes whether the ETP holds underlying securities or uses derivatives to gain its desired exposure, text and standardized value available.  This data is available for all the regions. | [optional] 
**SyntheticType** | **string** | Indicates whether the synthetic ETP is “unfunded” (collateral or substitute basket of securities for the swap agreement is owned by ETP), or “funded” (collateral for swap agreement is held by a custodian in the name of the ETP or in the name of the counterparty, pledged to the ETP issuer), text and standardized value available. This data is available for Europe only. | [optional] 
**LegalStructure** | **string** | The organizational structure of the ETP, text and standardized value available. This data is available for all the regions. | [optional] 
**IsUcitsCompliant** | **bool** | The counterparty for derivative exposure for synthetic ETPs. This data is available for all the regions. | [optional] 
**IsHoldingsTransparent** | **bool** | States whether or not the ETP&#39;s issuer discloses its positions on its website daily. This data is available for all the regions. | [optional] 
**PortfolioDisclosure** | **string** | The frequency of an issuer&#39;s disclosure of all ETP holdings on its website, text and standardized value available. This data is available for all the regions. | [optional] 
**CashFlowFrequency** | **string** | States how often the ETP makes regular distributions, text and standardized value available. This data is available only for US and Europe. | [optional] 
**IsEligibleForRegisteredAccounts** | **bool** | Product can be held in tax-advantaged investment accounts. This data is available for Canada only. | [optional] 
**IsDripEligible** | **bool** | Ability to have dividends reinvested. This data is available for Canada only. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

