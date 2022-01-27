

# UltimateEntityStructureRequest

Ultimate Entity Structure Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input.  | 
**level** | **Integer** | Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level. |  [optional]
**active** | **Integer** | Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive. |  [optional]


## Implemented Interfaces

* Serializable


