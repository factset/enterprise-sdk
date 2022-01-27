

# InlineResponse20016DataNav

Nav.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **BigDecimal** | Daily net asset value (NAV) of the ETP. This data is available for all the regions. |  [optional]
**currency** | [**CurrencyEnum**](#CurrencyEnum) | Currency of the ETP&#39;s NAV in ISO 4217 format. This data is available for all the regions. |  [optional]
**startDate** | **LocalDate** | Date of first available NAV ex-date. This data is available for all the regions. |  [optional]
**last** | [**InlineResponse20016DataNavLast**](InlineResponse20016DataNavLast.md) |  |  [optional]
**totalReturn** | **BigDecimal** | ETP NAV calculated by reinvesting dividends and compounding returns. This data is available for all the regions. |  [optional]



## Enum: CurrencyEnum

Name | Value
---- | -----
CHF | &quot;CHF&quot;
CAD | &quot;CAD&quot;
USD | &quot;USD&quot;
EUR | &quot;EUR&quot;
MXN | &quot;MXN&quot;
GBP | &quot;GBP&quot;
GBX | &quot;GBX&quot;
SEK | &quot;SEK&quot;
JPY | &quot;JPY&quot;


## Implemented Interfaces

* Serializable


