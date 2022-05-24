# InlineResponse20031Data

Structure.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_etn** | **bool** | Flags exchange-traded notes. This data is available for all the regions. | [optional] 
**type** | **str** | Describes the legal structure of the ETP, text and standardized value available. This data is available for all the regions. | [optional] 
**is_actively_managed** | **bool** | Flags ETPs that are actively managed as per SEC guidelines. This data is available for all the regions. | [optional] 
**backing** | **str** | Describes whether the ETP holds underlying securities or uses derivatives to gain its desired exposure, text and standardized value available. This data is available for all the regions. | [optional] 
**synthetic_type** | **str** | Indicates whether the synthetic ETP is “unfunded” (collateral or substitute basket of securities for the swap agreement is owned by ETP), or “funded” (collateral for swap agreement is held by a custodian in the name of the ETP or in the name of the counterparty, pledged to the ETP issuer), text and standardized value available. This data is available for Europe only. | [optional] 
**legal_structure** | **str** | The organizational structure of the ETP, text and standardized value available. This data is available for all the regions. | [optional] 
**is_ucits_compliant** | **bool** | The counterparty for derivative exposure for synthetic ETPs. This data is available for all the regions. | [optional] 
**is_holdings_transparent** | **bool** | States whether or not the ETP&#39;s issuer discloses its positions on its website daily. This data is available for all the regions. | [optional] 
**portfolio_disclosure** | **str** | The frequency of an issuer&#39;s disclosure of all ETP holdings on its website, text and standardized value available. This data is available for all the regions. | [optional] 
**cash_flow_frequency** | **str** | States how often the ETP makes regular distributions, text and standardized value available. This data is available only for US and Europe. | [optional] 
**is_eligible_for_registered_accounts** | **bool** | Product can be held in tax-advantaged investment accounts. This data is available for Canada only. | [optional] 
**is_drip_eligible** | **bool** | Ability to have dividends reinvested. This data is available for Canada only. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


