# factsetner.Input

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **String** | Input-text (plain text (preferred) or HTML-formatted) of document to extract named-entities from. | 
**characterOffset** | **Number** | Offset to add to the returned named entity positions; useful if the given text input is not from the beginning of the original document. | [optional] 
**idType** | **String** | Format of the Ids to return for the extracted named entities. | [optional] [default to &#39;iconum&#39;]
**filterTagsWithoutId** | **Boolean** | Boolean flag, set True [False] to [not] drop named entities for which a matching Id could not be found. | [optional] [default to true]



## Enum: IdTypeEnum


* `iconum` (value: `"iconum"`)

* `entityId` (value: `"entityId"`)




