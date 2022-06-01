

# Snapshot

Snapshot Response fields

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet&#39;s Option Symbol. For more detail, visit [OA 12636](https://my.apps.factset.com/oa/pages/12636#options) |  [optional]
**date** | **LocalDate** | The date the data is as of in YYYY-MM-DD |  [optional]
**delta** | **Double** | The ratio comparing the change in the price of the underlying asset to the corresponding change in the price of a derivative. Sometimes referred to as the \&quot;hedge ratio\&quot;. For example, with respect to call options, a delta of 0.7 means that for every $1 the underlying stock increases, the call option will increase by $0.70. Put option deltas, on the other hand, will be negative, because as the underlying security increases, the value of the option will decrease. So a put option with a delta of -0.7 will decrease by $0.70 for every $1 the underlying increases in price. As an in-the-money call option nears expiration, it will approach a delta of 1.00, and as an in-the-money put option nears expiration, it will approach a delta of -1.00.  |  [optional]
**expirationDate** | **LocalDate** | The expiration date of the option contract in YYYY-MM-DD format |  [optional]
**impliedVolatility** | **Double** | The implied volatility for the option identifier. Visit [OA 14932](https://my.apps.factset.com/oa/pages/14932)  |  [optional]
**name** | **String** | The name of the option security. |  [optional]
**openInterest** | **Integer** | The total number of options and/or futures contracts that are not closed or delivered on a particular day. |  [optional]
**price** | **Double** | The calculated price quote, based on the calculated status. For US Options - Returns \&quot;Ask Price\&quot; if calc status&#x3D;&#x3D;20, otherwise returns \&quot;Mid Bid/Ask Price\&quot;. For International Options - Returns \&quot;Settlement Price\&quot;.  |  [optional]
**requestId** | **String** | The input value for the id parameter. |  [optional]
**style** | **Integer** | Returns the style of the option id requested, where -   |style|description| |---|---| |0|American| |1|European|  An American style option can be exercised anytime during its life. The majority of exchange-traded options are American.   Since investors have the freedom to exercise their American options at any point during the life of the contract, they are more valuable than European options which can only be exercised at maturity.   Consider this example- If you bought a Ford March Call option expiring in March of 2006, in March 2005 you would have the right to exercise the call option at anytime up until its expiration date. Had the Ford option been a European option, you could only exercise the option at the expiry date in March 2006. During the year, the share price could have been most optimal for exercise in December of 2005, but you would have to wait to exercise your option until March 2006, where it could be out of the money and virtually worthless. The name of this option style has nothing to do with the geographic location.  |  [optional]
**type** | **Integer** | The option type code, where  |code|description| |---|---| |0|Equity Option| |2|Index Option| |99|Option on an ETF| |60|Option on a Future| |19|Option on a Spot FX Rate|  |  [optional]
**underlyingFsymSecurityId** | **String** | The Symbol of the security that must be delivered when a derivative contract, such as a put or call option, is exercised. This is represented in FactSet&#39;s Permanent Security Identifier format (XXXXXX-S).  |  [optional]
**underlyingPrice** | **Double** | The price of the underyling security as of the date requested.  |  [optional]


## Implemented Interfaces

* Serializable


