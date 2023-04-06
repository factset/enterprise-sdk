# FactSet.SDK.FactSetESG.Model.SasbScoresAll

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Date** | **DateTime?** | Date for the period requested expressed in YYYY-MM-DD format. | [optional] 
**FsymId** | **string** | FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E). | [optional] 
**RequestId** | **string** | Identifier that was used for the request. | [optional] 
**ScoreType** | **string** | The name of the specific SASB Score type being shown in the response. This will be represented by the scoreTypes input: PULSE, INSIGHT, MOMENTUM, ART_VOL_TTM, CAT_VOL_TTM, or DYNAMIC_MAT. | [optional] 
**AccessAndAffordability** | **double?** | The Access and Affordability SASB Category. | [optional] 
**AirQuality** | **double?** | The Air Quality SASB Category. | [optional] 
**AllCategories** | **Object** | The All Categories Category. This represents the overall SASB Score for the given &#39;scoreType&#39;. When scoreType &#x3D; ESG_RANK, the data type will be string, otherwise data type will be a number with double format. | [optional] 
**BusinessEthics** | **double?** | The Business Ethics Category. | [optional] 
**BusinessModelResilience** | **double?** | The Business Model Resilience Category. | [optional] 
**CompetitiveBehavior** | **double?** | The Competitive Behavior Category. | [optional] 
**CriticalIncidentRiskManagement** | **double?** | The Critical Incident Risk Management Category. | [optional] 
**CustomerPrivacy** | **double?** | The Customer Privacy Category. | [optional] 
**CustomerWelfare** | **double?** | The Customer Welfare Category. | [optional] 
**DataSecurity** | **double?** | The Data Security Category. | [optional] 
**EcologicalImpacts** | **double?** | The Ecological Impacts Category. | [optional] 
**EmployeeEngagementDiversityandInclusion** | **double?** | The Employee Engagement Diversity and Inclusion Category. | [optional] 
**EmployeeHealthAndSafety** | **double?** | The Employee Health And Safety Category. | [optional] 
**EnergyManagement** | **double?** | The Energy Management Category. | [optional] 
**GHGEmissions** | **double?** | The Greenhouse Gases Emissions Category. | [optional] 
**HumanRightsandCommunityRelations** | **double?** | The Human Rights and Community Relations Category. | [optional] 
**LaborPractices** | **double?** | The Labor Practices Category. | [optional] 
**ManagementOfTheLegalAndRegulatoryEnvironment** | **double?** | The Management of the Legal and Regulatory Environment Category. | [optional] 
**MaterialsSourcingAndEfficiency** | **double?** | The Materials Sourcing and Efficiency Category. | [optional] 
**Materiality** | **Object** | The Materiality Category. When scoreType &#x3D; ESG_RANK, the data type will be string, otherwise data type will be a number with double format. | [optional] 
**PhysicalImpactsOfClimateChange** | **double?** | The Physical Impacts of Climate Change Category. | [optional] 
**ProductQualityAndSafety** | **double?** | The Product Quality and Safety Category. | [optional] 
**ProductDesignAndLifecycleManagement** | **double?** | The Product Design And Lifecycle Management Category. | [optional] 
**SellingPracticesAndProductLabeling** | **double?** | The Selling Practices And Product Labeling Category. | [optional] 
**SupplyChainManagement** | **double?** | The Supply Chain Management Category. | [optional] 
**SystemicRiskManagement** | **double?** | The Systemic Risk Management Category. | [optional] 
**WasteAndHazardousMaterialsManagement** | **double?** | The Waste and Hazardous Materials Management Category. | [optional] 
**WaterAndWastewaterManagement** | **double?** | The Water and Wastewater Management Category. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

