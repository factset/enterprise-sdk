

# ChatMessage

One message in a conversation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | [**RoleEnum**](#RoleEnum) | Who this message is from: &#x60;system&#x60; (background instructions for the assistant — not used by this API), &#x60;user&#x60; (a question or statement from the person chatting), or &#x60;assistant&#x60; (an earlier reply from the model). | 
**content** | **String** | The text of the message. | 



## Enum: RoleEnum

Name | Value
---- | -----
SYSTEM | &quot;system&quot;
USER | &quot;user&quot;
ASSISTANT | &quot;assistant&quot;


## Implemented Interfaces

* Serializable


