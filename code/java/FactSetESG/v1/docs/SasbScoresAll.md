

# SasbScoresAll


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | **LocalDate** | Date for the period requested expressed in YYYY-MM-DD format. |  [optional]
**fsymId** | **String** | FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E). |  [optional]
**requestId** | **String** | Identifier that was used for the request. |  [optional]
**scoreType** | **String** | The name of the specific SASB Score type being shown in the response. This will be represented by the scoreTypes input: PULSE, INSIGHT, MOMENTUM, ART_VOL_TTM, CAT_VOL_TTM, or DYNAMIC_MAT. |  [optional]
**accessAndAffordability** | **Double** | The Access and Affordability SASB Category. |  [optional]
**airQuality** | **Double** | The Air Quality SASB Category. |  [optional]
**allCategories** | **Object** | The All Categories Category. This represents the overall SASB Score for the given &#39;scoreType&#39;. When scoreType &#x3D; ESG_RANK, the data type will be string, otherwise data type will be a number with double format. |  [optional]
**businessEthics** | **Double** | The Business Ethics Category. |  [optional]
**businessModelResilience** | **Double** | The Business Model Resilience Category. |  [optional]
**competitiveBehavior** | **Double** | The Competitive Behavior Category. |  [optional]
**criticalIncidentRiskManagement** | **Double** | The Critical Incident Risk Management Category. |  [optional]
**customerPrivacy** | **Double** | The Customer Privacy Category. |  [optional]
**customerWelfare** | **Double** | The Customer Welfare Category. |  [optional]
**dataSecurity** | **Double** | The Data Security Category. |  [optional]
**ecologicalImpacts** | **Double** | The Ecological Impacts Category. |  [optional]
**employeeEngagementDiversityandInclusion** | **Double** | The Employee Engagement Diversity and Inclusion Category. |  [optional]
**employeeHealthAndSafety** | **Double** | The Employee Health And Safety Category. |  [optional]
**energyManagement** | **Double** | The Energy Management Category. |  [optional]
**gHGEmissions** | **Double** | The Greenhouse Gases Emissions Category. |  [optional]
**humanRightsandCommunityRelations** | **Double** | The Human Rights and Community Relations Category. |  [optional]
**laborPractices** | **Double** | The Labor Practices Category. |  [optional]
**managementOfTheLegalAndRegulatoryEnvironment** | **Double** | The Management of the Legal and Regulatory Environment Category. |  [optional]
**materialsSourcingAndEfficiency** | **Double** | The Materials Sourcing and Efficiency Category. |  [optional]
**materiality** | **Object** | The Materiality Category. When scoreType &#x3D; ESG_RANK, the data type will be string, otherwise data type will be a number with double format. |  [optional]
**physicalImpactsOfClimateChange** | **Double** | The Physical Impacts of Climate Change Category. |  [optional]
**productQualityAndSafety** | **Double** | The Product Quality and Safety Category. |  [optional]
**productDesignAndLifecycleManagement** | **Double** | The Product Design And Lifecycle Management Category. |  [optional]
**sellingPracticesAndProductLabeling** | **Double** | The Selling Practices And Product Labeling Category. |  [optional]
**supplyChainManagement** | **Double** | The Supply Chain Management Category. |  [optional]
**systemicRiskManagement** | **Double** | The Systemic Risk Management Category. |  [optional]
**wasteAndHazardousMaterialsManagement** | **Double** | The Waste and Hazardous Materials Management Category. |  [optional]
**waterAndWastewaterManagement** | **Double** | The Water and Wastewater Management Category. |  [optional]


## Implemented Interfaces

* Serializable


