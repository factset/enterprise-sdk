# FactSet.SDK.FactSetFunds.Model.GroupHoldingsRequest
Returns Group Holdings Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | The requested Fund Identifier. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt;  | 
**AsOfDate** | **string** | As of date for historical group holdings in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional] 
**Group** | [**Group**](Group.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

