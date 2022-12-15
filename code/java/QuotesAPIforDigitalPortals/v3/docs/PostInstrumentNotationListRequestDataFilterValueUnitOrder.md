

# PostInstrumentNotationListRequestDataFilterValueUnitOrder

Sequence of value unit identifiers specifying the sorting of the notations per instrument; if the value unit of notation A precedes the value unit of notation B in this list, A precedes B in the result. Notations whose value unit is not in this list sort last. The ordering is applied only when the parameter `meta.sort` contains the attribute `notations.valueUnit.id`; the parameter `meta.sort` cannot contain that attribute if the attribute `valueUnit.order` is absent. The list does not restrict the request to only those value units, use the parameter `valueUnit.selection` for that purpose.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.Set&lt;BigDecimal&gt;** | List of value unit identifiers. |  [optional]


## Implemented Interfaces

* Serializable


