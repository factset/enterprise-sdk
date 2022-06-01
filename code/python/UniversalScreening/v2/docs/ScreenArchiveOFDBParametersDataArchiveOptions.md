# ScreenArchiveOFDBParametersDataArchiveOptions


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archive_type** | **str** | Type of archive, i.e. ofdbSymbols, ofdbNts, ofdbQuickNts, ofdb | 
**filename** | **str** | OFDB Filename to archive to | 
**archive_date** | **str** | YYYYMMDD date to archive to | [optional] 
**auto_symbol_updates** | **bool** | Flag to enable automatic symbol updates | [optional] 
**existed** | **bool** | Indicates that the output file exists | [optional] 
**overwrite_data** | **bool** | If true and target file (or date for a time series file) exists, it will be cleared before archiving | [optional] 
**quick_columns** | **str** | Space delimited list of parameter references to be archived, which are UPPERCASED with the #P. omitted | [optional] 
**symbol_type** | **str** | The symbol type for archiving | [optional] 
**time_series** | **bool** | If true, archive 3D time series OFDB | [optional] 
**unsplit_history** | **bool** | Flag indicating split adjust | [optional] 
**use_report_order** | **bool** | If true, archive in report order | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


