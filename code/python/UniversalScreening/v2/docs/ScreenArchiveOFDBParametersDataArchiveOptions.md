# ScreenArchiveOFDBParametersDataArchiveOptions

Archive-specific parameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archive_type** | **str** | Type of archive.\\ &#x60;ofdbSymbols&#x60;: Archives the list of identifiers that passed the screen to an OFDB file.\\ &#x60;ofdb&#x60;: Archives the results of the screen to a time series OFDB. A mapping between Universal Screening and the OFDB must be created and saved in the screen.\\ &#x60;ofdbNts&#x60;: Archives the results of the screen to a non-time series OFDB. A mapping between Universal Screening and the OFDB database must be created and saved in the screen.\\ &#x60;ofdbQuickNts&#x60;: Archives the results of the screen to a non-time series OFDB without requiring a Universal Screening-to-OFDB map. By default, all columns in the screen will be archived to the OFDB. Each column&#39;s parameter reference name will be used as the OFDB field name. Use the &#x60;quickColumns&#x60; property to specify which parameters to archive. | 
**filename** | **str** | OFDB Filename to archive to | 
**archive_date** | **str, none_type** | YYYYMMDD date to archive to | [optional] 
**auto_symbol_updates** | **bool** | Flag to enable automatic symbol updates | [optional] 
**existed** | **bool** | Indicates that the output file exists | [optional] 
**overwrite_data** | **bool** | If true and target file (or date for a time series file) exists, it will be cleared before archiving | [optional] 
**quick_columns** | **str, none_type** | Space delimited list of parameter references to be archived, which are UPPERCASED with the #P. omitted | [optional] 
**symbol_type** | **str, none_type** | The type of symbol to be saved to the SYMBOL field of the OFDB\\ &#x60;cusip&#x60;: Recommended. Primarily CUSIP for North American listed securities and SEDOL for the rest of the world.\\ &#x60;ticker&#x60;: Should only be used when writing to an existing OFDB that uses Tickers in the symbol column. Primarily Tickers for North American listed securities, QUICK Codes for Japanese listed securities, and SEDOL for the rest of the world. Applicable for equity screen archives.\\ &#x60;isin&#x60;: International Securities Identification Number (ISIN). Applicable for debt screen archives. | [optional] 
**time_series** | **bool** | Has no effect. Use the &#x60;archiveType&#x60; property. | [optional] 
**unsplit_history** | **bool** | Flag indicating split adjust | [optional] 
**use_report_order** | **bool** | If true, archive in report order | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


