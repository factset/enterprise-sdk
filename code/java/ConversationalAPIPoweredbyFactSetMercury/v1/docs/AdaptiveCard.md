

# AdaptiveCard

Microsoft Adaptive Card containing response data surfaced from FactSet content sets. `Value` contains the JSON serialization of the Adaptive Card. See [Microsoft docs](https://learn.microsoft.com/en-us/adaptive-cards/) for Adaptive Card documentation, and the [Adaptive Card schema explorer](https://adaptivecards.io/explorer/) for schema details.  **Please note**: \"The adaptive card may contain actions, which represent functionality within the card itself. In order to execute these actions, a handler must be implemented in your Adaptive Card rendering process. See [handling actions](https://learn.microsoft.com/en-us/adaptive-cards/sdk/rendering-cards/javascript/actions) for an example implementation. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Datatype contained in this data object | 
**value** | **Object** | A JSON-serialized Adaptive Card object modeled after the [Adaptive Card schema](https://adaptivecards.io/explorer/). | 



## Enum: TypeEnum

Name | Value
---- | -----
ADAPTIVECARD | &quot;AdaptiveCard&quot;


## Implemented Interfaces

* Serializable


