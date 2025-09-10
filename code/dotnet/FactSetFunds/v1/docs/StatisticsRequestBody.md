# FactSet.SDK.FactSetFunds.Model.StatisticsRequestBody
Statistics Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ContentSet** | **string** | The content set from which the input field is taken. | 
**FieldName** | **string** | The field name to be used in the filter criteria. For custom content sets, display name should be used as a field name. The inputField must be a member of the contentSet specified above. | 
**Histogram** | **bool** | Flag to indicate if histogram data is required. | [optional] 
**JoinType** | **JoinType** |  | [optional] 
**Filters** | [**List&lt;Filter&gt;**](Filter.md) | Filters to be applied to the request. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

