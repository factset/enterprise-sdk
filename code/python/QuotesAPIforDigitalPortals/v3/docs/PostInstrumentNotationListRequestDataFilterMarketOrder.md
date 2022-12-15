# PostInstrumentNotationListRequestDataFilterMarketOrder

Sequence of market identifiers specifying the sorting of the notations per instrument; if the market of notation A precedes the market of notation B in this list, A precedes B in the result. Notations whose market is not in this list sort last. The ordering is applied only when the parameter `meta.sort` contains the attribute `notations.market.id`; the parameter `meta.sort` cannot contain that attribute if the attribute `market.order` is absent. The list does not restrict the request to only those markets, use the parameter `market.selection` for that purpose.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[float]** | List of market identifiers. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


