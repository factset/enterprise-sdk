

# InlineResponse20040Data

Details of the category system.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **BigDecimal** | Identifier of the category system. |  [optional]
**name** | **String** | Name of the category system. |  [optional]
**type** | [**InlineResponse20040DataType**](InlineResponse20040DataType.md) |  |  [optional]
**numberOfLevels** | **BigDecimal** | Number of levels of the category system. |  [optional]
**firstLevelWithLeafCategories** | **BigDecimal** | Number of the least detailed level of the category system that has leaf categories. |  [optional]
**levels** | [**java.util.List&lt;GetCategorySystemGetDataLevelsItems&gt;**](GetCategorySystemGetDataLevelsItems.md) | List of category levels ordered by the number of the level in ascending order. |  [optional]


## Implemented Interfaces

* Serializable


