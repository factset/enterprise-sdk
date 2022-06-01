

# ScreenArchiveOFDBParametersData

Object containing archive request payload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archiveOptions** | [**ScreenArchiveOFDBParametersDataArchiveOptions**](ScreenArchiveOFDBParametersDataArchiveOptions.md) |  |  [optional]
**backtestDate** | **String** | Specifies the backtest date used when running the screen, replacing   the backtest date saved in the screen, can be written in YYYYMMDD,   MM/DD/YYYY or relative (0, -1, 0/-1/0) format. Requires addtional access to use. |  [optional]
**globalVariablesMap** | **Map&lt;String, String&gt;** | Modifies existing global variables for this calculation request, temporarily adds them if they do not already exist Variable names can only contain the characters A-Z (case insensitive). Variable values must be non-empty. |  [optional]
**legacyUniverseType** | **String** | Universe type to open legacy screen with. Must be one of \&quot;equity\&quot;, \&quot;debt\&quot;, or \&quot;fund\&quot;. Defaults to \&quot;equity\&quot;. |  [optional]
**screenName** | **String** | File path to a valid screen | 


## Implemented Interfaces

* Serializable


