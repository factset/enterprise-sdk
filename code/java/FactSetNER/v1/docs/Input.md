

# Input


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **String** | Input-text (plain text (preferred) or HTML-formatted) of document to extract named-entities from. | 
**characterOffset** | **Integer** | Offset to add to the returned named entity positions; useful if the given text input is not from the beginning of the original document. |  [optional]
**idType** | [**IdTypeEnum**](#IdTypeEnum) | Format of the Ids to return for the extracted named entities. |  [optional]
**filterTagsWithoutId** | **Boolean** | Boolean flag, set True [False] to [not] drop named entities for which a matching Id could not be found. |  [optional]



## Enum: IdTypeEnum

Name | Value
---- | -----
ICONUM | &quot;iconum&quot;
ENTITYID | &quot;entityId&quot;


## Implemented Interfaces

* Serializable


