# SasbScoresAll


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | **date** | Date for the period requested expressed in YYYY-MM-DD format. | [optional] 
**fsym_id** | **str** | FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E). | [optional] 
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**score_type** | **str** | The name of the specific SASB Score type being shown in the response. This will be represented by the scoreTypes input: PULSE, INSIGHT, MOMENTUM, ART_VOL_TTM, CAT_VOL_TTM, or DYNAMIC_MAT. | [optional] 
**access_and_affordability** | **float** | The Access and Affordability SASB Category. | [optional] 
**air_quality** | **float** | The Air Quality SASB Category. | [optional] 
**all_categories** | **{str: (bool, date, datetime, dict, float, int, list, str, none_type)}** | The All Categories Category. This represents the overall SASB Score for the given &#39;scoreType&#39;. When scoreType &#x3D; ESG_RANK, the data type will be string, otherwise data type will be a number with double format. | [optional] 
**business_ethics** | **float** | The Business Ethics Category. | [optional] 
**business_model_resilience** | **float** | The Business Model Resilience Category. | [optional] 
**competitive_behavior** | **float** | The Competitive Behavior Category. | [optional] 
**critical_incident_risk_management** | **float** | The Critical Incident Risk Management Category. | [optional] 
**customer_privacy** | **float** | The Customer Privacy Category. | [optional] 
**customer_welfare** | **float** | The Customer Welfare Category. | [optional] 
**data_security** | **float** | The Data Security Category. | [optional] 
**ecological_impacts** | **float** | The Ecological Impacts Category. | [optional] 
**employee_engagement_diversityand_inclusion** | **float** | The Employee Engagement Diversity and Inclusion Category. | [optional] 
**employee_health_and_safety** | **float** | The Employee Health And Safety Category. | [optional] 
**energy_management** | **float** | The Energy Management Category. | [optional] 
**g_hg_emissions** | **float** | The Greenhouse Gases Emissions Category. | [optional] 
**human_rightsand_community_relations** | **float** | The Human Rights and Community Relations Category. | [optional] 
**labor_practices** | **float** | The Labor Practices Category. | [optional] 
**management_of_the_legal_and_regulatory_environment** | **float** | The Management of the Legal and Regulatory Environment Category. | [optional] 
**materials_sourcing_and_efficiency** | **float** | The Materials Sourcing and Efficiency Category. | [optional] 
**materiality** | **{str: (bool, date, datetime, dict, float, int, list, str, none_type)}** | The Materiality Category. When scoreType &#x3D; ESG_RANK, the data type will be string, otherwise data type will be a number with double format. | [optional] 
**physical_impacts_of_climate_change** | **float** | The Physical Impacts of Climate Change Category. | [optional] 
**product_quality_and_safety** | **float** | The Product Quality and Safety Category. | [optional] 
**product_design_and_lifecycle_management** | **float** | The Product Design And Lifecycle Management Category. | [optional] 
**selling_practices_and_product_labeling** | **float** | The Selling Practices And Product Labeling Category. | [optional] 
**supply_chain_management** | **float** | The Supply Chain Management Category. | [optional] 
**systemic_risk_management** | **float** | The Systemic Risk Management Category. | [optional] 
**waste_and_hazardous_materials_management** | **float** | The Waste and Hazardous Materials Management Category. | [optional] 
**water_and_wastewater_management** | **float** | The Water and Wastewater Management Category. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


