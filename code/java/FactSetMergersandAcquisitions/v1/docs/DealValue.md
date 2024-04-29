

# DealValue

Deal Value Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseEquity** | **BigDecimal** | The total value of cash and all other forms of payment made to the Target – commonly cash and/or stock, though the calculation can include other methods of payment (e.g., notes, convertible debt, preferred stock, etc.) if disclosed and calculable. In transactions where multiple forms of payment are being made (e.g., cash and stock), the individual consideration components are calculated separately and then summed to arrive at the total Base Equity Value (e.g., cash component + stock component). Amounts returned are in USD. |  [optional]
**transactionValue** | **BigDecimal** | Base Equity Value plus the value of the target’s outstanding net debt (where applicable). The target&#39;s outstanding net debt is defined as the total amount of short and long term interest-bearing debt less any cash and cash equivalents. The target&#39;s outstanding net debt will only be included in the Transaction Value calculation if a.) the acquirer is seeking to own 100% of the target, b.) the target is a non-financial company; and c.) the target&#39;s outstanding net debt is publicly disclosed (or the acquirer publicly states it is assuming a specific amount of liabilities). Otherwise, Transaction Value will be equal to the amount paid for the portion of the target acquired (Base Equity Value) and will exclude the target&#39;s outstanding net debt. Amounts returned are in USD. |  [optional]
**enterpriseValue** | **BigDecimal** | The full value of the business acquired, using % sought to determine the value of 100% of the business if less than 100% was sought in the transaction. Amounts returned are in USD. |  [optional]
**annOfferPriceShare** | **BigDecimal** | The current price offered for each share of target stock (including all forms of consideration). In a transaction in which the acquirer has increased or decrease the price they are offering on a per share basis from their original offer price, this item will always reflect the most current price per share being offered. Amounts returned are in USD. |  [optional]
**buyerExchangeRatio** | **BigDecimal** | Number of shares being issued by the acquirer to the target. Applicable only if the acquirer is issuing stock in the transaction. For example, Express Scripts, Inc. acquired Medco Health Solutions, Inc. in April 2012 for $28.5 bil in cash and stock. Medco shareholders received $28.8 in cash and 0.81 Express Scripts shares for every share held. Here, Stock Exchange Ratio - Buyers Shares is 0.81. |  [optional]
**targetExchangeRatio** | **BigDecimal** | Number of target shares the stock swap exchange ratio is based upon when the acquirer is issuing stock in the transaction. For example, Express Scripts, Inc. acquired Medco Health Solutions, Inc. in April 2012 for $28.5 bil in cash and stock. Medco shareholders received $28.8 in cash and 0.81 Express Scripts shares for every share held. Here, Stock Exchange Ratio - Target Shares is 1. |  [optional]
**cashShare** | **BigDecimal** | Portion of the current offer price per share to be paid in cash. For example, Pfizer acquired Wyeth in 2009 for $66.8 in cash and stock. Pfizer paid $50.19 per share, comprised of $33 in cash and 0.985 shares of Pfizer stock (representing $17.19 based upon Pfizer&#39;s last closing stock price of $17.45 prior to announcement). Here, the Price/Share - Cash ($) is 33. Amounts returned are in USD. |  [optional]
**stockShare** | **BigDecimal** | Portion of the current offer price per share to be paid in the acquirer&#39;s stock. For example, Pfizer acquired Wyeth in 2009 for $66.8 in cash and stock. Pfizer paid $50.19 per share, comprised of $33 in cash and 0.985 shares of Pfizer stock (representing $17.19 based upon Pfizer&#39;s last closing stock price of $17.45 prior to announcement). Here, the Price/Share - Stock ($) is 17.19. Amounts returned are in USD. |  [optional]
**choice** | **Boolean** | Indicates if the acquirer is offering the target shareholders a choice of considerations (which is almost always a choice between selecting cash only, stock only or a mixture of cash and stock) for the specified deal identifier. |  [optional]
**buyerSharesIssued** | **BigDecimal** | The number of shares issued by the buyer to the target as part of the payment. |  [optional]
**percentSought** | **BigDecimal** | The percentage of the target company&#39;s stock sought by the acquirer at the time the transaction was publicly announced. |  [optional]
**sharesSought** | **BigDecimal** | The number of shares of the target company&#39;s stock sought by the acquirer at the time the transaction was publicly announced. |  [optional]
**sharesOwnedPrior** | **BigDecimal** | The percent of the target company&#39;s shares owned by the buyer prior to the transaction. |  [optional]
**premium1Day** | **BigDecimal** | The percentage difference between the price per share offered by the acquirer and the target&#39;s closing stock price 1 trading day prior to the announcement date. This data is only available if the target is a public company and the price/share is disclosed. |  [optional]
**premium5Day** | **BigDecimal** | The percentage difference between the price per share offered by the acquirer and the target&#39;s closing stock price 5 trading days prior to the announcement date. This data is only available if the target is a public company and the price/share is disclosed. |  [optional]
**premium30Day** | **BigDecimal** | The percentage difference between the price per share offered by the acquirer and the target&#39;s closing stock price 30 trading days prior to the announcement date. This data is only available if the target is a public company and the price/share is disclosed. |  [optional]
**paymentMethod** | [**java.util.List&lt;PaymentMethodEnum&gt;**](#java.util.List&lt;PaymentMethodEnum&gt;) | Payment method/structure used in the transaction, including cash, stock, combination, or debt. |  [optional]



## Enum: java.util.List&lt;PaymentMethodEnum&gt;

Name | Value
---- | -----
CASH | &quot;Cash&quot;
CASH_STOCK | &quot;Cash &amp; Stock&quot;
CONVERTIBLE_PREFERRED_STOCK | &quot;Convertible Preferred Stock&quot;
DEBT | &quot;Debt&quot;
NOTES | &quot;Notes&quot;
OTHER | &quot;Other&quot;
PREFERRED_STOCK | &quot;Preferred Stock&quot;
STOCK | &quot;Stock&quot;
WARRANT_OPTIONS | &quot;Warrant / Options&quot;


## Implemented Interfaces

* Serializable


