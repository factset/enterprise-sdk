

# ScreenArchiveOFDBParametersDataArchiveOptions

Archive-specific parameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archiveDate** | **String** | YYYYMMDD date to archive to |  [optional]
**archiveType** | [**ArchiveTypeEnum**](#ArchiveTypeEnum) | Type of archive.\\ &#x60;ofdbSymbols&#x60;: Archives the list of identifiers that passed the screen to an OFDB file.\\ &#x60;ofdb&#x60;: Archives the results of the screen to a time series OFDB. A mapping between Universal Screening and the OFDB must be created and saved in the screen.\\ &#x60;ofdbNts&#x60;: Archives the results of the screen to a non-time series OFDB. A mapping between Universal Screening and the OFDB database must be created and saved in the screen.\\ &#x60;ofdbQuickNts&#x60;: Archives the results of the screen to a non-time series OFDB without requiring a Universal Screening-to-OFDB map. By default, all columns in the screen will be archived to the OFDB. Each column&#39;s parameter reference name will be used as the OFDB field name. Use the &#x60;quickColumns&#x60; property to specify which parameters to archive. | 
**autoSymbolUpdates** | **Boolean** | Flag to enable automatic symbol updates |  [optional]
**existed** | **Boolean** | Indicates that the output file exists |  [optional]
**filename** | **String** | OFDB Filename to archive to | 
**overwriteData** | **Boolean** | If true and target file (or date for a time series file) exists, it will be cleared before archiving |  [optional]
**quickColumns** | **String** | Space delimited list of parameter references to be archived, which are UPPERCASED with the #P. omitted |  [optional]
**symbolType** | [**SymbolTypeEnum**](#SymbolTypeEnum) | The type of symbol to be saved to the SYMBOL field of the OFDB\\ &#x60;cusip&#x60;: Recommended. Primarily CUSIP for North American listed securities and SEDOL for the rest of the world.\\ &#x60;ticker&#x60;: Should only be used when writing to an existing OFDB that uses Tickers in the symbol column. Primarily Tickers for North American listed securities, QUICK Codes for Japanese listed securities, and SEDOL for the rest of the world. Applicable for equity screen archives.\\ &#x60;isin&#x60;: International Securities Identification Number (ISIN). Applicable for debt screen archives. |  [optional]
**timeSeries** | **Boolean** | Has no effect. Use the &#x60;archiveType&#x60; property. |  [optional]
**unsplitHistory** | **Boolean** | Flag indicating split adjust |  [optional]
**useReportOrder** | **Boolean** | If true, archive in report order |  [optional]



## Enum: ArchiveTypeEnum

Name | Value
---- | -----
OFDBSYMBOLS | &quot;ofdbSymbols&quot;
OFDB | &quot;ofdb&quot;
OFDBNTS | &quot;ofdbNts&quot;
OFDBQUICKNTS | &quot;ofdbQuickNts&quot;



## Enum: SymbolTypeEnum

Name | Value
---- | -----
CUSIP | &quot;cusip&quot;
TICKER | &quot;ticker&quot;
ISIN | &quot;isin&quot;


## Implemented Interfaces

* Serializable


