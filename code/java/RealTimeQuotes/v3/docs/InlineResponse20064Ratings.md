

# InlineResponse20064Ratings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**system** | [**InlineResponse20064System**](InlineResponse20064System.md) |  |  [optional]
**current** | [**InlineResponse20064Current**](InlineResponse20064Current.md) |  |  [optional]
**previous** | [**InlineResponse20064Previous**](InlineResponse20064Previous.md) |  |  [optional]
**change** | **BigDecimal** | Rating grade change which is the difference between the rank of the current rating and the rank of the previous rating. Example: If a rating system has AAA, AA, A, B, C, D as possible ratings (from best to worst), then a change from AA to B is represented as -2 and a change from C to AAA is represented as +4. |  [optional]


## Implemented Interfaces

* Serializable


