# ResponseChoicesDelta

The new bit of the answer contained in this chunk. Append these together, in order, across all chunks to build up the full answer.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **str** | Who is \&quot;speaking\&quot; in this chunk. Only appears on the very first chunk of the stream, and is always &#x60;\&quot;assistant\&quot;&#x60;. | [optional] 
**content** | **str** | The next piece of visible answer text. Append this to whatever you&#39;ve already received to build up the answer so far. | [optional] 
**reasoning_content** | **str** | A behind-the-scenes \&quot;thinking out loud\&quot; piece of text that some models produce before their final answer. It is not part of the visible answer itself, and only appears on chunks that carry this kind of content. This uses the same field name as DeepSeek models, so tools like Open WebUI that already know how to display it separately will do so automatically. | [optional] 
**factset_context** | **{str: (bool, date, datetime, dict, float, int, list, str, none_type)}, none_type** | Extra structured data from FactSet that supports the answer, attached to this chunk. Only present when &#x60;factset_configuration.return_raw_link_context&#x60; is &#x60;true&#x60; and the chunk carries a &#x60;factset.link&#x60;, &#x60;factset.citation&#x60;, &#x60;factset.citation_group&#x60;, or &#x60;factset.highchart_config&#x60; context — or unconditionally for &#x60;factset.table&#x60; context, which is always sent raw. Every object has a &#x60;type&#x60; field identifying which of these it is. This is &#x60;null&#x60; or omitted on chunks with no extra data attached, and other FactSet context types that the underlying agent may produce are not surfaced through this API at all. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


