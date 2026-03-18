# securitymodeling.SMTemplateFieldProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **[String]** | Indicates the expected data type (e.g., string, int, double, boolean, or arrays). This helps ensure you supply values in the correct format. | [optional] 
**mandatory** | **Boolean** | Shows whether the field is always required for successful modeling. If true, you must supply this field when creating or updating a security. | [optional] 
**whenField** | **[Object]** | Specifies conditional requirements—certain fields become mandatory only when other fields have specific values. | [optional] 
**description** | **String** | A clear and intuitive explanation of what the field represents, making it easier to interpret than raw JSON keys. | [optional] 


