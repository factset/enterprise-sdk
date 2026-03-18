

# SMTemplateFieldProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **java.util.List&lt;String&gt;** | Indicates the expected data type (e.g., string, int, double, boolean, or arrays). This helps ensure you supply values in the correct format. |  [optional]
**mandatory** | **Boolean** | Shows whether the field is always required for successful modeling. If true, you must supply this field when creating or updating a security. |  [optional]
**whenField** | **java.util.List&lt;java.util.Map&lt;String, java.util.List&lt;String&gt;&gt;&gt;** | Specifies conditional requirements—certain fields become mandatory only when other fields have specific values. |  [optional]
**description** | **String** | A clear and intuitive explanation of what the field represents, making it easier to interpret than raw JSON keys. |  [optional]


## Implemented Interfaces

* Serializable


