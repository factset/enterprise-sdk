# FactSet.SDK.UniversalScreening.Model.ScreenArchiveOFDBParametersDataArchiveOptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ArchiveDate** | **string** | YYYYMMDD date to archive to | [optional] 
**ArchiveType** | **string** | Type of archive, i.e. ofdbSymbols, ofdbNts, ofdbQuickNts, ofdb | 
**AutoSymbolUpdates** | **bool** | Flag to enable automatic symbol updates | [optional] 
**Existed** | **bool** | Indicates that the output file exists | [optional] 
**Filename** | **string** | OFDB Filename to archive to | 
**OverwriteData** | **bool** | If true and target file (or date for a time series file) exists, it will be cleared before archiving | [optional] 
**QuickColumns** | **string** | Space delimited list of parameter references to be archived, which are UPPERCASED with the #P. omitted | [optional] 
**SymbolType** | **string** | The symbol type for archiving | [optional] 
**TimeSeries** | **bool** | If true, archive 3D time series OFDB | [optional] 
**UnsplitHistory** | **bool** | Flag indicating split adjust | [optional] 
**UseReportOrder** | **bool** | If true, archive in report order | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

