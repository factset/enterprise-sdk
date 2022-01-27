# factsetentity.UltimateEntityStructureRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input.  | 
**level** | **Number** | Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level. | [optional] [default to -1]
**active** | **Number** | Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive. | [optional] [default to -1]


