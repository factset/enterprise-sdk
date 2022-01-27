# recommendationlistapifordigitalportals.InlineResponse2005Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hasNotationData** | **Boolean** | Attributes referred to by the notation identifier, beyond notation.instrument.customName, are available.  If this flag is false, it indicates that some notation data for this element is no longer available because the notation may have expired. For answers without notation data, the members position, instrument.customName, weight, description and recommendationClass are retained. | [optional] 
**position** | **Number** | Position of the element. | [optional] 
**notation** | [**InlineResponse2005Notation**](InlineResponse2005Notation.md) |  | [optional] 
**description** | [**InlineResponse2005Description**](InlineResponse2005Description.md) |  | [optional] 
**weight** | **Number** | Weight of this list element. If set for at least one list element, the sum off all weights of an element list must be 1. | [optional] 
**recommendationClass** | [**InlineResponse2005RecommendationClass**](InlineResponse2005RecommendationClass.md) |  | [optional] 


