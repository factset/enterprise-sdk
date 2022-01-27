# FactSet.SDK.FactSetRBICS.Model.EntityFocusRequest
Entity Focus Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. Max Ids of 2500.  | [optional] 
**Date** | **string** | Effective date for data expressed in YYYY-MM-DD format. If no date is requested, the default behavior is to return the full history for the requested entity.  | [optional] 
**Levels** | **List&lt;int&gt;** | List of RBICS industry levels to include in the response. **By default if left blank, all levels are returned.**  | [optional] 
**IncludeNames** | **bool** | Option to include or exclude industry Names and the L6 Description. True &#x3D; Include Names; False &#x3D; Exclude Names.  | [optional] [default to true]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

