

# InlineResponse20022Data


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**navDate** | **LocalDate** | Historice NAV date value. |  [optional]
**nav** | **BigDecimal** | Returns historic Net Asset Value of the ETP. |  [optional]
**navChange** | **BigDecimal** | Absolute change in NAV value. |  [optional]
**navChangePercent** | **BigDecimal** | Related change in the NAV value. |  [optional]
**fundFlows** | **BigDecimal** | This value returns factset&#39;s ETF fundflow history. Rolling one day fund flows are calculated using the difference of shares outstanding at previous close and shares outstanding one day prior to close mulitplied by the NAV of one day prior to close. |  [optional]
**sharesOutstanding** | **BigDecimal** | Returns the historic share Outstanding values of the ETP. |  [optional]
**aum** | **BigDecimal** | Returns the historic Total Asset Value of the ETP. |  [optional]


## Implemented Interfaces

* Serializable


