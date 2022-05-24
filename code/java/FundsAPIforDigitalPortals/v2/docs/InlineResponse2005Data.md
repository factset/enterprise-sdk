

# InlineResponse2005Data

Possible values and value ranges of the parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalCount** | **BigDecimal** | Number of notations that satisfy the request parameters, hence have been used to retrieve the possible values and value ranges. |  [optional]
**currency** | [**java.util.List&lt;InlineResponse2005DataCurrency&gt;**](InlineResponse2005DataCurrency.md) | List of currency identifiers. See endpoint &#x60;/basic/valueUnit/currency/list&#x60; for possible values. |  [optional]
**market** | [**java.util.List&lt;InlineResponse2005DataMarket&gt;**](InlineResponse2005DataMarket.md) | List of market identifiers. |  [optional]
**fund** | [**InlineResponse2005DataFund**](InlineResponse2005DataFund.md) |  |  [optional]
**shareClass** | [**InlineResponse2005DataShareClass**](InlineResponse2005DataShareClass.md) |  |  [optional]
**performance** | [**InlineResponse2005DataPerformance**](InlineResponse2005DataPerformance.md) |  |  [optional]


## Implemented Interfaces

* Serializable


