

# StatisticsRequestBody

Statistics Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contentSet** | **String** | The content set from which the input field is taken. | 
**fieldName** | **String** | The field name to be used in the filter criteria. For custom content sets, display name should be used as a field name. The inputField must be a member of the contentSet specified above. | 
**histogram** | **Boolean** | Flag to indicate if histogram data is required. |  [optional]
**joinType** | **JoinType** |  |  [optional]
**filters** | [**java.util.List&lt;Filter&gt;**](Filter.md) | Filters to be applied to the request. |  [optional]


## Implemented Interfaces

* Serializable


