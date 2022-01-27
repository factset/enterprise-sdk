# chartgenerationservice.ChartInput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_in** | **String** | How to apply the additional input. Would be often via query parameter which can be appended to the request with &amp; | [optional] 
**name** | **String** | The name of the parameter | [optional] 
**required** | **Boolean** | Whether or not the parameter is required to be specified to get the chart image. | [optional] 
**description** | **String** | A short description of the input and its use | [optional] 
**type** | **String** | The type of value expected for the input | [optional] 
**example** | **String** | An example value for the input | [optional] 



## Enum: InEnum


* `query` (value: `"query"`)

* `param` (value: `"param"`)




