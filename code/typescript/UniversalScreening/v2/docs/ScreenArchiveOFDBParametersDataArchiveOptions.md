# universalscreening.ScreenArchiveOFDBParametersDataArchiveOptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archiveDate** | **String** | YYYYMMDD date to archive to | [optional] 
**archiveType** | **String** | Type of archive, i.e. ofdbSymbols, ofdbNts, ofdbQuickNts, ofdb | 
**autoSymbolUpdates** | **Boolean** | Flag to enable automatic symbol updates | [optional] 
**existed** | **Boolean** | Indicates that the output file exists | [optional] 
**filename** | **String** | OFDB Filename to archive to | 
**overwriteData** | **Boolean** | If true and target file (or date for a time series file) exists, it will be cleared before archiving | [optional] 
**quickColumns** | **String** | Space delimited list of parameter references to be archived, which are UPPERCASED with the #P. omitted | [optional] 
**symbolType** | **String** | The symbol type for archiving | [optional] 
**timeSeries** | **Boolean** | If true, archive 3D time series OFDB | [optional] 
**unsplitHistory** | **Boolean** | Flag indicating split adjust | [optional] 
**useReportOrder** | **Boolean** | If true, archive in report order | [optional] 


