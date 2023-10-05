# AccountsForJobAddProp

The details of the account under the task in the object key

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**include_parent** | **bool, none_type** | Indicates whether or not the parent portfolio is included as a separate portfolio when isSplit is true | [optional] 
**is_split** | **bool, none_type** | Indicates whether the portfolio&#39;s components if any would be treated as individual portfolios when the job is run | [optional] 
**latest_components_only** | **bool, none_type** | When selected, the ACTM/CSTM will be split and will only return components that are still held in the ACTM. I.e., when the end date is \&quot;Latest,\&quot; it will not return components where the end date occurs before Latest. | [optional] 
**level** | **str, none_type** | The number of levels when isSplit is true that the job will expand down to for a composite portfolio (CSTM or ACTM). \&quot;1\&quot; means only the first level will be expanded. \&quot;all\&quot; will be the value if all levels are expanded down. | [optional] 
**portfolio_id** | **str** | The full file path including portfolio name and type | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


