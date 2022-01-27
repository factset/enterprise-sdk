

# DebtInstrumentNotationScreenerSearchDataRatingGradeMinimum

Minimum rating grade.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.Set&lt;BigDecimal&gt;** | List of rating grade identifiers. Allowed are at most two identifiers which must refer to rating grades originating from different rating systems. Only debt instruments that satisfy all conditions, i.e. are rated higher than or equal to all provided rating grades, are returned. The sequence of the provided identifiers corresponds to the response attributes &#x60;ratingSystem1&#x60; and &#x60;ratingSystem2&#x60; respectively, i.e. the rating grade of a debt instrument in the rating system of which the first identifier in the provided list is a member, is represented by the attribute &#x60;ratingSystem1.rating.grade&#x60; (and &#x60;ratingSystem1.rating.id&#x60; for the identifier of the rating grade). |  [optional]


## Implemented Interfaces

* Serializable


