# FactSet.SDK.QuotesAPIforDigitalPortals.Model.PostNotationSearchByTextRequestDataMarketOrder
Sequence of market identifiers specifying the first-order sort criterion for the resulting notation list; if the market of notation A precedes the market of notation B in this list, A precedes B in the result. Notations whose market is not in this list sort last. The second-order sorting of the result is given by the attribute `meta.sort`.       The list does not restrict the request to only those markets (use the parameter `market.selection` for that purpose) and does not specify the priority order of the markets for selecting one notation per instrument (use the parameter `market.priority` for that purpose).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;decimal&gt;** | List of market identifiers. See endpoint &#x60;/basic/market/list&#x60; for valid values. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

