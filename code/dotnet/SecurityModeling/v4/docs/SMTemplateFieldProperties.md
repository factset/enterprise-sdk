# FactSet.SDK.SecurityModeling.Model.SMTemplateFieldProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Category** | **List&lt;string&gt;** | Indicates the expected data type (e.g., string, int, double, boolean, or arrays). This helps ensure you supply values in the correct format. | [optional] 
**Mandatory** | **bool** | Shows whether the field is always required for successful modeling. If true, you must supply this field when creating or updating a security. | [optional] 
**WhenField** | **List&lt;Dictionary&gt;** | Specifies conditional requirements—certain fields become mandatory only when other fields have specific values. | [optional] 
**Description** | **string** | A clear and intuitive explanation of what the field represents, making it easier to interpret than raw JSON keys. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

