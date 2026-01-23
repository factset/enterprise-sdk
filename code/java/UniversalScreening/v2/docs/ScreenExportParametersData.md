

# ScreenExportParametersData

Object containing screen and export data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**screenName** | **String** | File path to a valid screen | 
**_file** | [**Object**](Object.md) | Data required for file export. | 
**backtestDate** | **String** | Specifies the backtest date used when running the screen, replacing the backtest date saved in the screen, can be written in YYYYMMDD, MM/DD/YYYY or relative (0, -1, 0/-1/0) format. Requires additional access to use. |  [optional]
**globalVariablesMap** | **Map&lt;String, String&gt;** | Modifies existing global variables for this calculation request, temporarily adds them if they do not already exist Variable names can only contain the characters A-Z (case insensitive). Variable values must be non-empty. |  [optional]
**legacyUniverseType** | [**LegacyUniverseTypeEnum**](#LegacyUniverseTypeEnum) | Universe type to open a Screen 1.0 document (.usscreen) with\\ &#x60;equity&#x60;: Uses the equity universe from the Screen 1.0 document.\\ &#x60;debt&#x60;: Uses the debt universe from the Screen 1.0 document.\\ &#x60;fund&#x60;: Uses the fund universe from the Screen 1.0 document. |  [optional]
**groupingInfo** | [**GroupingInfo**](GroupingInfo.md) |  |  [optional]



## Enum: LegacyUniverseTypeEnum

Name | Value
---- | -----
EQUITY | &quot;equity&quot;
DEBT | &quot;debt&quot;
FUND | &quot;fund&quot;


## Implemented Interfaces

* Serializable


