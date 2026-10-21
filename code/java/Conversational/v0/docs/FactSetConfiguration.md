

# FactSetConfiguration

Extra, FactSet-specific settings for the request. You can leave this whole object out, and each field inside it is also optional.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversationId** | **java.util.UUID** | The id of a conversation to continue, taken from the opening chunk of a previous response. It must be a properly formatted UUID, or the request is rejected (see the 400 response); it must also belong to you, or the request is rejected (see the 404 response). Leave this out to start a new conversation — you&#39;ll be given a new id to use next time. |  [optional]
**returnRawLinkContext** | **Boolean** | Controls how source links and citations from FactSet (&#x60;factset.link&#x60;, &#x60;factset.citation&#x60;, &#x60;factset.citation_group&#x60;, and &#x60;factset.highchart_config&#x60; context) are included in the answer. By default (&#x60;false&#x60;), links/citations are woven directly into the answer text as regular markdown links, and chart configs are rendered as an embedded PNG image, so they display nicely in any chat client with no special handling. Set this to &#x60;true&#x60; if your client understands FactSet&#39;s own context format and would rather receive that raw data separately (in &#x60;delta.factset_context&#x60;) instead. This flag has no effect on &#x60;factset.table&#x60; context, which is always sent raw in &#x60;delta.factset_context&#x60; regardless of this setting, since there&#39;s no plain-text rendering for a table. |  [optional]


## Implemented Interfaces

* Serializable


