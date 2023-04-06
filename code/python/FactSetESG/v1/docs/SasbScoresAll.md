# SasbScoresAll


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | **date, none_type** | Date for the period requested expressed in YYYY-MM-DD format. | [optional] 
**fsym_id** | **str, none_type** | FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E). | [optional] 
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**score_type** | **str, none_type** | The name of the specific SASB Score type being shown in the response. This will be represented by the scoreTypes input: PULSE, INSIGHT, MOMENTUM, ART_VOL_TTM, CAT_VOL_TTM, or DYNAMIC_MAT. | [optional] 
**access_and_affordability** | **float, none_type** | The Access and Affordability SASB Category. | [optional] 
**air_quality** | **float, none_type** | The Air Quality SASB Category. | [optional] 
**all_categories** | **{str: (bool, date, datetime, dict, float, int, list, str, none_type)}, none_type** | The All Categories Category. This represents the overall SASB Score for the given &#39;scoreType&#39;. When scoreType &#x3D; ESG_RANK, the data type will be string, otherwise data type will be a number with double format. | [optional] 
**business_ethics** | **float, none_type** | The Business Ethics Category. | [optional] 
**business_model_resilience** | **float, none_type** | The Business Model Resilience Category. | [optional] 
**competitive_behavior** | **float, none_type** | The Competitive Behavior Category. | [optional] 
**critical_incident_risk_management** | **float, none_type** | The Critical Incident Risk Management Category. | [optional] 
**customer_privacy** | **float, none_type** | The Customer Privacy Category. | [optional] 
**customer_welfare** | **float, none_type** | The Customer Welfare Category. | [optional] 
**data_security** | **float, none_type** | The Data Security Category. | [optional] 
**ecological_impacts** | **float, none_type** | The Ecological Impacts Category. | [optional] 
**employee_engagement_diversityand_inclusion** | **float, none_type** | The Employee Engagement Diversity and Inclusion Category. | [optional] 
**employee_health_and_safety** | **float, none_type** | The Employee Health And Safety Category. | [optional] 
**energy_management** | **float, none_type** | The Energy Management Category. | [optional] 
**g_hg_emissions** | **float, none_type** | The Greenhouse Gases Emissions Category. | [optional] 
**human_rightsand_community_relations** | **float, none_type** | The Human Rights and Community Relations Category. | [optional] 
**labor_practices** | **float, none_type** | The Labor Practices Category. | [optional] 
**management_of_the_legal_and_regulatory_environment** | **float, none_type** | The Management of the Legal and Regulatory Environment Category. | [optional] 
**materials_sourcing_and_efficiency** | **float, none_type** | The Materials Sourcing and Efficiency Category. | [optional] 
**materiality** | **{str: (bool, date, datetime, dict, float, int, list, str, none_type)}, none_type** | The Materiality Category. When scoreType &#x3D; ESG_RANK, the data type will be string, otherwise data type will be a number with double format. | [optional] 
**physical_impacts_of_climate_change** | **float, none_type** | The Physical Impacts of Climate Change Category. | [optional] 
**product_quality_and_safety** | **float, none_type** | The Product Quality and Safety Category. | [optional] 
**product_design_and_lifecycle_management** | **float, none_type** | The Product Design And Lifecycle Management Category. | [optional] 
**selling_practices_and_product_labeling** | **float, none_type** | The Selling Practices And Product Labeling Category. | [optional] 
**supply_chain_management** | **float, none_type** | The Supply Chain Management Category. | [optional] 
**systemic_risk_management** | **float, none_type** | The Systemic Risk Management Category. | [optional] 
**waste_and_hazardous_materials_management** | **float, none_type** | The Waste and Hazardous Materials Management Category. | [optional] 
**water_and_wastewater_management** | **float, none_type** | The Water and Wastewater Management Category. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


