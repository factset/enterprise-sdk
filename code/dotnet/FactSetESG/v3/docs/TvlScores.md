# FactSet.SDK.FactSetESG.Model.TvlScores
TVL Scores Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Date** | **DateTime?** | Date for the period requested expressed in YYYY-MM-DD format. | [optional] 
**FsymId** | **string** | FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E). | [optional] 
**RequestId** | **string** | Identifier that was used for the request. | [optional] 
**ScoreType** | **string** | The name of the specific SASB Score type being shown in the response. This will be represented by the scoreTypes input: PULSE, INSIGHT, MOMENTUM, ART_VOL_TTM, CAT_VOL_TTM, or DYNAMIC_MAT. | [optional] 
**AllCategoriesPulse** | **decimal?** | The overall pulse across all categories. | [optional] 
**MaterialityPulse** | **decimal?** | The pulse related to materiality. | [optional] 
**AccessAffordPulse** | **decimal?** | The pulse related to access affordability. | [optional] 
**AirQualityPulse** | **decimal?** | The pulse related to air quality. | [optional] 
**BusinessEthicsPulse** | **decimal?** | The pulse related to business ethics. | [optional] 
**BusinessModelPulse** | **decimal?** | The pulse related to the business model. | [optional] 
**CompetitivePulse** | **decimal?** | The pulse related to competitive factors. | [optional] 
**CriticalRiskPulse** | **decimal?** | The pulse related to critical risks. | [optional] 
**CustomerPrivPulse** | **decimal?** | The pulse related to customer privacy. | [optional] 
**CustomePelfarePulse** | **decimal?** | The pulse related to customer welfare. | [optional] 
**DataSecurityPulse** | **decimal?** | The pulse related to data security. | [optional] 
**EcologicalPulse** | **decimal?** | The pulse related to ecological factors. | [optional] 
**EmployeeEngagementPulse** | **decimal?** | The pulse related to employee engagement. | [optional] 
**EmployeeHealthPulse** | **decimal?** | The pulse related to employee health. | [optional] 
**EnergyPulse** | **decimal?** | The pulse related to energy. | [optional] 
**GhgEmissionsPulse** | **decimal?** | The pulse related to greenhouse gas emissions. | [optional] 
**HumanRightsPulse** | **decimal?** | The pulse related to human rights. | [optional] 
**LaborPracticesPulse** | **decimal?** | The pulse related to labor practices. | [optional] 
**LegalRegulationsPulse** | **decimal?** | The pulse related to legal regulations. | [optional] 
**MaterialSourcingPulse** | **decimal?** | The pulse related to material sourcing. | [optional] 
**ClimateChangePulse** | **decimal?** | The pulse related to climate change. | [optional] 
**ProductLifecyclePulse** | **decimal?** | The pulse related to the product lifecycle. | [optional] 
**ProductQualityPulse** | **decimal?** | The pulse related to product quality. | [optional] 
**SellingPracticesPulse** | **decimal?** | The pulse related to selling practices. | [optional] 
**SupplyChainPulse** | **decimal?** | The pulse related to supply chain practices. | [optional] 
**SystemicRiskPulse** | **decimal?** | The pulse related to systemic risks. | [optional] 
**HazardousMaterialsPulse** | **decimal?** | The pulse related to management of hazardous materials. | [optional] 
**WaterWasteWaterPulse** | **decimal?** | The pulse related to water and wastewater management. | [optional] 
**DimBusinessCatvolDay** | **decimal?** | Category volume related to Business dimension. | [optional] 
**DimEnvironmentCatvolDay** | **decimal?** | Category volume related to Environment dimension. | [optional] 
**DimHumancapCatvolDay** | **decimal?** | Category volume related to Human Capital dimension. | [optional] 
**DimLeadershipCatvolDay** | **decimal?** | Category volume related to Leadership dimension. | [optional] 
**DimSocialcapCatvolDay** | **decimal?** | Category volume related to Social Capital dimension. | [optional] 
**Error** | [**InvalidIdErrorObject**](InvalidIdErrorObject.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

